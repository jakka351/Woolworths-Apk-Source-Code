package com.airbnb.lottie.network;

import androidx.annotation.RestrictTo;
import com.airbnb.lottie.utils.Logger;
import com.dynatrace.android.callback.Callback;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

@RestrictTo
/* loaded from: classes4.dex */
public class DefaultLottieFetchResult implements LottieFetchResult {
    public final HttpURLConnection d;

    public DefaultLottieFetchResult(HttpURLConnection httpURLConnection) {
        this.d = httpURLConnection;
    }

    public final String a() throws IOException {
        HttpURLConnection httpURLConnection = this.d;
        try {
            if (b()) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to fetch ");
            sb.append(httpURLConnection.getURL());
            sb.append(". Failed with ");
            sb.append(Callback.f(httpURLConnection));
            sb.append("\n");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        sb2.append(line);
                        sb2.append('\n');
                    } else {
                        try {
                            break;
                        } catch (Exception unused) {
                        }
                    }
                } finally {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused2) {
                    }
                }
            }
            sb.append(sb2.toString());
            return sb.toString();
        } catch (IOException e) {
            Logger.c("get error failed ", e);
            return e.getMessage();
        }
    }

    public final boolean b() {
        try {
            return Callback.f(this.d) / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.disconnect();
    }
}
