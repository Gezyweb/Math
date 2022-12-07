class Weight
{
  private int[] data;
  
  // Constructor
  public Weight(int[] init)
  {
    // Make data the same length
    // as the array referenced by init.
     data = new int[init.length];
    
    // Copy values from the 
    // input data to data.
    for (int j = 0; j < data.length; j++)
    {
      data[j] = init[j];
    }
  }
  
  //Print
  public String toString()
  {
 String str;
    if (data.length > 0) {//if the array data size is more than 0
      str = "[" + data[0];//append the first position
    } else {//else return a empty string
      return "";
    }
    for (int j = 1; j < data.length; j++)
     {
      //append a comma and the element in the position j
      str += ", " + data[j];

     }

    str += "]";

    return str;

 
  }

  public int average()
  {

    int sum = 0;

    for (int i = 0; i < data.length; i++) {//for to go through the array 

      sum += data[i]; // sum the the value in the array, this is the same sum = sum+numbers[i]
    }
    //calculate the avg = sum / number of elements
    int avg = sum / data.length;
    //return the avg
    return avg;

  }
  
  public int subAverage(int start, int end) 
  {
    //validate range if the start is >=0 and end >= start and end < to array size 
    if (start >= 0 && end >= start && end < data.length) {

      if (end == start) {// if end and start are equals
        return data[start];//the avg will be the number in start or end data[start] / 1 
      }
      int sum = 0;

      for (int i = start; i < end; i++) {//for to go through the array from start to end 

        sum += data[i]; // sum the the value in the array, this is the same sum = sum+numbers[i]
      }
      //calculate the avg = sum / number of elements taken in consideration (end - start)
      int avg = sum / (end - start);
      //return the avg
      return avg;

    } else {//if the range is invalid return -1
      return -1;
    }

  }
}

public class SubAverage
{

  public static void main(String[] args) {

    int[] values = {98, 99, 98, 99, 100, 101, 102, 100, 104, 105,
      105, 106, 105, 103, 104, 103, 105, 106, 107, 106,
      105, 105, 104, 104, 103, 102, 102, 101, 100, 102};

    Weight june = new Weight(values);
    //print the Weight object
    System.out.println(june);
    //calculate avg
    int avg = june.average();
    //print the avg
    System.out.println("average = " + avg);
    //calculate avg in the range 0-5
    int subAvg = june.subAverage(0, 5);
    //print the sub avg
    System.out.println("sub average = " + subAvg);
  }

}