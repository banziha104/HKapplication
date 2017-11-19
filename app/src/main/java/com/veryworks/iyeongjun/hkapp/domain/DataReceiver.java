package com.veryworks.iyeongjun.hkapp.domain;


/*데이터 로더 클래스*/

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import static com.veryworks.iyeongjun.hkapp.domain.StaticFields.hkPojoData;

public class DataReceiver {
    static Retrofit retrofit;
    Context context;
    Gson gson;
    public DataReceiver(Context context) {
        this.context = context;
    }

    public void getData(){
        retrofit = new Retrofit.Builder()
                .baseUrl("http://ec2-52-78-202-182.ap-northeast-2.compute.amazonaws.com:80")
//                .addConverterFactory(GsonConverterFactory.create())
                .build();
        HKdataReceiveInterface hKdataReceiveInterface
                =retrofit.create(HKdataReceiveInterface.class);
        Call<ResponseBody> result = hKdataReceiveInterface.getHKData();
        result.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    Log.d("data",response.body().string());
                    String val1 = "[{}]";
                    hkPojoData = gson.fromJson(response.body().string(),HKpojo.class);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

                Log.d("data",t.getMessage());
                t.printStackTrace();
                Toast.makeText(context, "데이터 읽기 실패", Toast.LENGTH_SHORT).show();
            }
        });
    }
//    private void ifSeccess(Response<HKData> response){
//        HKData[] items = response.body();
//        if(datas != null) datas.clear();
//        for(int i = 0 ; i < items.length ; i ++){
//            datas.add(items[i]);
//            Log.d("Data",i+datas.get(i).getTitle()+"/"+
//                    i+datas.get(i).getTel()+"/"+
//                    i+datas.get(i).getSigungucode()+"/"+
//                    i+datas.get(i).getDist()+"/"+
//                    i+datas.get(i).getFirstimage()+"/"+
//                    i+datas.get(i).getFirstimage2()+"/"+
//                    i+datas.get(i).getAddr1()+"/"+
//                    i+datas.get(i).getAddr2()+"/"+
//                    i+datas.get(i).getTel()+"/"
//                    +datas.get(i).getContenttypeid());
//            Log.d("Image",datas.get(i).getFirstimage2()+"/"+datas.get(i).getContenttypeid()+"/");
//        }
//        if (context instanceof CompleteData){
//            ((CompleteData)context).dataReceieveComplete();
//            Log.d("Callback","callback");
//        }else{
//            Log.d("Callback","not callback");
//        }
//    }
    interface HKdataReceiveInterface{
        @GET("/data")
        Call<ResponseBody> getHKData();
    }
}
