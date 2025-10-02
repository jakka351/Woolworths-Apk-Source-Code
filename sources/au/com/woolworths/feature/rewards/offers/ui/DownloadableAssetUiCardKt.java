package au.com.woolworths.feature.rewards.offers.ui;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.design.wx.component.CardKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.i;
import au.com.woolworths.foundation.rewards.common.ui.home.HomepageStyle;
import au.com.woolworths.foundation.rewards.common.ui.home.HomepageStyleKt;
import au.com.woolworths.sdui.legacy.downloadableasset.DownloadableAssetUiKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class DownloadableAssetUiCardKt {
    public static final void a(final DownloadableAsset downloadableAsset, Function0 onBannerClick, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Intrinsics.h(onBannerClick, "onBannerClick");
        ComposerImpl composerImplV = composer.v(106175443);
        int i2 = i | (composerImplV.I(downloadableAsset) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onBannerClick) ? 32 : 16;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            composerImplV.o(5004770);
            boolean zI = composerImplV.I(downloadableAsset);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$1) {
                objG = new i(downloadableAsset, 1);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            modifier2 = modifier;
            Modifier modifierA = SemanticsModifierKt.a(modifier2, (Function1) objG);
            composerImplV.o(5004770);
            boolean z = (i2 & 112) == 32;
            Object objG2 = composerImplV.G();
            if (z || objG2 == composer$Companion$Empty$1) {
                objG2 = new au.com.woolworths.design.core.ui.component.experimental.dialog.a(20, onBannerClick);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            CardKt.a(ClickableKt.d(modifierA, false, null, null, (Function0) objG2, 7), null, 0L, 0L, null, HomepageStyleKt.a((HomepageStyle) composerImplV.x(HomepageStyleKt.f8583a)), ComposableLambdaKt.c(621868214, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.ui.DownloadableAssetUiCardKt$DownloadableAssetUiCard$3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        DownloadableAssetUiKt.b(downloadableAsset, null, false, false, false, PainterResources_androidKt.a(R.drawable.ic_spin_surprise_banner_bitmap, 0, composer2), null, composer2, 0, 94);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 1572864, 30);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.c(downloadableAsset, onBannerClick, modifier2, i, 2);
        }
    }
}
