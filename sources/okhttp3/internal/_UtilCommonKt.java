package okhttp3.internal;

import androidx.camera.core.impl.b;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.internal.cache.DiskLruCache$fileSystem$1;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.FileSystem;
import okio.Options;
import okio.Path;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class _UtilCommonKt {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f26698a = new byte[0];
    public static final Options b;

    static {
        ByteString byteString = ByteString.g;
        b = Options.Companion.b(ByteString.Companion.a("efbbbf"), ByteString.Companion.a("feff"), ByteString.Companion.a("fffe0000"), ByteString.Companion.a("fffe"), ByteString.Companion.a("0000feff"));
    }

    public static final void a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sbT = b.t(j, "length=", ", offset=");
            sbT.append(j2);
            throw new ArrayIndexOutOfBoundsException(c.m(j2, ", count=", sbT));
        }
    }

    public static final void b(Closeable closeable) {
        Intrinsics.h(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final void c(FileSystem fileSystem, Path path) throws IOException {
        Intrinsics.h(fileSystem, "<this>");
        try {
            IOException iOException = null;
            for (Path path2 : fileSystem.h(path)) {
                try {
                    if (fileSystem.j(path2).b) {
                        c(fileSystem, path2);
                    }
                    fileSystem.e(path2);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final void d(DiskLruCache$fileSystem$1 diskLruCache$fileSystem$1, Path path) {
        Intrinsics.h(diskLruCache$fileSystem$1, "<this>");
        Intrinsics.h(path, "path");
        try {
            diskLruCache$fileSystem$1.e(path);
        } catch (FileNotFoundException unused) {
        }
    }

    public static final int e(int i, int i2, String str, String str2) {
        Intrinsics.h(str, "<this>");
        while (i < i2) {
            if (StringsKt.p(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int f(String str, char c, int i, int i2) {
        Intrinsics.h(str, "<this>");
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int g(String str, char c, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return f(str, c, i, i2);
    }

    public static final boolean h(String[] strArr, String[] strArr2, Comparator comparator) {
        Intrinsics.h(strArr, "<this>");
        Intrinsics.h(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator itA = ArrayIteratorKt.a(strArr2);
                while (itA.hasNext()) {
                    if (comparator.compare(str, (String) itA.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final int i(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Intrinsics.j(cCharAt, 31) <= 0 || Intrinsics.j(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int j(int i, int i2, String str) {
        Intrinsics.h(str, "<this>");
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int k(int i, int i2, String str) {
        Intrinsics.h(str, "<this>");
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final String[] l(String[] strArr, String[] other, Comparator comparator) {
        Intrinsics.h(strArr, "<this>");
        Intrinsics.h(other, "other");
        Intrinsics.h(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, other[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean m(String name) {
        Intrinsics.h(name, "name");
        return name.equalsIgnoreCase("Authorization") || name.equalsIgnoreCase("Cookie") || name.equalsIgnoreCase("Proxy-Authorization") || name.equalsIgnoreCase("Set-Cookie");
    }

    public static final int n(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    public static final int o(BufferedSource bufferedSource) {
        Intrinsics.h(bufferedSource, "<this>");
        return (bufferedSource.readByte() & 255) | ((bufferedSource.readByte() & 255) << 16) | ((bufferedSource.readByte() & 255) << 8);
    }

    public static final int p(Buffer buffer) {
        int i = 0;
        while (!buffer.X1() && buffer.e(0L) == 61) {
            i++;
            buffer.readByte();
        }
        return i;
    }

    public static final int q(int i, String str) throws NumberFormatException {
        if (str == null) {
            return i;
        }
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static final String r(int i, int i2, String str) {
        Intrinsics.h(str, "<this>");
        int iJ = j(i, i2, str);
        String strSubstring = str.substring(iJ, k(iJ, i2, str));
        Intrinsics.g(strSubstring, "substring(...)");
        return strSubstring;
    }
}
