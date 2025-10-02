package coil.disk;

import coil.disk.DiskCache;
import coil.disk.DiskLruCache;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import okio.ByteString;
import okio.FileSystem;
import okio.Path;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcoil/disk/RealDiskCache;", "Lcoil/disk/DiskCache;", "Companion", "RealEditor", "RealSnapshot", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RealDiskCache implements DiskCache {

    /* renamed from: a, reason: collision with root package name */
    public final FileSystem f12983a;
    public final DiskLruCache b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcoil/disk/RealDiskCache$Companion;", "", "", "ENTRY_DATA", "I", "ENTRY_METADATA", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/disk/RealDiskCache$RealEditor;", "Lcoil/disk/DiskCache$Editor;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class RealEditor implements DiskCache.Editor {

        /* renamed from: a, reason: collision with root package name */
        public final DiskLruCache.Editor f12984a;

        public RealEditor(DiskLruCache.Editor editor) {
            this.f12984a = editor;
        }

        @Override // coil.disk.DiskCache.Editor
        public final DiskCache.Snapshot a() {
            DiskLruCache.Snapshot snapshotC;
            DiskLruCache.Editor editor = this.f12984a;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                editor.a(true);
                snapshotC = diskLruCache.c(editor.f12981a.f12982a);
            }
            if (snapshotC != null) {
                return new RealSnapshot(snapshotC);
            }
            return null;
        }

        @Override // coil.disk.DiskCache.Editor
        public final void abort() {
            this.f12984a.a(false);
        }

        @Override // coil.disk.DiskCache.Editor
        public final Path getData() {
            return this.f12984a.b(1);
        }

        @Override // coil.disk.DiskCache.Editor
        public final Path getMetadata() {
            return this.f12984a.b(0);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/disk/RealDiskCache$RealSnapshot;", "Lcoil/disk/DiskCache$Snapshot;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class RealSnapshot implements DiskCache.Snapshot {
        public final DiskLruCache.Snapshot d;

        public RealSnapshot(DiskLruCache.Snapshot snapshot) {
            this.d = snapshot;
        }

        @Override // coil.disk.DiskCache.Snapshot
        public final DiskCache.Editor I() {
            DiskLruCache.Editor editorB;
            DiskLruCache.Snapshot snapshot = this.d;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                snapshot.close();
                editorB = diskLruCache.b(snapshot.d.f12982a);
            }
            if (editorB != null) {
                return new RealEditor(editorB);
            }
            return null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.d.close();
        }

        @Override // coil.disk.DiskCache.Snapshot
        public final Path getData() {
            DiskLruCache.Snapshot snapshot = this.d;
            if (snapshot.e) {
                throw new IllegalStateException("snapshot is closed");
            }
            return (Path) snapshot.d.c.get(1);
        }

        @Override // coil.disk.DiskCache.Snapshot
        public final Path getMetadata() {
            DiskLruCache.Snapshot snapshot = this.d;
            if (snapshot.e) {
                throw new IllegalStateException("snapshot is closed");
            }
            return (Path) snapshot.d.c.get(0);
        }
    }

    public RealDiskCache(long j, CoroutineDispatcher coroutineDispatcher, FileSystem fileSystem, Path path) {
        this.f12983a = fileSystem;
        this.b = new DiskLruCache(j, coroutineDispatcher, fileSystem, path);
    }

    @Override // coil.disk.DiskCache
    public final DiskCache.Editor a(String str) {
        ByteString byteString = ByteString.g;
        DiskLruCache.Editor editorB = this.b.b(ByteString.Companion.b(str).b("SHA-256").d());
        if (editorB != null) {
            return new RealEditor(editorB);
        }
        return null;
    }

    @Override // coil.disk.DiskCache
    public final DiskCache.Snapshot b(String str) {
        ByteString byteString = ByteString.g;
        DiskLruCache.Snapshot snapshotC = this.b.c(ByteString.Companion.b(str).b("SHA-256").d());
        if (snapshotC != null) {
            return new RealSnapshot(snapshotC);
        }
        return null;
    }

    @Override // coil.disk.DiskCache
    /* renamed from: getFileSystem, reason: from getter */
    public final FileSystem getF12983a() {
        return this.f12983a;
    }
}
