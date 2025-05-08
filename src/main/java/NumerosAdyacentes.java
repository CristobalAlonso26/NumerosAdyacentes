public class NumerosAdyacentes {
    public static int productoAdyacentes(int[] array){
        int multiplicacionMayor = array[0]*array[1];
        for (int i=1;i<array.length-1;i++){
            if(array[i]*array[i+1]>multiplicacionMayor){
                multiplicacionMayor=array[i]*array[i+1];
            }
        }
        return multiplicacionMayor;
    }
}
