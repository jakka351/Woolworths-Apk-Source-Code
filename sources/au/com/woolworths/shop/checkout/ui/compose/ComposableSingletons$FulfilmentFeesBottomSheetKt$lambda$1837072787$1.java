package au.com.woolworths.shop.checkout.ui.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.sdui.common.IconAsset;
import au.com.woolworths.sdui.common.broadcastbanner.model.CoreBroadcastBannerModel;
import au.com.woolworths.sdui.common.broadcastbanner.model.CoreBroadcastBannerStyle;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.model.action.ActionType;
import au.com.woolworths.sdui.shop.broadcastbanner.model.BasicCoreBroadcastBannerModel;
import au.com.woolworths.shop.checkout.domain.model.CheckoutTermsConditions;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentExtraInfo;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentFeeItem;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentFeePriceInfo;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentFeesInfoSection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$FulfilmentFeesBottomSheetKt$lambda$1837072787$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$FulfilmentFeesBottomSheetKt$lambda$1837072787$1 d = new ComposableSingletons$FulfilmentFeesBottomSheetKt$lambda$1837072787$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            FulfilmentExtraInfo fulfilmentExtraInfo = new FulfilmentExtraInfo("Delivery fees", CollectionsKt.R(new FulfilmentFeesInfoSection(null, CollectionsKt.R(new FulfilmentFeeItem("Delivery Now", "50-item limit", CollectionsKt.Q(new FulfilmentFeePriceInfo("$19", null))), new FulfilmentFeeItem("1hr windows", "50-item limit", CollectionsKt.Q(new FulfilmentFeePriceInfo("$16", null))), new FulfilmentFeeItem("2hr 30min windows", "No item limit", CollectionsKt.R(new FulfilmentFeePriceInfo("$14", "For orders up to $199.99"), new FulfilmentFeePriceInfo("$9", "For orders $200 and over"))))), new FulfilmentFeesInfoSection(null, CollectionsKt.Q(new FulfilmentFeeItem("Pack my order in paper bags", "Applies to each delivery order", CollectionsKt.Q(new FulfilmentFeePriceInfo("$1.50", "per order"))))), new BasicCoreBroadcastBannerModel("10000", new CoreBroadcastBannerModel("Save on delivery fees", "Get unlimited deliveries on orders over $80 for $23 a month. Cancel anytime.", CoreBroadcastBannerStyle.f, new IconAsset.HostedIcon("https://www.nicepng.com/png/detail/356-3563301_instagram-instagram-circle-icon.png")), "Start my 30-day free trial", new ActionData("com.woolworths.shop://deliveryunlimited/subscribe", ActionType.e, "1", null), null, null, false), new CheckoutTermsConditions("**Terms and Conditions**\n\nThese fees apply to normal order sizes for your household or office. We may charge more for extra-large orders. We'll tell you before changing your fee.\n\nYour total spend, which sets your fee, does not include:\n- tobacco\n- tobacco-related products\n- gift cards, and\n- the bag charge.")));
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.android.onesite.deeplink.h(20);
                composer.A(objG);
            }
            Function0 function0 = (Function0) objG;
            Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new au.com.woolworths.shop.cart.ui.productreview.h(25);
                composer.A(objE);
            }
            Function1 function1 = (Function1) objE;
            Object objE2 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE2 == composer$Companion$Empty$1) {
                objE2 = new au.com.woolworths.shop.cart.ui.productreview.h(26);
                composer.A(objE2);
            }
            composer.l();
            FulfilmentFeesBottomSheetKt.b(fulfilmentExtraInfo, function0, function1, (Function1) objE2, null, composer, 3504);
        }
        return Unit.f24250a;
    }
}
