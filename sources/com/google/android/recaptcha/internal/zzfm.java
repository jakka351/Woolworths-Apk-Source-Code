package com.google.android.recaptcha.internal;

import com.dynatrace.android.callback.Callback;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class zzfm {

    @NotNull
    private final Lazy zza;

    public zzfm() {
        int i = zzav.zza;
        this.zza = LazyKt.b(zzfl.zza);
    }

    @NotNull
    public final HttpURLConnection zza(@NotNull String str) throws IOException, zzbd {
        if (!((zzfk) this.zza.getD()).zzb(str)) {
            throw new zzbd(zzbb.zzc, zzba.zzQ, null);
        }
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        Callback.v(uRLConnectionOpenConnection);
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(uRLConnectionOpenConnection);
        Intrinsics.f(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        return (HttpURLConnection) uRLConnection;
    }
}
