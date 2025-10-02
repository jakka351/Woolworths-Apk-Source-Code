package coil3.network;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcoil3/network/ByteStringNetworkRequestBody;", "Lcoil3/network/NetworkRequestBody;", "bytes", "Lokio/ByteString;", "coil-network-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
/* loaded from: classes4.dex */
final class ByteStringNetworkRequestBody implements NetworkRequestBody {
    @Override // coil3.network.NetworkRequestBody
    public final void L(Buffer buffer) {
        buffer.T(null);
        throw null;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ByteStringNetworkRequestBody) && Intrinsics.c(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "ByteStringNetworkRequestBody(bytes=null)";
    }
}
