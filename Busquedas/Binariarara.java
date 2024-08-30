package Busquedas;

public class Binariarara {
    public Binariarara(){}

    public int binaria(int nums[], int x){
       int j = nums.length -1;
        for(int i=0;i<(nums.length/2);i++){
            if(nums[i]==x ){
                return i;
            }
            if(nums[j]==x ){
                return j;
            }
            j--;
        }
        return -1;
    }

    public static void main(String[] args){
        Binariarara busqueda = new Binariarara();
        int nums[] = {11,17,45,43,1,14,65,32,76,45,34};
        System.out.println("Posicion del numero 45 ");
        System.out.println(busqueda.binaria(nums,45));
        System.out.println("Posicion del numero 1 ");
        System.out.println(busqueda.binaria(nums,1));
    }
}
