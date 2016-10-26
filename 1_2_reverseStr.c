//CtCI question 1.2
//Write code to reverse a C-Style String.
//(C-String means that “abcd” is represented as !ve characters, including the null character.)

#include<stdio.h>

int main(){
	char str[] = "0123456789"; 
	char tmp;
	int i, len;

	len = sizeof(str)/sizeof(str[0]);

	for(i=0 ; i<len/2 ; i++){
		tmp = str[len-1-i];
		str[len-1-i] = str[i];
		str[i] = tmp;
	}

//print the result
	for(i=0 ; i<len ; i++){
		printf("%c", str[i]);
	}
}
