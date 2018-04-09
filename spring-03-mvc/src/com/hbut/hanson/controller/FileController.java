/**
 * Project Name:spring-03-mvc
 * File Name:FileController.java
 * Package Name:com.hbut.hanson.controller
 * Date:2018年4月9日上午10:55:04
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.sun.org.apache.bcel.internal.generic.RETURN;


/**
 * ClassName:FileController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月9日 上午10:55:04 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 
 */
@Controller
@RequestMapping("/file")
public class FileController {
	
	//文件上传页面
	@RequestMapping("/initFileUpload")
	public String initFileUpload(){
		return "FileUpload";
	}
	
	//文件上传
	@RequestMapping(value="/upload", method=RequestMethod.POST)
	public String fileUpload(String name, @RequestParam("file")CommonsMultipartFile file, HttpSession session){
		if (!file.isEmpty()) {
			//获取上下文路径
			String path = session.getServletContext().getRealPath("/upload/");
			//获取文件名
			String fileName = file.getOriginalFilename();
			//创建文件夹
			if(!new File(path).exists()){
				new File(path).mkdirs();
			}
			//获取文件类型
			String fileType = fileName.substring(fileName.lastIndexOf("."));
			//生成保存目标文件
			File targetFile = new File(path, new Date().getTime()+fileType);
			try {
				//向目标文件写入内容
				file.getFileItem().write(targetFile);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return "FileUpload";
	}
	
	//文件下载
	@RequestMapping(value="/download", method=RequestMethod.GET)
	public void fileDownload(HttpSession session, HttpServletResponse response, String fileName, boolean isOnline) throws Exception{
		
		//获取文件路径
		String path = session.getServletContext().getRealPath("/upload/")+"\\"+fileName;
		File file = new File(path);
		//判断文件是否存在
		if (!file.exists()) {
			response.sendError(404, "您要下载文件没找到！");
			return;
		}
		//获取下载文件输入流
		BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
		byte[] buff = new byte[1024];
		int len = -1;
		response.reset();
		if (isOnline) {
			URL u = new URL("file:///"+path);
			response.setContentType(u.openConnection().getContentType());
			response.setHeader("Content-Disposition", "inline;fileName="+fileName);
		} else{
			//设置内容类型
			response.setContentType("application/x-msdownload");
			//设置下载文件名
			response.setHeader("Content-Disposition", "attachment；filename="+fileName);
		}
		//获取输出流
		OutputStream outputStream = response.getOutputStream();
		//循环输出下载文件流
		while ((len=bufferedInputStream.read(buff))!=-1) {
			outputStream.write(buff, 0, len);
			outputStream.flush();
		}
		//关闭比输入输出流
		bufferedInputStream.close();
		outputStream.close();
	}
}

