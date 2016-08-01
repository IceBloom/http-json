/**
 * $Id$
 * <p>
 * Copyright (c) 2012 Qunar.com. All Rights Reserved.
 */
package com.qunar.piao.httpjson.controller;



import com.qunar.piao.httpjson.model.PacakgeConstructor;
import com.qunar.piao.httpjson.model.Package;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

//--------------------- Change Logs----------------------
// <p>@author wenzhong.li Initial Created at 2013-1-10<p>
//-------------------------------------------------------
public class RequestServlet extends HttpServlet {
	private static final Logger LOGGER = LoggerFactory.getLogger(RequestServlet.class);

	/**
	 * get 请求
	 *
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        Cookie cookie=new Cookie("_http_json_test","just for test!");
        cookie.setMaxAge(-1);
        cookie.setVersion(0);
        response.addCookie(cookie);
        Package pack= PacakgeConstructor.constructPackage(request);
        ObjectMapper objectMapper=new ObjectMapper();
        objectMapper.enable(SerializationConfig.Feature.INDENT_OUTPUT);
        response.getWriter().print(objectMapper.writeValueAsString(pack));
	}

	/**
	 * post请求
	 *
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
