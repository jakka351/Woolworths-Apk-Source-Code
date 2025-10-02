package okio;

import com.medallia.digital.mobilesdk.q2;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Path;
import okio.internal.FixedLengthSource;
import okio.internal.ZipEntry;
import okio.internal.ZipFilesKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokio/ZipFileSystem;", "Lokio/FileSystem;", "Companion", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class ZipFileSystem extends FileSystem {
    public static final Path j;
    public final Path g;
    public final FileSystem h;
    public final LinkedHashMap i;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/ZipFileSystem$Companion;", "", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        String str = Path.e;
        j = Path.Companion.a(q2.c, false);
    }

    public ZipFileSystem(Path path, FileSystem fileSystem, LinkedHashMap linkedHashMap) {
        Intrinsics.h(fileSystem, "fileSystem");
        this.g = path;
        this.h = fileSystem;
        this.i = linkedHashMap;
    }

    @Override // okio.FileSystem
    public final Sink a(Path file) throws IOException {
        Intrinsics.h(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public final void b(Path source, Path target) throws IOException {
        Intrinsics.h(source, "source");
        Intrinsics.h(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public final void d(Path dir) throws IOException {
        Intrinsics.h(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public final void e(Path path) throws IOException {
        Intrinsics.h(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public final List h(Path dir) throws IOException {
        Intrinsics.h(dir, "dir");
        List listX = x(dir, true);
        Intrinsics.e(listX);
        return listX;
    }

    @Override // okio.FileSystem
    public final List i(Path dir) {
        Intrinsics.h(dir, "dir");
        return x(dir, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0125  */
    @Override // okio.FileSystem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okio.FileMetadata k(okio.Path r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ZipFileSystem.k(okio.Path):okio.FileMetadata");
    }

    @Override // okio.FileSystem
    public final FileHandle l(Path path) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // okio.FileSystem
    public final FileHandle p(Path file) throws IOException {
        Intrinsics.h(file, "file");
        throw new IOException("zip entries are not writable");
    }

    @Override // okio.FileSystem
    public final Sink r(Path file, boolean z) throws IOException {
        Intrinsics.h(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public final Source v(Path file) throws Throwable {
        Throwable th;
        RealBufferedSource realBufferedSourceC;
        Intrinsics.h(file, "file");
        Path path = j;
        path.getClass();
        ZipEntry zipEntry = (ZipEntry) this.i.get(okio.internal.Path.b(path, file, true));
        if (zipEntry == null) {
            throw new FileNotFoundException("no such file: " + file);
        }
        long j2 = zipEntry.f;
        FileHandle fileHandleL = this.h.l(this.g);
        try {
            realBufferedSourceC = Okio.c(fileHandleL.g(zipEntry.h));
            try {
                fileHandleL.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (fileHandleL != null) {
                try {
                    fileHandleL.close();
                } catch (Throwable th4) {
                    ExceptionsKt.a(th3, th4);
                }
            }
            th = th3;
            realBufferedSourceC = null;
        }
        if (th != null) {
            throw th;
        }
        Intrinsics.h(realBufferedSourceC, "<this>");
        ZipFilesKt.f(realBufferedSourceC, null);
        if (zipEntry.g == 0) {
            return new FixedLengthSource(realBufferedSourceC, j2, true);
        }
        return new FixedLengthSource(new InflaterSource(Okio.c(new FixedLengthSource(realBufferedSourceC, zipEntry.e, true)), new Inflater(true)), j2, false);
    }

    public final List x(Path child, boolean z) throws IOException {
        Path path = j;
        path.getClass();
        Intrinsics.h(child, "child");
        ZipEntry zipEntry = (ZipEntry) this.i.get(okio.internal.Path.b(path, child, true));
        if (zipEntry != null) {
            return CollectionsKt.G0(zipEntry.q);
        }
        if (!z) {
            return null;
        }
        throw new IOException("not a directory: " + child);
    }
}
