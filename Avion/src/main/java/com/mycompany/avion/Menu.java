/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author NATHALY SALAZAR
 * @version 1.0
 */
/**
 * Clase menu que contiene la funcionalidad del programa
 * @author NATHALY
 */
public class Menu {
        /**
         * Mapa estatico de las sillas
         */
     static Map<Integer, Silla >mapaSilla;
        /**
         * Mapa estatico de los aviones
         */
     static Map<Integer, Avion >mapaAvion;
     /**
         * Contador que acumula los precios de las sillas vendidas en cada avion
         */
    static double totalA1=0;
    static double totalA2=0;
    static double totalA3=0;
    static String aerolinea;
    //static Avion avionClase = new Avion();
     
    /**
     * Metodo que llena la informacion de las sillas y los aviones
     */
     public void cargarDatos(){
         
         mapaSilla = new HashMap<>();
         mapaAvion = new HashMap<>();
         
         
         Economico e1 = new Economico(1,"Avion1");
        

         
         Costoso c1 = new Costoso(2,"Avion2");
        
         
         
         Multi m1 = new Multi(3,"Avion3");
         
         
         
        Silla s1 = new Silla(1,"a1",50000,1);
        Silla s2 = new Silla(2,"a2",50000,1);
        Silla s3 = new Silla(3,"a3",50000,1);
        Silla s4 = new Silla(4,"a4",50000,1);
        Silla s5 = new Silla(5,"a5",50000,1);
        Silla s6 = new Silla(6,"b1",50000,1);
        Silla s7 = new Silla(7,"b2",50000,1);
        Silla s8 = new Silla(8,"b3",50000,1);
        Silla s9 = new Silla(9,"b4",50000,1);
        Silla s10 = new Silla(10,"b5",50000,1);
        Silla s11 = new Silla(11,"c1",70000,1);
        Silla s12 = new Silla(12,"c2",70000,1);
        Silla s13 = new Silla(13,"c3",70000,1);
        Silla s14 = new Silla(14,"c4",70000,1);
        Silla s15 = new Silla(15,"c5",70000,1);
        Silla s16 = new Silla(16,"d1",70000,1);
        Silla s17 = new Silla(17,"d2",70000,1);
        Silla s18 = new Silla(18,"d3",70000,1);
        Silla s19 = new Silla(19,"d4",70000,1);
        Silla s20 = new Silla(20,"d5",70000,1);
        
        Silla s21 = new Silla(21,"a1",65000,1);
        Silla s22 = new Silla(22,"b1",65000,1);
        Silla s23 = new Silla(23,"c1",65000,1);
        Silla s24 = new Silla(24,"d1",65000,1);
        Silla s25 = new Silla(25,"f1",65000,1);
        
        
         
         e1.getMapaSilla().put(1, s1);
         e1.getMapaSilla().put(2, s2);
         e1.getMapaSilla().put(3, s3);
         e1.getMapaSilla().put(4, s4);
         e1.getMapaSilla().put(5, s5);
         e1.getMapaSilla().put(6, s6);
         e1.getMapaSilla().put(7, s7);
         e1.getMapaSilla().put(8, s8);
         e1.getMapaSilla().put(9, s9);
         e1.getMapaSilla().put(9, s10);
         mapaAvion.put(1,e1);
         
         c1.getMapaSilla().put(1 ,s11);
         c1.getMapaSilla().put(2 ,s12);
         c1.getMapaSilla().put(3 ,s13);
         c1.getMapaSilla().put(4 ,s14);
         c1.getMapaSilla().put(5 ,s15);
         c1.getMapaSilla().put(6 ,s16);
         c1.getMapaSilla().put(7 ,s17);
         c1.getMapaSilla().put(8 ,s18);
         c1.getMapaSilla().put(9 ,s19);
         c1.getMapaSilla().put(10,s20);
         mapaAvion.put(2,c1);
         
         m1.getMapaSilla().put(1 ,s21);
         m1.getMapaSilla().put(2 ,s22);
         m1.getMapaSilla().put(3 ,s23);
         m1.getMapaSilla().put(4 ,s24);
         m1.getMapaSilla().put(5 ,s25);
        mapaAvion.put(3,m1);
        
         mapaSilla.put(1, s1); 
         mapaSilla.put(2, s2);
         mapaSilla.put(3, s3);
         mapaSilla.put(4, s4);
         mapaSilla.put(5, s5); 
         mapaSilla.put(6, s6);
         mapaSilla.put(7, s7);
         mapaSilla.put(8, s8);
         mapaSilla.put(9, s9); 
         mapaSilla.put(10, s10);
         mapaSilla.put(11, s11);
         mapaSilla.put(12, s12);
         mapaSilla.put(13, s13); 
         mapaSilla.put(14, s14);
         mapaSilla.put(15, s15);
         mapaSilla.put(16, s16);
         mapaSilla.put(17, s17);
         mapaSilla.put(18, s18);
         mapaSilla.put(19, s19);
         mapaSilla.put(20, s20);
         mapaSilla.put(21, s21);
         mapaSilla.put(22, s22);
         mapaSilla.put(23, s23);
         mapaSilla.put(24, s24);
         mapaSilla.put(25, s25);
         
         menu();
         
           
     }
     /**
      * Metodo del menu en el cual se elige la funcion que desea realizar
      */
     public void menu(){
         System.out.println("----------------");
         System.out.println("-----MENU-------");
         System.out.println("----------------");
         System.out.println("1- COMPRAR TIQUETES");
         System.out.println("2- DESPEGAR AVION");
         
         
         
         Scanner op = new Scanner(System.in);
         int opcion = op.nextInt();
         
         switch(opcion){
            case 1:
                System.out.println("----COMPRA-----");
                comprar();
                break;
            case 2:
                System.out.println("----DESPEGAR-----");
                despegar();
                break;
            default:
                System.out.println("Ingrese un numero valido");
                menu();                    
        } 
     }
     
