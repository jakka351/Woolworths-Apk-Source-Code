package au.com.woolworths.foundation.shop.nhp.ui.edr;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.ui.Modifier;
import au.com.woolworths.foundation.shop.nhp.model.TextWithAltData;
import au.com.woolworths.foundation.shop.nhp.model.edr.EdrOfferBannerData;
import au.com.woolworths.foundation.shop.nhp.model.edr.EdrOfferBoostState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$EdrOfferBannerKt$lambda$1886953163$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            EdrOfferBannerData edrOfferBannerData = new EdrOfferBannerData("offerId", null, "linkedHashCrn", "Banner title", "Banner description", "banner icon url", null, new TextWithAltData("Boost", "Boost"), null, null, null, null);
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras.a(26);
                composer.A(objG);
            }
            Function1 function1 = (Function1) objG;
            Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras.a(27);
                composer.A(objE);
            }
            Function1 function12 = (Function1) objE;
            Object objE2 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE2 == composer$Companion$Empty$1) {
                objE2 = new au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras.a(28);
                composer.A(objE2);
            }
            composer.l();
            EdrOfferBannerKt.a(edrOfferBannerData, EdrOfferBoostState.Idle.f8782a, function1, function12, (Function1) objE2, PaddingKt.f(SizeKt.g(SizeKt.e(Modifier.Companion.d, 1.0f), 100), 16), composer, 224640);
        }
        return Unit.f24250a;
    }
}
