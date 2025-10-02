package au.com.woolworths.design.wx.foundation;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material.ContentColorKt;
import androidx.compose.material.RippleConfiguration;
import androidx.compose.material.RippleKt;
import androidx.compose.material.ripple.AndroidRippleNode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ DelegatingThemeAwareRippleNode e;

    public /* synthetic */ b(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode, int i) {
        this.d = i;
        this.e = delegatingThemeAwareRippleNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        final DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode = this.e;
        switch (i) {
            case 0:
                if (((RippleConfiguration) CompositionLocalConsumerModifierNodeKt.a(delegatingThemeAwareRippleNode, RippleKt.f1315a)) == null) {
                    AndroidRippleNode androidRippleNode = delegatingThemeAwareRippleNode.x;
                    if (androidRippleNode != null) {
                        delegatingThemeAwareRippleNode.t2(androidRippleNode);
                    }
                    delegatingThemeAwareRippleNode.x = null;
                } else if (delegatingThemeAwareRippleNode.x == null) {
                    ColorProducer colorProducer = new ColorProducer() { // from class: au.com.woolworths.design.wx.foundation.DelegatingThemeAwareRippleNode$attachNewRipple$calculateColor$1
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
                            return ((Color) CompositionLocalConsumerModifierNodeKt.a(delegatingThemeAwareRippleNode2, ContentColorKt.f1261a)).f1766a;
                        }
                    };
                    b bVar = new b(delegatingThemeAwareRippleNode, 1);
                    InteractionSource interactionSource = delegatingThemeAwareRippleNode.t;
                    boolean z = delegatingThemeAwareRippleNode.u;
                    float f = delegatingThemeAwareRippleNode.v;
                    TweenSpec tweenSpec = androidx.compose.material.ripple.RippleKt.f1390a;
                    AndroidRippleNode androidRippleNode2 = new AndroidRippleNode(interactionSource, z, f, colorProducer, bVar);
                    delegatingThemeAwareRippleNode.s2(androidRippleNode2);
                    delegatingThemeAwareRippleNode.x = androidRippleNode2;
                }
                return Unit.f24250a;
            default:
                return ((double) ColorKt.i(((Color) CompositionLocalConsumerModifierNodeKt.a(delegatingThemeAwareRippleNode, ContentColorKt.f1261a)).f1766a)) > 0.5d ? RippleKt.d : RippleKt.e;
        }
    }
}
