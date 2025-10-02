package okhttp3.internal;

import androidx.compose.ui.platform.i;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.internal.http2.Header;
import okio.Buffer;
import okio.BufferedSource;
import okio.Source;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class _UtilJvmKt {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeZone f26699a;
    public static final String b;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Intrinsics.e(timeZone);
        f26699a = timeZone;
        b = StringsKt.N(StringsKt.L("okhttp3.", OkHttpClient.class.getName()), "Client");
    }

    public static final boolean a(HttpUrl httpUrl, HttpUrl other) {
        Intrinsics.h(httpUrl, "<this>");
        Intrinsics.h(other, "other");
        return Intrinsics.c(httpUrl.d, other.d) && httpUrl.e == other.e && Intrinsics.c(httpUrl.f26683a, other.f26683a);
    }

    public static final int b(long j, TimeUnit unit) {
        Intrinsics.h(unit, "unit");
        if (j < 0) {
            throw new IllegalStateException("timeout".concat(" < 0").toString());
        }
        long millis = unit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout".concat(" too large").toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout".concat(" too small").toString());
    }

    public static final void c(Socket socket) throws IOException {
        Intrinsics.h(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!Intrinsics.c(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final String d(String format, Object... objArr) {
        Intrinsics.h(format, "format");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final long e(Response response) {
        String strB = response.i.b("Content-Length");
        if (strB == null) {
            return -1L;
        }
        byte[] bArr = _UtilCommonKt.f26698a;
        try {
            return Long.parseLong(strB);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final Charset f(BufferedSource bufferedSource, Charset charset) {
        Intrinsics.h(bufferedSource, "<this>");
        Intrinsics.h(charset, "default");
        int iA2 = bufferedSource.A2(_UtilCommonKt.b);
        if (iA2 == -1) {
            return charset;
        }
        if (iA2 == 0) {
            return Charsets.f24671a;
        }
        if (iA2 == 1) {
            return Charsets.b;
        }
        if (iA2 == 2) {
            Charset charset2 = Charsets.f24671a;
            Charset charset3 = Charsets.e;
            if (charset3 != null) {
                return charset3;
            }
            Charset charsetForName = Charset.forName("UTF-32LE");
            Intrinsics.g(charsetForName, "forName(...)");
            Charsets.e = charsetForName;
            return charsetForName;
        }
        if (iA2 == 3) {
            return Charsets.c;
        }
        if (iA2 != 4) {
            throw new AssertionError();
        }
        Charset charset4 = Charsets.f24671a;
        Charset charset5 = Charsets.f;
        if (charset5 != null) {
            return charset5;
        }
        Charset charsetForName2 = Charset.forName("UTF-32BE");
        Intrinsics.g(charsetForName2, "forName(...)");
        Charsets.f = charsetForName2;
        return charsetForName2;
    }

    public static final boolean g(Source source, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Intrinsics.h(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jD = source.n().getF26784a() ? source.n().d() - jNanoTime : Long.MAX_VALUE;
        source.n().e(Math.min(jD, timeUnit.toNanos(i)) + jNanoTime);
        try {
            Buffer buffer = new Buffer();
            while (source.q2(buffer, 8192L) != -1) {
                buffer.a();
            }
            if (jD == Long.MAX_VALUE) {
                source.n().b();
                return true;
            }
            source.n().e(jNanoTime + jD);
            return true;
        } catch (InterruptedIOException unused) {
            if (jD == Long.MAX_VALUE) {
                source.n().b();
                return false;
            }
            source.n().e(jNanoTime + jD);
            return false;
        } catch (Throwable th) {
            if (jD == Long.MAX_VALUE) {
                source.n().b();
            } else {
                source.n().e(jNanoTime + jD);
            }
            throw th;
        }
    }

    public static final Headers h(List list) {
        Headers.Builder builder = new Headers.Builder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Header header = (Header) it.next();
            builder.c(header.f26736a.y(), header.b.y());
        }
        return builder.e();
    }

    public static final String i(HttpUrl httpUrl, boolean z) {
        Intrinsics.h(httpUrl, "<this>");
        int i = httpUrl.e;
        String strA = httpUrl.d;
        if (StringsKt.o(strA, ":", false)) {
            strA = i.a(']', "[", strA);
        }
        if (!z) {
            HttpUrl.Companion companion = HttpUrl.j;
            String str = httpUrl.f26683a;
            companion.getClass();
            if (i == HttpUrl.Companion.b(str)) {
                return strA;
            }
        }
        return strA + ':' + i;
    }

    public static final List j(List list) {
        Intrinsics.h(list, "<this>");
        if (list.isEmpty()) {
            return EmptyList.d;
        }
        if (list.size() == 1) {
            List listSingletonList = Collections.singletonList(list.get(0));
            Intrinsics.g(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        Object[] array = list.toArray();
        Intrinsics.g(array, "toArray(...)");
        List listUnmodifiableList = Collections.unmodifiableList(ArraysKt.f(array));
        Intrinsics.g(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }

    public static final List k(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return EmptyList.d;
        }
        if (objArr.length == 1) {
            List listSingletonList = Collections.singletonList(objArr[0]);
            Intrinsics.g(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        List listUnmodifiableList = Collections.unmodifiableList(ArraysKt.f((Object[]) objArr.clone()));
        Intrinsics.g(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }
}
