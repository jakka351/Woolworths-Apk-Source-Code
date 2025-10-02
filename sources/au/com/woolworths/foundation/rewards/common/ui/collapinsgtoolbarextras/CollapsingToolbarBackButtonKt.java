package au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.d;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"common-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CollapsingToolbarBackButtonKt {
    public static final void a(int i, Composer composer, Modifier modifier, final Function0 onBackClick, boolean z) {
        Intrinsics.h(onBackClick, "onBackClick");
        ComposerImpl composerImplV = composer.v(-378158176);
        int i2 = (composerImplV.p(z) ? 4 : 2) | i | 48 | (composerImplV.I(onBackClick) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Boolean boolValueOf = Boolean.valueOf(z);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new a(0);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier.Companion companion = Modifier.Companion.d;
            AnimatedContentKt.b(boolValueOf, companion, (Function1) objG, null, "navIconAnimation", null, ComposableLambdaKt.c(1279504957, new Function4<AnimatedContentScope, Boolean, Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras.CollapsingToolbarBackButtonKt$CollapsingToolbarBackButton$2

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras.CollapsingToolbarBackButtonKt$CollapsingToolbarBackButton$2$1, reason: invalid class name */
                final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer = (Composer) obj;
                        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                            composer.j();
                        } else {
                            IconKt.b(ArrowBackKt.a(), "Navigate up", null, 0L, composer, 48, 12);
                        }
                        return Unit.f24250a;
                    }
                }

                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    AnimatedContentScope AnimatedContent = (AnimatedContentScope) obj;
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    Composer composer2 = (Composer) obj3;
                    ((Number) obj4).intValue();
                    Intrinsics.h(AnimatedContent, "$this$AnimatedContent");
                    if (zBooleanValue) {
                        composer2.o(-102519142);
                        IconButtonKt.a(onBackClick, null, false, ComposableLambdaKt.c(111927731, new AnonymousClass1(), composer2), composer2, 3072, 6);
                        composer2.l();
                    } else {
                        composer2.o(-102264911);
                        RoundedCornerShape roundedCornerShapeB = RoundedCornerShapeKt.b(200);
                        float f = 6;
                        Modifier modifierA = ClipKt.a(BackgroundKt.b(SizeKt.q(PaddingKt.f(Modifier.Companion.d, f), 36), Color.b(Color.b, 0.38f), roundedCornerShapeB), roundedCornerShapeB);
                        composer2.o(5004770);
                        Function0 function0 = onBackClick;
                        boolean zN = composer2.n(function0);
                        Object objG2 = composer2.G();
                        if (zN || objG2 == Composer.Companion.f1624a) {
                            objG2 = new k(12, function0);
                            composer2.A(objG2);
                        }
                        composer2.l();
                        IconKt.b(ArrowBackKt.a(), "Navigate up", PaddingKt.f(ClickableKt.d(modifierA, false, null, null, (Function0) objG2, 7), f), Color.f, composer2, 3120, 0);
                        composer2.l();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, (i2 & 14) | 1597872, 40);
            modifier = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(z, modifier, onBackClick, i);
        }
    }
}
