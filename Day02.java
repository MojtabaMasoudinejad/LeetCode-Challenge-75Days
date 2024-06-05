class Day02 {
    public String gcdOfStrings(String str1, String str2) {

        String result = "";
        String repeated = "";
        String resultUnique="";

			
		if(str1.length() > str2.length()) {

            if (str1.length() % str2.length() == 0) {

				if (str1.equals(str2.repeat(str1.length() / str2.length()))) {

					resultUnique = str2;
					
					System.out.println("result16: " + result);
				}
			} else {

                for(int i = 1; i<=str1.length(); i++) {
				
				if(str2.contains(str1.substring(0, i))) {
					
					result = str1.substring(0, i);
				}
							
			}
            }

            System.out.println("result30: " + result);
            
    
           repeated =  findRepetitivePattern(result);
           
//             repeated = result.replaceAll("(.+?)\\1+", "$1");
             
        System.out.println("repeated51: " + repeated);
        System.out.println("resultUnique51: " + resultUnique);

	        
			
		
        } else{

            if (str2.length() % str1.length() == 0) {

				if (str2.equals(str1.repeat(str2.length() / str1.length()))) {

					resultUnique = str1;

				}
        }else {
				
				for(int j = 1; j<=str2.length(); j++) {
					
					if(str1.contains(str2.substring(0, j))) {
						
						result = str2.substring(0, j);
					}
					
				}
			}
        
        
		
            System.out.println("repeated67 : "+ result);
            
          repeated =    findRepetitivePattern(result);
                         
            
        }


       
        
        System.out.println("repeated137 : "+ repeated);
		
        
		String resultFinal = repeated + repeated;
		 
		 if(str1.length() > str2.length()) {
			 if (str1.contains(resultFinal)){
                // return repeated;

			 } else {
				 repeated = "";
			 }
		 } else {
			
			 if (str2.contains(resultFinal)){
                // return repeated;
			 } else {
				 repeated = "";
			 }
			 
		 }
		 
		 System.out.println("repeated 126: " + repeated);
		 
		 System.out.println("Unique 138: " + resultUnique);

		 
		 
		 if(resultUnique=="") {
			 
			 if(repeated.length()!=0){

		            Boolean finalCheck1 = str1.equals(repeated.repeat(str1.length()/repeated.length()));
				    Boolean finalCheck2 = 	str2.equals(repeated.repeat(str2.length()/repeated.length()));
				    
				    System.out.println(finalCheck1 & finalCheck2);

		        if(finalCheck1 & finalCheck2) {
		        	
					System.out.println(repeated);

					return repeated;
					
				} else {
					
					return "";
				}
		            
		        } else {
		        	
		        	 return repeated; 
		        }    
			 
		 } else {
			 return resultUnique;
		 }
		
        
    }
    
    
    
    public static String findRepetitivePattern(String str) {
        str = str.trim();  
        int n = str.length();

        for (int len = 1; len <= n / 2; len++) {
            if (n % len == 0) {
                String pattern = str.substring(0, len);
                StringBuilder repeatedPattern = new StringBuilder();

                for (int i = 0; i < n / len; i++) {
                    repeatedPattern.append(pattern);
                }

                if (repeatedPattern.toString().equals(str)) {
                    return pattern;
                }
            }
        }

        return str;
    }
}