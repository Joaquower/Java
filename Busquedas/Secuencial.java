package Busquedas;

public class Secuencial {
    public Secuencial(){
        
    }

    public int secuencial(int nums[], int x){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Secuencial busqueda = new Secuencial();
        int nums[] = {11,17,45,43,1,14,65,32,76,45,34};
        System.out.println("Posicion del numero 45 ");
        System.out.println(busqueda.secuencial(nums,45));
        System.out.println("Posicion del numero 1 ");
        System.out.println(busqueda.secuencial(nums,1));
    }
}


