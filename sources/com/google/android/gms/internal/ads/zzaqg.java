package com.google.android.gms.internal.ads;

import com.dynatrace.android.callback.Callback;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* loaded from: classes5.dex */
final class zzaqg extends FilterInputStream {
    private final HttpURLConnection zza;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzaqg(HttpURLConnection httpURLConnection) {
        InputStream errorStream;
        try {
            errorStream = Callback.a(httpURLConnection);
        } catch (IOException unused) {
            errorStream = httpURLConnection.getErrorStream();
        }
        super(errorStream);
        this.zza = httpURLConnection;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.zza.disconnect();
    }
}
