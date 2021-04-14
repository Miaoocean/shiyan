
include<stdio.h>
include<math.h>
include<stdlib.h>
include<time.h>
int moshi;
int count;
void plus(int first,int second)
{
int result;
printf("%d + %d =",first,second);
scanf("%d",&result);
if(result == first+second)
{
printf("Right!\n");
}
else
{
printf("wrong!\nThe correct answer is:%d\n",first+second);
}
}
void minus(int first,int second)
{
int result;
printf("%d - %d =",first,second);
scanf("%d",&result);
if(result == first-second)
{
printf("Right!\n");
}
else
{
printf("wrong!\nThe correct answer is:%d\n",first+second);
}
}
void multiply(int first,int second)
{
int result; //运算结果
printf("%d * %d =",first,second);
scanf("%d",&result);
if(result == firstsecond)
{
printf("Right!\n");
}
else
{
printf("wrong!\nThe correct answer is:%d\n",firstsecond);
}
}
void divide(int first,int second)
{
float result; //运算结果
float temp;
second = rand()%100;
printf("%d / %d =",first,second);
if(second==0)
{
printf("Error!\n");
return;
}
scanf("%f",&result);
temp=result100 - ((float)first/(float)second)100;
if(abs(temp)<0.01)
{
printf("Right!\n");
}
else
{
printf("wrong!\nThe correct answer is:%f\n",(float)first/(float)second);
}
}

void f1()//练习模式
{
int count=0;
int n;
int m;
int first,second;//保存两个运算的数字
while(1)
{
printf("请选择四则运算中一种:\n\n");
printf("-----------------1:加法\n");
printf("-----------------2:减法\n");
printf("-----------------3:乘法\n");
printf("-----------------4:除法\n");
printf("-----------------5:随机\n");

srand(time(NULL));
first = rand()%100;
second = rand()%100;

scanf("%d",&n);
if(n>=1&&n<=4)
{
 while(count<10)
{
srand(time(NULL));
first = rand()%100;
second = rand()%100;
switch(n)
{
case 1:
{
  plus(first,second);
  count++;
  break;
}
case 2:
{
  minus(first,second);
  count++;
  break;
}
case 3:
{
  multiply(first,second);
  count++;
  break;
}
case 4:
{
  divide(first,second);
  count++;
  break;
}
default:
{
  count++;
  break;
}
}//switch
}//while
}//if

else if(n=5)
{
while(count<10)
{
m=first%4;
srand(time(NULL));
first = rand()%100;
second = rand()%100;
switch(m)
{
case 0:
{
  plus(first,second);
  count++;
  break;
}
case 1:
{
  minus(first,second);
  count++;
  break;
}
case 2:
{
  multiply(first,second);
  count++;
  break;
}
case 3:
{
  divide(first,second);
  count++;
  break;
}
default:
{
  count++;
  break;
}
}//switch
}//while
}//else if
}
}
int main()
{
printf("小提示:\n每种模式默认运行10次就得重新选择,中途退出直接按Ctrl+c!\n");
p: printf("请选择模式:\n\n");
printf("----------1:练习模式\n");
printf("----------2:计算模式\n");
printf("----------3:分数计算\n");
count=0;
scanf("%d",&moshi);
switch(moshi)
{
case 1:
{
if(count10)
goto p;
f1();
break;
}//case1
case 2:
{
int first,second;
char c,c1; //保存运算符
while(1)
{
scanf("%d%c%d%c",&first,&c,&second,&c1);
if(count10)
goto p;
switch(c)
{
case '+':
{
printf("%d+%d=%d\n",first,second,first+second);
count++;
break;
}
case '-':
{
printf("%d-%d=%d\n",first,second,first-second);
count++;
break;
}
case '':
{
printf("%d%d=%d\n",first,second,first*second);
count++;
break;
}
case '/':
{
printf("%d/%d=%f\n",first,second,(float)first/(float)second);
count++;
break;
}
default:
{
count++;
break;
}
}//switch
}//while
}//case2
case 3:
{
int a,b,c,d;
char t,c1,c2;
float m,n;

 while(1)
 {
    scanf("%d%c%d%c%d%c%d%c",&a,&c1,&b,&t,&c,&c1,&d,&c2);

 m=(float)a/(float)b;
 n=(float)c/(float)d;
 switch(t)
{
case '+':
{
  printf("%d/%d+%d/%d=%f\n",a,b,c,d,m+n);
  count++;
  break;
  break;
}
case '-':
{
  printf("%d/%d-%d/%d=%f\n",a,b,c,d,m-n);
  count++;
  break;
}
case '*':
{
  printf("%d/%d*%d/%d=%f\n",a,b,c,d,m*n);
  count++;
  break;
}
case '/':
{
  printf("%d/%d/%d/%d=%f\n",a,b,c,d,(float)m/(float)n);
  count++;
  break;
}
default:
{
  count++;
  break;
}
 }
 }

}//case3
default:
{
break;
}
}
return 0;
}