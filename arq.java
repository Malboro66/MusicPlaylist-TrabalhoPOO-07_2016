/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musiclist;

class arq {
   
   PrintWriter gravarArq = new PrintWriter(arq);
            int r = musica.size();
            for (int j = 0; j < r; j++) {
                    gravarArq.printf(musica.get(j));
                    gravarArq.printf("\r\n");
                }
                    gravarArq.close();
            }
}
