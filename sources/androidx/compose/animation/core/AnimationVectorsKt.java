package androidx.compose.animation.core;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimationVectorsKt {
    public static final AnimationVector a(AnimationVector animationVector) {
        AnimationVector animationVectorC = animationVector.c();
        int iB = animationVectorC.b();
        for (int i = 0; i < iB; i++) {
            animationVectorC.e(animationVector.a(i), i);
        }
        return animationVectorC;
    }
}
