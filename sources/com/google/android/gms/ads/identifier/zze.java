package com.google.android.gms.ads.identifier;

import android.util.Log;
import androidx.annotation.WorkerThread;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.internal.ads_identifier.zzk;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes5.dex */
public final class zze {
    @WorkerThread
    public static final void zza(String str) {
        try {
            try {
                zzk.zzb(263);
                URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
                Callback.v(uRLConnectionOpenConnection);
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                try {
                    int iF = Callback.f(httpURLConnection);
                    if (iF < 200 || iF >= 300) {
                        Log.w("HttpUrlPinger", "Received non-success response code " + iF + " from pinging URL: " + str);
                    }
                    zzk.zza();
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (IOException e) {
                e = e;
                Log.w("HttpUrlPinger", "Error while pinging URL: " + str + ". " + e.getMessage(), e);
                zzk.zza();
            } catch (IndexOutOfBoundsException e2) {
                Log.w("HttpUrlPinger", "Error while parsing ping URL: " + str + ". " + e2.getMessage(), e2);
                zzk.zza();
            } catch (RuntimeException e3) {
                e = e3;
                Log.w("HttpUrlPinger", "Error while pinging URL: " + str + ". " + e.getMessage(), e);
                zzk.zza();
            }
        } catch (Throwable th) {
            zzk.zza();
            throw th;
        }
    }
}
