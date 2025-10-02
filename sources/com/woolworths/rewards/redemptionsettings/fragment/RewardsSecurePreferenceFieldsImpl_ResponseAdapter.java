package com.woolworths.rewards.redemptionsettings.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.woolworths.rewards.redemptionsettings.fragment.RewardsSecurePreferenceFields;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/fragment/RewardsSecurePreferenceFieldsImpl_ResponseAdapter;", "", "RewardsSecurePreferenceFields", "InfoItem", "SecurePreference", "Analytics", "LoadingState", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RewardsSecurePreferenceFieldsImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/fragment/RewardsSecurePreferenceFieldsImpl_ResponseAdapter$Analytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/redemptionsettings/fragment/RewardsSecurePreferenceFields$Analytics;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics implements Adapter<RewardsSecurePreferenceFields.Analytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics f21120a = new Analytics();
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
                return new RewardsSecurePreferenceFields.Analytics(str);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsSecurePreferenceFields.Analytics value = (RewardsSecurePreferenceFields.Analytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21116a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/fragment/RewardsSecurePreferenceFieldsImpl_ResponseAdapter$InfoItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/redemptionsettings/fragment/RewardsSecurePreferenceFields$InfoItem;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InfoItem implements Adapter<RewardsSecurePreferenceFields.InfoItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final InfoItem f21121a = new InfoItem();
        public static final List b = CollectionsKt.R("bulletText", "isEmoji", "itemTitle", "markdownDescription");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Boolean bool = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new RewardsSecurePreferenceFields.InfoItem(str, bool, str2, str3);
            }
            Assertions.a(reader, "bulletText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsSecurePreferenceFields.InfoItem value = (RewardsSecurePreferenceFields.InfoItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("bulletText");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21117a);
            writer.F1("isEmoji");
            Adapters.l.toJson(writer, customScalarAdapters, value.b);
            writer.F1("itemTitle");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("markdownDescription");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/fragment/RewardsSecurePreferenceFieldsImpl_ResponseAdapter$LoadingState;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/redemptionsettings/fragment/RewardsSecurePreferenceFields$LoadingState;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LoadingState implements Adapter<RewardsSecurePreferenceFields.LoadingState> {

        /* renamed from: a, reason: collision with root package name */
        public static final LoadingState f21122a = new LoadingState();
        public static final List b = CollectionsKt.R("title", AnnotatedPrivateKey.LABEL);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        return new RewardsSecurePreferenceFields.LoadingState(str, str2);
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsSecurePreferenceFields.LoadingState value = (RewardsSecurePreferenceFields.LoadingState) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f21118a);
            writer.F1(AnnotatedPrivateKey.LABEL);
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/fragment/RewardsSecurePreferenceFieldsImpl_ResponseAdapter$RewardsSecurePreferenceFields;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/redemptionsettings/fragment/RewardsSecurePreferenceFields;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsSecurePreferenceFields implements Adapter<com.woolworths.rewards.redemptionsettings.fragment.RewardsSecurePreferenceFields> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21123a = CollectionsKt.R("title", ErrorBundle.SUMMARY_ENTRY, "infoItems", "securePreference", "loadingState");

        public static com.woolworths.rewards.redemptionsettings.fragment.RewardsSecurePreferenceFields a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            RewardsSecurePreferenceFields.SecurePreference securePreference = null;
            RewardsSecurePreferenceFields.LoadingState loadingState = null;
            while (true) {
                int iO2 = reader.o2(f21123a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    arrayListFromJson = Adapters.a(Adapters.c(InfoItem.f21121a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    securePreference = (RewardsSecurePreferenceFields.SecurePreference) Adapters.c(SecurePreference.f21124a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    loadingState = (RewardsSecurePreferenceFields.LoadingState) Adapters.c(LoadingState.f21122a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, ErrorBundle.SUMMARY_ENTRY);
                throw null;
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "infoItems");
                throw null;
            }
            if (securePreference == null) {
                Assertions.a(reader, "securePreference");
                throw null;
            }
            if (loadingState != null) {
                return new com.woolworths.rewards.redemptionsettings.fragment.RewardsSecurePreferenceFields(str, str2, arrayListFromJson, securePreference, loadingState);
            }
            Assertions.a(reader, "loadingState");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, com.woolworths.rewards.redemptionsettings.fragment.RewardsSecurePreferenceFields value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21115a);
            writer.F1(ErrorBundle.SUMMARY_ENTRY);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("infoItems");
            Adapters.a(Adapters.c(InfoItem.f21121a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("securePreference");
            Adapters.c(SecurePreference.f21124a, false).toJson(writer, customScalarAdapters, value.d);
            writer.F1("loadingState");
            Adapters.c(LoadingState.f21122a, false).toJson(writer, customScalarAdapters, value.e);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (com.woolworths.rewards.redemptionsettings.fragment.RewardsSecurePreferenceFields) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/fragment/RewardsSecurePreferenceFieldsImpl_ResponseAdapter$SecurePreference;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/redemptionsettings/fragment/RewardsSecurePreferenceFields$SecurePreference;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SecurePreference implements Adapter<RewardsSecurePreferenceFields.SecurePreference> {

        /* renamed from: a, reason: collision with root package name */
        public static final SecurePreference f21124a = new SecurePreference();
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
            RewardsSecurePreferenceFields.Analytics analytics = null;
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
                        analytics = (RewardsSecurePreferenceFields.Analytics) Adapters.c(Analytics.f21120a, false).fromJson(reader, customScalarAdapters);
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
                            return new RewardsSecurePreferenceFields.SecurePreference(str, str2, zBooleanValue, str3, str4, analytics, str5);
                        }
                        Assertions.a(reader, "analytics");
                        throw null;
                }
                bool2 = bool;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsSecurePreferenceFields.SecurePreference value = (RewardsSecurePreferenceFields.SecurePreference) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21119a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("value");
            d.B(value.c, Adapters.f, writer, customScalarAdapters, "id");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("altText");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("analytics");
            Adapters.c(Analytics.f21120a, false).toJson(writer, customScalarAdapters, value.f);
            writer.F1("iconUrl");
            nullableAdapter.toJson(writer, customScalarAdapters, value.g);
        }
    }
}
