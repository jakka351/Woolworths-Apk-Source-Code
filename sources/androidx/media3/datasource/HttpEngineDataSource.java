package androidx.media3.datasource;

import android.net.Uri;
import android.net.http.HttpException;
import android.net.http.UrlRequest;
import android.net.http.UrlRequest$Callback;
import android.net.http.UrlRequest$StatusListener;
import android.net.http.UrlResponseInfo;
import androidx.annotation.RequiresExtension;
import androidx.credentials.provider.utils.d;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.HttpDataSource;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@RequiresExtension
@UnstableApi
/* loaded from: classes2.dex */
public final class HttpEngineDataSource extends BaseDataSource implements HttpDataSource {
    public boolean e;
    public long f;
    public DataSpec g;
    public UrlRequestWrapper h;
    public ByteBuffer i;
    public UrlResponseInfo j;
    public IOException k;
    public boolean l;
    public volatile long m;

    public static final class Factory implements HttpDataSource.Factory {
        @Override // androidx.media3.datasource.HttpDataSource.Factory, androidx.media3.datasource.DataSource.Factory
        public final /* bridge */ /* synthetic */ DataSource a() {
            a();
            throw null;
        }

        @Override // androidx.media3.datasource.HttpDataSource.Factory, androidx.media3.datasource.DataSource.Factory
        public final HttpDataSource a() {
            new HttpEngineDataSource(true);
            throw null;
        }
    }

    @UnstableApi
    public static final class OpenException extends HttpDataSource.HttpDataSourceException {
    }

    public final class UrlRequestCallback implements UrlRequest$Callback {

        /* renamed from: a, reason: collision with root package name */
        public volatile boolean f2964a = false;

        public UrlRequestCallback() {
        }

        public final synchronized void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        }

