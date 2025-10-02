package au.com.woolworths.shop.checkout.data.mappers;

import au.com.woolworths.shop.checkout.domain.model.FulfilmentFeeItem;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentFeePriceInfo;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentFeesInfoSection;
import com.woolworths.shop.checkout.fragment.FulfilmentExtraInfo;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class FulfilmentExtraInfoOnFulfilmentFeesInfoSectionExtKt {
    public static final FulfilmentFeesInfoSection a(FulfilmentExtraInfo.OnFulfilmentFeesInfoSection onFulfilmentFeesInfoSection) {
        Intrinsics.h(onFulfilmentFeesInfoSection, "<this>");
        String str = onFulfilmentFeesInfoSection.f22499a;
        ArrayList<FulfilmentExtraInfo.Item> arrayList = onFulfilmentFeesInfoSection.b;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        for (FulfilmentExtraInfo.Item item : arrayList) {
            Intrinsics.h(item, "<this>");
            FulfilmentExtraInfo.OnFulfilmentFeeItem onFulfilmentFeeItem = item.b;
            String str2 = onFulfilmentFeeItem.f22497a;
            String str3 = onFulfilmentFeeItem.b;
            ArrayList arrayList3 = onFulfilmentFeeItem.c;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.s(arrayList3, 10));
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                FulfilmentExtraInfo.OnFulfilmentFeePriceInfo onFulfilmentFeePriceInfo = ((FulfilmentExtraInfo.Price) it.next()).b;
                arrayList4.add(new FulfilmentFeePriceInfo(onFulfilmentFeePriceInfo.f22498a, onFulfilmentFeePriceInfo.b));
            }
            arrayList2.add(new FulfilmentFeeItem(str2, str3, arrayList4));
        }
        return new FulfilmentFeesInfoSection(str, arrayList2);
    }
}
