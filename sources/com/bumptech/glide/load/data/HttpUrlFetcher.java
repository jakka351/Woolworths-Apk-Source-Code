package com.bumptech.glide.load.data;

import YU.a;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.util.ContentLengthInputStream;
import com.bumptech.glide.util.LogTime;
import com.dynatrace.android.callback.Callback;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

/* loaded from: classes4.dex */
public class HttpUrlFetcher implements DataFetcher<InputStream> {
    public final GlideUrl d;
    public final int e;
    public HttpURLConnection f;
    public InputStream g;
    public volatile boolean h;

    public static class DefaultHttpUrlConnectionFactory implements HttpUrlConnectionFactory {
    }

    public interface HttpUrlConnectionFactory {
    }

    public HttpUrlFetcher(GlideUrl glideUrl, int i) {
        this.d = glideUrl;
        this.e = i;
    }

    public static int e(HttpURLConnection httpURLConnection) {
        try {
            return Callback.f(httpURLConnection);
        } catch (IOException e) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e);
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void b() throws IOException {
        InputStream inputStream = this.g;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f = null;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final DataSource c() {
        return DataSource.e;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cancel() {
        this.h = true;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void d(Priority priority, DataFetcher.DataCallback dataCallback) {
        GlideUrl glideUrl = this.d;
        int i = LogTime.b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                dataCallback.e(f(glideUrl.toURL(), 0, null, glideUrl.getHeaders()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + LogTime.a(jElapsedRealtimeNanos));
                }
            } catch (IOException e) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e);
                }
                dataCallback.f(e);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + LogTime.a(jElapsedRealtimeNanos));
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + LogTime.a(jElapsedRealtimeNanos));
            }
            throw th;
        }
    }

    public final InputStream f(URL url, int i, URL url2, Map map) throws IOException {
        if (i >= 5) {
            throw new HttpException(-1, null, "Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException(-1, null, "In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        int i2 = this.e;
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            Callback.v(uRLConnectionOpenConnection);
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(uRLConnectionOpenConnection));
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.f = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.g = Callback.a(this.f);
                if (this.h) {
                    return null;
                }
                int iE = e(this.f);
                int i3 = iE / 100;
                if (i3 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.g = new ContentLengthInputStream(Callback.a(httpURLConnection2), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.g = Callback.a(httpURLConnection2);
                        }
                        return this.g;
                    } catch (IOException e) {
                        throw new HttpException(e(httpURLConnection2), e, "Failed to obtain InputStream");
                    }
                }
                if (i3 != 3) {
                    if (iE == -1) {
                        throw new HttpException(iE, null, "Http request failed");
                    }
                    try {
                        throw new HttpException(iE, null, this.f.getResponseMessage());
                    } catch (IOException e2) {
                        throw new HttpException(iE, e2, "Failed to get a response message");
                    }
                }
                String headerField = this.f.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new HttpException(iE, null, "Received empty or null redirect url");
                }
                try {
                    URL url3 = new URL(url, headerField);
                    b();
                    return f(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new HttpException(iE, e3, a.A("Bad redirect url: ", headerField));
                }
            } catch (IOException e4) {
                throw new HttpException(e(this.f), e4, "Failed to connect or obtain data");
            }
        } catch (IOException e5) {
            throw new HttpException(0, e5, "URL.openConnection threw");
        }
    }
}
