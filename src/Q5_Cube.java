public class Q5_Cube {

    public static void main(String args[]){
        int len = 2;
        Cube [] array = new Cube[len];
        for (int i = 0; i < len; i++) {
            array[i] = new Cube(i, i+1, i+2);
        Test test = new Test(array, len);
        int vol = 3;
        vol = test.setVol(vol);
        System.out.println(vol);
        test.setVol(vol);
        System.out.println(vol);

        System.out.println(array[0].dime1);
        test.setCube(array);
        System.out.println(array[0].dime1);

        Boolean guess = true;
        test.isCube(guess, 1);
        System.out.println(guess);
        test = new Test();
        System.out.println(Test.desiredVolume);



        }
    }

    static class Cube{
        int dime1;
        int dime2;
        int dime3;
        public Cube (int d1, int d2, int d3){
            dime1 = d1;
            dime2 = d2;
            dime3 = d3;
        }
    }

    static class Test{
        Cube[] array;
        static int desiredVolume;
        public Test(){
            array = null;
        }

        public Test(Cube[] array, int dv){
            this.array = array;
            desiredVolume = dv;
        }

        int setVol(int vol){
            vol = desiredVolume * vol;
            System.out.println(vol);
            return vol;
        }

        Cube[] setCube(Cube[] array){
            array[0] = new Cube(100, 0, 0);
            this.array = array;
            System.out.println(array[0].dime1);
            return this.array;
        }

        boolean isCube(boolean guess, int i){
            if (!(array[i].dime1 == array[i].dime2 && array[i].dime2 == array[i].dime3))
                guess = false;
            System.out.println(guess);
            return guess;

        }

    }

}











