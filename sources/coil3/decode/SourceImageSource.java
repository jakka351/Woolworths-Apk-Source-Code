package coil3.decode;

import coil3.decode.ImageSource;
import coil3.util.UtilsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Path;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/decode/SourceImageSource;", "Lcoil3/decode/ImageSource;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SourceImageSource implements ImageSource {
    public final FileSystem d;
    public final ImageSource.Metadata e;
    public final Object f = new Object();
    public boolean g;
    public final BufferedSource h;

    public SourceImageSource(BufferedSource bufferedSource, FileSystem fileSystem, ImageSource.Metadata metadata) {
        this.d = fileSystem;
        this.e = metadata;
        this.h = bufferedSource;
    }

    @Override // coil3.decode.ImageSource
    public final Path R0() {
        synchronized (this.f) {
            if (this.g) {
                throw new IllegalStateException("closed");
            }
        }
        return null;
    }

    @Override // coil3.decode.ImageSource
    public final BufferedSource U0() {
        BufferedSource bufferedSource;
        synchronized (this.f) {
            try {
                if (this.g) {
                    throw new IllegalStateException("closed");
                }
                bufferedSource = this.h;
                if (bufferedSource == null) {
                    FileSystem fileSystem = this.d;
                    Intrinsics.e(null);
                    fileSystem.v(null);
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bufferedSource;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f) {
            this.g = true;
            BufferedSource bufferedSource = this.h;
            if (bufferedSource != null) {
                Function1 function1 = UtilsKt.f13156a;
                try {
                    bufferedSource.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // coil3.decode.ImageSource
    /* renamed from: getFileSystem, reason: from getter */
    public final FileSystem getD() {
        return this.d;
    }

    @Override // coil3.decode.ImageSource
    /* renamed from: getMetadata, reason: from getter */
    public final ImageSource.Metadata getE() {
        return this.e;
    }
}
