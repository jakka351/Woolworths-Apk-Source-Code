package androidx.compose.animation;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/FlingCalculator;", "", "FlingInfo", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FlingCalculator {

    /* renamed from: a, reason: collision with root package name */
    public final float f725a;
    public final Density b;
    public final float c;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/FlingCalculator$FlingInfo;", "", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class FlingInfo {

        /* renamed from: a, reason: collision with root package name */
        public final float f726a;
        public final float b;
        public final long c;

        public FlingInfo(long j, float f, float f2) {
            this.f726a = f;
            this.b = f2;
            this.c = j;
        }

        public final float a(long j) {
            long j2 = this.c;
            return Math.signum(this.f726a) * this.b * AndroidFlingSpline.b(j2 > 0 ? j / j2 : 1.0f).f708a;
        }

        public final float b(long j) {
            long j2 = this.c;
            return (((Math.signum(this.f726a) * AndroidFlingSpline.b(j2 > 0 ? j / j2 : 1.0f).b) * this.b) / j2) * 1000.0f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlingInfo)) {
                return false;
            }
            FlingInfo flingInfo = (FlingInfo) obj;
            return Float.compare(this.f726a, flingInfo.f726a) == 0 && Float.compare(this.b, flingInfo.b) == 0 && this.c == flingInfo.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + android.support.v4.media.session.a.b(this.b, Float.hashCode(this.f726a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FlingInfo(initialVelocity=");
            sb.append(this.f726a);
            sb.append(", distance=");
            sb.append(this.b);
            sb.append(", duration=");
            return b.q(sb, this.c, ')');
        }
    }

    public FlingCalculator(float f, Density density) {
        this.f725a = f;
        this.b = density;
        float d = density.getD();
        float f2 = FlingCalculatorKt.f727a;
        this.c = d * 386.0878f * 160.0f * 0.84f;
    }

    public final FlingInfo a(float f) {
        float[] fArr = AndroidFlingSpline.f707a;
        double dA = AndroidFlingSpline.a(f, this.f725a * this.c);
        double d = FlingCalculatorKt.f727a;
        double d2 = d - 1.0d;
        return new FlingInfo((long) (Math.exp(dA / d2) * 1000.0d), f, (float) (Math.exp((d / d2) * dA) * r0 * r1));
    }
}
