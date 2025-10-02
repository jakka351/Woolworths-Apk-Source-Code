package au.com.woolworths.feature.shop.healthylifefoodtracker;

import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.android.onesite.data.DownloadableAssetType;
import au.com.woolworths.base.shopapp.modules.iconwithtext.IconListItemApiData;
import au.com.woolworths.base.shopapp.modules.listsectionheader.ListSectionHeaderApiData;
import au.com.woolworths.base.shopapp.modules.listsectionheader.ListSectionHeaderTypeApiData;
import au.com.woolworths.base.shopapp.modules.text.ParagraphTextApiData;
import au.com.woolworths.base.shopapp.modules.text.ParagraphTextTypeApiData;
import au.com.woolworths.base.shopapp.modules.text.TextWithLinkApiData;
import au.com.woolworths.feature.shop.healthylifefoodtracker.data.FoodTrackerConsent;
import au.com.woolworths.feature.shop.healthylifefoodtracker.data.FoodTrackerContentFeed;
import au.com.woolworths.feature.shop.healthylifefoodtracker.data.FoodTrackerFooterActionType;
import au.com.woolworths.feature.shop.healthylifefoodtracker.data.FoodTrackerFooterCard;
import au.com.woolworths.feature.shop.healthylifefoodtracker.data.FoodTrackerPage;
import au.com.woolworths.feature.shop.healthylifefoodtracker.data.FoodTrackerWebView;
import au.com.woolworths.shop.graphql.type.DownloadableAssetFit;
import com.woolworths.shop.healthylife.foodtracker.FoodTrackerPageQuery;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"healthy-life-food-tracker_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FoodTrackerRepositoryKt {
    public static final FoodTrackerPage a(FoodTrackerPageQuery.FoodTrackerPage foodTrackerPage) {
        FoodTrackerConsent foodTrackerConsent;
        Object textWithLinkApiData;
        Intrinsics.h(foodTrackerPage, "<this>");
        FoodTrackerPageQuery.OnFoodTrackerContentFeed onFoodTrackerContentFeed = foodTrackerPage.b;
        FoodTrackerConsent foodTrackerConsent2 = null;
        if (onFoodTrackerContentFeed == null) {
            FoodTrackerPageQuery.OnFoodTrackerWebView onFoodTrackerWebView = foodTrackerPage.c;
            if (onFoodTrackerWebView != null) {
                return new FoodTrackerWebView(onFoodTrackerWebView.f22748a, onFoodTrackerWebView.b);
            }
            return null;
        }
        String str = onFoodTrackerContentFeed.f22747a;
        FoodTrackerPageQuery.HeaderAsset headerAsset = onFoodTrackerContentFeed.b;
        DownloadableAssetType downloadableAssetTypeA = DownloadableAssetTypeExtKt.a(headerAsset.f22742a);
        String str2 = headerAsset.b;
        int i = headerAsset.c;
        int i2 = headerAsset.d;
        DownloadableAssetFit downloadableAssetFit = headerAsset.e;
        DownloadableAsset downloadableAsset = new DownloadableAsset(downloadableAssetTypeA, str2, i, i2, downloadableAssetFit != null ? DownloadableAssetFitExtKt.a(downloadableAssetFit) : null, headerAsset.f);
        ArrayList<FoodTrackerPageQuery.Content> arrayList = onFoodTrackerContentFeed.c;
        ArrayList arrayList2 = new ArrayList();
        for (FoodTrackerPageQuery.Content content : arrayList) {
            FoodTrackerPageQuery.OnIconListItem onIconListItem = content.b;
            if (onIconListItem != null) {
                textWithLinkApiData = new IconListItemApiData(onIconListItem.f22749a, onIconListItem.b, onIconListItem.c);
            } else {
                FoodTrackerPageQuery.OnParagraphTextItem onParagraphTextItem = content.c;
                if (onParagraphTextItem != null) {
                    String str3 = onParagraphTextItem.f22751a;
                    int iOrdinal = onParagraphTextItem.b.ordinal();
                    textWithLinkApiData = new ParagraphTextApiData(str3, iOrdinal != 0 ? iOrdinal != 1 ? ParagraphTextTypeApiData.d : ParagraphTextTypeApiData.CAPTION : ParagraphTextTypeApiData.BODY);
                } else {
                    FoodTrackerPageQuery.OnListSectionHeader onListSectionHeader = content.d;
                    if (onListSectionHeader != null) {
                        int iOrdinal2 = onListSectionHeader.b.ordinal();
                        textWithLinkApiData = new ListSectionHeaderApiData(iOrdinal2 != 0 ? iOrdinal2 != 1 ? ListSectionHeaderTypeApiData.d : ListSectionHeaderTypeApiData.SECONDARY : ListSectionHeaderTypeApiData.PRIMARY, onListSectionHeader.f22750a, null);
                    } else {
                        FoodTrackerPageQuery.OnDownloadableAsset onDownloadableAsset = content.e;
                        if (onDownloadableAsset != null) {
                            DownloadableAssetType downloadableAssetTypeA2 = DownloadableAssetTypeExtKt.a(onDownloadableAsset.f22745a);
                            String str4 = onDownloadableAsset.b;
                            int i3 = onDownloadableAsset.c;
                            int i4 = onDownloadableAsset.d;
                            DownloadableAssetFit downloadableAssetFit2 = onDownloadableAsset.e;
                            textWithLinkApiData = new DownloadableAsset(downloadableAssetTypeA2, str4, i3, i4, downloadableAssetFit2 != null ? DownloadableAssetFitExtKt.a(downloadableAssetFit2) : null, onDownloadableAsset.f);
                        } else {
                            FoodTrackerPageQuery.OnTextWithLink onTextWithLink = content.f;
                            textWithLinkApiData = onTextWithLink != null ? new TextWithLinkApiData(onTextWithLink.f22752a, onTextWithLink.b) : null;
                        }
                    }
                }
            }
            if (textWithLinkApiData != null) {
                arrayList2.add(textWithLinkApiData);
            }
        }
        FoodTrackerPageQuery.Footer footer = onFoodTrackerContentFeed.d;
        FoodTrackerPageQuery.Icon icon = footer.f22741a;
        DownloadableAssetType downloadableAssetTypeA3 = DownloadableAssetTypeExtKt.a(icon.f22744a);
        String str5 = icon.b;
        int i5 = icon.c;
        int i6 = icon.d;
        DownloadableAssetFit downloadableAssetFit3 = icon.e;
        DownloadableAsset downloadableAsset2 = new DownloadableAsset(downloadableAssetTypeA3, str5, i5, i6, downloadableAssetFit3 != null ? DownloadableAssetFitExtKt.a(downloadableAssetFit3) : null, icon.f);
        String str6 = footer.b;
        FoodTrackerPageQuery.ConsentAction consentAction = footer.c;
        if (consentAction != null) {
            FoodTrackerPageQuery.OnFoodTrackerConsent onFoodTrackerConsent = consentAction.b;
            if (onFoodTrackerConsent != null) {
                FoodTrackerPageQuery.HeaderAsset1 headerAsset1 = onFoodTrackerConsent.f22746a;
                DownloadableAssetType downloadableAssetTypeA4 = DownloadableAssetTypeExtKt.a(headerAsset1.f22743a);
                String str7 = headerAsset1.b;
                int i7 = headerAsset1.c;
                int i8 = headerAsset1.d;
                DownloadableAssetFit downloadableAssetFit4 = headerAsset1.e;
                foodTrackerConsent2 = new FoodTrackerConsent(new DownloadableAsset(downloadableAssetTypeA4, str7, i7, i8, downloadableAssetFit4 != null ? DownloadableAssetFitExtKt.a(downloadableAssetFit4) : null, headerAsset1.f), onFoodTrackerConsent.b, onFoodTrackerConsent.c, onFoodTrackerConsent.d, onFoodTrackerConsent.e, onFoodTrackerConsent.f);
            }
            foodTrackerConsent = foodTrackerConsent2;
        } else {
            foodTrackerConsent = null;
        }
        int iOrdinal3 = footer.d.ordinal();
        return new FoodTrackerContentFeed(str, downloadableAsset, arrayList2, new FoodTrackerFooterCard(downloadableAsset2, str6, foodTrackerConsent, iOrdinal3 != 0 ? iOrdinal3 != 1 ? FoodTrackerFooterActionType.f : FoodTrackerFooterActionType.e : FoodTrackerFooterActionType.d, footer.e));
    }
}
