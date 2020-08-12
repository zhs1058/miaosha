package com.imooc.miaosha.result;

public class CodeMsg {
	private int code;
	private String msg;
	
	public CodeMsg(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	
	//通用模块
	public static CodeMsg SUCCESS = new CodeMsg(0,"success");
	public static CodeMsg SERVER_ERROR = new CodeMsg(500100,"服务端异常");

	//登录模块 5002XX
	
	//商品模块 5003XX
	
	//订单模块 5004XX
	
	//秒杀模块 5005XX
	
	
	public String getMsg() {
		return msg;
	}
	
	public int getCode() {
		return code;
	}
	
	
	
	
}
