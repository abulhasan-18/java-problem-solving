

class Solution {
    public int romanToInt(String s) {

        int value = 0;


        int length = s.length();

        for (int i = 0; i < length ; i++){

            if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'D'){
                value = value + 400;
            } 
            else if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'M'){
                value = value + 900;
            }
            else if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'L'){
                value = value + 40;
            }
            else if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'C'){
                value = value + 90;
            }
            else if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'V'){
                value = value + 4;
            }
            else if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'X'){
                
                value = value + 9;
            }
            else if(s.charAt(i)=='M'){
                value = value + 1000;
            }
            else if(s.charAt(i) == 'D'){
                value = value + 500;
            } 
            else if (s.charAt(i) == 'L'){
                value = value + 50;
            }  
            else if (s.charAt(i) == 'I'){
                value = value + 1;
            }
            else if(s.charAt(i) == 'C'){
                value = value + 100;
            }
            else if(s.charAt(i) == 'X'){
                value = value + 10;
            }
            else if(s.charAt(i) == 'V'){
                value = value + 5;
            }
        }
    return value;
}
}
