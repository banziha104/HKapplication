package com.veryworks.iyeongjun.hkapp.domain;

/**
 * Created by iyeongjun on 2017. 9. 27..
 */

public class Const {
    public static class Auth{
        public static final String KEY = "i9opnT0CNWj0dfjeUmoProOy3c%2BqZNdfztvalVl624EISpMpkXLDvVzwuuA8n8BnYnMqOjKlZIoBQLm%2FpX%2Fyqg%3D%3D";
        //                    serviceKey= iMw%2F5Z0wNdwfRXJ4HVyIGeMk316OS1Wtsw8v7ItPa3L%2BcmRVKGv%2BBB0k1rit2uwBOuoRnoYOL7%2Bh6EIyblceCQ%3D%3D&numOfRows=10&MobileOS=AND&MobileApp=ShakeHere&mapX=37.515359&mapY=126.907623&radius=5000&_type=json
        public static final String TMAP_KEY = "3b85beaa-6a81-309a-a51d-4d1fff6b8c68";
        public static final String GOOGLE_MAP_KEY ="AIzaSyCbDWk0gzMfv_qm7hsRIk6spP7kMehAh5o";//"AIzaSyBFb9H1N2EmElNDAcVTXUKxJSGKtbpFU90";//"AIzaSyCXHmSY-KVXCkaPvyL9PVQUbi2RBBg4JY4";
    }
    public static class Status{
        public static final String SCREEN_ON = "Screen on";
        public static final String SCREEN_OFF = "Screen off";
        public static final String BOOT_COMPLETE = "Boot complete";
    }
    public static class Lang{
        public static final String KOREAN = "KorService";
        public static final String JAPAN = "JpnService";
        public static final String ENGLISH = "EngService";
        public static final String CHINA_GAN = "ChsService";
        public static final String CHINA_BUN = "ChtService";
        public static final String GERMAN = "GerService";
        public static final String FRANCE = "FreService";
        public static final String SPAIN = "SpnService";
        public static final String RUSSIA = "RusService";
    }
    public static class Action{
        public static final String PAUSE_SENSOR = "";
        public static final String RESUME_SENSOR = "";
    }
    public static class GPS{
        public static final int GPS_MILE_SECOND = 100;
        public static final int GPS_MIN_LENGTH = 1;
        public static final int GPS_DEFAULT_RESULT = 1;

    }
    public static class DefaultSetting{
        public static final int DEFAULT_NUM_OF_ROWS = 100;
        public static final String DEFAULT_MOBILE_OS = "AND";
        public static final String APP_NAME = "ShakeHere";
        public static final int DEFAULT_RADIUS = 5000;
        public static final String DEFAULT_TYPE = "json";
    }
    public static class ContentType{
        public static final int TOUR = 12;
        public static final int COULTURE = 14;
        public static final int CANIVAL = 15;
        public static final int REPORTS = 28;
        public static final int INN = 32;
        public static final int SHOPPING = 38;
        public static final int FOOD = 39;
        public static final int COURSE = 25;
        public static final int ALL = 10000;
        /*타국가*/
        public static final int OTOUR = 76;
        public static final int OCOULTURE = 78;
        public static final int OCANIVAL = 85;
        public static final int OREPORTS = 75;
        public static final int OINN = 80;
        public static final int OSHOPPING = 79;
        public static final int OFOOD = 82;
        public static final int OTANS = 77;
    }
    public static class AR{
        public final static int REQUEST_CAMERA_PERMISSIONS_CODE = 11;
        public static final int REQUEST_LOCATION_PERMISSIONS_CODE = 0;

        public static final long MIN_DISTANCE_CHANGE_FOR_UPDATES = 0; // 10 meters
        public static final long MIN_TIME_BW_UPDATES = 0;//1000 * 60 * 1; // 1 minute

        public static final boolean IN_IMAGE = true;
        public static final boolean OUT_IMAGE = false;
    }
}
