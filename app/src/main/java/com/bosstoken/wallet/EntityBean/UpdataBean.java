package com.bosstoken.wallet.EntityBean;

/**
 * Created by 飞 on 2018/5/6.
 */

public class UpdataBean {


    /**
     * ios : {"type":"ios","version":1,"app_url":"http://www.bosstoken.one/app.list","web_view":"https://app.bosstoken.one/boss"}
     * android : {"type":"android","version":1,"app_url":"http://www.bosstoken.one/app.apk","web_view":"https://app.bosstoken.one/boss"}
     */

    private IosBean ios;
    private AndroidBean android;

    public IosBean getIos() {
        return ios;
    }

    public void setIos(IosBean ios) {
        this.ios = ios;
    }

    public AndroidBean getAndroid() {
        return android;
    }

    public void setAndroid(AndroidBean android) {
        this.android = android;
    }

    public static class IosBean {
        /**
         * type : ios
         * version : 1
         * app_url : http://www.bosstoken.one/app.list
         * web_view : https://app.bosstoken.one/boss
         */

        private String type;
        private int version;
        private String app_url;
        private String web_view;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getVersion() {
            return version;
        }

        public void setVersion(int version) {
            this.version = version;
        }

        public String getApp_url() {
            return app_url;
        }

        public void setApp_url(String app_url) {
            this.app_url = app_url;
        }

        public String getWeb_view() {
            return web_view;
        }

        public void setWeb_view(String web_view) {
            this.web_view = web_view;
        }
    }

    public static class AndroidBean {
        /**
         * type : android
         * version : 1
         * app_url : http://www.bosstoken.one/app.apk
         * web_view : https://app.bosstoken.one/boss
         */

        private String type;
        private int version;
        private String app_url;
        private String web_view;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getVersion() {
            return version;
        }

        public void setVersion(int version) {
            this.version = version;
        }

        public String getApp_url() {
            return app_url;
        }

        public void setApp_url(String app_url) {
            this.app_url = app_url;
        }

        public String getWeb_view() {
            return web_view;
        }

        public void setWeb_view(String web_view) {
            this.web_view = web_view;
        }
    }
}
