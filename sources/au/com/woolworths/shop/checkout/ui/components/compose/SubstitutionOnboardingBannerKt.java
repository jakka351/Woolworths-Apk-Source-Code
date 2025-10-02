package au.com.woolworths.shop.checkout.ui.components.compose;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.res.PainterResources_androidKt;
import au.com.woolworths.compose.utils.graphics.ForwardingPainterKt;
import au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerKt;
import au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerType;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "isBannerVisible", "shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SubstitutionOnboardingBannerKt {
    public static final void a(final BroadcastBannerData bannerData, final Function1 onDismissClick, Function0 onBannerDisplayed, Composer composer, int i) {
        Intrinsics.h(bannerData, "bannerData");
        Intrinsics.h(onDismissClick, "onDismissClick");
        Intrinsics.h(onBannerDisplayed, "onBannerDisplayed");
        ComposerImpl composerImplV = composer.v(-27324201);
        int i2 = (composerImplV.I(bannerData) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onDismissClick) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onBannerDisplayed) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotStateKt.f(Boolean.TRUE);
                composerImplV.A(objG);
            }
            final MutableState mutableState = (MutableState) objG;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean z = (i2 & 896) == 256;
            Object objG2 = composerImplV.G();
            if (z || objG2 == composer$Companion$Empty$1) {
                objG2 = new SubstitutionOnboardingBannerKt$SubstitutionOnboardingBanner$1$1(onBannerDisplayed, null);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, Unit.f24250a, (Function2) objG2);
            AnimatedVisibilityKt.d(((Boolean) mutableState.getD()).booleanValue(), null, EnterExitTransitionKt.e(AnimationSpecKt.e(0, 0, null, 6), 2), EnterExitTransitionKt.f(AnimationSpecKt.e(400, 0, null, 6), 2), null, ComposableLambdaKt.c(-603171585, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.components.compose.SubstitutionOnboardingBannerKt$SubstitutionOnboardingBanner$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
                    Composer composer2 = (Composer) obj2;
                    ((Number) obj3).intValue();
                    Intrinsics.h(AnimatedVisibility, "$this$AnimatedVisibility");
                    Painter painterA = ForwardingPainterKt.a(PainterResources_androidKt.a(R.drawable.wapple_grey, 0, composer2), ColorFilter.Companion.a(CoreTheme.b(composer2).e.c.c.f4855a), null, 10);
                    BroadcastBannerType broadcastBannerType = BroadcastBannerType.d;
                    BroadcastBannerData broadcastBannerData = bannerData;
                    String title = broadcastBannerData.getTitle();
                    String subtitle = broadcastBannerData.getSubtitle();
                    String imageUrl = broadcastBannerData.getImageUrl();
                    Modifier modifierF = PaddingKt.f(Modifier.Companion.d, 16);
                    composer2.o(-1746271574);
                    boolean zI = composer2.I(broadcastBannerData);
                    Object obj4 = onDismissClick;
                    boolean zN = zI | composer2.n(obj4);
                    Object objG3 = composer2.G();
                    if (zN || objG3 == Composer.Companion.f1624a) {
                        objG3 = new androidx.work.impl.utils.c(23, broadcastBannerData, obj4, mutableState);
                        composer2.A(objG3);
                    }
                    composer2.l();
                    BroadcastBannerKt.a(broadcastBannerType, title, imageUrl, modifierF, painterA, null, (Function0) objG3, subtitle, null, composer2, 3078, 288);
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 200064, 18);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.trafficdrivers.ui.a(bannerData, onDismissClick, onBannerDisplayed, i, 19);
        }
    }
}
