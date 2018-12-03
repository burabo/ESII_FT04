import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextDateTest {

    NextDate test = new NextDate(12,15,2018);

    @Test
    public void nextDateTest(){

    //Resultado Inválido: Dia, Mês e Ano inválidos
    String result = test.run(13,0,1800);
    assertEquals("invalid Input Date", result);

    //Resultado Inválido: Dia do mês inexistente
    String result2 = test.run(4,31, 1801);
    assertEquals("Invalid Input Date", result2);

    //Resultado Inválido: Dia do mês inexistente
    String result3 = test.run(12,31, 2021);
    assertEquals("Invalid Next Year", result3);

     //Resultado Inválido: Dia de Fevereiro inexistente
     String result4 = test.run(2,30, 2018);
     assertEquals("Invalid Input Date", result4);

      //Resultado Inválido: Dia de Fevereiro inexistente
      String result5 = test.run(2,29, 2018);
      assertEquals("Invalid Input Date", result5);

     //Resultado Válido: Dia de Fevereiro inexistente
     String result6 = test.run(12,15, 2018);
     assertEquals("12/16/2018", result6);
    }
}
