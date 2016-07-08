/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musiclist;

class gravarArq {
   
   PrintWriter gravarArq2 = new PrintWriter(arq2);
            int r = artista.size();
            for (int j = 0; j < r; j++) {
                    gravarArq2.printf(artista.get(j));
                    gravarArq2.printf("\r\n");
                }
                    gravarArq.close();
            }

	}
