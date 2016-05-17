import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
public class Cmd {
	static Robot r;
	public static void main(String[] args){
		try {
			Runtime.getRuntime().exec(new String[]{"cmd.exe","/c","start"});
			r=new Robot();
			r.setAutoDelay(5);
			String s="cd C:\\Users\\groppan\\Desktop";
			for(int i=0;i<s.length();i++)
				pressKey(Character.toString(s.charAt(i)));
			pressKey("ENTER");
			s="cls";
			for(int i=0;i<s.length();i++)
				pressKey(Character.toString(s.charAt(i)));
			pressKey("ENTER");
			s="javac Ciao.java";
			r.delay(100);
			for(int i=0;i<s.length();i++)
				pressKey(Character.toString(s.charAt(i)));
			pressKey("ENTER");
			r.delay(1000);
			s="java Ciao";
			for(int i=0;i<s.length();i++)
				pressKey(Character.toString(s.charAt(i)));
			pressKey("ENTER");
		} catch (Exception e){
			e.printStackTrace();
		}
	}
		public static void pressKey(String s){
			//all keys
			switch (s){
			case "ENTER":
				r.keyPress(KeyEvent.VK_ENTER);
				break;
			case "TAB":
				r.keyPress(KeyEvent.VK_TAB);
				break;
			case " ":
				r.keyPress(KeyEvent.VK_SPACE);
				break;
			case "A":
			case "a":
				r.keyPress(KeyEvent.VK_A);
				break;
			case "B":
			case "b":
				r.keyPress(KeyEvent.VK_B);
				break;
			case "C":
			case "c":
				r.keyPress(KeyEvent.VK_C);
				break;
			case "D":
			case "d":
				r.keyPress(KeyEvent.VK_D);
				break;
			case "E":
			case "e":
				r.keyPress(KeyEvent.VK_E);
				break;
			case "F":
			case "f":
				r.keyPress(KeyEvent.VK_F);
				break;
			case "G":
			case "g":
				r.keyPress(KeyEvent.VK_G);
				break;
			case "H":
			case "h":
				r.keyPress(KeyEvent.VK_H);
				break;
			case "I":
			case "i":
				r.keyPress(KeyEvent.VK_I);
				break;
			case "J":
			case "j":
				r.keyPress(KeyEvent.VK_J);
				break;
			case "K":
			case "k":
				r.keyPress(KeyEvent.VK_K);
				break;
			case "L":
			case "l":
				r.keyPress(KeyEvent.VK_L);
				break;
			case "M":
			case "m":
				r.keyPress(KeyEvent.VK_M);
				break;
			case "N":
			case "n":
				r.keyPress(KeyEvent.VK_N);
				break;
			case "O":
			case "o":
				r.keyPress(KeyEvent.VK_O);
				break;
			case "P":
			case "p":
				r.keyPress(KeyEvent.VK_P);
				break;
			case "Q":
			case "q":
				r.keyPress(KeyEvent.VK_Q);
				break;
			case "R":
			case "r":
				r.keyPress(KeyEvent.VK_R);
				break;
			case "S":
			case "s":
				r.keyPress(KeyEvent.VK_S);
				break;
			case "T":
			case "t":
				r.keyPress(KeyEvent.VK_T);
				break;
			case "U":
			case "u":
				r.keyPress(KeyEvent.VK_U);
				break;
			case "V":
			case "v":
				r.keyPress(KeyEvent.VK_V);
				break;
			case "W":
			case "w":
				r.keyPress(KeyEvent.VK_W);
				break;
			case "X":
			case "x":
				r.keyPress(KeyEvent.VK_X);
				break;
			case "Y":
			case "y":
				r.keyPress(KeyEvent.VK_Y);
				break;
			case "Z":
			case "z":
				r.keyPress(KeyEvent.VK_Z);
				break;
			case "0":
				r.keyPress(KeyEvent.VK_0);
				break;
			case "1":
				r.keyPress(KeyEvent.VK_1);
				break;
			case "2":
				r.keyPress(KeyEvent.VK_2);
				break;
			case "3":
				r.keyPress(KeyEvent.VK_3);
				break;
			case "4":
				r.keyPress(KeyEvent.VK_4);
				break;
			case "5":
				r.keyPress(KeyEvent.VK_5);
				break;
			case "6":
				r.keyPress(KeyEvent.VK_6);
				break;
			case "7":
				r.keyPress(KeyEvent.VK_7);
				break;
			case "8":
				r.keyPress(KeyEvent.VK_8);
				break;
			case "9":
				r.keyPress(KeyEvent.VK_9);
				break;
			case "!":
				r.keyPress(KeyEvent.VK_EXCLAMATION_MARK); //ERROR
				break;
			case "#":
				r.keyPress(KeyEvent.VK_NUMBER_SIGN); //ERROR
				break;
			case "$":
				r.keyPress(KeyEvent.VK_DOLLAR);
				break;
			case "(":
				r.keyPress(KeyEvent.VK_LEFT_PARENTHESIS); //ERROR
				break;
			case ")":
				r.keyPress(KeyEvent.VK_RIGHT_PARENTHESIS); //ERROR
				break;
			case "+":
				r.keyPress(KeyEvent.VK_PLUS);
				break;
			case ",":
				r.keyPress(KeyEvent.VK_COMMA);
				break;
			case "-":
				r.keyPress(KeyEvent.VK_MINUS);
				break;
			case ".":
				r.keyPress(KeyEvent.VK_PERIOD);
				break;
			case "/":
				r.keyPress(KeyEvent.VK_SHIFT);
				r.keyPress(KeyEvent.VK_7);
				r.keyRelease(KeyEvent.VK_SHIFT);
				r.keyRelease(KeyEvent.VK_7);
				break;
			case ":":
				r.keyPress(KeyEvent.VK_SHIFT);
				r.keyPress(KeyEvent.VK_PERIOD);
				r.keyRelease(KeyEvent.VK_SHIFT);
				r.keyRelease(KeyEvent.VK_PERIOD);
				break;
			case ";":
				r.keyPress(KeyEvent.VK_SEMICOLON); //ERROR
				break;
			case "=":
				r.keyPress(KeyEvent.VK_EQUALS);
				break;
			case "@":
				r.keyPress(KeyEvent.VK_AT); //ERROR
				break;
			case "[":
				r.keyPress(KeyEvent.VK_OPEN_BRACKET);
				break;
			case "\\":
				r.keyPress(KeyEvent.VK_BACK_SLASH);
				break;
			case "]":
				r.keyPress(KeyEvent.VK_CLOSE_BRACKET);
				break;
			case "^":
				r.keyPress(KeyEvent.VK_CIRCUMFLEX);
				break;
			case "_":
				r.keyPress(KeyEvent.VK_UNDERSCORE); //ERROR
				break;
		}
	}
}
