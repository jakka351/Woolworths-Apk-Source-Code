package androidx.compose.material;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material.ripple.AndroidRippleNode;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DelegatingThemeAwareRippleNode$updateConfiguration$1 extends Lambda implements Function0<Unit> {
    public final /* synthetic */ DelegatingThemeAwareRippleNode h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DelegatingThemeAwareRippleNode$updateConfiguration$1(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        super(0);
        this.h = delegatingThemeAwareRippleNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = RippleKt.f1315a;
        final DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode = this.h;
        if (((RippleConfiguration) CompositionLocalConsumerModifierNodeKt.a(delegatingThemeAwareRippleNode, dynamicProvidableCompositionLocal)) == null) {
            AndroidRippleNode androidRippleNode = delegatingThemeAwareRippleNode.x;
            if (androidRippleNode != null) {
                delegatingThemeAwareRippleNode.t2(androidRippleNode);
            }
            delegatingThemeAwareRippleNode.x = null;
        } else if (delegatingThemeAwareRippleNode.x == null) {
            ColorProducer colorProducer = new ColorProducer() { // from class: androidx.compose.material.DelegatingThemeAwareRippleNode$attachNewRipple$calculateColor$1
                @Override // androidx.compose.ui.graphics.ColorProducer
                public final long a() {
                    DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode2 = delegatingThemeAwareRippleNode;
                    long jA = delegatingThemeAwareRippleNode2.w.a();
                    if (jA != 16) {
                        return jA;
                    }
                    RippleConfiguration rippleConfiguration = (RippleConfiguration) CompositionLocalConsumerModifierNodeKt.a(delegatingThemeAwareRippleNode2, RippleKt.f1315a);
                    if (rippleConfiguration != null) {
                        long j = rippleConfiguration.f1314a;
                        if (j != 16) {
                            return j;
                        }
                    }
                    long j2 = ((Color) CompositionLocalConsumerModifierNodeKt.a(delegatingThemeAwareRippleNode2, ContentColorKt.f1261a)).f1766a;
                    return (((Colors) CompositionLocalConsumerModifierNodeKt.a(delegatingThemeAwareRippleNode2, ColorsKt.f1254a)).h() || ((double) ColorKt.i(j2)) >= 0.5d) ? j2 : Color.f;
                }
            };
            Function0<RippleAlpha> function0 = new Function0<RippleAlpha>() { // from class: androidx.compose.material.DelegatingThemeAwareRippleNode$attachNewRipple$calculateRippleAlpha$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal2 = RippleKt.f1315a;
                    DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode2 = delegatingThemeAwareRippleNode;
                    return ((Colors) CompositionLocalConsumerModifierNodeKt.a(delegatingThemeAwareRippleNode2, ColorsKt.f1254a)).h() ? ((double) ColorKt.i(((Color) CompositionLocalConsumerModifierNodeKt.a(delegatingThemeAwareRippleNode2, ContentColorKt.f1261a)).f1766a)) > 0.5d ? RippleKt.d : RippleKt.e : RippleKt.f;
                }
            };
            InteractionSource interactionSource = delegatingThemeAwareRippleNode.t;
            boolean z = delegatingThemeAwareRippleNode.u;
            float f = delegatingThemeAwareRippleNode.v;
            TweenSpec tweenSpec = androidx.compose.material.ripple.RippleKt.f1390a;
            AndroidRippleNode androidRippleNode2 = new AndroidRippleNode(interactionSource, z, f, colorProducer, function0);
            delegatingThemeAwareRippleNode.s2(androidRippleNode2);
            delegatingThemeAwareRippleNode.x = androidRippleNode2;
        }
        return Unit.f24250a;
    }
}
