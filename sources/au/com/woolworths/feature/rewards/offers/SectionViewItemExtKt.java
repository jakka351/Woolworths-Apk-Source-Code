package au.com.woolworths.feature.rewards.offers;

import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.feature.rewards.offers.data.OffersSections;
import au.com.woolworths.feature.rewards.offers.data.ProductOffersSection;
import au.com.woolworths.feature.rewards.offers.data.StandardOffersSection;
import au.com.woolworths.foundation.rewards.offers.model.OfferViewItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SectionViewItemExtKt {
    public static final OffersSections a(OfferSectionViewItem offerSectionViewItem) {
        Intrinsics.h(offerSectionViewItem, "<this>");
        if (!(offerSectionViewItem instanceof ProductSectionViewItem)) {
            if (!(offerSectionViewItem instanceof StandardSectionViewItem)) {
                throw new NoWhenBranchMatchedException();
            }
            StandardSectionViewItem standardSectionViewItem = (StandardSectionViewItem) offerSectionViewItem;
            String str = standardSectionViewItem.c;
            String str2 = standardSectionViewItem.d;
            List list = standardSectionViewItem.f;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((OfferViewItem) it.next()).b);
            }
            return new StandardOffersSection(str, str2, arrayList);
        }
        ProductSectionViewItem productSectionViewItem = (ProductSectionViewItem) offerSectionViewItem;
        String str3 = productSectionViewItem.c;
        String str4 = productSectionViewItem.d;
        String str5 = productSectionViewItem.e;
        String str6 = productSectionViewItem.f;
        ContentCta contentCta = productSectionViewItem.h;
        List list2 = productSectionViewItem.i;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((OfferViewItem) it2.next()).b);
        }
        return new ProductOffersSection(str3, str4, str5, str6, contentCta, arrayList2, productSectionViewItem.j);
    }

    public static final ArrayList b(List list) {
        Intrinsics.h(list, "<this>");
        return CollectionsKt.A(list, OfferSectionViewItem.class);
    }

    public static final List c(OfferSectionViewItem offerSectionViewItem) {
        Intrinsics.h(offerSectionViewItem, "<this>");
        if (offerSectionViewItem instanceof StandardSectionViewItem) {
            return ((StandardSectionViewItem) offerSectionViewItem).f;
        }
        if (offerSectionViewItem instanceof ProductSectionViewItem) {
            return ((ProductSectionViewItem) offerSectionViewItem).i;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final List d(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        List listC0 = EmptyList.d;
        while (it.hasNext()) {
            listC0 = CollectionsKt.c0(c((OfferSectionViewItem) it.next()), listC0);
        }
        return listC0;
    }

    public static final OfferSectionViewItem e(OfferSectionViewItem offerSectionViewItem, boolean z) {
        if (offerSectionViewItem instanceof ProductSectionViewItem) {
            return ProductSectionViewItem.c((ProductSectionViewItem) offerSectionViewItem, z, null, 239);
        }
        if (offerSectionViewItem instanceof StandardSectionViewItem) {
            return StandardSectionViewItem.c((StandardSectionViewItem) offerSectionViewItem, z, null, 11);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ArrayList f(String offerId, boolean z, List list) {
        Intrinsics.h(list, "<this>");
        Intrinsics.h(offerId, "offerId");
        List<OfferViewItem> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
        for (OfferViewItem offerViewItemA : list2) {
            if (Intrinsics.c(offerViewItemA.b.d, offerId)) {
                offerViewItemA = OfferViewItem.a(offerViewItemA, z);
            }
            arrayList.add(offerViewItemA);
        }
        return arrayList;
    }

    public static final OfferSectionViewItem g(OfferSectionViewItem offerSectionViewItem, Function1 function1) {
        if (offerSectionViewItem instanceof ProductSectionViewItem) {
            ProductSectionViewItem productSectionViewItem = (ProductSectionViewItem) offerSectionViewItem;
            return ProductSectionViewItem.c(productSectionViewItem, false, (List) function1.invoke(productSectionViewItem.i), 191);
        }
        if (!(offerSectionViewItem instanceof StandardSectionViewItem)) {
            throw new NoWhenBranchMatchedException();
        }
        StandardSectionViewItem standardSectionViewItem = (StandardSectionViewItem) offerSectionViewItem;
        return StandardSectionViewItem.c(standardSectionViewItem, false, (List) function1.invoke(standardSectionViewItem.f), 7);
    }
}
