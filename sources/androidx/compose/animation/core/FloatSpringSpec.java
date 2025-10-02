package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/core/FloatSpringSpec;", "Landroidx/compose/animation/core/FloatAnimationSpec;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class FloatSpringSpec implements FloatAnimationSpec {

    /* renamed from: a, reason: collision with root package name */
    public final float f758a;
    public final SpringSimulation b;

    public FloatSpringSpec(float f, float f2, float f3) {
        this.f758a = f3;
        SpringSimulation springSimulation = new SpringSimulation();
        springSimulation.f771a = 1.0f;
        springSimulation.b = Math.sqrt(50.0d);
        springSimulation.c = 1.0f;
        if (f < BitmapDescriptorFactory.HUE_RED) {
            PreconditionsKt.a("Damping ratio must be non-negative");
        }
        springSimulation.c = f;
        double d = springSimulation.b;
        if (((float) (d * d)) <= BitmapDescriptorFactory.HUE_RED) {
            PreconditionsKt.a("Spring stiffness constant must be positive.");
        }
        springSimulation.b = Math.sqrt(f2);
        this.b = springSimulation;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0211  */
    @Override // androidx.compose.animation.core.FloatAnimationSpec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long c(float r33, float r34, float r35) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.FloatSpringSpec.c(float, float, float):long");
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public final float d(float f, float f2, float f3, long j) {
        SpringSimulation springSimulation = this.b;
        springSimulation.f771a = f2;
        return Float.intBitsToFloat((int) (springSimulation.a(j / 1000000, f, f3) >> 32));
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public final float e(float f, float f2, float f3, long j) {
        SpringSimulation springSimulation = this.b;
        springSimulation.f771a = f2;
        return Float.intBitsToFloat((int) (springSimulation.a(j / 1000000, f, f3) & 4294967295L));
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public final float f(float f, float f2, float f3) {
        return BitmapDescriptorFactory.HUE_RED;
    }
}
