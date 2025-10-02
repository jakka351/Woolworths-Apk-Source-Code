package com.woolworths.rewards.account.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.rewards.graphql.type.ActionType;
import au.com.woolworths.rewards.graphql.type.BannerNotificationDisplayType;
import au.com.woolworths.rewards.graphql.type.CoreAlertStyle;
import au.com.woolworths.rewards.graphql.type.HomeOptionAction;
import au.com.woolworths.rewards.graphql.type.adapter.ActionType_ResponseAdapter;
import au.com.woolworths.rewards.graphql.type.adapter.BannerNotificationDisplayType_ResponseAdapter;
import au.com.woolworths.rewards.graphql.type.adapter.CoreAlertStyle_ResponseAdapter;
import au.com.woolworths.rewards.graphql.type.adapter.HomeOptionAction_ResponseAdapter;
import au.com.woolworths.sdui.rewards.fragment.AnalyticsFields;
import au.com.woolworths.sdui.rewards.fragment.AnalyticsFieldsImpl_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.UrlHandler;
import com.woolworths.rewards.account.AccountHomeQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\bÇ\u0002\u0018\u00002\u00020\u0001:\u0017\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountHomeQuery_ResponseAdapter;", "", "Data", "RewardsAccountHome", "AppUpgrade", "InsetAlertUI", "InsetAlertAction", "Analytics", "AccountBanner", "OnAccountBannerNotification", "PrimaryCta", "Section", "Option", "OnAccountHomeOptionItem", "Action", "OnAccountHomeOptionMagicLinkItem", "OnAccountHomeOptionMandyItem", "OnAccountHomeAndroidAppReviewLinkItem", "OnAccountHomeAndroidMedalliaItem", "OnAccountHomeOnboardingItem", "Action1", "OnAccountHomeOptionCanCloseAccountItem", "AccountHomeFooter", "Action2", "UnreadChatbotMsg", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AccountHomeQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountHomeQuery_ResponseAdapter$AccountBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountHomeQuery$AccountBanner;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AccountBanner implements Adapter<AccountHomeQuery.AccountBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final AccountBanner f20568a = new AccountBanner();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            AccountHomeQuery.OnAccountBannerNotification onAccountBannerNotificationA = null;
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
            return new AccountHomeQuery.AccountBanner(str, onAccountBannerNotificationA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountHomeQuery.AccountBanner value = (AccountHomeQuery.AccountBanner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20492a);
            AccountHomeQuery.OnAccountBannerNotification onAccountBannerNotification = value.b;
            if (onAccountBannerNotification != null) {
                OnAccountBannerNotification.b(writer, customScalarAdapters, onAccountBannerNotification);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountHomeQuery_ResponseAdapter$AccountHomeFooter;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountHomeQuery$AccountHomeFooter;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AccountHomeFooter implements Adapter<AccountHomeQuery.AccountHomeFooter> {

        /* renamed from: a, reason: collision with root package name */
        public static final AccountHomeFooter f20569a = new AccountHomeFooter();
        public static final List b = CollectionsKt.R("iconUrl", lqlqqlq.mmm006Dm006Dm, UrlHandler.ACTION);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            AccountHomeQuery.Action2 action2 = null;
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
                    action2 = (AccountHomeQuery.Action2) Adapters.b(Adapters.c(Action2.f20572a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "iconUrl");
                throw null;
            }
            if (str2 != null) {
                return new AccountHomeQuery.AccountHomeFooter(str, str2, action2);
            }
            Assertions.a(reader, lqlqqlq.mmm006Dm006Dm);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountHomeQuery.AccountHomeFooter value = (AccountHomeQuery.AccountHomeFooter) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("iconUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20493a);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(UrlHandler.ACTION);
            Adapters.b(Adapters.c(Action2.f20572a, false)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountHomeQuery_ResponseAdapter$Action;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountHomeQuery$Action;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action implements Adapter<AccountHomeQuery.Action> {

        /* renamed from: a, reason: collision with root package name */
        public static final Action f20570a = new Action();
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
                return new AccountHomeQuery.Action(homeOptionActionA, str);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountHomeQuery.Action value = (AccountHomeQuery.Action) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(UrlHandler.ACTION);
            HomeOptionAction_ResponseAdapter.b(writer, customScalarAdapters, value.f20494a);
            writer.F1("url");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountHomeQuery_ResponseAdapter$Action1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountHomeQuery$Action1;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action1 implements Adapter<AccountHomeQuery.Action1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Action1 f20571a = new Action1();
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
                return new AccountHomeQuery.Action1(homeOptionActionA, str);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountHomeQuery.Action1 value = (AccountHomeQuery.Action1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(UrlHandler.ACTION);
            HomeOptionAction_ResponseAdapter.b(writer, customScalarAdapters, value.f20495a);
            writer.F1("url");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountHomeQuery_ResponseAdapter$Action2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountHomeQuery$Action2;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action2 implements Adapter<AccountHomeQuery.Action2> {

        /* renamed from: a, reason: collision with root package name */
        public static final Action2 f20572a = new Action2();
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
                return new AccountHomeQuery.Action2(str, str2);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountHomeQuery.Action2 value = (AccountHomeQuery.Action2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20496a);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountHomeQuery_ResponseAdapter$Analytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountHomeQuery$Analytics;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics implements Adapter<AccountHomeQuery.Analytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics f20573a = new Analytics();
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
                return new AccountHomeQuery.Analytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountHomeQuery.Analytics value = (AccountHomeQuery.Analytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20497a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10022a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountHomeQuery_ResponseAdapter$AppUpgrade;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountHomeQuery$AppUpgrade;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AppUpgrade implements Adapter<AccountHomeQuery.AppUpgrade> {

        /* renamed from: a, reason: collision with root package name */
        public static final AppUpgrade f20574a = new AppUpgrade();
        public static final List b = CollectionsKt.R("insetAlertUI", "insetAlertAction", "insetAlertActionLabel");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            AccountHomeQuery.InsetAlertUI insetAlertUI = null;
            AccountHomeQuery.InsetAlertAction insetAlertAction = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    insetAlertUI = (AccountHomeQuery.InsetAlertUI) Adapters.c(InsetAlertUI.f20577a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    insetAlertAction = (AccountHomeQuery.InsetAlertAction) Adapters.b(Adapters.c(InsetAlertAction.f20576a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (insetAlertUI != null) {
                return new AccountHomeQuery.AppUpgrade(insetAlertUI, insetAlertAction, str);
            }
            Assertions.a(reader, "insetAlertUI");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountHomeQuery.AppUpgrade value = (AccountHomeQuery.AppUpgrade) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("insetAlertUI");
            Adapters.c(InsetAlertUI.f20577a, false).toJson(writer, customScalarAdapters, value.f20498a);
            writer.F1("insetAlertAction");
            Adapters.b(Adapters.c(InsetAlertAction.f20576a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("insetAlertActionLabel");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountHomeQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountHomeQuery$Data;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<AccountHomeQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f20575a = new Data();
        public static final List b = CollectionsKt.Q("rewardsAccountHome");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            AccountHomeQuery.RewardsAccountHome rewardsAccountHome = null;
            while (reader.o2(b) == 0) {
                rewardsAccountHome = (AccountHomeQuery.RewardsAccountHome) Adapters.b(Adapters.c(RewardsAccountHome.f20588a, false)).fromJson(reader, customScalarAdapters);
            }
            return new AccountHomeQuery.Data(rewardsAccountHome);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountHomeQuery.Data value = (AccountHomeQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("rewardsAccountHome");
            Adapters.b(Adapters.c(RewardsAccountHome.f20588a, false)).toJson(writer, customScalarAdapters, value.f20499a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountHomeQuery_ResponseAdapter$InsetAlertAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountHomeQuery$InsetAlertAction;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InsetAlertAction implements Adapter<AccountHomeQuery.InsetAlertAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final InsetAlertAction f20576a = new InsetAlertAction();
        public static final List b = CollectionsKt.R("id", "type", UrlHandler.ACTION, "analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ActionType actionTypeA = null;
            String str2 = null;
            AccountHomeQuery.Analytics analytics = null;
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
                    analytics = (AccountHomeQuery.Analytics) Adapters.b(Adapters.c(Analytics.f20573a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str2 != null) {
                return new AccountHomeQuery.InsetAlertAction(str, actionTypeA, str2, analytics);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountHomeQuery.InsetAlertAction value = (AccountHomeQuery.InsetAlertAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.f20500a);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics.f20573a, true)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountHomeQuery_ResponseAdapter$InsetAlertUI;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountHomeQuery$InsetAlertUI;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InsetAlertUI implements Adapter<AccountHomeQuery.InsetAlertUI> {

        /* renamed from: a, reason: collision with root package name */
        public static final InsetAlertUI f20577a = new InsetAlertUI();
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
                return new AccountHomeQuery.InsetAlertUI(str, str2, coreAlertStyleA);
            }
            Assertions.a(reader, "style");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountHomeQuery.InsetAlertUI value = (AccountHomeQuery.InsetAlertUI) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f20501a);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            writer.v0(value.c.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountHomeQuery_ResponseAdapter$OnAccountBannerNotification;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountHomeQuery$OnAccountBannerNotification;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnAccountBannerNotification implements Adapter<AccountHomeQuery.OnAccountBannerNotification> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20578a = CollectionsKt.R("id", "displayType", "title", "message", "primaryCta", "canDismiss", "shouldShowNewBadge");

        public static AccountHomeQuery.OnAccountBannerNotification a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            BannerNotificationDisplayType bannerNotificationDisplayTypeA = null;
            String str2 = null;
            String str3 = null;
            AccountHomeQuery.PrimaryCta primaryCta = null;
            Boolean bool3 = null;
            while (true) {
                switch (reader.o2(f20578a)) {
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
                        primaryCta = (AccountHomeQuery.PrimaryCta) Adapters.b(Adapters.c(PrimaryCta.f20587a, false)).fromJson(reader, customScalarAdapters);
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
                            return new AccountHomeQuery.OnAccountBannerNotification(str, bannerNotificationDisplayTypeA, str2, str3, primaryCta, zBooleanValue, bool5.booleanValue());
                        }
                        Assertions.a(reader, "shouldShowNewBadge");
                        throw null;
                }
                bool2 = bool;
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AccountHomeQuery.OnAccountBannerNotification value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20502a);
            writer.F1("displayType");
            BannerNotificationDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1("title");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
            writer.F1("message");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("primaryCta");
            Adapters.b(Adapters.c(PrimaryCta.f20587a, false)).toJson(writer, customScalarAdapters, value.e);
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
            b(jsonWriter, customScalarAdapters, (AccountHomeQuery.OnAccountBannerNotification) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountHomeQuery_ResponseAdapter$OnAccountHomeAndroidAppReviewLinkItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountHomeQuery$OnAccountHomeAndroidAppReviewLinkItem;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnAccountHomeAndroidAppReviewLinkItem implements Adapter<AccountHomeQuery.OnAccountHomeAndroidAppReviewLinkItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20579a = CollectionsKt.R("id", "title", "url", "shouldShowNewBadge");

        public static AccountHomeQuery.OnAccountHomeAndroidAppReviewLinkItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(f20579a);
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
                return new AccountHomeQuery.OnAccountHomeAndroidAppReviewLinkItem(str, bool, str2, str3);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AccountHomeQuery.OnAccountHomeAndroidAppReviewLinkItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20503a);
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
            b(jsonWriter, customScalarAdapters, (AccountHomeQuery.OnAccountHomeAndroidAppReviewLinkItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountHomeQuery_ResponseAdapter$OnAccountHomeAndroidMedalliaItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountHomeQuery$OnAccountHomeAndroidMedalliaItem;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnAccountHomeAndroidMedalliaItem implements Adapter<AccountHomeQuery.OnAccountHomeAndroidMedalliaItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20580a = CollectionsKt.R("id", "title", "formId", "shouldShowNewBadge");

        public static AccountHomeQuery.OnAccountHomeAndroidMedalliaItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(f20580a);
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
                return new AccountHomeQuery.OnAccountHomeAndroidMedalliaItem(str, bool, str2, str3);
            }
            Assertions.a(reader, "formId");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AccountHomeQuery.OnAccountHomeAndroidMedalliaItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20504a);
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
            b(jsonWriter, customScalarAdapters, (AccountHomeQuery.OnAccountHomeAndroidMedalliaItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountHomeQuery_ResponseAdapter$OnAccountHomeOnboardingItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountHomeQuery$OnAccountHomeOnboardingItem;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnAccountHomeOnboardingItem implements Adapter<AccountHomeQuery.OnAccountHomeOnboardingItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20581a = CollectionsKt.R("id", "title", UrlHandler.ACTION, "shouldShowNewBadge");

        public static AccountHomeQuery.OnAccountHomeOnboardingItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            AccountHomeQuery.Action1 action1 = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(f20581a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    action1 = (AccountHomeQuery.Action1) Adapters.c(Action1.f20571a, false).fromJson(reader, customScalarAdapters);
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
                return new AccountHomeQuery.OnAccountHomeOnboardingItem(str, str2, action1, bool);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AccountHomeQuery.OnAccountHomeOnboardingItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20505a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(UrlHandler.ACTION);
            Adapters.c(Action1.f20571a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1("shouldShowNewBadge");
            Adapters.l.toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (AccountHomeQuery.OnAccountHomeOnboardingItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountHomeQuery_ResponseAdapter$OnAccountHomeOptionCanCloseAccountItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountHomeQuery$OnAccountHomeOptionCanCloseAccountItem;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnAccountHomeOptionCanCloseAccountItem implements Adapter<AccountHomeQuery.OnAccountHomeOptionCanCloseAccountItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20582a = CollectionsKt.R("id", "title", "page", "callbackURL", "shouldShowNewBadge");

        public static AccountHomeQuery.OnAccountHomeOptionCanCloseAccountItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                int iO2 = reader.o2(f20582a);
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
                return new AccountHomeQuery.OnAccountHomeOptionCanCloseAccountItem(bool, str, str2, str3, str4);
            }
            Assertions.a(reader, "callbackURL");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AccountHomeQuery.OnAccountHomeOptionCanCloseAccountItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20506a);
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
            b(jsonWriter, customScalarAdapters, (AccountHomeQuery.OnAccountHomeOptionCanCloseAccountItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountHomeQuery_ResponseAdapter$OnAccountHomeOptionItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountHomeQuery$OnAccountHomeOptionItem;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnAccountHomeOptionItem implements Adapter<AccountHomeQuery.OnAccountHomeOptionItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20583a = CollectionsKt.R("id", "title", UrlHandler.ACTION, "shouldShowNewBadge");

        public static AccountHomeQuery.OnAccountHomeOptionItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            AccountHomeQuery.Action action = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(f20583a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    action = (AccountHomeQuery.Action) Adapters.c(Action.f20570a, false).fromJson(reader, customScalarAdapters);
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
                return new AccountHomeQuery.OnAccountHomeOptionItem(str, str2, action, bool);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AccountHomeQuery.OnAccountHomeOptionItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20507a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(UrlHandler.ACTION);
            Adapters.c(Action.f20570a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1("shouldShowNewBadge");
            Adapters.l.toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (AccountHomeQuery.OnAccountHomeOptionItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountHomeQuery_ResponseAdapter$OnAccountHomeOptionMagicLinkItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountHomeQuery$OnAccountHomeOptionMagicLinkItem;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnAccountHomeOptionMagicLinkItem implements Adapter<AccountHomeQuery.OnAccountHomeOptionMagicLinkItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20584a = CollectionsKt.R("id", "title", "page", "shouldShowNewBadge");

        public static AccountHomeQuery.OnAccountHomeOptionMagicLinkItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(f20584a);
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
                return new AccountHomeQuery.OnAccountHomeOptionMagicLinkItem(str, bool, str2, str3);
            }
            Assertions.a(reader, "page");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AccountHomeQuery.OnAccountHomeOptionMagicLinkItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20508a);
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
            b(jsonWriter, customScalarAdapters, (AccountHomeQuery.OnAccountHomeOptionMagicLinkItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountHomeQuery_ResponseAdapter$OnAccountHomeOptionMandyItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountHomeQuery$OnAccountHomeOptionMandyItem;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnAccountHomeOptionMandyItem implements Adapter<AccountHomeQuery.OnAccountHomeOptionMandyItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20585a = CollectionsKt.R("id", "title", "page", "shouldShowNewBadge");

        public static AccountHomeQuery.OnAccountHomeOptionMandyItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(f20585a);
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
                return new AccountHomeQuery.OnAccountHomeOptionMandyItem(str, bool, str2, str3);
            }
            Assertions.a(reader, "page");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AccountHomeQuery.OnAccountHomeOptionMandyItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20509a);
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
            b(jsonWriter, customScalarAdapters, (AccountHomeQuery.OnAccountHomeOptionMandyItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountHomeQuery_ResponseAdapter$Option;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountHomeQuery$Option;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Option implements Adapter<AccountHomeQuery.Option> {

        /* renamed from: a, reason: collision with root package name */
        public static final Option f20586a = new Option();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            AccountHomeQuery.OnAccountHomeOptionItem onAccountHomeOptionItemA;
            AccountHomeQuery.OnAccountHomeOptionMagicLinkItem onAccountHomeOptionMagicLinkItemA;
            AccountHomeQuery.OnAccountHomeOptionMandyItem onAccountHomeOptionMandyItemA;
            AccountHomeQuery.OnAccountHomeAndroidAppReviewLinkItem onAccountHomeAndroidAppReviewLinkItemA;
            AccountHomeQuery.OnAccountHomeAndroidMedalliaItem onAccountHomeAndroidMedalliaItemA;
            AccountHomeQuery.OnAccountHomeOnboardingItem onAccountHomeOnboardingItemA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            AccountHomeQuery.OnAccountHomeOptionCanCloseAccountItem onAccountHomeOptionCanCloseAccountItemA = null;
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
            }
            return new AccountHomeQuery.Option(str, onAccountHomeOptionItemA, onAccountHomeOptionMagicLinkItemA, onAccountHomeOptionMandyItemA, onAccountHomeAndroidAppReviewLinkItemA, onAccountHomeAndroidMedalliaItemA, onAccountHomeOnboardingItemA, onAccountHomeOptionCanCloseAccountItemA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountHomeQuery.Option value = (AccountHomeQuery.Option) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20510a);
            AccountHomeQuery.OnAccountHomeOptionItem onAccountHomeOptionItem = value.b;
            if (onAccountHomeOptionItem != null) {
                OnAccountHomeOptionItem.b(writer, customScalarAdapters, onAccountHomeOptionItem);
            }
            AccountHomeQuery.OnAccountHomeOptionMagicLinkItem onAccountHomeOptionMagicLinkItem = value.c;
            if (onAccountHomeOptionMagicLinkItem != null) {
                OnAccountHomeOptionMagicLinkItem.b(writer, customScalarAdapters, onAccountHomeOptionMagicLinkItem);
            }
            AccountHomeQuery.OnAccountHomeOptionMandyItem onAccountHomeOptionMandyItem = value.d;
            if (onAccountHomeOptionMandyItem != null) {
                OnAccountHomeOptionMandyItem.b(writer, customScalarAdapters, onAccountHomeOptionMandyItem);
            }
            AccountHomeQuery.OnAccountHomeAndroidAppReviewLinkItem onAccountHomeAndroidAppReviewLinkItem = value.e;
            if (onAccountHomeAndroidAppReviewLinkItem != null) {
                OnAccountHomeAndroidAppReviewLinkItem.b(writer, customScalarAdapters, onAccountHomeAndroidAppReviewLinkItem);
            }
            AccountHomeQuery.OnAccountHomeAndroidMedalliaItem onAccountHomeAndroidMedalliaItem = value.f;
            if (onAccountHomeAndroidMedalliaItem != null) {
                OnAccountHomeAndroidMedalliaItem.b(writer, customScalarAdapters, onAccountHomeAndroidMedalliaItem);
            }
            AccountHomeQuery.OnAccountHomeOnboardingItem onAccountHomeOnboardingItem = value.g;
            if (onAccountHomeOnboardingItem != null) {
                OnAccountHomeOnboardingItem.b(writer, customScalarAdapters, onAccountHomeOnboardingItem);
            }
            AccountHomeQuery.OnAccountHomeOptionCanCloseAccountItem onAccountHomeOptionCanCloseAccountItem = value.h;
            if (onAccountHomeOptionCanCloseAccountItem != null) {
                OnAccountHomeOptionCanCloseAccountItem.b(writer, customScalarAdapters, onAccountHomeOptionCanCloseAccountItem);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountHomeQuery_ResponseAdapter$PrimaryCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountHomeQuery$PrimaryCta;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PrimaryCta implements Adapter<AccountHomeQuery.PrimaryCta> {

        /* renamed from: a, reason: collision with root package name */
        public static final PrimaryCta f20587a = new PrimaryCta();
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
                return new AccountHomeQuery.PrimaryCta(str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountHomeQuery.PrimaryCta value = (AccountHomeQuery.PrimaryCta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20511a);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountHomeQuery_ResponseAdapter$RewardsAccountHome;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountHomeQuery$RewardsAccountHome;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsAccountHome implements Adapter<AccountHomeQuery.RewardsAccountHome> {

        /* renamed from: a, reason: collision with root package name */
        public static final RewardsAccountHome f20588a = new RewardsAccountHome();
        public static final List b = CollectionsKt.R("appUpgrade", "accountBanner", "sections", "accountHomeFooter", "unreadChatbotMsg");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            AccountHomeQuery.AppUpgrade appUpgrade = null;
            AccountHomeQuery.AccountBanner accountBanner = null;
            List list = null;
            AccountHomeQuery.AccountHomeFooter accountHomeFooter = null;
            AccountHomeQuery.UnreadChatbotMsg unreadChatbotMsg = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    appUpgrade = (AccountHomeQuery.AppUpgrade) Adapters.b(Adapters.c(AppUpgrade.f20574a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    accountBanner = (AccountHomeQuery.AccountBanner) Adapters.b(Adapters.c(AccountBanner.f20568a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    list = (List) Adapters.b(Adapters.a(Adapters.c(Section.f20589a, false))).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    accountHomeFooter = (AccountHomeQuery.AccountHomeFooter) Adapters.b(Adapters.c(AccountHomeFooter.f20569a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        return new AccountHomeQuery.RewardsAccountHome(appUpgrade, accountBanner, list, accountHomeFooter, unreadChatbotMsg);
                    }
                    unreadChatbotMsg = (AccountHomeQuery.UnreadChatbotMsg) Adapters.b(Adapters.c(UnreadChatbotMsg.f20590a, false)).fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountHomeQuery.RewardsAccountHome value = (AccountHomeQuery.RewardsAccountHome) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("appUpgrade");
            Adapters.b(Adapters.c(AppUpgrade.f20574a, false)).toJson(writer, customScalarAdapters, value.f20512a);
            writer.F1("accountBanner");
            Adapters.b(Adapters.c(AccountBanner.f20568a, true)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("sections");
            Adapters.b(Adapters.a(Adapters.c(Section.f20589a, false))).toJson(writer, customScalarAdapters, value.c);
            writer.F1("accountHomeFooter");
            Adapters.b(Adapters.c(AccountHomeFooter.f20569a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("unreadChatbotMsg");
            Adapters.b(Adapters.c(UnreadChatbotMsg.f20590a, false)).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountHomeQuery_ResponseAdapter$Section;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountHomeQuery$Section;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Section implements Adapter<AccountHomeQuery.Section> {

        /* renamed from: a, reason: collision with root package name */
        public static final Section f20589a = new Section();
        public static final List b = CollectionsKt.R("title", "options");

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
                    arrayListFromJson = Adapters.a(Adapters.c(Option.f20586a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new AccountHomeQuery.Section(str, arrayListFromJson);
            }
            Assertions.a(reader, "options");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountHomeQuery.Section value = (AccountHomeQuery.Section) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20513a);
            writer.F1("options");
            Adapters.a(Adapters.c(Option.f20586a, true)).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/AccountHomeQuery_ResponseAdapter$UnreadChatbotMsg;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/AccountHomeQuery$UnreadChatbotMsg;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnreadChatbotMsg implements Adapter<AccountHomeQuery.UnreadChatbotMsg> {

        /* renamed from: a, reason: collision with root package name */
        public static final UnreadChatbotMsg f20590a = new UnreadChatbotMsg();
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
                return new AccountHomeQuery.UnreadChatbotMsg(num.intValue());
            }
            Assertions.a(reader, "count");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountHomeQuery.UnreadChatbotMsg value = (AccountHomeQuery.UnreadChatbotMsg) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("count");
            Adapters.b.toJson(writer, customScalarAdapters, Integer.valueOf(value.f20514a));
        }
    }
}
