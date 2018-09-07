package com.han.action;

import java.util.Random;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class ShowAction extends ActionSupport {

	public String execute() {
		System.out.println("ShowAction.execute");
		Random r = new Random();
		if (r.nextBoolean()) {
			return "success";
		} else {
			return "fail";
		}
	}
	
	public String show() {
		System.out.println("ShowAction.show");
		Random r = new Random();
		if (r.nextBoolean()) {
			return "success";
		} else {
			return "fail";
		}
	}
}
