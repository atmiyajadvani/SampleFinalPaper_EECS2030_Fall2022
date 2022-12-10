public class Q7_Parent {

    abstract class Parent{
        boolean done;
        static int count;

        public void firstOp(){
            done = false;
            this.secondOp();
            this.thirdOp();
            this.fourthOp();
            this.fifthOp();
        }

        abstract public void secondOp();

        private void thirdOp() {
            System.out.println("P- 3");
        }

        private void fourthOp() {
            done = true;
            System.out.println("P- 4");
        }

        private void fifthOp() {
            System.out.println("P- 5");
        }
    }

    class FirstChild extends Parent{
        @Override
        public void secondOp() {
            System.out.println("F- 2");
        }

        public void thirdOp(){
            System.out.println("F- 3");
        }

        FirstChild getInstance(){
            count++;
            System.out.println("Fcount- " + count);
            return new FirstChild();
        }
    }

    static class SecondChild extends Parent{
        @Override
        public void secondOp() {
            System.out.println("S- 2");
        }
        public void fourthOp(){
            System.out.println("S- 4");
        }
        public void fifthOp(){
            System.out.println("S- 5");
        }

        static SecondChild getInstance(){
            count = count + 2;
            System.out.println("Scount- " + count);
            return new SecondChild();
        }
    }

    static class FirstGrandChild extends FirstChild{
        @Override
        public void secondOp() {
            System.out.println("FG- 2");
        }
        public void thirdOp(){
            System.out.println("FG- 3");
        }
        public void fourthOp(){
            done = false;
            System.out.println("FG- 4");
        }

        FirstGrandChild getInstance(){
            System.out.println("FGcount- " + count);
            count --;
            return new FirstGrandChild();
        }
    }


    public static void main(String[] args){

        Parent obj1 = new FirstChild();
        Parent obj2 = new SecondChild();
        Parent obj3 = new FirstGrandChild();

        obj1.fifthOp();
        obj2.fifthOp();
        obj3.fifthOp();

        System.out.println("count = " + obj1.count);
        System.out.println("done = " + obj1.done);

        Parent obj4 = FirstChild.getInstance();
        Parent obj5 = SecondChild.getInstance();
        Parent obj6 = FirstGrandChild.getInstance();

        obj4.fifthOp();
        obj5.secondOp();
        obj6.thirdOp();

        System.out.println("count = " + obj6.count);
        System.out.println("done = " + obj6.done);
    }



}
