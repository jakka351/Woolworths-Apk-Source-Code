package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/animation/core/KeyframeBaseEntity;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class KeyframeBaseEntity<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f763a;
    public Easing b;

    public KeyframeBaseEntity(Object obj, Easing easing) {
        this.f763a = obj;
        this.b = easing;
    }
}
