package pt.c02oo.s10polimorfismo.s08tiam;

public class Hal extends Tiam {
   private String structure[] = {
     "Bonerges", "Robesberto", "Melissa"    
   };
   private int cursor = 0;
   
   public String first() {
      cursor = 0;
      
      return structure[cursor];
   }
   
   public String next() {
      cursor++;
      
      return (cursor < structure.length)?structure[cursor]:null;
   }
}
