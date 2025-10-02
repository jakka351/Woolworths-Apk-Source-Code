package au.com.woolworths.shop.checkout.ui.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.base.shopapp.modules.badge.BadgeApiData;
import au.com.woolworths.base.shopapp.modules.badge.BadgeTypeApiData;
import au.com.woolworths.sdui.common.IconAsset;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentSlotSelectionOption;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentSlotSelectionOptionId;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentSlotSelectionOptionsInfo;
import java.util.List;
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
public final class ComposableSingletons$FulfilmentSelectionOptionsUiKt$lambda$1482852536$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            FulfilmentSlotSelectionOptionId fulfilmentSlotSelectionOptionId = FulfilmentSlotSelectionOptionId.d;
            IconAsset.CoreIcon coreIcon = new IconAsset.CoreIcon("icon.services.direct-to-boot");
            BadgeTypeApiData badgeTypeApiData = BadgeTypeApiData.TEMPORARY;
            List listR = CollectionsKt.R(new BadgeApiData("Direct to boot car park", badgeTypeApiData, null), new BadgeApiData("Reverse parking", badgeTypeApiData, null));
            BadgeTypeApiData badgeTypeApiData2 = BadgeTypeApiData.UNAVAILABLE;
            FulfilmentSlotSelectionOptionsInfo fulfilmentSlotSelectionOptionsInfo = new FulfilmentSlotSelectionOptionsInfo("Select Pick up option", CollectionsKt.R(new FulfilmentSlotSelectionOption(fulfilmentSlotSelectionOptionId, "Reverse park is needed for our team to safely load your order into your car boot.", coreIcon, "We’ll load your order into your boot", listR, new BadgeApiData("Unavailable", badgeTypeApiData2, null), "Direct to boot is unavailable", "", true, true), new FulfilmentSlotSelectionOption(FulfilmentSlotSelectionOptionId.f, "Pick up your order from the Direct to Boot collection door.", new IconAsset.CoreIcon("icon.payment.shopping-bag"), "I’ll load my own order", CollectionsKt.Q(new BadgeApiData("Direct to boot car park", badgeTypeApiData, null)), new BadgeApiData("Unavailable", badgeTypeApiData2, null), "Self service is unavailable", "", true, false), new FulfilmentSlotSelectionOption(FulfilmentSlotSelectionOptionId.e, "Use our self-service eLockers to unlock and pick up your order. Our app will send you a 5-digit code when your order ready for pick up.", new IconAsset.CoreIcon("icon.services.elocker"), "I'll use a self-service eLocker", CollectionsKt.Q(new BadgeApiData("Underground car parking", badgeTypeApiData, null)), new BadgeApiData("Unavailable", badgeTypeApiData2, null), "Self-service eLockers are unavailable", "", false, false)));
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
                objE = new au.com.woolworths.android.onesite.deeplink.h(20);
                composer.A(objE);
            }
            Function0 function02 = (Function0) objE;
            Object objE2 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE2 == composer$Companion$Empty$1) {
                objE2 = new au.com.woolworths.shop.cart.ui.productreview.h(27);
                composer.A(objE2);
            }
            composer.l();
            FulfilmentSelectionOptionsUiKt.d("Reserve time", true, fulfilmentSlotSelectionOptionsInfo, function0, function02, (Function1) objE2, null, composer, 224310);
        }
        return Unit.f24250a;
    }
}
