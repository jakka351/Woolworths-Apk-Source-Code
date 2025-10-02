package io.grpc;

import com.google.common.io.BaseEncoding;
import io.grpc.Metadata;
import java.nio.charset.Charset;
import java.util.BitSet;

@Internal
/* loaded from: classes7.dex */
public final class InternalMetadata {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f23947a = Charset.forName("US-ASCII");
    public static final BaseEncoding b = Metadata.e;

    @Internal
    public interface TrustedAsciiMarshaller<T> extends Metadata.TrustedAsciiMarshaller<T> {
    }

    public static Metadata.Key a(String str, TrustedAsciiMarshaller trustedAsciiMarshaller) {
        boolean z = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        BitSet bitSet = Metadata.Key.d;
        return new Metadata.TrustedAsciiKey(str, z, trustedAsciiMarshaller);
    }
}
