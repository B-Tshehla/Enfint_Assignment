import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.*;

class ConcatFilesTest {

    @Test
    void showFileNameWithLink(){
        String link ="*require 'Folder1/Folder2/File 2-1'*";
        assertEquals("2-1.txt",ConcatFiles.getRequiredFileName(link));
    }
    @Test
    void showAdditionOfDirectoriesWithArrayOfFiles(){
        File mainDir = new File("Folder1");
        ConcatFiles.getAllFiles(mainDir.listFiles());
        assertNotEquals(0,ConcatFiles.files.size());
    }
    @Test
    void ShowNullPointerException(){
        File mainDir = new File("Folder");
        assertThrows(NullPointerException.class,
                () -> ConcatFiles.getAllFiles(mainDir.listFiles()));
    }
    @Test
    void showIsDirectoryHasSubFilesAndSubDir(){
        File mainDir = new File("Folder");
        assertAll(
                () ->assertNull(mainDir.listFiles()),
                () ->assertFalse(mainDir.isDirectory())
        );
    }
    @Test
    void showGetRequiredFileByFileName(){
        String filename = "1-1.txt";
        File mainDir = new File("Folder1");
        ConcatFiles.getAllFiles(mainDir.listFiles());
        File file = new File("Folder1/1-1.txt");
        assertEquals(file,ConcatFiles.getRequiredFile(filename));
    }
    @Test
    void showReadingOfFilesToContentHash(){
        File mainDir = new File("Folder1");
        ConcatFiles.getAllFiles(mainDir.listFiles());
        ConcatFiles.readFiles();
        assertAll(
                () -> assertNotEquals(0,ConcatFiles.files.size()),
                () -> assertNotEquals(0,ConcatFiles.listDependents.size()),
                () -> assertNotEquals(0,ConcatFiles.content.size())
        );
    }
    @Test
    void showExceptionForNullOutputPath(){
        File mainDir = new File("Folder1");
        ConcatFiles.getAllFiles(mainDir.listFiles());
        ConcatFiles.readFiles();
        assertThrows(NullPointerException.class, () -> ConcatFiles.writeFile(null));
    }
    @Test
    void showExceptionsInMainForArguments(){
        String[] args = {null,null};
        String[] args1 = {"Folder",null};
        ConcatFiles.main(args);
        ConcatFiles.main(args1);
    }
    @Test
    void showNoExceptionCaughtOrThrowInMain(){
        String[] args = {"Folder1","output.txt"};
        ConcatFiles.main(args);
    }

}