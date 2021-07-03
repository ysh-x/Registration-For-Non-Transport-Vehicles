/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    String pwd = "Y&g#shw!r#ji ";
	    String verify = "Yogeshwar#01";
	    verify = encrypt(verify);
	    if(verify.equals(pwd)) {
	        System.out.println("Success");
	    }
	    else {
	        System.out.println("Failure");
	    }
		
	}
	  public static String encrypt(String Key) {
	      char[] key = Key.toCharArray();
        for(int i = 0; i < key.length; i++) {
            switch(key[i]) {
                case 'a': {
                    key[i] = '!';
                    break;
                }
                 case 'e': {
                    key[i] = '#';
                    break;
                }
                 case 'i': {
                    key[i] = '%';
                    break;
                }
                 case 'o': {
                    key[i] = '&';
                    break;
                }
                 case 'u': {
                    key[i] = '(';
                    break;
                }
                 case '1': {
                    key[i] = 'i';
                    break;
                } case '2': {
                    key[i] = 'h';
                    break;
                } case '3': {
                    key[i] = 'g';
                    break;
                } case '4': {
                    key[i] = 'f';
                    break;
                } case '5': {
                    key[i] = 'e';
                    break;
                } case '6': {
                    key[i] = 'd';
                    break;
                } case '7': {
                    key[i] = 'c';
                    break;
                } case '8': {
                    key[i] = 'b';
                    break;
                } case '9': {
                    key[i] = 'a';
                    break;
                }case '0': {
                    key[i] = 'j';
                    break;
                }
                
                
            }
        }
        return String.valueOf(key);
    }
}

RaniG%01
