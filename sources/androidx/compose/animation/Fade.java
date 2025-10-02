package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/Fade;", "", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Fade {

    /* renamed from: a, reason: collision with root package name */
    public final float f724a;
    public final FiniteAnimationSpec b;

    public Fade(float f, FiniteAnimationSpec finiteAnimationSpec) {
        this.f724a = f;
        this.b = finiteAnimationSpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fade)) {
            return false;
        }
        Fade fade = (Fade) obj;
        return Float.compare(this.f724a, fade.f724a) == 0 && Intrinsics.c(this.b, fade.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.f724a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.f724a + ", animationSpec=" + this.b + ')';
    }
}
