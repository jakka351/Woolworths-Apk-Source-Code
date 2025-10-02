package okio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/JvmSystemFileSystem;", "Lokio/FileSystem;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class JvmSystemFileSystem extends FileSystem {
    public static ArrayList x(Path path, boolean z) throws IOException {
        File file = path.toFile();
        String[] list = file.list();
        if (list == null) {
            if (!z) {
                return null;
            }
            if (file.exists()) {
                throw new IOException("failed to list " + path);
            }
            throw new FileNotFoundException("no such file: " + path);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            Intrinsics.e(str);
            arrayList.add(path.e(str));
        }
        CollectionsKt.r0(arrayList);
        return arrayList;
    }

    @Override // okio.FileSystem
    public Sink a(Path file) {
        Intrinsics.h(file, "file");
        return new OutputStreamSink(new FileOutputStream(file.toFile(), true), new Timeout());
    }

    @Override // okio.FileSystem
    public void b(Path source, Path target) throws IOException {
        Intrinsics.h(source, "source");
        Intrinsics.h(target, "target");
        if (source.toFile().renameTo(target.toFile())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    @Override // okio.FileSystem
    public void d(Path dir) throws IOException {
        Intrinsics.h(dir, "dir");
        if (dir.toFile().mkdir()) {
            return;
        }
        FileMetadata fileMetadataK = k(dir);
        if (fileMetadataK == null || !fileMetadataK.b) {
            throw new IOException("failed to create directory: " + dir);
        }
    }

    @Override // okio.FileSystem
    public void e(Path path) throws IOException {
        Intrinsics.h(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = path.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("failed to delete " + path);
    }

    @Override // okio.FileSystem
    public List h(Path dir) throws IOException {
        Intrinsics.h(dir, "dir");
        ArrayList arrayListX = x(dir, true);
        Intrinsics.e(arrayListX);
        return arrayListX;
    }

    @Override // okio.FileSystem
    public List i(Path dir) {
        Intrinsics.h(dir, "dir");
        return x(dir, false);
    }

    @Override // okio.FileSystem
    public FileMetadata k(Path path) {
        Intrinsics.h(path, "path");
        File file = path.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new FileMetadata(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
    }

    @Override // okio.FileSystem
    public FileHandle l(Path path) {
        return new JvmFileHandle(false, new RandomAccessFile(path.toFile(), "r"));
    }

    @Override // okio.FileSystem
    public FileHandle p(Path file) {
        Intrinsics.h(file, "file");
        return new JvmFileHandle(true, new RandomAccessFile(file.toFile(), "rw"));
    }

    @Override // okio.FileSystem
    public Sink r(Path file, boolean z) throws IOException {
        Intrinsics.h(file, "file");
        if (!z || !g(file)) {
            return new OutputStreamSink(new FileOutputStream(file.toFile(), false), new Timeout());
        }
        throw new IOException(file + " already exists.");
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // okio.FileSystem
    public Source v(Path file) {
        Intrinsics.h(file, "file");
        return Okio.g(file.toFile());
    }
}
