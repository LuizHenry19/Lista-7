public class Teste
{  public static void main(String[] args)
   {  Circulo circulo = new Circulo(2);
      Retangulo retangulo = new Retangulo(6 , 5);
      
      double areaCirculo = circulo.calcularArea();
      System.out.println("Área do Círculo: " + areaCirculo);
      
      double areaRetangulo = retangulo.calcularArea();
      System.out.println("Área do Retângulo: " + areaRetangulo);
   }
} 