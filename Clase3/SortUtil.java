package Clase3;

public class SortUtil {

    public static <T> void ordenar(Precedable<T>[] precedables) {
        for(int i = 0; i<precedables.length-1;i++){
            for(int j = 0; j<precedables.length-1;j++){
                Precedable<T> current = precedables[j];
                if(current.precedeA((T) precedables[j+1])>0){
                    Precedable<T> temp=precedables[j];
                    precedables[j]=precedables[j+1];
                    precedables[j+1]=temp;
                }
            }
        }
    }
}
