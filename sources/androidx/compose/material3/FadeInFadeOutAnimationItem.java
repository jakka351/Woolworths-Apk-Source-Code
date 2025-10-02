package androidx.compose.material3;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/FadeInFadeOutAnimationItem;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* data */ class FadeInFadeOutAnimationItem<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1448a;
    public final ComposableLambdaImpl b;

    public FadeInFadeOutAnimationItem(SnackbarData snackbarData, ComposableLambdaImpl composableLambdaImpl) {
        this.f1448a = snackbarData;
        this.b = composableLambdaImpl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FadeInFadeOutAnimationItem)) {
            return false;
        }
        FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) obj;
        return Intrinsics.c(this.f1448a, fadeInFadeOutAnimationItem.f1448a) && this.b.equals(fadeInFadeOutAnimationItem.b);
    }

    public final int hashCode() {
        Object obj = this.f1448a;
        return this.b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f1448a + ", transition=" + this.b + ')';
    }
}
