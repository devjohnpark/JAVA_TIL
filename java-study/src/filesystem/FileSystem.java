package filesystem;

public class FileSystem {
}


//import java.io;
//
//import java.nio.channels.FileChannel;
//import sun.nio.ch.FileChannelImpl;
//
//public class FileInputStream extends InputStream {
//    private final FileDescriptor fd;
//    private final String path;
//    private FileChannel channel;
//
//    public FileInputStream(String name) throws FileNotFoundException {
//        this(name != null ? new File(name) : null);
//    }
//
//    public FileInputStream(File file) throws FileNotFoundException {
//        String name = (file != null ? file.getPath() : null);
//        SecurityManager security = System.getSecurityManager();
//        if (security != null) {
//            security.checkRead(name);
//        }
//        if (name == null) {
//            throw new NullPointerException();
//        }
//        if (file.isInvalid()) {
//            throw new FileNotFoundException("Invalid file path");
//        }
//        fd = new FileDescriptor();
//        fd.attach(this);
//        path = name;
//        open(name);
//    }
//
//    private native void open(String name) throws FileNotFoundException;
//
//    // Other methods...
//}