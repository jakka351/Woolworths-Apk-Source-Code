package au.com.woolworths.shop.checkout.ui.components.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerType;
import au.com.woolworths.shop.cart.ui.productreview.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.shop.checkout.ui.components.compose.ComposableSingletons$SubstitutionOnboardingBannerKt$lambda$-1891611137$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$SubstitutionOnboardingBannerKt$lambda$1891611137$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$SubstitutionOnboardingBannerKt$lambda$1891611137$1 d = new ComposableSingletons$SubstitutionOnboardingBannerKt$lambda$1891611137$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            BroadcastBannerData broadcastBannerData = new BroadcastBannerData("Choose your substitutions", "Edit your substitutions in case your item is out of stock.", null, null, null, BroadcastBannerType.PRIMARY, "", Boolean.TRUE, "123");
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new h(18);
                composer.A(objG);
            }
            Function1 function1 = (Function1) objG;
            Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new au.com.woolworths.android.onesite.deeplink.h(20);
                composer.A(objE);
            }
            composer.l();
            SubstitutionOnboardingBannerKt.a(broadcastBannerData, function1, (Function0) objE, composer, 432);
        }
        return Unit.f24250a;
    }
}
