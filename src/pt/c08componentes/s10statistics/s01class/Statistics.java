package pt.c08componentes.s10statistics.s01class;

/**
 * Registers a set of numbers and calculates the sum and average of these numbers.
 * 
 * @author Andre Santanche
 */
public class Statistics {
   private float valueSet[];
   private int position;
   
   /*
    * Constructor
    **************/
   
   public Statistics(int size)
   {
       super();
       valueSet = new float[size];
       position = 0;
   }

   /*
    * IStatistics Interface
    ***********************/
   
   public void insertValue(float value)
   {
      if (position < valueSet.length) {
        valueSet[position] = value;
        position++;
      }
   }

   public float sum()
   {
       float theSum = 0.0f;
       
       for (int p = 0; p < position; p++)
         theSum += valueSet[p];
       
       return theSum;
   }

   public float average()
   {
       float avg = 0;
       
       if (position > 0)
         avg = sum() / position;
       
       return avg;
   }
}