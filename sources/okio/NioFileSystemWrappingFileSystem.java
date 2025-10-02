package okio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.StandardOpenOption;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/NioFileSystemWrappingFileSystem;", "Lokio/NioSystemFileSystem;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class NioFileSystemWrappingFileSystem extends NioSystemFileSystem {
    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public final Sink a(Path file) {
        Intrinsics.h(file, "file");
        ListBuilder listBuilderV = CollectionsKt.v();
        listBuilderV.add(StandardOpenOption.APPEND);
        listBuilderV.add(StandardOpenOption.CREATE);
        CollectionsKt.q(listBuilderV);
        file.d.y();
        throw null;
    }

    @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem, okio.FileSystem
    public final void b(Path source, Path target) throws IOException {
        Intrinsics.h(source, "source");
        Intrinsics.h(target, "target");
        try {
            source.d.y();
            throw null;
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // okio.FileSystem, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public final void d(Path dir) {
        Intrinsics.h(dir, "dir");
        k(dir);
        throw null;
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public final void e(Path path) throws InterruptedIOException {
        Intrinsics.h(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        path.d.y();
        throw null;
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public final List h(Path dir) {
        Intrinsics.h(dir, "dir");
        dir.d.y();
        throw null;
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public final List i(Path dir) {
        Intrinsics.h(dir, "dir");
        dir.d.y();
        throw null;
    }

    @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem, okio.FileSystem
    public final FileMetadata k(Path path) {
        Intrinsics.h(path, "path");
        path.d.y();
        throw null;
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public final FileHandle l(Path path) throws FileNotFoundException {
        try {
            path.d.y();
            throw null;
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public final FileHandle p(Path file) throws FileNotFoundException {
        Intrinsics.h(file, "file");
        ListBuilder listBuilderV = CollectionsKt.v();
        listBuilderV.add(StandardOpenOption.READ);
        listBuilderV.add(StandardOpenOption.WRITE);
        listBuilderV.add(StandardOpenOption.CREATE);
        CollectionsKt.q(listBuilderV);
        try {
            file.d.y();
            throw null;
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + file);
        }
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public final Sink r(Path file, boolean z) throws FileNotFoundException {
        Intrinsics.h(file, "file");
        ListBuilder listBuilderV = CollectionsKt.v();
        if (z) {
            listBuilderV.add(StandardOpenOption.CREATE_NEW);
        }
        CollectionsKt.q(listBuilderV);
        try {
            file.d.y();
            throw null;
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + file);
        }
    }

    @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem
    public final String toString() {
        throw null;
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public final Source v(Path file) throws FileNotFoundException {
        Intrinsics.h(file, "file");
        try {
            file.d.y();
            throw null;
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + file);
        }
    }
}
