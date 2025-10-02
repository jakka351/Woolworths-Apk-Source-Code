package androidx.constraintlayout.compose;

import YU.a;
import androidx.camera.core.impl.b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/CarouselState;", "", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* data */ class CarouselState {

    /* renamed from: a, reason: collision with root package name */
    public MotionCarouselDirection f2233a;
    public int b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarouselState)) {
            return false;
        }
        CarouselState carouselState = (CarouselState) obj;
        return this.f2233a == carouselState.f2233a && this.b == carouselState.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + b.e(b.a(0, b.a(this.b, this.f2233a.hashCode() * 31, 31), 31), 31, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CarouselState(direction=");
        sb.append(this.f2233a);
        sb.append(", index=");
        return a.m(sb, this.b, ", targetIndex=0, snapping=false, animating=false)");
    }
}
