package com.veryworks.iyeongjun.hkapp.Util;

import android.view.MotionEvent;
import android.widget.ImageButton;

import static com.veryworks.iyeongjun.hkapp.domain.Const.*;

/**
 * Created by iyeongjun on 2017. 11. 3..
 */

public class MyUtil {

    public static String convertSectionIntToString(int num){
        String result = "";
        if(num == SECTION.GANGNAM.getPk())        result = SECTION.GANGNAM.getName();
        else if (num == SECTION.GANGDONG.getPk()) result = SECTION.GANGNAM.getName();
        else if (num == SECTION.GANGSEO.getPk())  result = SECTION.GANGSEO.getName();
        else if (num == SECTION.GUANJIN.getPk())  result = SECTION.GUANJIN.getName();
        else if (num == SECTION.DONGJAK.getPk())  result = SECTION.DONGJAK.getName();
        else if (num == SECTION.MAPO.getPk())     result = SECTION.MAPO.getName();
        else if (num == SECTION.SEOCHO.getPk())   result = SECTION.SEOCHO.getName();
        else if (num == SECTION.SENGDONG.getPk()) result = SECTION.SENGDONG.getName();
        else if (num == SECTION.SONGPA.getPk())   result = SECTION.SONGPA.getName();
        else if (num == SECTION.YONGSAN.getPk())  result = SECTION.YONGSAN.getName();
        else if (num == SECTION.YUNGDUNG.getPk()) result = SECTION.YUNGDUNG.getName();
        else result = "Error";
        return result;
    }
    public static int convertSectionStringToInt(String str){
        int result = 0;
        if(str == SECTION.GANGNAM.getName())       result = SECTION.GANGNAM.getPk();
        else if (str == SECTION.GANGDONG.getName())result = SECTION.GANGNAM.getPk();
        else if (str == SECTION.GANGSEO.getName()) result = SECTION.GANGSEO.getPk();
        else if (str == SECTION.GUANJIN.getName()) result = SECTION.GUANJIN.getPk();
        else if (str == SECTION.DONGJAK.getName()) result = SECTION.DONGJAK.getPk();
        else if (str == SECTION.MAPO.getName())    result = SECTION.MAPO.getPk();
        else if (str == SECTION.SEOCHO.getName())  result = SECTION.SEOCHO.getPk();
        else if (str == SECTION.SENGDONG.getName())result = SECTION.SENGDONG.getPk();
        else if (str == SECTION.SONGPA.getName())  result = SECTION.SONGPA.getPk();
        else if (str == SECTION.YONGSAN.getName()) result = SECTION.YONGSAN.getPk();
        else if (str == SECTION.YUNGDUNG.getName())result = SECTION.YUNGDUNG.getPk();
        return result;
    }
    public static String convertTypeIntToString(int num){
        String result = "";
        if(num == ContentType.PARK) result ="공원";
        else if(num == ContentType.FOOD) result = "맛집";
        else if(num == ContentType.TOUR) result = "볼거리";
        else if(num == ContentType.SHOP) result = "쇼핑몰";
        else if(num == ContentType.INN) result = "숙박";
        else if(num == ContentType.HIST) result = "유적지";
        else if(num == ContentType.REPO) result = "레포츠";
        else if(num == ContentType.REST) result = "편의시설";
        return result;
    }
    public static int convertTypeStringToInt(String str) {
        int result = 0;
        if(str == "공원") result = ContentType.PARK;
        else if(str == "맛집") result = ContentType.FOOD;
        else if(str == "볼거리") result = ContentType.TOUR;
        else if(str == "쇼핑몰") result = ContentType.SHOP;
        else if(str == "숙박") result = ContentType.INN;
        else if(str == "유적지") result = ContentType.HIST;
        else if(str == "레포츠") result = ContentType.REPO;
        else if(str == "편의시설") result = ContentType.REST;
        return result;
    }
}
