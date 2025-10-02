package com.woolworths.feature.shop.account.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.adapter.ActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ButtonStyle_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.woolworths.feature.shop.account.AccountDetailsQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b'\bÇ\u0002\u0018\u00002\u00020\u0001:&\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'¨\u0006("}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/AccountDetailsQuery_ResponseAdapter;", "", "Data", "AccountDetails", "Feed", "OnMyAccountPersonalDetails", "RowItem", "LeadingAsset", "OnHostedIcon", "OnCoreIcon", "TrailingAsset", "OnHostedIcon1", "OnCoreIcon1", "OnMyAccountBusinessDetails", "RowItem1", "LeadingAsset1", "OnHostedIcon2", "OnCoreIcon2", "TrailingAsset1", "OnHostedIcon3", "OnCoreIcon3", "OnMyAccountContactDetails", "RowItem2", "LeadingAsset2", "OnHostedIcon4", "OnCoreIcon4", "TrailingAsset2", "OnHostedIcon5", "OnCoreIcon5", "OnMyAccountPreferences", "RowItem3", "LeadingAsset3", "OnHostedIcon6", "OnCoreIcon6", "TrailingAsset3", "OnHostedIcon7", "OnCoreIcon7", "OnMyAccountFooter", "Button", "ButtonAction", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AccountDetailsQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/AccountDetailsQuery_ResponseAdapter$AccountDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/AccountDetailsQuery$AccountDetails;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AccountDetails implements Adapter<AccountDetailsQuery.AccountDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final AccountDetails f19346a = new AccountDetails();
        public static final List b = CollectionsKt.Q("feed");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(b) == 0) {
                arrayListFromJson = Adapters.a(Adapters.b(Adapters.c(Feed.f19350a, true))).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new AccountDetailsQuery.AccountDetails(arrayListFromJson);
            }
            Assertions.a(reader, "feed");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountDetailsQuery.AccountDetails value = (AccountDetailsQuery.AccountDetails) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("feed");
            Adapters.a(Adapters.b(Adapters.c(Feed.f19350a, true))).toJson(writer, customScalarAdapters, value.f19303a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/AccountDetailsQuery_ResponseAdapter$Button;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/AccountDetailsQuery$Button;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Button implements Adapter<AccountDetailsQuery.Button> {

        /* renamed from: a, reason: collision with root package name */
        public static final Button f19347a = new Button();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "style", "enabled", "buttonAction", "iconUrl");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            ButtonStyle buttonStyle = null;
            AccountDetailsQuery.ButtonAction buttonAction = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    bool = bool2;
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = bool2;
                    buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    bool = bool2;
                    buttonAction = (AccountDetailsQuery.ButtonAction) Adapters.b(Adapters.c(ButtonAction.f19348a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    bool = bool2;
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
                bool2 = bool;
            }
            Boolean bool3 = bool2;
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool3 != null) {
                return new AccountDetailsQuery.Button(str, buttonStyle, bool3.booleanValue(), buttonAction, str2);
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountDetailsQuery.Button value = (AccountDetailsQuery.Button) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19304a);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.b);
            writer.F1("enabled");
            d.B(value.c, Adapters.f, writer, customScalarAdapters, "buttonAction");
            Adapters.b(Adapters.c(ButtonAction.f19348a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("iconUrl");
            Adapters.i.toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/AccountDetailsQuery_ResponseAdapter$ButtonAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/AccountDetailsQuery$ButtonAction;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ButtonAction implements Adapter<AccountDetailsQuery.ButtonAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final ButtonAction f19348a = new ButtonAction();
        public static final List b = CollectionsKt.R("id", UrlHandler.ACTION, "type");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ActionType actionTypeA = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (str2 == null) {
                Assertions.a(reader, UrlHandler.ACTION);
                throw null;
            }
            if (actionTypeA != null) {
                return new AccountDetailsQuery.ButtonAction(actionTypeA, str, str2);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountDetailsQuery.ButtonAction value = (AccountDetailsQuery.ButtonAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.f19305a);
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/AccountDetailsQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/AccountDetailsQuery$Data;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<AccountDetailsQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f19349a = new Data();
        public static final List b = CollectionsKt.Q("accountDetails");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            AccountDetailsQuery.AccountDetails accountDetails = null;
            while (reader.o2(b) == 0) {
                accountDetails = (AccountDetailsQuery.AccountDetails) Adapters.c(AccountDetails.f19346a, false).fromJson(reader, customScalarAdapters);
            }
            if (accountDetails != null) {
                return new AccountDetailsQuery.Data(accountDetails);
            }
            Assertions.a(reader, "accountDetails");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountDetailsQuery.Data value = (AccountDetailsQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("accountDetails");
            Adapters.c(AccountDetails.f19346a, false).toJson(writer, customScalarAdapters, value.f19306a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/AccountDetailsQuery_ResponseAdapter$Feed;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/AccountDetailsQuery$Feed;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Feed implements Adapter<AccountDetailsQuery.Feed> {

        /* renamed from: a, reason: collision with root package name */
        public static final Feed f19350a = new Feed();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            AccountDetailsQuery.OnMyAccountPersonalDetails onMyAccountPersonalDetailsA;
            AccountDetailsQuery.OnMyAccountBusinessDetails onMyAccountBusinessDetailsA;
            AccountDetailsQuery.OnMyAccountContactDetails onMyAccountContactDetailsA;
            AccountDetailsQuery.OnMyAccountPreferences onMyAccountPreferencesA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            AccountDetailsQuery.OnMyAccountFooter onMyAccountFooterA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("MyAccountPersonalDetails"))) {
                reader.o();
                onMyAccountPersonalDetailsA = OnMyAccountPersonalDetails.a(reader, customScalarAdapters);
            } else {
                onMyAccountPersonalDetailsA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("MyAccountBusinessDetails"))) {
                reader.o();
                onMyAccountBusinessDetailsA = OnMyAccountBusinessDetails.a(reader, customScalarAdapters);
            } else {
                onMyAccountBusinessDetailsA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("MyAccountContactDetails"))) {
                reader.o();
                onMyAccountContactDetailsA = OnMyAccountContactDetails.a(reader, customScalarAdapters);
            } else {
                onMyAccountContactDetailsA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("MyAccountPreferences"))) {
                reader.o();
                onMyAccountPreferencesA = OnMyAccountPreferences.a(reader, customScalarAdapters);
            } else {
                onMyAccountPreferencesA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("MyAccountFooter"))) {
                reader.o();
                onMyAccountFooterA = OnMyAccountFooter.a(reader, customScalarAdapters);
            }
            return new AccountDetailsQuery.Feed(str, onMyAccountPersonalDetailsA, onMyAccountBusinessDetailsA, onMyAccountContactDetailsA, onMyAccountPreferencesA, onMyAccountFooterA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountDetailsQuery.Feed value = (AccountDetailsQuery.Feed) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19307a);
            AccountDetailsQuery.OnMyAccountPersonalDetails onMyAccountPersonalDetails = value.b;
            if (onMyAccountPersonalDetails != null) {
                OnMyAccountPersonalDetails.b(writer, customScalarAdapters, onMyAccountPersonalDetails);
            }
            AccountDetailsQuery.OnMyAccountBusinessDetails onMyAccountBusinessDetails = value.c;
            if (onMyAccountBusinessDetails != null) {
                OnMyAccountBusinessDetails.b(writer, customScalarAdapters, onMyAccountBusinessDetails);
            }
            AccountDetailsQuery.OnMyAccountContactDetails onMyAccountContactDetails = value.d;
            if (onMyAccountContactDetails != null) {
                OnMyAccountContactDetails.b(writer, customScalarAdapters, onMyAccountContactDetails);
            }
            AccountDetailsQuery.OnMyAccountPreferences onMyAccountPreferences = value.e;
            if (onMyAccountPreferences != null) {
                OnMyAccountPreferences.b(writer, customScalarAdapters, onMyAccountPreferences);
            }
            AccountDetailsQuery.OnMyAccountFooter onMyAccountFooter = value.f;
            if (onMyAccountFooter != null) {
                OnMyAccountFooter.b(writer, customScalarAdapters, onMyAccountFooter);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/AccountDetailsQuery_ResponseAdapter$LeadingAsset;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/AccountDetailsQuery$LeadingAsset;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LeadingAsset implements Adapter<AccountDetailsQuery.LeadingAsset> {

        /* renamed from: a, reason: collision with root package name */
        public static final LeadingAsset f19351a = new LeadingAsset();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            AccountDetailsQuery.OnHostedIcon onHostedIconA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            AccountDetailsQuery.OnCoreIcon onCoreIconA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("HostedIcon"))) {
                reader.o();
                onHostedIconA = OnHostedIcon.a(reader, customScalarAdapters);
            } else {
                onHostedIconA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CoreIcon"))) {
                reader.o();
                onCoreIconA = OnCoreIcon.a(reader, customScalarAdapters);
            }
            return new AccountDetailsQuery.LeadingAsset(str, onHostedIconA, onCoreIconA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountDetailsQuery.LeadingAsset value = (AccountDetailsQuery.LeadingAsset) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19308a);
            AccountDetailsQuery.OnHostedIcon onHostedIcon = value.b;
            if (onHostedIcon != null) {
                OnHostedIcon.b(writer, customScalarAdapters, onHostedIcon);
            }
            AccountDetailsQuery.OnCoreIcon onCoreIcon = value.c;
            if (onCoreIcon != null) {
                OnCoreIcon.b(writer, customScalarAdapters, onCoreIcon);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/AccountDetailsQuery_ResponseAdapter$LeadingAsset1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/AccountDetailsQuery$LeadingAsset1;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LeadingAsset1 implements Adapter<AccountDetailsQuery.LeadingAsset1> {

        /* renamed from: a, reason: collision with root package name */
        public static final LeadingAsset1 f19352a = new LeadingAsset1();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            AccountDetailsQuery.OnHostedIcon2 onHostedIcon2A;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            AccountDetailsQuery.OnCoreIcon2 onCoreIcon2A = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("HostedIcon"))) {
                reader.o();
                onHostedIcon2A = OnHostedIcon2.a(reader, customScalarAdapters);
            } else {
                onHostedIcon2A = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CoreIcon"))) {
                reader.o();
                onCoreIcon2A = OnCoreIcon2.a(reader, customScalarAdapters);
            }
            return new AccountDetailsQuery.LeadingAsset1(str, onHostedIcon2A, onCoreIcon2A);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountDetailsQuery.LeadingAsset1 value = (AccountDetailsQuery.LeadingAsset1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19309a);
            AccountDetailsQuery.OnHostedIcon2 onHostedIcon2 = value.b;
            if (onHostedIcon2 != null) {
                OnHostedIcon2.b(writer, customScalarAdapters, onHostedIcon2);
            }
            AccountDetailsQuery.OnCoreIcon2 onCoreIcon2 = value.c;
            if (onCoreIcon2 != null) {
                OnCoreIcon2.b(writer, customScalarAdapters, onCoreIcon2);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/AccountDetailsQuery_ResponseAdapter$LeadingAsset2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/AccountDetailsQuery$LeadingAsset2;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LeadingAsset2 implements Adapter<AccountDetailsQuery.LeadingAsset2> {

        /* renamed from: a, reason: collision with root package name */
        public static final LeadingAsset2 f19353a = new LeadingAsset2();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            AccountDetailsQuery.OnHostedIcon4 onHostedIcon4A;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            AccountDetailsQuery.OnCoreIcon4 onCoreIcon4A = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("HostedIcon"))) {
                reader.o();
                onHostedIcon4A = OnHostedIcon4.a(reader, customScalarAdapters);
            } else {
                onHostedIcon4A = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CoreIcon"))) {
                reader.o();
                onCoreIcon4A = OnCoreIcon4.a(reader, customScalarAdapters);
            }
            return new AccountDetailsQuery.LeadingAsset2(str, onHostedIcon4A, onCoreIcon4A);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountDetailsQuery.LeadingAsset2 value = (AccountDetailsQuery.LeadingAsset2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19310a);
            AccountDetailsQuery.OnHostedIcon4 onHostedIcon4 = value.b;
            if (onHostedIcon4 != null) {
                OnHostedIcon4.b(writer, customScalarAdapters, onHostedIcon4);
            }
            AccountDetailsQuery.OnCoreIcon4 onCoreIcon4 = value.c;
            if (onCoreIcon4 != null) {
                OnCoreIcon4.b(writer, customScalarAdapters, onCoreIcon4);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/AccountDetailsQuery_ResponseAdapter$LeadingAsset3;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/AccountDetailsQuery$LeadingAsset3;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LeadingAsset3 implements Adapter<AccountDetailsQuery.LeadingAsset3> {

        /* renamed from: a, reason: collision with root package name */
        public static final LeadingAsset3 f19354a = new LeadingAsset3();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            AccountDetailsQuery.OnHostedIcon6 onHostedIcon6A;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            AccountDetailsQuery.OnCoreIcon6 onCoreIcon6A = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("HostedIcon"))) {
                reader.o();
                onHostedIcon6A = OnHostedIcon6.a(reader, customScalarAdapters);
            } else {
                onHostedIcon6A = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CoreIcon"))) {
                reader.o();
                onCoreIcon6A = OnCoreIcon6.a(reader, customScalarAdapters);
            }
            return new AccountDetailsQuery.LeadingAsset3(str, onHostedIcon6A, onCoreIcon6A);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountDetailsQuery.LeadingAsset3 value = (AccountDetailsQuery.LeadingAsset3) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19311a);
            AccountDetailsQuery.OnHostedIcon6 onHostedIcon6 = value.b;
            if (onHostedIcon6 != null) {
                OnHostedIcon6.b(writer, customScalarAdapters, onHostedIcon6);
            }
            AccountDetailsQuery.OnCoreIcon6 onCoreIcon6 = value.c;
            if (onCoreIcon6 != null) {
                OnCoreIcon6.b(writer, customScalarAdapters, onCoreIcon6);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/AccountDetailsQuery_ResponseAdapter$OnCoreIcon;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnCoreIcon;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCoreIcon implements Adapter<AccountDetailsQuery.OnCoreIcon> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19355a = CollectionsKt.Q("coreIconName");

        public static AccountDetailsQuery.OnCoreIcon a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19355a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new AccountDetailsQuery.OnCoreIcon(str);
            }
            Assertions.a(reader, "coreIconName");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AccountDetailsQuery.OnCoreIcon value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("coreIconName");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19312a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (AccountDetailsQuery.OnCoreIcon) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/AccountDetailsQuery_ResponseAdapter$OnCoreIcon1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnCoreIcon1;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCoreIcon1 implements Adapter<AccountDetailsQuery.OnCoreIcon1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19356a = CollectionsKt.Q("coreIconName");

        public static AccountDetailsQuery.OnCoreIcon1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19356a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new AccountDetailsQuery.OnCoreIcon1(str);
            }
            Assertions.a(reader, "coreIconName");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AccountDetailsQuery.OnCoreIcon1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("coreIconName");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19313a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (AccountDetailsQuery.OnCoreIcon1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/AccountDetailsQuery_ResponseAdapter$OnCoreIcon2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnCoreIcon2;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCoreIcon2 implements Adapter<AccountDetailsQuery.OnCoreIcon2> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19357a = CollectionsKt.Q("coreIconName");

        public static AccountDetailsQuery.OnCoreIcon2 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19357a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new AccountDetailsQuery.OnCoreIcon2(str);
            }
            Assertions.a(reader, "coreIconName");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AccountDetailsQuery.OnCoreIcon2 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("coreIconName");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19314a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (AccountDetailsQuery.OnCoreIcon2) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/AccountDetailsQuery_ResponseAdapter$OnCoreIcon3;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnCoreIcon3;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCoreIcon3 implements Adapter<AccountDetailsQuery.OnCoreIcon3> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19358a = CollectionsKt.Q("coreIconName");

        public static AccountDetailsQuery.OnCoreIcon3 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19358a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new AccountDetailsQuery.OnCoreIcon3(str);
            }
            Assertions.a(reader, "coreIconName");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AccountDetailsQuery.OnCoreIcon3 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("coreIconName");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19315a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (AccountDetailsQuery.OnCoreIcon3) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/AccountDetailsQuery_ResponseAdapter$OnCoreIcon4;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnCoreIcon4;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCoreIcon4 implements Adapter<AccountDetailsQuery.OnCoreIcon4> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19359a = CollectionsKt.Q("coreIconName");

        public static AccountDetailsQuery.OnCoreIcon4 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19359a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new AccountDetailsQuery.OnCoreIcon4(str);
            }
            Assertions.a(reader, "coreIconName");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AccountDetailsQuery.OnCoreIcon4 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("coreIconName");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19316a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (AccountDetailsQuery.OnCoreIcon4) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/AccountDetailsQuery_ResponseAdapter$OnCoreIcon5;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnCoreIcon5;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCoreIcon5 implements Adapter<AccountDetailsQuery.OnCoreIcon5> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19360a = CollectionsKt.Q("coreIconName");

        public static AccountDetailsQuery.OnCoreIcon5 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19360a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new AccountDetailsQuery.OnCoreIcon5(str);
            }
            Assertions.a(reader, "coreIconName");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AccountDetailsQuery.OnCoreIcon5 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("coreIconName");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19317a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (AccountDetailsQuery.OnCoreIcon5) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/AccountDetailsQuery_ResponseAdapter$OnCoreIcon6;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnCoreIcon6;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCoreIcon6 implements Adapter<AccountDetailsQuery.OnCoreIcon6> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19361a = CollectionsKt.Q("coreIconName");

        public static AccountDetailsQuery.OnCoreIcon6 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19361a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new AccountDetailsQuery.OnCoreIcon6(str);
            }
            Assertions.a(reader, "coreIconName");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AccountDetailsQuery.OnCoreIcon6 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("coreIconName");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19318a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (AccountDetailsQuery.OnCoreIcon6) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/AccountDetailsQuery_ResponseAdapter$OnCoreIcon7;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnCoreIcon7;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCoreIcon7 implements Adapter<AccountDetailsQuery.OnCoreIcon7> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19362a = CollectionsKt.Q("coreIconName");

        public static AccountDetailsQuery.OnCoreIcon7 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19362a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new AccountDetailsQuery.OnCoreIcon7(str);
            }
            Assertions.a(reader, "coreIconName");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AccountDetailsQuery.OnCoreIcon7 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("coreIconName");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19319a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (AccountDetailsQuery.OnCoreIcon7) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/AccountDetailsQuery_ResponseAdapter$OnHostedIcon;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnHostedIcon;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHostedIcon implements Adapter<AccountDetailsQuery.OnHostedIcon> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19363a = CollectionsKt.Q("url");

        public static AccountDetailsQuery.OnHostedIcon a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19363a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new AccountDetailsQuery.OnHostedIcon(str);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AccountDetailsQuery.OnHostedIcon value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19320a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (AccountDetailsQuery.OnHostedIcon) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/AccountDetailsQuery_ResponseAdapter$OnHostedIcon1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnHostedIcon1;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHostedIcon1 implements Adapter<AccountDetailsQuery.OnHostedIcon1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19364a = CollectionsKt.Q("url");

        public static AccountDetailsQuery.OnHostedIcon1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19364a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new AccountDetailsQuery.OnHostedIcon1(str);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AccountDetailsQuery.OnHostedIcon1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19321a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (AccountDetailsQuery.OnHostedIcon1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/AccountDetailsQuery_ResponseAdapter$OnHostedIcon2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnHostedIcon2;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHostedIcon2 implements Adapter<AccountDetailsQuery.OnHostedIcon2> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19365a = CollectionsKt.Q("url");

        public static AccountDetailsQuery.OnHostedIcon2 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19365a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new AccountDetailsQuery.OnHostedIcon2(str);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AccountDetailsQuery.OnHostedIcon2 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19322a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (AccountDetailsQuery.OnHostedIcon2) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/AccountDetailsQuery_ResponseAdapter$OnHostedIcon3;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnHostedIcon3;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHostedIcon3 implements Adapter<AccountDetailsQuery.OnHostedIcon3> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19366a = CollectionsKt.Q("url");

        public static AccountDetailsQuery.OnHostedIcon3 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19366a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new AccountDetailsQuery.OnHostedIcon3(str);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AccountDetailsQuery.OnHostedIcon3 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19323a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (AccountDetailsQuery.OnHostedIcon3) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/AccountDetailsQuery_ResponseAdapter$OnHostedIcon4;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnHostedIcon4;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHostedIcon4 implements Adapter<AccountDetailsQuery.OnHostedIcon4> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19367a = CollectionsKt.Q("url");

        public static AccountDetailsQuery.OnHostedIcon4 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19367a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new AccountDetailsQuery.OnHostedIcon4(str);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AccountDetailsQuery.OnHostedIcon4 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19324a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (AccountDetailsQuery.OnHostedIcon4) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/AccountDetailsQuery_ResponseAdapter$OnHostedIcon5;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnHostedIcon5;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHostedIcon5 implements Adapter<AccountDetailsQuery.OnHostedIcon5> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19368a = CollectionsKt.Q("url");

        public static AccountDetailsQuery.OnHostedIcon5 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19368a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new AccountDetailsQuery.OnHostedIcon5(str);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AccountDetailsQuery.OnHostedIcon5 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19325a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (AccountDetailsQuery.OnHostedIcon5) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/AccountDetailsQuery_ResponseAdapter$OnHostedIcon6;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnHostedIcon6;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHostedIcon6 implements Adapter<AccountDetailsQuery.OnHostedIcon6> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19369a = CollectionsKt.Q("url");

        public static AccountDetailsQuery.OnHostedIcon6 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19369a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new AccountDetailsQuery.OnHostedIcon6(str);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AccountDetailsQuery.OnHostedIcon6 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19326a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (AccountDetailsQuery.OnHostedIcon6) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/AccountDetailsQuery_ResponseAdapter$OnHostedIcon7;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnHostedIcon7;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHostedIcon7 implements Adapter<AccountDetailsQuery.OnHostedIcon7> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19370a = CollectionsKt.Q("url");

        public static AccountDetailsQuery.OnHostedIcon7 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19370a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new AccountDetailsQuery.OnHostedIcon7(str);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AccountDetailsQuery.OnHostedIcon7 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19327a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (AccountDetailsQuery.OnHostedIcon7) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/AccountDetailsQuery_ResponseAdapter$OnMyAccountBusinessDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnMyAccountBusinessDetails;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnMyAccountBusinessDetails implements Adapter<AccountDetailsQuery.OnMyAccountBusinessDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19371a = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "rowItems");

        public static AccountDetailsQuery.OnMyAccountBusinessDetails a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f19371a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(RowItem1.f19377a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new AccountDetailsQuery.OnMyAccountBusinessDetails(str, str2, arrayListFromJson);
            }
            Assertions.a(reader, "rowItems");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AccountDetailsQuery.OnMyAccountBusinessDetails value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19328a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("rowItems");
            Adapters.a(Adapters.c(RowItem1.f19377a, false)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (AccountDetailsQuery.OnMyAccountBusinessDetails) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/AccountDetailsQuery_ResponseAdapter$OnMyAccountContactDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnMyAccountContactDetails;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnMyAccountContactDetails implements Adapter<AccountDetailsQuery.OnMyAccountContactDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19372a = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "rowItems");

        public static AccountDetailsQuery.OnMyAccountContactDetails a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f19372a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(RowItem2.f19378a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new AccountDetailsQuery.OnMyAccountContactDetails(str, str2, arrayListFromJson);
            }
            Assertions.a(reader, "rowItems");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AccountDetailsQuery.OnMyAccountContactDetails value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19329a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("rowItems");
            Adapters.a(Adapters.c(RowItem2.f19378a, false)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (AccountDetailsQuery.OnMyAccountContactDetails) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/AccountDetailsQuery_ResponseAdapter$OnMyAccountFooter;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnMyAccountFooter;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnMyAccountFooter implements Adapter<AccountDetailsQuery.OnMyAccountFooter> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19373a = CollectionsKt.Q("button");

        public static AccountDetailsQuery.OnMyAccountFooter a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            AccountDetailsQuery.Button button = null;
            while (reader.o2(f19373a) == 0) {
                button = (AccountDetailsQuery.Button) Adapters.c(Button.f19347a, false).fromJson(reader, customScalarAdapters);
            }
            if (button != null) {
                return new AccountDetailsQuery.OnMyAccountFooter(button);
            }
            Assertions.a(reader, "button");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AccountDetailsQuery.OnMyAccountFooter value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("button");
            Adapters.c(Button.f19347a, false).toJson(writer, customScalarAdapters, value.f19330a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (AccountDetailsQuery.OnMyAccountFooter) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/AccountDetailsQuery_ResponseAdapter$OnMyAccountPersonalDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnMyAccountPersonalDetails;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnMyAccountPersonalDetails implements Adapter<AccountDetailsQuery.OnMyAccountPersonalDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19374a = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "rowItems");

        public static AccountDetailsQuery.OnMyAccountPersonalDetails a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f19374a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(RowItem.f19376a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new AccountDetailsQuery.OnMyAccountPersonalDetails(str, str2, arrayListFromJson);
            }
            Assertions.a(reader, "rowItems");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AccountDetailsQuery.OnMyAccountPersonalDetails value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19331a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("rowItems");
            Adapters.a(Adapters.c(RowItem.f19376a, false)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (AccountDetailsQuery.OnMyAccountPersonalDetails) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/AccountDetailsQuery_ResponseAdapter$OnMyAccountPreferences;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnMyAccountPreferences;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnMyAccountPreferences implements Adapter<AccountDetailsQuery.OnMyAccountPreferences> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19375a = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "rowItems");

        public static AccountDetailsQuery.OnMyAccountPreferences a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f19375a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(RowItem3.f19379a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new AccountDetailsQuery.OnMyAccountPreferences(str, str2, arrayListFromJson);
            }
            Assertions.a(reader, "rowItems");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AccountDetailsQuery.OnMyAccountPreferences value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19332a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("rowItems");
            Adapters.a(Adapters.c(RowItem3.f19379a, false)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (AccountDetailsQuery.OnMyAccountPreferences) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/AccountDetailsQuery_ResponseAdapter$RowItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/AccountDetailsQuery$RowItem;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RowItem implements Adapter<AccountDetailsQuery.RowItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final RowItem f19376a = new RowItem();
        public static final List b = CollectionsKt.R(lqlqqlq.mmm006Dm006Dm, AnnotatedPrivateKey.LABEL, "leadingAsset", "overlineText", "trailingAsset");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            AccountDetailsQuery.LeadingAsset leadingAsset = null;
            String str3 = null;
            AccountDetailsQuery.TrailingAsset trailingAsset = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    leadingAsset = (AccountDetailsQuery.LeadingAsset) Adapters.b(Adapters.c(LeadingAsset.f19351a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    trailingAsset = (AccountDetailsQuery.TrailingAsset) Adapters.b(Adapters.c(TrailingAsset.f19380a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str2 != null) {
                return new AccountDetailsQuery.RowItem(str, str2, leadingAsset, str3, trailingAsset);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountDetailsQuery.RowItem value = (AccountDetailsQuery.RowItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f19333a);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("leadingAsset");
            Adapters.b(Adapters.c(LeadingAsset.f19351a, true)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("overlineText");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("trailingAsset");
            Adapters.b(Adapters.c(TrailingAsset.f19380a, true)).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/AccountDetailsQuery_ResponseAdapter$RowItem1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/AccountDetailsQuery$RowItem1;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RowItem1 implements Adapter<AccountDetailsQuery.RowItem1> {

        /* renamed from: a, reason: collision with root package name */
        public static final RowItem1 f19377a = new RowItem1();
        public static final List b = CollectionsKt.R(lqlqqlq.mmm006Dm006Dm, AnnotatedPrivateKey.LABEL, "leadingAsset", "overlineText", "trailingAsset");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            AccountDetailsQuery.LeadingAsset1 leadingAsset1 = null;
            String str3 = null;
            AccountDetailsQuery.TrailingAsset1 trailingAsset1 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    leadingAsset1 = (AccountDetailsQuery.LeadingAsset1) Adapters.b(Adapters.c(LeadingAsset1.f19352a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    trailingAsset1 = (AccountDetailsQuery.TrailingAsset1) Adapters.b(Adapters.c(TrailingAsset1.f19381a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str2 != null) {
                return new AccountDetailsQuery.RowItem1(str, str2, leadingAsset1, str3, trailingAsset1);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountDetailsQuery.RowItem1 value = (AccountDetailsQuery.RowItem1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f19334a);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("leadingAsset");
            Adapters.b(Adapters.c(LeadingAsset1.f19352a, true)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("overlineText");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("trailingAsset");
            Adapters.b(Adapters.c(TrailingAsset1.f19381a, true)).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/AccountDetailsQuery_ResponseAdapter$RowItem2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/AccountDetailsQuery$RowItem2;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RowItem2 implements Adapter<AccountDetailsQuery.RowItem2> {

        /* renamed from: a, reason: collision with root package name */
        public static final RowItem2 f19378a = new RowItem2();
        public static final List b = CollectionsKt.R(lqlqqlq.mmm006Dm006Dm, AnnotatedPrivateKey.LABEL, "leadingAsset", "overlineText", "trailingAsset");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            AccountDetailsQuery.LeadingAsset2 leadingAsset2 = null;
            String str3 = null;
            AccountDetailsQuery.TrailingAsset2 trailingAsset2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    leadingAsset2 = (AccountDetailsQuery.LeadingAsset2) Adapters.b(Adapters.c(LeadingAsset2.f19353a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    trailingAsset2 = (AccountDetailsQuery.TrailingAsset2) Adapters.b(Adapters.c(TrailingAsset2.f19382a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str2 != null) {
                return new AccountDetailsQuery.RowItem2(str, str2, leadingAsset2, str3, trailingAsset2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountDetailsQuery.RowItem2 value = (AccountDetailsQuery.RowItem2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f19335a);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("leadingAsset");
            Adapters.b(Adapters.c(LeadingAsset2.f19353a, true)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("overlineText");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("trailingAsset");
            Adapters.b(Adapters.c(TrailingAsset2.f19382a, true)).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/AccountDetailsQuery_ResponseAdapter$RowItem3;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/AccountDetailsQuery$RowItem3;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RowItem3 implements Adapter<AccountDetailsQuery.RowItem3> {

        /* renamed from: a, reason: collision with root package name */
        public static final RowItem3 f19379a = new RowItem3();
        public static final List b = CollectionsKt.R(lqlqqlq.mmm006Dm006Dm, AnnotatedPrivateKey.LABEL, "leadingAsset", "overlineText", "trailingAsset");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            AccountDetailsQuery.LeadingAsset3 leadingAsset3 = null;
            String str3 = null;
            AccountDetailsQuery.TrailingAsset3 trailingAsset3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    leadingAsset3 = (AccountDetailsQuery.LeadingAsset3) Adapters.b(Adapters.c(LeadingAsset3.f19354a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    trailingAsset3 = (AccountDetailsQuery.TrailingAsset3) Adapters.b(Adapters.c(TrailingAsset3.f19383a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str2 != null) {
                return new AccountDetailsQuery.RowItem3(str, str2, leadingAsset3, str3, trailingAsset3);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountDetailsQuery.RowItem3 value = (AccountDetailsQuery.RowItem3) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f19336a);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("leadingAsset");
            Adapters.b(Adapters.c(LeadingAsset3.f19354a, true)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("overlineText");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("trailingAsset");
            Adapters.b(Adapters.c(TrailingAsset3.f19383a, true)).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/AccountDetailsQuery_ResponseAdapter$TrailingAsset;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/AccountDetailsQuery$TrailingAsset;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TrailingAsset implements Adapter<AccountDetailsQuery.TrailingAsset> {

        /* renamed from: a, reason: collision with root package name */
        public static final TrailingAsset f19380a = new TrailingAsset();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            AccountDetailsQuery.OnHostedIcon1 onHostedIcon1A;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            AccountDetailsQuery.OnCoreIcon1 onCoreIcon1A = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("HostedIcon"))) {
                reader.o();
                onHostedIcon1A = OnHostedIcon1.a(reader, customScalarAdapters);
            } else {
                onHostedIcon1A = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CoreIcon"))) {
                reader.o();
                onCoreIcon1A = OnCoreIcon1.a(reader, customScalarAdapters);
            }
            return new AccountDetailsQuery.TrailingAsset(str, onHostedIcon1A, onCoreIcon1A);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountDetailsQuery.TrailingAsset value = (AccountDetailsQuery.TrailingAsset) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19337a);
            AccountDetailsQuery.OnHostedIcon1 onHostedIcon1 = value.b;
            if (onHostedIcon1 != null) {
                OnHostedIcon1.b(writer, customScalarAdapters, onHostedIcon1);
            }
            AccountDetailsQuery.OnCoreIcon1 onCoreIcon1 = value.c;
            if (onCoreIcon1 != null) {
                OnCoreIcon1.b(writer, customScalarAdapters, onCoreIcon1);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/AccountDetailsQuery_ResponseAdapter$TrailingAsset1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/AccountDetailsQuery$TrailingAsset1;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TrailingAsset1 implements Adapter<AccountDetailsQuery.TrailingAsset1> {

        /* renamed from: a, reason: collision with root package name */
        public static final TrailingAsset1 f19381a = new TrailingAsset1();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            AccountDetailsQuery.OnHostedIcon3 onHostedIcon3A;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            AccountDetailsQuery.OnCoreIcon3 onCoreIcon3A = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("HostedIcon"))) {
                reader.o();
                onHostedIcon3A = OnHostedIcon3.a(reader, customScalarAdapters);
            } else {
                onHostedIcon3A = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CoreIcon"))) {
                reader.o();
                onCoreIcon3A = OnCoreIcon3.a(reader, customScalarAdapters);
            }
            return new AccountDetailsQuery.TrailingAsset1(str, onHostedIcon3A, onCoreIcon3A);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountDetailsQuery.TrailingAsset1 value = (AccountDetailsQuery.TrailingAsset1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19338a);
            AccountDetailsQuery.OnHostedIcon3 onHostedIcon3 = value.b;
            if (onHostedIcon3 != null) {
                OnHostedIcon3.b(writer, customScalarAdapters, onHostedIcon3);
            }
            AccountDetailsQuery.OnCoreIcon3 onCoreIcon3 = value.c;
            if (onCoreIcon3 != null) {
                OnCoreIcon3.b(writer, customScalarAdapters, onCoreIcon3);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/AccountDetailsQuery_ResponseAdapter$TrailingAsset2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/AccountDetailsQuery$TrailingAsset2;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TrailingAsset2 implements Adapter<AccountDetailsQuery.TrailingAsset2> {

        /* renamed from: a, reason: collision with root package name */
        public static final TrailingAsset2 f19382a = new TrailingAsset2();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            AccountDetailsQuery.OnHostedIcon5 onHostedIcon5A;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            AccountDetailsQuery.OnCoreIcon5 onCoreIcon5A = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("HostedIcon"))) {
                reader.o();
                onHostedIcon5A = OnHostedIcon5.a(reader, customScalarAdapters);
            } else {
                onHostedIcon5A = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CoreIcon"))) {
                reader.o();
                onCoreIcon5A = OnCoreIcon5.a(reader, customScalarAdapters);
            }
            return new AccountDetailsQuery.TrailingAsset2(str, onHostedIcon5A, onCoreIcon5A);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountDetailsQuery.TrailingAsset2 value = (AccountDetailsQuery.TrailingAsset2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19339a);
            AccountDetailsQuery.OnHostedIcon5 onHostedIcon5 = value.b;
            if (onHostedIcon5 != null) {
                OnHostedIcon5.b(writer, customScalarAdapters, onHostedIcon5);
            }
            AccountDetailsQuery.OnCoreIcon5 onCoreIcon5 = value.c;
            if (onCoreIcon5 != null) {
                OnCoreIcon5.b(writer, customScalarAdapters, onCoreIcon5);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/AccountDetailsQuery_ResponseAdapter$TrailingAsset3;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/AccountDetailsQuery$TrailingAsset3;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TrailingAsset3 implements Adapter<AccountDetailsQuery.TrailingAsset3> {

        /* renamed from: a, reason: collision with root package name */
        public static final TrailingAsset3 f19383a = new TrailingAsset3();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            AccountDetailsQuery.OnHostedIcon7 onHostedIcon7A;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            AccountDetailsQuery.OnCoreIcon7 onCoreIcon7A = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("HostedIcon"))) {
                reader.o();
                onHostedIcon7A = OnHostedIcon7.a(reader, customScalarAdapters);
            } else {
                onHostedIcon7A = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CoreIcon"))) {
                reader.o();
                onCoreIcon7A = OnCoreIcon7.a(reader, customScalarAdapters);
            }
            return new AccountDetailsQuery.TrailingAsset3(str, onHostedIcon7A, onCoreIcon7A);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AccountDetailsQuery.TrailingAsset3 value = (AccountDetailsQuery.TrailingAsset3) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19340a);
            AccountDetailsQuery.OnHostedIcon7 onHostedIcon7 = value.b;
            if (onHostedIcon7 != null) {
                OnHostedIcon7.b(writer, customScalarAdapters, onHostedIcon7);
            }
            AccountDetailsQuery.OnCoreIcon7 onCoreIcon7 = value.c;
            if (onCoreIcon7 != null) {
                OnCoreIcon7.b(writer, customScalarAdapters, onCoreIcon7);
            }
        }
    }
}