     /**
      * Metodo en el cual se elige el tipo de avion que desea comprar tiquete
      */
     public void  comprar(){
         System.out.println("----------------");
         System.out.println("-----SELECCIONE AVION-------");
         System.out.println("1-Economico");
         System.out.println("2-Costoso");
         System.out.println("3-Multi precio");
         
         Scanner opi = new Scanner(System.in);
         boolean a;
         String avion ;
         while(a = true){
             try{
             avion = opi.nextLine();
             int opcion  = Integer.parseInt(avion);
             if(opcion == 1){
                 a = false;
                    for(Integer sillaTe :mapaSilla.keySet()){
                            Silla sillaTem = mapaSilla.get(sillaTe);
                            if(sillaTem.getPrecio()== 50000 && sillaTem.getEstado()== 1){
                                System.out.println(sillaTem.getUbicacion());
                                System.out.println(sillaTem.getPrecio());       
                            }
                    }
                    aerolinea ="Avion1";
                    reserva(aerolinea);
            }else if(opcion == 2){  
                a = false;    
                    for(Integer sillaTc :mapaSilla.keySet()){
                            Silla sillaTcm = mapaSilla.get(sillaTc);
                            if(sillaTcm.getPrecio()== 70000 && sillaTcm.getEstado()== 1){
                                System.out.println(sillaTcm.getUbicacion());
                                System.out.println(sillaTcm.getPrecio());       
                            }
                    } 
                     aerolinea = "Avion2";
                    reserva(aerolinea);
            }else if(opcion == 3){ 
                a = false;
                    for(Integer sillaTm :mapaSilla.keySet()){
                            Silla sillaTmm = mapaSilla.get(sillaTm);
                            if(sillaTmm.getPrecio()== 65000 && sillaTmm.getEstado()== 1){
                                System.out.println(sillaTmm.getUbicacion());
                                System.out.println(sillaTmm.getPrecio());       
                            }
                    }
                     aerolinea = "Avion3";
                    reserva(aerolinea);
            }else{System.out.println(" No existe esta opcion"); }
            }catch(InputMismatchException | NumberFormatException e){
                System.out.println("Digite correctamente los datos");
            
            }
            
            }
             
         }
     
