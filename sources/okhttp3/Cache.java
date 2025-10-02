package okhttp3;

import androidx.lifecycle.d;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import me.oriient.internal.infra.rest.RequestBuilder;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.TlsVersion;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.platform.Platform;
import okio.Base64;
import okio.Buffer;
import okio.Buffer$inputStream$1;
import okio.BufferedSource;
import okio.ByteString;
import okio.FileSystem;
import okio.ForwardingSink;
import okio.ForwardingSource;
import okio.JvmSystemFileSystem;
import okio.Okio;
import okio.Path;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Sink;
import okio.Source;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/Cache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "RealCacheRequest", "Entry", "CacheResponseBody", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Cache implements Closeable, Flushable {
    public static final Companion e = new Companion(0);
    public final DiskLruCache d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/Cache$CacheResponseBody;", "Lokhttp3/ResponseBody;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class CacheResponseBody extends ResponseBody {
        public final DiskLruCache.Snapshot g;
        public final String h;
        public final String i;
        public final RealBufferedSource j;

        public CacheResponseBody(DiskLruCache.Snapshot snapshot, String str, String str2) {
            this.g = snapshot;
            this.h = str;
            this.i = str2;
            this.j = Okio.c(new ForwardingSource(snapshot.b(1)) { // from class: okhttp3.Cache.CacheResponseBody.1
                @Override // okio.ForwardingSource, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    this.g.close();
                    super.close();
                }
            });
        }

        @Override // okhttp3.ResponseBody
        public final BufferedSource U0() {
            return this.j;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: b */
        public final long getH() {
            String str = this.i;
            if (str == null) {
                return -1L;
            }
            byte[] bArr = _UtilCommonKt.f26698a;
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: c */
        public final MediaType getG() {
            String str = this.h;
            if (str == null) {
                return null;
            }
            MediaType.e.getClass();
            try {
                return MediaType.Companion.a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: e, reason: from getter */
        public final DiskLruCache.Snapshot getG() {
            return this.g;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lokhttp3/Cache$Companion;", "", "<init>", "()V", "", "VERSION", "I", "ENTRY_METADATA", "ENTRY_BODY", "ENTRY_COUNT", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public static String a(HttpUrl url) {
            Intrinsics.h(url, "url");
            ByteString byteString = ByteString.g;
            return ByteString.Companion.b(url.i).b("MD5").d();
        }

        public static int b(RealBufferedSource realBufferedSource) throws IOException {
            byte bE;
            try {
                Buffer buffer = realBufferedSource.e;
                realBufferedSource.I1(1L);
                long j = 0;
                while (true) {
                    long j2 = j + 1;
                    if (!realBufferedSource.request(j2)) {
                        break;
                    }
                    bE = buffer.e(j);
                    if ((bE < 48 || bE > 57) && (j != 0 || bE != 45)) {
                        break;
                    }
                    j = j2;
                }
                if (j == 0) {
                    CharsKt.b(16);
                    String string = Integer.toString(bE, 16);
                    Intrinsics.g(string, "toString(...)");
                    throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(string));
                }
                long jK = buffer.k();
                String strN1 = realBufferedSource.n1(Long.MAX_VALUE);
                if (jK >= 0 && jK <= 2147483647L && strN1.length() <= 0) {
                    return (int) jK;
                }
                throw new IOException("expected an int but was \"" + jK + strN1 + '\"');
            } catch (NumberFormatException e) {
                throw new IOException(e.getMessage());
            }
        }

        public static Set c(Headers headers) {
            int size = headers.size();
            TreeSet treeSet = null;
            for (int i = 0; i < size; i++) {
                if ("Vary".equalsIgnoreCase(headers.d(i))) {
                    String strI = headers.i(i);
                    if (treeSet == null) {
                        StringsKt.z();
                        treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                    }
                    Iterator it = StringsKt.U(strI, new char[]{','}).iterator();
                    while (it.hasNext()) {
                        treeSet.add(StringsKt.k0((String) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? EmptySet.d : treeSet;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/Cache$RealCacheRequest;", "Lokhttp3/internal/cache/CacheRequest;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public final class RealCacheRequest implements CacheRequest {

        /* renamed from: a, reason: collision with root package name */
        public final DiskLruCache.Editor f26663a;
        public final Sink b;
        public final AnonymousClass1 c;
        public boolean d;

        /* JADX WARN: Type inference failed for: r0v1, types: [okhttp3.Cache$RealCacheRequest$1] */
        public RealCacheRequest(DiskLruCache.Editor editor) {
            this.f26663a = editor;
            Sink sinkF = editor.f(1);
            this.b = sinkF;
            this.c = new ForwardingSink(sinkF) { // from class: okhttp3.Cache.RealCacheRequest.1
                @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    Cache cache = cache;
                    RealCacheRequest realCacheRequest = this;
                    synchronized (cache) {
                        if (realCacheRequest.d) {
                            return;
                        }
                        realCacheRequest.d = true;
                        super.close();
                        this.f26663a.b();
                    }
                }
            };
        }

        @Override // okhttp3.internal.cache.CacheRequest
        /* renamed from: a, reason: from getter */
        public final AnonymousClass1 getC() {
            return this.c;
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public final void abort() {
            synchronized (Cache.this) {
                if (this.d) {
                    return;
                }
                this.d = true;
                _UtilCommonKt.b(this.b);
                try {
                    this.f26663a.a();
                } catch (IOException unused) {
                }
            }
        }
    }

    public Cache(File file) {
        JvmSystemFileSystem fileSystem = FileSystem.d;
        String str = Path.e;
        Path pathB = Path.Companion.b(file);
        Intrinsics.h(fileSystem, "fileSystem");
        TaskRunner taskRunner = TaskRunner.o;
        Intrinsics.h(taskRunner, "taskRunner");
        this.d = new DiskLruCache(fileSystem, pathB, taskRunner);
    }

    public static void d(Response cached, Response response) throws Throwable {
        DiskLruCache.Editor editorA;
        Intrinsics.h(cached, "cached");
        Entry entry = new Entry(response);
        ResponseBody responseBody = cached.j;
        Intrinsics.f(responseBody, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        try {
            editorA = ((CacheResponseBody) responseBody).getG().a();
            if (editorA == null) {
                return;
            }
            try {
                entry.e(editorA);
                editorA.b();
            } catch (IOException unused) {
                if (editorA != null) {
                    try {
                        editorA.a();
                    } catch (IOException unused2) {
                    }
                }
            }
        } catch (IOException unused3) {
            editorA = null;
        }
    }

    public final void a() {
        DiskLruCache diskLruCache = this.d;
        synchronized (diskLruCache) {
            try {
                diskLruCache.e();
                Collection collectionValues = diskLruCache.l.values();
                Intrinsics.g(collectionValues, "<get-values>(...)");
                for (DiskLruCache.Entry entry : (DiskLruCache.Entry[]) collectionValues.toArray(new DiskLruCache.Entry[0])) {
                    Intrinsics.e(entry);
                    diskLruCache.k(entry);
                }
                diskLruCache.r = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Response b(Request request) {
        HttpUrl httpUrl = request.f26690a;
        e.getClass();
        try {
            DiskLruCache.Snapshot snapshotD = this.d.d(Companion.a(httpUrl));
            if (snapshotD != null) {
                try {
                    Entry entry = new Entry(snapshotD.b(0));
                    Response responseC = entry.c(snapshotD);
                    if (entry.a(request, responseC)) {
                        return responseC;
                    }
                    _UtilCommonKt.b(responseC.j);
                    return null;
                } catch (IOException unused) {
                    _UtilCommonKt.b(snapshotD);
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    public final CacheRequest c(Response response) throws Throwable {
        DiskLruCache.Editor editorC;
        Request request = response.d;
        String str = request.b;
        if (!HttpMethod.a(str)) {
            if (str.equals("GET")) {
                e.getClass();
                if (!Companion.c(response.i).contains("*")) {
                    Entry entry = new Entry(response);
                    try {
                        editorC = this.d.c(DiskLruCache.B, Companion.a(request.f26690a));
                        if (editorC != null) {
                            try {
                                entry.e(editorC);
                                return new RealCacheRequest(editorC);
                            } catch (IOException unused) {
                                if (editorC != null) {
                                    editorC.a();
                                }
                                return null;
                            }
                        }
                    } catch (IOException unused2) {
                        editorC = null;
                    }
                }
            }
            return null;
        }
        DiskLruCache diskLruCache = this.d;
        Companion companion = e;
        HttpUrl httpUrl = request.f26690a;
        companion.getClass();
        String key = Companion.a(httpUrl);
        synchronized (diskLruCache) {
            Intrinsics.h(key, "key");
            diskLruCache.e();
            diskLruCache.a();
            DiskLruCache.p(key);
            DiskLruCache.Entry entry2 = (DiskLruCache.Entry) diskLruCache.l.get(key);
            if (entry2 == null) {
                return null;
            }
            diskLruCache.k(entry2);
            if (diskLruCache.j <= diskLruCache.f) {
                diskLruCache.r = false;
            }
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.d.flush();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/Cache$Entry;", "", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Entry {
        public static final String k;
        public static final String l;

        /* renamed from: a, reason: collision with root package name */
        public final HttpUrl f26662a;
        public final Headers b;
        public final String c;
        public final Protocol d;
        public final int e;
        public final String f;
        public final Headers g;
        public final Handshake h;
        public final long i;
        public final long j;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lokhttp3/Cache$Entry$Companion;", "", "<init>", "()V", "SENT_MILLIS", "", "RECEIVED_MILLIS", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(int i) {
                this();
            }

            private Companion() {
            }
        }

        static {
            new Companion(0);
            Platform.f26752a.getClass();
            Platform.b.getClass();
            k = "OkHttp-Sent-Millis";
            Platform.b.getClass();
            l = "OkHttp-Received-Millis";
        }

        public Entry(Source rawSource) throws IOException {
            TlsVersion tlsVersionA;
            Intrinsics.h(rawSource, "rawSource");
            try {
                RealBufferedSource realBufferedSourceC = Okio.c(rawSource);
                String strN1 = realBufferedSourceC.n1(Long.MAX_VALUE);
                HttpUrl.j.getClass();
                HttpUrl httpUrlD = HttpUrl.Companion.d(strN1);
                if (httpUrlD == null) {
                    IOException iOException = new IOException("Cache corruption for ".concat(strN1));
                    Platform.f26752a.getClass();
                    Platform.b.h(5, "cache corruption", iOException);
                    throw iOException;
                }
                this.f26662a = httpUrlD;
                this.c = realBufferedSourceC.n1(Long.MAX_VALUE);
                Headers.Builder builder = new Headers.Builder();
                Cache.e.getClass();
                int iB = Companion.b(realBufferedSourceC);
                for (int i = 0; i < iB; i++) {
                    builder.b(realBufferedSourceC.n1(Long.MAX_VALUE));
                }
                this.b = builder.e();
                StatusLine.Companion companion = StatusLine.d;
                String strN12 = realBufferedSourceC.n1(Long.MAX_VALUE);
                companion.getClass();
                StatusLine statusLineA = StatusLine.Companion.a(strN12);
                this.d = statusLineA.f26732a;
                this.e = statusLineA.b;
                this.f = statusLineA.c;
                Headers.Builder builder2 = new Headers.Builder();
                Cache.e.getClass();
                int iB2 = Companion.b(realBufferedSourceC);
                for (int i2 = 0; i2 < iB2; i2++) {
                    builder2.b(realBufferedSourceC.n1(Long.MAX_VALUE));
                }
                String str = k;
                String strF = builder2.f(str);
                String str2 = l;
                String strF2 = builder2.f(str2);
                builder2.g(str);
                builder2.g(str2);
                this.i = strF != null ? Long.parseLong(strF) : 0L;
                this.j = strF2 != null ? Long.parseLong(strF2) : 0L;
                this.g = builder2.e();
                if (this.f26662a.f()) {
                    String strN13 = realBufferedSourceC.n1(Long.MAX_VALUE);
                    if (strN13.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strN13 + '\"');
                    }
                    CipherSuite cipherSuiteB = CipherSuite.b.b(realBufferedSourceC.n1(Long.MAX_VALUE));
                    List listB = b(realBufferedSourceC);
                    List listB2 = b(realBufferedSourceC);
                    if (realBufferedSourceC.X1()) {
                        tlsVersionA = TlsVersion.j;
                    } else {
                        TlsVersion.Companion companion2 = TlsVersion.e;
                        String strN14 = realBufferedSourceC.n1(Long.MAX_VALUE);
                        companion2.getClass();
                        tlsVersionA = TlsVersion.Companion.a(strN14);
                    }
                    Handshake.e.getClass();
                    this.h = new Handshake(tlsVersionA, cipherSuiteB, _UtilJvmKt.j(listB2), new d(_UtilJvmKt.j(listB), 14));
                } else {
                    this.h = null;
                }
                rawSource.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.a(rawSource, th);
                    throw th2;
                }
            }
        }

        public static List b(RealBufferedSource realBufferedSource) throws IOException, CertificateException {
            Cache.e.getClass();
            int iB = Companion.b(realBufferedSource);
            if (iB == -1) {
                return EmptyList.d;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iB);
                for (int i = 0; i < iB; i++) {
                    String strN1 = realBufferedSource.n1(Long.MAX_VALUE);
                    Buffer buffer = new Buffer();
                    ByteString byteString = ByteString.g;
                    byte[] bArrA = Base64.a(strN1);
                    ByteString byteString2 = bArrA != null ? new ByteString(bArrA) : null;
                    if (byteString2 == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    buffer.T(byteString2);
                    arrayList.add(certificateFactory.generateCertificate(new Buffer$inputStream$1(buffer)));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        public static void d(RealBufferedSink realBufferedSink, List list) throws IOException, CertificateEncodingException {
            try {
                realBufferedSink.n0(list.size());
                realBufferedSink.writeByte(10);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    byte[] encoded = ((Certificate) it.next()).getEncoded();
                    ByteString byteString = ByteString.g;
                    Intrinsics.e(encoded);
                    realBufferedSink.r1(Base64.b(ByteString.Companion.d(encoded).data, Base64.f26779a));
                    realBufferedSink.writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final boolean a(Request request, Response response) {
            if (!Intrinsics.c(this.f26662a, request.f26690a) || !Intrinsics.c(this.c, request.b)) {
                return false;
            }
            Cache.e.getClass();
            Headers cachedRequest = this.b;
            Intrinsics.h(cachedRequest, "cachedRequest");
            Set<String> setC = Companion.c(response.i);
            if ((setC instanceof Collection) && setC.isEmpty()) {
                return true;
            }
            for (String str : setC) {
                if (!cachedRequest.j(str).equals(request.c.j(str))) {
                    return false;
                }
            }
            return true;
        }

        public final Response c(DiskLruCache.Snapshot snapshot) {
            Headers headers = this.g;
            String strB = headers.b(RequestBuilder.CONTENT_TYPE);
            String strB2 = headers.b("Content-Length");
            HttpUrl url = this.f26662a;
            Intrinsics.h(url, "url");
            Headers headers2 = this.b;
            Intrinsics.h(headers2, "headers");
            String method = this.c;
            Intrinsics.h(method, "method");
            Request.Builder builder = new Request.Builder();
            builder.f26691a = url;
            builder.d(headers2);
            if (method.equals(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)) {
                method = "GET";
            }
            builder.e(method, null);
            Request request = new Request(builder);
            Response.Builder builder2 = new Response.Builder();
            builder2.f26693a = request;
            Protocol protocol = this.d;
            Intrinsics.h(protocol, "protocol");
            builder2.b = protocol;
            builder2.c = this.e;
            String message = this.f;
            Intrinsics.h(message, "message");
            builder2.d = message;
            builder2.c(headers);
            builder2.g = new CacheResponseBody(snapshot, strB, strB2);
            builder2.e = this.h;
            builder2.k = this.i;
            builder2.l = this.j;
            return builder2.a();
        }

        public final void e(DiskLruCache.Editor editor) throws Throwable {
            HttpUrl httpUrl = this.f26662a;
            Handshake handshake = this.h;
            Headers headers = this.g;
            Headers headers2 = this.b;
            RealBufferedSink realBufferedSinkB = Okio.b(editor.f(0));
            try {
                realBufferedSinkB.r1(httpUrl.i);
                realBufferedSinkB.writeByte(10);
                realBufferedSinkB.r1(this.c);
                realBufferedSinkB.writeByte(10);
                realBufferedSinkB.n0(headers2.size());
                realBufferedSinkB.writeByte(10);
                int size = headers2.size();
                for (int i = 0; i < size; i++) {
                    realBufferedSinkB.r1(headers2.d(i));
                    realBufferedSinkB.r1(": ");
                    realBufferedSinkB.r1(headers2.i(i));
                    realBufferedSinkB.writeByte(10);
                }
                realBufferedSinkB.r1(new StatusLine(this.d, this.e, this.f).toString());
                realBufferedSinkB.writeByte(10);
                realBufferedSinkB.n0(headers.size() + 2);
                realBufferedSinkB.writeByte(10);
                int size2 = headers.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    realBufferedSinkB.r1(headers.d(i2));
                    realBufferedSinkB.r1(": ");
                    realBufferedSinkB.r1(headers.i(i2));
                    realBufferedSinkB.writeByte(10);
                }
                realBufferedSinkB.r1(k);
                realBufferedSinkB.r1(": ");
                realBufferedSinkB.n0(this.i);
                realBufferedSinkB.writeByte(10);
                realBufferedSinkB.r1(l);
                realBufferedSinkB.r1(": ");
                realBufferedSinkB.n0(this.j);
                realBufferedSinkB.writeByte(10);
                if (httpUrl.f()) {
                    realBufferedSinkB.writeByte(10);
                    Intrinsics.e(handshake);
                    realBufferedSinkB.r1(handshake.b.f26669a);
                    realBufferedSinkB.writeByte(10);
                    d(realBufferedSinkB, handshake.a());
                    d(realBufferedSinkB, handshake.c);
                    realBufferedSinkB.r1(handshake.f26681a.d);
                    realBufferedSinkB.writeByte(10);
                }
                realBufferedSinkB.close();
            } finally {
            }
        }

        public Entry(Response response) {
            Headers headersE;
            Request request = response.d;
            this.f26662a = request.f26690a;
            Cache.e.getClass();
            Response response2 = response.k;
            Intrinsics.e(response2);
            Headers headers = response2.d.c;
            Headers headers2 = response.i;
            Set setC = Companion.c(headers2);
            if (setC.isEmpty()) {
                headersE = Headers.f;
            } else {
                Headers.Builder builder = new Headers.Builder();
                int size = headers.size();
                for (int i = 0; i < size; i++) {
                    String strD = headers.d(i);
                    if (setC.contains(strD)) {
                        builder.a(strD, headers.i(i));
                    }
                }
                headersE = builder.e();
            }
            this.b = headersE;
            this.c = request.b;
            this.d = response.e;
            this.e = response.g;
            this.f = response.f;
            this.g = headers2;
            this.h = response.h;
            this.i = response.n;
            this.j = response.o;
        }
    }
}
