%option noyywrap
%{
  int counter = 0 ;
%}
ID [a-zA-Z]+
num [0-9]+

adad  {ragham}+
shenase  {harf}{harf_ragham}*
ragham ( \u0031 |\u0032 | \u0033 |\u0034 |\u0035 |\u0036 |\u0037 |\u0038 | \u0039 |\u0030 | [0-9])
harf_ragham  (ragham|harf)
harf  (\u0627|\u0628|\u067e|\u062a|\u062b|
    \u062c|\u067e|\u062d|\u062e|\u062f|
    \u0630|\u0631|\u0632|\u0698|\u0633|\u0634|\u0635|\u0636|\u0637|\u0638|\u0639
    |\u063a|\u0641|\u0642|\u06a9|\u06af|\u0644|\u0645|\u0646|\u0648|\u0647|\u06cc)
harfe_sabet  ((\)?"'" (\)?{harf} (\)?"'" )^("'\n'") ^ ("'\0'") 
new_line  ("\n")
null_char ("\0")
jaye_khali ((\t)|" ")
noghte_virgul (";" | "")

 |
%%
"EXIT" {
  counter ++ ;
  return 0 ;
  } 
{ID} {
    printf("ID") ;
    counter ++ ;
  }
{num} {
  printf("num") ;
  counter ++ ;
  }
"+" {printf("+") ;}
. {printf("unknown") ;}
%%
int main()
{
yylex();
printf("\n%d" , counter ) ;
return 0;
}