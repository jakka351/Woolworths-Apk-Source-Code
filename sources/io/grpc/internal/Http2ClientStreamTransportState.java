package io.grpc.internal;

import com.google.common.base.Charsets;
import io.grpc.InternalMetadata;
import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.internal.AbstractClientStream;
import java.nio.charset.Charset;
import java.util.Locale;

/* loaded from: classes7.dex */
public abstract class Http2ClientStreamTransportState extends AbstractClientStream.TransportState {
    public static final InternalMetadata.TrustedAsciiMarshaller u = null;
    public static final Metadata.Key v = InternalMetadata.a(":status", new AnonymousClass1());
    public Status q;
    public Metadata r;
    public Charset s;
    public boolean t;

    /* renamed from: io.grpc.internal.Http2ClientStreamTransportState$1, reason: invalid class name */
    public class AnonymousClass1 implements InternalMetadata.TrustedAsciiMarshaller<Integer> {
        @Override // io.grpc.Metadata.TrustedAsciiMarshaller
        public final byte[] a(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // io.grpc.Metadata.TrustedAsciiMarshaller
        public final Object b(byte[] bArr) {
            if (bArr.length < 3) {
                throw new NumberFormatException("Malformed status code ".concat(new String(bArr, InternalMetadata.f23947a)));
            }
            return Integer.valueOf((bArr[2] - 48) + android.support.v4.media.session.a.c(bArr[1], 48, 10, (bArr[0] - 48) * 100));
        }
    }

    public static Charset m(Metadata metadata) {
        String str = (String) metadata.c(GrpcUtil.i);
        if (str != null) {
            try {
                return Charset.forName(str.split("charset=", 2)[r2.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return Charsets.b;
    }

    public static Status n(Metadata metadata) {
        char cCharAt;
        Integer num = (Integer) metadata.c(v);
        if (num == null) {
            return Status.m.i("Missing HTTP status code");
        }
        String str = (String) metadata.c(GrpcUtil.i);
        if (str != null && 16 <= str.length()) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.startsWith("application/grpc") && (lowerCase.length() == 16 || (cCharAt = lowerCase.charAt(16)) == '+' || cCharAt == ';')) {
                return null;
            }
        }
        return GrpcUtil.g(num.intValue()).b("invalid content-type: " + str);
    }
}