     /**
      * Metodo que reserva la silla pidiendo los datos principales de la persona
      * @param aero recibe este parametro que contiene el nombre de la aerolinea que selecciono 
      *
      */
        public void reserva(String aero){
    int prueba = 1;
        while(prueba == 1){
            Scanner scan2 = new Scanner(System.in);
            System.out.println("   DIGITE LA SILLA A RESERVAR ");
            String sillaR;        
                try{
                    sillaR = scan2.nextLine().toLowerCase();
                    for(Integer p:mapaAvion.keySet()){
                        String aeroAux = mapaAvion.get(p).getAerolinea();
                        for(Integer key : mapaSilla.keySet()){
                        if(mapaSilla.get(key).getUbicacion().equals(sillaR)&& mapaSilla.get(key).getEstado()==1 && aeroAux.equals(aero)){
                           double valors = mapaSilla.get(key).getPrecio();
                           prueba = 2;
                           int prueba1 = 1;
                           while(prueba1 ==1){
                                  Scanner scan3 = new Scanner(System.in); 
                                  try{
                                    System.out.println("Digite su nombre");
                                    String nombre;
                                    nombre = scan3.nextLine();
                                    prueba1 = 2;
                                    int prueba2 = 1;
                                    while(prueba2 ==1){
                                        Scanner scan4 = new Scanner(System.in);
                                        try{
                                            System.out.println("Digite su documento:");
                                            String documento;
                                            documento = scan4.nextLine();
                                            int doc = Integer.parseInt(documento);
                                            prueba2 = 2;
                                            int prueba3 = 1;
                                            while(prueba3 ==1){
                                                Scanner scan5 = new Scanner(System.in); 
                                                try{
                                                    System.out.println("Fecha:");
                                                    String fecha;
                                                    fecha = scan4.nextLine();
                                                    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                                                    Date testDate = null;                                                           
                                                    testDate = df.parse(fecha);
                                                    if(sillaR.equals(mapaSilla.get(key).getUbicacion())){
                                                        mapaSilla.get(key).setEstado(2);
                                                        if(valors==50000){
                                                            totalA1 += valors;
                                                        }else if(valors==70000){
                                                            totalA2 += valors;
                                                        }else if(valors==65000){
                                                            totalA3 += valors;
                                                        }
                                                        System.out.println("Silla reservada!");
                                                        menu();
                                                    }
                                                    prueba3=2;
                                                }catch (ParseException e){ System.out.println("La fecha no es la correcta, intente de nuevo // año-mes-dia");}
                                            }prueba2 = 2;  
                                        }catch(InputMismatchException | NumberFormatException e){System.out.println("Solo puede digitar numeros");}
                                    }prueba1 = 2;
                                }catch(InputMismatchException e){System.out.println("Su nombre está mal digitado");}
                            }prueba = 2;
                        }
                    }
                }    
            }catch(Exception e){    
        }
                
    }

 }
        /**
        *Metodo para despegar el avion  
        */
      public void despegar(){
        Scanner sc = new Scanner(System.in);
        int prueba = 1;
        int opcion;
        while(prueba==1){
            System.out.println("----------------");
             System.out.println("-----SELECCIONE AVION PARA DESPEGAR-------");
             System.out.println("1-Economico");
             System.out.println("2-Costoso");
             System.out.println("3-Multi precio");
            
                opcion = sc.nextInt();
                
                switch(opcion){
                    case 1:
                        System.out.println("El avion arranco con   $"+totalA1);
                        menu();
                        break;
                    case 2:
                        System.out.println("El avion arranco con   $"+totalA2);
                        menu();
                        break;    
                    case 3:
                        System.out.println("El avion arranco con   $"+totalA3);
                        menu();
                        break; 
                    default:
                    System.out.println("Ingrese un numero valido");
                    despegar();    
                        
                }
                prueba=2;
        }
    }
      public String TestAvion(int op){
          String sillas = "";
          int opcion = op;
          if(opcion==1){
                    for(Integer sillaTe :mapaSilla.keySet()){
                            Silla sillaTem = mapaSilla.get(sillaTe);
                            if(sillaTem.getPrecio()== 50000 && sillaTem.getEstado()== 1){
                                sillas += sillaTem.getUbicacion(); 
                                return sillas;
                            }
                    }
                 
            }else if(opcion==2){  
                   
                    for(Integer sillaTc :mapaSilla.keySet()){
                            Silla sillaTcm = mapaSilla.get(sillaTc);
                            if(sillaTcm.getPrecio()== 70000 && sillaTcm.getEstado()== 1){
                                sillas += sillaTcm.getUbicacion();       
                                return sillas;
                            }
                    } 
                    
            }else if(opcion==3){ 
                
                    for(Integer sillaTm :mapaSilla.keySet()){
                            Silla sillaTmm = mapaSilla.get(sillaTm);
                            if(sillaTmm.getPrecio()== 65000 && sillaTmm.getEstado()== 1){
                                sillas += sillaTmm.getUbicacion();       
                                return sillas;
                            }
                    }
                }
          
         return "HOLA";
      }
         
     public static void main(String[] args) {		
     Menu principal = new Menu();
     principal.cargarDatos();

    }   
         
         
     }
     
     

