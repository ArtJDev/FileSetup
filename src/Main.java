import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.StreamHandler;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Handler streamHandler = new StreamHandler();
        streamHandler.setFormatter(new MyFormatter());
        logger.addHandler(streamHandler);
        logger.setUseParentHandlers(false);
        File dir1 = new File("D://Games/src");
        File dir2 = new File("D://Games/res");
        File dir3 = new File("D://Games/savegames");
        File dir4 = new File("D://Games/temp");
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
        File dir5 = new File("D://Games/src/main");
        File dir6 = new File("D://Games/src/test");
        if (dir5.mkdir()) {
            logger.info("Каталог /main в каталоге /scr создан");
        } else logger.info("Каталог /main в каталоге /scr НЕ создан");
        if (dir6.mkdir()) {
            logger.info("Каталог /test в каталоге /scr создан");
        } else logger.info("Каталог /test в каталоге /scr НЕ создан");
        File file1 = new File("D://Games/src/main", "Main.java");
        File file2 = new File("D://Games/src/main", "Utils.java");
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
        File dir7 = new File("D://Games/res/drawables");
        File dir8 = new File("D://Games/res/vectors");
        File dir9 = new File("D://Games/res/icons");
        if (dir7.mkdir()) {
            logger.info("Каталог /drawables в каталоге /res создан");
        } else logger.info("Каталог /drawables в каталоге /res НЕ создан");
        if (dir8.mkdir()) {
            logger.info("Каталог /vectors в каталоге /res создан");
        } else logger.info("Каталог /vectors в каталоге /res НЕ создан");
        if (dir9.mkdir()) {
            logger.info("Каталог /icons в каталоге /res создан");
        } else logger.info("Каталог /icons в каталоге /res НЕ создан");
        File file3 = new File("D://Games/temp", "temp.txt");
        try {
            if (file3.createNewFile()) {
                logger.info("Файл temp.txt в каталоге /temp создан");
            }
        } catch (IOException ex) {
            logger.info("Файл temp.txt в каталоге /temp НЕ создан");
        }
        try (FileWriter writer = new FileWriter("D://Games/temp/temp.txt")) {
//            writer.write();
            logger.info("Лог программы записан в файл temp.txt");
        } catch (IOException ex) {
            logger.info("Не удалось записать лог программы в файл temp.txt");
        }
    }
}
