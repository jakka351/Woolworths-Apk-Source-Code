package coil.disk;

import android.os.StatFs;
import coil.annotation.ExperimentalCoilApi;
import java.io.Closeable;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import okio.FileSystem;
import okio.JvmSystemFileSystem;
import okio.Path;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcoil/disk/DiskCache;", "", "Builder", "Editor", "Snapshot", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface DiskCache {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/disk/DiskCache$Builder;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public Path f12980a;
        public JvmSystemFileSystem b;
        public double c;
        public long d;
        public long e;
        public DefaultIoScheduler f;

        public final RealDiskCache a() {
            long jE;
            double d = this.c;
            Path path = this.f12980a;
            if (path == null) {
                throw new IllegalStateException("directory == null");
            }
            if (d > 0.0d) {
                try {
                    File file = path.toFile();
                    file.mkdir();
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    jE = RangesKt.e((long) (d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.d, this.e);
                } catch (Exception unused) {
                    jE = this.d;
                }
            } else {
                jE = 0;
            }
            return new RealDiskCache(jE, this.f, this.b, path);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcoil/disk/DiskCache$Editor;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @ExperimentalCoilApi
    public interface Editor {
        Snapshot a();

        void abort();

        Path getData();

        Path getMetadata();
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00060\u0001j\u0002`\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcoil/disk/DiskCache$Snapshot;", "Ljava/io/Closeable;", "Lokio/Closeable;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @ExperimentalCoilApi
    public interface Snapshot extends Closeable {
        Editor I();

        Path getData();

        Path getMetadata();
    }

    Editor a(String str);

    Snapshot b(String str);

    /* renamed from: getFileSystem */
    FileSystem getF12983a();
}
