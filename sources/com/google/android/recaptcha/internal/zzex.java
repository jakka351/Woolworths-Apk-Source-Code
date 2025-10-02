package com.google.android.recaptcha.internal;

import java.net.HttpURLConnection;
import java.net.ProtocolException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import me.oriient.internal.infra.rest.RequestBuilder;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class zzex {

    @NotNull
    private final zzfm zza;

    public zzex() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final zzew zza(@NotNull String str) throws ProtocolException, zzbd {
        try {
            HttpURLConnection httpURLConnectionZza = this.zza.zza(str);
            httpURLConnectionZza.setRequestMethod("POST");
            httpURLConnectionZza.setDoOutput(true);
            httpURLConnectionZza.setRequestProperty(RequestBuilder.CONTENT_TYPE, "application/x-protobuffer");
            return new zzew(httpURLConnectionZza);
        } catch (zzbd e) {
            throw e;
        } catch (Exception e2) {
            throw new zzbd(zzbb.zzc, zzba.zzai, e2.getMessage());
        }
    }

    public /* synthetic */ zzex(zzfm zzfmVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this.zza = new zzfm();
    }
}
