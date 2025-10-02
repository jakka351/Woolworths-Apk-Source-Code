package com.google.android.gms.ads.internal.util.client;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbtt;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/* loaded from: classes.dex */
public final class zzu implements zze {
    private final Context zza;

    @Nullable
    private final String zzb;

    @Nullable
    private String zzc;

    public zzu(Context context, @Nullable String str) {
        this.zza = context;
        this.zzb = str;
    }

    private final URL zzc(String str) throws MalformedURLException {
        URL urlZzd = null;
        try {
            urlZzd = new URI(str).toURL();
        } catch (IllegalArgumentException e) {
            e = e;
            zze(str, e);
        } catch (MalformedURLException e2) {
            e = e2;
            zze(str, e);
        } catch (URISyntaxException e3) {
            zze(str, e3);
            if (((Boolean) zzbd.zzc().zzd(zzbci.zze)).booleanValue()) {
                urlZzd = zzd(str);
            }
        }
        if (urlZzd != null) {
            return urlZzd;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 47);
        sb.append("Falling back to direct new URL(\"");
        sb.append(str);
        sb.append("\") constructor.");
        zzo.zzd(sb.toString());
        return new URL(str);
    }

    @Nullable
    private final URL zzd(String str) throws MalformedURLException {
        URL url;
        try {
            zzo.zzd("Attempting to parse components, encode, and reconstruct URI.");
            URL url2 = new URL(str);
            URI uri = new URI(url2.getProtocol(), url2.getUserInfo(), url2.getHost(), url2.getPort(), url2.getPath(), url2.getQuery(), url2.getRef());
            url = uri.toURL();
            try {
                String string = uri.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 114 + string.length());
                sb.append("Successfully constructed URL after component encoding via new URI(parts).toURL() for original: \"");
                sb.append(str);
                sb.append("\" -> encoded URI: ");
                sb.append(string);
                zzo.zzd(sb.toString());
                return url;
            } catch (IllegalArgumentException e) {
                e = e;
                zze(str, e);
                return url;
            } catch (MalformedURLException e2) {
                e = e2;
                zze(str, e);
                return url;
            } catch (URISyntaxException e3) {
                e = e3;
                zze(str, e);
                return url;
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException e4) {
            e = e4;
            url = null;
        }
    }

    private final void zze(String str, Throwable th) {
        String message = th.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message).length());
        sb.append("Error while parsing ping URL: ");
        sb.append(str);
        sb.append(". ");
        sb.append(message);
        zzo.zzi(sb.toString());
        zzbtt.zza(this.zza).zzi(th, "HttpUrlPinger.pingUrl", ((Integer) zzbd.zzc().zzd(zzbci.zznA)).intValue() / 100.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0126 A[PHI: r0
  0x0126: PHI (r0v8 com.google.android.gms.ads.internal.util.client.zzt) = 
  (r0v4 com.google.android.gms.ads.internal.util.client.zzt)
  (r0v0 com.google.android.gms.ads.internal.util.client.zzt)
  (r0v10 com.google.android.gms.ads.internal.util.client.zzt)
 binds: [B:43:0x011a, B:47:0x0124, B:32:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.ads.internal.util.client.zze
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.ads.internal.util.client.zzt zza(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.client.zzu.zza(java.lang.String):com.google.android.gms.ads.internal.util.client.zzt");
    }

    @Nullable
    public final String zzb() {
        return this.zzc;
    }
}
