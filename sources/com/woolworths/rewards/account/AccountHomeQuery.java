package com.woolworths.rewards.account;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.rewards.graphql.type.ActionType;
import au.com.woolworths.rewards.graphql.type.BannerNotificationDisplayType;
import au.com.woolworths.rewards.graphql.type.CoreAlertStyle;
import au.com.woolworths.rewards.graphql.type.HomeOptionAction;
import au.com.woolworths.rewards.graphql.type.adapter.RewardsAccountHomeFlags_InputAdapter;
import au.com.woolworths.sdui.rewards.fragment.AnalyticsFields;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.account.adapter.AccountHomeQuery_ResponseAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0018\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/woolworths/rewards/account/AccountHomeQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/rewards/account/AccountHomeQuery$Data;", "Data", "RewardsAccountHome", "AppUpgrade", "InsetAlertUI", "InsetAlertAction", "Analytics", "AccountBanner", "OnAccountBannerNotification", "PrimaryCta", "Section", "Option", "OnAccountHomeOptionItem", "Action", "OnAccountHomeOptionMagicLinkItem", "OnAccountHomeOptionMandyItem", "OnAccountHomeAndroidAppReviewLinkItem", "OnAccountHomeAndroidMedalliaItem", "OnAccountHomeOnboardingItem", "Action1", "OnAccountHomeOptionCanCloseAccountItem", "AccountHomeFooter", "Action2", "UnreadChatbotMsg", "Companion", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AccountHomeQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f20491a;
    public final Optional b;
    public final boolean c;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountHomeQuery$AccountBanner;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AccountBanner {

        /* renamed from: a, reason: collision with root package name */
        public final String f20492a;
        public final OnAccountBannerNotification b;

        public AccountBanner(String __typename, OnAccountBannerNotification onAccountBannerNotification) {
            Intrinsics.h(__typename, "__typename");
            this.f20492a = __typename;
            this.b = onAccountBannerNotification;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AccountBanner)) {
                return false;
            }
            AccountBanner accountBanner = (AccountBanner) obj;
            return Intrinsics.c(this.f20492a, accountBanner.f20492a) && Intrinsics.c(this.b, accountBanner.b);
        }

        public final int hashCode() {
            int iHashCode = this.f20492a.hashCode() * 31;
            OnAccountBannerNotification onAccountBannerNotification = this.b;
            return iHashCode + (onAccountBannerNotification == null ? 0 : onAccountBannerNotification.hashCode());
        }

        public final String toString() {
            return "AccountBanner(__typename=" + this.f20492a + ", onAccountBannerNotification=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountHomeQuery$AccountHomeFooter;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AccountHomeFooter {

        /* renamed from: a, reason: collision with root package name */
        public final String f20493a;
        public final String b;
        public final Action2 c;

        public AccountHomeFooter(String str, String str2, Action2 action2) {
            this.f20493a = str;
            this.b = str2;
            this.c = action2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AccountHomeFooter)) {
                return false;
            }
            AccountHomeFooter accountHomeFooter = (AccountHomeFooter) obj;
            return Intrinsics.c(this.f20493a, accountHomeFooter.f20493a) && Intrinsics.c(this.b, accountHomeFooter.b) && Intrinsics.c(this.c, accountHomeFooter.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f20493a.hashCode() * 31, 31, this.b);
            Action2 action2 = this.c;
            return iC + (action2 == null ? 0 : action2.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = a.v("AccountHomeFooter(iconUrl=", this.f20493a, ", description=", this.b, ", action=");
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountHomeQuery$Action;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action {

        /* renamed from: a, reason: collision with root package name */
        public final HomeOptionAction f20494a;
        public final String b;

        public Action(HomeOptionAction homeOptionAction, String str) {
            this.f20494a = homeOptionAction;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return this.f20494a == action.f20494a && Intrinsics.c(this.b, action.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20494a.hashCode() * 31);
        }

        public final String toString() {
            return "Action(action=" + this.f20494a + ", url=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountHomeQuery$Action1;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action1 {

        /* renamed from: a, reason: collision with root package name */
        public final HomeOptionAction f20495a;
        public final String b;

        public Action1(HomeOptionAction homeOptionAction, String str) {
            this.f20495a = homeOptionAction;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action1)) {
                return false;
            }
            Action1 action1 = (Action1) obj;
            return this.f20495a == action1.f20495a && Intrinsics.c(this.b, action1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20495a.hashCode() * 31);
        }

        public final String toString() {
            return "Action1(action=" + this.f20495a + ", url=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountHomeQuery$Action2;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f20496a;
        public final String b;

        public Action2(String str, String str2) {
            this.f20496a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action2)) {
                return false;
            }
            Action2 action2 = (Action2) obj;
            return Intrinsics.c(this.f20496a, action2.f20496a) && Intrinsics.c(this.b, action2.b);
        }

        public final int hashCode() {
            int iHashCode = this.f20496a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.j("Action2(url=", this.f20496a, ", label=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountHomeQuery$Analytics;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f20497a;
        public final AnalyticsFields b;

        public Analytics(String str, AnalyticsFields analyticsFields) {
            this.f20497a = str;
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
            return Intrinsics.c(this.f20497a, analytics.f20497a) && Intrinsics.c(this.b, analytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20497a.hashCode() * 31);
        }

        public final String toString() {
            return "Analytics(__typename=" + this.f20497a + ", analyticsFields=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountHomeQuery$AppUpgrade;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AppUpgrade {

        /* renamed from: a, reason: collision with root package name */
        public final InsetAlertUI f20498a;
        public final InsetAlertAction b;
        public final String c;

        public AppUpgrade(InsetAlertUI insetAlertUI, InsetAlertAction insetAlertAction, String str) {
            this.f20498a = insetAlertUI;
            this.b = insetAlertAction;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppUpgrade)) {
                return false;
            }
            AppUpgrade appUpgrade = (AppUpgrade) obj;
            return Intrinsics.c(this.f20498a, appUpgrade.f20498a) && Intrinsics.c(this.b, appUpgrade.b) && Intrinsics.c(this.c, appUpgrade.c);
        }

        public final int hashCode() {
            int iHashCode = this.f20498a.hashCode() * 31;
            InsetAlertAction insetAlertAction = this.b;
            int iHashCode2 = (iHashCode + (insetAlertAction == null ? 0 : insetAlertAction.hashCode())) * 31;
            String str = this.c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppUpgrade(insetAlertUI=");
            sb.append(this.f20498a);
            sb.append(", insetAlertAction=");
            sb.append(this.b);
            sb.append(", insetAlertActionLabel=");
            return a.o(sb, this.c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/rewards/account/AccountHomeQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountHomeQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final RewardsAccountHome f20499a;

        public Data(RewardsAccountHome rewardsAccountHome) {
            this.f20499a = rewardsAccountHome;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20499a, ((Data) obj).f20499a);
        }

        public final int hashCode() {
            RewardsAccountHome rewardsAccountHome = this.f20499a;
            if (rewardsAccountHome == null) {
                return 0;
            }
            return rewardsAccountHome.hashCode();
        }

        public final String toString() {
            return "Data(rewardsAccountHome=" + this.f20499a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountHomeQuery$InsetAlertAction;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InsetAlertAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f20500a;
        public final ActionType b;
        public final String c;
        public final Analytics d;

        public InsetAlertAction(String str, ActionType actionType, String str2, Analytics analytics) {
            this.f20500a = str;
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
            return Intrinsics.c(this.f20500a, insetAlertAction.f20500a) && this.b == insetAlertAction.b && Intrinsics.c(this.c, insetAlertAction.c) && Intrinsics.c(this.d, insetAlertAction.d);
        }

        public final int hashCode() {
            String str = this.f20500a;
            int iC = b.c((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.c);
            Analytics analytics = this.d;
            return iC + (analytics != null ? analytics.hashCode() : 0);
        }

        public final String toString() {
            return "InsetAlertAction(id=" + this.f20500a + ", type=" + this.b + ", action=" + this.c + ", analytics=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountHomeQuery$InsetAlertUI;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InsetAlertUI {

        /* renamed from: a, reason: collision with root package name */
        public final String f20501a;
        public final String b;
        public final CoreAlertStyle c;

        public InsetAlertUI(String str, String str2, CoreAlertStyle coreAlertStyle) {
            this.f20501a = str;
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
            return Intrinsics.c(this.f20501a, insetAlertUI.f20501a) && Intrinsics.c(this.b, insetAlertUI.b) && this.c == insetAlertUI.c;
        }

        public final int hashCode() {
            String str = this.f20501a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("InsetAlertUI(title=", this.f20501a, ", description=", this.b, ", style=");
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountHomeQuery$OnAccountBannerNotification;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnAccountBannerNotification {

        /* renamed from: a, reason: collision with root package name */
        public final String f20502a;
        public final BannerNotificationDisplayType b;
        public final String c;
        public final String d;
        public final PrimaryCta e;
        public final boolean f;
        public final boolean g;

        public OnAccountBannerNotification(String str, BannerNotificationDisplayType bannerNotificationDisplayType, String str2, String str3, PrimaryCta primaryCta, boolean z, boolean z2) {
            this.f20502a = str;
            this.b = bannerNotificationDisplayType;
            this.c = str2;
            this.d = str3;
            this.e = primaryCta;
            this.f = z;
            this.g = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnAccountBannerNotification)) {
                return false;
            }
            OnAccountBannerNotification onAccountBannerNotification = (OnAccountBannerNotification) obj;
            return Intrinsics.c(this.f20502a, onAccountBannerNotification.f20502a) && this.b == onAccountBannerNotification.b && Intrinsics.c(this.c, onAccountBannerNotification.c) && Intrinsics.c(this.d, onAccountBannerNotification.d) && Intrinsics.c(this.e, onAccountBannerNotification.e) && this.f == onAccountBannerNotification.f && this.g == onAccountBannerNotification.g;
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + (this.f20502a.hashCode() * 31)) * 31;
            String str = this.c;
            int iC = b.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
            PrimaryCta primaryCta = this.e;
            return Boolean.hashCode(this.g) + b.e((iC + (primaryCta != null ? primaryCta.hashCode() : 0)) * 31, 31, this.f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnAccountBannerNotification(id=");
            sb.append(this.f20502a);
            sb.append(", displayType=");
            sb.append(this.b);
            sb.append(", title=");
            androidx.constraintlayout.core.state.a.B(sb, this.c, ", message=", this.d, ", primaryCta=");
            sb.append(this.e);
            sb.append(", canDismiss=");
            sb.append(this.f);
            sb.append(", shouldShowNewBadge=");
            return a.k(")", sb, this.g);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountHomeQuery$OnAccountHomeAndroidAppReviewLinkItem;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnAccountHomeAndroidAppReviewLinkItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f20503a;
        public final String b;
        public final String c;
        public final Boolean d;

        public OnAccountHomeAndroidAppReviewLinkItem(String str, Boolean bool, String str2, String str3) {
            this.f20503a = str;
            this.b = str2;
            this.c = str3;
            this.d = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnAccountHomeAndroidAppReviewLinkItem)) {
                return false;
            }
            OnAccountHomeAndroidAppReviewLinkItem onAccountHomeAndroidAppReviewLinkItem = (OnAccountHomeAndroidAppReviewLinkItem) obj;
            return Intrinsics.c(this.f20503a, onAccountHomeAndroidAppReviewLinkItem.f20503a) && Intrinsics.c(this.b, onAccountHomeAndroidAppReviewLinkItem.b) && Intrinsics.c(this.c, onAccountHomeAndroidAppReviewLinkItem.c) && Intrinsics.c(this.d, onAccountHomeAndroidAppReviewLinkItem.d);
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f20503a.hashCode() * 31, 31, this.b), 31, this.c);
            Boolean bool = this.d;
            return iC + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnAccountHomeAndroidAppReviewLinkItem(id=", this.f20503a, ", title=", this.b, ", url=");
            sbV.append(this.c);
            sbV.append(", shouldShowNewBadge=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountHomeQuery$OnAccountHomeAndroidMedalliaItem;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnAccountHomeAndroidMedalliaItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f20504a;
        public final String b;
        public final String c;
        public final Boolean d;

        public OnAccountHomeAndroidMedalliaItem(String str, Boolean bool, String str2, String str3) {
            this.f20504a = str;
            this.b = str2;
            this.c = str3;
            this.d = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnAccountHomeAndroidMedalliaItem)) {
                return false;
            }
            OnAccountHomeAndroidMedalliaItem onAccountHomeAndroidMedalliaItem = (OnAccountHomeAndroidMedalliaItem) obj;
            return Intrinsics.c(this.f20504a, onAccountHomeAndroidMedalliaItem.f20504a) && Intrinsics.c(this.b, onAccountHomeAndroidMedalliaItem.b) && Intrinsics.c(this.c, onAccountHomeAndroidMedalliaItem.c) && Intrinsics.c(this.d, onAccountHomeAndroidMedalliaItem.d);
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f20504a.hashCode() * 31, 31, this.b), 31, this.c);
            Boolean bool = this.d;
            return iC + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnAccountHomeAndroidMedalliaItem(id=", this.f20504a, ", title=", this.b, ", formId=");
            sbV.append(this.c);
            sbV.append(", shouldShowNewBadge=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountHomeQuery$OnAccountHomeOnboardingItem;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnAccountHomeOnboardingItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f20505a;
        public final String b;
        public final Action1 c;
        public final Boolean d;

        public OnAccountHomeOnboardingItem(String str, String str2, Action1 action1, Boolean bool) {
            this.f20505a = str;
            this.b = str2;
            this.c = action1;
            this.d = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnAccountHomeOnboardingItem)) {
                return false;
            }
            OnAccountHomeOnboardingItem onAccountHomeOnboardingItem = (OnAccountHomeOnboardingItem) obj;
            return Intrinsics.c(this.f20505a, onAccountHomeOnboardingItem.f20505a) && Intrinsics.c(this.b, onAccountHomeOnboardingItem.b) && Intrinsics.c(this.c, onAccountHomeOnboardingItem.c) && Intrinsics.c(this.d, onAccountHomeOnboardingItem.d);
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + b.c(this.f20505a.hashCode() * 31, 31, this.b)) * 31;
            Boolean bool = this.d;
            return iHashCode + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnAccountHomeOnboardingItem(id=", this.f20505a, ", title=", this.b, ", action=");
            sbV.append(this.c);
            sbV.append(", shouldShowNewBadge=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountHomeQuery$OnAccountHomeOptionCanCloseAccountItem;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnAccountHomeOptionCanCloseAccountItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f20506a;
        public final String b;
        public final String c;
        public final String d;
        public final Boolean e;

        public OnAccountHomeOptionCanCloseAccountItem(Boolean bool, String str, String str2, String str3, String str4) {
            this.f20506a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnAccountHomeOptionCanCloseAccountItem)) {
                return false;
            }
            OnAccountHomeOptionCanCloseAccountItem onAccountHomeOptionCanCloseAccountItem = (OnAccountHomeOptionCanCloseAccountItem) obj;
            return Intrinsics.c(this.f20506a, onAccountHomeOptionCanCloseAccountItem.f20506a) && Intrinsics.c(this.b, onAccountHomeOptionCanCloseAccountItem.b) && Intrinsics.c(this.c, onAccountHomeOptionCanCloseAccountItem.c) && Intrinsics.c(this.d, onAccountHomeOptionCanCloseAccountItem.d) && Intrinsics.c(this.e, onAccountHomeOptionCanCloseAccountItem.e);
        }

        public final int hashCode() {
            int iC = b.c(b.c(b.c(this.f20506a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
            Boolean bool = this.e;
            return iC + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnAccountHomeOptionCanCloseAccountItem(id=", this.f20506a, ", title=", this.b, ", page=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", callbackURL=", this.d, ", shouldShowNewBadge=");
            return au.com.woolworths.android.onesite.a.o(sbV, this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountHomeQuery$OnAccountHomeOptionItem;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnAccountHomeOptionItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f20507a;
        public final String b;
        public final Action c;
        public final Boolean d;

        public OnAccountHomeOptionItem(String str, String str2, Action action, Boolean bool) {
            this.f20507a = str;
            this.b = str2;
            this.c = action;
            this.d = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnAccountHomeOptionItem)) {
                return false;
            }
            OnAccountHomeOptionItem onAccountHomeOptionItem = (OnAccountHomeOptionItem) obj;
            return Intrinsics.c(this.f20507a, onAccountHomeOptionItem.f20507a) && Intrinsics.c(this.b, onAccountHomeOptionItem.b) && Intrinsics.c(this.c, onAccountHomeOptionItem.c) && Intrinsics.c(this.d, onAccountHomeOptionItem.d);
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + b.c(this.f20507a.hashCode() * 31, 31, this.b)) * 31;
            Boolean bool = this.d;
            return iHashCode + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnAccountHomeOptionItem(id=", this.f20507a, ", title=", this.b, ", action=");
            sbV.append(this.c);
            sbV.append(", shouldShowNewBadge=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountHomeQuery$OnAccountHomeOptionMagicLinkItem;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnAccountHomeOptionMagicLinkItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f20508a;
        public final String b;
        public final String c;
        public final Boolean d;

        public OnAccountHomeOptionMagicLinkItem(String str, Boolean bool, String str2, String str3) {
            this.f20508a = str;
            this.b = str2;
            this.c = str3;
            this.d = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnAccountHomeOptionMagicLinkItem)) {
                return false;
            }
            OnAccountHomeOptionMagicLinkItem onAccountHomeOptionMagicLinkItem = (OnAccountHomeOptionMagicLinkItem) obj;
            return Intrinsics.c(this.f20508a, onAccountHomeOptionMagicLinkItem.f20508a) && Intrinsics.c(this.b, onAccountHomeOptionMagicLinkItem.b) && Intrinsics.c(this.c, onAccountHomeOptionMagicLinkItem.c) && Intrinsics.c(this.d, onAccountHomeOptionMagicLinkItem.d);
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f20508a.hashCode() * 31, 31, this.b), 31, this.c);
            Boolean bool = this.d;
            return iC + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnAccountHomeOptionMagicLinkItem(id=", this.f20508a, ", title=", this.b, ", page=");
            sbV.append(this.c);
            sbV.append(", shouldShowNewBadge=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountHomeQuery$OnAccountHomeOptionMandyItem;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnAccountHomeOptionMandyItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f20509a;
        public final String b;
        public final String c;
        public final Boolean d;

        public OnAccountHomeOptionMandyItem(String str, Boolean bool, String str2, String str3) {
            this.f20509a = str;
            this.b = str2;
            this.c = str3;
            this.d = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnAccountHomeOptionMandyItem)) {
                return false;
            }
            OnAccountHomeOptionMandyItem onAccountHomeOptionMandyItem = (OnAccountHomeOptionMandyItem) obj;
            return Intrinsics.c(this.f20509a, onAccountHomeOptionMandyItem.f20509a) && Intrinsics.c(this.b, onAccountHomeOptionMandyItem.b) && Intrinsics.c(this.c, onAccountHomeOptionMandyItem.c) && Intrinsics.c(this.d, onAccountHomeOptionMandyItem.d);
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f20509a.hashCode() * 31, 31, this.b), 31, this.c);
            Boolean bool = this.d;
            return iC + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnAccountHomeOptionMandyItem(id=", this.f20509a, ", title=", this.b, ", page=");
            sbV.append(this.c);
            sbV.append(", shouldShowNewBadge=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountHomeQuery$Option;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Option {

        /* renamed from: a, reason: collision with root package name */
        public final String f20510a;
        public final OnAccountHomeOptionItem b;
        public final OnAccountHomeOptionMagicLinkItem c;
        public final OnAccountHomeOptionMandyItem d;
        public final OnAccountHomeAndroidAppReviewLinkItem e;
        public final OnAccountHomeAndroidMedalliaItem f;
        public final OnAccountHomeOnboardingItem g;
        public final OnAccountHomeOptionCanCloseAccountItem h;

        public Option(String __typename, OnAccountHomeOptionItem onAccountHomeOptionItem, OnAccountHomeOptionMagicLinkItem onAccountHomeOptionMagicLinkItem, OnAccountHomeOptionMandyItem onAccountHomeOptionMandyItem, OnAccountHomeAndroidAppReviewLinkItem onAccountHomeAndroidAppReviewLinkItem, OnAccountHomeAndroidMedalliaItem onAccountHomeAndroidMedalliaItem, OnAccountHomeOnboardingItem onAccountHomeOnboardingItem, OnAccountHomeOptionCanCloseAccountItem onAccountHomeOptionCanCloseAccountItem) {
            Intrinsics.h(__typename, "__typename");
            this.f20510a = __typename;
            this.b = onAccountHomeOptionItem;
            this.c = onAccountHomeOptionMagicLinkItem;
            this.d = onAccountHomeOptionMandyItem;
            this.e = onAccountHomeAndroidAppReviewLinkItem;
            this.f = onAccountHomeAndroidMedalliaItem;
            this.g = onAccountHomeOnboardingItem;
            this.h = onAccountHomeOptionCanCloseAccountItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Option)) {
                return false;
            }
            Option option = (Option) obj;
            return Intrinsics.c(this.f20510a, option.f20510a) && Intrinsics.c(this.b, option.b) && Intrinsics.c(this.c, option.c) && Intrinsics.c(this.d, option.d) && Intrinsics.c(this.e, option.e) && Intrinsics.c(this.f, option.f) && Intrinsics.c(this.g, option.g) && Intrinsics.c(this.h, option.h);
        }

        public final int hashCode() {
            int iHashCode = this.f20510a.hashCode() * 31;
            OnAccountHomeOptionItem onAccountHomeOptionItem = this.b;
            int iHashCode2 = (iHashCode + (onAccountHomeOptionItem == null ? 0 : onAccountHomeOptionItem.hashCode())) * 31;
            OnAccountHomeOptionMagicLinkItem onAccountHomeOptionMagicLinkItem = this.c;
            int iHashCode3 = (iHashCode2 + (onAccountHomeOptionMagicLinkItem == null ? 0 : onAccountHomeOptionMagicLinkItem.hashCode())) * 31;
            OnAccountHomeOptionMandyItem onAccountHomeOptionMandyItem = this.d;
            int iHashCode4 = (iHashCode3 + (onAccountHomeOptionMandyItem == null ? 0 : onAccountHomeOptionMandyItem.hashCode())) * 31;
            OnAccountHomeAndroidAppReviewLinkItem onAccountHomeAndroidAppReviewLinkItem = this.e;
            int iHashCode5 = (iHashCode4 + (onAccountHomeAndroidAppReviewLinkItem == null ? 0 : onAccountHomeAndroidAppReviewLinkItem.hashCode())) * 31;
            OnAccountHomeAndroidMedalliaItem onAccountHomeAndroidMedalliaItem = this.f;
            int iHashCode6 = (iHashCode5 + (onAccountHomeAndroidMedalliaItem == null ? 0 : onAccountHomeAndroidMedalliaItem.hashCode())) * 31;
            OnAccountHomeOnboardingItem onAccountHomeOnboardingItem = this.g;
            int iHashCode7 = (iHashCode6 + (onAccountHomeOnboardingItem == null ? 0 : onAccountHomeOnboardingItem.hashCode())) * 31;
            OnAccountHomeOptionCanCloseAccountItem onAccountHomeOptionCanCloseAccountItem = this.h;
            return iHashCode7 + (onAccountHomeOptionCanCloseAccountItem != null ? onAccountHomeOptionCanCloseAccountItem.hashCode() : 0);
        }

        public final String toString() {
            return "Option(__typename=" + this.f20510a + ", onAccountHomeOptionItem=" + this.b + ", onAccountHomeOptionMagicLinkItem=" + this.c + ", onAccountHomeOptionMandyItem=" + this.d + ", onAccountHomeAndroidAppReviewLinkItem=" + this.e + ", onAccountHomeAndroidMedalliaItem=" + this.f + ", onAccountHomeOnboardingItem=" + this.g + ", onAccountHomeOptionCanCloseAccountItem=" + this.h + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountHomeQuery$PrimaryCta;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PrimaryCta {

        /* renamed from: a, reason: collision with root package name */
        public final String f20511a;
        public final String b;

        public PrimaryCta(String str, String str2) {
            this.f20511a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrimaryCta)) {
                return false;
            }
            PrimaryCta primaryCta = (PrimaryCta) obj;
            return Intrinsics.c(this.f20511a, primaryCta.f20511a) && Intrinsics.c(this.b, primaryCta.b);
        }

        public final int hashCode() {
            int iHashCode = this.f20511a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.j("PrimaryCta(label=", this.f20511a, ", url=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountHomeQuery$RewardsAccountHome;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RewardsAccountHome {

        /* renamed from: a, reason: collision with root package name */
        public final AppUpgrade f20512a;
        public final AccountBanner b;
        public final List c;
        public final AccountHomeFooter d;
        public final UnreadChatbotMsg e;

        public RewardsAccountHome(AppUpgrade appUpgrade, AccountBanner accountBanner, List list, AccountHomeFooter accountHomeFooter, UnreadChatbotMsg unreadChatbotMsg) {
            this.f20512a = appUpgrade;
            this.b = accountBanner;
            this.c = list;
            this.d = accountHomeFooter;
            this.e = unreadChatbotMsg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RewardsAccountHome)) {
                return false;
            }
            RewardsAccountHome rewardsAccountHome = (RewardsAccountHome) obj;
            return Intrinsics.c(this.f20512a, rewardsAccountHome.f20512a) && Intrinsics.c(this.b, rewardsAccountHome.b) && Intrinsics.c(this.c, rewardsAccountHome.c) && Intrinsics.c(this.d, rewardsAccountHome.d) && Intrinsics.c(this.e, rewardsAccountHome.e);
        }

        public final int hashCode() {
            AppUpgrade appUpgrade = this.f20512a;
            int iHashCode = (appUpgrade == null ? 0 : appUpgrade.hashCode()) * 31;
            AccountBanner accountBanner = this.b;
            int iHashCode2 = (iHashCode + (accountBanner == null ? 0 : accountBanner.hashCode())) * 31;
            List list = this.c;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            AccountHomeFooter accountHomeFooter = this.d;
            int iHashCode4 = (iHashCode3 + (accountHomeFooter == null ? 0 : accountHomeFooter.hashCode())) * 31;
            UnreadChatbotMsg unreadChatbotMsg = this.e;
            return iHashCode4 + (unreadChatbotMsg != null ? Integer.hashCode(unreadChatbotMsg.f20514a) : 0);
        }

        public final String toString() {
            return "RewardsAccountHome(appUpgrade=" + this.f20512a + ", accountBanner=" + this.b + ", sections=" + this.c + ", accountHomeFooter=" + this.d + ", unreadChatbotMsg=" + this.e + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountHomeQuery$Section;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Section {

        /* renamed from: a, reason: collision with root package name */
        public final String f20513a;
        public final ArrayList b;

        public Section(String str, ArrayList arrayList) {
            this.f20513a = str;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Section)) {
                return false;
            }
            Section section = (Section) obj;
            return this.f20513a.equals(section.f20513a) && this.b.equals(section.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20513a.hashCode() * 31);
        }

        public final String toString() {
            return d.q("Section(title=", this.f20513a, ", options=", ")", this.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountHomeQuery$UnreadChatbotMsg;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UnreadChatbotMsg {

        /* renamed from: a, reason: collision with root package name */
        public final int f20514a;

        public UnreadChatbotMsg(int i) {
            this.f20514a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnreadChatbotMsg) && this.f20514a == ((UnreadChatbotMsg) obj).f20514a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f20514a);
        }

        public final String toString() {
            return a.e(this.f20514a, "UnreadChatbotMsg(count=", ")");
        }
    }

    public AccountHomeQuery(Optional optional, Optional optional2, boolean z) {
        this.f20491a = optional;
        this.b = optional2;
        this.c = z;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(AccountHomeQuery_ResponseAdapter.Data.f20575a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query AccountHome($flags: RewardsAccountHomeFlags, $chatbotSessionId: String, $includeBasicInsetAlert: Boolean!) { rewardsAccountHome(flags: $flags, chatbotSessionId: $chatbotSessionId) { appUpgrade @include(if: $includeBasicInsetAlert) { insetAlertUI { title description style } insetAlertAction { id type action analytics { __typename ...analyticsFields } } insetAlertActionLabel } accountBanner { __typename ... on AccountBannerNotification { id displayType title message primaryCta { label url } canDismiss shouldShowNewBadge } } sections { title options { __typename ... on AccountHomeOptionItem { id title action { action url } shouldShowNewBadge } ... on AccountHomeOptionMagicLinkItem { id title page shouldShowNewBadge } ... on AccountHomeOptionMandyItem { id title page shouldShowNewBadge } ... on AccountHomeAndroidAppReviewLinkItem { id title url shouldShowNewBadge } ... on AccountHomeAndroidMedalliaItem { id title formId shouldShowNewBadge } ... on AccountHomeOnboardingItem { id title action { action url } shouldShowNewBadge } ... on AccountHomeOptionCanCloseAccountItem { id title page callbackURL shouldShowNewBadge } } } accountHomeFooter { iconUrl description action { url label } } unreadChatbotMsg { count } } }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountHomeQuery)) {
            return false;
        }
        AccountHomeQuery accountHomeQuery = (AccountHomeQuery) obj;
        return Intrinsics.c(this.f20491a, accountHomeQuery.f20491a) && Intrinsics.c(this.b, accountHomeQuery.b) && this.c == accountHomeQuery.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.b, this.f20491a.hashCode() * 31, 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "6647cf53162ca1dca63796296c80a1663698a70a5a181062f063e652e662766a";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "AccountHome";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Optional optional = this.f20491a;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("flags");
            Adapters.d(Adapters.b(Adapters.c(RewardsAccountHomeFlags_InputAdapter.f9960a, false))).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        }
        Optional optional2 = this.b;
        if (optional2 instanceof Optional.Present) {
            jsonWriter.F1("chatbotSessionId");
            Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional2);
        }
        jsonWriter.F1("includeBasicInsetAlert");
        Adapters.f.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.c));
    }

    public final String toString() {
        return a.k(")", au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.p("AccountHomeQuery(flags=", this.f20491a, ", chatbotSessionId=", this.b, ", includeBasicInsetAlert="), this.c);
    }
}
