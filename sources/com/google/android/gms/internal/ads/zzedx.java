package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes5.dex */
public final class zzedx {
    private final Context zza;

    public zzedx(Context context) {
        this.zza = context;
    }

    public final ListenableFuture zza(boolean z) {
        try {
            GetTopicsRequest getTopicsRequest = new GetTopicsRequest(z);
            TopicsManagerFutures topicsManagerFuturesA = TopicsManagerFutures.a(this.zza);
            return topicsManagerFuturesA != null ? topicsManagerFuturesA.b(getTopicsRequest) : zzgot.zzc(new IllegalStateException());
        } catch (Exception e) {
            return zzgot.zzc(e);
        }
    }
}
