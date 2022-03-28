import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        try {
            Handler fileHandler = new FileHandler("logfile.txt");
            fileHandler.setFormatter(new MyFormatter());
            logger.addHandler(fileHandler);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        logger.setUseParentHandlers(false);
        File dir0 = new File("Games");
        File dir1 = new File("Games/src");
        File dir2 = new File("Games/res");
        File dir3 = new File("Games/savegames");
        File dir4 = new File("Games/temp");
        if (dir0.mkdir()) {
            logger.info("Каталог /Games создан");
        }
        if (dir1.mkdir()) {
            logger.info("Каталог /src создан");
        } else logger.info("Каталог /src НЕ создан");
        if (dir2.mkdir()) {
            logger.info("Каталог /res создан");
        } else logger.info("Каталог /res НЕ создан");
        if (dir3.mkdir()) {
            logger.info("Каталог /savegames создан");
        } else logger.info("Каталог /savegames НЕ создан");
        if (dir4.mkdir()) {
            logger.info("Каталог /temp создан");
        } else logger.info("Каталог /temp НЕ создан");
        File dir5 = new File("Games/src/main");
        File dir6 = new File("Games/src/test");
        if (dir5.mkdir()) {
            logger.info("Каталог /main в каталоге Games/scr создан");
        } else logger.info("Каталог /main в каталоге Games/scr НЕ создан");
        if (dir6.mkdir()) {
            logger.info("Каталог /test в каталоге Games/scr создан");
        } else logger.info("Каталог /test в каталоге Games/scr НЕ создан");
        File file1 = new File("Games/src/main/Main.java");
        File file2 = new File("Games/src/main/Utils.java");
        try {
            if (file1.createNewFile()) {
                logger.info("Файл Main.java в каталоге /main создан");
            }
        } catch (IOException exc) {
            logger.info("Файл Main.java в каталоге /main НЕ создан");
        }
        try {
            if (file2.createNewFile()) {
                logger.info("Файл Utils.java в каталоге /main создан");
            }
        } catch (IOException exc) {
            logger.info("Файл Utils.java в каталоге /main НЕ создан");
        }
        File dir7 = new File("Games/res/drawables");
        File dir8 = new File("Games/res/vectors");
        File dir9 = new File("Games/res/icons");
        if (dir7.mkdir()) {
            logger.info("Каталог /drawables в каталоге Games/res создан");
        } else logger.info("Каталог /drawables в каталоге Games/res НЕ создан");
        if (dir8.mkdir()) {
            logger.info("Каталог /vectors в каталоге Games/res создан");
        } else logger.info("Каталог /vectors в каталоге Games/res НЕ создан");
        if (dir9.mkdir()) {
            logger.info("Каталог Games/icons в каталоге /res создан");
        } else logger.info("Каталог /icons в каталоге Games/res НЕ создан");
        File file3 = new File("Games/temp/temp.txt");
        try {
            if (file3.createNewFile()) {
                logger.info("Файл temp.txt в каталоге Games/temp создан");
            }
        } catch (IOException ex) {
            logger.info("Файл temp.txt в каталоге Games/temp НЕ создан");
        }
        try (FileReader reader = new FileReader("logfile.txt");
             FileWriter writer = new FileWriter("Games/temp/temp.txt")) {
            int i;
            while ((i = reader.read()) != -1){
                writer.write(i);
            }
            logger.info("Лог программы перезаписан в файл temp.txt");
        } catch (IOException ex) {
            logger.info("Не удалось перезаписать лог программы в файл temp.txt");
        }
    }
}