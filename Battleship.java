import java.util.Scanner;

public class Battleship {

    int[] posicion(int pos){
        int r[]= new int[2];
        pos=pos-1;
        r[0]=pos/5;
        r[1]=pos%5;
        return r;
    }

    public Battleship() {

        Scanner sc = new Scanner(System.in);

        char tablero1[][] = new char[5][5];// Esta arreglo lo usamos para el jugaodor 1
        char tablero2[][] = new char[5][5];// Esta arreglo lo usamos para el jugaodor 1
        int Jugador1, Jugador2;
        //int per1 = 3, per2 = 3;
        char signo1 = 'X', signo2 = 'Y';
        //JUGADOR1
        tablero1[0][0] = '-';// Aquie a tablero1 le asingamos el caracter -
        tablero1[0][1] = '-';
        tablero1[0][2] = '-';
        tablero1[0][3] = '-';
        tablero1[0][4] = '-';
        tablero1[1][0] = '-';
        tablero1[1][1] = '-';
        tablero1[1][2] = '-';
        tablero1[1][3] = '-';
        tablero1[1][4] = '-';
        tablero1[2][0] = '-';
        tablero1[2][1] = '-';
        tablero1[2][2] = '-';
        tablero1[2][3] = '-';
        tablero1[2][4] = '-';
        tablero1[3][0] = '-';
        tablero1[3][1] = '-';
        tablero1[3][2] = '-';
        tablero1[3][3] = '-';
        tablero1[3][4] = '-';
        tablero1[4][0] = '-';
        tablero1[4][1] = '-';
        tablero1[4][2] = '-';
        tablero1[4][3] = '-';
        tablero1[4][4] = '-';
        //JUGADOR2
        tablero2[0][0] = '-';// Aquie a tablero2 le asingamos el caracter -
        tablero2[0][1] = '-';
        tablero2[0][2] = '-';
        tablero2[0][3] = '-';
        tablero2[0][4] = '-';
        tablero2[1][0] = '-';
        tablero2[1][1] = '-';
        tablero2[1][2] = '-';
        tablero2[1][3] = '-';
        tablero2[1][4] = '-';
        tablero2[2][0] = '-';
        tablero2[2][1] = '-';
        tablero2[2][2] = '-';
        tablero2[2][3] = '-';
        tablero2[2][4] = '-';
        tablero2[3][0] = '-';
        tablero2[3][1] = '-';
        tablero2[3][2] = '-';
        tablero2[3][3] = '-';
        tablero2[3][4] = '-';
        tablero2[4][0] = '-';
        tablero2[4][1] = '-';
        tablero2[4][2] = '-';
        tablero2[4][3] = '-';
        tablero2[4][4] = '-';
/* en este for nos pregunta donde queremos guardar la posicion */
        for (int x = 0; x < 3; x++) {
            System.out.println("-> Jugador 1 <-");
            System.out.println("Ingresa la posicion donde quiere su Barco");
            System.out.println("1.1x1    2.1x2    3.1x3  4.1x4  5.1x5");
            System.out.println("6.2x1    7.2x2    8.2x3  9.2x4  10.2x5");
            System.out.println("11.3x1   12.3x2   13.3x3 14.3x4  15.3x5");
            System.out.println("16.3x1   17.3x2   18.3x3 14.3x4  19.3x5");
            System.out.println("20.3x1   21.3x2   22.3x3 23.3x4  24.3x5");
            System.out.println("Ingrese una posicion Jugador 1");
            Jugador1 = sc.nextInt();
            switch (Jugador1) {
                /* en este swictch lo utilizamos para asignar el caracter "Y" que le preterminado a jugador1 para distinguilo */
                case 1:

                    tablero1[0][0] = signo1;
                    break;
                case 2:
                    tablero1[0][1] = signo1;
                    break;
                case 3:
                    tablero1[0][2] = signo1;
                    break;
                case 4:
                    tablero1[0][3] = signo1;
                    break;
                case 5:
                    tablero1[0][4] = signo1;
                    break;
                case 6:
                    tablero1[1][0] = signo1;
                    break;
                case 7:
                    tablero1[1][1] = signo1;
                    break;
                case 8:
                    tablero1[1][2] = signo1;
                    break;
                case 9:
                    tablero1[1][2] = signo1;
                    break;
                case 10:
                    tablero1[1][4] = signo1;
                    break;
                case 11:
                    tablero1[2][0] = signo1;
                    break;
                case 12:
                    tablero1[2][1] = signo1;
                    break;
                case 13:
                    tablero1[2][2] = signo1;
                    break;
                case 14:
                    tablero1[2][3] = signo1;
                    break;
                case 15:
                    tablero1[2][4] = signo1;
                    break;
                case 16:
                    tablero1[3][0] = signo1;
                    break;
                case 17:
                    tablero1[3][1] = signo1;
                    break;
                case 18:
                    tablero1[3][2] = signo1;
                    break;
                case 19:
                    tablero1[3][4] = signo1;
                    break;
                case 20:
                    tablero1[4][0] = signo1;
                    break;
                case 22:
                    tablero1[4][1] = signo1;
                    break;
                case 23:
                    tablero1[4][2] = signo1;
                    break;
                case 24:
                    tablero1[4][3] = signo1;
                    break;
                case 25:
                    tablero1[4][4] = signo1;
                    break;
            }
        }

        for (int x = 0; x < 3; x++) {
            System.out.println("-> Jugador 2 <-");
            System.out.println("Ingresa la posicion donde quiere su Barco");
            System.out.println("1.1x1    2.1x2    3.1x3  4.1x4  5.1x5");
            System.out.println("6.2x1    7.2x2    8.2x3  9.2x4  10.2x5");
            System.out.println("11.3x1   12.3x2   13.3x3 14.3x4  15.3x5");
            System.out.println("16.3x1   17.3x2   18.3x3 14.3x4  19.3x5");
            System.out.println("20.3x1   21.3x2   22.3x3 23.3x4  24.3x5");
            System.out.println("Ingrese una posicion Jugador 2");
            Jugador2 = sc.nextInt();
            switch (Jugador2) {
                /* en este swictch lo utilizamos para asignar el caracter "X" que le preterminado a jugador2 para distinguilo */
                case 1:
                    tablero2[0][0] = signo2;
                    break;
                case 2:
                    tablero2[0][1] = signo2;
                    break;
                case 3:
                    tablero2[0][2] = signo2;
                    break;
                case 4:
                    tablero2[0][3] = signo2;
                    break;
                case 5:
                    tablero2[0][4] = signo2;
                    break;
                case 6:
                    tablero2[1][0] = signo2;
                    break;
                case 7:
                    tablero2[1][1] = signo2;
                    break;
                case 8:
                    tablero2[1][2] = signo2;
                    break;
                case 9:
                    tablero2[1][2] = signo2;
                    break;
                case 10:
                    tablero2[1][4] = signo2;
                    break;
                case 11:
                    tablero2[2][0] = signo2;
                    break;
                case 12:
                    tablero2[2][1] = signo2;
                    break;
                case 13:
                    tablero2[2][2] = signo2;
                    break;
                case 14:
                    tablero2[2][3] = signo2;
                    break;
                case 15:
                    tablero2[2][4] = signo2;
                    break;
                case 16:
                    tablero2[3][0] = signo2;
                    break;
                case 17:
                    tablero2[3][1] = signo2;
                    break;
                case 18:
                    tablero2[3][2] = signo2;
                    break;
                case 19:
                    tablero2[3][4] = signo2;
                    break;
                case 20:
                    tablero2[4][0] = signo2;
                    break;
                case 22:
                    tablero2[4][1] = signo2;
                    break;
                case 23:
                    tablero2[4][2] = signo2;
                    break;
                case 24:
                    tablero2[4][3] = signo2;
                    break;
                case 25:
                    tablero2[4][4] = signo2;
                    break;
            }
        }
        /* AQUI IMPRIMIMOS LOS TABLEROS CON SUS REPCTIVAS POSICIONES */
        System.out.println("     <<<<< Tabla Jugador 1 >>>>>");
        System.out.println(tablero1[0][0] + "  " + tablero1[0][1] + "  " + tablero1[0][2] + "  " + tablero1[0][3] + "  " + tablero1[0][4]);
        System.out.println(tablero1[1][0] + "  " + tablero1[1][1] + "  " + tablero1[1][2] + "  " + tablero1[1][3] + "  " + tablero1[1][4]);
        System.out.println(tablero1[2][0] + "  " + tablero1[2][1] + "  " + tablero1[2][2] + "  " + tablero1[2][3] + "  " + tablero1[2][4]);
        System.out.println(tablero1[3][0] + "  " + tablero1[3][1] + "  " + tablero1[3][2] + "  " + tablero1[3][3] + "  " + tablero1[3][4]);
        System.out.println(tablero1[4][0] + "  " + tablero1[4][1] + "  " + tablero1[4][2] + "  " + tablero1[4][3] + "  " + tablero1[4][4]);
        System.out.println("  ");
        System.out.println("     <<<<< Tabla Jugador 2 >>>>>>");
        System.out.println(tablero2[0][0] + "  " + tablero2[0][1] + "  " + tablero2[0][2] + "  " + tablero2[0][3] + "  " + tablero2[0][4]);
        System.out.println(tablero2[1][0] + "  " + tablero2[1][1] + "  " + tablero2[1][2] + "  " + tablero2[1][3] + "  " + tablero2[1][4]);
        System.out.println(tablero2[2][0] + "  " + tablero2[2][1] + "  " + tablero2[2][2] + "  " + tablero2[2][3] + "  " + tablero2[2][4]);
        System.out.println(tablero2[3][0] + "  " + tablero2[3][1] + "  " + tablero2[3][2] + "  " + tablero2[3][3] + "  " + tablero2[3][4]);
        System.out.println(tablero2[4][0] + "  " + tablero2[4][1] + "  " + tablero2[4][2] + "  " + tablero2[4][3] + "  " + tablero2[4][4]);
        System.out.println("  ");
        System.out.println(" <<<<< COMIENZA LA BATALLA>>>>>");

        int vd1 = 3, vd2 = 3;// Estas veriables la ocupamos para que vaya acumulando las vidas perididas de los jugadores

      do
        {
            /*Aqui preguntamos a jugador 1 donde en que posicion quiere atacar al jugador 2*/
            System.out.println(" -> JUGADOR 1: Ingrese la Posicion donde quiere atarcar <-");
            int ata1 = sc.nextInt();
            int r[]=posicion(ata1);
            int f=r[0];// Esta varibale la ocupamos para las posiciones de las filas
            int c=r[1];//Esta varibale la ocupamos para las posiciones de las columnas
            //Aqui verificamos si en las posiones estan ocupas
            if (tablero2[f][c] ==signo2) {
                vd2--;// Aqui va disminuyendo el tamaÃ±o de vida del jugador2 si en la posicion esta ocupada
                System.out.println("JUGADOR 1:HAS DERRIVADO UN BARCO !!");

            } else {
                System.out.println("HAS FALLADO ");
            }



///////////////////////////////////////////////
            /*Aqui preguntamos a jugador 2 donde en que posicion quiere atacar al jugador 1*/
            System.out.println(" -> JUGADOR 2: Ingrese la Posicion donde quiere atarcar <-");
            int ata2 = sc.nextInt();

            int p[]=posicion(ata2);
            f=p[0];// Esta varibale la ocupamos para las posiciones de las filas
            c=p[1]; //Esta varibale la ocupamos para las posiciones de las columnas
            //Aqui verificamos si en las posiones estan ocupas
            if (tablero1[f][c] == signo1) {
                vd1--;// Aqui va disminuyendo el tamaÃ±o de vida del jugador2 si en la posicion esta ocupada
                System.out.println("JUGADOR 2:HAS DERRIVADO UN BARCO !!");

            } else {
                System.out.println("HAS FALLADO ");
            }
            /* En este if validamos si la vida del jugador 1 llega a 0 imprime las condiciones */
            if (vd1<=0) {
                System.out.println("-> -> -> -> -> -> ->-> -> -> -> -> ->-> ->");
                System.out.println("-> JUGADOR 2 HAS GANADO!!!!!!!!"   +"         ->");
                System.out.println("-> JUGADOR 1 HAS PERDIDO )="       +"             ->");
                System.out.println("-> -> -> -> -> -> -> -> -> -> -> -> ->  ->");
                System.out.println(" ");
                System.out.println(" ");
                Main.menu();
            }
            if (vd2<=0) {
                /* En este if validamos si la vida del jugador 1 llega a 0 imprime las condiciones */
                System.out.println("-> -> -> -> -> -> ->-> -> -> -> -> ->-> ->");
                System.out.println("-> JUGADOR 1 HAS GANADO!!!!!!!!"   +"         ->");
                System.out.println("-> JUGADOR 2 HAS PERDIDO )="       +"             ->");
                System.out.println("-> -> -> -> -> -> -> -> -> -> -> -> ->  ->");
                System.out.println(" ");
                System.out.println(" ");
                Main.menu();
            }


        }while (vd1!=0&&vd2!=0);
    }
}


