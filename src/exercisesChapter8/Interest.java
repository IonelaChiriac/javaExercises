package exercisesChapter8;// Interest.java
// Compound-interest calculations with BigDecimal.
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Interest 
{
   public static void main(String args[])
   {
      // initial principal amount before interest
      BigDecimal principal = BigDecimal.valueOf(1000.0); 
      BigDecimal rate = BigDecimal.valueOf(0.05); // interest rate

      // display headers
      System.out.printf("%s%20s%n", "Year", "Amount on deposit");

      // calculate amount on deposit for each of ten years
      for (int year = 1; year <= 10; year++) 
      {
         // calculate new amount for specified year
         BigDecimal amount = 
            principal.multiply(rate.add(BigDecimal.ONE).pow(year));

         // display the year and the amount
         System.out.printf("%4d%20s%n", year,
                 //NumberFormat.getCurrencyInstance().format(amount));
                 //NumberFormat.getCurrencyInstance(Locale.FRANCE).format(amount));
                 NumberFormat.getCurrencyInstance(new Locale("ro","RO")).format(amount));
      } 
   }
} // end class Interest

//NumberFormat.getCurrencyInstance().format(amount)); //from our current OS
//Year   Amount on deposit
//   1           $1,050.00
//   2           $1,102.50
//   3           $1,157.62
//   4           $1,215.51
//   5           $1,276.28
//   6           $1,340.10
//   7           $1,407.10
//   8           $1,477.46
//   9           $1,551.33
//  10           $1,628.89


//NumberFormat.getCurrencyInstance(Locale.FRANCE).format(amount));
//Year   Amount on deposit
//   1           1 050.00 €
//   2           1 102.50 €
//   3           1 157.62 €
//   4           1 215.51 €
//   5           1 276.28 €
//   6           1 340.10 €
//   7           1 407.10 €
//   8           1 477.46 €
//   9           1 551.33 €
//  10           1 628.89 €


//NumberFormat.getCurrencyInstance(new Locale("ro","RO")).format(amount));
//Year   Amount on deposit
//   1        1.050,00 RON
//   2        1.102,50 RON
//   3        1.157,62 RON
//   4        1.215,51 RON
//   5        1.276,28 RON
//   6        1.340,10 RON
//   7        1.407,10 RON
//   8        1.477,46 RON
//   9        1.551,33 RON
//  10        1.628,89 RON