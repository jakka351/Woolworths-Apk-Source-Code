package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AnimatedContentKt$AnimatedContent$1 extends Lambda implements Function1<AnimatedContentTransitionScope<Object>, ContentTransform> {
    public static final AnimatedContentKt$AnimatedContent$1 h = new AnimatedContentKt$AnimatedContent$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return AnimatedContentKt.d(EnterExitTransitionKt.e(AnimationSpecKt.e(220, 90, null, 4), 2).b(EnterExitTransitionKt.h(AnimationSpecKt.e(220, 90, null, 4))), EnterExitTransitionKt.f(AnimationSpecKt.e(90, 0, null, 6), 2));
    }
}
