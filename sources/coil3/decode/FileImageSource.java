package coil3.decode;

import coil3.decode.ImageSource;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.RealBufferedSource;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/decode/FileImageSource;", "Lcoil3/decode/ImageSource;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class FileImageSource implements ImageSource {
    public final Path d;
    public final FileSystem e;
    public final String f;
    public final AutoCloseable g;
    public final Object h = new Object();
    public boolean i;
    public RealBufferedSource j;

    public FileImageSource(Path path, FileSystem fileSystem, String str, AutoCloseable autoCloseable) {
        this.d = path;
        this.e = fileSystem;
        this.f = str;
        this.g = autoCloseable;
    }

    @Override // coil3.decode.ImageSource
    public final Path R0() {
        Path path;
        synchronized (this.h) {
            if (this.i) {
                throw new IllegalStateException("closed");
            }
            path = this.d;
        }
        return path;
    }

    @Override // coil3.decode.ImageSource
    public final BufferedSource U0() {
        synchronized (this.h) {
            if (this.i) {
                throw new IllegalStateException("closed");
            }
            RealBufferedSource realBufferedSource = this.j;
            if (realBufferedSource != null) {
                return realBufferedSource;
            }
            RealBufferedSource realBufferedSourceC = Okio.c(this.e.v(this.d));
            this.j = realBufferedSourceC;
            return realBufferedSourceC;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0016 A[Catch: all -> 0x0020, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0004, B:7:0x000a, B:8:0x000c, B:11:0x0011, B:12:0x0012, B:14:0x0016, B:15:0x0018, B:18:0x001d), top: B:26:0x0004, inners: #2, #3, #5, #4 }] */
    @Override // java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.h
            monitor-enter(r0)
            r1 = 1
            r3.i = r1     // Catch: java.lang.Throwable -> L20
            okio.RealBufferedSource r1 = r3.j     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L12
            kotlin.jvm.functions.Function1 r2 = coil3.util.UtilsKt.f13156a     // Catch: java.lang.Throwable -> L20
            r1.close()     // Catch: java.lang.RuntimeException -> L10 java.lang.Exception -> L12 java.lang.Throwable -> L20
            goto L12
        L10:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L20
        L12:
            java.lang.AutoCloseable r1 = r3.g     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L1e
            kotlin.jvm.functions.Function1 r2 = coil3.util.UtilsKt.f13156a     // Catch: java.lang.Throwable -> L20
            androidx.constraintlayout.core.state.a.w(r1)     // Catch: java.lang.RuntimeException -> L1c java.lang.Exception -> L1e java.lang.Throwable -> L20
            goto L1e
        L1c:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L20
        L1e:
            monitor-exit(r0)
            return
        L20:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.decode.FileImageSource.close():void");
    }

    @Override // coil3.decode.ImageSource
    /* renamed from: getFileSystem, reason: from getter */
    public final FileSystem getE() {
        return this.e;
    }

    @Override // coil3.decode.ImageSource
    public final ImageSource.Metadata getMetadata() {
        return null;
    }
}
