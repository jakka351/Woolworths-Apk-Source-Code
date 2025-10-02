package au.com.woolworths.shop.product.details.data;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.base.shopapp.data.models.InfoSectionFooter;
import au.com.woolworths.base.shopapp.data.models.InfoSectionItem;
import au.com.woolworths.sdui.common.IconAsset;
import au.com.woolworths.sdui.common.corerow.model.CoreRowModel;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.aem.components.model.paragraph.ParagraphTextItemData;
import com.woolworths.shop.product.details.ProductDetailsPageQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductDetailsPageQueryOnProductDetailsRowLinkExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v7 */
    public static final ProductDetailsRowLink a(ProductDetailsPageQuery.OnProductDetailsRowLink onProductDetailsRowLink) {
        IconAsset iconAsset;
        Object infoSection;
        IconAsset coreIcon;
        Intrinsics.h(onProductDetailsRowLink, "<this>");
        ProductDetailsPageQuery.RowUI1 rowUI1 = onProductDetailsRowLink.f23473a;
        ProductDetailsPageQuery.LeadingAsset1 leadingAsset1 = rowUI1.f23500a;
        AnalyticsData analyticsData = null;
        List arrayList = 0;
        if (leadingAsset1 != null) {
            ProductDetailsPageQuery.OnHostedIcon2 onHostedIcon2 = leadingAsset1.b;
            if (onHostedIcon2 != null) {
                coreIcon = new IconAsset.HostedIcon(onHostedIcon2.f23458a);
            } else {
                ProductDetailsPageQuery.OnCoreIcon1 onCoreIcon1 = leadingAsset1.c;
                coreIcon = onCoreIcon1 != null ? new IconAsset.CoreIcon(onCoreIcon1.f23451a) : null;
            }
            iconAsset = coreIcon;
        } else {
            iconAsset = null;
        }
        CoreRowModel coreRowModel = new CoreRowModel(null, iconAsset, rowUI1.b, rowUI1.c, null, null);
        ProductDetailsPageQuery.LinkContent linkContent = onProductDetailsRowLink.b;
        ProductDetailsPageQuery.OnParagraphTextItem2 onParagraphTextItem2 = linkContent.b;
        if (onParagraphTextItem2 != null) {
            infoSection = new ParagraphTextItemData(null, onParagraphTextItem2.f23462a, ParagraphTextItemTypeExtKt.a(onParagraphTextItem2.b));
        } else {
            ProductDetailsPageQuery.OnProductNutritionInfo onProductNutritionInfo = linkContent.c;
            if (onProductNutritionInfo != null) {
                String str = onProductNutritionInfo.b;
                String str2 = onProductNutritionInfo.c;
                ArrayList arrayList2 = onProductNutritionInfo.d;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add((String) it.next());
                }
                ArrayList arrayList4 = onProductNutritionInfo.e;
                ArrayList arrayList5 = new ArrayList(CollectionsKt.s(arrayList4, 10));
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    arrayList5.add((String) it2.next());
                }
                String str3 = onProductNutritionInfo.f;
                ArrayList arrayList6 = onProductNutritionInfo.g;
                ArrayList arrayList7 = new ArrayList(CollectionsKt.s(arrayList6, 10));
                Iterator it3 = arrayList6.iterator();
                while (it3.hasNext()) {
                    arrayList7.add((String) it3.next());
                }
                ArrayList<List> arrayList8 = onProductNutritionInfo.h;
                ArrayList arrayList9 = new ArrayList(CollectionsKt.s(arrayList8, 10));
                for (List list : arrayList8) {
                    ArrayList arrayList10 = new ArrayList(CollectionsKt.s(list, 10));
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        arrayList10.add((String) it4.next());
                    }
                    arrayList9.add(arrayList10);
                }
                infoSection = new NutritionInfo(null, str, str2, arrayList3, arrayList5, str3, arrayList7, arrayList9);
            } else {
                ProductDetailsPageQuery.OnInfoSection onInfoSection = linkContent.d;
                if (onInfoSection == null) {
                    throw new IllegalStateException("Error mapping `LinkContent`: missing non-null synthetic field!");
                }
                String str4 = onInfoSection.f23459a;
                ArrayList<ProductDetailsPageQuery.Item2> arrayList11 = onInfoSection.b;
                ArrayList arrayList12 = new ArrayList(CollectionsKt.s(arrayList11, 10));
                for (ProductDetailsPageQuery.Item2 item2 : arrayList11) {
                    Intrinsics.h(item2, "<this>");
                    arrayList12.add(new InfoSectionItem(item2.f23439a, item2.b, item2.c));
                }
                ProductDetailsPageQuery.Footer footer = onInfoSection.c;
                infoSection = new InfoSection(str4, arrayList12, footer != null ? new InfoSectionFooter(footer.f23426a, footer.b, footer.c) : null);
            }
        }
        boolean z = onProductDetailsRowLink.c;
        ProductDetailsPageQuery.OpenActionAnalytics1 openActionAnalytics1 = onProductDetailsRowLink.d;
        if (openActionAnalytics1 != null) {
            AnalyticsFields analyticsFields = openActionAnalytics1.b;
            String str5 = analyticsFields.f10032a;
            String str6 = analyticsFields.b;
            String str7 = analyticsFields.c;
            String str8 = analyticsFields.e;
            String str9 = analyticsFields.f;
            String str10 = analyticsFields.g;
            String str11 = analyticsFields.d;
            String str12 = analyticsFields.h;
            String str13 = analyticsFields.i;
            List list2 = analyticsFields.j;
            if (list2 != null) {
                List list3 = list2;
                arrayList = new ArrayList(CollectionsKt.s(list3, 10));
                Iterator it5 = list3.iterator();
                while (it5.hasNext()) {
                    arrayList.add(au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it5.next()));
                }
            }
            if (arrayList == 0) {
                arrayList = EmptyList.d;
            }
            analyticsData = new AnalyticsData((EventConfig) null, str5, str6, str7, str8, str9, str10, str11, str12, str13, arrayList, 1, (DefaultConstructorMarker) null);
        }
        return new ProductDetailsRowLink(coreRowModel, infoSection, z, analyticsData);
    }
}
