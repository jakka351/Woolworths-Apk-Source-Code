package au.com.woolworths.dynamic.page.data;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.model.action.ActionType;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.aem.components.model.QuickLinkCard;
import com.woolworths.dynamic.page.DynamicPageQuery;
import com.woolworths.dynamic.page.fragment.CampaignCard;
import com.woolworths.dynamic.page.fragment.CampaignCopy;
import com.woolworths.dynamic.page.fragment.CampaignTermsAndConditions;
import com.woolworths.dynamic.page.fragment.ContentList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"dynamic-page_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class DynamicPageQueryDynamicPageExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    public static final DynamicPageFeedData a(DynamicPageQuery.DynamicPage dynamicPage) {
        Object quickLinkListData;
        DynamicPageFooterData dynamicPageFooterData;
        ?? arrayList;
        EmptyList emptyList;
        String str;
        Iterator it;
        DynamicPageFooterData dynamicPageFooterData2;
        DynamicPageHeaderData dynamicPageHeaderData;
        DynamicPageBottomSheetData dynamicPageBottomSheetData;
        AnalyticsData analyticsData;
        String str2;
        ?? arrayList2;
        Iterator it2;
        String str3;
        BottomSheetFeedItemData campaignCardListData;
        Object categoryTileListData;
        String str4 = "<this>";
        Intrinsics.h(dynamicPage, "<this>");
        DynamicPageQuery.HeaderSection headerSection = dynamicPage.f19238a;
        DynamicPageHeaderData dynamicPageHeaderData2 = new DynamicPageHeaderData(headerSection.f19241a, headerSection.b, headerSection.c, headerSection.d);
        ArrayList arrayList3 = dynamicPage.b;
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (true) {
            quickLinkListData = null;
            if (!it3.hasNext()) {
                break;
            }
            DynamicPageQuery.FeedItem feedItem = (DynamicPageQuery.FeedItem) it3.next();
            if ((feedItem != null ? feedItem.b : null) != null) {
                DynamicPageQuery.OnCampaignCopy onCampaignCopy = feedItem.b;
                Intrinsics.h(onCampaignCopy, "<this>");
                CampaignCopy campaignCopy = onCampaignCopy.b;
                quickLinkListData = new CampaignCardCopyData(campaignCopy.f19286a, campaignCopy.b, campaignCopy.c);
            } else {
                if ((feedItem != null ? feedItem.c : null) != null) {
                    DynamicPageQuery.OnContentList onContentList = feedItem.c;
                    Intrinsics.h(onContentList, "<this>");
                    ContentList contentList = onContentList.b;
                    String str5 = contentList.f19290a;
                    ArrayList arrayList5 = contentList.b;
                    ArrayList arrayList6 = new ArrayList(CollectionsKt.s(arrayList5, 10));
                    Iterator it4 = arrayList5.iterator();
                    while (it4.hasNext()) {
                        arrayList6.add(ContentListContentListItemExtKt.a((ContentList.ContentListItem) it4.next()));
                    }
                    categoryTileListData = new ContentListData(str5, arrayList6);
                } else if ((feedItem != null ? feedItem.d : null) != null) {
                    DynamicPageQuery.OnCampaignTermsAndConditions onCampaignTermsAndConditions = feedItem.d;
                    Intrinsics.h(onCampaignTermsAndConditions, "<this>");
                    CampaignTermsAndConditions campaignTermsAndConditions = onCampaignTermsAndConditions.b;
                    quickLinkListData = new CampaignTermsAndConditionsData(campaignTermsAndConditions.f19288a, campaignTermsAndConditions.b);
                } else if ((feedItem != null ? feedItem.e : null) != null) {
                    DynamicPageQuery.OnCampaignCardCarousel onCampaignCardCarousel = feedItem.e;
                    Intrinsics.h(onCampaignCardCarousel, "<this>");
                    String str6 = onCampaignCardCarousel.f19244a;
                    ArrayList<DynamicPageQuery.CampaignCard> arrayList7 = onCampaignCardCarousel.b;
                    ArrayList arrayList8 = new ArrayList(CollectionsKt.s(arrayList7, 10));
                    for (DynamicPageQuery.CampaignCard campaignCard : arrayList7) {
                        Intrinsics.h(campaignCard, "<this>");
                        CampaignCard campaignCard2 = campaignCard.b;
                        arrayList8.add(new CampaignCardData(campaignCard2.f19284a, campaignCard2.b, campaignCard2.c, campaignCard2.d, campaignCard2.e));
                    }
                    categoryTileListData = new CampaignCardCarouselData(str6, arrayList8);
                } else if ((feedItem != null ? feedItem.f : null) != null) {
                    DynamicPageQuery.OnCampaignCardList onCampaignCardList = feedItem.f;
                    Intrinsics.h(onCampaignCardList, "<this>");
                    String str7 = onCampaignCardList.f19245a;
                    ArrayList<DynamicPageQuery.CampaignCard1> arrayList9 = onCampaignCardList.b;
                    ArrayList arrayList10 = new ArrayList(CollectionsKt.s(arrayList9, 10));
                    for (DynamicPageQuery.CampaignCard1 campaignCard1 : arrayList9) {
                        Intrinsics.h(campaignCard1, "<this>");
                        CampaignCard campaignCard3 = campaignCard1.b;
                        arrayList10.add(new CampaignCardData(campaignCard3.f19284a, campaignCard3.b, campaignCard3.c, campaignCard3.d, campaignCard3.e));
                    }
                    categoryTileListData = new CampaignCardListData(str7, arrayList10);
                } else if ((feedItem != null ? feedItem.g : null) != null) {
                    DynamicPageQuery.OnQuickLinkList onQuickLinkList = feedItem.g;
                    Intrinsics.h(onQuickLinkList, "<this>");
                    ArrayList<DynamicPageQuery.Item> arrayList11 = onQuickLinkList.f19255a;
                    ArrayList arrayList12 = new ArrayList(CollectionsKt.s(arrayList11, 10));
                    for (DynamicPageQuery.Item item : arrayList11) {
                        Intrinsics.h(item, "<this>");
                        String str8 = item.c;
                        DynamicPageQuery.LinkCardAction linkCardAction = item.d;
                        String str9 = linkCardAction.b;
                        int iOrdinal = linkCardAction.f19243a.ordinal();
                        arrayList12.add(new QuickLinkCard(str8, new ActionData(str9, iOrdinal != 0 ? iOrdinal != 1 ? ActionType.e : ActionType.d : ActionType.e, null, null), item.b, item.f19242a, null, null, 48, null));
                    }
                    quickLinkListData = new QuickLinkListData(arrayList12);
                } else if ((feedItem != null ? feedItem.h : null) != null) {
                    DynamicPageQuery.OnCategoryTileList onCategoryTileList = feedItem.h;
                    Intrinsics.h(onCategoryTileList, "<this>");
                    String str10 = onCategoryTileList.f19251a;
                    ArrayList<DynamicPageQuery.CategoryTileListTile> arrayList13 = onCategoryTileList.b;
                    ArrayList arrayList14 = new ArrayList(CollectionsKt.s(arrayList13, 10));
                    for (DynamicPageQuery.CategoryTileListTile categoryTileListTile : arrayList13) {
                        Intrinsics.h(categoryTileListTile, "<this>");
                        arrayList14.add(new CategoryTileData(categoryTileListTile.f19236a, categoryTileListTile.b, categoryTileListTile.c, categoryTileListTile.d));
                    }
                    categoryTileListData = new CategoryTileListData(str10, arrayList14);
                }
                quickLinkListData = categoryTileListData;
            }
            if (quickLinkListData != null) {
                arrayList4.add(quickLinkListData);
            }
        }
        DynamicPageQuery.FooterSection footerSection = dynamicPage.c;
        if (footerSection != null) {
            DynamicPageQuery.Action action = footerSection.f19240a;
            dynamicPageFooterData = new DynamicPageFooterData(new DynamicPageActionData(action.f19228a, action.b, null));
        } else {
            dynamicPageFooterData = null;
        }
        List list = dynamicPage.d;
        EmptyList emptyList2 = EmptyList.d;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                DynamicPageQuery.BottomSheet bottomSheet = (DynamicPageQuery.BottomSheet) it5.next();
                if ((bottomSheet != null ? bottomSheet.b : quickLinkListData) != null) {
                    DynamicPageQuery.OnDynamicPageBottomSheet onDynamicPageBottomSheet = bottomSheet.b;
                    Intrinsics.h(onDynamicPageBottomSheet, str4);
                    String str11 = onDynamicPageBottomSheet.f19254a;
                    ArrayList<DynamicPageQuery.BottomSheetFeedItem> arrayList15 = onDynamicPageBottomSheet.c;
                    ArrayList arrayList16 = new ArrayList();
                    for (DynamicPageQuery.BottomSheetFeedItem bottomSheetFeedItem : arrayList15) {
                        DynamicPageQuery.OnCampaignCopy1 onCampaignCopy1 = bottomSheetFeedItem.b;
                        if (onCampaignCopy1 != null) {
                            CampaignCopy campaignCopy2 = onCampaignCopy1.b;
                            campaignCardListData = new CampaignCardCopyData(campaignCopy2.f19286a, campaignCopy2.b, campaignCopy2.c);
                            str3 = str4;
                            it2 = it5;
                        } else {
                            DynamicPageQuery.OnContentList1 onContentList1 = bottomSheetFeedItem.c;
                            if (onContentList1 != null) {
                                ContentList contentList2 = onContentList1.b;
                                String str12 = contentList2.f19290a;
                                ArrayList arrayList17 = contentList2.b;
                                it2 = it5;
                                ArrayList arrayList18 = new ArrayList(CollectionsKt.s(arrayList17, 10));
                                Iterator it6 = arrayList17.iterator();
                                while (it6.hasNext()) {
                                    arrayList18.add(ContentListContentListItemExtKt.a((ContentList.ContentListItem) it6.next()));
                                }
                                str3 = str4;
                                campaignCardListData = new ContentListData(str12, arrayList18);
                            } else {
                                it2 = it5;
                                DynamicPageQuery.OnCampaignTermsAndConditions1 onCampaignTermsAndConditions1 = bottomSheetFeedItem.d;
                                if (onCampaignTermsAndConditions1 != null) {
                                    CampaignTermsAndConditions campaignTermsAndConditions2 = onCampaignTermsAndConditions1.b;
                                    campaignCardListData = new CampaignTermsAndConditionsData(campaignTermsAndConditions2.f19288a, campaignTermsAndConditions2.b);
                                    str3 = str4;
                                } else {
                                    DynamicPageQuery.OnCampaignCardList1 onCampaignCardList1 = bottomSheetFeedItem.e;
                                    if (onCampaignCardList1 != null) {
                                        String str13 = onCampaignCardList1.f19246a;
                                        ArrayList<DynamicPageQuery.CampaignCard2> arrayList19 = onCampaignCardList1.b;
                                        ArrayList arrayList20 = new ArrayList(CollectionsKt.s(arrayList19, 10));
                                        for (DynamicPageQuery.CampaignCard2 campaignCard22 : arrayList19) {
                                            Intrinsics.h(campaignCard22, str4);
                                            CampaignCard campaignCard4 = campaignCard22.b;
                                            arrayList20.add(new CampaignCardData(campaignCard4.f19284a, campaignCard4.b, campaignCard4.c, campaignCard4.d, campaignCard4.e));
                                            str4 = str4;
                                        }
                                        str3 = str4;
                                        campaignCardListData = new CampaignCardListData(str13, arrayList20);
                                    } else {
                                        str3 = str4;
                                        campaignCardListData = null;
                                    }
                                }
                            }
                        }
                        if (campaignCardListData != null) {
                            arrayList16.add(campaignCardListData);
                        }
                        it5 = it2;
                        str4 = str3;
                    }
                    str = str4;
                    it = it5;
                    DynamicPageQuery.Analytics analytics = onDynamicPageBottomSheet.b;
                    if (analytics != null) {
                        AnalyticsFields analyticsFields = analytics.b;
                        String str14 = analyticsFields.f10032a;
                        String str15 = analyticsFields.b;
                        String str16 = analyticsFields.c;
                        String str17 = analyticsFields.e;
                        String str18 = analyticsFields.f;
                        String str19 = analyticsFields.g;
                        String str20 = analyticsFields.d;
                        String str21 = analyticsFields.h;
                        String str22 = analyticsFields.i;
                        List list2 = analyticsFields.j;
                        if (list2 != null) {
                            List list3 = list2;
                            str2 = str22;
                            dynamicPageFooterData2 = dynamicPageFooterData;
                            dynamicPageHeaderData = dynamicPageHeaderData2;
                            arrayList2 = new ArrayList(CollectionsKt.s(list3, 10));
                            Iterator it7 = list3.iterator();
                            while (it7.hasNext()) {
                                arrayList2.add(AnalyticsFieldsExtraContentExtKt.a((AnalyticsFields.ExtraContent) it7.next()));
                            }
                        } else {
                            str2 = str22;
                            dynamicPageFooterData2 = dynamicPageFooterData;
                            dynamicPageHeaderData = dynamicPageHeaderData2;
                            arrayList2 = 0;
                        }
                        analyticsData = new AnalyticsData((EventConfig) null, str14, str15, str16, str17, str18, str19, str20, str21, str2, arrayList2 == 0 ? emptyList2 : arrayList2, 1, (DefaultConstructorMarker) null);
                    } else {
                        dynamicPageFooterData2 = dynamicPageFooterData;
                        dynamicPageHeaderData = dynamicPageHeaderData2;
                        analyticsData = null;
                    }
                    dynamicPageBottomSheetData = new DynamicPageBottomSheetData(str11, arrayList16, analyticsData);
                } else {
                    str = str4;
                    it = it5;
                    dynamicPageFooterData2 = dynamicPageFooterData;
                    dynamicPageHeaderData = dynamicPageHeaderData2;
                    dynamicPageBottomSheetData = null;
                }
                if (dynamicPageBottomSheetData != null) {
                    arrayList.add(dynamicPageBottomSheetData);
                }
                it5 = it;
                dynamicPageFooterData = dynamicPageFooterData2;
                dynamicPageHeaderData2 = dynamicPageHeaderData;
                str4 = str;
                quickLinkListData = null;
            }
        } else {
            arrayList = 0;
        }
        DynamicPageFooterData dynamicPageFooterData3 = dynamicPageFooterData;
        DynamicPageHeaderData dynamicPageHeaderData3 = dynamicPageHeaderData2;
        EmptyList emptyList3 = arrayList == 0 ? emptyList2 : arrayList;
        AnalyticsFields analyticsFields2 = dynamicPage.e.b;
        String str23 = analyticsFields2.f10032a;
        String str24 = analyticsFields2.b;
        String str25 = analyticsFields2.c;
        String str26 = analyticsFields2.e;
        String str27 = analyticsFields2.f;
        String str28 = analyticsFields2.g;
        String str29 = analyticsFields2.d;
        String str30 = analyticsFields2.h;
        String str31 = analyticsFields2.i;
        List list4 = analyticsFields2.j;
        if (list4 != null) {
            List list5 = list4;
            ?? arrayList21 = new ArrayList(CollectionsKt.s(list5, 10));
            Iterator it8 = list5.iterator();
            while (it8.hasNext()) {
                arrayList21.add(AnalyticsFieldsExtraContentExtKt.a((AnalyticsFields.ExtraContent) it8.next()));
            }
            emptyList = arrayList21;
        } else {
            emptyList = null;
        }
        return new DynamicPageFeedData(dynamicPageHeaderData3, arrayList4, dynamicPageFooterData3, emptyList3, new AnalyticsData((EventConfig) null, str23, str24, str25, str26, str27, str28, str29, str30, str31, emptyList == null ? emptyList2 : emptyList, 1, (DefaultConstructorMarker) null));
    }
}
