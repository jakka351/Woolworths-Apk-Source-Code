package au.com.woolworths.shop.checkout.data.mappers;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.sdui.common.IconAsset;
import au.com.woolworths.sdui.common.corerow.model.CoreRowModel;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.aem.components.model.paragraph.ParagraphTextItemData;
import au.com.woolworths.shop.aem.components.model.paragraph.ParagraphTextItemType;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentInfoRowAccordion;
import com.woolworths.shop.checkout.fragment.FulfilmentExtraInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FulfilmentExtraInfoOnFulfilmentInfoRowAccordionExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    public static final FulfilmentInfoRowAccordion a(FulfilmentExtraInfo.OnFulfilmentInfoRowAccordion onFulfilmentInfoRowAccordion) {
        IconAsset iconAsset;
        ParagraphTextItemData paragraphTextItemData;
        EmptyList emptyList;
        CoreRowModel coreRowModel;
        AnalyticsData analyticsData;
        AnalyticsData analyticsData2;
        ?? arrayList;
        String str;
        ?? arrayList2;
        ParagraphTextItemData paragraphTextItemData2;
        IconAsset coreIcon;
        Intrinsics.h(onFulfilmentInfoRowAccordion, "<this>");
        FulfilmentExtraInfo.RowUI rowUI = onFulfilmentInfoRowAccordion.c;
        FulfilmentExtraInfo.LeadingAsset leadingAsset = rowUI.f22506a;
        if (leadingAsset != null) {
            FulfilmentExtraInfo.OnHostedIcon1 onHostedIcon1 = leadingAsset.b;
            if (onHostedIcon1 != null) {
                coreIcon = new IconAsset.HostedIcon(onHostedIcon1.f22502a);
            } else {
                FulfilmentExtraInfo.OnCoreIcon1 onCoreIcon1 = leadingAsset.c;
                coreIcon = onCoreIcon1 != null ? new IconAsset.CoreIcon(onCoreIcon1.f22496a) : null;
            }
            iconAsset = coreIcon;
        } else {
            iconAsset = null;
        }
        CoreRowModel coreRowModel2 = new CoreRowModel(null, iconAsset, rowUI.b, rowUI.c, null, null);
        boolean z = onFulfilmentInfoRowAccordion.d;
        boolean z2 = onFulfilmentInfoRowAccordion.e;
        FulfilmentExtraInfo.ExpandedContent expandedContent = onFulfilmentInfoRowAccordion.f;
        if (expandedContent != null) {
            FulfilmentExtraInfo.OnParagraphTextItem onParagraphTextItem = expandedContent.b;
            if (onParagraphTextItem != null) {
                String str2 = onParagraphTextItem.b;
                int iOrdinal = onParagraphTextItem.f22503a.ordinal();
                paragraphTextItemData2 = new ParagraphTextItemData(null, str2, iOrdinal != 0 ? iOrdinal != 1 ? ParagraphTextItemType.f : ParagraphTextItemType.e : ParagraphTextItemType.d);
            } else {
                paragraphTextItemData2 = null;
            }
            paragraphTextItemData = paragraphTextItemData2;
        } else {
            paragraphTextItemData = null;
        }
        FulfilmentExtraInfo.OpenActionAnalytics openActionAnalytics = onFulfilmentInfoRowAccordion.f22500a;
        EmptyList emptyList2 = EmptyList.d;
        if (openActionAnalytics != null) {
            AnalyticsFields analyticsFields = openActionAnalytics.b;
            String str3 = analyticsFields.f10032a;
            String str4 = analyticsFields.b;
            String str5 = analyticsFields.c;
            String str6 = analyticsFields.e;
            String str7 = analyticsFields.f;
            String str8 = analyticsFields.g;
            String str9 = analyticsFields.d;
            String str10 = analyticsFields.h;
            String str11 = analyticsFields.i;
            List list = analyticsFields.j;
            if (list != null) {
                List list2 = list;
                emptyList = emptyList2;
                str = str10;
                coreRowModel = coreRowModel2;
                arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(AnalyticsFieldsExtraContentExtKt.a((AnalyticsFields.ExtraContent) it.next()));
                }
            } else {
                emptyList = emptyList2;
                str = str10;
                coreRowModel = coreRowModel2;
                arrayList2 = 0;
            }
            analyticsData = new AnalyticsData((EventConfig) null, str3, str4, str5, str6, str7, str8, str9, str, str11, arrayList2 == 0 ? emptyList : arrayList2, 1, (DefaultConstructorMarker) null);
        } else {
            emptyList = emptyList2;
            coreRowModel = coreRowModel2;
            analyticsData = null;
        }
        FulfilmentExtraInfo.CloseActionAnalytics closeActionAnalytics = onFulfilmentInfoRowAccordion.b;
        if (closeActionAnalytics != null) {
            AnalyticsFields analyticsFields2 = closeActionAnalytics.b;
            String str12 = analyticsFields2.f10032a;
            String str13 = analyticsFields2.b;
            String str14 = analyticsFields2.c;
            String str15 = analyticsFields2.e;
            String str16 = analyticsFields2.f;
            String str17 = analyticsFields2.g;
            String str18 = analyticsFields2.d;
            String str19 = analyticsFields2.h;
            String str20 = analyticsFields2.i;
            List list3 = analyticsFields2.j;
            if (list3 != null) {
                List list4 = list3;
                arrayList = new ArrayList(CollectionsKt.s(list4, 10));
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList.add(AnalyticsFieldsExtraContentExtKt.a((AnalyticsFields.ExtraContent) it2.next()));
                }
            } else {
                arrayList = 0;
            }
            analyticsData2 = new AnalyticsData((EventConfig) null, str12, str13, str14, str15, str16, str17, str18, str19, str20, arrayList == 0 ? emptyList : arrayList, 1, (DefaultConstructorMarker) null);
        } else {
            analyticsData2 = null;
        }
        return new FulfilmentInfoRowAccordion(coreRowModel, z, z2, paragraphTextItemData, analyticsData, analyticsData2);
    }
}
