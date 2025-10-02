package au.com.woolworths.feature.shop.more.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.shop.more.MoreFeedQuery;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFieldsImpl_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.BroadcastBannerType;
import au.com.woolworths.shop.graphql.type.CoreAlertStyle;
import au.com.woolworths.shop.graphql.type.MoreDeliveryUnlimitedStatus;
import au.com.woolworths.shop.graphql.type.adapter.ActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.BroadcastBannerType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CoreAlertStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.MoreDeliveryUnlimitedStatus_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\bÇ\u0002\u0018\u00002\u00020\u0001:\u0014\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lau/com/woolworths/feature/shop/more/adapter/MoreFeedQuery_ResponseAdapter;", "", "Data", "More", "Feed", "OnMoreRewardsCard", "OnMoreDeliveryUnlimited", "OnMoreCiscoWiFi", "OnMoreEReceipts", "OnMoreReceiptPreferences", "OnMoreOnlineShopping", "OnMoreChat", "UnreadChatbotMsg", "OnMoreNotifications", "OnBroadcastBanner", "OnMoreDeleteAccount", "OnMoreExplainingValue", "OnBasicInsetAlert", "InsetAlertUI", "InsetAlertAction", "Analytics", "OnMoreFoodTracker", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MoreFeedQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/more/adapter/MoreFeedQuery_ResponseAdapter$Analytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/more/MoreFeedQuery$Analytics;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics implements Adapter<MoreFeedQuery.Analytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics f7609a = new Analytics();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            AnalyticsFields analyticsFieldsA = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new MoreFeedQuery.Analytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            MoreFeedQuery.Analytics value = (MoreFeedQuery.Analytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f7583a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/more/adapter/MoreFeedQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/more/MoreFeedQuery$Data;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<MoreFeedQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f7610a = new Data();
        public static final List b = CollectionsKt.Q("more");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            MoreFeedQuery.More more = null;
            while (reader.o2(b) == 0) {
                more = (MoreFeedQuery.More) Adapters.c(More.f7614a, false).fromJson(reader, customScalarAdapters);
            }
            if (more != null) {
                return new MoreFeedQuery.Data(more);
            }
            Assertions.a(reader, "more");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            MoreFeedQuery.Data value = (MoreFeedQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("more");
            Adapters.c(More.f7614a, false).toJson(writer, customScalarAdapters, value.f7584a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/more/adapter/MoreFeedQuery_ResponseAdapter$Feed;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/more/MoreFeedQuery$Feed;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Feed implements Adapter<MoreFeedQuery.Feed> {

        /* renamed from: a, reason: collision with root package name */
        public static final Feed f7611a = new Feed();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            MoreFeedQuery.OnMoreRewardsCard onMoreRewardsCardA;
            MoreFeedQuery.OnMoreDeliveryUnlimited onMoreDeliveryUnlimitedA;
            MoreFeedQuery.OnMoreCiscoWiFi onMoreCiscoWiFiA;
            MoreFeedQuery.OnMoreEReceipts onMoreEReceiptsA;
            MoreFeedQuery.OnMoreReceiptPreferences onMoreReceiptPreferencesA;
            MoreFeedQuery.OnMoreOnlineShopping onMoreOnlineShoppingA;
            MoreFeedQuery.OnMoreChat onMoreChatA;
            MoreFeedQuery.OnMoreNotifications onMoreNotificationsA;
            MoreFeedQuery.OnBroadcastBanner onBroadcastBannerA;
            MoreFeedQuery.OnMoreDeleteAccount onMoreDeleteAccountA;
            MoreFeedQuery.OnMoreExplainingValue onMoreExplainingValueA;
            MoreFeedQuery.OnBasicInsetAlert onBasicInsetAlertA;
            MoreFeedQuery.OnMoreFoodTracker onMoreFoodTrackerA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("MoreRewardsCard"))) {
                reader.o();
                onMoreRewardsCardA = OnMoreRewardsCard.a(reader, customScalarAdapters);
            } else {
                onMoreRewardsCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("MoreDeliveryUnlimited"))) {
                reader.o();
                onMoreDeliveryUnlimitedA = OnMoreDeliveryUnlimited.a(reader, customScalarAdapters);
            } else {
                onMoreDeliveryUnlimitedA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("MoreCiscoWiFi"))) {
                reader.o();
                onMoreCiscoWiFiA = OnMoreCiscoWiFi.a(reader, customScalarAdapters);
            } else {
                onMoreCiscoWiFiA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("MoreEReceipts"), BooleanExpressions.d("eReceiptsEnabled")))) {
                reader.o();
                onMoreEReceiptsA = OnMoreEReceipts.a(reader, customScalarAdapters);
            } else {
                onMoreEReceiptsA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("MoreReceiptPreferences"), BooleanExpressions.d("eReceiptsEnabled")))) {
                reader.o();
                onMoreReceiptPreferencesA = OnMoreReceiptPreferences.a(reader, customScalarAdapters);
            } else {
                onMoreReceiptPreferencesA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("MoreOnlineShopping"))) {
                reader.o();
                onMoreOnlineShoppingA = OnMoreOnlineShopping.a(reader, customScalarAdapters);
            } else {
                onMoreOnlineShoppingA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("MoreChat"))) {
                reader.o();
                onMoreChatA = OnMoreChat.a(reader, customScalarAdapters);
            } else {
                onMoreChatA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("MoreNotifications"))) {
                reader.o();
                onMoreNotificationsA = OnMoreNotifications.a(reader, customScalarAdapters);
            } else {
                onMoreNotificationsA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("BroadcastBanner"))) {
                reader.o();
                onBroadcastBannerA = OnBroadcastBanner.a(reader, customScalarAdapters);
            } else {
                onBroadcastBannerA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("MoreDeleteAccount"))) {
                reader.o();
                onMoreDeleteAccountA = OnMoreDeleteAccount.a(reader, customScalarAdapters);
            } else {
                onMoreDeleteAccountA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("MoreExplainingValue"))) {
                reader.o();
                onMoreExplainingValueA = OnMoreExplainingValue.a(reader, customScalarAdapters);
            } else {
                onMoreExplainingValueA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("BasicInsetAlert"), BooleanExpressions.d("includeBasicInsetAlert")))) {
                reader.o();
                onBasicInsetAlertA = OnBasicInsetAlert.a(reader, customScalarAdapters);
            } else {
                onBasicInsetAlertA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("MoreFoodTracker"))) {
                reader.o();
                onMoreFoodTrackerA = OnMoreFoodTracker.a(reader, customScalarAdapters);
            } else {
                onMoreFoodTrackerA = null;
            }
            return new MoreFeedQuery.Feed(str, onMoreRewardsCardA, onMoreDeliveryUnlimitedA, onMoreCiscoWiFiA, onMoreEReceiptsA, onMoreReceiptPreferencesA, onMoreOnlineShoppingA, onMoreChatA, onMoreNotificationsA, onBroadcastBannerA, onMoreDeleteAccountA, onMoreExplainingValueA, onBasicInsetAlertA, onMoreFoodTrackerA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            MoreFeedQuery.Feed value = (MoreFeedQuery.Feed) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f7585a);
            MoreFeedQuery.OnMoreRewardsCard onMoreRewardsCard = value.b;
            if (onMoreRewardsCard != null) {
                OnMoreRewardsCard.b(writer, customScalarAdapters, onMoreRewardsCard);
            }
            MoreFeedQuery.OnMoreDeliveryUnlimited onMoreDeliveryUnlimited = value.c;
            if (onMoreDeliveryUnlimited != null) {
                OnMoreDeliveryUnlimited.b(writer, customScalarAdapters, onMoreDeliveryUnlimited);
            }
            MoreFeedQuery.OnMoreCiscoWiFi onMoreCiscoWiFi = value.d;
            if (onMoreCiscoWiFi != null) {
                OnMoreCiscoWiFi.b(writer, customScalarAdapters, onMoreCiscoWiFi);
            }
            MoreFeedQuery.OnMoreEReceipts onMoreEReceipts = value.e;
            if (onMoreEReceipts != null) {
                OnMoreEReceipts.b(writer, customScalarAdapters, onMoreEReceipts);
            }
            MoreFeedQuery.OnMoreReceiptPreferences onMoreReceiptPreferences = value.f;
            if (onMoreReceiptPreferences != null) {
                OnMoreReceiptPreferences.b(writer, customScalarAdapters, onMoreReceiptPreferences);
            }
            MoreFeedQuery.OnMoreOnlineShopping onMoreOnlineShopping = value.g;
            if (onMoreOnlineShopping != null) {
                OnMoreOnlineShopping.b(writer, customScalarAdapters, onMoreOnlineShopping);
            }
            MoreFeedQuery.OnMoreChat onMoreChat = value.h;
            if (onMoreChat != null) {
                OnMoreChat.b(writer, customScalarAdapters, onMoreChat);
            }
            MoreFeedQuery.OnMoreNotifications onMoreNotifications = value.i;
            if (onMoreNotifications != null) {
                OnMoreNotifications.b(writer, customScalarAdapters, onMoreNotifications);
            }
            MoreFeedQuery.OnBroadcastBanner onBroadcastBanner = value.j;
            if (onBroadcastBanner != null) {
                OnBroadcastBanner.b(writer, customScalarAdapters, onBroadcastBanner);
            }
            MoreFeedQuery.OnMoreDeleteAccount onMoreDeleteAccount = value.k;
            if (onMoreDeleteAccount != null) {
                OnMoreDeleteAccount.b(writer, customScalarAdapters, onMoreDeleteAccount);
            }
            MoreFeedQuery.OnMoreExplainingValue onMoreExplainingValue = value.l;
            if (onMoreExplainingValue != null) {
                OnMoreExplainingValue.b(writer, customScalarAdapters, onMoreExplainingValue);
            }
            MoreFeedQuery.OnBasicInsetAlert onBasicInsetAlert = value.m;
            if (onBasicInsetAlert != null) {
                OnBasicInsetAlert.b(writer, customScalarAdapters, onBasicInsetAlert);
            }
            MoreFeedQuery.OnMoreFoodTracker onMoreFoodTracker = value.n;
            if (onMoreFoodTracker != null) {
                OnMoreFoodTracker.b(writer, customScalarAdapters, onMoreFoodTracker);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/more/adapter/MoreFeedQuery_ResponseAdapter$InsetAlertAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/more/MoreFeedQuery$InsetAlertAction;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InsetAlertAction implements Adapter<MoreFeedQuery.InsetAlertAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final InsetAlertAction f7612a = new InsetAlertAction();
        public static final List b = CollectionsKt.R("id", "type", UrlHandler.ACTION, "analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ActionType actionTypeA = null;
            String str2 = null;
            MoreFeedQuery.Analytics analytics = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    analytics = (MoreFeedQuery.Analytics) Adapters.b(Adapters.c(Analytics.f7609a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str2 != null) {
                return new MoreFeedQuery.InsetAlertAction(str, actionTypeA, str2, analytics);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            MoreFeedQuery.InsetAlertAction value = (MoreFeedQuery.InsetAlertAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.f7586a);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics.f7609a, true)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/more/adapter/MoreFeedQuery_ResponseAdapter$InsetAlertUI;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/more/MoreFeedQuery$InsetAlertUI;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InsetAlertUI implements Adapter<MoreFeedQuery.InsetAlertUI> {

        /* renamed from: a, reason: collision with root package name */
        public static final InsetAlertUI f7613a = new InsetAlertUI();
        public static final List b = CollectionsKt.R("title", lqlqqlq.mmm006Dm006Dm, "style");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            CoreAlertStyle coreAlertStyleA = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    coreAlertStyleA = CoreAlertStyle_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (coreAlertStyleA != null) {
                return new MoreFeedQuery.InsetAlertUI(coreAlertStyleA, str, str2);
            }
            Assertions.a(reader, "style");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            MoreFeedQuery.InsetAlertUI value = (MoreFeedQuery.InsetAlertUI) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f7587a);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            CoreAlertStyle_ResponseAdapter.b(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/more/adapter/MoreFeedQuery_ResponseAdapter$More;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/more/MoreFeedQuery$More;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class More implements Adapter<MoreFeedQuery.More> {

        /* renamed from: a, reason: collision with root package name */
        public static final More f7614a = new More();
        public static final List b = CollectionsKt.Q("feed");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(b) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(Feed.f7611a, true)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new MoreFeedQuery.More(arrayListFromJson);
            }
            Assertions.a(reader, "feed");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            MoreFeedQuery.More value = (MoreFeedQuery.More) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("feed");
            Adapters.a(Adapters.c(Feed.f7611a, true)).toJson(writer, customScalarAdapters, value.f7588a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/more/adapter/MoreFeedQuery_ResponseAdapter$OnBasicInsetAlert;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/more/MoreFeedQuery$OnBasicInsetAlert;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnBasicInsetAlert implements Adapter<MoreFeedQuery.OnBasicInsetAlert> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f7615a = CollectionsKt.R("insetAlertUI", "insetAlertAction", "insetAlertActionLabel");

        public static MoreFeedQuery.OnBasicInsetAlert a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            MoreFeedQuery.InsetAlertUI insetAlertUI = null;
            MoreFeedQuery.InsetAlertAction insetAlertAction = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(f7615a);
                if (iO2 == 0) {
                    insetAlertUI = (MoreFeedQuery.InsetAlertUI) Adapters.c(InsetAlertUI.f7613a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    insetAlertAction = (MoreFeedQuery.InsetAlertAction) Adapters.b(Adapters.c(InsetAlertAction.f7612a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (insetAlertUI != null) {
                return new MoreFeedQuery.OnBasicInsetAlert(insetAlertUI, insetAlertAction, str);
            }
            Assertions.a(reader, "insetAlertUI");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, MoreFeedQuery.OnBasicInsetAlert value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("insetAlertUI");
            Adapters.c(InsetAlertUI.f7613a, false).toJson(writer, customScalarAdapters, value.f7589a);
            writer.F1("insetAlertAction");
            Adapters.b(Adapters.c(InsetAlertAction.f7612a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("insetAlertActionLabel");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (MoreFeedQuery.OnBasicInsetAlert) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/more/adapter/MoreFeedQuery_ResponseAdapter$OnBroadcastBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/more/MoreFeedQuery$OnBroadcastBanner;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnBroadcastBanner implements Adapter<MoreFeedQuery.OnBroadcastBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f7616a = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "deeplink", "type", "imageUrl", "actionLabel", "analyticsLabel", "dismissible", "bannerId");

        public static MoreFeedQuery.OnBroadcastBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            BroadcastBannerType broadcastBannerTypeA = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            Boolean bool = null;
            String str7 = null;
            while (true) {
                switch (reader.o2(f7616a)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        broadcastBannerTypeA = BroadcastBannerType_ResponseAdapter.a(reader, customScalarAdapters);
                        break;
                    case 4:
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str6 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        str7 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (broadcastBannerTypeA == null) {
                            Assertions.a(reader, "type");
                            throw null;
                        }
                        if (str4 != null) {
                            return new MoreFeedQuery.OnBroadcastBanner(str, str2, str3, broadcastBannerTypeA, str4, str5, str6, bool, str7);
                        }
                        Assertions.a(reader, "imageUrl");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, MoreFeedQuery.OnBroadcastBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f7590a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("deeplink");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("type");
            BroadcastBannerType_ResponseAdapter.b(writer, customScalarAdapters, value.d);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("actionLabel");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
            writer.F1("analyticsLabel");
            nullableAdapter.toJson(writer, customScalarAdapters, value.g);
            writer.F1("dismissible");
            Adapters.l.toJson(writer, customScalarAdapters, value.h);
            writer.F1("bannerId");
            nullableAdapter.toJson(writer, customScalarAdapters, value.i);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (MoreFeedQuery.OnBroadcastBanner) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/more/adapter/MoreFeedQuery_ResponseAdapter$OnMoreChat;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/more/MoreFeedQuery$OnMoreChat;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnMoreChat implements Adapter<MoreFeedQuery.OnMoreChat> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f7617a = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "url", "unreadChatbotMsg");

        public static MoreFeedQuery.OnMoreChat a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            MoreFeedQuery.UnreadChatbotMsg unreadChatbotMsg = null;
            while (true) {
                int iO2 = reader.o2(f7617a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    unreadChatbotMsg = (MoreFeedQuery.UnreadChatbotMsg) Adapters.b(Adapters.c(UnreadChatbotMsg.f7628a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new MoreFeedQuery.OnMoreChat(str, str2, str3, unreadChatbotMsg);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, MoreFeedQuery.OnMoreChat value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f7591a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("url");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("unreadChatbotMsg");
            Adapters.b(Adapters.c(UnreadChatbotMsg.f7628a, false)).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (MoreFeedQuery.OnMoreChat) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/more/adapter/MoreFeedQuery_ResponseAdapter$OnMoreCiscoWiFi;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/more/MoreFeedQuery$OnMoreCiscoWiFi;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnMoreCiscoWiFi implements Adapter<MoreFeedQuery.OnMoreCiscoWiFi> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f7618a = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE);

        public static MoreFeedQuery.OnMoreCiscoWiFi a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f7618a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new MoreFeedQuery.OnMoreCiscoWiFi(str, str2);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, MoreFeedQuery.OnMoreCiscoWiFi value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f7592a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (MoreFeedQuery.OnMoreCiscoWiFi) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/more/adapter/MoreFeedQuery_ResponseAdapter$OnMoreDeleteAccount;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/more/MoreFeedQuery$OnMoreDeleteAccount;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnMoreDeleteAccount implements Adapter<MoreFeedQuery.OnMoreDeleteAccount> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f7619a = CollectionsKt.Q("title");

        public static MoreFeedQuery.OnMoreDeleteAccount a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f7619a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new MoreFeedQuery.OnMoreDeleteAccount(str);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, MoreFeedQuery.OnMoreDeleteAccount value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f7593a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (MoreFeedQuery.OnMoreDeleteAccount) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/more/adapter/MoreFeedQuery_ResponseAdapter$OnMoreDeliveryUnlimited;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/more/MoreFeedQuery$OnMoreDeliveryUnlimited;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnMoreDeliveryUnlimited implements Adapter<MoreFeedQuery.OnMoreDeliveryUnlimited> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f7620a = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "badge", "status", "subscribeUrl");

        public static MoreFeedQuery.OnMoreDeliveryUnlimited a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            MoreDeliveryUnlimitedStatus moreDeliveryUnlimitedStatusA = null;
            String str4 = null;
            while (true) {
                int iO2 = reader.o2(f7620a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    moreDeliveryUnlimitedStatusA = MoreDeliveryUnlimitedStatus_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (moreDeliveryUnlimitedStatusA == null) {
                Assertions.a(reader, "status");
                throw null;
            }
            if (str4 != null) {
                return new MoreFeedQuery.OnMoreDeliveryUnlimited(str, str2, str3, moreDeliveryUnlimitedStatusA, str4);
            }
            Assertions.a(reader, "subscribeUrl");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, MoreFeedQuery.OnMoreDeliveryUnlimited value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f7594a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("badge");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("status");
            writer.v0(value.d.d);
            writer.F1("subscribeUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (MoreFeedQuery.OnMoreDeliveryUnlimited) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/more/adapter/MoreFeedQuery_ResponseAdapter$OnMoreEReceipts;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/more/MoreFeedQuery$OnMoreEReceipts;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnMoreEReceipts implements Adapter<MoreFeedQuery.OnMoreEReceipts> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f7621a = CollectionsKt.Q("title");

        public static MoreFeedQuery.OnMoreEReceipts a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f7621a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new MoreFeedQuery.OnMoreEReceipts(str);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, MoreFeedQuery.OnMoreEReceipts value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f7595a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (MoreFeedQuery.OnMoreEReceipts) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/more/adapter/MoreFeedQuery_ResponseAdapter$OnMoreExplainingValue;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/more/MoreFeedQuery$OnMoreExplainingValue;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnMoreExplainingValue implements Adapter<MoreFeedQuery.OnMoreExplainingValue> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f7622a = CollectionsKt.R("title", "url");

        public static MoreFeedQuery.OnMoreExplainingValue a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f7622a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new MoreFeedQuery.OnMoreExplainingValue(str, str2);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, MoreFeedQuery.OnMoreExplainingValue value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f7596a);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (MoreFeedQuery.OnMoreExplainingValue) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/more/adapter/MoreFeedQuery_ResponseAdapter$OnMoreFoodTracker;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/more/MoreFeedQuery$OnMoreFoodTracker;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnMoreFoodTracker implements Adapter<MoreFeedQuery.OnMoreFoodTracker> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f7623a = CollectionsKt.R("title", "url");

        public static MoreFeedQuery.OnMoreFoodTracker a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f7623a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new MoreFeedQuery.OnMoreFoodTracker(str, str2);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, MoreFeedQuery.OnMoreFoodTracker value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f7597a);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (MoreFeedQuery.OnMoreFoodTracker) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/more/adapter/MoreFeedQuery_ResponseAdapter$OnMoreNotifications;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/more/MoreFeedQuery$OnMoreNotifications;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnMoreNotifications implements Adapter<MoreFeedQuery.OnMoreNotifications> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f7624a = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE);

        public static MoreFeedQuery.OnMoreNotifications a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f7624a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new MoreFeedQuery.OnMoreNotifications(str, str2);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, MoreFeedQuery.OnMoreNotifications value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f7598a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (MoreFeedQuery.OnMoreNotifications) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/more/adapter/MoreFeedQuery_ResponseAdapter$OnMoreOnlineShopping;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/more/MoreFeedQuery$OnMoreOnlineShopping;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnMoreOnlineShopping implements Adapter<MoreFeedQuery.OnMoreOnlineShopping> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f7625a = CollectionsKt.R("title", "url");

        public static MoreFeedQuery.OnMoreOnlineShopping a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f7625a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new MoreFeedQuery.OnMoreOnlineShopping(str, str2);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, MoreFeedQuery.OnMoreOnlineShopping value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f7599a);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (MoreFeedQuery.OnMoreOnlineShopping) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/more/adapter/MoreFeedQuery_ResponseAdapter$OnMoreReceiptPreferences;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/more/MoreFeedQuery$OnMoreReceiptPreferences;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnMoreReceiptPreferences implements Adapter<MoreFeedQuery.OnMoreReceiptPreferences> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f7626a = CollectionsKt.R("title", "url");

        public static MoreFeedQuery.OnMoreReceiptPreferences a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f7626a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new MoreFeedQuery.OnMoreReceiptPreferences(str, str2);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, MoreFeedQuery.OnMoreReceiptPreferences value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f7600a);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (MoreFeedQuery.OnMoreReceiptPreferences) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/more/adapter/MoreFeedQuery_ResponseAdapter$OnMoreRewardsCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/more/MoreFeedQuery$OnMoreRewardsCard;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnMoreRewardsCard implements Adapter<MoreFeedQuery.OnMoreRewardsCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f7627a = CollectionsKt.R("cardNumber", "canBeUnlinked", "rewardsState");

        public static MoreFeedQuery.OnMoreRewardsCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Boolean bool = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f7627a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "cardNumber");
                throw null;
            }
            if (bool == null) {
                Assertions.a(reader, "canBeUnlinked");
                throw null;
            }
            boolean zBooleanValue = bool.booleanValue();
            if (str2 != null) {
                return new MoreFeedQuery.OnMoreRewardsCard(str, str2, zBooleanValue);
            }
            Assertions.a(reader, "rewardsState");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, MoreFeedQuery.OnMoreRewardsCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("cardNumber");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f7601a);
            writer.F1("canBeUnlinked");
            d.B(value.b, Adapters.f, writer, customScalarAdapters, "rewardsState");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (MoreFeedQuery.OnMoreRewardsCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/more/adapter/MoreFeedQuery_ResponseAdapter$UnreadChatbotMsg;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/more/MoreFeedQuery$UnreadChatbotMsg;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnreadChatbotMsg implements Adapter<MoreFeedQuery.UnreadChatbotMsg> {

        /* renamed from: a, reason: collision with root package name */
        public static final UnreadChatbotMsg f7628a = new UnreadChatbotMsg();
        public static final List b = CollectionsKt.Q("count");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            while (reader.o2(b) == 0) {
                num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
            }
            if (num != null) {
                return new MoreFeedQuery.UnreadChatbotMsg(num.intValue());
            }
            Assertions.a(reader, "count");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            MoreFeedQuery.UnreadChatbotMsg value = (MoreFeedQuery.UnreadChatbotMsg) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("count");
            Adapters.b.toJson(writer, customScalarAdapters, Integer.valueOf(value.f7602a));
        }
    }
}
