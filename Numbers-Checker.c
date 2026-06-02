#include <stdio.h>
int main(){
  char str[1000001];
  int flag = 0;
  scanf("%1000000s", str);
  for(int i = 0; str[i]; i++){
     if(str[i] >= '0' && str[i] <= '9'){
       flag |= (1 << (str[i] - '0'));
     }
  }
  int all = (1 << 10) - 1;
  if(flag == all){
    printf("All digits are present");
  }else{
    printf("All digits are NOT present");
  }
  return 0;
}

      
