package okhttp3;

import androidx.camera.core.impl.b;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import okhttp3.internal.Internal;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lokhttp3/ResponseBody;", "Ljava/io/Closeable;", "<init>", "()V", "BomAwareReader", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class ResponseBody implements Closeable {
    public static final Companion e = new Companion(0);
    public static final ResponseBody$Companion$asResponseBody$1 f;
    public BomAwareReader d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/ResponseBody$BomAwareReader;", "Ljava/io/Reader;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes8.dex */
    public static final class BomAwareReader extends Reader {
        public final BufferedSource d;
        public final Charset e;
        public boolean f;
        public InputStreamReader g;

        public BomAwareReader(BufferedSource source, Charset charset) {
            Intrinsics.h(source, "source");
            Intrinsics.h(charset, "charset");
            this.d = source;
            this.e = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.f = true;
            InputStreamReader inputStreamReader = this.g;
            if (inputStreamReader != null) {
                inputStreamReader.close();
            } else {
                this.d.close();
            }
        }

        @Override // java.io.Reader
        public final int read(char[] cbuf, int i, int i2) throws IOException {
            Intrinsics.h(cbuf, "cbuf");
            if (this.f) {
                throw new IOException("Stream closed");
            }
            InputStreamReader inputStreamReader = this.g;
            if (inputStreamReader == null) {
                BufferedSource bufferedSource = this.d;
                inputStreamReader = new InputStreamReader(bufferedSource.z2(), _UtilJvmKt.f(bufferedSource, this.e));
                this.g = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, i, i2);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/ResponseBody$Companion;", "", "<init>", "()V", "Lokhttp3/ResponseBody;", "EMPTY", "Lokhttp3/ResponseBody;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public static ResponseBody$Companion$asResponseBody$1 a(String string, MediaType mediaType) {
            Pair pairA = Internal.a(mediaType);
            Charset charset = (Charset) pairA.d;
            MediaType mediaType2 = (MediaType) pairA.e;
            Buffer buffer = new Buffer();
            Intrinsics.h(charset, "charset");
            int length = string.length();
            Intrinsics.h(string, "string");
            Intrinsics.h(charset, "charset");
            if (length < 0) {
                throw new IllegalArgumentException(b.i(length, 0, "endIndex < beginIndex: ", " < ").toString());
            }
            if (length > string.length()) {
                StringBuilder sbR = YU.a.r(length, "endIndex > string.length: ", " > ");
                sbR.append(string.length());
                throw new IllegalArgumentException(sbR.toString().toString());
            }
            if (charset.equals(Charsets.f24671a)) {
                buffer.r0(0, length, string);
            } else {
                String strSubstring = string.substring(0, length);
                Intrinsics.g(strSubstring, "substring(...)");
                byte[] bytes = strSubstring.getBytes(charset);
                Intrinsics.g(bytes, "getBytes(...)");
                buffer.write(bytes, 0, bytes.length);
            }
            return new ResponseBody$Companion$asResponseBody$1(mediaType2, buffer.e, buffer);
        }

        private Companion() {
        }
    }

    static {
        ByteString byteString = ByteString.g;
        Intrinsics.h(byteString, "<this>");
        Buffer buffer = new Buffer();
        buffer.T(byteString);
        f = new ResponseBody$Companion$asResponseBody$1(null, byteString.data.length, buffer);
    }

    public abstract BufferedSource U0();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v8 */
    public final byte[] a() throws IOException {
        long jB = getH();
        if (jB > 2147483647L) {
            throw new IOException(b.k(jB, "Cannot buffer entire body for content length: "));
        }
        BufferedSource bufferedSourceU0 = U0();
        byte[] th = null;
        try {
            byte[] bArrU0 = bufferedSourceU0.u0();
            try {
                bufferedSourceU0.close();
            } catch (Throwable th2) {
                th = th2;
            }
            th = th;
            th = bArrU0;
        } catch (Throwable th3) {
            th = th3;
            if (bufferedSourceU0 != null) {
                try {
                    bufferedSourceU0.close();
                } catch (Throwable th4) {
                    ExceptionsKt.a(th, th4);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int length = th.length;
        if (jB == -1 || jB == length) {
            return th;
        }
        throw new IOException("Content-Length (" + jB + ") and stream length (" + length + ") disagree");
    }

    /* renamed from: b */
    public abstract long getH();

    /* renamed from: c */
    public abstract MediaType getG();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        _UtilCommonKt.b(U0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013 A[Catch: all -> 0x0026, TryCatch #1 {all -> 0x0026, blocks: (B:3:0x0005, B:5:0x000b, B:8:0x0015, B:7:0x0013), top: B:24:0x0005 }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String d() {
        /*
            r5 = this;
            okio.BufferedSource r0 = r5.U0()
            r1 = 0
            okhttp3.MediaType r2 = r5.getG()     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L13
            okhttp3.MediaType$Companion r3 = okhttp3.MediaType.e     // Catch: java.lang.Throwable -> L26
            java.nio.charset.Charset r2 = r2.a(r1)     // Catch: java.lang.Throwable -> L26
            if (r2 != 0) goto L15
        L13:
            java.nio.charset.Charset r2 = kotlin.text.Charsets.f24671a     // Catch: java.lang.Throwable -> L26
        L15:
            java.nio.charset.Charset r2 = okhttp3.internal._UtilJvmKt.f(r0, r2)     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = r0.I0(r2)     // Catch: java.lang.Throwable -> L26
            r0.close()     // Catch: java.lang.Throwable -> L21
            goto L22
        L21:
            r1 = move-exception
        L22:
            r4 = r2
            r2 = r1
            r1 = r4
            goto L31
        L26:
            r2 = move-exception
            if (r0 == 0) goto L31
            r0.close()     // Catch: java.lang.Throwable -> L2d
            goto L31
        L2d:
            r0 = move-exception
            kotlin.ExceptionsKt.a(r2, r0)
        L31:
            if (r2 != 0) goto L34
            return r1
        L34:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.ResponseBody.d():java.lang.String");
    }
}
