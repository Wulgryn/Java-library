package Wulgryn.IO;

import java.io.File;
import java.io.FileFilter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class DirectoryManager {
    
    public static void Create(String path)
    {
        try {
            Files.createDirectories(Path.of(path));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Delete(String path)
    {
        try {
            Files.delete(Path.of(path));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Delete(String path,boolean recursive)
    {
        try {
            if(recursive)
            {   
                File[] files = GetFiles(path);
                File[] dirs = GetDirectories(path);

                for(File f : files)
                {
                    FileManager.Delete(f.getAbsolutePath());
                }
                for (File f : dirs) {
                    Delete(f.getAbsolutePath(), true);
                }
            }
            Delete(path);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static File[] GetFiles(String path)
    {
        try {
            return new File(path).listFiles(File::isFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static File[] GetDirectories(String path)
    {
        try {
            return new File(path).listFiles(File::isDirectory);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static File[] GetFiles(String path,String extension)
    {
        try {
            FileFilter filter = file -> file.getName().endsWith("." + extension);
            return new File(path).listFiles(filter);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static int GetDirectoryCount(String path)
    {
        try {
            return new File(path).listFiles(File::isDirectory).length;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static int GetFileCount(String path)
    {
        try {
            return new File(path).listFiles(File::isFile).length;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static int GetFileCount(String path,String extension)
    {
        try {
            FileFilter filter = file -> file.getName().endsWith("." + extension);
            return new File(path).listFiles(filter).length;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static int GetAllCount(String path)
    {
        return GetAllFiles(path).size();
    }

    public static List<File> GetAllFiles(String path)
    {
        List<File> list = new ArrayList<>();

        File[] dirs = GetDirectories(path);

        for (File file : dirs) {
            for (File file2 : GetAllFiles(file.getAbsolutePath())) {
                if(!list.contains(file2)) list.add(file2);
            }
            for (File file2 : GetFiles(file.getAbsolutePath())) {
                if(!list.contains(file2)) list.add(file2);
            }
        }

        for (File file : GetFiles(path)) {
            if(!list.contains(file)) list.add(file);
        }
        return list;
    }

    public static File GetFile(String path)
    {
        return new File(path);
    }
}
