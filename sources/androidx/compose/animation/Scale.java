package androidx.compose.animation;

import androidx.camera.core.impl.b;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/Scale;", "", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Scale {

    /* renamed from: a, reason: collision with root package name */
    public final float f728a;
    public final long b;
    public final TweenSpec c;

    public Scale(float f, long j, TweenSpec tweenSpec) {
        this.f728a = f;
        this.b = j;
        this.c = tweenSpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scale)) {
            return false;
        }
        Scale scale = (Scale) obj;
        return Float.compare(this.f728a, scale.f728a) == 0 && TransformOrigin.a(this.b, scale.b) && this.c.equals(scale.c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f728a) * 31;
        int i = TransformOrigin.c;
        return this.c.hashCode() + b.b(iHashCode, 31, this.b);
    }

    public final String toString() {
        return "Scale(scale=" + this.f728a + ", transformOrigin=" + ((Object) TransformOrigin.d(this.b)) + ", animationSpec=" + this.c + ')';
    }
}
