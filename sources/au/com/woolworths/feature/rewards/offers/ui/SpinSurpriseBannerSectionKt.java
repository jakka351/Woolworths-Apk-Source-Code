package au.com.woolworths.feature.rewards.offers.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.feature.rewards.offers.SpinSurpriseBannerViewItem;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SpinSurpriseBannerSectionKt {
    public static final void a(SpinSurpriseBannerViewItem banner, Function1 onBannerClick, Function1 trackSpinSurpriseBannerImpression, Composer composer, int i) {
        Intrinsics.h(banner, "banner");
        Intrinsics.h(onBannerClick, "onBannerClick");
        Intrinsics.h(trackSpinSurpriseBannerImpression, "trackSpinSurpriseBannerImpression");
        ComposerImpl composerImplV = composer.v(-28074669);
        int i2 = i | (composerImplV.I(banner) ? 4 : 2) | (composerImplV.I(onBannerClick) ? 32 : 16) | (composerImplV.I(trackSpinSurpriseBannerImpression) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            DownloadableAsset downloadableAsset = banner.c;
            float f = 16;
            Modifier modifierJ = PaddingKt.j(PaddingKt.h(Modifier.Companion.d, f, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, 7);
            composerImplV.o(-1633490746);
            boolean zI = ((i2 & 112) == 32) | composerImplV.I(banner);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.feature.rewards.card.overlay.ui.b(13, onBannerClick, banner);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            DownloadableAssetUiCardKt.a(downloadableAsset, (Function0) objG, modifierJ, composerImplV, KyberEngine.KyberPolyBytes);
            String str = banner.b;
            String str2 = banner.d;
            composerImplV.o(-1633490746);
            boolean zI2 = composerImplV.I(banner) | ((i2 & 896) == 256);
            Object objG2 = composerImplV.G();
            if (zI2 || objG2 == composer$Companion$Empty$1) {
                objG2 = new SpinSurpriseBannerSectionKt$SpinSurpriseBannerSection$2$1(trackSpinSurpriseBannerImpression, banner, null);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            EffectsKt.f(str, str2, (Function2) objG2, composerImplV);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.button.internal.a(banner, onBannerClick, trackSpinSurpriseBannerImpression, i, 9);
        }
    }
}
