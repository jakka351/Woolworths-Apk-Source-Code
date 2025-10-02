package okio;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/ForwardingFileSystem;", "Lokio/FileSystem;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class ForwardingFileSystem extends FileSystem {
    public final FileSystem g;

    public ForwardingFileSystem(FileSystem delegate) {
        Intrinsics.h(delegate, "delegate");
        this.g = delegate;
    }

    @Override // okio.FileSystem
    public final Sink a(Path file) {
        Intrinsics.h(file, "file");
        return this.g.a(file);
    }

    @Override // okio.FileSystem
    public final void b(Path source, Path target) {
        Intrinsics.h(source, "source");
        Intrinsics.h(target, "target");
        this.g.b(source, target);
    }

    @Override // okio.FileSystem, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.g.close();
    }

    @Override // okio.FileSystem
    public final void d(Path dir) {
        Intrinsics.h(dir, "dir");
        this.g.d(dir);
    }

    @Override // okio.FileSystem
    public final void e(Path path) {
        Intrinsics.h(path, "path");
        this.g.e(path);
    }

    @Override // okio.FileSystem
    public final List h(Path dir) {
        Intrinsics.h(dir, "dir");
        List<Path> listH = this.g.h(dir);
        ArrayList arrayList = new ArrayList();
        for (Path path : listH) {
            Intrinsics.h(path, "path");
            arrayList.add(path);
        }
        CollectionsKt.r0(arrayList);
        return arrayList;
    }

    @Override // okio.FileSystem
    public final List i(Path dir) {
        Intrinsics.h(dir, "dir");
        List<Path> listI = this.g.i(dir);
        if (listI == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Path path : listI) {
            Intrinsics.h(path, "path");
            arrayList.add(path);
        }
        CollectionsKt.r0(arrayList);
        return arrayList;
    }

    @Override // okio.FileSystem
    public final FileMetadata k(Path path) {
        Intrinsics.h(path, "path");
        FileMetadata fileMetadataK = this.g.k(path);
        if (fileMetadataK == null) {
            return null;
        }
        Path path2 = fileMetadataK.c;
        if (path2 == null) {
            return fileMetadataK;
        }
        boolean z = fileMetadataK.f26781a;
        boolean z2 = fileMetadataK.b;
        Long l = fileMetadataK.d;
        Long l2 = fileMetadataK.e;
        Long l3 = fileMetadataK.f;
        Long l4 = fileMetadataK.g;
        Map extras = fileMetadataK.h;
        Intrinsics.h(extras, "extras");
        return new FileMetadata(z, z2, path2, l, l2, l3, l4, extras);
    }

    @Override // okio.FileSystem
    public final FileHandle l(Path path) {
        return this.g.l(path);
    }

    @Override // okio.FileSystem
    public final FileHandle p(Path file) {
        Intrinsics.h(file, "file");
        return this.g.p(file);
    }

    @Override // okio.FileSystem
    public Sink r(Path file, boolean z) {
        Intrinsics.h(file, "file");
        return this.g.r(file, z);
    }

    public final String toString() {
        return Reflection.f24268a.b(getClass()).B() + '(' + this.g + ')';
    }

    @Override // okio.FileSystem
    public final Source v(Path file) {
        Intrinsics.h(file, "file");
        return this.g.v(file);
    }
}
