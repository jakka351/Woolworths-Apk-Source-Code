package au.com.woolworths.feature.shop.banners.imagetextbanner;

import androidx.compose.runtime.Composer;
import au.com.woolworths.feature.shop.banners.imagetextbanner.data.ImageTextBanner;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.feature.shop.banners.imagetextbanner.ComposableSingletons$ImageTextBannerUiKt$lambda$-1562912209$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$ImageTextBannerUiKt$lambda$1562912209$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ImageTextBannerUiKt.a(new ImageTextBanner("https://uatcdn0.woolworths.media/content/wowproductimages/medium/747212.jpg", "It is illegal to sell tobacco products to a person under 18 and it is illegal to purchase a tobacco product for use by a person under 18."), null, BitmapDescriptorFactory.HUE_RED, composer, 0, 6);
        }
        return Unit.f24250a;
    }
}
