/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testclass;

/**
 *
 * @author assistanz
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ReadFile {

    public static void main(String[] args) {

        BufferedReader br = null;
        BufferedReader cr = null;
        BufferedReader dr = null;
        BufferedReader er = null;

        try {

            String line;
            String line1;
            String line2;
            String line3;
            
            
            
            
            
            int finalcount=0;

            br = new BufferedReader(new FileReader("/home/assistanz/Documents/input.txt"));
            cr = new BufferedReader(new FileReader("/home/assistanz/Documents/input1.txt"));
            dr = new BufferedReader(new FileReader("/home/assistanz/Documents/input2.txt"));
            er = new BufferedReader(new FileReader("/home/assistanz/Documents/input3.txt"));

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                
                 StringTokenizer st = new StringTokenizer(line, ",");
                            int countTokens = 0;
                          // int c = 0;
                            while (st.hasMoreTokens()) {
                                System.out.println(st.nextToken());
                                countTokens++;
                               // c = c + countTokens;
                            }
                            System.out.print("count:");
                            System.out.println(countTokens);
                           // System.out.print("sum of first file:");
                           // System.out.println(c);
                            
                            
                while ((line1 = cr.readLine()) != null) {
                    System.out.println(line1);
                    
                     StringTokenizer st1 = new StringTokenizer(line1, ",");
                            int countTokens1 = 0;
                        //   int c1 = 0;
                            while (st1.hasMoreTokens()) {
                                System.out.println(st1.nextToken());
                                countTokens1++;
                            //   c1 = c1 + countTokens1;
                            }
                            System.out.print("count:");
                            System.out.println(countTokens1);
                          // //  System.out.print("sum of second file:");
//                           System.out.println(c1);

                    while ((line2 = dr.readLine()) != null) {
                        System.out.println(line2);
                         StringTokenizer st2 = new StringTokenizer(line2, ",");
                            int countTokens2 = 0;
                           // int c2 = 0;
                            while (st2.hasMoreTokens()) {
                                System.out.println(st2.nextToken());
                                countTokens2++;
                              // c2 = c2 + countTokens2;
                            }
                            System.out.print("count:");
                            System.out.println(countTokens2);
                            // System.out.print("sum of third file:");
                           // System.out.println(c2);
                        while ((line3 = er.readLine()) != null) {
                            System.out.println(line3);

                            StringTokenizer st3 = new StringTokenizer(line3, ",");
                            int countTokens3 = 0;
                           // int c3 = 0;
                            while (st3.hasMoreTokens()) {
                                System.out.println(st3.nextToken());
                                countTokens3++;
                             //   c3 = c3 + countTokens3;
                            }
                            System.out.print("count:");
                            System.out.println(countTokens3);
                           //  System.out.print("sum of fourth file:");
                           // System.out.println(c3);
                        
                          finalcount=countTokens+ countTokens1 + countTokens2 + countTokens3 ;
                       // int finalsumcount= 0;
                       // finalsumcount= c+c1+c2+c3;  
                        }
                       System.out.print("Final total files elements count");
                        System.out.println(finalcount);
                     //  System.out.println("sum of finalcount");
                        //System.out.println(finalsumcount);
                    }
            }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (br != null) {
                    br.close();
                }
                else if(cr!=null){
                   cr.close();
               }
                else if(dr!=null){
                   dr.close();
               }
                else if(er!=null){
                    er.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

                }
            }
            