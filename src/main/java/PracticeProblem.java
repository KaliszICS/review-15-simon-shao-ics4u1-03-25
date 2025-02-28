import java.util.HashMap;
public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(goodString("abcdfedree"));
	}

public static int goodString1(String word){
int operatorCount = 0;
int charIn1 = -1;
int charIn2 = -1;
for (int i =0; i<word.length();i++){
	for (int j = word.length()-1; j>0;j--){
		
if (i == j){
}
	else if (word.charAt(i)==word.charAt(j)){
charIn1 = i;
charIn2 = j;
i = 100;
j = -100;
}
	}
}
if (charIn1!=-1 && charIn2!=-1){
	operatorCount = charIn1+word.length()-charIn2-1;
	charIn1 = -1;
	charIn1 = -1;
}
else{
	operatorCount = -1;
}

for (int i =word.length()-1; i>0;i--){
	for (int j = 0; j<word.length();j++){
		
if (i == j){
}
	else if (word.charAt(i)==word.charAt(j)){
charIn1 = j;
charIn2 = i;
i = -100;
j = 100;
}
	}
}
if (charIn1!=-1 && charIn2!=-1){
if (charIn1+word.length()-charIn2-1 < operatorCount){
	operatorCount = charIn1+word.length()-charIn2-1;
}
}
return operatorCount;
}


public static int goodString(String word){
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	int opCount = 100;
for (int i = 0; i<word.length();i++){
	System.out.println(word.charAt(i));
	if (map.containsKey(word.charAt(i))){
		System.out.println("it ran");
		if (map.get(word.charAt(i)) + word.length() - i-1 < opCount){
			System.out.println("it ran here");
opCount = map.get(word.charAt(i)) + word.length() - i-1;
	}}
	else{
	map.put(word.charAt(i), i);
	}
	
}


System.out.println(map);
if (opCount ==100){
	opCount = -1;
}
return opCount;
}

}
