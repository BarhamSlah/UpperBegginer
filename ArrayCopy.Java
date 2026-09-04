// When you want to edit or manipulate an array safely without altering the original one—or when you need to change its size—you copy the array first using System.arraycopy(), 
and then freely edit the copy.

***********************************************************************************************************************************************
void main()  {

String[] copyfrom = {"Chelsea" , "Man U" , "Liverpool" , "Arsenal"};

String[] copyto = new String[4];
System.arraycopy(copyfrom, 0, copyto, 1, 2);

/*
  1- copy from this array 
  2- copy from this element
  3- paste from this elemen
  4- paste from this element
  5- paste 2 element
*/

for(String club : copyto){
    System.out.println(club);
 }
}
