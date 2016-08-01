package com.qunar.piao.httpjson.model;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhaoxin on 16-8-1.
 */
public class PacakgeConstructor {
    public static Package constructPackage(HttpServletRequest request){
        Package pack=new Package();
        pack.setData(PacakgeConstructor.constructData(request));
        pack.setMessage(null);  //不知道message是什么
        return pack;
    }

    private static Data constructData(HttpServletRequest request){
        Data data=new Data();
        data.setClientPort(request.getRemotePort());
        data.setCookies(PacakgeConstructor.constructCookie(request.getCookies()));
        data.setHost(request.getRemoteHost());
        data.setMethod(request.getMethod());
        data.setPort(request.getServerPort());
        data.setProtocal(request.getProtocol());
        data.setQueryString(request.getQueryString());
        data.setUri(request.getRequestURI());
        data.setParams(PacakgeConstructor.constructParams(request.getParameterMap()));
        data.setUrl(request.getRequestURL().toString());
        return data;
    }

    private static Cookies constructCookie(Cookie[] cookie){
        Cookie cookie1=cookie[0];
        Cookies cookies=new Cookies();
        Cookies.CookieSegments segments=new Cookies.CookieSegments();
        segments.setComment(cookie1.getComment());
        segments.setDomain(cookie1.getDomain());
        segments.setHttpOnly(false);  //暂时不知道是该传什么值进去
        segments.setMaxAge(cookie1.getMaxAge());
        segments.setName(cookie1.getName());
        segments.setPath(cookie1.getPath());
        segments.setSecure(cookie1.getSecure());
        segments.setValue(cookie1.getValue());
        segments.setVersion(cookie1.getVersion());
        cookies.set_http_json_test(segments);
        return cookies;
    }

    private static Map<String,String> constructParams(Map<String,String[]> maps){
        Map<String,String> map=new HashMap<String, String>();
        for(Map.Entry<String,String[]> entry:maps.entrySet()){
            map.put(entry.getKey(),entry.getValue()[0]);
        }
        return map;
    }
}
