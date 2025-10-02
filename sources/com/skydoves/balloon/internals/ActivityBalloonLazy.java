package com.skydoves.balloon.internals;

import com.google.android.gms.ads.RequestConfiguration;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.Balloon.Factory;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmClassMappingKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/skydoves/balloon/internals/ActivityBalloonLazy;", "Lcom/skydoves/balloon/Balloon$Factory;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Lazy;", "Lcom/skydoves/balloon/Balloon;", "Ljava/io/Serializable;", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@PublishedApi
/* loaded from: classes6.dex */
public final class ActivityBalloonLazy<T extends Balloon.Factory> implements Lazy<Balloon>, Serializable {
    public Balloon d;

    @Override // kotlin.Lazy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Balloon getD() {
        Balloon balloon = this.d;
        if (balloon != null) {
            return balloon;
        }
        Balloon balloonA = ((Balloon.Factory) ((Class) new ActivityBalloonLazy$value$factory$1(null, JvmClassMappingKt.class, "java", "getJavaClass(Lkotlin/reflect/KClass;)Ljava/lang/Class;", 1).get()).newInstance()).a();
        this.d = balloonA;
        return balloonA;
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return this.d != null;
    }

    public final String toString() {
        return isInitialized() ? getD().toString() : "Lazy value not initialized yet.";
    }
}
