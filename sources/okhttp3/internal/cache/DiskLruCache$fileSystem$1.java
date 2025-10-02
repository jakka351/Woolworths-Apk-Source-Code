package okhttp3.internal.cache;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.ForwardingFileSystem;
import okio.Path;
import okio.Sink;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okhttp3/internal/cache/DiskLruCache$fileSystem$1", "Lokio/ForwardingFileSystem;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DiskLruCache$fileSystem$1 extends ForwardingFileSystem {
    @Override // okio.ForwardingFileSystem, okio.FileSystem
    public final Sink r(Path file, boolean z) {
        Intrinsics.h(file, "file");
        Path pathC = file.c();
        if (pathC != null) {
            c(pathC);
        }
        return super.r(file, z);
    }
}
