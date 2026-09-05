StringBuilder : Faster - NOT safe thread - always use apart from multiple thread

StringBuffer : Slower - safe thread - only use when use multiple thread

***********************************************************************************************************************************************
void main()  {

StringBuffer stringBuffer = new StringBuffer("Barham");
IO.println(stringBuffer.capacity()); // 16(default) + 6(barham)
IO.println(stringBuffer.length()); // 6 (barham)
IO.println(stringBuffer.append(" Backend")); // add(Backend)
IO.println(stringBuffer.delete(2 , 4)); // delete from 2 till 4
IO.println(stringBuffer.insert(2 , "rh")); // after index 2 add rh
IO.println(stringBuffer.isEmpty()); // is empty or no
IO.println(stringBuffer.toString());

}
