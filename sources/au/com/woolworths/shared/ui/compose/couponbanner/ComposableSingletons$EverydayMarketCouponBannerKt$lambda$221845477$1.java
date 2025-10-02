package au.com.woolworths.shared.ui.compose.couponbanner;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.android.onesite.modules.couponbanner.EverydayMarketCouponBannerColorTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.shared.ui.compose.couponbanner.ComposableSingletons$EverydayMarketCouponBannerKt$lambda$-221845477$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$EverydayMarketCouponBannerKt$lambda$221845477$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$EverydayMarketCouponBannerKt$lambda$221845477$1 d = new ComposableSingletons$EverydayMarketCouponBannerKt$lambda$221845477$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            EverydayMarketCouponBannerColorTheme everydayMarketCouponBannerColorTheme = EverydayMarketCouponBannerColorTheme.d;
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.foundation.shop.olive.voice.ui.permission.a(8);
                composer.A(objG);
            }
            Function2 function2 = (Function2) objG;
            Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new au.com.woolworths.sdui.legacy.banner.c(12);
                composer.A(objE);
            }
            composer.l();
            EverydayMarketCouponBannerKt.a("Use code for $10 off your first Everyday Market order", "ABD24DS", "Min spend $100.", "T&Cs apply", "https://www.woolworths.com.au/shop/everyday-market", "A,B,D,2,4,D,S", "https://cdn0.woolworths.media/content/promotiontags/em-coupon-image.png", everydayMarketCouponBannerColorTheme, function2, (Function1) objE, null, composer, 920350134, 0, 1024);
        }
        return Unit.f24250a;
    }
}
