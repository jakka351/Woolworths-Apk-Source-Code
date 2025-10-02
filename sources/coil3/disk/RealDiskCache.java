package coil3.disk;

import coil3.disk.DiskCache;
import coil3.disk.DiskLruCache;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import okio.ByteString;
import okio.FileSystem;
import okio.Path;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcoil3/disk/RealDiskCache;", "Lcoil3/disk/DiskCache;", "RealSnapshot", "RealEditor", "Companion", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RealDiskCache implements DiskCache {

    /* renamed from: a, reason: collision with root package name */
    public final FileSystem f13087a;
    public final DiskLruCache b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcoil3/disk/RealDiskCache$Companion;", "", "", "ENTRY_METADATA", "I", "ENTRY_DATA", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/disk/RealDiskCache$RealEditor;", "Lcoil3/disk/DiskCache$Editor;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class RealEditor implements DiskCache.Editor {

        /* renamed from: a, reason: collision with root package name */
        public final DiskLruCache.Editor f13088a;

        public RealEditor(DiskLruCache.Editor editor) {
            this.f13088a = editor;
        }

        @Override // coil3.disk.DiskCache.Editor
        public final DiskCache.Snapshot a() {
            DiskLruCache.Snapshot snapshotC;
            DiskLruCache.Editor editor = this.f13088a;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache.k) {
                editor.a(true);
                snapshotC = diskLruCache.c(editor.f13085a.f13086a);
            }
            if (snapshotC != null) {
                return new RealSnapshot(snapshotC);
            }
            return null;
        }

        @Override // coil3.disk.DiskCache.Editor
        public final void abort() {
            this.f13088a.a(false);
        }

        @Override // coil3.disk.DiskCache.Editor
        public final Path getData() {
            return this.f13088a.b(1);
        }

        @Override // coil3.disk.DiskCache.Editor
        public final Path getMetadata() {
            return this.f13088a.b(0);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/disk/RealDiskCache$RealSnapshot;", "Lcoil3/disk/DiskCache$Snapshot;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class RealSnapshot implements DiskCache.Snapshot {
        public final DiskLruCache.Snapshot d;

        public RealSnapshot(DiskLruCache.Snapshot snapshot) {
            this.d = snapshot;
        }

        @Override // coil3.disk.DiskCache.Snapshot
        public final DiskCache.Editor I() {
            DiskLruCache.Editor editorB;
            DiskLruCache.Snapshot snapshot = this.d;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache.k) {
                snapshot.close();
                editorB = diskLruCache.b(snapshot.d.f13086a);
            }
            if (editorB != null) {
                return new RealEditor(editorB);
            }
            return null;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            this.d.close();
        }

        @Override // coil3.disk.DiskCache.Snapshot
        public final Path getData() {
            DiskLruCache.Snapshot snapshot = this.d;
            if (snapshot.e) {
                throw new IllegalStateException("snapshot is closed");
            }
            return (Path) snapshot.d.c.get(1);
        }

        @Override // coil3.disk.DiskCache.Snapshot
        public final Path getMetadata() {
            DiskLruCache.Snapshot snapshot = this.d;
            if (snapshot.e) {
                throw new IllegalStateException("snapshot is closed");
            }
            return (Path) snapshot.d.c.get(0);
        }
    }

    public RealDiskCache(long j, CoroutineDispatcher coroutineDispatcher, FileSystem fileSystem, Path path) {
        this.f13087a = fileSystem;
        this.b = new DiskLruCache(j, coroutineDispatcher, fileSystem, path);
    }

    @Override // coil3.disk.DiskCache
    public final DiskCache.Editor a(String str) {
        ByteString byteString = ByteString.g;
        DiskLruCache.Editor editorB = this.b.b(ByteString.Companion.b(str).b("SHA-256").d());
        if (editorB != null) {
            return new RealEditor(editorB);
        }
        return null;
    }

    @Override // coil3.disk.DiskCache
    public final DiskCache.Snapshot b(String str) {
        ByteString byteString = ByteString.g;
        DiskLruCache.Snapshot snapshotC = this.b.c(ByteString.Companion.b(str).b("SHA-256").d());
        if (snapshotC != null) {
            return new RealSnapshot(snapshotC);
        }
        return null;
    }

    @Override // coil3.disk.DiskCache
    /* renamed from: getFileSystem, reason: from getter */
    public final FileSystem getF13087a() {
        return this.f13087a;
    }
}
