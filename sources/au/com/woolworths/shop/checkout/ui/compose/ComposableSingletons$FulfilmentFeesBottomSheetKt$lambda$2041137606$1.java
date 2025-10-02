package au.com.woolworths.shop.checkout.ui.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.sdui.common.IconAsset;
import au.com.woolworths.sdui.common.corerow.model.CoreRowModel;
import au.com.woolworths.shop.aem.components.model.paragraph.ParagraphTextItemData;
import au.com.woolworths.shop.aem.components.model.paragraph.ParagraphTextItemType;
import au.com.woolworths.shop.checkout.domain.model.CheckoutTermsConditions;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentExtraInfo;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentInfoRowAccordion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.shop.checkout.ui.compose.ComposableSingletons$FulfilmentFeesBottomSheetKt$lambda$-2041137606$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$FulfilmentFeesBottomSheetKt$lambda$2041137606$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$FulfilmentFeesBottomSheetKt$lambda$2041137606$1 d = new ComposableSingletons$FulfilmentFeesBottomSheetKt$lambda$2041137606$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            CoreRowModel coreRowModel = new CoreRowModel(null, new IconAsset.CoreIcon("icon.navigation.chevron-right"), null, "Delivery Now", null, null);
            ParagraphTextItemType paragraphTextItemType = ParagraphTextItemType.d;
            FulfilmentExtraInfo fulfilmentExtraInfo = new FulfilmentExtraInfo("Delivery options", CollectionsKt.R(new FulfilmentInfoRowAccordion(coreRowModel, false, false, new ParagraphTextItemData(null, "- Maximum of 50 items can be purchased\n- Delivered by Partner Drivers\n- Restricted products like alcohol or tobacco cannot be bought\n- Delivery Now and 1 hr windows are not always available, nor available in all areas\n- If you are a Delivery Saver customer, Delivery Now is not included in your subscription, the full cost is applicable\n- You will get an SMS with live order tracking once your order is on the way\n- Delivery Now orders are delivered in 90 minutes or less\n- You cannot make changes or cancel your orders once made with Delivery Now", paragraphTextItemType), null, null), new FulfilmentInfoRowAccordion(new CoreRowModel(null, new IconAsset.CoreIcon("icon.navigation.chevron-right"), null, "1h windows", null, null), false, false, new ParagraphTextItemData(null, "- Maximum of 50 items can be purchased\n- Delivered by Partner Drivers\n- Restricted products like alcohol or tobacco cannot be bought\n- 1-hr windows are not always available, nor available in all areas\n- If you are a Delivery Saver customer, 1-hr windows are not included in your subscription, the full cost is applicable\n- You will get an SMS with live order tracking once your order is on the way", paragraphTextItemType), null, null), new FulfilmentInfoRowAccordion(new CoreRowModel(null, new IconAsset.CoreIcon("icon.navigation.chevron-right"), null, "2hr 30min windows", null, null), false, false, new ParagraphTextItemData(null, "These fees apply to normal order sizes for your household or office. We may charge more for extra-large orders. We'll tell you before changing your fee.\n\nYour total spend, which sets your fee, does not include:\n- tobacco\n- tobacco-related products\n- gift cards, and\n- the bag charge.", paragraphTextItemType), null, null), new CheckoutTermsConditions("**Terms and Conditions**\n\nThese fees apply to normal order sizes for your household or office. We may charge more for extra-large orders. We'll tell you before changing your fee.\n\nYour total spend, which sets your fee, does not include:\n- tobacco\n- tobacco-related products\n- gift cards, and\n- the bag charge.")));
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
                objE = new au.com.woolworths.shop.cart.ui.productreview.h(21);
                composer.A(objE);
            }
            Function1 function1 = (Function1) objE;
            Object objE2 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE2 == composer$Companion$Empty$1) {
                objE2 = new au.com.woolworths.shop.cart.ui.productreview.h(22);
                composer.A(objE2);
            }
            composer.l();
            FulfilmentFeesBottomSheetKt.b(fulfilmentExtraInfo, function0, function1, (Function1) objE2, null, composer, 3504);
        }
        return Unit.f24250a;
    }
}
