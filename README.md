# ESEMPIO PACKAGES

## ESEMPIO UTILIZZO CLASSI DELLA STANDAR LIBRARY

L'esempio prova.ProgramFileReader legge un file di testo utilizzando 
le librerie della standard library di Java. Quindi si fa l'import di `java.io.*` perchè devo utilizzare le classi `java.io.BufferedReader`, 
`java.io.FileReader`, `java.io.IOException`.

## ESEMPIO UTILIZZO LIBRERIA ESTERNA

Considero il problema di parsare un file in formato Excel. 

Scarico la libreria https://commons.apache.org/proper/commons-csv/

e la salvo in una directory `lib` all'interno del mio progetto.

Ora per far si che la libreria sia tra quelle utilizzate sia per compilare che in fase di esecuzione devo settare il `CLASSPATH`.

### CONFIGUARARE IL CLASSPATH






