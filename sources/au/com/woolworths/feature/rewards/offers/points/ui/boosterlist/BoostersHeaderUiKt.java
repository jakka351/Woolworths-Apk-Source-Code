package au.com.woolworths.feature.rewards.offers.points.ui.boosterlist;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnitKt;
import au.com.woolworths.compose.utils.layout.FillerKt;
import au.com.woolworths.compose.utils.modifier.ClickableIncreasedBoundsKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.product.list.compose.d;
import au.com.woolworths.feature.rewards.offers.data.BoostersHeaderAddOn;
import au.com.woolworths.foundation.rewards.onboarding.ui.OnboardingCoachMarkKt;
import au.com.woolworths.rewards.base.coachmark.data.HomeCoachMarkElement;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BoostersHeaderUiKt {
    public static final void a(final String str, Modifier modifier, Function1 function1, BoostersHeaderAddOn boostersHeaderAddOn, Composer composer, int i) {
        int i2;
        ComposerImpl composerImpl;
        boolean z;
        ComposerImpl composerImplV = composer.v(1283734890);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerImplV.n(boostersHeaderAddOn) : composerImplV.I(boostersHeaderAddOn) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            OnboardingCoachMarkKt.a(HomeCoachMarkElement.BoosterHeader.INSTANCE.getId(), null, ComposableLambdaKt.c(-1804482867, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.BoostersHeaderUiKt$BoostersHeaderUi$2$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        TextKt.b(str, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer2).i, composer2, 0, 0, 65534);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, KyberEngine.KyberPolyBytes);
            FillerKt.a(null, composerImplV, 6);
            if (boostersHeaderAddOn instanceof BoostersHeaderAddOn.Text) {
                composerImplV.o(-1293812152);
                z = true;
                TextKt.b(((BoostersHeaderAddOn.Text) boostersHeaderAddOn).f6271a, null, WxTheme.a(composerImplV).c(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).n, composerImplV, 0, 0, 65530);
                composerImpl = composerImplV;
                composerImpl.V(false);
            } else {
                composerImpl = composerImplV;
                z = true;
                if (boostersHeaderAddOn instanceof BoostersHeaderAddOn.Cta) {
                    composerImpl.o(-1293558882);
                    BoostersHeaderAddOn.Cta cta = (BoostersHeaderAddOn.Cta) boostersHeaderAddOn;
                    String upperCase = cta.f6270a.toUpperCase(Locale.ROOT);
                    Intrinsics.g(upperCase, "toUpperCase(...)");
                    TextStyle textStyleA = TextStyle.a(WxTheme.b(composerImpl).q, 0L, 0L, null, null, TextUnitKt.b(0.25d), 0L, null, null, 0, 16777087);
                    long jH = WxTheme.a(composerImpl).h();
                    float f = 16;
                    composerImpl.o(-1633490746);
                    boolean z2 = ((i2 & 7168) == 2048 || ((i2 & 4096) != 0 && composerImpl.I(boostersHeaderAddOn))) | ((i2 & 896) == 256);
                    Object objG = composerImpl.G();
                    if (z2 || objG == Composer.Companion.f1624a) {
                        objG = new au.com.woolworths.feature.rewards.card.overlay.ui.b(12, function1, cta);
                        composerImpl.A(objG);
                    }
                    composerImpl.V(false);
                    TextKt.b(upperCase, ClickableIncreasedBoundsKt.a(Modifier.Companion.d, f, (Function0) objG), jH, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleA, composerImpl, 0, 0, 65528);
                    composerImpl = composerImpl;
                    composerImpl.V(false);
                } else {
                    if (boostersHeaderAddOn != null) {
                        throw au.com.woolworths.android.onesite.a.w(2036472826, composerImpl, false);
                    }
                    composerImpl.o(2036496562);
                    composerImpl.V(false);
                }
            }
            composerImpl.V(z);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(str, modifier, function1, boostersHeaderAddOn, i, 10);
        }
    }
}
