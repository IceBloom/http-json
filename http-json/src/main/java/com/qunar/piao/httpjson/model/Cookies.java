package com.qunar.piao.httpjson.model;

import java.util.Map;

/**
 * Created by zhaoxin on 16-8-1.
 */
public class Cookies {

    private CookieSegments _http_json_test;

    public CookieSegments get_http_json_test() {
        return _http_json_test;
    }

    public void set_http_json_test(CookieSegments _http_json_test) {
        this._http_json_test = _http_json_test;
    }



    public static class CookieSegments{
        private String name;
        private String value;
        private String comment;
        private String domain;
        private int maxAge;
        private String path;
        private boolean secure;
        private int version;
        private boolean httpOnly;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public String getDomain() {
            return domain;
        }

        public void setDomain(String domain) {
            this.domain = domain;
        }

        public int getMaxAge() {
            return maxAge;
        }

        public void setMaxAge(int maxAge) {
            this.maxAge = maxAge;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public boolean getSecure() {
            return secure;
        }

        public void setSecure(boolean secure) {
            this.secure = secure;
        }

        public int getVersion() {
            return version;
        }

        public void setVersion(int version) {
            this.version = version;
        }

        public boolean getHttpOnly() {
            return httpOnly;
        }

        public void setHttpOnly(boolean httpOnly) {
            this.httpOnly = httpOnly;
        }
    }

}
