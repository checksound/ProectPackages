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

Se eseguo la compilazione da prompt dei comandi:

`javac -d target  .\src\prova\FileExcelParser.java`

```

D:\PROGETTI\workspace\ProjectPackages>javac -d target  .\src\prova\FileExcelParser.java
.\src\prova\FileExcelParser.java:6: error: package org.apache.commons.csv does not exist
import org.apache.commons.csv.CSVFormat;
                             ^
.\src\prova\FileExcelParser.java:7: error: package org.apache.commons.csv does not exist
import org.apache.commons.csv.CSVParser;
                             ^
.\src\prova\FileExcelParser.java:8: error: package org.apache.commons.csv does not exist
import org.apache.commons.csv.CSVRecord;
                             ^
.\src\prova\FileExcelParser.java:14: error: cannot find symbol
                CSVParser parser;
                ^
  symbol:   class CSVParser
  location: class FileExcelParser
.\src\prova\FileExcelParser.java:16: error: cannot find symbol
                        parser = CSVParser.parse(csvData, CSVFormat.EXCEL);
                                                          ^
  symbol:   variable CSVFormat
  location: class FileExcelParser
.\src\prova\FileExcelParser.java:16: error: cannot find symbol
                        parser = CSVParser.parse(csvData, CSVFormat.EXCEL);
                                 ^
  symbol:   variable CSVParser
  location: class FileExcelParser
.\src\prova\FileExcelParser.java:17: error: cannot find symbol
                        for (CSVRecord csvRecord : parser) {
                             ^
  symbol:   class CSVRecord
  location: class FileExcelParser
7 errors

D:\PROGETTI\workspace\ProjectPackages>

```

aggiungendo l'opzione `-classpath` in cui do il percorso per la libreria, che serve affinché il codice sia compilato: 

```
D:\PROGETTI\workspace\ProjectPackages>javac -d target -classpath lib\* .\src\prova\FileExcelParser.java

D:\PROGETTI\workspace\ProjectPackages>

```

Ora compila correttamente: nella directory `target`-

Eseguendo dalla directory targer: `tree /f /a`

```
\---prova
        FileExcelParser.class
```

Ora anche per eseguire il programma devo settare correttamente il `classpath`:

```
D:\PROGETTI\workspace\ProjectPackages>java -classpath target prova.FileExcelParser
Exception in thread "main" java.lang.NoClassDefFoundError: org/apache/commons/csv/CSVFormat
        at prova.FileExcelParser.main(FileExcelParser.java:16)
Caused by: java.lang.ClassNotFoundException: org.apache.commons.csv.CSVFormat
        at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:583)
        at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:178)
        at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:521)
        ... 1 more

D:\PROGETTI\workspace\ProjectPackages>

```

Manca il path alla libreria `lib/commons-csv-1.6.jar`. 

```
D:\PROGETTI\workspace\ProjectPackages>java -classpath target;lib/* prova.FileExcelParser
CSVRecord [comment=null, mapping=null, recordNumber=1, values=[test/ORDINI_IN_ESSERE.xlsx]]
test/ORDINI_IN_ESSERE.xlsx
```










 






