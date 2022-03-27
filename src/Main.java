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
            logger.info("������� /src ������");
        } else logger.info("������� /src �� ������");
        if (dir2.mkdir()) {
            logger.info("������� /res ������");
        } else logger.info("������� /res �� ������");
        if (dir3.mkdir()) {
            logger.info("������� /savegames ������");
        } else logger.info("������� /savegames �� ������");
        if (dir4.mkdir()) {
            logger.info("������� /temp ������");
        } else logger.info("������� /temp �� ������");
        File dir5 = new File("D://Games/src/main");
        File dir6 = new File("D://Games/src/test");
        if (dir5.mkdir()) {
            logger.info("������� /main � �������� /scr ������");
        } else logger.info("������� /main � �������� /scr �� ������");
        if (dir6.mkdir()) {
            logger.info("������� /test � �������� /scr ������");
        } else logger.info("������� /test � �������� /scr �� ������");
        File file1 = new File("D://Games/src/main", "Main.java");
        File file2 = new File("D://Games/src/main", "Utils.java");
        try {
            if (file1.createNewFile()) {
                logger.info("���� Main.java � �������� /main ������");
            }
        } catch (IOException exc) {
            logger.info("���� Main.java � �������� /main �� ������");
        }
        try {
            if (file2.createNewFile()) {
                logger.info("���� Utils.java � �������� /main ������");
            }
        } catch (IOException exc) {
            logger.info("���� Utils.java � �������� /main �� ������");
        }
        File dir7 = new File("D://Games/res/drawables");
        File dir8 = new File("D://Games/res/vectors");
        File dir9 = new File("D://Games/res/icons");
        if (dir7.mkdir()) {
            logger.info("������� /drawables � �������� /res ������");
        } else logger.info("������� /drawables � �������� /res �� ������");
        if (dir8.mkdir()) {
            logger.info("������� /vectors � �������� /res ������");
        } else logger.info("������� /vectors � �������� /res �� ������");
        if (dir9.mkdir()) {
            logger.info("������� /icons � �������� /res ������");
        } else logger.info("������� /icons � �������� /res �� ������");
        File file3 = new File("D://Games/temp", "temp.txt");
        try {
            if (file3.createNewFile()) {
                logger.info("���� temp.txt � �������� /temp ������");
            }
        } catch (IOException ex) {
            logger.info("���� temp.txt � �������� /temp �� ������");
        }
        try (FileWriter writer = new FileWriter("D://Games/temp/temp.txt")) {
//            writer.write();
            logger.info("��� ��������� ������� � ���� temp.txt");
        } catch (IOException ex) {
            logger.info("�� ������� �������� ��� ��������� � ���� temp.txt");
        }
    }
}
