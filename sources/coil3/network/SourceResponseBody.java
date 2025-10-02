package coil3.network;

import java.io.IOException;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.RealBufferedSink;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcoil3/network/SourceResponseBody;", "Lcoil3/network/NetworkResponseBody;", "source", "Lokio/BufferedSource;", "coil-network-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
@SourceDebugExtension
/* loaded from: classes.dex */
final class SourceResponseBody implements NetworkResponseBody {
    public final BufferedSource d;

    @Override // coil3.network.NetworkResponseBody
    public final void J0(FileSystem fileSystem, Path path) throws Throwable {
        Throwable th;
        BufferedSource bufferedSource = this.d;
        RealBufferedSink realBufferedSinkB = Okio.b(fileSystem.r(path, false));
        try {
            new Long(bufferedSource.t2(realBufferedSinkB));
            try {
                realBufferedSinkB.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            try {
                realBufferedSinkB.close();
            } catch (Throwable th4) {
                ExceptionsKt.a(th3, th4);
            }
            th = th3;
        }
        if (th != null) {
            throw th;
        }
    }

    @Override // coil3.network.NetworkResponseBody
    public final void L(Buffer buffer) {
        this.d.t2(buffer);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.close();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SourceResponseBody) {
            return Intrinsics.c(this.d, ((SourceResponseBody) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "SourceResponseBody(source=" + this.d + ')';
    }
}
