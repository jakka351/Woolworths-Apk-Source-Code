package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/core/AnimationVector4D;", "Landroidx/compose/animation/core/AnimationVector;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimationVector4D extends AnimationVector {

    /* renamed from: a, reason: collision with root package name */
    public float f748a;
    public float b;
    public float c;
    public float d;

    public AnimationVector4D(float f, float f2, float f3, float f4) {
        this.f748a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final float a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? BitmapDescriptorFactory.HUE_RED : this.d : this.c : this.b : this.f748a;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final int b() {
        return 4;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final AnimationVector c() {
        return new AnimationVector4D(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final void d() {
        this.f748a = BitmapDescriptorFactory.HUE_RED;
        this.b = BitmapDescriptorFactory.HUE_RED;
        this.c = BitmapDescriptorFactory.HUE_RED;
        this.d = BitmapDescriptorFactory.HUE_RED;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final void e(float f, int i) {
        if (i == 0) {
            this.f748a = f;
            return;
        }
        if (i == 1) {
            this.b = f;
        } else if (i == 2) {
            this.c = f;
        } else {
            if (i != 3) {
                return;
            }
            this.d = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnimationVector4D)) {
            return false;
        }
        AnimationVector4D animationVector4D = (AnimationVector4D) obj;
        return animationVector4D.f748a == this.f748a && animationVector4D.b == this.b && animationVector4D.c == this.c && animationVector4D.d == this.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + android.support.v4.media.session.a.b(this.c, android.support.v4.media.session.a.b(this.b, Float.hashCode(this.f748a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f748a + ", v2 = " + this.b + ", v3 = " + this.c + ", v4 = " + this.d;
    }
}
