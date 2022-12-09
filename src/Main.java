import java.util.ArrayList;
import java.util.List;

public class Main {

    interface CarInterface{
        List<Character> makeAndModel = new ArrayList<Character>();
        void assemble(Object obj);
        void disassemble(Object obj);
        boolean hasTech(Object obj);
        List<Character> model();
        boolean isEmpty();
    }

    abstract class SUV implements CarInterface{
        String [] part;
        public SUV (String[] arr, String make){
            part = new String[arr.length];
            for (int i = 0; i < arr.length; i++) {
                part[i] = arr[i];
                makeAndModel.add(make.charAt(i));
            }
        }

        public abstract void assemble(Object obj);
        public abstract void disassemble(Object obj);

        public boolean hasTech(Object obj) {
            boolean hasTech = true;
            // Implementation is removed.
            return hasTech;
        }

        public List<Character> model() {
            return makeAndModel;
        }

        public boolean isEmpty() {
            if (makeAndModel.size() != 0 && part.length !=0) {
                return false;
            } else{
                return true;
            }
        }
    }

    class FirstGenSUV extends SUV {
        public FirstGenSUV (String []arr ,String make) {
            super(arr,make);
        }

        public void assemble(Object obj) {

        }

        public void disassemble(Object obj) {
            // code was removed
        }
    }

    class SecondGenSUV extends SUV {
        public SecondGenSUV (String []arr ,String make) {
            super(arr,make);
        }

        public void assemble(Object obj){
            String element = (String) obj;
            part[part.length] = element;
        }

        public void disassemble(Object obj) {
            String element = (String) obj;
            // code was removed.
        }
    }

    public void main(String[] args) {
        String[] ar1= {"audio", "video", "abs brake"};
        String[] ar2 = { "navigation system", "blind spot monitor", "airbag control system", "abs brake"};
        String make = "Toyota";
        FirstGenSUV obj1 = new FirstGenSUV (ar1, make);
        System.out.println(obj1.isEmpty());
        System.out.println(obj1.model());
        make = "Audi";
        SecondGenSUV obj2 = new SecondGenSUV (ar2, make);
        System.out.println(obj1.model());
        System.out.println(obj2.part.length);
    }
}

