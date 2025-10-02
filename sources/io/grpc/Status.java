package io.grpc;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import com.google.common.base.Charsets;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import io.grpc.Metadata;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import javax.annotation.CheckReturnValue;
import javax.annotation.concurrent.Immutable;

@CheckReturnValue
@Immutable
/* loaded from: classes7.dex */
public final class Status {
    public static final List d;
    public static final Status e;
    public static final Status f;
    public static final Status g;
    public static final Status h;
    public static final Status i;
    public static final Status j;
    public static final Status k;
    public static final Status l;
    public static final Status m;
    public static final Status n;
    public static final Metadata.Key o;
    public static final Metadata.Key p;

    /* renamed from: a, reason: collision with root package name */
    public final Code f23971a;
    public final String b;
    public final Throwable c;

    public enum Code {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);

        public final int d;
        public final byte[] e;

        Code(int i) {
            this.d = i;
            this.e = Integer.toString(i).getBytes(Charsets.f14860a);
        }

        public final Status a() {
            return (Status) Status.d.get(this.d);
        }
    }

    public static final class StatusCodeMarshaller implements Metadata.TrustedAsciiMarshaller<Status> {
        @Override // io.grpc.Metadata.TrustedAsciiMarshaller
        public final byte[] a(Object obj) {
            return ((Status) obj).f23971a.e;
        }

        @Override // io.grpc.Metadata.TrustedAsciiMarshaller
        public final Object b(byte[] bArr) {
            int i;
            byte b;
            List list = Status.d;
            char c = 0;
            if (bArr.length == 1 && bArr[0] == 48) {
                return Status.e;
            }
            int length = bArr.length;
            if (length != 1) {
                if (length == 2 && (b = bArr[0]) >= 48 && b <= 57) {
                    i = (b - 48) * 10;
                    c = 1;
                }
                return Status.g.i("Unknown code ".concat(new String(bArr, Charsets.f14860a)));
            }
            i = 0;
            byte b2 = bArr[c];
            if (b2 >= 48 && b2 <= 57) {
                int i2 = (b2 - 48) + i;
                List list2 = Status.d;
                if (i2 < list2.size()) {
                    return (Status) list2.get(i2);
                }
            }
            return Status.g.i("Unknown code ".concat(new String(bArr, Charsets.f14860a)));
        }
    }

    public static final class StatusMessageMarshaller implements Metadata.TrustedAsciiMarshaller<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final byte[] f23972a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

        @Override // io.grpc.Metadata.TrustedAsciiMarshaller
        public final byte[] a(Object obj) {
            byte[] bytes = ((String) obj).getBytes(Charsets.b);
            int i = 0;
            while (i < bytes.length) {
                byte b = bytes[i];
                if (b < 32 || b >= 126 || b == 37) {
                    byte[] bArr = new byte[a.c(bytes.length, i, 3, i)];
                    if (i != 0) {
                        System.arraycopy(bytes, 0, bArr, 0, i);
                    }
                    int i2 = i;
                    while (i < bytes.length) {
                        byte b2 = bytes[i];
                        if (b2 < 32 || b2 >= 126 || b2 == 37) {
                            bArr[i2] = 37;
                            byte[] bArr2 = f23972a;
                            bArr[i2 + 1] = bArr2[(b2 >> 4) & 15];
                            bArr[i2 + 2] = bArr2[b2 & 15];
                            i2 += 3;
                        } else {
                            bArr[i2] = b2;
                            i2++;
                        }
                        i++;
                    }
                    return Arrays.copyOf(bArr, i2);
                }
                i++;
            }
            return bytes;
        }

        @Override // io.grpc.Metadata.TrustedAsciiMarshaller
        public final Object b(byte[] bArr) {
            for (int i = 0; i < bArr.length; i++) {
                byte b = bArr[i];
                if (b < 32 || b >= 126 || (b == 37 && i + 2 < bArr.length)) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length);
                    int i2 = 0;
                    while (i2 < bArr.length) {
                        if (bArr[i2] == 37 && i2 + 2 < bArr.length) {
                            try {
                                byteBufferAllocate.put((byte) Integer.parseInt(new String(bArr, i2 + 1, 2, Charsets.f14860a), 16));
                                i2 += 3;
                            } catch (NumberFormatException unused) {
                            }
                        }
                        byteBufferAllocate.put(bArr[i2]);
                        i2++;
                    }
                    return new String(byteBufferAllocate.array(), 0, byteBufferAllocate.position(), Charsets.b);
                }
            }
            return new String(bArr, 0);
        }
    }

    static {
        TreeMap treeMap = new TreeMap();
        for (Code code : Code.values()) {
            Status status = (Status) treeMap.put(Integer.valueOf(code.d), new Status(code, null, null));
            if (status != null) {
                throw new IllegalStateException("Code value duplication between " + status.f23971a.name() + " & " + code.name());
            }
        }
        d = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        e = Code.OK.a();
        f = Code.CANCELLED.a();
        g = Code.UNKNOWN.a();
        Code.INVALID_ARGUMENT.a();
        h = Code.DEADLINE_EXCEEDED.a();
        Code.NOT_FOUND.a();
        Code.ALREADY_EXISTS.a();
        i = Code.PERMISSION_DENIED.a();
        j = Code.UNAUTHENTICATED.a();
        k = Code.RESOURCE_EXHAUSTED.a();
        l = Code.FAILED_PRECONDITION.a();
        Code.ABORTED.a();
        Code.OUT_OF_RANGE.a();
        Code.UNIMPLEMENTED.a();
        m = Code.INTERNAL.a();
        n = Code.UNAVAILABLE.a();
        Code.DATA_LOSS.a();
        o = new Metadata.TrustedAsciiKey("grpc-status", false, new StatusCodeMarshaller());
        p = new Metadata.TrustedAsciiKey("grpc-message", false, new StatusMessageMarshaller());
    }

    public Status(Code code, String str, Throwable th) {
        Preconditions.j(code, "code");
        this.f23971a = code;
        this.b = str;
        this.c = th;
    }

    public static String c(Status status) {
        String str = status.b;
        Code code = status.f23971a;
        if (str == null) {
            return code.toString();
        }
        return code + ": " + status.b;
    }

    public static Status d(int i2) {
        if (i2 >= 0) {
            List list = d;
            if (i2 < list.size()) {
                return (Status) list.get(i2);
            }
        }
        return g.i("Unknown code " + i2);
    }

    public static Status e(Throwable th) {
        Preconditions.j(th, "t");
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            if (cause instanceof StatusException) {
                return ((StatusException) cause).d;
            }
            if (cause instanceof StatusRuntimeException) {
                return ((StatusRuntimeException) cause).d;
            }
        }
        return g.h(th);
    }

    public static Metadata g(Exception exc) {
        for (Exception cause = exc; cause != null; cause = cause.getCause()) {
            if (cause instanceof StatusException) {
                return null;
            }
            if (cause instanceof StatusRuntimeException) {
                return ((StatusRuntimeException) cause).e;
            }
        }
        return null;
    }

    public final StatusRuntimeException a() {
        return new StatusRuntimeException(null, this, true);
    }

    public final Status b(String str) {
        if (str == null) {
            return this;
        }
        Throwable th = this.c;
        Code code = this.f23971a;
        String str2 = this.b;
        return str2 == null ? new Status(code, str, th) : new Status(code, b.o(str2, "\n", str), th);
    }

    public final boolean f() {
        return Code.OK == this.f23971a;
    }

    public final Status h(Throwable th) {
        return Objects.a(this.c, th) ? this : new Status(this.f23971a, this.b, th);
    }

    public final Status i(String str) {
        return Objects.a(this.b, str) ? this : new Status(this.f23971a, str, this.c);
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(this.f23971a.name(), "code");
        toStringHelperB.c(this.b, lqlqqlq.mmm006Dm006Dm);
        Throwable th = this.c;
        Object string = th;
        if (th != null) {
            Object obj = Throwables.f14870a;
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            string = stringWriter.toString();
        }
        toStringHelperB.c(string, "cause");
        return toStringHelperB.toString();
    }
}
