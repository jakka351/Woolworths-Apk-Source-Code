package au.com.woolworths.shop.checkout.data.mappers;

import au.com.woolworths.base.shopapp.modules.badge.BadgeApiData;
import au.com.woolworths.base.shopapp.modules.badge.BadgeTypeApiData;
import au.com.woolworths.base.shopapp.modules.text.TextWithAltApiData;
import au.com.woolworths.sdui.common.IconAsset;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentSlotSelectionOption;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentSlotSelectionOptionId;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentSlotSelectionOptionsInfo;
import com.woolworths.shop.checkout.fragment.CheckoutFulfilmentWindows;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CheckoutFulfilmentWindowsSelectionOptionsInfoExtKt {
    public static final FulfilmentSlotSelectionOptionsInfo a(CheckoutFulfilmentWindows.SelectionOptionsInfo selectionOptionsInfo) {
        Iterator it;
        Intrinsics.h(selectionOptionsInfo, "<this>");
        String str = selectionOptionsInfo.f22405a;
        ArrayList arrayList = selectionOptionsInfo.b;
        int i = 10;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            CheckoutFulfilmentWindows.SelectionOption selectionOption = (CheckoutFulfilmentWindows.SelectionOption) it2.next();
            Intrinsics.h(selectionOption, "<this>");
            FulfilmentSlotSelectionOptionId fulfilmentSlotSelectionOptionIdA = FulfilmentWindowSlotSelectionOptionIdExtKt.a(selectionOption.f22404a);
            String str2 = selectionOption.b;
            IconAsset.CoreIcon coreIcon = new IconAsset.CoreIcon(selectionOption.c.f22394a);
            String str3 = selectionOption.d;
            ArrayList arrayList3 = selectionOption.e;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.s(arrayList3, i));
            Iterator it3 = arrayList3.iterator();
            while (true) {
                TextWithAltApiData textWithAltApiData = null;
                if (!it3.hasNext()) {
                    break;
                }
                CheckoutFulfilmentWindows.SelectionOptionsInfoTag selectionOptionsInfoTag = (CheckoutFulfilmentWindows.SelectionOptionsInfoTag) it3.next();
                Intrinsics.h(selectionOptionsInfoTag, "<this>");
                String str4 = selectionOptionsInfoTag.f22406a;
                BadgeTypeApiData badgeTypeApiDataA = BadgeTypeExtKt.a(selectionOptionsInfoTag.c);
                CheckoutFulfilmentWindows.AltLabel2 altLabel2 = selectionOptionsInfoTag.b;
                if (altLabel2 != null) {
                    it = it2;
                    textWithAltApiData = new TextWithAltApiData(altLabel2.f22376a, altLabel2.b);
                } else {
                    it = it2;
                }
                arrayList4.add(new BadgeApiData(str4, badgeTypeApiDataA, textWithAltApiData));
                it2 = it;
            }
            Iterator it4 = it2;
            CheckoutFulfilmentWindows.DisabledBadge disabledBadge = selectionOption.f;
            TextWithAltApiData textWithAltApiData2 = null;
            String str5 = disabledBadge.f22387a;
            BadgeTypeApiData badgeTypeApiDataA2 = BadgeTypeExtKt.a(disabledBadge.c);
            CheckoutFulfilmentWindows.AltLabel3 altLabel3 = disabledBadge.b;
            if (altLabel3 != null) {
                textWithAltApiData2 = new TextWithAltApiData(altLabel3.f22377a, altLabel3.b);
            }
            arrayList2.add(new FulfilmentSlotSelectionOption(fulfilmentSlotSelectionOptionIdA, str2, coreIcon, str3, arrayList4, new BadgeApiData(str5, badgeTypeApiDataA2, textWithAltApiData2), selectionOption.g, selectionOption.h, false, false));
            it2 = it4;
            i = 10;
        }
        return new FulfilmentSlotSelectionOptionsInfo(str, arrayList2);
    }
}