        public final synchronized void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, HttpException httpException) {
            try {
                if (!this.f2964a) {
                    if (d.w(httpException) && d.f(httpException).getErrorCode() == 1) {
                        HttpEngineDataSource.this.k = new UnknownHostException();
                    } else {
                        HttpEngineDataSource.this.k = httpException;
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        public final synchronized void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
            if (!this.f2964a) {
                throw null;
            }
        }

        public final synchronized void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
            try {
                if (this.f2964a) {
                    return;
                }
                DataSpec dataSpec = HttpEngineDataSource.this.g;
                dataSpec.getClass();
                int httpStatusCode = urlResponseInfo.getHttpStatusCode();
                if (dataSpec.c == 2 && (httpStatusCode == 307 || httpStatusCode == 308)) {
                    HttpEngineDataSource httpEngineDataSource = HttpEngineDataSource.this;
                    urlResponseInfo.getHttpStatusText();
                    Map asMap = urlResponseInfo.getHeaders().getAsMap();
                    int i = Util.f2928a;
                    httpEngineDataSource.k = new HttpDataSource.InvalidResponseCodeException(httpStatusCode, null, asMap);
                    throw null;
                }
                CookieHandler cookieHandler = CookieHandler.getDefault();
                HttpEngineDataSource.w(urlResponseInfo, cookieHandler);
                HttpEngineDataSource.q(urlResponseInfo.getUrl(), urlResponseInfo.getHeaders().getAsMap(), cookieHandler);
                urlRequest.followRedirect();
            } catch (Throwable th) {
                throw th;
            }
        }

        public final synchronized void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            if (!this.f2964a) {
                HttpEngineDataSource.w(urlResponseInfo, CookieHandler.getDefault());
                HttpEngineDataSource.this.j = urlResponseInfo;
                throw null;
            }
        }

        public final synchronized void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            if (!this.f2964a) {
                HttpEngineDataSource.this.l = true;
                throw null;
            }
        }
    }

    public static final class UrlRequestWrapper {

        /* renamed from: a, reason: collision with root package name */
        public final UrlRequest f2965a;
        public final UrlRequestCallback b;

        /* renamed from: androidx.media3.datasource.HttpEngineDataSource$UrlRequestWrapper$1, reason: invalid class name */
        class AnonymousClass1 implements UrlRequest$StatusListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int[] f2966a;
            public final /* synthetic */ ConditionVariable b;

            public AnonymousClass1(int[] iArr, ConditionVariable conditionVariable) {
                this.f2966a = iArr;
                this.b = conditionVariable;
            }

            public final void onStatus(int i) {
                this.f2966a[0] = i;
                this.b.e();
            }
        }

        public UrlRequestWrapper(UrlRequest urlRequest, UrlRequestCallback urlRequestCallback) {
            this.f2965a = urlRequest;
            this.b = urlRequestCallback;
        }
    }

    public static String q(String str, Map map, CookieHandler cookieHandler) throws IOException {
        List<String> list;
        if (cookieHandler == null) {
            return "";
        }
        Map<String, List<String>> mapL = ImmutableMap.l();
        try {
            mapL = cookieHandler.get(new URI(str), map);
        } catch (Exception e) {
            Log.h("HttpEngineDataSource", "Failed to read cookies from CookieHandler", e);
        }
        StringBuilder sb = new StringBuilder();
        if (mapL.containsKey("Cookie") && (list = mapL.get("Cookie")) != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append("; ");
            }
        }
        String string = sb.toString();
        int length = string.length();
        while (length > 0) {
            int iCodePointBefore = Character.codePointBefore(string, length);
            if (!Character.isWhitespace(iCodePointBefore)) {
                break;
            }
            length -= Character.charCount(iCodePointBefore);
        }
        return string.substring(0, length);
    }

    public static String s(String str, Map map) {
        List list = (List) map.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    public static void w(UrlResponseInfo urlResponseInfo, CookieHandler cookieHandler) throws IOException {
        if (cookieHandler == null) {
            return;
        }
        try {
            cookieHandler.put(new URI(urlResponseInfo.getUrl()), urlResponseInfo.getHeaders().getAsMap());
        } catch (Exception e) {
            Log.h("HttpEngineDataSource", "Failed to store cookies in CookieHandler", e);
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public final long a(DataSpec dataSpec) {
        dataSpec.getClass();
        Assertions.f(!this.e);
        throw null;
    }

    @Override // androidx.media3.datasource.DataSource
    public final synchronized void close() {
        try {
            UrlRequestWrapper urlRequestWrapper = this.h;
            if (urlRequestWrapper != null) {
                urlRequestWrapper.b.f2964a = true;
                urlRequestWrapper.f2965a.cancel();
                this.h = null;
            }
            ByteBuffer byteBuffer = this.i;
            if (byteBuffer != null) {
                byteBuffer.limit(0);
            }
            this.g = null;
            this.j = null;
            this.k = null;
            this.l = false;
            if (this.e) {
                this.e = false;
                n();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public final Map d() {
        UrlResponseInfo urlResponseInfo = this.j;
        return urlResponseInfo == null ? Collections.EMPTY_MAP : urlResponseInfo.getHeaders().getAsMap();
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        UrlResponseInfo urlResponseInfo = this.j;
        if (urlResponseInfo != null) {
            return Uri.parse(urlResponseInfo.getUrl());
        }
        DataSpec dataSpec = this.g;
        if (dataSpec != null) {
            return dataSpec.f2957a;
        }
        return null;
    }

    public final UrlRequestWrapper r(DataSpec dataSpec) {
        null.newUrlRequestBuilder(dataSpec.f2957a.toString(), null, new UrlRequestCallback()).setPriority(0).setDirectExecutorAllowed(true);
        new HashMap();
        throw null;
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i, int i2) {
        Assertions.f(this.e);
        if (i2 == 0) {
            return 0;
        }
        if (this.f == 0) {
            return -1;
        }
        ByteBuffer byteBufferT = t();
        if (!byteBufferT.hasRemaining()) {
            throw null;
        }
        long j = this.f;
        if (j == -1) {
            j = Long.MAX_VALUE;
        }
        long[] jArr = {j, byteBufferT.remaining(), i2};
        long j2 = jArr[0];
        for (int i3 = 1; i3 < 3; i3++) {
            long j3 = jArr[i3];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        int i4 = (int) j2;
        byteBufferT.get(bArr, i, i4);
        long j4 = this.f;
        if (j4 != -1) {
            this.f = j4 - i4;
        }
        m(i4);
        return i4;
    }

    public final ByteBuffer t() {
        if (this.i == null) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32768);
            this.i = byteBufferAllocateDirect;
            byteBufferAllocateDirect.limit(0);
        }
        return this.i;
    }

    public final void u(ByteBuffer byteBuffer) {
        UrlRequestWrapper urlRequestWrapper = this.h;
        int i = Util.f2928a;
        urlRequestWrapper.f2965a.read(byteBuffer);
        throw null;
    }

    public final byte[] v() {
        byte[] bArr = Util.c;
        t();
        if (this.l) {
            return bArr;
        }
        throw null;
    }
}
