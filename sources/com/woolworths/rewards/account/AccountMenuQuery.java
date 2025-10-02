package com.woolworths.rewards.account;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.rewards.graphql.type.BannerNotificationDisplayType;
import au.com.woolworths.rewards.graphql.type.HomeOptionAction;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.account.adapter.AccountMenuQuery_ResponseAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0014\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/woolworths/rewards/account/AccountMenuQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/rewards/account/AccountMenuQuery$Data;", "Data", "RewardsAccountMenu", "AccountBanner", "OnAccountBannerNotification", "PrimaryCta", "Section", "Item", "OnAccountHomeOptionItem", "Action", "OnAccountHomeOptionMagicLinkItem", "OnAccountHomeOptionMandyItem", "OnAccountHomeAndroidAppReviewLinkItem", "OnAccountHomeAndroidMedalliaItem", "OnAccountHomeOnboardingItem", "Action1", "OnAccountHomeOptionCanCloseAccountItem", "OnAccountHomeOptionDeleteAccountItem", "AccountHomeFooter", "Action2", "Companion", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AccountMenuQuery implements Query<Data> {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountMenuQuery$AccountBanner;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AccountBanner {

        /* renamed from: a, reason: collision with root package name */
        public final String f20515a;
        public final OnAccountBannerNotification b;

        public AccountBanner(String __typename, OnAccountBannerNotification onAccountBannerNotification) {
            Intrinsics.h(__typename, "__typename");
            this.f20515a = __typename;
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
            return Intrinsics.c(this.f20515a, accountBanner.f20515a) && Intrinsics.c(this.b, accountBanner.b);
        }

        public final int hashCode() {
            int iHashCode = this.f20515a.hashCode() * 31;
            OnAccountBannerNotification onAccountBannerNotification = this.b;
            return iHashCode + (onAccountBannerNotification == null ? 0 : onAccountBannerNotification.hashCode());
        }

        public final String toString() {
            return "AccountBanner(__typename=" + this.f20515a + ", onAccountBannerNotification=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountMenuQuery$AccountHomeFooter;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AccountHomeFooter {

        /* renamed from: a, reason: collision with root package name */
        public final String f20516a;
        public final String b;
        public final Action2 c;

        public AccountHomeFooter(String str, String str2, Action2 action2) {
            this.f20516a = str;
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
            return Intrinsics.c(this.f20516a, accountHomeFooter.f20516a) && Intrinsics.c(this.b, accountHomeFooter.b) && Intrinsics.c(this.c, accountHomeFooter.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f20516a.hashCode() * 31, 31, this.b);
            Action2 action2 = this.c;
            return iC + (action2 == null ? 0 : action2.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = a.v("AccountHomeFooter(iconUrl=", this.f20516a, ", description=", this.b, ", action=");
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountMenuQuery$Action;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action {

        /* renamed from: a, reason: collision with root package name */
        public final HomeOptionAction f20517a;
        public final String b;

        public Action(HomeOptionAction homeOptionAction, String str) {
            this.f20517a = homeOptionAction;
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
            return this.f20517a == action.f20517a && Intrinsics.c(this.b, action.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20517a.hashCode() * 31);
        }

        public final String toString() {
            return "Action(action=" + this.f20517a + ", url=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountMenuQuery$Action1;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action1 {

        /* renamed from: a, reason: collision with root package name */
        public final HomeOptionAction f20518a;
        public final String b;

        public Action1(HomeOptionAction homeOptionAction, String str) {
            this.f20518a = homeOptionAction;
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
            return this.f20518a == action1.f20518a && Intrinsics.c(this.b, action1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20518a.hashCode() * 31);
        }

        public final String toString() {
            return "Action1(action=" + this.f20518a + ", url=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountMenuQuery$Action2;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f20519a;
        public final String b;

        public Action2(String str, String str2) {
            this.f20519a = str;
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
            return Intrinsics.c(this.f20519a, action2.f20519a) && Intrinsics.c(this.b, action2.b);
        }

        public final int hashCode() {
            int iHashCode = this.f20519a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.j("Action2(url=", this.f20519a, ", label=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/rewards/account/AccountMenuQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountMenuQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final RewardsAccountMenu f20520a;

        public Data(RewardsAccountMenu rewardsAccountMenu) {
            this.f20520a = rewardsAccountMenu;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20520a, ((Data) obj).f20520a);
        }

        public final int hashCode() {
            RewardsAccountMenu rewardsAccountMenu = this.f20520a;
            if (rewardsAccountMenu == null) {
                return 0;
            }
            return rewardsAccountMenu.hashCode();
        }

        public final String toString() {
            return "Data(rewardsAccountMenu=" + this.f20520a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountMenuQuery$Item;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f20521a;
        public final OnAccountHomeOptionItem b;
        public final OnAccountHomeOptionMagicLinkItem c;
        public final OnAccountHomeOptionMandyItem d;
        public final OnAccountHomeAndroidAppReviewLinkItem e;
        public final OnAccountHomeAndroidMedalliaItem f;
        public final OnAccountHomeOnboardingItem g;
        public final OnAccountHomeOptionCanCloseAccountItem h;
        public final OnAccountHomeOptionDeleteAccountItem i;

        public Item(String __typename, OnAccountHomeOptionItem onAccountHomeOptionItem, OnAccountHomeOptionMagicLinkItem onAccountHomeOptionMagicLinkItem, OnAccountHomeOptionMandyItem onAccountHomeOptionMandyItem, OnAccountHomeAndroidAppReviewLinkItem onAccountHomeAndroidAppReviewLinkItem, OnAccountHomeAndroidMedalliaItem onAccountHomeAndroidMedalliaItem, OnAccountHomeOnboardingItem onAccountHomeOnboardingItem, OnAccountHomeOptionCanCloseAccountItem onAccountHomeOptionCanCloseAccountItem, OnAccountHomeOptionDeleteAccountItem onAccountHomeOptionDeleteAccountItem) {
            Intrinsics.h(__typename, "__typename");
            this.f20521a = __typename;
            this.b = onAccountHomeOptionItem;
            this.c = onAccountHomeOptionMagicLinkItem;
            this.d = onAccountHomeOptionMandyItem;
            this.e = onAccountHomeAndroidAppReviewLinkItem;
            this.f = onAccountHomeAndroidMedalliaItem;
            this.g = onAccountHomeOnboardingItem;
            this.h = onAccountHomeOptionCanCloseAccountItem;
            this.i = onAccountHomeOptionDeleteAccountItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.c(this.f20521a, item.f20521a) && Intrinsics.c(this.b, item.b) && Intrinsics.c(this.c, item.c) && Intrinsics.c(this.d, item.d) && Intrinsics.c(this.e, item.e) && Intrinsics.c(this.f, item.f) && Intrinsics.c(this.g, item.g) && Intrinsics.c(this.h, item.h) && Intrinsics.c(this.i, item.i);
        }

        public final int hashCode() {
            int iHashCode = this.f20521a.hashCode() * 31;
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
            int iHashCode8 = (iHashCode7 + (onAccountHomeOptionCanCloseAccountItem == null ? 0 : onAccountHomeOptionCanCloseAccountItem.hashCode())) * 31;
            OnAccountHomeOptionDeleteAccountItem onAccountHomeOptionDeleteAccountItem = this.i;
            return iHashCode8 + (onAccountHomeOptionDeleteAccountItem != null ? onAccountHomeOptionDeleteAccountItem.hashCode() : 0);
        }

        public final String toString() {
            return "Item(__typename=" + this.f20521a + ", onAccountHomeOptionItem=" + this.b + ", onAccountHomeOptionMagicLinkItem=" + this.c + ", onAccountHomeOptionMandyItem=" + this.d + ", onAccountHomeAndroidAppReviewLinkItem=" + this.e + ", onAccountHomeAndroidMedalliaItem=" + this.f + ", onAccountHomeOnboardingItem=" + this.g + ", onAccountHomeOptionCanCloseAccountItem=" + this.h + ", onAccountHomeOptionDeleteAccountItem=" + this.i + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountMenuQuery$OnAccountBannerNotification;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnAccountBannerNotification {

        /* renamed from: a, reason: collision with root package name */
        public final String f20522a;
        public final BannerNotificationDisplayType b;
        public final String c;
        public final String d;
        public final PrimaryCta e;
        public final boolean f;
        public final boolean g;

        public OnAccountBannerNotification(String str, BannerNotificationDisplayType bannerNotificationDisplayType, String str2, String str3, PrimaryCta primaryCta, boolean z, boolean z2) {
            this.f20522a = str;
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
            return Intrinsics.c(this.f20522a, onAccountBannerNotification.f20522a) && this.b == onAccountBannerNotification.b && Intrinsics.c(this.c, onAccountBannerNotification.c) && Intrinsics.c(this.d, onAccountBannerNotification.d) && Intrinsics.c(this.e, onAccountBannerNotification.e) && this.f == onAccountBannerNotification.f && this.g == onAccountBannerNotification.g;
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + (this.f20522a.hashCode() * 31)) * 31;
            String str = this.c;
            int iC = b.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
            PrimaryCta primaryCta = this.e;
            return Boolean.hashCode(this.g) + b.e((iC + (primaryCta != null ? primaryCta.hashCode() : 0)) * 31, 31, this.f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnAccountBannerNotification(id=");
            sb.append(this.f20522a);
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountMenuQuery$OnAccountHomeAndroidAppReviewLinkItem;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnAccountHomeAndroidAppReviewLinkItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f20523a;
        public final String b;
        public final String c;
        public final Boolean d;

        public OnAccountHomeAndroidAppReviewLinkItem(String str, Boolean bool, String str2, String str3) {
            this.f20523a = str;
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
            return Intrinsics.c(this.f20523a, onAccountHomeAndroidAppReviewLinkItem.f20523a) && Intrinsics.c(this.b, onAccountHomeAndroidAppReviewLinkItem.b) && Intrinsics.c(this.c, onAccountHomeAndroidAppReviewLinkItem.c) && Intrinsics.c(this.d, onAccountHomeAndroidAppReviewLinkItem.d);
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f20523a.hashCode() * 31, 31, this.b), 31, this.c);
            Boolean bool = this.d;
            return iC + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnAccountHomeAndroidAppReviewLinkItem(id=", this.f20523a, ", title=", this.b, ", url=");
            sbV.append(this.c);
            sbV.append(", shouldShowNewBadge=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountMenuQuery$OnAccountHomeAndroidMedalliaItem;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnAccountHomeAndroidMedalliaItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f20524a;
        public final String b;
        public final String c;
        public final Boolean d;

        public OnAccountHomeAndroidMedalliaItem(String str, Boolean bool, String str2, String str3) {
            this.f20524a = str;
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
            return Intrinsics.c(this.f20524a, onAccountHomeAndroidMedalliaItem.f20524a) && Intrinsics.c(this.b, onAccountHomeAndroidMedalliaItem.b) && Intrinsics.c(this.c, onAccountHomeAndroidMedalliaItem.c) && Intrinsics.c(this.d, onAccountHomeAndroidMedalliaItem.d);
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f20524a.hashCode() * 31, 31, this.b), 31, this.c);
            Boolean bool = this.d;
            return iC + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnAccountHomeAndroidMedalliaItem(id=", this.f20524a, ", title=", this.b, ", formId=");
            sbV.append(this.c);
            sbV.append(", shouldShowNewBadge=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountMenuQuery$OnAccountHomeOnboardingItem;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnAccountHomeOnboardingItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f20525a;
        public final String b;
        public final Action1 c;
        public final Boolean d;

        public OnAccountHomeOnboardingItem(String str, String str2, Action1 action1, Boolean bool) {
            this.f20525a = str;
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
            return Intrinsics.c(this.f20525a, onAccountHomeOnboardingItem.f20525a) && Intrinsics.c(this.b, onAccountHomeOnboardingItem.b) && Intrinsics.c(this.c, onAccountHomeOnboardingItem.c) && Intrinsics.c(this.d, onAccountHomeOnboardingItem.d);
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + b.c(this.f20525a.hashCode() * 31, 31, this.b)) * 31;
            Boolean bool = this.d;
            return iHashCode + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnAccountHomeOnboardingItem(id=", this.f20525a, ", title=", this.b, ", action=");
            sbV.append(this.c);
            sbV.append(", shouldShowNewBadge=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountMenuQuery$OnAccountHomeOptionCanCloseAccountItem;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnAccountHomeOptionCanCloseAccountItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f20526a;
        public final String b;
        public final String c;
        public final String d;
        public final Boolean e;

        public OnAccountHomeOptionCanCloseAccountItem(Boolean bool, String str, String str2, String str3, String str4) {
            this.f20526a = str;
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
            return Intrinsics.c(this.f20526a, onAccountHomeOptionCanCloseAccountItem.f20526a) && Intrinsics.c(this.b, onAccountHomeOptionCanCloseAccountItem.b) && Intrinsics.c(this.c, onAccountHomeOptionCanCloseAccountItem.c) && Intrinsics.c(this.d, onAccountHomeOptionCanCloseAccountItem.d) && Intrinsics.c(this.e, onAccountHomeOptionCanCloseAccountItem.e);
        }

        public final int hashCode() {
            int iC = b.c(b.c(b.c(this.f20526a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
            Boolean bool = this.e;
            return iC + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnAccountHomeOptionCanCloseAccountItem(id=", this.f20526a, ", title=", this.b, ", page=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", callbackURL=", this.d, ", shouldShowNewBadge=");
            return au.com.woolworths.android.onesite.a.o(sbV, this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountMenuQuery$OnAccountHomeOptionDeleteAccountItem;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnAccountHomeOptionDeleteAccountItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f20527a;
        public final String b;

        public OnAccountHomeOptionDeleteAccountItem(String str, String str2) {
            this.f20527a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnAccountHomeOptionDeleteAccountItem)) {
                return false;
            }
            OnAccountHomeOptionDeleteAccountItem onAccountHomeOptionDeleteAccountItem = (OnAccountHomeOptionDeleteAccountItem) obj;
            return Intrinsics.c(this.f20527a, onAccountHomeOptionDeleteAccountItem.f20527a) && Intrinsics.c(this.b, onAccountHomeOptionDeleteAccountItem.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20527a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("OnAccountHomeOptionDeleteAccountItem(id=", this.f20527a, ", title=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountMenuQuery$OnAccountHomeOptionItem;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnAccountHomeOptionItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f20528a;
        public final String b;
        public final Action c;
        public final Boolean d;

        public OnAccountHomeOptionItem(String str, String str2, Action action, Boolean bool) {
            this.f20528a = str;
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
            return Intrinsics.c(this.f20528a, onAccountHomeOptionItem.f20528a) && Intrinsics.c(this.b, onAccountHomeOptionItem.b) && Intrinsics.c(this.c, onAccountHomeOptionItem.c) && Intrinsics.c(this.d, onAccountHomeOptionItem.d);
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + b.c(this.f20528a.hashCode() * 31, 31, this.b)) * 31;
            Boolean bool = this.d;
            return iHashCode + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnAccountHomeOptionItem(id=", this.f20528a, ", title=", this.b, ", action=");
            sbV.append(this.c);
            sbV.append(", shouldShowNewBadge=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountMenuQuery$OnAccountHomeOptionMagicLinkItem;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnAccountHomeOptionMagicLinkItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f20529a;
        public final String b;
        public final String c;
        public final Boolean d;

        public OnAccountHomeOptionMagicLinkItem(String str, Boolean bool, String str2, String str3) {
            this.f20529a = str;
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
            return Intrinsics.c(this.f20529a, onAccountHomeOptionMagicLinkItem.f20529a) && Intrinsics.c(this.b, onAccountHomeOptionMagicLinkItem.b) && Intrinsics.c(this.c, onAccountHomeOptionMagicLinkItem.c) && Intrinsics.c(this.d, onAccountHomeOptionMagicLinkItem.d);
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f20529a.hashCode() * 31, 31, this.b), 31, this.c);
            Boolean bool = this.d;
            return iC + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnAccountHomeOptionMagicLinkItem(id=", this.f20529a, ", title=", this.b, ", page=");
            sbV.append(this.c);
            sbV.append(", shouldShowNewBadge=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountMenuQuery$OnAccountHomeOptionMandyItem;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnAccountHomeOptionMandyItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f20530a;
        public final String b;
        public final String c;
        public final Boolean d;

        public OnAccountHomeOptionMandyItem(String str, Boolean bool, String str2, String str3) {
            this.f20530a = str;
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
            return Intrinsics.c(this.f20530a, onAccountHomeOptionMandyItem.f20530a) && Intrinsics.c(this.b, onAccountHomeOptionMandyItem.b) && Intrinsics.c(this.c, onAccountHomeOptionMandyItem.c) && Intrinsics.c(this.d, onAccountHomeOptionMandyItem.d);
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f20530a.hashCode() * 31, 31, this.b), 31, this.c);
            Boolean bool = this.d;
            return iC + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnAccountHomeOptionMandyItem(id=", this.f20530a, ", title=", this.b, ", page=");
            sbV.append(this.c);
            sbV.append(", shouldShowNewBadge=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountMenuQuery$PrimaryCta;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PrimaryCta {

        /* renamed from: a, reason: collision with root package name */
        public final String f20531a;
        public final String b;

        public PrimaryCta(String str, String str2) {
            this.f20531a = str;
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
            return Intrinsics.c(this.f20531a, primaryCta.f20531a) && Intrinsics.c(this.b, primaryCta.b);
        }

        public final int hashCode() {
            int iHashCode = this.f20531a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.j("PrimaryCta(label=", this.f20531a, ", url=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountMenuQuery$RewardsAccountMenu;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RewardsAccountMenu {

        /* renamed from: a, reason: collision with root package name */
        public final AccountBanner f20532a;
        public final List b;
        public final AccountHomeFooter c;

        public RewardsAccountMenu(AccountBanner accountBanner, List list, AccountHomeFooter accountHomeFooter) {
            this.f20532a = accountBanner;
            this.b = list;
            this.c = accountHomeFooter;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RewardsAccountMenu)) {
                return false;
            }
            RewardsAccountMenu rewardsAccountMenu = (RewardsAccountMenu) obj;
            return Intrinsics.c(this.f20532a, rewardsAccountMenu.f20532a) && Intrinsics.c(this.b, rewardsAccountMenu.b) && Intrinsics.c(this.c, rewardsAccountMenu.c);
        }

        public final int hashCode() {
            AccountBanner accountBanner = this.f20532a;
            int iHashCode = (accountBanner == null ? 0 : accountBanner.hashCode()) * 31;
            List list = this.b;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            AccountHomeFooter accountHomeFooter = this.c;
            return iHashCode2 + (accountHomeFooter != null ? accountHomeFooter.hashCode() : 0);
        }

        public final String toString() {
            return "RewardsAccountMenu(accountBanner=" + this.f20532a + ", sections=" + this.b + ", accountHomeFooter=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/AccountMenuQuery$Section;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Section {

        /* renamed from: a, reason: collision with root package name */
        public final String f20533a;
        public final ArrayList b;

        public Section(String str, ArrayList arrayList) {
            this.f20533a = str;
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
            return this.f20533a.equals(section.f20533a) && this.b.equals(section.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20533a.hashCode() * 31);
        }

        public final String toString() {
            return d.q("Section(title=", this.f20533a, ", items=", ")", this.b);
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(AccountMenuQuery_ResponseAdapter.Data.f20596a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query AccountMenu { rewardsAccountMenu { accountBanner { __typename ... on AccountBannerNotification { id displayType title message primaryCta { label url } canDismiss shouldShowNewBadge } } sections { title items { __typename ... on AccountHomeOptionItem { id title action { action url } shouldShowNewBadge } ... on AccountHomeOptionMagicLinkItem { id title page shouldShowNewBadge } ... on AccountHomeOptionMandyItem { id title page shouldShowNewBadge } ... on AccountHomeAndroidAppReviewLinkItem { id title url shouldShowNewBadge } ... on AccountHomeAndroidMedalliaItem { id title formId shouldShowNewBadge } ... on AccountHomeOnboardingItem { id title action { action url } shouldShowNewBadge } ... on AccountHomeOptionCanCloseAccountItem { id title page callbackURL shouldShowNewBadge } ... on AccountHomeOptionDeleteAccountItem { id title } } } accountHomeFooter { iconUrl description action { url label } } } }";
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == AccountMenuQuery.class;
    }

    public final int hashCode() {
        return Reflection.f24268a.b(AccountMenuQuery.class).hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "a531535f4987b0b89278a475ac120c249d49c72b1a16e7bd7af2f91d4792c5ed";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "AccountMenu";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
    }
}
