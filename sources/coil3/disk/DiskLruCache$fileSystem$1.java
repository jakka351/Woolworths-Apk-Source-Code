package coil3.disk;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.ForwardingFileSystem;
import okio.Path;
import okio.Sink;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"coil3/disk/DiskLruCache$fileSystem$1", "Lokio/ForwardingFileSystem;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class DiskLruCache$fileSystem$1 extends ForwardingFileSystem {
    @Override // okio.ForwardingFileSystem, okio.FileSystem
    public final Sink r(Path path, boolean z) {
        Path pathC = path.c();
        if (pathC != null) {
            c(pathC);
        }
        return super.r(path, z);
    }
}
