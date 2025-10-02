package au.com.woolworths.dynamic.page.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.android.onesite.models.notification.NotificationResult;
import au.com.woolworths.dynamic.page.data.CampaignCardCarouselData;
import au.com.woolworths.dynamic.page.data.CampaignCardCopyData;
import au.com.woolworths.dynamic.page.data.CampaignCardData;
import au.com.woolworths.dynamic.page.data.CampaignCardListData;
import au.com.woolworths.dynamic.page.data.CampaignTermsAndConditionsData;
import au.com.woolworths.dynamic.page.data.CategoryTileData;
import au.com.woolworths.dynamic.page.data.CategoryTileListData;
import au.com.woolworths.dynamic.page.data.ContentListData;
import au.com.woolworths.dynamic.page.data.ContentListItemData;
import au.com.woolworths.dynamic.page.data.DynamicPageActionData;
import au.com.woolworths.dynamic.page.data.DynamicPageBottomSheetData;
import au.com.woolworths.dynamic.page.data.DynamicPageFeedData;
import au.com.woolworths.dynamic.page.data.DynamicPageFooterData;
import au.com.woolworths.dynamic.page.data.DynamicPageHeaderData;
import au.com.woolworths.dynamic.page.data.QuickLinkListData;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.model.action.ActionType;
import au.com.woolworths.shop.aem.components.model.QuickLinkCard;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\bÁ\u0002\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/dynamic/page/utils/DynamicPageStubs;", "", "DynamicPageFeedDataProvider", "ContentListDataProvider", "CardListDataProvider", "CardCarouselDataProvider", "CardCopyDataProvider", "QuickLinkListDataProvider", "CategoryTileListDataProvider", "CategoryTileDataProvider", "BottomSheetDataProvider", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DynamicPageStubs {

    /* renamed from: a, reason: collision with root package name */
    public static final CampaignTermsAndConditionsData f5201a;
    public static final List b;
    public static final List c;
    public static final DynamicPageFeedData d;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/dynamic/page/utils/DynamicPageStubs$BottomSheetDataProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/dynamic/page/data/DynamicPageBottomSheetData;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BottomSheetDataProvider implements PreviewParameterProvider<DynamicPageBottomSheetData> {
        @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
        public final Sequence getValues() {
            return null;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/dynamic/page/utils/DynamicPageStubs$CardCarouselDataProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/dynamic/page/data/CampaignCardCarouselData;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CardCarouselDataProvider implements PreviewParameterProvider<CampaignCardCarouselData> {
        @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
        public final Sequence getValues() {
            return null;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/dynamic/page/utils/DynamicPageStubs$CardCopyDataProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/dynamic/page/data/CampaignCardCopyData;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CardCopyDataProvider implements PreviewParameterProvider<CampaignCardCopyData> {
        @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
        public final Sequence getValues() {
            return null;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/dynamic/page/utils/DynamicPageStubs$CardListDataProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/dynamic/page/data/CampaignCardListData;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CardListDataProvider implements PreviewParameterProvider<CampaignCardListData> {
        @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
        public final Sequence getValues() {
            return null;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/dynamic/page/utils/DynamicPageStubs$CategoryTileDataProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/dynamic/page/data/CategoryTileData;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CategoryTileDataProvider implements PreviewParameterProvider<CategoryTileData> {
        @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
        public final Sequence getValues() {
            return null;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/dynamic/page/utils/DynamicPageStubs$CategoryTileListDataProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/dynamic/page/data/CategoryTileListData;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CategoryTileListDataProvider implements PreviewParameterProvider<CategoryTileListData> {
        @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
        public final Sequence getValues() {
            return null;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/dynamic/page/utils/DynamicPageStubs$ContentListDataProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/dynamic/page/data/ContentListData;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class ContentListDataProvider implements PreviewParameterProvider<ContentListData> {
        @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
        public final Sequence getValues() {
            return null;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/dynamic/page/utils/DynamicPageStubs$DynamicPageFeedDataProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/dynamic/page/data/DynamicPageFeedData;", "Companion", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DynamicPageFeedDataProvider implements PreviewParameterProvider<DynamicPageFeedData> {

        /* renamed from: a, reason: collision with root package name */
        public static final DynamicPageFeedData f5202a;
        public static final DynamicPageFeedData b;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/dynamic/page/utils/DynamicPageStubs$DynamicPageFeedDataProvider$Companion;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }

        static {
            DynamicPageFeedData dynamicPageFeedData = DynamicPageStubs.d;
            f5202a = dynamicPageFeedData;
            DynamicPageHeaderData dynamicPageHeaderData = dynamicPageFeedData.f5185a;
            b = new DynamicPageFeedData(new DynamicPageHeaderData(dynamicPageHeaderData.f5187a, null, dynamicPageHeaderData.c, dynamicPageHeaderData.d), dynamicPageFeedData.b, dynamicPageFeedData.c, dynamicPageFeedData.d, dynamicPageFeedData.e);
        }

        @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
        public final Sequence getValues() {
            return null;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/dynamic/page/utils/DynamicPageStubs$QuickLinkListDataProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/dynamic/page/data/QuickLinkListData;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class QuickLinkListDataProvider implements PreviewParameterProvider<QuickLinkListData> {
        @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
        public final Sequence getValues() {
            return null;
        }
    }

    static {
        CampaignTermsAndConditionsData campaignTermsAndConditionsData = new CampaignTermsAndConditionsData("Terms and Conditions", "At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi [www.woolworths.com.au](www.woolworths.com.au), id est laborum et dolorum fuga.\n\nEt harum quidem rerum facilis est et expedita distinctio. Nam libero tempore, cum soluta nobis est eligendi optio cumque nihil impedit quo minus id quod maxime placeat facere possimus, omnis voluptas assumenda est, omnis dolor repellendus. Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus saepe eveniet ut et voluptates repudiandae sint et molestiae non recusandae. Itaque earum rerum hic tenetur a sapiente delectus, ut aut reiciendis voluptatibus maiores.");
        f5201a = campaignTermsAndConditionsData;
        CampaignCardData campaignCardData = new CampaignCardData("Headline maximum two lines of content to include.", "", "", "", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        List listR = CollectionsKt.R(campaignCardData, campaignCardData);
        CampaignCardListData campaignCardListData = new CampaignCardListData("Shoppable content", listR);
        List listR2 = CollectionsKt.R(campaignCardData, CampaignCardData.a(campaignCardData, null, 30), CampaignCardData.a(campaignCardData, "One line", 14), CampaignCardData.a(campaignCardData, null, 14), CampaignCardData.a(campaignCardData, null, 15));
        b = listR2;
        CampaignCardCarouselData campaignCardCarouselData = new CampaignCardCarouselData("Shoppable content", listR2);
        c = CollectionsKt.R(new CategoryTileData("Scan&Go", "https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/quicklinks/scanandgo_icon.png", "", "com.woolworths.shop://ScanAndGo"), new CategoryTileData("Free Wifi", "https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/quicklinks/freewifi_icon.png", "", "com.woolworths.shop://instoreWiFi?source=home"), new CategoryTileData("Catalogues", "https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/quicklinks/catalogues_icon.png", "", "com.woolworths.shop://catalogue"), new CategoryTileData("Saved Recipes", "https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/quicklinks/savedrecipes_icon.png", "", "com.woolworths.shop://recipes/saved"));
        ActionType actionType = ActionType.e;
        CollectionsKt.R(new QuickLinkCard("Scan&Go", new ActionData("com.woolworths.shop://ScanAndGo", actionType, null, null), null, "https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/quicklinks/scanandgo_icon.png", null, null, 52, null), new QuickLinkCard("Free Wifi", new ActionData("com.woolworths.shop://instoreWiFi?source=home", actionType, null, null), null, "https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/quicklinks/freewifi_icon.png", null, null, 52, null), new QuickLinkCard("Catalogues", new ActionData("com.woolworths.shop://catalogue", actionType, null, null), null, "https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/quicklinks/catalogues_icon.png", null, null, 52, null), new QuickLinkCard("Saved Recipes", new ActionData("com.woolworths.shop://recipes/saved", actionType, null, null), null, "https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/quicklinks/savedrecipes_icon.png", null, null, 52, null));
        ContentListData contentListData = new ContentListData("Even more ways to save this winter", CollectionsKt.R(new ContentListItemData("Save a bunch with the odd bunch", "https://cdn0.woolworths.media/content/content/3598-save-20-percent-odd-bunch-disclaimer.png", "A man happily saving 20 percent", "High quality produce thats just as odd as our developers", new DynamicPageActionData("Browse SuggestedList", "openbottomsheet/save-with-the-odd-bunch", null)), new ContentListItemData("Save a bunch with the odd bunch", "https://cdn0.woolworths.media/content/content/3598-save-20-percent-odd-bunch-disclaimer.png", "High quality produce thats just as odd as our developers", new DynamicPageActionData("Browse SuggestedList", "com.woolworths.shop://lists/suggestedlists?id=23", null), 4), new ContentListItemData("Check your total spend with Lists", "https://cdn0.woolworths.media/content/content/3598-check-total-spend.png", "Portrait of a family checking their total spend", "Lists are the best feature in the app, you just don't know it yet", new DynamicPageActionData("Check it out", "com.woolworths.shop://lists", null)), new ContentListItemData("Super Special Specials", "https://cdn0.woolworths.media/content/content/3598-fresh-specials.png", "We found these just for you!", new DynamicPageActionData("View My Specials", "com.woolworths.shop://specials/view/myspecials", null), 4)));
        ContentListData contentListData2 = new ContentListData("Even more ways to save this winter", CollectionsKt.R(new ContentListItemData("This feature is kinda cool", "https://assets.woolworths.com.au/images/1005/796439.jpg?impolicy=wowsmkqiema&w=260&h=260", "Sorry you cant click this one", (DynamicPageActionData) null, 20), new ContentListItemData("Take a Quiz!", "https://cdn0.woolworths.media/content/content/nemo-3790-quizz-q2-d.jpg", "This feature doesn't exist in app, so we link to web", new DynamicPageActionData("Quiz Me!", "https://www.woolworths.com.au/shop/discover/our-brands/dining-in-quiz?icmpid=sm-fresh-ideas-for-you", null), 4)));
        DynamicPageBottomSheetData dynamicPageBottomSheetData = new DynamicPageBottomSheetData("save-with-the-odd-bunch", CollectionsKt.Q(contentListData), new AnalyticsData((EventConfig) null, "Other", "eComm campaign screen", NotificationResult.Notification.CAMPAIGN, "marketing landing page", "bottomsheet", (String) null, (String) null, "delivery now bottom sheet opened!", "mlp_campaign", (List) null, 1217, (DefaultConstructorMarker) null));
        CollectionsKt.R(contentListData, contentListData2);
        d = new DynamicPageFeedData(new DynamicPageHeaderData("Example Campaign", "https://cdn0.woolworths.media/content/content/delivery-unlimited-ints-332.png", null, null), CollectionsKt.R(contentListData, contentListData2, campaignCardCarouselData, new CampaignCardCarouselData(null, listR2), campaignCardListData, new CampaignCardListData(null, listR), campaignTermsAndConditionsData), new DynamicPageFooterData(new DynamicPageActionData("Shop", "com.woolworths.shop://products", null)), CollectionsKt.Q(dynamicPageBottomSheetData), new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null));
    }
}
