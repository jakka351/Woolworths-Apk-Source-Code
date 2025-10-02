package au.com.woolworths.feature.rewards.offers.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.feature.rewards.offers.StandardBannerViewItem;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class StandardBannerSectionKt {
    public static final void a(StandardBannerViewItem banner, Function1 onBannerClick, Function1 function1, Composer composer, int i) {
        Function1 trackStandardBannerImpression = function1;
        Intrinsics.h(banner, "banner");
        Intrinsics.h(onBannerClick, "onBannerClick");
        Intrinsics.h(trackStandardBannerImpression, "trackStandardBannerImpression");
        ComposerImpl composerImplV = composer.v(-2048537119);
        int i2 = i | (composerImplV.n(banner) ? 4 : 2) | (composerImplV.I(onBannerClick) ? 32 : 16) | (composerImplV.I(trackStandardBannerImpression) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            float f = 16;
            Modifier modifierJ = PaddingKt.j(PaddingKt.h(Modifier.Companion.d, f, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, 7);
            String str = banner.d;
            String str2 = banner.c;
            String str3 = banner.g;
            String str4 = banner.e;
            String str5 = banner.h;
            composerImplV.o(-1633490746);
            int i3 = i2 & 14;
            boolean z = ((i2 & 112) == 32) | (i3 == 4);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z || objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.feature.rewards.card.overlay.ui.b(14, onBannerClick, banner);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            StandardBannerKt.a(str, str2, str3, str4, str5, (Function0) objG, modifierJ, 0L, composerImplV, 1572864, 128);
            String str6 = banner.b;
            String str7 = banner.c;
            composerImplV.o(-1633490746);
            boolean z2 = ((i2 & 896) == 256) | (i3 == 4);
            Object objG2 = composerImplV.G();
            if (z2 || objG2 == composer$Companion$Empty$1) {
                trackStandardBannerImpression = function1;
                objG2 = new StandardBannerSectionKt$StandardBannerSection$2$1(trackStandardBannerImpression, banner, null);
                composerImplV.A(objG2);
            } else {
                trackStandardBannerImpression = function1;
            }
            composerImplV.V(false);
            EffectsKt.f(str6, str7, (Function2) objG2, composerImplV);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.button.internal.a(banner, onBannerClick, trackStandardBannerImpression, i, 10);
        }
    }
}
