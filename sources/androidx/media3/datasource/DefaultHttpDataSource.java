package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.HttpDataSource;
import com.dynatrace.android.callback.Callback;
import com.google.common.collect.ForwardingMap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.io.ByteStreams;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import me.oriient.internal.infra.rest.RequestBuilder;

/* loaded from: classes2.dex */
public class DefaultHttpDataSource extends BaseDataSource implements HttpDataSource {
    public final int e;
    public final int f;
    public final HttpDataSource.RequestProperties g;
    public final HttpDataSource.RequestProperties h;
    public DataSpec i;
    public HttpURLConnection j;
    public InputStream k;
    public boolean l;
    public int m;
    public long n;
    public long o;

    public static final class Factory implements HttpDataSource.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final HttpDataSource.RequestProperties f2962a = new HttpDataSource.RequestProperties();
        public final int b = 8000;
        public final int c = 8000;

        @Override // androidx.media3.datasource.HttpDataSource.Factory, androidx.media3.datasource.DataSource.Factory
        public final DataSource a() {
            return new DefaultHttpDataSource(this.b, this.c, this.f2962a);
        }

        @Override // androidx.media3.datasource.HttpDataSource.Factory, androidx.media3.datasource.DataSource.Factory
        public final HttpDataSource a() {
            return new DefaultHttpDataSource(this.b, this.c, this.f2962a);
        }
    }

    public static class NullFilteringHeadersMap extends ForwardingMap<String, List<String>> {
        public final Map d;

        public NullFilteringHeadersMap(Map map) {
            this.d = map;
        }

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final Object P1() {
            return this.d;
        }

        @Override // com.google.common.collect.ForwardingMap
        /* renamed from: R1 */
        public final Map P1() {
            return this.d;
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final boolean containsValue(Object obj) {
            return U1(obj);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final Set entrySet() {
            return Sets.d(super.entrySet(), new b(0));
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final boolean equals(Object obj) {
            return obj != null && Maps.d(obj, this);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final Object get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final int hashCode() {
            return Sets.e(entrySet());
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final boolean isEmpty() {
            return super.isEmpty() || (super.size() == 1 && super.containsKey(null));
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final Set keySet() {
            return Sets.d(super.keySet(), new b(1));
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }
    }

    public DefaultHttpDataSource(int i, int i2, HttpDataSource.RequestProperties requestProperties) {
        super(true);
        this.e = i;
        this.f = i2;
        this.g = requestProperties;
        this.h = new HttpDataSource.RequestProperties();
    }

    @Override // androidx.media3.datasource.DataSource
    public final long a(DataSpec dataSpec) throws IOException, NumberFormatException {
        this.i = dataSpec;
        long j = 0;
        this.o = 0L;
        this.n = 0L;
        o(dataSpec);
        try {
            HttpURLConnection httpURLConnectionR = r(new URL(dataSpec.f2957a.toString()), dataSpec.c, dataSpec.d, dataSpec.f, dataSpec.g, (dataSpec.i & 1) == 1, true, dataSpec.e);
            long j2 = dataSpec.f;
            long j3 = dataSpec.g;
            this.j = httpURLConnectionR;
            this.m = Callback.f(httpURLConnectionR);
            httpURLConnectionR.getResponseMessage();
            int i = this.m;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionR.getHeaderFields();
                if (this.m == 416 && j2 == HttpUtil.c(httpURLConnectionR.getHeaderField("Content-Range"))) {
                    this.l = true;
                    p(dataSpec);
                    if (j3 != -1) {
                        return j3;
                    }
                    return 0L;
                }
                InputStream errorStream = httpURLConnectionR.getErrorStream();
                try {
                    if (errorStream != null) {
                        ByteStreams.c(errorStream);
                    } else {
                        int i2 = Util.f2928a;
                    }
                } catch (IOException unused) {
                    int i3 = Util.f2928a;
                }
                q();
                throw new HttpDataSource.InvalidResponseCodeException(this.m, this.m == 416 ? new DataSourceException(2008) : null, headerFields);
            }
            httpURLConnectionR.getContentType();
            if (this.m == 200 && j2 != 0) {
                j = j2;
            }
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionR.getHeaderField(RequestBuilder.CONTENT_ENCODING));
            if (zEqualsIgnoreCase || j3 != -1) {
                this.n = j3;
            } else {
                long jB = HttpUtil.b(httpURLConnectionR.getHeaderField("Content-Length"), httpURLConnectionR.getHeaderField("Content-Range"));
                this.n = jB != -1 ? jB - j : -1L;
            }
            try {
                this.k = Callback.a(httpURLConnectionR);
                if (zEqualsIgnoreCase) {
                    this.k = new GZIPInputStream(this.k);
                }
                this.l = true;
                p(dataSpec);
                try {
                    s(j);
                    return this.n;
                } catch (IOException e) {
                    q();
                    if (e instanceof HttpDataSource.HttpDataSourceException) {
                        throw ((HttpDataSource.HttpDataSourceException) e);
                    }
                    throw new HttpDataSource.HttpDataSourceException(e, 2000, 1);
                }
            } catch (IOException e2) {
                q();
                throw new HttpDataSource.HttpDataSourceException(e2, 2000, 1);
            }
        } catch (IOException e3) {
            q();
            throw HttpDataSource.HttpDataSourceException.a(e3, 1);
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        try {
            InputStream inputStream = this.k;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    int i = Util.f2928a;
                    throw new HttpDataSource.HttpDataSourceException(e, 2000, 3);
                }
            }
        } finally {
            this.k = null;
            q();
            if (this.l) {
                this.l = false;
                n();
            }
            this.j = null;
            this.i = null;
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public final Map d() {
        HttpURLConnection httpURLConnection = this.j;
        return httpURLConnection == null ? ImmutableMap.l() : new NullFilteringHeadersMap(httpURLConnection.getHeaderFields());
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        DataSpec dataSpec = this.i;
        if (dataSpec != null) {
            return dataSpec.f2957a;
        }
        return null;
    }

    public final void q() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                Log.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    public final HttpURLConnection r(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        Callback.v(uRLConnectionOpenConnection);
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(uRLConnectionOpenConnection));
        httpURLConnection.setConnectTimeout(this.e);
        httpURLConnection.setReadTimeout(this.f);
        HashMap map2 = new HashMap();
        HttpDataSource.RequestProperties requestProperties = this.g;
        if (requestProperties != null) {
            map2.putAll(requestProperties.a());
        }
        map2.putAll(this.h.a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = HttpUtil.a(j, j2);
        if (strA != null) {
            httpURLConnection.setRequestProperty("Range", strA);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(DataSpec.b(i));
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStreamD = Callback.d(httpURLConnection);
        outputStreamD.write(bArr);
        outputStreamD.close();
        return httpURLConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
    @Override // androidx.media3.common.DataReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int read(byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            if (r9 != 0) goto L4
            r7 = 0
            return r7
        L4:
            long r0 = r6.n     // Catch: java.io.IOException -> L32
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L1d
            long r4 = r6.o     // Catch: java.io.IOException -> L32
            long r0 = r0 - r4
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L17
            goto L27
        L17:
            long r4 = (long) r9     // Catch: java.io.IOException -> L32
            long r0 = java.lang.Math.min(r4, r0)     // Catch: java.io.IOException -> L32
            int r9 = (int) r0     // Catch: java.io.IOException -> L32
        L1d:
            java.io.InputStream r0 = r6.k     // Catch: java.io.IOException -> L32
            int r1 = androidx.media3.common.util.Util.f2928a     // Catch: java.io.IOException -> L32
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L32
            if (r7 != r3) goto L28
        L27:
            return r3
        L28:
            long r8 = r6.o     // Catch: java.io.IOException -> L32
            long r0 = (long) r7     // Catch: java.io.IOException -> L32
            long r8 = r8 + r0
            r6.o = r8     // Catch: java.io.IOException -> L32
            r6.m(r7)     // Catch: java.io.IOException -> L32
            return r7
        L32:
            r7 = move-exception
            int r8 = androidx.media3.common.util.Util.f2928a
            r8 = 2
            androidx.media3.datasource.HttpDataSource$HttpDataSourceException r7 = androidx.media3.datasource.HttpDataSource.HttpDataSourceException.a(r7, r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.datasource.DefaultHttpDataSource.read(byte[], int, int):int");
    }

    public final void s(long j) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int iMin = (int) Math.min(j, 4096);
            InputStream inputStream = this.k;
            int i = Util.f2928a;
            int i2 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource.HttpDataSourceException(new InterruptedIOException(), 2000, 1);
            }
            if (i2 == -1) {
                throw new HttpDataSource.HttpDataSourceException();
            }
            j -= i2;
            m(i2);
        }
    }
}
