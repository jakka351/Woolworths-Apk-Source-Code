package au.com.woolworths.feature.shop.notification.preferences.adapter;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.shop.notification.preferences.UpdatePreferencesMutation;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/adapter/UpdatePreferencesMutation_ResponseAdapter;", "", "Data", "UpdatePreference", "Detail", "OnPreferenceText", "OnPreferenceToggleGroup", "Toggle", "Analytics", "Preview", "Entry", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UpdatePreferencesMutation_ResponseAdapter {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/adapter/UpdatePreferencesMutation_ResponseAdapter$Analytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/notification/preferences/UpdatePreferencesMutation$Analytics;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics implements Adapter<UpdatePreferencesMutation.Analytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics f7924a = new Analytics();
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
                return new UpdatePreferencesMutation.Analytics(str);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdatePreferencesMutation.Analytics value = (UpdatePreferencesMutation.Analytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f7906a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/adapter/UpdatePreferencesMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/notification/preferences/UpdatePreferencesMutation$Data;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<UpdatePreferencesMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f7925a = new Data();
        public static final List b = CollectionsKt.Q("updatePreference");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            UpdatePreferencesMutation.UpdatePreference updatePreference = null;
            while (reader.o2(b) == 0) {
                updatePreference = (UpdatePreferencesMutation.UpdatePreference) Adapters.b(Adapters.c(UpdatePreference.f7932a, false)).fromJson(reader, customScalarAdapters);
            }
            return new UpdatePreferencesMutation.Data(updatePreference);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdatePreferencesMutation.Data value = (UpdatePreferencesMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("updatePreference");
            Adapters.b(Adapters.c(UpdatePreference.f7932a, false)).toJson(writer, customScalarAdapters, value.f7907a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/adapter/UpdatePreferencesMutation_ResponseAdapter$Detail;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/notification/preferences/UpdatePreferencesMutation$Detail;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Detail implements Adapter<UpdatePreferencesMutation.Detail> {

        /* renamed from: a, reason: collision with root package name */
        public static final Detail f7926a = new Detail();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            UpdatePreferencesMutation.OnPreferenceText onPreferenceTextA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            UpdatePreferencesMutation.OnPreferenceToggleGroup onPreferenceToggleGroupA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("PreferenceText"))) {
                reader.o();
                onPreferenceTextA = OnPreferenceText.a(reader, customScalarAdapters);
            } else {
                onPreferenceTextA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("PreferenceToggleGroup"))) {
                reader.o();
                onPreferenceToggleGroupA = OnPreferenceToggleGroup.a(reader, customScalarAdapters);
            }
            return new UpdatePreferencesMutation.Detail(str, onPreferenceTextA, onPreferenceToggleGroupA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdatePreferencesMutation.Detail value = (UpdatePreferencesMutation.Detail) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f7908a);
            UpdatePreferencesMutation.OnPreferenceText onPreferenceText = value.b;
            if (onPreferenceText != null) {
                OnPreferenceText.b(writer, customScalarAdapters, onPreferenceText);
            }
            UpdatePreferencesMutation.OnPreferenceToggleGroup onPreferenceToggleGroup = value.c;
            if (onPreferenceToggleGroup != null) {
                OnPreferenceToggleGroup.b(writer, customScalarAdapters, onPreferenceToggleGroup);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/adapter/UpdatePreferencesMutation_ResponseAdapter$Entry;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/notification/preferences/UpdatePreferencesMutation$Entry;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Entry implements Adapter<UpdatePreferencesMutation.Entry> {

        /* renamed from: a, reason: collision with root package name */
        public static final Entry f7927a = new Entry();
        public static final List b = CollectionsKt.R("__typename", "imageUrl", "altText");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
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
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 != null) {
                return new UpdatePreferencesMutation.Entry(str, str2, str3);
            }
            Assertions.a(reader, "imageUrl");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdatePreferencesMutation.Entry value = (UpdatePreferencesMutation.Entry) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f7909a);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("altText");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/adapter/UpdatePreferencesMutation_ResponseAdapter$OnPreferenceText;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/notification/preferences/UpdatePreferencesMutation$OnPreferenceText;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnPreferenceText implements Adapter<UpdatePreferencesMutation.OnPreferenceText> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f7928a = CollectionsKt.R("__typename", "body", "altText");

        public static UpdatePreferencesMutation.OnPreferenceText a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(f7928a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 != null) {
                return new UpdatePreferencesMutation.OnPreferenceText(str, str2, str3);
            }
            Assertions.a(reader, "body");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, UpdatePreferencesMutation.OnPreferenceText value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f7910a);
            writer.F1("body");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("altText");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (UpdatePreferencesMutation.OnPreferenceText) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/adapter/UpdatePreferencesMutation_ResponseAdapter$OnPreferenceToggleGroup;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/notification/preferences/UpdatePreferencesMutation$OnPreferenceToggleGroup;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnPreferenceToggleGroup implements Adapter<UpdatePreferencesMutation.OnPreferenceToggleGroup> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f7929a = CollectionsKt.R("__typename", "groupTitle", lqlqqlq.mmm006Dm006Dm, "toggles");

        public static UpdatePreferencesMutation.OnPreferenceToggleGroup a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f7929a);
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
                    arrayListFromJson = Adapters.a(Adapters.c(Toggle.f7931a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new UpdatePreferencesMutation.OnPreferenceToggleGroup(str, str2, str3, arrayListFromJson);
            }
            Assertions.a(reader, "toggles");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, UpdatePreferencesMutation.OnPreferenceToggleGroup value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f7911a);
            writer.F1("groupTitle");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("toggles");
            Adapters.a(Adapters.c(Toggle.f7931a, false)).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (UpdatePreferencesMutation.OnPreferenceToggleGroup) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/adapter/UpdatePreferencesMutation_ResponseAdapter$Preview;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/notification/preferences/UpdatePreferencesMutation$Preview;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Preview implements Adapter<UpdatePreferencesMutation.Preview> {

        /* renamed from: a, reason: collision with root package name */
        public static final Preview f7930a = new Preview();
        public static final List b = CollectionsKt.R("__typename", "badge", "entries", "footer");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    arrayListFromJson = Adapters.a(Adapters.c(Entry.f7927a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new UpdatePreferencesMutation.Preview(str, str2, str3, arrayListFromJson);
            }
            Assertions.a(reader, "entries");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdatePreferencesMutation.Preview value = (UpdatePreferencesMutation.Preview) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f7912a);
            writer.F1("badge");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("entries");
            Adapters.a(Adapters.c(Entry.f7927a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("footer");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/adapter/UpdatePreferencesMutation_ResponseAdapter$Toggle;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/notification/preferences/UpdatePreferencesMutation$Toggle;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Toggle implements Adapter<UpdatePreferencesMutation.Toggle> {

        /* renamed from: a, reason: collision with root package name */
        public static final Toggle f7931a = new Toggle();
        public static final List b = CollectionsKt.R("__typename", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "value", "id", "analytics", "iconUrl", "altText", "preview", "footer");

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
            UpdatePreferencesMutation.Analytics analytics = null;
            String str5 = null;
            String str6 = null;
            UpdatePreferencesMutation.Preview preview = null;
            String str7 = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        bool = bool2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        bool = bool2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        bool = bool2;
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 4:
                        bool = bool2;
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        bool = bool2;
                        analytics = (UpdatePreferencesMutation.Analytics) Adapters.c(Analytics.f7924a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        bool = bool2;
                        str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        bool = bool2;
                        str6 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        bool = bool2;
                        preview = (UpdatePreferencesMutation.Preview) Adapters.b(Adapters.c(Preview.f7930a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        bool = bool2;
                        str7 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Boolean bool3 = bool2;
                        if (str == null) {
                            Assertions.a(reader, "__typename");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (bool3 == null) {
                            Assertions.a(reader, "value");
                            throw null;
                        }
                        boolean zBooleanValue = bool3.booleanValue();
                        if (str4 == null) {
                            Assertions.a(reader, "id");
                            throw null;
                        }
                        if (analytics != null) {
                            return new UpdatePreferencesMutation.Toggle(str, str2, str3, zBooleanValue, str4, analytics, str5, str6, preview, str7);
                        }
                        Assertions.a(reader, "analytics");
                        throw null;
                }
                bool2 = bool;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdatePreferencesMutation.Toggle value = (UpdatePreferencesMutation.Toggle) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f7913a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("value");
            d.B(value.d, Adapters.f, writer, customScalarAdapters, "id");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("analytics");
            Adapters.c(Analytics.f7924a, false).toJson(writer, customScalarAdapters, value.f);
            writer.F1("iconUrl");
            nullableAdapter.toJson(writer, customScalarAdapters, value.g);
            writer.F1("altText");
            nullableAdapter.toJson(writer, customScalarAdapters, value.h);
            writer.F1("preview");
            Adapters.b(Adapters.c(Preview.f7930a, false)).toJson(writer, customScalarAdapters, value.i);
            writer.F1("footer");
            nullableAdapter.toJson(writer, customScalarAdapters, value.j);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/adapter/UpdatePreferencesMutation_ResponseAdapter$UpdatePreference;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/notification/preferences/UpdatePreferencesMutation$UpdatePreference;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UpdatePreference implements Adapter<UpdatePreferencesMutation.UpdatePreference> {

        /* renamed from: a, reason: collision with root package name */
        public static final UpdatePreference f7932a = new UpdatePreference();
        public static final List b = CollectionsKt.R("__typename", "title", ErrorBundle.DETAIL_ENTRY);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Detail.f7926a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new UpdatePreferencesMutation.UpdatePreference(str, str2, arrayListFromJson);
            }
            Assertions.a(reader, ErrorBundle.DETAIL_ENTRY);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdatePreferencesMutation.UpdatePreference value = (UpdatePreferencesMutation.UpdatePreference) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f7914a);
            writer.F1("title");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1(ErrorBundle.DETAIL_ENTRY);
            Adapters.a(Adapters.c(Detail.f7926a, true)).toJson(writer, customScalarAdapters, value.c);
        }
    }
}
