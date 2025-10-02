package au.com.woolworths.feature.shop.more;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.more.adapter.MoreFeedQuery_ResponseAdapter;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.BroadcastBannerType;
import au.com.woolworths.shop.graphql.type.CoreAlertStyle;
import au.com.woolworths.shop.graphql.type.MoreDeliveryUnlimitedStatus;
import au.com.woolworths.shop.graphql.type.ShoppingModeType;
import au.com.woolworths.shop.graphql.type.adapter.ShoppingModeType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0015\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreFeedQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/feature/shop/more/MoreFeedQuery$Data;", "Data", "More", "Feed", "OnMoreRewardsCard", "OnMoreDeliveryUnlimited", "OnMoreCiscoWiFi", "OnMoreEReceipts", "OnMoreReceiptPreferences", "OnMoreOnlineShopping", "OnMoreChat", "UnreadChatbotMsg", "OnMoreNotifications", "OnBroadcastBanner", "OnMoreDeleteAccount", "OnMoreExplainingValue", "OnBasicInsetAlert", "InsetAlertUI", "InsetAlertAction", "Analytics", "OnMoreFoodTracker", "Companion", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MoreFeedQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f7582a;
    public final ShoppingModeType b;
    public final Optional c;
    public final boolean d;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreFeedQuery$Analytics;", "", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f7583a;
        public final AnalyticsFields b;

        public Analytics(String str, AnalyticsFields analyticsFields) {
            this.f7583a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics)) {
                return false;
            }
            Analytics analytics = (Analytics) obj;
            return Intrinsics.c(this.f7583a, analytics.f7583a) && Intrinsics.c(this.b, analytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f7583a.hashCode() * 31);
        }

        public final String toString() {
            return au.com.woolworths.dynamic.page.ui.content.d.p("Analytics(__typename=", this.f7583a, ", analyticsFields=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreFeedQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreFeedQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final More f7584a;

        public Data(More more) {
            this.f7584a = more;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f7584a, ((Data) obj).f7584a);
        }

        public final int hashCode() {
            return this.f7584a.f7588a.hashCode();
        }

        public final String toString() {
            return "Data(more=" + this.f7584a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreFeedQuery$Feed;", "", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Feed {

        /* renamed from: a, reason: collision with root package name */
        public final String f7585a;
        public final OnMoreRewardsCard b;
        public final OnMoreDeliveryUnlimited c;
        public final OnMoreCiscoWiFi d;
        public final OnMoreEReceipts e;
        public final OnMoreReceiptPreferences f;
        public final OnMoreOnlineShopping g;
        public final OnMoreChat h;
        public final OnMoreNotifications i;
        public final OnBroadcastBanner j;
        public final OnMoreDeleteAccount k;
        public final OnMoreExplainingValue l;
        public final OnBasicInsetAlert m;
        public final OnMoreFoodTracker n;

        public Feed(String __typename, OnMoreRewardsCard onMoreRewardsCard, OnMoreDeliveryUnlimited onMoreDeliveryUnlimited, OnMoreCiscoWiFi onMoreCiscoWiFi, OnMoreEReceipts onMoreEReceipts, OnMoreReceiptPreferences onMoreReceiptPreferences, OnMoreOnlineShopping onMoreOnlineShopping, OnMoreChat onMoreChat, OnMoreNotifications onMoreNotifications, OnBroadcastBanner onBroadcastBanner, OnMoreDeleteAccount onMoreDeleteAccount, OnMoreExplainingValue onMoreExplainingValue, OnBasicInsetAlert onBasicInsetAlert, OnMoreFoodTracker onMoreFoodTracker) {
            Intrinsics.h(__typename, "__typename");
            this.f7585a = __typename;
            this.b = onMoreRewardsCard;
            this.c = onMoreDeliveryUnlimited;
            this.d = onMoreCiscoWiFi;
            this.e = onMoreEReceipts;
            this.f = onMoreReceiptPreferences;
            this.g = onMoreOnlineShopping;
            this.h = onMoreChat;
            this.i = onMoreNotifications;
            this.j = onBroadcastBanner;
            this.k = onMoreDeleteAccount;
            this.l = onMoreExplainingValue;
            this.m = onBasicInsetAlert;
            this.n = onMoreFoodTracker;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Feed)) {
                return false;
            }
            Feed feed = (Feed) obj;
            return Intrinsics.c(this.f7585a, feed.f7585a) && Intrinsics.c(this.b, feed.b) && Intrinsics.c(this.c, feed.c) && Intrinsics.c(this.d, feed.d) && Intrinsics.c(this.e, feed.e) && Intrinsics.c(this.f, feed.f) && Intrinsics.c(this.g, feed.g) && Intrinsics.c(this.h, feed.h) && Intrinsics.c(this.i, feed.i) && Intrinsics.c(this.j, feed.j) && Intrinsics.c(this.k, feed.k) && Intrinsics.c(this.l, feed.l) && Intrinsics.c(this.m, feed.m) && Intrinsics.c(this.n, feed.n);
        }

        public final int hashCode() {
            int iHashCode = this.f7585a.hashCode() * 31;
            OnMoreRewardsCard onMoreRewardsCard = this.b;
            int iHashCode2 = (iHashCode + (onMoreRewardsCard == null ? 0 : onMoreRewardsCard.hashCode())) * 31;
            OnMoreDeliveryUnlimited onMoreDeliveryUnlimited = this.c;
            int iHashCode3 = (iHashCode2 + (onMoreDeliveryUnlimited == null ? 0 : onMoreDeliveryUnlimited.hashCode())) * 31;
            OnMoreCiscoWiFi onMoreCiscoWiFi = this.d;
            int iHashCode4 = (iHashCode3 + (onMoreCiscoWiFi == null ? 0 : onMoreCiscoWiFi.hashCode())) * 31;
            OnMoreEReceipts onMoreEReceipts = this.e;
            int iHashCode5 = (iHashCode4 + (onMoreEReceipts == null ? 0 : onMoreEReceipts.f7595a.hashCode())) * 31;
            OnMoreReceiptPreferences onMoreReceiptPreferences = this.f;
            int iHashCode6 = (iHashCode5 + (onMoreReceiptPreferences == null ? 0 : onMoreReceiptPreferences.hashCode())) * 31;
            OnMoreOnlineShopping onMoreOnlineShopping = this.g;
            int iHashCode7 = (iHashCode6 + (onMoreOnlineShopping == null ? 0 : onMoreOnlineShopping.hashCode())) * 31;
            OnMoreChat onMoreChat = this.h;
            int iHashCode8 = (iHashCode7 + (onMoreChat == null ? 0 : onMoreChat.hashCode())) * 31;
            OnMoreNotifications onMoreNotifications = this.i;
            int iHashCode9 = (iHashCode8 + (onMoreNotifications == null ? 0 : onMoreNotifications.hashCode())) * 31;
            OnBroadcastBanner onBroadcastBanner = this.j;
            int iHashCode10 = (iHashCode9 + (onBroadcastBanner == null ? 0 : onBroadcastBanner.hashCode())) * 31;
            OnMoreDeleteAccount onMoreDeleteAccount = this.k;
            int iHashCode11 = (iHashCode10 + (onMoreDeleteAccount == null ? 0 : onMoreDeleteAccount.f7593a.hashCode())) * 31;
            OnMoreExplainingValue onMoreExplainingValue = this.l;
            int iHashCode12 = (iHashCode11 + (onMoreExplainingValue == null ? 0 : onMoreExplainingValue.hashCode())) * 31;
            OnBasicInsetAlert onBasicInsetAlert = this.m;
            int iHashCode13 = (iHashCode12 + (onBasicInsetAlert == null ? 0 : onBasicInsetAlert.hashCode())) * 31;
            OnMoreFoodTracker onMoreFoodTracker = this.n;
            return iHashCode13 + (onMoreFoodTracker != null ? onMoreFoodTracker.hashCode() : 0);
        }

        public final String toString() {
            return "Feed(__typename=" + this.f7585a + ", onMoreRewardsCard=" + this.b + ", onMoreDeliveryUnlimited=" + this.c + ", onMoreCiscoWiFi=" + this.d + ", onMoreEReceipts=" + this.e + ", onMoreReceiptPreferences=" + this.f + ", onMoreOnlineShopping=" + this.g + ", onMoreChat=" + this.h + ", onMoreNotifications=" + this.i + ", onBroadcastBanner=" + this.j + ", onMoreDeleteAccount=" + this.k + ", onMoreExplainingValue=" + this.l + ", onBasicInsetAlert=" + this.m + ", onMoreFoodTracker=" + this.n + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreFeedQuery$InsetAlertAction;", "", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InsetAlertAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f7586a;
        public final ActionType b;
        public final String c;
        public final Analytics d;

        public InsetAlertAction(String str, ActionType actionType, String str2, Analytics analytics) {
            this.f7586a = str;
            this.b = actionType;
            this.c = str2;
            this.d = analytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InsetAlertAction)) {
                return false;
            }
            InsetAlertAction insetAlertAction = (InsetAlertAction) obj;
            return Intrinsics.c(this.f7586a, insetAlertAction.f7586a) && this.b == insetAlertAction.b && Intrinsics.c(this.c, insetAlertAction.c) && Intrinsics.c(this.d, insetAlertAction.d);
        }

        public final int hashCode() {
            String str = this.f7586a;
            int iC = androidx.camera.core.impl.b.c(au.com.woolworths.dynamic.page.ui.content.d.a(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.c);
            Analytics analytics = this.d;
            return iC + (analytics != null ? analytics.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbW = au.com.woolworths.dynamic.page.ui.content.d.w("InsetAlertAction(id=", this.f7586a, ", type=", this.b, ", action=");
            sbW.append(this.c);
            sbW.append(", analytics=");
            sbW.append(this.d);
            sbW.append(")");
            return sbW.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreFeedQuery$InsetAlertUI;", "", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InsetAlertUI {

        /* renamed from: a, reason: collision with root package name */
        public final String f7587a;
        public final String b;
        public final CoreAlertStyle c;

        public InsetAlertUI(CoreAlertStyle coreAlertStyle, String str, String str2) {
            this.f7587a = str;
            this.b = str2;
            this.c = coreAlertStyle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InsetAlertUI)) {
                return false;
            }
            InsetAlertUI insetAlertUI = (InsetAlertUI) obj;
            return Intrinsics.c(this.f7587a, insetAlertUI.f7587a) && Intrinsics.c(this.b, insetAlertUI.b) && this.c == insetAlertUI.c;
        }

        public final int hashCode() {
            String str = this.f7587a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("InsetAlertUI(title=", this.f7587a, ", description=", this.b, ", style=");
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreFeedQuery$More;", "", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class More {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f7588a;

        public More(ArrayList arrayList) {
            this.f7588a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof More) && this.f7588a.equals(((More) obj).f7588a);
        }

        public final int hashCode() {
            return this.f7588a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.k("More(feed=", ")", this.f7588a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreFeedQuery$OnBasicInsetAlert;", "", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnBasicInsetAlert {

        /* renamed from: a, reason: collision with root package name */
        public final InsetAlertUI f7589a;
        public final InsetAlertAction b;
        public final String c;

        public OnBasicInsetAlert(InsetAlertUI insetAlertUI, InsetAlertAction insetAlertAction, String str) {
            this.f7589a = insetAlertUI;
            this.b = insetAlertAction;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnBasicInsetAlert)) {
                return false;
            }
            OnBasicInsetAlert onBasicInsetAlert = (OnBasicInsetAlert) obj;
            return Intrinsics.c(this.f7589a, onBasicInsetAlert.f7589a) && Intrinsics.c(this.b, onBasicInsetAlert.b) && Intrinsics.c(this.c, onBasicInsetAlert.c);
        }

        public final int hashCode() {
            int iHashCode = this.f7589a.hashCode() * 31;
            InsetAlertAction insetAlertAction = this.b;
            int iHashCode2 = (iHashCode + (insetAlertAction == null ? 0 : insetAlertAction.hashCode())) * 31;
            String str = this.c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnBasicInsetAlert(insetAlertUI=");
            sb.append(this.f7589a);
            sb.append(", insetAlertAction=");
            sb.append(this.b);
            sb.append(", insetAlertActionLabel=");
            return YU.a.o(sb, this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreFeedQuery$OnBroadcastBanner;", "", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnBroadcastBanner {

        /* renamed from: a, reason: collision with root package name */
        public final String f7590a;
        public final String b;
        public final String c;
        public final BroadcastBannerType d;
        public final String e;
        public final String f;
        public final String g;
        public final Boolean h;
        public final String i;

        public OnBroadcastBanner(String str, String str2, String str3, BroadcastBannerType broadcastBannerType, String str4, String str5, String str6, Boolean bool, String str7) {
            this.f7590a = str;
            this.b = str2;
            this.c = str3;
            this.d = broadcastBannerType;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = bool;
            this.i = str7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnBroadcastBanner)) {
                return false;
            }
            OnBroadcastBanner onBroadcastBanner = (OnBroadcastBanner) obj;
            return Intrinsics.c(this.f7590a, onBroadcastBanner.f7590a) && Intrinsics.c(this.b, onBroadcastBanner.b) && Intrinsics.c(this.c, onBroadcastBanner.c) && this.d == onBroadcastBanner.d && Intrinsics.c(this.e, onBroadcastBanner.e) && Intrinsics.c(this.f, onBroadcastBanner.f) && Intrinsics.c(this.g, onBroadcastBanner.g) && Intrinsics.c(this.h, onBroadcastBanner.h) && Intrinsics.c(this.i, onBroadcastBanner.i);
        }

        public final int hashCode() {
            int iHashCode = this.f7590a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iC = androidx.camera.core.impl.b.c((this.d.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.e);
            String str3 = this.f;
            int iHashCode3 = (iC + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.g;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool = this.h;
            int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str5 = this.i;
            return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnBroadcastBanner(title=", this.f7590a, ", subtitle=", this.b, ", deeplink=");
            sbV.append(this.c);
            sbV.append(", type=");
            sbV.append(this.d);
            sbV.append(", imageUrl=");
            androidx.constraintlayout.core.state.a.B(sbV, this.e, ", actionLabel=", this.f, ", analyticsLabel=");
            au.com.woolworths.android.onesite.a.A(sbV, this.g, ", dismissible=", this.h, ", bannerId=");
            return YU.a.o(sbV, this.i, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreFeedQuery$OnMoreChat;", "", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnMoreChat {

        /* renamed from: a, reason: collision with root package name */
        public final String f7591a;
        public final String b;
        public final String c;
        public final UnreadChatbotMsg d;

        public OnMoreChat(String str, String str2, String str3, UnreadChatbotMsg unreadChatbotMsg) {
            this.f7591a = str;
            this.b = str2;
            this.c = str3;
            this.d = unreadChatbotMsg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnMoreChat)) {
                return false;
            }
            OnMoreChat onMoreChat = (OnMoreChat) obj;
            return Intrinsics.c(this.f7591a, onMoreChat.f7591a) && Intrinsics.c(this.b, onMoreChat.b) && Intrinsics.c(this.c, onMoreChat.c) && Intrinsics.c(this.d, onMoreChat.d);
        }

        public final int hashCode() {
            int iHashCode = this.f7591a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            UnreadChatbotMsg unreadChatbotMsg = this.d;
            return iHashCode3 + (unreadChatbotMsg != null ? Integer.hashCode(unreadChatbotMsg.f7602a) : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnMoreChat(title=", this.f7591a, ", subtitle=", this.b, ", url=");
            sbV.append(this.c);
            sbV.append(", unreadChatbotMsg=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreFeedQuery$OnMoreCiscoWiFi;", "", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnMoreCiscoWiFi {

        /* renamed from: a, reason: collision with root package name */
        public final String f7592a;
        public final String b;

        public OnMoreCiscoWiFi(String str, String str2) {
            this.f7592a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnMoreCiscoWiFi)) {
                return false;
            }
            OnMoreCiscoWiFi onMoreCiscoWiFi = (OnMoreCiscoWiFi) obj;
            return Intrinsics.c(this.f7592a, onMoreCiscoWiFi.f7592a) && Intrinsics.c(this.b, onMoreCiscoWiFi.b);
        }

        public final int hashCode() {
            int iHashCode = this.f7592a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return YU.a.j("OnMoreCiscoWiFi(title=", this.f7592a, ", subtitle=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreFeedQuery$OnMoreDeleteAccount;", "", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnMoreDeleteAccount {

        /* renamed from: a, reason: collision with root package name */
        public final String f7593a;

        public OnMoreDeleteAccount(String str) {
            this.f7593a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnMoreDeleteAccount) && Intrinsics.c(this.f7593a, ((OnMoreDeleteAccount) obj).f7593a);
        }

        public final int hashCode() {
            return this.f7593a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnMoreDeleteAccount(title=", this.f7593a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreFeedQuery$OnMoreDeliveryUnlimited;", "", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnMoreDeliveryUnlimited {

        /* renamed from: a, reason: collision with root package name */
        public final String f7594a;
        public final String b;
        public final String c;
        public final MoreDeliveryUnlimitedStatus d;
        public final String e;

        public OnMoreDeliveryUnlimited(String str, String str2, String str3, MoreDeliveryUnlimitedStatus moreDeliveryUnlimitedStatus, String str4) {
            this.f7594a = str;
            this.b = str2;
            this.c = str3;
            this.d = moreDeliveryUnlimitedStatus;
            this.e = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnMoreDeliveryUnlimited)) {
                return false;
            }
            OnMoreDeliveryUnlimited onMoreDeliveryUnlimited = (OnMoreDeliveryUnlimited) obj;
            return Intrinsics.c(this.f7594a, onMoreDeliveryUnlimited.f7594a) && Intrinsics.c(this.b, onMoreDeliveryUnlimited.b) && Intrinsics.c(this.c, onMoreDeliveryUnlimited.c) && this.d == onMoreDeliveryUnlimited.d && Intrinsics.c(this.e, onMoreDeliveryUnlimited.e);
        }

        public final int hashCode() {
            int iHashCode = this.f7594a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            return this.e.hashCode() + ((this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnMoreDeliveryUnlimited(title=", this.f7594a, ", subtitle=", this.b, ", badge=");
            sbV.append(this.c);
            sbV.append(", status=");
            sbV.append(this.d);
            sbV.append(", subscribeUrl=");
            return YU.a.o(sbV, this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreFeedQuery$OnMoreEReceipts;", "", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnMoreEReceipts {

        /* renamed from: a, reason: collision with root package name */
        public final String f7595a;

        public OnMoreEReceipts(String str) {
            this.f7595a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnMoreEReceipts) && Intrinsics.c(this.f7595a, ((OnMoreEReceipts) obj).f7595a);
        }

        public final int hashCode() {
            return this.f7595a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnMoreEReceipts(title=", this.f7595a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreFeedQuery$OnMoreExplainingValue;", "", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnMoreExplainingValue {

        /* renamed from: a, reason: collision with root package name */
        public final String f7596a;
        public final String b;

        public OnMoreExplainingValue(String str, String str2) {
            this.f7596a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnMoreExplainingValue)) {
                return false;
            }
            OnMoreExplainingValue onMoreExplainingValue = (OnMoreExplainingValue) obj;
            return Intrinsics.c(this.f7596a, onMoreExplainingValue.f7596a) && Intrinsics.c(this.b, onMoreExplainingValue.b);
        }

        public final int hashCode() {
            int iHashCode = this.f7596a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return YU.a.j("OnMoreExplainingValue(title=", this.f7596a, ", url=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreFeedQuery$OnMoreFoodTracker;", "", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnMoreFoodTracker {

        /* renamed from: a, reason: collision with root package name */
        public final String f7597a;
        public final String b;

        public OnMoreFoodTracker(String str, String str2) {
            this.f7597a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnMoreFoodTracker)) {
                return false;
            }
            OnMoreFoodTracker onMoreFoodTracker = (OnMoreFoodTracker) obj;
            return Intrinsics.c(this.f7597a, onMoreFoodTracker.f7597a) && Intrinsics.c(this.b, onMoreFoodTracker.b);
        }

        public final int hashCode() {
            int iHashCode = this.f7597a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return YU.a.j("OnMoreFoodTracker(title=", this.f7597a, ", url=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreFeedQuery$OnMoreNotifications;", "", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnMoreNotifications {

        /* renamed from: a, reason: collision with root package name */
        public final String f7598a;
        public final String b;

        public OnMoreNotifications(String str, String str2) {
            this.f7598a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnMoreNotifications)) {
                return false;
            }
            OnMoreNotifications onMoreNotifications = (OnMoreNotifications) obj;
            return Intrinsics.c(this.f7598a, onMoreNotifications.f7598a) && Intrinsics.c(this.b, onMoreNotifications.b);
        }

        public final int hashCode() {
            int iHashCode = this.f7598a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return YU.a.j("OnMoreNotifications(title=", this.f7598a, ", subtitle=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreFeedQuery$OnMoreOnlineShopping;", "", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnMoreOnlineShopping {

        /* renamed from: a, reason: collision with root package name */
        public final String f7599a;
        public final String b;

        public OnMoreOnlineShopping(String str, String str2) {
            this.f7599a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnMoreOnlineShopping)) {
                return false;
            }
            OnMoreOnlineShopping onMoreOnlineShopping = (OnMoreOnlineShopping) obj;
            return Intrinsics.c(this.f7599a, onMoreOnlineShopping.f7599a) && Intrinsics.c(this.b, onMoreOnlineShopping.b);
        }

        public final int hashCode() {
            int iHashCode = this.f7599a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return YU.a.j("OnMoreOnlineShopping(title=", this.f7599a, ", url=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreFeedQuery$OnMoreReceiptPreferences;", "", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnMoreReceiptPreferences {

        /* renamed from: a, reason: collision with root package name */
        public final String f7600a;
        public final String b;

        public OnMoreReceiptPreferences(String str, String str2) {
            this.f7600a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnMoreReceiptPreferences)) {
                return false;
            }
            OnMoreReceiptPreferences onMoreReceiptPreferences = (OnMoreReceiptPreferences) obj;
            return Intrinsics.c(this.f7600a, onMoreReceiptPreferences.f7600a) && Intrinsics.c(this.b, onMoreReceiptPreferences.b);
        }

        public final int hashCode() {
            int iHashCode = this.f7600a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return YU.a.j("OnMoreReceiptPreferences(title=", this.f7600a, ", url=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreFeedQuery$OnMoreRewardsCard;", "", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnMoreRewardsCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f7601a;
        public final boolean b;
        public final String c;

        public OnMoreRewardsCard(String str, String str2, boolean z) {
            this.f7601a = str;
            this.b = z;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnMoreRewardsCard)) {
                return false;
            }
            OnMoreRewardsCard onMoreRewardsCard = (OnMoreRewardsCard) obj;
            return Intrinsics.c(this.f7601a, onMoreRewardsCard.f7601a) && this.b == onMoreRewardsCard.b && Intrinsics.c(this.c, onMoreRewardsCard.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + androidx.camera.core.impl.b.e(this.f7601a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return YU.a.o(androidx.constraintlayout.core.state.a.q("OnMoreRewardsCard(cardNumber=", this.f7601a, ", canBeUnlinked=", ", rewardsState=", this.b), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreFeedQuery$UnreadChatbotMsg;", "", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UnreadChatbotMsg {

        /* renamed from: a, reason: collision with root package name */
        public final int f7602a;

        public UnreadChatbotMsg(int i) {
            this.f7602a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnreadChatbotMsg) && this.f7602a == ((UnreadChatbotMsg) obj).f7602a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f7602a);
        }

        public final String toString() {
            return YU.a.e(this.f7602a, "UnreadChatbotMsg(count=", ")");
        }
    }

    public MoreFeedQuery(Optional optional, ShoppingModeType mode, Optional optional2, boolean z) {
        Intrinsics.h(mode, "mode");
        this.f7582a = optional;
        this.b = mode;
        this.c = optional2;
        this.d = z;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(MoreFeedQuery_ResponseAdapter.Data.f7610a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query MoreFeed($storeId: String, $mode: ShoppingModeType!, $eReceiptsEnabled: Boolean!, $chatbotSessionId: String, $includeBasicInsetAlert: Boolean!) { more(storeId: $storeId, mode: $mode, chatbotSessionId: $chatbotSessionId) { feed { __typename ... on MoreRewardsCard { cardNumber canBeUnlinked rewardsState } ... on MoreDeliveryUnlimited { title subtitle badge status subscribeUrl } ... on MoreCiscoWiFi { title subtitle } ... on MoreEReceipts @include(if: $eReceiptsEnabled) { title } ... on MoreReceiptPreferences @include(if: $eReceiptsEnabled) { title url } ... on MoreOnlineShopping { title url } ... on MoreChat { title subtitle url unreadChatbotMsg { count } } ... on MoreNotifications { title subtitle } ... on BroadcastBanner { title subtitle deeplink type imageUrl actionLabel analyticsLabel dismissible bannerId } ... on MoreDeleteAccount { title } ... on MoreExplainingValue { title url } ... on BasicInsetAlert @include(if: $includeBasicInsetAlert) { insetAlertUI { title description style } insetAlertAction { id type action analytics { __typename ...analyticsFields } } insetAlertActionLabel } ... on MoreFoodTracker { title url } } } }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoreFeedQuery)) {
            return false;
        }
        MoreFeedQuery moreFeedQuery = (MoreFeedQuery) obj;
        return this.f7582a.equals(moreFeedQuery.f7582a) && this.b == moreFeedQuery.b && this.c.equals(moreFeedQuery.c) && this.d == moreFeedQuery.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.c, androidx.camera.core.impl.b.e((this.b.hashCode() + (this.f7582a.hashCode() * 31)) * 31, 31, true), 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "bc64570563753f99bdc44e8249f05c2463e8e8a1261254496f92edd15e4d42ed";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "MoreFeed";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Optional optional = this.f7582a;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("storeId");
            Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        }
        jsonWriter.F1("mode");
        ShoppingModeType_ResponseAdapter.b(jsonWriter, customScalarAdapters, this.b);
        jsonWriter.F1("eReceiptsEnabled");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.TRUE);
        Optional optional2 = this.c;
        if (optional2 instanceof Optional.Present) {
            jsonWriter.F1("chatbotSessionId");
            Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional2);
        }
        jsonWriter.F1("includeBasicInsetAlert");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.d));
    }

    public final String toString() {
        return "MoreFeedQuery(storeId=" + this.f7582a + ", mode=" + this.b + ", eReceiptsEnabled=true, chatbotSessionId=" + this.c + ", includeBasicInsetAlert=" + this.d + ")";
    }
}
