package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/SpringSpec;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SpringSpec<T> implements FiniteAnimationSpec<T> {

    /* renamed from: a, reason: collision with root package name */
    public final float f772a;
    public final float b;
    public final Object c;

    public SpringSpec(float f, float f2, Object obj) {
        this.f772a = f;
        this.b = f2;
        this.c = obj;
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public final VectorizedAnimationSpec a(TwoWayConverter twoWayConverter) {
        Object obj = this.c;
        return new VectorizedSpringSpec(this.f772a, this.b, obj == null ? null : (AnimationVector) twoWayConverter.a().invoke(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SpringSpec) {
            SpringSpec springSpec = (SpringSpec) obj;
            if (springSpec.f772a == this.f772a && springSpec.b == this.b && Intrinsics.c(springSpec.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.c;
        return Float.hashCode(this.b) + android.support.v4.media.session.a.b(this.f772a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public /* synthetic */ SpringSpec(Object obj, int i) {
        this(1.0f, (i & 2) != 0 ? 1500.0f : 200.0f, (i & 4) != 0 ? null : obj);
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public final VectorizedFiniteAnimationSpec a(TwoWayConverter twoWayConverter) {
        Object obj = this.c;
        return new VectorizedSpringSpec(this.f772a, this.b, obj == null ? null : (AnimationVector) twoWayConverter.a().invoke(obj));
    }
}
