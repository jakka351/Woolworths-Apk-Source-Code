package coil.decode;

import coil.decode.ImageSource;
import coil.util.Utils;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.RealBufferedSource;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/decode/FileImageSource;", "Lcoil/decode/ImageSource;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class FileImageSource extends ImageSource {
    public final Path d;
    public final FileSystem e;
    public final String f;
    public final Closeable g;
    public boolean h;
    public RealBufferedSource i;

    public FileImageSource(Path path, FileSystem fileSystem, String str, Closeable closeable) {
        this.d = path;
        this.e = fileSystem;
        this.f = str;
        this.g = closeable;
    }

    @Override // coil.decode.ImageSource
    public final synchronized BufferedSource U0() {
        if (this.h) {
            throw new IllegalStateException("closed");
        }
        RealBufferedSource realBufferedSource = this.i;
        if (realBufferedSource != null) {
            return realBufferedSource;
        }
        RealBufferedSource realBufferedSourceC = Okio.c(this.e.v(this.d));
        this.i = realBufferedSourceC;
        return realBufferedSourceC;
    }

    @Override // coil.decode.ImageSource
    /* renamed from: a */
    public final ImageSource.Metadata getD() {
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.h = true;
            RealBufferedSource realBufferedSource = this.i;
            if (realBufferedSource != null) {
                Utils.a(realBufferedSource);
            }
            Closeable closeable = this.g;
            if (closeable != null) {
                Utils.a(closeable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
