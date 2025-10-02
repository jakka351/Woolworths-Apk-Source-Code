package au.com.woolworths.feature.shop.inbox.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.markdown.RichTextMarkdownKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.feature.shop.inbox.ui.ComposableSingletons$TermsAndConditionsScreenKt$lambda$-1173400343$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$TermsAndConditionsScreenKt$lambda$1173400343$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$TermsAndConditionsScreenKt$lambda$1173400343$1 d = new ComposableSingletons$TermsAndConditionsScreenKt$lambda$1173400343$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            RichTextMarkdownKt.b("To redeem $10 off your order you must spend $160 or more (the qualifying amount) at www.woolworths.com.au or in the Woolworths app in a single transaction using Pick up, Direct to boot or Delivery before 23:59 AEDT 06/10/2022 and enter promo code SHOP10 at the checkout before completing your transaction. Minimum spend in a single transaction of $30 for Pick up (excluding bag fee) and $50 for Delivery (excluding delivery fee, bag fee or crate service fee) applies to shopping at Woolworths Online. Promo code valid only once and can only be redeemed by the customer targeted with this promotion. Cannot be used in conjunction with any other offer. Orders may be cancelled by us without notice to you if these terms and conditions are not adhered to. Qualifying amount excludes any vouchers or offers, delivery charges, bag and crate service fees for Direct to boot, Pick up and Delivery orders, Delivery Unlimited items, Everyday Market from Woolworths items, Metro60 items,tobacco/smoking products, gift cards, egift cards, mobile recharge, travel cards and tickets and Pre-order Kiosks. \n\nIn addition to the above terms and conditions, the Woolworths Online terms and conditions apply which can be viewed at https://www.woolworths.com.au/shop/discover/about-us/terms-and-conditions", null, null, false, composer, 6, 14);
        }
        return Unit.f24250a;
    }
}
