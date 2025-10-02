package com.skydoves.balloon.internals;

import com.google.android.gms.ads.RequestConfiguration;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.Balloon.Factory;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.PublishedApi;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/skydoves/balloon/internals/ViewBalloonLazy;", "Lcom/skydoves/balloon/Balloon$Factory;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Lazy;", "Lcom/skydoves/balloon/Balloon;", "Ljava/io/Serializable;", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@PublishedApi
/* loaded from: classes6.dex */
public final class ViewBalloonLazy<T extends Balloon.Factory> implements Lazy<Balloon>, Serializable {
    @Override // kotlin.Lazy
    /* renamed from: getValue */
    public final Object getD() {
        throw null;
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return false;
    }

    public final String toString() {
        return "Lazy value not initialized yet.";
    }
}
