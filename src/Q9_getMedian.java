public class Q9_getMedian {

    public static void main(String[] args){
    }

    int getMedian(int array1[], int array2[], int n){
        int i = 0, j = 0;
        int count;
        int median1 = -1, median2 = -1;

        for(count = 0; count <= n; count++){
            if(i == n){
                median1 = median2;
                median2 = array2[0];
                break;
            } else if (j == n){
                median1 = median2;
                median2 = array1[0];
                break;
            }

            if (array1[i] <= array2[j]){
                median1 = median2;
                median2 = array1[i];
                i++;
            } else {
                median1 = median2;
                median2 = array2[j];
                j++;
            }
        }
        return (median1 + median2)/2;
    }
}


// Question is incomplete

