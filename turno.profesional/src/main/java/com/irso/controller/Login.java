package com.irso.controller;
import java.util.Scanner;

public class Login {

	public static void main(String[] args){
	Scanner input= new Scanner(System.in);
	
	String user,pass;
	
	
	System.out.print("ingresar usuario: ");
	user=input.nextLine();
	
	System.out.print("ingresar contraseña: ");
	pass=input.nextLine();
	
	
	if(user.equals(user) && (pass.equals(pass))){
		
		System.out.println("bienvenido al sistema");
		
	}else{
		
		System.out.print("usuario y/o contraseña incorrecto");
		
	}
		
		
}


}