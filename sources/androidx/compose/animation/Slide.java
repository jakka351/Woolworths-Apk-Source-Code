package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/Slide;", "", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Slide {

    /* renamed from: a, reason: collision with root package name */
    public final Lambda f735a;
    public final FiniteAnimationSpec b;

    /* JADX WARN: Multi-variable type inference failed */
    public Slide(FiniteAnimationSpec finiteAnimationSpec, Function1 function1) {
        this.f735a = (Lambda) function1;
        this.b = finiteAnimationSpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Slide)) {
            return false;
        }
        Slide slide = (Slide) obj;
        return this.f735a.equals(slide.f735a) && this.b.equals(slide.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f735a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.f735a + ", animationSpec=" + this.b + ')';
    }
}
