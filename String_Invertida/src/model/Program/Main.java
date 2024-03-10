package model.Program;

import model.entity.InverterString;

public class Main {

	public static void main(String[] args) {
		String stringNormal = "AMO TECNOLOGIA";
		
        String stringInvertida = InverterString.reverterString(stringNormal);
        
        System.out.println("String original: " + stringNormal);
        
        System.out.println("String invertida: " + stringInvertida);

	}

}
