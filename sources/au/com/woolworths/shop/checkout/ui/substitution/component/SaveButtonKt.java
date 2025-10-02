package au.com.woolworths.shop.checkout.ui.substitution.component;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.core.ui.component.stable.SurfaceKt;
import au.com.woolworths.design.core.ui.component.stable.button.PrimaryButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.ui.f;
import au.com.woolworths.shop.checkout.ui.substitution.SubstitutionContract;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SaveButtonKt {
    public static final void a(final Function0 function0, boolean z, final boolean z2, Composer composer, final int i) {
        final boolean z3;
        ComposerImpl composerImplV = composer.v(630234949);
        int i2 = (composerImplV.I(function0) ? 4 : 2) | i | (composerImplV.p(z) ? 32 : 16) | (composerImplV.p(z2) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            z3 = z;
        } else {
            Modifier modifierE = SizeKt.e(Modifier.Companion.d, 1.0f);
            String strC = StringResources_androidKt.c(composerImplV, R.string.save_button);
            ComposableLambdaImpl composableLambdaImpl = z2 ? ComposableSingletons$SaveButtonKt.f10820a : null;
            composerImplV.o(5004770);
            boolean z4 = (i2 & 14) == 4;
            Object objG = composerImplV.G();
            if (z4 || objG == Composer.Companion.f1624a) {
                objG = new f(15, function0);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            z3 = z;
            PrimaryButtonKt.b(strC, (Function0) objG, composableLambdaImpl, modifierE, z3, null, composerImplV, ((i2 << 12) & 458752) | 27648);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(z3, z2, i) { // from class: au.com.woolworths.shop.checkout.ui.substitution.component.a
                public final /* synthetic */ boolean e;
                public final /* synthetic */ boolean f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    SaveButtonKt.a(this.d, this.e, this.f, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final Function0 onClick, final SubstitutionContract.ViewState.ButtonState buttonState, Composer composer, int i) {
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(-1611162965);
        if ((((composerImplV.I(onClick) ? 4 : 2) | i | (composerImplV.r(buttonState.ordinal()) ? 32 : 16)) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            SurfaceKt.b(SizeKt.e(Modifier.Companion.d, 1.0f), null, 0L, 0L, null, CoreTheme.c(composerImplV).e, ComposableLambdaKt.c(-996016409, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.substitution.component.SaveButtonKt$SaveButtonSection$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierG = PaddingKt.g(BackgroundKt.b(Modifier.Companion.d, CoreTheme.b(composer2).e.f4848a.c, RectangleShapeKt.f1779a), 16, 6);
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierG);
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
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        SubstitutionContract.ViewState.ButtonState buttonState2 = SubstitutionContract.ViewState.ButtonState.d;
                        SubstitutionContract.ViewState.ButtonState buttonState3 = buttonState;
                        SaveButtonKt.a(onClick, buttonState3 == buttonState2, buttonState3 == SubstitutionContract.ViewState.ButtonState.f, composer2, 0);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 30);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.rewards.common.ui.b(onClick, i, 20, buttonState);
        }
    }
}
