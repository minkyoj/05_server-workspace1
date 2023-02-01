package com.kh.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestGetServlet
 */
@WebServlet("/test1.do")
public class RequestGetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestGetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Get 방식으로 요청시 해당 이 doGet 메소드가 저절로 호출됨
		// System.out.println("이거 잘 실행되나?");
		
		/*
		 * 첫번째 매개변수인 request에는 요청시 전달된 내용이 담겨 있음 (사용자가 입력한 값, 요청전송방식, 요청자의 ip주소 듣등)
		 * 두번째 매개변수인 response 에는 요청 처리 후 응답할 때 사용되는 객체
		 * 
		 * 요청 처리를 위해서 요청시 전달된 값 뽑기
		 * request의 parameter 영역 안에 존재 (키-벨류 세트로 담겨있는 주머니)
		 * 
		 * 따라서 request의 parameter 영역으로부터 전달된 데이터 뽑는 메소드
		 * > request.getParameter("키값") : String (그에 해당하는 value값)
		 */
		String name = request.getParameter("name"); // "차은우" | ""
		String gender = request.getParameter("gender"); // "M" | "F" | null
		int age = Integer.parseInt(request.getParameter("age")); // "20" => 20 | "" => 오류가 뜸(NumberFormatException) : 빈문자열 숫자로 형변환 불가
		String city = request.getParameter("city");
		double height = Double.parseDouble(request.getParameter("height")); // "160" => 160.0
		
		System.out.println("name : " + name);
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
		System.out.println("city : " + city);
		System.out.println("height : " + height);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
