package com.woolworths.rewards.account.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
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
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.woolworths.rewards.account.PreferenceUpdateMutation;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/woolworths/rewards/account/adapter/PreferenceUpdateMutation_ResponseAdapter;", "", "Data", "UpdatePreference", "Detail", "OnPreferenceDetailsHeader", "OnPreferenceDetailsToggleGroup", "Toggle", "Analytics", "OnPreferenceDetailsText", "OnPreferenceDetailsFooter", "Button", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PreferenceUpdateMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/PreferenceUpdateMutation_ResponseAdapter$Analytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/PreferenceUpdateMutation$Analytics;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics implements Adapter<PreferenceUpdateMutation.Analytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics f20626a = new Analytics();
        public static final List b = CollectionsKt.Q(AnnotatedPrivateKey.LABEL);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new PreferenceUpdateMutation.Analytics(str);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PreferenceUpdateMutation.Analytics value = (PreferenceUpdateMutation.Analytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20553a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/PreferenceUpdateMutation_ResponseAdapter$Button;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/PreferenceUpdateMutation$Button;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Button implements Adapter<PreferenceUpdateMutation.Button> {

        /* renamed from: a, reason: collision with root package name */
        public static final Button f20627a = new Button();
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
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (str2 != null) {
                return new PreferenceUpdateMutation.Button(str, str2);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PreferenceUpdateMutation.Button value = (PreferenceUpdateMutation.Button) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20554a);
            writer.F1("url");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/PreferenceUpdateMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/PreferenceUpdateMutation$Data;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<PreferenceUpdateMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f20628a = new Data();
        public static final List b = CollectionsKt.Q("updatePreference");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            PreferenceUpdateMutation.UpdatePreference updatePreference = null;
            while (reader.o2(b) == 0) {
                updatePreference = (PreferenceUpdateMutation.UpdatePreference) Adapters.b(Adapters.c(UpdatePreference.f20635a, false)).fromJson(reader, customScalarAdapters);
            }
            return new PreferenceUpdateMutation.Data(updatePreference);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PreferenceUpdateMutation.Data value = (PreferenceUpdateMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("updatePreference");
            Adapters.b(Adapters.c(UpdatePreference.f20635a, false)).toJson(writer, customScalarAdapters, value.f20555a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/PreferenceUpdateMutation_ResponseAdapter$Detail;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/PreferenceUpdateMutation$Detail;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Detail implements Adapter<PreferenceUpdateMutation.Detail> {

        /* renamed from: a, reason: collision with root package name */
        public static final Detail f20629a = new Detail();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            PreferenceUpdateMutation.OnPreferenceDetailsHeader onPreferenceDetailsHeaderA;
            PreferenceUpdateMutation.OnPreferenceDetailsToggleGroup onPreferenceDetailsToggleGroupA;
            PreferenceUpdateMutation.OnPreferenceDetailsText onPreferenceDetailsTextA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            PreferenceUpdateMutation.OnPreferenceDetailsFooter onPreferenceDetailsFooterA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("PreferenceDetailsHeader"))) {
                reader.o();
                onPreferenceDetailsHeaderA = OnPreferenceDetailsHeader.a(reader, customScalarAdapters);
            } else {
                onPreferenceDetailsHeaderA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("PreferenceDetailsToggleGroup"))) {
                reader.o();
                onPreferenceDetailsToggleGroupA = OnPreferenceDetailsToggleGroup.a(reader, customScalarAdapters);
            } else {
                onPreferenceDetailsToggleGroupA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("PreferenceDetailsText"))) {
                reader.o();
                onPreferenceDetailsTextA = OnPreferenceDetailsText.a(reader, customScalarAdapters);
            } else {
                onPreferenceDetailsTextA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("PreferenceDetailsFooter"))) {
                reader.o();
                onPreferenceDetailsFooterA = OnPreferenceDetailsFooter.a(reader, customScalarAdapters);
            }
            return new PreferenceUpdateMutation.Detail(str, onPreferenceDetailsHeaderA, onPreferenceDetailsToggleGroupA, onPreferenceDetailsTextA, onPreferenceDetailsFooterA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PreferenceUpdateMutation.Detail value = (PreferenceUpdateMutation.Detail) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20556a);
            PreferenceUpdateMutation.OnPreferenceDetailsHeader onPreferenceDetailsHeader = value.b;
            if (onPreferenceDetailsHeader != null) {
                OnPreferenceDetailsHeader.b(writer, customScalarAdapters, onPreferenceDetailsHeader);
            }
            PreferenceUpdateMutation.OnPreferenceDetailsToggleGroup onPreferenceDetailsToggleGroup = value.c;
            if (onPreferenceDetailsToggleGroup != null) {
                OnPreferenceDetailsToggleGroup.b(writer, customScalarAdapters, onPreferenceDetailsToggleGroup);
            }
            PreferenceUpdateMutation.OnPreferenceDetailsText onPreferenceDetailsText = value.d;
            if (onPreferenceDetailsText != null) {
                OnPreferenceDetailsText.b(writer, customScalarAdapters, onPreferenceDetailsText);
            }
            PreferenceUpdateMutation.OnPreferenceDetailsFooter onPreferenceDetailsFooter = value.e;
            if (onPreferenceDetailsFooter != null) {
                OnPreferenceDetailsFooter.b(writer, customScalarAdapters, onPreferenceDetailsFooter);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/PreferenceUpdateMutation_ResponseAdapter$OnPreferenceDetailsFooter;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/PreferenceUpdateMutation$OnPreferenceDetailsFooter;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnPreferenceDetailsFooter implements Adapter<PreferenceUpdateMutation.OnPreferenceDetailsFooter> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20630a = CollectionsKt.R("body", "button");

        public static PreferenceUpdateMutation.OnPreferenceDetailsFooter a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            PreferenceUpdateMutation.Button button = null;
            while (true) {
                int iO2 = reader.o2(f20630a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        return new PreferenceUpdateMutation.OnPreferenceDetailsFooter(str, button);
                    }
                    button = (PreferenceUpdateMutation.Button) Adapters.b(Adapters.c(Button.f20627a, false)).fromJson(reader, customScalarAdapters);
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, PreferenceUpdateMutation.OnPreferenceDetailsFooter value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("body");
            Adapters.i.toJson(writer, customScalarAdapters, value.f20557a);
            writer.F1("button");
            Adapters.b(Adapters.c(Button.f20627a, false)).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (PreferenceUpdateMutation.OnPreferenceDetailsFooter) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/PreferenceUpdateMutation_ResponseAdapter$OnPreferenceDetailsHeader;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/PreferenceUpdateMutation$OnPreferenceDetailsHeader;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnPreferenceDetailsHeader implements Adapter<PreferenceUpdateMutation.OnPreferenceDetailsHeader> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20631a = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "imageUrl", "body");

        public static PreferenceUpdateMutation.OnPreferenceDetailsHeader a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                int iO2 = reader.o2(f20631a);
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
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new PreferenceUpdateMutation.OnPreferenceDetailsHeader(str, str2, str3, str4);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, PreferenceUpdateMutation.OnPreferenceDetailsHeader value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20558a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("imageUrl");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("body");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (PreferenceUpdateMutation.OnPreferenceDetailsHeader) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/PreferenceUpdateMutation_ResponseAdapter$OnPreferenceDetailsText;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/PreferenceUpdateMutation$OnPreferenceDetailsText;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnPreferenceDetailsText implements Adapter<PreferenceUpdateMutation.OnPreferenceDetailsText> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20632a = CollectionsKt.R("body", "altText");

        public static PreferenceUpdateMutation.OnPreferenceDetailsText a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f20632a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        return new PreferenceUpdateMutation.OnPreferenceDetailsText(str, str2);
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, PreferenceUpdateMutation.OnPreferenceDetailsText value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("body");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f20559a);
            writer.F1("altText");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (PreferenceUpdateMutation.OnPreferenceDetailsText) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/PreferenceUpdateMutation_ResponseAdapter$OnPreferenceDetailsToggleGroup;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/PreferenceUpdateMutation$OnPreferenceDetailsToggleGroup;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnPreferenceDetailsToggleGroup implements Adapter<PreferenceUpdateMutation.OnPreferenceDetailsToggleGroup> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20633a = CollectionsKt.R("groupTitle", lqlqqlq.mmm006Dm006Dm, "toggles");

        public static PreferenceUpdateMutation.OnPreferenceDetailsToggleGroup a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            List list = null;
            while (true) {
                int iO2 = reader.o2(f20633a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        return new PreferenceUpdateMutation.OnPreferenceDetailsToggleGroup(str, str2, list);
                    }
                    list = (List) Adapters.b(Adapters.a(Adapters.b(Adapters.c(Toggle.f20634a, false)))).fromJson(reader, customScalarAdapters);
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, PreferenceUpdateMutation.OnPreferenceDetailsToggleGroup value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("groupTitle");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f20560a);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("toggles");
            Adapters.b(Adapters.a(Adapters.b(Adapters.c(Toggle.f20634a, false)))).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (PreferenceUpdateMutation.OnPreferenceDetailsToggleGroup) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/PreferenceUpdateMutation_ResponseAdapter$Toggle;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/PreferenceUpdateMutation$Toggle;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Toggle implements Adapter<PreferenceUpdateMutation.Toggle> {

        /* renamed from: a, reason: collision with root package name */
        public static final Toggle f20634a = new Toggle();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "value", "id", "altText", "analytics", "iconUrl");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            PreferenceUpdateMutation.Analytics analytics = null;
            String str5 = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        bool = bool2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        bool = bool2;
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 3:
                        bool = bool2;
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        bool = bool2;
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        bool = bool2;
                        analytics = (PreferenceUpdateMutation.Analytics) Adapters.c(Analytics.f20626a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        bool = bool2;
                        str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Boolean bool3 = bool2;
                        if (str == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (bool3 == null) {
                            Assertions.a(reader, "value");
                            throw null;
                        }
                        boolean zBooleanValue = bool3.booleanValue();
                        if (str3 == null) {
                            Assertions.a(reader, "id");
                            throw null;
                        }
                        if (analytics != null) {
                            return new PreferenceUpdateMutation.Toggle(str, str2, zBooleanValue, str3, str4, analytics, str5);
                        }
                        Assertions.a(reader, "analytics");
                        throw null;
                }
                bool2 = bool;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PreferenceUpdateMutation.Toggle value = (PreferenceUpdateMutation.Toggle) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20561a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("value");
            d.B(value.c, Adapters.f, writer, customScalarAdapters, "id");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("altText");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("analytics");
            Adapters.c(Analytics.f20626a, false).toJson(writer, customScalarAdapters, value.f);
            writer.F1("iconUrl");
            nullableAdapter.toJson(writer, customScalarAdapters, value.g);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/PreferenceUpdateMutation_ResponseAdapter$UpdatePreference;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/PreferenceUpdateMutation$UpdatePreference;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UpdatePreference implements Adapter<PreferenceUpdateMutation.UpdatePreference> {

        /* renamed from: a, reason: collision with root package name */
        public static final UpdatePreference f20635a = new UpdatePreference();
        public static final List b = CollectionsKt.R("title", ErrorBundle.DETAIL_ENTRY, "message");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            List list = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    list = (List) Adapters.b(Adapters.a(Adapters.b(Adapters.c(Detail.f20629a, true)))).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        return new PreferenceUpdateMutation.UpdatePreference(str, list, str2);
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PreferenceUpdateMutation.UpdatePreference value = (PreferenceUpdateMutation.UpdatePreference) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f20562a);
            writer.F1(ErrorBundle.DETAIL_ENTRY);
            Adapters.b(Adapters.a(Adapters.b(Adapters.c(Detail.f20629a, true)))).toJson(writer, customScalarAdapters, value.b);
            writer.F1("message");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
        }
    }
}
