package com.dks;

import io.restassured.RestAssured;
import io.restassured.response.Response;
public class JsonParsing {
	// Write a program to check the output of the given API and write a method to print the json contents

	public static Response response;

	public  void getdata(String name){

		String datafromJson = response.jsonPath().getString(name);
		System.out.println(datafromJson);
	}	

	public static void main(String[] args) {

		JsonParsing jsonParsing = new JsonParsing();
		response=   RestAssured.get("https://gorest.co.in/public/v2/users");
	
		System.out.println( "Json Response =======>");
		System.out.println(response.body().asPrettyString());
		System.out.println( "Json Parsing only Name =======>");
		jsonParsing.getdata("name");
		System.out.println( "Json Parsing only Email =======>");
		jsonParsing.getdata("email");
		//jsonParsing.getdata("gender");

	}

}

