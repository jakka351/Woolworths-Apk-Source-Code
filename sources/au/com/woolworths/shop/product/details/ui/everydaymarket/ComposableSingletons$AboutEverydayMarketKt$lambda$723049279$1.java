package au.com.woolworths.shop.product.details.ui.everydaymarket;

import androidx.compose.runtime.Composer;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.base.shopapp.data.models.InfoSectionFooter;
import au.com.woolworths.base.shopapp.data.models.InfoSectionItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$AboutEverydayMarketKt$lambda$723049279$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            InfoSection infoSection = new InfoSection("About Everyday Market", CollectionsKt.R(new InfoSectionItem("What is Everyday Market?", "Everyday Market from Woolworths is an online marketplace where you can shop hundreds of new and unexpected brands all in one place. Discover thousands of products from our extended range sold and supplied by our Everyday Market Partners.", "https://uatcdn0.woolworths.media/content/mobile/marketplace/info/ic-delivery.png"), new InfoSectionItem("Will my Everyday Market items be delivered with my groceries?", "Everyday Market orders are shipped separately from your Woolworths groceries by our Everyday Market partners. You will be notified on the progress of your order via email.", "https://uatcdn0.woolworths.media/content/mobile/marketplace/info/ic-shipping_fee.png"), new InfoSectionItem("Can I collect Everyday Rewards points?", "Yes! You'll collect a minimum of 1 point for every dollar you spend on Everyday Market items. Exclusions apply.", "https://uatcdn0.woolworths.media/content/mobile/marketplace/info/ic-em-circle.png")), new InfoSectionFooter("Have more questions?", "Visit our website", "https://www.woolworths.com.au"));
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new h(20);
                composer.A(objG);
            }
            composer.l();
            AboutEverydayMarketKt.c(infoSection, (Function0) objG, null, composer, 48);
        }
        return Unit.f24250a;
    }
}
