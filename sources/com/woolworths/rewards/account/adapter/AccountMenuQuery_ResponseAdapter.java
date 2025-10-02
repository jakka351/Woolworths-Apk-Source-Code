package com.woolworths.rewards.account.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.rewards.graphql.type.BannerNotificationDisplayType;
import au.com.woolworths.rewards.graphql.type.HomeOptionAction;
import au.com.woolworths.rewards.graphql.type.adapter.BannerNotificationDisplayType_ResponseAdapter;
import au.com.woolworths.rewards.graphql.type.adapter.HomeOptionAction_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.UrlHandler;
import com.woolworths.rewards.account.AccountMenuQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\bÇ\u0002\u0018\u00002\u00020\u0001:\u0013\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountMenuQuery_ResponseAdapter;", "", "Data", "RewardsAccountMenu", "AccountBanner", "OnAccountBannerNotification", "PrimaryCta", "Section", "Item", "OnAccountHomeOptionItem", "Action", "OnAccountHomeOptionMagicLinkItem", "OnAccountHomeOptionMandyItem", "OnAccountHomeAndroidAppReviewLinkItem", "OnAccountHomeAndroidMedalliaItem", "OnAccountHomeOnboardingItem", "Action1", "OnAccountHomeOptionCanCloseAccountItem", "OnAccountHomeOptionDeleteAccountItem", "AccountHomeFooter", "Action2", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AccountMenuQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountMenuQuery_ResponseAdapter$AccountBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountMenuQuery$AccountBanner;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AccountBanner implements Adapter<AccountMenuQuery.AccountBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final AccountBanner f20591a = new AccountBanner();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            AccountMenuQuery.OnAccountBannerNotification onAccountBannerNotificationA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("AccountBannerNotification"))) {
                reader.o();
                onAccountBannerNotificationA = OnAccountBannerNotification.a(reader, customScalarAdapters);
            }
            return new AccountMenuQuery.AccountBanner(str, onAccountBannerNotificationA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountMenuQuery.AccountBanner value = (AccountMenuQuery.AccountBanner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20515a);
            AccountMenuQuery.OnAccountBannerNotification onAccountBannerNotification = value.b;
            if (onAccountBannerNotification != null) {
                OnAccountBannerNotification.b(writer, customScalarAdapters, onAccountBannerNotification);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountMenuQuery_ResponseAdapter$AccountHomeFooter;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountMenuQuery$AccountHomeFooter;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AccountHomeFooter implements Adapter<AccountMenuQuery.AccountHomeFooter> {

        /* renamed from: a, reason: collision with root package name */
        public static final AccountHomeFooter f20592a = new AccountHomeFooter();
        public static final List b = CollectionsKt.R("iconUrl", lqlqqlq.mmm006Dm006Dm, UrlHandler.ACTION);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            AccountMenuQuery.Action2 action2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    action2 = (AccountMenuQuery.Action2) Adapters.b(Adapters.c(Action2.f20595a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "iconUrl");
                throw null;
            }
            if (str2 != null) {
                return new AccountMenuQuery.AccountHomeFooter(str, str2, action2);
            }
            Assertions.a(reader, lqlqqlq.mmm006Dm006Dm);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountMenuQuery.AccountHomeFooter value = (AccountMenuQuery.AccountHomeFooter) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("iconUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20516a);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(UrlHandler.ACTION);
            Adapters.b(Adapters.c(Action2.f20595a, false)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountMenuQuery_ResponseAdapter$Action;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountMenuQuery$Action;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action implements Adapter<AccountMenuQuery.Action> {

        /* renamed from: a, reason: collision with root package name */
        public static final Action f20593a = new Action();
        public static final List b = CollectionsKt.R(UrlHandler.ACTION, "url");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            HomeOptionAction homeOptionActionA = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    homeOptionActionA = HomeOptionAction_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (homeOptionActionA == null) {
                Assertions.a(reader, UrlHandler.ACTION);
                throw null;
            }
            if (str != null) {
                return new AccountMenuQuery.Action(homeOptionActionA, str);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountMenuQuery.Action value = (AccountMenuQuery.Action) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(UrlHandler.ACTION);
            HomeOptionAction_ResponseAdapter.b(writer, customScalarAdapters, value.f20517a);
            writer.F1("url");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountMenuQuery_ResponseAdapter$Action1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountMenuQuery$Action1;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action1 implements Adapter<AccountMenuQuery.Action1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Action1 f20594a = new Action1();
        public static final List b = CollectionsKt.R(UrlHandler.ACTION, "url");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            HomeOptionAction homeOptionActionA = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    homeOptionActionA = HomeOptionAction_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (homeOptionActionA == null) {
                Assertions.a(reader, UrlHandler.ACTION);
                throw null;
            }
            if (str != null) {
                return new AccountMenuQuery.Action1(homeOptionActionA, str);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountMenuQuery.Action1 value = (AccountMenuQuery.Action1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(UrlHandler.ACTION);
            HomeOptionAction_ResponseAdapter.b(writer, customScalarAdapters, value.f20518a);
            writer.F1("url");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountMenuQuery_ResponseAdapter$Action2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountMenuQuery$Action2;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action2 implements Adapter<AccountMenuQuery.Action2> {

        /* renamed from: a, reason: collision with root package name */
        public static final Action2 f20595a = new Action2();
        public static final List b = CollectionsKt.R("url", AnnotatedPrivateKey.LABEL);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
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
                return new AccountMenuQuery.Action2(str, str2);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountMenuQuery.Action2 value = (AccountMenuQuery.Action2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20519a);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountMenuQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountMenuQuery$Data;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<AccountMenuQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f20596a = new Data();
        public static final List b = CollectionsKt.Q("rewardsAccountMenu");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            AccountMenuQuery.RewardsAccountMenu rewardsAccountMenu = null;
            while (reader.o2(b) == 0) {
                rewardsAccountMenu = (AccountMenuQuery.RewardsAccountMenu) Adapters.b(Adapters.c(RewardsAccountMenu.f20608a, false)).fromJson(reader, customScalarAdapters);
            }
            return new AccountMenuQuery.Data(rewardsAccountMenu);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountMenuQuery.Data value = (AccountMenuQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("rewardsAccountMenu");
            Adapters.b(Adapters.c(RewardsAccountMenu.f20608a, false)).toJson(writer, customScalarAdapters, value.f20520a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountMenuQuery_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountMenuQuery$Item;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<AccountMenuQuery.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f20597a = new Item();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            AccountMenuQuery.OnAccountHomeOptionItem onAccountHomeOptionItemA;
            AccountMenuQuery.OnAccountHomeOptionMagicLinkItem onAccountHomeOptionMagicLinkItemA;
            AccountMenuQuery.OnAccountHomeOptionMandyItem onAccountHomeOptionMandyItemA;
            AccountMenuQuery.OnAccountHomeAndroidAppReviewLinkItem onAccountHomeAndroidAppReviewLinkItemA;
            AccountMenuQuery.OnAccountHomeAndroidMedalliaItem onAccountHomeAndroidMedalliaItemA;
            AccountMenuQuery.OnAccountHomeOnboardingItem onAccountHomeOnboardingItemA;
            AccountMenuQuery.OnAccountHomeOptionCanCloseAccountItem onAccountHomeOptionCanCloseAccountItemA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            AccountMenuQuery.OnAccountHomeOptionDeleteAccountItem onAccountHomeOptionDeleteAccountItemA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("AccountHomeOptionItem"))) {
                reader.o();
                onAccountHomeOptionItemA = OnAccountHomeOptionItem.a(reader, customScalarAdapters);
            } else {
                onAccountHomeOptionItemA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("AccountHomeOptionMagicLinkItem"))) {
                reader.o();
                onAccountHomeOptionMagicLinkItemA = OnAccountHomeOptionMagicLinkItem.a(reader, customScalarAdapters);
            } else {
                onAccountHomeOptionMagicLinkItemA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("AccountHomeOptionMandyItem"))) {
                reader.o();
                onAccountHomeOptionMandyItemA = OnAccountHomeOptionMandyItem.a(reader, customScalarAdapters);
            } else {
                onAccountHomeOptionMandyItemA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("AccountHomeAndroidAppReviewLinkItem"))) {
                reader.o();
                onAccountHomeAndroidAppReviewLinkItemA = OnAccountHomeAndroidAppReviewLinkItem.a(reader, customScalarAdapters);
            } else {
                onAccountHomeAndroidAppReviewLinkItemA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("AccountHomeAndroidMedalliaItem"))) {
                reader.o();
                onAccountHomeAndroidMedalliaItemA = OnAccountHomeAndroidMedalliaItem.a(reader, customScalarAdapters);
            } else {
                onAccountHomeAndroidMedalliaItemA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("AccountHomeOnboardingItem"))) {
                reader.o();
                onAccountHomeOnboardingItemA = OnAccountHomeOnboardingItem.a(reader, customScalarAdapters);
            } else {
                onAccountHomeOnboardingItemA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("AccountHomeOptionCanCloseAccountItem"))) {
                reader.o();
                onAccountHomeOptionCanCloseAccountItemA = OnAccountHomeOptionCanCloseAccountItem.a(reader, customScalarAdapters);
            } else {
                onAccountHomeOptionCanCloseAccountItemA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("AccountHomeOptionDeleteAccountItem"))) {
                reader.o();
                onAccountHomeOptionDeleteAccountItemA = OnAccountHomeOptionDeleteAccountItem.a(reader, customScalarAdapters);
            }
            return new AccountMenuQuery.Item(str, onAccountHomeOptionItemA, onAccountHomeOptionMagicLinkItemA, onAccountHomeOptionMandyItemA, onAccountHomeAndroidAppReviewLinkItemA, onAccountHomeAndroidMedalliaItemA, onAccountHomeOnboardingItemA, onAccountHomeOptionCanCloseAccountItemA, onAccountHomeOptionDeleteAccountItemA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountMenuQuery.Item value = (AccountMenuQuery.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20521a);
            AccountMenuQuery.OnAccountHomeOptionItem onAccountHomeOptionItem = value.b;
            if (onAccountHomeOptionItem != null) {
                OnAccountHomeOptionItem.b(writer, customScalarAdapters, onAccountHomeOptionItem);
            }
            AccountMenuQuery.OnAccountHomeOptionMagicLinkItem onAccountHomeOptionMagicLinkItem = value.c;
            if (onAccountHomeOptionMagicLinkItem != null) {
                OnAccountHomeOptionMagicLinkItem.b(writer, customScalarAdapters, onAccountHomeOptionMagicLinkItem);
            }
            AccountMenuQuery.OnAccountHomeOptionMandyItem onAccountHomeOptionMandyItem = value.d;
            if (onAccountHomeOptionMandyItem != null) {
                OnAccountHomeOptionMandyItem.b(writer, customScalarAdapters, onAccountHomeOptionMandyItem);
            }
            AccountMenuQuery.OnAccountHomeAndroidAppReviewLinkItem onAccountHomeAndroidAppReviewLinkItem = value.e;
            if (onAccountHomeAndroidAppReviewLinkItem != null) {
                OnAccountHomeAndroidAppReviewLinkItem.b(writer, customScalarAdapters, onAccountHomeAndroidAppReviewLinkItem);
            }
            AccountMenuQuery.OnAccountHomeAndroidMedalliaItem onAccountHomeAndroidMedalliaItem = value.f;
            if (onAccountHomeAndroidMedalliaItem != null) {
                OnAccountHomeAndroidMedalliaItem.b(writer, customScalarAdapters, onAccountHomeAndroidMedalliaItem);
            }
            AccountMenuQuery.OnAccountHomeOnboardingItem onAccountHomeOnboardingItem = value.g;
            if (onAccountHomeOnboardingItem != null) {
                OnAccountHomeOnboardingItem.b(writer, customScalarAdapters, onAccountHomeOnboardingItem);
            }
            AccountMenuQuery.OnAccountHomeOptionCanCloseAccountItem onAccountHomeOptionCanCloseAccountItem = value.h;
            if (onAccountHomeOptionCanCloseAccountItem != null) {
                OnAccountHomeOptionCanCloseAccountItem.b(writer, customScalarAdapters, onAccountHomeOptionCanCloseAccountItem);
            }
            AccountMenuQuery.OnAccountHomeOptionDeleteAccountItem onAccountHomeOptionDeleteAccountItem = value.i;
            if (onAccountHomeOptionDeleteAccountItem != null) {
                OnAccountHomeOptionDeleteAccountItem.b(writer, customScalarAdapters, onAccountHomeOptionDeleteAccountItem);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountMenuQuery_ResponseAdapter$OnAccountBannerNotification;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountMenuQuery$OnAccountBannerNotification;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnAccountBannerNotification implements Adapter<AccountMenuQuery.OnAccountBannerNotification> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20598a = CollectionsKt.R("id", "displayType", "title", "message", "primaryCta", "canDismiss", "shouldShowNewBadge");

        public static AccountMenuQuery.OnAccountBannerNotification a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            BannerNotificationDisplayType bannerNotificationDisplayTypeA = null;
            String str2 = null;
            String str3 = null;
            AccountMenuQuery.PrimaryCta primaryCta = null;
            Boolean bool3 = null;
            while (true) {
                switch (reader.o2(f20598a)) {
                    case 0:
                        bool = bool2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        bannerNotificationDisplayTypeA = BannerNotificationDisplayType_ResponseAdapter.a(reader, customScalarAdapters);
                        continue;
                    case 2:
                        bool = bool2;
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        bool = bool2;
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        bool = bool2;
                        primaryCta = (AccountMenuQuery.PrimaryCta) Adapters.b(Adapters.c(PrimaryCta.f20607a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 6:
                        bool = bool2;
                        bool3 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Boolean bool4 = bool2;
                        if (str == null) {
                            Assertions.a(reader, "id");
                            throw null;
                        }
                        if (bannerNotificationDisplayTypeA == null) {
                            Assertions.a(reader, "displayType");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, "message");
                            throw null;
                        }
                        if (bool4 == null) {
                            Assertions.a(reader, "canDismiss");
                            throw null;
                        }
                        Boolean bool5 = bool3;
                        boolean zBooleanValue = bool4.booleanValue();
                        if (bool5 != null) {
                            return new AccountMenuQuery.OnAccountBannerNotification(str, bannerNotificationDisplayTypeA, str2, str3, primaryCta, zBooleanValue, bool5.booleanValue());
                        }
                        Assertions.a(reader, "shouldShowNewBadge");
                        throw null;
                }
                bool2 = bool;
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AccountMenuQuery.OnAccountBannerNotification value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20522a);
            writer.F1("displayType");
            BannerNotificationDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1("title");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
            writer.F1("message");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("primaryCta");
            Adapters.b(Adapters.c(PrimaryCta.f20607a, false)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("canDismiss");
            Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
            d.B(value.f, adapters$BooleanAdapter$1, writer, customScalarAdapters, "shouldShowNewBadge");
            adapters$BooleanAdapter$1.toJson(writer, customScalarAdapters, Boolean.valueOf(value.g));
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (AccountMenuQuery.OnAccountBannerNotification) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountMenuQuery_ResponseAdapter$OnAccountHomeAndroidAppReviewLinkItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountMenuQuery$OnAccountHomeAndroidAppReviewLinkItem;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnAccountHomeAndroidAppReviewLinkItem implements Adapter<AccountMenuQuery.OnAccountHomeAndroidAppReviewLinkItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20599a = CollectionsKt.R("id", "title", "url", "shouldShowNewBadge");

        public static AccountMenuQuery.OnAccountHomeAndroidAppReviewLinkItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(f20599a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "id");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str3 != null) {
                return new AccountMenuQuery.OnAccountHomeAndroidAppReviewLinkItem(str, bool, str2, str3);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AccountMenuQuery.OnAccountHomeAndroidAppReviewLinkItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20523a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("url");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("shouldShowNewBadge");
            Adapters.l.toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (AccountMenuQuery.OnAccountHomeAndroidAppReviewLinkItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountMenuQuery_ResponseAdapter$OnAccountHomeAndroidMedalliaItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountMenuQuery$OnAccountHomeAndroidMedalliaItem;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnAccountHomeAndroidMedalliaItem implements Adapter<AccountMenuQuery.OnAccountHomeAndroidMedalliaItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20600a = CollectionsKt.R("id", "title", "formId", "shouldShowNewBadge");

        public static AccountMenuQuery.OnAccountHomeAndroidMedalliaItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(f20600a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "id");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str3 != null) {
                return new AccountMenuQuery.OnAccountHomeAndroidMedalliaItem(str, bool, str2, str3);
            }
            Assertions.a(reader, "formId");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AccountMenuQuery.OnAccountHomeAndroidMedalliaItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20524a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("formId");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("shouldShowNewBadge");
            Adapters.l.toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (AccountMenuQuery.OnAccountHomeAndroidMedalliaItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountMenuQuery_ResponseAdapter$OnAccountHomeOnboardingItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountMenuQuery$OnAccountHomeOnboardingItem;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnAccountHomeOnboardingItem implements Adapter<AccountMenuQuery.OnAccountHomeOnboardingItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20601a = CollectionsKt.R("id", "title", UrlHandler.ACTION, "shouldShowNewBadge");

        public static AccountMenuQuery.OnAccountHomeOnboardingItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            AccountMenuQuery.Action1 action1 = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(f20601a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    action1 = (AccountMenuQuery.Action1) Adapters.c(Action1.f20594a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "id");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (action1 != null) {
                return new AccountMenuQuery.OnAccountHomeOnboardingItem(str, str2, action1, bool);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AccountMenuQuery.OnAccountHomeOnboardingItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20525a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(UrlHandler.ACTION);
            Adapters.c(Action1.f20594a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1("shouldShowNewBadge");
            Adapters.l.toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (AccountMenuQuery.OnAccountHomeOnboardingItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountMenuQuery_ResponseAdapter$OnAccountHomeOptionCanCloseAccountItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountMenuQuery$OnAccountHomeOptionCanCloseAccountItem;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnAccountHomeOptionCanCloseAccountItem implements Adapter<AccountMenuQuery.OnAccountHomeOptionCanCloseAccountItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20602a = CollectionsKt.R("id", "title", "page", "callbackURL", "shouldShowNewBadge");

        public static AccountMenuQuery.OnAccountHomeOptionCanCloseAccountItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                int iO2 = reader.o2(f20602a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "id");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, "page");
                throw null;
            }
            if (str4 != null) {
                return new AccountMenuQuery.OnAccountHomeOptionCanCloseAccountItem(bool, str, str2, str3, str4);
            }
            Assertions.a(reader, "callbackURL");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AccountMenuQuery.OnAccountHomeOptionCanCloseAccountItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20526a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("page");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("callbackURL");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("shouldShowNewBadge");
            Adapters.l.toJson(writer, customScalarAdapters, value.e);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (AccountMenuQuery.OnAccountHomeOptionCanCloseAccountItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountMenuQuery_ResponseAdapter$OnAccountHomeOptionDeleteAccountItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountMenuQuery$OnAccountHomeOptionDeleteAccountItem;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnAccountHomeOptionDeleteAccountItem implements Adapter<AccountMenuQuery.OnAccountHomeOptionDeleteAccountItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20603a = CollectionsKt.R("id", "title");

        public static AccountMenuQuery.OnAccountHomeOptionDeleteAccountItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f20603a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "id");
                throw null;
            }
            if (str2 != null) {
                return new AccountMenuQuery.OnAccountHomeOptionDeleteAccountItem(str, str2);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AccountMenuQuery.OnAccountHomeOptionDeleteAccountItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20527a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (AccountMenuQuery.OnAccountHomeOptionDeleteAccountItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountMenuQuery_ResponseAdapter$OnAccountHomeOptionItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountMenuQuery$OnAccountHomeOptionItem;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnAccountHomeOptionItem implements Adapter<AccountMenuQuery.OnAccountHomeOptionItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20604a = CollectionsKt.R("id", "title", UrlHandler.ACTION, "shouldShowNewBadge");

        public static AccountMenuQuery.OnAccountHomeOptionItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            AccountMenuQuery.Action action = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(f20604a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    action = (AccountMenuQuery.Action) Adapters.c(Action.f20593a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "id");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (action != null) {
                return new AccountMenuQuery.OnAccountHomeOptionItem(str, str2, action, bool);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AccountMenuQuery.OnAccountHomeOptionItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20528a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(UrlHandler.ACTION);
            Adapters.c(Action.f20593a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1("shouldShowNewBadge");
            Adapters.l.toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (AccountMenuQuery.OnAccountHomeOptionItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountMenuQuery_ResponseAdapter$OnAccountHomeOptionMagicLinkItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountMenuQuery$OnAccountHomeOptionMagicLinkItem;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnAccountHomeOptionMagicLinkItem implements Adapter<AccountMenuQuery.OnAccountHomeOptionMagicLinkItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20605a = CollectionsKt.R("id", "title", "page", "shouldShowNewBadge");

        public static AccountMenuQuery.OnAccountHomeOptionMagicLinkItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(f20605a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "id");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str3 != null) {
                return new AccountMenuQuery.OnAccountHomeOptionMagicLinkItem(str, bool, str2, str3);
            }
            Assertions.a(reader, "page");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AccountMenuQuery.OnAccountHomeOptionMagicLinkItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20529a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("page");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("shouldShowNewBadge");
            Adapters.l.toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (AccountMenuQuery.OnAccountHomeOptionMagicLinkItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountMenuQuery_ResponseAdapter$OnAccountHomeOptionMandyItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountMenuQuery$OnAccountHomeOptionMandyItem;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnAccountHomeOptionMandyItem implements Adapter<AccountMenuQuery.OnAccountHomeOptionMandyItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20606a = CollectionsKt.R("id", "title", "page", "shouldShowNewBadge");

        public static AccountMenuQuery.OnAccountHomeOptionMandyItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(f20606a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "id");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str3 != null) {
                return new AccountMenuQuery.OnAccountHomeOptionMandyItem(str, bool, str2, str3);
            }
            Assertions.a(reader, "page");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AccountMenuQuery.OnAccountHomeOptionMandyItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20530a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("page");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("shouldShowNewBadge");
            Adapters.l.toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (AccountMenuQuery.OnAccountHomeOptionMandyItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountMenuQuery_ResponseAdapter$PrimaryCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountMenuQuery$PrimaryCta;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PrimaryCta implements Adapter<AccountMenuQuery.PrimaryCta> {

        /* renamed from: a, reason: collision with root package name */
        public static final PrimaryCta f20607a = new PrimaryCta();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "url");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
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
                return new AccountMenuQuery.PrimaryCta(str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountMenuQuery.PrimaryCta value = (AccountMenuQuery.PrimaryCta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20531a);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountMenuQuery_ResponseAdapter$RewardsAccountMenu;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountMenuQuery$RewardsAccountMenu;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsAccountMenu implements Adapter<AccountMenuQuery.RewardsAccountMenu> {

        /* renamed from: a, reason: collision with root package name */
        public static final RewardsAccountMenu f20608a = new RewardsAccountMenu();
        public static final List b = CollectionsKt.R("accountBanner", "sections", "accountHomeFooter");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            AccountMenuQuery.AccountBanner accountBanner = null;
            List list = null;
            AccountMenuQuery.AccountHomeFooter accountHomeFooter = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    accountBanner = (AccountMenuQuery.AccountBanner) Adapters.b(Adapters.c(AccountBanner.f20591a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    list = (List) Adapters.b(Adapters.a(Adapters.c(Section.f20609a, false))).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        return new AccountMenuQuery.RewardsAccountMenu(accountBanner, list, accountHomeFooter);
                    }
                    accountHomeFooter = (AccountMenuQuery.AccountHomeFooter) Adapters.b(Adapters.c(AccountHomeFooter.f20592a, false)).fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountMenuQuery.RewardsAccountMenu value = (AccountMenuQuery.RewardsAccountMenu) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("accountBanner");
            Adapters.b(Adapters.c(AccountBanner.f20591a, true)).toJson(writer, customScalarAdapters, value.f20532a);
            writer.F1("sections");
            Adapters.b(Adapters.a(Adapters.c(Section.f20609a, false))).toJson(writer, customScalarAdapters, value.b);
            writer.F1("accountHomeFooter");
            Adapters.b(Adapters.c(AccountHomeFooter.f20592a, false)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountMenuQuery_ResponseAdapter$Section;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountMenuQuery$Section;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Section implements Adapter<AccountMenuQuery.Section> {

        /* renamed from: a, reason: collision with root package name */
        public static final Section f20609a = new Section();
        public static final List b = CollectionsKt.R("title", "items");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Item.f20597a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new AccountMenuQuery.Section(str, arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountMenuQuery.Section value = (AccountMenuQuery.Section) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20533a);
            writer.F1("items");
            Adapters.a(Adapters.c(Item.f20597a, true)).toJson(writer, customScalarAdapters, value.b);
        }
    }
}
