package it.uniba.tdd;

public class StringCalculator {

	public StringCalculator() {
	}

	public int add(String numbersStr) {
		numbersStr = deleteNewLine(numbersStr);
		int ris = 0;
		int size = numbersStr.length();

		if (size >= 1) {

			String[] numbers;
			numbers = numbersStr.split(",");
			
			
			if (size == 1) {
				ris = ignoreNumbersBiggerThan1000(numbers[0]);
			} else {
				for (int i = 0; i < numbers.length; i++) {
					int j = ignoreNumbersBiggerThan1000(numbers[i]);
					ris = ris + j;
				}
			}
		}

		else if (numbersStr.isEmpty()) {
			ris = 0;
		}

		return ris;
	}

	public String deleteNewLine(String str) {
		String string = str.replace("\n", ",");
		return string;
	}
	

	public String deleteAllDelimiter(String str) {
		String string = "";
		return string;
	}
	
	public int ignoreNumbersBiggerThan1000(String str){
		int ris = Integer.parseInt(str);
		if(ris >= 1000){
			ris = 0;
		}
		return ris;
		
	}

}