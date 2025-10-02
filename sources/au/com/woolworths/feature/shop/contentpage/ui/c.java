package au.com.woolworths.feature.shop.contentpage.ui;

import androidx.activity.result.ActivityResult;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.spatial.RelativeLayoutBounds;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.feature.shop.contentpage.ContentPageUiEvent;
import au.com.woolworths.feature.shop.inbox.InboxUiEvent;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientAppEvent;
import au.com.woolworths.feature.shop.product.availability.ProductAvailabilityUiEvent;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdBottomSheet;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.shop.aem.components.model.CatalogueCard;
import au.com.woolworths.shop.aem.components.model.editorialbanner.EditorialBannerData;
import au.com.woolworths.shop.aem.components.model.link.LinkData;
import au.com.woolworths.shop.aem.components.model.searchnavcard.SearchNavCardData;
import au.com.woolworths.shop.product.details.ProductDetailsEvent;
import au.com.woolworths.shop.product.details.data.ButtonData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ c(int i, Function1 function1) {
        this.d = i;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                BroadcastBannerData data = (BroadcastBannerData) obj;
                Intrinsics.h(data, "data");
                this.e.invoke(new ContentPageUiEvent.OnBroadcastBannerImpression(data));
                break;
            case 1:
                ActionData it = (ActionData) obj;
                Intrinsics.h(it, "it");
                this.e.invoke(new ContentPageUiEvent.OnOliveChatBannerClick(it));
                break;
            case 2:
                CatalogueCard it2 = (CatalogueCard) obj;
                Intrinsics.h(it2, "it");
                this.e.invoke(new ContentPageUiEvent.OnCatalogueCardClick(it2));
                break;
            case 3:
                SearchNavCardData it3 = (SearchNavCardData) obj;
                Intrinsics.h(it3, "it");
                this.e.invoke(new ContentPageUiEvent.OnSearchNavCardClicked(it3));
                break;
            case 4:
                ActionData it4 = (ActionData) obj;
                Intrinsics.h(it4, "it");
                this.e.invoke(new ContentPageUiEvent.OnCoreBroadcastBannerClicked(it4));
                break;
            case 5:
                AnalyticsData analyticsData = (AnalyticsData) obj;
                if (analyticsData != null) {
                    this.e.invoke(new ContentPageUiEvent.TrackBroadcastBannerImpression(analyticsData));
                }
                break;
            case 6:
                AnalyticsData analyticsData2 = (AnalyticsData) obj;
                if (analyticsData2 != null) {
                    this.e.invoke(new ContentPageUiEvent.TrackBroadcastBannerDismissed(analyticsData2));
                }
                break;
            case 7:
                AnalyticsData it5 = (AnalyticsData) obj;
                Intrinsics.h(it5, "it");
                Function1 function1 = this.e;
                if (function1 != null) {
                    function1.invoke(it5);
                }
                break;
            case 8:
                LinkData it6 = (LinkData) obj;
                Intrinsics.h(it6, "it");
                this.e.invoke(new ContentPageUiEvent.OnVideoAdLinkClick(it6.b));
                break;
            case 9:
                ActionData it7 = (ActionData) obj;
                Intrinsics.h(it7, "it");
                this.e.invoke(new ContentPageUiEvent.OnButtonClick(it7));
                break;
            case 10:
                ActionData actionData = (ActionData) obj;
                Intrinsics.h(actionData, "actionData");
                this.e.invoke(new ContentPageUiEvent.OnInfoTileButtonClick(actionData));
                break;
            case 11:
                ActivityResult result = (ActivityResult) obj;
                Intrinsics.h(result, "result");
                this.e.invoke(result);
                break;
            case 12:
                EditorialBannerData it8 = (EditorialBannerData) obj;
                Intrinsics.h(it8, "it");
                Function1 function12 = this.e;
                if (function12 != null) {
                    function12.invoke(it8);
                }
                break;
            case 13:
                ActionData it9 = (ActionData) obj;
                Intrinsics.h(it9, "it");
                Function1 function13 = this.e;
                if (function13 != null) {
                    function13.invoke(it9);
                }
                break;
            case 14:
                VideoAdBottomSheet videoAdBottomSheet = (VideoAdBottomSheet) obj;
                Intrinsics.h(videoAdBottomSheet, "videoAdBottomSheet");
                Function1 function14 = this.e;
                if (function14 != null) {
                    function14.invoke(videoAdBottomSheet);
                }
                break;
            case 15:
                DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
                Intrinsics.h(DisposableEffect, "$this$DisposableEffect");
                this.e.invoke(InboxUiEvent.TrackMessageUsBannerView.f7278a);
                break;
            case 16:
                List items = (List) obj;
                Intrinsics.h(items, "items");
                ArrayList arrayList = new ArrayList();
                Iterator it10 = items.iterator();
                while (it10.hasNext()) {
                    Object l = ((LazyListItemInfo) it10.next()).getL();
                    String str = l instanceof String ? (String) l : null;
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                this.e.invoke(new InboxUiEvent.RecordSeenItems(arrayList));
                break;
            case 17:
                DisposableEffectScope DisposableEffect2 = (DisposableEffectScope) obj;
                Intrinsics.h(DisposableEffect2, "$this$DisposableEffect");
                OriientAppEvent oriientAppEvent = OriientAppEvent.e;
                final Function1 function15 = this.e;
                function15.invoke(oriientAppEvent);
                break;
            case 18:
                DisposableEffectScope DisposableEffect3 = (DisposableEffectScope) obj;
                Intrinsics.h(DisposableEffect3, "$this$DisposableEffect");
                OriientAppEvent oriientAppEvent2 = OriientAppEvent.k;
                final Function1 function16 = this.e;
                function16.invoke(oriientAppEvent2);
                break;
            case 19:
                DisposableEffectScope DisposableEffect4 = (DisposableEffectScope) obj;
                Intrinsics.h(DisposableEffect4, "$this$DisposableEffect");
                this.e.invoke(OriientAppEvent.i);
                break;
            case 20:
                String storeId = (String) obj;
                Intrinsics.h(storeId, "storeId");
                this.e.invoke(new ProductAvailabilityUiEvent.ShowStoreDetails(storeId));
                break;
            case 21:
                Integer num = (Integer) obj;
                num.intValue();
                this.e.invoke(num);
                break;
            case 22:
                RelativeLayoutBounds it11 = (RelativeLayoutBounds) obj;
                Intrinsics.h(it11, "it");
                this.e.invoke(Integer.valueOf(((int) it11.b) - ((int) it11.f2027a)));
                break;
            case 23:
                ActionData it12 = (ActionData) obj;
                Intrinsics.h(it12, "it");
                this.e.invoke(it12);
                break;
            case 24:
                VideoAdBottomSheet videoAdBottomSheet2 = (VideoAdBottomSheet) obj;
                Intrinsics.h(videoAdBottomSheet2, "videoAdBottomSheet");
                this.e.invoke(videoAdBottomSheet2);
                break;
            case 25:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.e.invoke(bool);
                break;
            case 26:
                ButtonData buttonData = (ButtonData) obj;
                Intrinsics.h(buttonData, "buttonData");
                this.e.invoke(new ProductDetailsEvent.OnFooterButtonClick(buttonData));
                break;
            case 27:
                this.e.invoke(new ProductDetailsEvent.OnImageGalleryThumbnailClicked(((Integer) obj).intValue()));
                break;
            case 28:
                String it13 = (String) obj;
                Intrinsics.h(it13, "it");
                this.e.invoke(it13);
                break;
            default:
                ContentCta it14 = (ContentCta) obj;
                Intrinsics.h(it14, "it");
                String url = it14.getUrl();
                if (url != null) {
                    this.e.invoke(url);
                }
                break;
        }
        return Unit.f24250a;
    }
}
