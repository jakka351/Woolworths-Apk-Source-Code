package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class VectorizedAnimationSpecKt {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f789a = new int[0];
    public static final float[] b = new float[0];
    public static final ArcSpline c = new ArcSpline(new int[2], new float[2], new float[][]{new float[2], new float[2]});

    public static final long a(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, long j) {
        long f799a = j - vectorizedDurationBasedAnimationSpec.getF799a();
        long jC = vectorizedDurationBasedAnimationSpec.c();
        if (f799a < 0) {
            f799a = 0;
        }
        return f799a > jC ? jC : f799a;
    }
}
