package okio.internal;

import com.medallia.digital.mobilesdk.q2;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okio"}, k = 2, mv = {2, 1, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* renamed from: okio.internal.-Path, reason: invalid class name */
/* loaded from: classes.dex */
public final class Path {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteString f26787a;
    public static final ByteString b;
    public static final ByteString c;
    public static final ByteString d;
    public static final ByteString e;

    static {
        ByteString byteString = ByteString.g;
        f26787a = ByteString.Companion.b(q2.c);
        b = ByteString.Companion.b("\\");
        c = ByteString.Companion.b("/\\");
        d = ByteString.Companion.b(".");
        e = ByteString.Companion.b("..");
    }

    public static final int a(okio.Path path) {
        ByteString byteString = path.d;
        if (byteString.c() != 0) {
            if (byteString.m(0) != 47) {
                if (byteString.m(0) == 92) {
                    if (byteString.c() > 2 && byteString.m(1) == 92) {
                        ByteString other = b;
                        Intrinsics.h(other, "other");
                        int iE = byteString.e(2, other.getData());
                        return iE == -1 ? byteString.c() : iE;
                    }
                } else if (byteString.c() > 2 && byteString.m(1) == 58 && byteString.m(2) == 92) {
                    char cM = (char) byteString.m(0);
                    if ('a' <= cM && cM < '{') {
                        return 3;
                    }
                    if ('A' <= cM && cM < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final okio.Path b(okio.Path path, okio.Path child, boolean z) {
        Intrinsics.h(child, "child");
        if (a(child) != -1 || child.l() != null) {
            return child;
        }
        ByteString byteStringC = c(path);
        if (byteStringC == null && (byteStringC = c(child)) == null) {
            byteStringC = f(okio.Path.e);
        }
        Buffer buffer = new Buffer();
        buffer.T(path.d);
        if (buffer.e > 0) {
            buffer.T(byteStringC);
        }
        buffer.T(child.d);
        return d(buffer, z);
    }

    public static final ByteString c(okio.Path path) {
        ByteString byteString = path.d;
        ByteString byteString2 = f26787a;
        if (ByteString.f(byteString, byteString2) != -1) {
            return byteString2;
        }
        ByteString byteString3 = path.d;
        ByteString byteString4 = b;
        if (ByteString.f(byteString3, byteString4) != -1) {
            return byteString4;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011b A[EDGE_INSN: B:101:0x011b->B:84:0x011b BREAK  A[LOOP:1: B:53:0x00ab->B:116:0x00ab], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final okio.Path d(okio.Buffer r17, boolean r18) throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.Path.d(okio.Buffer, boolean):okio.Path");
    }

    public static final ByteString e(byte b2) {
        if (b2 == 47) {
            return f26787a;
        }
        if (b2 == 92) {
            return b;
        }
        throw new IllegalArgumentException(YU.a.d(b2, "not a directory separator: "));
    }

    public static final ByteString f(String str) {
        if (Intrinsics.c(str, q2.c)) {
            return f26787a;
        }
        if (Intrinsics.c(str, "\\")) {
            return b;
        }
        throw new IllegalArgumentException(YU.a.A("not a directory separator: ", str));
    }
}
