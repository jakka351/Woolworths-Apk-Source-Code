package au.com.woolworths.foundation.ui.couponbanner;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.modules.couponbanner.CouponBannerTermsAndConditions;
import au.com.woolworths.android.onesite.modules.couponbanner.EverydayMarketCouponBannerColorTheme;
import au.com.woolworths.android.onesite.modules.couponbanner.EverydayMarketCouponBannerData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.foundation.ui.couponbanner.ComposableSingletons$EverydayMarketCouponBannerKt$lambda$-39504368$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$EverydayMarketCouponBannerKt$lambda$39504368$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$EverydayMarketCouponBannerKt$lambda$39504368$1 d = new ComposableSingletons$EverydayMarketCouponBannerKt$lambda$39504368$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            EverydayMarketCouponBannerData everydayMarketCouponBannerData = new EverydayMarketCouponBannerData(EverydayMarketCouponBannerColorTheme.d, "Use code for $10 off your first Everyday Market order", "ASC1D4", null, "", null, null, new CouponBannerTermsAndConditions("https://www.woolworths.com.au/shop/everyday-market", "Min spend $100. T&Cs apply.", null));
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.foundation.shop.olive.voice.ui.search.a(11);
                composer.A(objG);
            }
            Function1 function1 = (Function1) objG;
            Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new au.com.woolworths.foundation.shop.olive.voice.ui.permission.a(3);
                composer.A(objE);
            }
            composer.l();
            EverydayMarketCouponBannerKt.a(everydayMarketCouponBannerData, function1, (Function2) objE, Modifier.Companion.d, composer, 3504);
        }
        return Unit.f24250a;
    }
}
