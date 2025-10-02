package au.com.woolworths.feature.rewards.offers.ui;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import au.com.woolworths.compose.utils.layout.FillerKt;
import au.com.woolworths.design.wx.component.CardKt;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.rewards.offers.RewardsCtaCardViewItem;
import au.com.woolworths.foundation.rewards.common.ui.home.HomepageStyle;
import au.com.woolworths.foundation.rewards.common.ui.home.HomepageStyleKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsCtaCardKt {
    public static final void a(final RewardsCtaCardViewItem rewardsCtaCardViewItem, Function0 onClick, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(535603845);
        int i2 = i | (composerImplV.I(rewardsCtaCardViewItem) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onClick) ? 32 : 16;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            CardKt.a(ClickableKt.d(SizeKt.e(modifier2, 1.0f), false, null, null, onClick, 7), null, 0L, 0L, null, HomepageStyleKt.a((HomepageStyle) composerImplV.x(HomepageStyleKt.f8583a)), ComposableLambdaKt.c(-420340542, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.ui.RewardsCtaCardKt$RewardsCtaCard$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierG = PaddingKt.g(Modifier.Companion.d, 16, 12);
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composer2, 48);
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
                        Updater.b(composer2, rowMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        TextKt.b(rewardsCtaCardViewItem.c, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer2).l, composer2, 0, 0, 65534);
                        FillerKt.a(null, composer2, 6);
                        IconKt.a(PainterResources_androidKt.a(R.drawable.ic_chevron_right, 0, composer2), null, null, WxTheme.a(composer2).d(), composer2, 48, 4);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 1572864, 30);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.c(rewardsCtaCardViewItem, onClick, modifier2, i, 3);
        }
    }
}
