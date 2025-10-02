package coil.decode;

import coil.decode.ImageSource;
import coil.util.Utils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.BufferedSource;
import okio.FileSystem;
import okio.JvmSystemFileSystem;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/decode/SourceImageSource;", "Lcoil/decode/ImageSource;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SourceImageSource extends ImageSource {
    public final ImageSource.Metadata d;
    public boolean e;
    public final BufferedSource f;

    public SourceImageSource(BufferedSource bufferedSource, Function0 function0, ImageSource.Metadata metadata) {
        this.d = metadata;
        this.f = bufferedSource;
    }

    @Override // coil.decode.ImageSource
    public final synchronized BufferedSource U0() {
        BufferedSource bufferedSource;
        try {
            if (this.e) {
                throw new IllegalStateException("closed");
            }
            bufferedSource = this.f;
            if (bufferedSource == null) {
                JvmSystemFileSystem jvmSystemFileSystem = FileSystem.d;
                Intrinsics.e(null);
                jvmSystemFileSystem.v(null);
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return bufferedSource;
    }

    @Override // coil.decode.ImageSource
    /* renamed from: a, reason: from getter */
    public final ImageSource.Metadata getD() {
        return this.d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.e = true;
        BufferedSource bufferedSource = this.f;
        if (bufferedSource != null) {
            Utils.a(bufferedSource);
        }
    }
}
