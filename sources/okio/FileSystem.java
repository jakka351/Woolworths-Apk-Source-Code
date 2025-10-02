package okio;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Path;
import okio.internal.ResourceFileSystem;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lokio/FileSystem;", "Ljava/io/Closeable;", "Lokio/Closeable;", "Companion", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class FileSystem implements Closeable {
    public static final JvmSystemFileSystem d;
    public static final Path e;
    public static final ResourceFileSystem f;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Lokio/FileSystem$Companion;", "", "Lokio/FileSystem;", "SYSTEM", "Lokio/FileSystem;", "Lokio/Path;", "SYSTEM_TEMPORARY_DIRECTORY", "Lokio/Path;", "RESOURCES", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        JvmSystemFileSystem jvmSystemFileSystem;
        try {
            Class.forName("java.nio.file.Files");
            jvmSystemFileSystem = new NioSystemFileSystem();
        } catch (ClassNotFoundException unused) {
            jvmSystemFileSystem = new JvmSystemFileSystem();
        }
        d = jvmSystemFileSystem;
        String str = Path.e;
        String property = System.getProperty("java.io.tmpdir");
        Intrinsics.g(property, "getProperty(...)");
        e = Path.Companion.a(property, false);
        ClassLoader classLoader = ResourceFileSystem.class.getClassLoader();
        Intrinsics.g(classLoader, "getClassLoader(...)");
        f = new ResourceFileSystem(classLoader);
    }

    public abstract Sink a(Path path);

    public abstract void b(Path path, Path path2);

    public final void c(Path path) {
        ArrayDeque arrayDeque = new ArrayDeque();
        while (path != null && !g(path)) {
            arrayDeque.addFirst(path);
            path = path.c();
        }
        Iterator<E> it = arrayDeque.iterator();
        while (it.hasNext()) {
            d((Path) it.next());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public abstract void d(Path path);

    public abstract void e(Path path);

    public final void f(Path path) {
        Intrinsics.h(path, "path");
        e(path);
    }

    public final boolean g(Path path) {
        Intrinsics.h(path, "path");
        return k(path) != null;
    }

    public abstract List h(Path path);

    public abstract List i(Path path);

    public final FileMetadata j(Path path) throws FileNotFoundException {
        Intrinsics.h(path, "path");
        FileMetadata fileMetadataK = k(path);
        if (fileMetadataK != null) {
            return fileMetadataK;
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    public abstract FileMetadata k(Path path);

    public abstract FileHandle l(Path path);

    public abstract FileHandle p(Path path);

    public abstract Sink r(Path path, boolean z);

    public abstract Source v(Path path);
}
