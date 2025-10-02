package au.com.woolworths.shop.aem.components.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.shop.aem.components.model.PillData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-aem-components_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PillKt {
    public static final void a(final PillData pillData, final Modifier modifier, final Function1 onPillClick, Composer composer, int i) {
        Intrinsics.h(onPillClick, "onPillClick");
        ComposerImpl composerImplV = composer.v(-1367164975);
        if ((((composerImplV.I(pillData) ? 4 : 2) | i | (composerImplV.I(onPillClick) ? 256 : 128)) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(1334428661, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.aem.components.ui.PillKt$Pill$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        float f = 8;
                        Modifier modifierA = ClipKt.a(BackgroundKt.b(modifier, CoreTheme.b(composer2).c.f4812a.b.b.f4819a, RoundedCornerShapeKt.b(f)), RoundedCornerShapeKt.b(f));
                        composer2.o(-1633490746);
                        Object obj3 = onPillClick;
                        boolean zN = composer2.n(obj3);
                        PillData pillData2 = pillData;
                        boolean zI = zN | composer2.I(pillData2);
                        Object objG = composer2.G();
                        if (zI || objG == Composer.Companion.f1624a) {
                            objG = new au.com.woolworths.sdui.common.alert.a(8, obj3, pillData2);
                            composer2.A(objG);
                        }
                        composer2.l();
                        Modifier modifierD = ClickableKt.d(modifierA, false, null, null, (Function0) objG, 7);
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierD);
                        ComposeUiNode.e3.getClass();
                        Function0 function0 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function0);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD2, ComposeUiNode.Companion.d);
                        TextKt.b(pillData2.d, PaddingKt.g(Modifier.Companion.d, 12, f), 0L, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, composer2, 48, 3072, 122876);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.marketplace.ui.personalised.b(pillData, modifier, onPillClick, i, 19);
        }
    }
}
