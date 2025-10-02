package au.com.woolworths.foundation.shop.nhp.ui.pp;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.foundation.shop.nhp.model.ImageWithAltData;
import au.com.woolworths.foundation.shop.nhp.model.personalisedproducts.PersonalisedProductsBannerData;
import au.com.woolworths.foundation.shop.nhp.model.personalisedproducts.ProductInBannerData;
import au.com.woolworths.foundation.shop.nhp.ui.edr.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$PersonalisedProductsBannerKt$lambda$385352858$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            PersonalisedProductsBannerData personalisedProductsBannerData = new PersonalisedProductsBannerData("Weekly specials just for you", "#3A474E", "#CAEB6D", new ImageWithAltData("banner-image-url", "Specials roundel"), CollectionsKt.R(new ProductInBannerData("1", "Product 1", "product-image-url-1"), new ProductInBannerData("2", "Product 2", "product-image-url-2"), new ProductInBannerData("3", "Product 3", "product-image-url-3"), new ProductInBannerData("4", "Product 4", "product-image-url-4")), null, null, null);
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new c(1);
                composer.A(objG);
            }
            Function1 function1 = (Function1) objG;
            Object objE = a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new c(2);
                composer.A(objE);
            }
            composer.l();
            PersonalisedProductsBannerKt.a(personalisedProductsBannerData, function1, (Function1) objE, PaddingKt.f(Modifier.Companion.d, 16), composer, 3504);
        }
        return Unit.f24250a;
    }
}
