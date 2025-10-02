package com.bumptech.glide.load.model;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes.dex */
public class GlideUrl implements Key {
    private static final String ALLOWED_URI_CHARS = "@#&=*+-_.,:!?()/~'%;$";

    @Nullable
    private volatile byte[] cacheKeyBytes;
    private int hashCode;
    private final Headers headers;

    @Nullable
    private String safeStringUrl;

    @Nullable
    private URL safeUrl;

    @Nullable
    private final String stringUrl;

    @Nullable
    private final URL url;

    public GlideUrl(URL url) {
        LazyHeaders lazyHeaders = Headers.f13855a;
        Preconditions.c(url, "Argument must not be null");
        this.url = url;
        this.stringUrl = null;
        Preconditions.c(lazyHeaders, "Argument must not be null");
        this.headers = lazyHeaders;
    }

    public final String b() {
        if (TextUtils.isEmpty(this.safeStringUrl)) {
            String string = this.stringUrl;
            if (TextUtils.isEmpty(string)) {
                URL url = this.url;
                Preconditions.c(url, "Argument must not be null");
                string = url.toString();
            }
            this.safeStringUrl = Uri.encode(string, ALLOWED_URI_CHARS);
        }
        return this.safeStringUrl;
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (obj instanceof GlideUrl) {
            GlideUrl glideUrl = (GlideUrl) obj;
            if (getCacheKey().equals(glideUrl.getCacheKey()) && this.headers.equals(glideUrl.headers)) {
                return true;
            }
        }
        return false;
    }

    public String getCacheKey() {
        String str = this.stringUrl;
        if (str != null) {
            return str;
        }
        URL url = this.url;
        Preconditions.c(url, "Argument must not be null");
        return url.toString();
    }

    public Map<String, String> getHeaders() {
        return this.headers.a();
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        if (this.hashCode == 0) {
            int iHashCode = getCacheKey().hashCode();
            this.hashCode = iHashCode;
            this.hashCode = this.headers.hashCode() + (iHashCode * 31);
        }
        return this.hashCode;
    }

    public String toString() {
        return getCacheKey();
    }

    public String toStringUrl() {
        return b();
    }

    public URL toURL() throws MalformedURLException {
        if (this.safeUrl == null) {
            this.safeUrl = new URL(b());
        }
        return this.safeUrl;
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        if (this.cacheKeyBytes == null) {
            this.cacheKeyBytes = getCacheKey().getBytes(Key.b);
        }
        messageDigest.update(this.cacheKeyBytes);
    }

    public GlideUrl(String str, Headers headers) {
        this.url = null;
        if (!TextUtils.isEmpty(str)) {
            this.stringUrl = str;
            Preconditions.c(headers, "Argument must not be null");
            this.headers = headers;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
