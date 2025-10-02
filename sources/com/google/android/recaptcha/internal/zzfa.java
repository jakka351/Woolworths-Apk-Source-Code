package com.google.android.recaptcha.internal;

import com.dynatrace.android.callback.Callback;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.rest.RequestBuilder;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class zzfa implements zzey {

    @NotNull
    private final Lazy zza;

    public zzfa() {
        int i = zzav.zza;
        this.zza = LazyKt.b(zzez.zza);
    }

    @Override // com.google.android.recaptcha.internal.zzey
    @NotNull
    public final zzsc zza(@NotNull String str, @NotNull zzto zztoVar) throws zzbd {
        zzew zzewVarZza = null;
        try {
            try {
                try {
                    zzewVarZza = ((zzex) this.zza.getD()).zza(str);
                    zzewVarZza.zzc();
                    zzewVarZza.zze(zztoVar.zzd());
                    zzsc zzscVar = (zzsc) zzewVarZza.zza(zzsc.zzi());
                    zzewVarZza.zzd();
                    return zzscVar;
                } catch (Exception e) {
                    throw new zzbd(zzbb.zzc, zzba.zzF, e.getMessage());
                }
            } catch (zzbd e2) {
                if (zzewVarZza == null || !Intrinsics.c(e2.zza(), zzba.zzau)) {
                    throw e2;
                }
                try {
                    throw zzbc.zza(zztu.zzg(zzewVarZza.zzb().getErrorStream()).zzi());
                } catch (Exception e3) {
                    throw new zzbd(zzbb.zzc, zzba.zzG, e3.getMessage());
                }
            }
        } catch (Throwable th) {
            if (zzewVarZza != null) {
                zzewVarZza.zzd();
            }
            throw th;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzey
    @NotNull
    public final String zzb(@NotNull String str) throws IOException, zzbd {
        try {
            try {
                URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
                Callback.v(uRLConnectionOpenConnection);
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(uRLConnectionOpenConnection);
                Intrinsics.f(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoInput(true);
                httpURLConnection.setRequestProperty(RequestBuilder.ACCEPT, "application/x-protobuffer");
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                httpURLConnection.connect();
                if (Callback.f(httpURLConnection) != 200) {
                    throw new zzbd(zzbb.zzc, new zzba(Callback.f(httpURLConnection)), null);
                }
                try {
                    return TextStreamsKt.b("gzip".equals(httpURLConnection.getContentEncoding()) ? new InputStreamReader(new GZIPInputStream(Callback.a(httpURLConnection))) : new InputStreamReader(Callback.a(httpURLConnection)));
                } catch (Exception unused) {
                    throw new zzbd(zzbb.zzc, zzba.zzP, null);
                }
            } catch (Exception unused2) {
                throw new zzbd(zzbb.zzc, zzba.zzO, null);
            }
        } catch (Exception unused3) {
            throw new zzbd(zzbb.zzb, zzba.zzN, null);
        }
    }
}
