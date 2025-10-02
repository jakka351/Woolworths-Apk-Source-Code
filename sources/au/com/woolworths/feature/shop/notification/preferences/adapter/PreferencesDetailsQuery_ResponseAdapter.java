package au.com.woolworths.feature.shop.notification.preferences.adapter;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.shop.notification.preferences.PreferencesDetailsQuery;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/adapter/PreferencesDetailsQuery_ResponseAdapter;", "", "Data", "Preferences", "Detail", "OnPreferenceText", "OnPreferenceToggleGroup", "Toggle", "Analytics", "Preview", "Entry", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PreferencesDetailsQuery_ResponseAdapter {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/adapter/PreferencesDetailsQuery_ResponseAdapter$Analytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/notification/preferences/PreferencesDetailsQuery$Analytics;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics implements Adapter<PreferencesDetailsQuery.Analytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics f7915a = new Analytics();
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
                return new PreferencesDetailsQuery.Analytics(str);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PreferencesDetailsQuery.Analytics value = (PreferencesDetailsQuery.Analytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f7892a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/adapter/PreferencesDetailsQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/notification/preferences/PreferencesDetailsQuery$Data;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<PreferencesDetailsQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f7916a = new Data();
        public static final List b = CollectionsKt.Q("preferences");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            PreferencesDetailsQuery.Preferences preferences = null;
            while (reader.o2(b) == 0) {
                preferences = (PreferencesDetailsQuery.Preferences) Adapters.b(Adapters.c(Preferences.f7921a, false)).fromJson(reader, customScalarAdapters);
            }
            return new PreferencesDetailsQuery.Data(preferences);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PreferencesDetailsQuery.Data value = (PreferencesDetailsQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("preferences");
            Adapters.b(Adapters.c(Preferences.f7921a, false)).toJson(writer, customScalarAdapters, value.f7893a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/adapter/PreferencesDetailsQuery_ResponseAdapter$Detail;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/notification/preferences/PreferencesDetailsQuery$Detail;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Detail implements Adapter<PreferencesDetailsQuery.Detail> {

        /* renamed from: a, reason: collision with root package name */
        public static final Detail f7917a = new Detail();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            PreferencesDetailsQuery.OnPreferenceText onPreferenceTextA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            PreferencesDetailsQuery.OnPreferenceToggleGroup onPreferenceToggleGroupA = null;
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
            return new PreferencesDetailsQuery.Detail(str, onPreferenceTextA, onPreferenceToggleGroupA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PreferencesDetailsQuery.Detail value = (PreferencesDetailsQuery.Detail) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f7894a);
            PreferencesDetailsQuery.OnPreferenceText onPreferenceText = value.b;
            if (onPreferenceText != null) {
                OnPreferenceText.b(writer, customScalarAdapters, onPreferenceText);
            }
            PreferencesDetailsQuery.OnPreferenceToggleGroup onPreferenceToggleGroup = value.c;
            if (onPreferenceToggleGroup != null) {
                OnPreferenceToggleGroup.b(writer, customScalarAdapters, onPreferenceToggleGroup);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/adapter/PreferencesDetailsQuery_ResponseAdapter$Entry;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/notification/preferences/PreferencesDetailsQuery$Entry;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Entry implements Adapter<PreferencesDetailsQuery.Entry> {

        /* renamed from: a, reason: collision with root package name */
        public static final Entry f7918a = new Entry();
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
                return new PreferencesDetailsQuery.Entry(str, str2, str3);
            }
            Assertions.a(reader, "imageUrl");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PreferencesDetailsQuery.Entry value = (PreferencesDetailsQuery.Entry) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f7895a);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("altText");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/adapter/PreferencesDetailsQuery_ResponseAdapter$OnPreferenceText;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/notification/preferences/PreferencesDetailsQuery$OnPreferenceText;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnPreferenceText implements Adapter<PreferencesDetailsQuery.OnPreferenceText> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f7919a = CollectionsKt.R("__typename", "body", "altText");

        public static PreferencesDetailsQuery.OnPreferenceText a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(f7919a);
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
                return new PreferencesDetailsQuery.OnPreferenceText(str, str2, str3);
            }
            Assertions.a(reader, "body");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, PreferencesDetailsQuery.OnPreferenceText value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f7896a);
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
            b(jsonWriter, customScalarAdapters, (PreferencesDetailsQuery.OnPreferenceText) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/adapter/PreferencesDetailsQuery_ResponseAdapter$OnPreferenceToggleGroup;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/notification/preferences/PreferencesDetailsQuery$OnPreferenceToggleGroup;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnPreferenceToggleGroup implements Adapter<PreferencesDetailsQuery.OnPreferenceToggleGroup> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f7920a = CollectionsKt.R("__typename", "groupTitle", lqlqqlq.mmm006Dm006Dm, "toggles");

        public static PreferencesDetailsQuery.OnPreferenceToggleGroup a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f7920a);
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
                    arrayListFromJson = Adapters.a(Adapters.c(Toggle.f7923a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new PreferencesDetailsQuery.OnPreferenceToggleGroup(str, str2, str3, arrayListFromJson);
            }
            Assertions.a(reader, "toggles");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, PreferencesDetailsQuery.OnPreferenceToggleGroup value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f7897a);
            writer.F1("groupTitle");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("toggles");
            Adapters.a(Adapters.c(Toggle.f7923a, false)).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (PreferencesDetailsQuery.OnPreferenceToggleGroup) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/adapter/PreferencesDetailsQuery_ResponseAdapter$Preferences;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/notification/preferences/PreferencesDetailsQuery$Preferences;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Preferences implements Adapter<PreferencesDetailsQuery.Preferences> {

        /* renamed from: a, reason: collision with root package name */
        public static final Preferences f7921a = new Preferences();
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
                    arrayListFromJson = Adapters.a(Adapters.c(Detail.f7917a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new PreferencesDetailsQuery.Preferences(str, str2, arrayListFromJson);
            }
            Assertions.a(reader, ErrorBundle.DETAIL_ENTRY);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PreferencesDetailsQuery.Preferences value = (PreferencesDetailsQuery.Preferences) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f7898a);
            writer.F1("title");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1(ErrorBundle.DETAIL_ENTRY);
            Adapters.a(Adapters.c(Detail.f7917a, true)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/adapter/PreferencesDetailsQuery_ResponseAdapter$Preview;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/notification/preferences/PreferencesDetailsQuery$Preview;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Preview implements Adapter<PreferencesDetailsQuery.Preview> {

        /* renamed from: a, reason: collision with root package name */
        public static final Preview f7922a = new Preview();
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
                    arrayListFromJson = Adapters.a(Adapters.c(Entry.f7918a, false)).fromJson(reader, customScalarAdapters);
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
                return new PreferencesDetailsQuery.Preview(str, str2, str3, arrayListFromJson);
            }
            Assertions.a(reader, "entries");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PreferencesDetailsQuery.Preview value = (PreferencesDetailsQuery.Preview) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f7899a);
            writer.F1("badge");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("entries");
            Adapters.a(Adapters.c(Entry.f7918a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("footer");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/adapter/PreferencesDetailsQuery_ResponseAdapter$Toggle;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/notification/preferences/PreferencesDetailsQuery$Toggle;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Toggle implements Adapter<PreferencesDetailsQuery.Toggle> {

        /* renamed from: a, reason: collision with root package name */
        public static final Toggle f7923a = new Toggle();
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
            PreferencesDetailsQuery.Analytics analytics = null;
            String str5 = null;
            String str6 = null;
            PreferencesDetailsQuery.Preview preview = null;
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
                        analytics = (PreferencesDetailsQuery.Analytics) Adapters.c(Analytics.f7915a, false).fromJson(reader, customScalarAdapters);
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
                        preview = (PreferencesDetailsQuery.Preview) Adapters.b(Adapters.c(Preview.f7922a, false)).fromJson(reader, customScalarAdapters);
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
                            return new PreferencesDetailsQuery.Toggle(str, str2, str3, zBooleanValue, str4, analytics, str5, str6, preview, str7);
                        }
                        Assertions.a(reader, "analytics");
                        throw null;
                }
                bool2 = bool;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PreferencesDetailsQuery.Toggle value = (PreferencesDetailsQuery.Toggle) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f7900a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("value");
            d.B(value.d, Adapters.f, writer, customScalarAdapters, "id");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("analytics");
            Adapters.c(Analytics.f7915a, false).toJson(writer, customScalarAdapters, value.f);
            writer.F1("iconUrl");
            nullableAdapter.toJson(writer, customScalarAdapters, value.g);
            writer.F1("altText");
            nullableAdapter.toJson(writer, customScalarAdapters, value.h);
            writer.F1("preview");
            Adapters.b(Adapters.c(Preview.f7922a, false)).toJson(writer, customScalarAdapters, value.i);
            writer.F1("footer");
            nullableAdapter.toJson(writer, customScalarAdapters, value.j);
        }
    }
}
