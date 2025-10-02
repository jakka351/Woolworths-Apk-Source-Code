package androidx.compose.animation.graphics.vector;

import androidx.compose.animation.core.Easing;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/graphics/vector/Keyframe;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "animation-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Keyframe<T> {

    /* renamed from: a, reason: collision with root package name */
    public final float f812a;
    public final Object b;
    public final Easing c;

    public Keyframe(float f, Object obj, Easing easing) {
        this.f812a = f;
        this.b = obj;
        this.c = easing;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Keyframe)) {
            return false;
        }
        Keyframe keyframe = (Keyframe) obj;
        return Float.compare(this.f812a, keyframe.f812a) == 0 && Intrinsics.c(this.b, keyframe.b) && Intrinsics.c(this.c, keyframe.c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f812a) * 31;
        Object obj = this.b;
        return this.c.hashCode() + ((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31);
    }

    public final String toString() {
        return "Keyframe(fraction=" + this.f812a + ", value=" + this.b + ", interpolator=" + this.c + ')';
    }
}
