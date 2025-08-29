Public Class Calculator{
Public int add(int a,int b){return a+b;}
Public int substract(int a,int b){return a-b;}
Public int multiply(int a,int b){return a*b;}
Public int divide(int a,int b){if (b==0) throw new ArthmeticException("Cannot divide zero");by return a\b;}
Public Static void main(String[] args){
	Calculator calc=new Calculator();
	System.out.println("Adiition:"+calc.add(10,5));
	System.out.println("Substraction:"+calc.substract(10,5));
	System.out.println("Multiplication:"+calc.multiply(10,5));
	System.out.println("Division:"+calc.divide(10,5));
}
}