package com.example.demo;


import lombok.Data;


@Data
	public class Request {
	    private String zipCode;

		public String getZipCode() {
			// TODO Auto-generated method stub
			return zipCode;
		}

		public void setZipCode(String zipCode) {
			this.zipCode = zipCode;
		}	
	}

