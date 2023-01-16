

        class A {
            int i;

            void show() {
                System.out.println(i);
            }
        }
        class B extends A {
            int j;

            void show() {
                System.out.println(j);
            }
        }
        class inheritanceDemo {
            public static void main(String args[]) {
                B obj = new B();
                obj.i = 2;
                obj.j = 18;
                obj.show();
            }
        }
