package au.com.woolworths.foundation.force.upgrade.shop.adapter;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.foundation.force.upgrade.shop.AppConfigQuery;
import au.com.woolworths.shop.graphql.type.UpgradeType;
import au.com.woolworths.shop.graphql.type.adapter.UpgradeType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.positioningengine.ondevice.ml.MlModel;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/foundation/force/upgrade/shop/adapter/AppConfigQuery_ResponseAdapter;", "", "Data", "Config", "Alert", "OnAppConfigSoftAlert", "OnAppConfigForcedAlert", "force-upgrade-data-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppConfigQuery_ResponseAdapter {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/force/upgrade/shop/adapter/AppConfigQuery_ResponseAdapter$Alert;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/force/upgrade/shop/AppConfigQuery$Alert;", "force-upgrade-data-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Alert implements Adapter<AppConfigQuery.Alert> {

        /* renamed from: a, reason: collision with root package name */
        public static final Alert f8522a = new Alert();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            AppConfigQuery.OnAppConfigSoftAlert onAppConfigSoftAlertA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            AppConfigQuery.OnAppConfigForcedAlert onAppConfigForcedAlertA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("AppConfigSoftAlert"))) {
                reader.o();
                onAppConfigSoftAlertA = OnAppConfigSoftAlert.a(reader, customScalarAdapters);
            } else {
                onAppConfigSoftAlertA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("AppConfigForcedAlert"))) {
                reader.o();
                onAppConfigForcedAlertA = OnAppConfigForcedAlert.a(reader, customScalarAdapters);
            }
            return new AppConfigQuery.Alert(str, onAppConfigSoftAlertA, onAppConfigForcedAlertA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AppConfigQuery.Alert value = (AppConfigQuery.Alert) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f8516a);
            AppConfigQuery.OnAppConfigSoftAlert onAppConfigSoftAlert = value.b;
            if (onAppConfigSoftAlert != null) {
                OnAppConfigSoftAlert.b(writer, customScalarAdapters, onAppConfigSoftAlert);
            }
            AppConfigQuery.OnAppConfigForcedAlert onAppConfigForcedAlert = value.c;
            if (onAppConfigForcedAlert != null) {
                OnAppConfigForcedAlert.b(writer, customScalarAdapters, onAppConfigForcedAlert);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/force/upgrade/shop/adapter/AppConfigQuery_ResponseAdapter$Config;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/force/upgrade/shop/AppConfigQuery$Config;", "force-upgrade-data-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Config implements Adapter<AppConfigQuery.Config> {

        /* renamed from: a, reason: collision with root package name */
        public static final Config f8523a = new Config();
        public static final List b = CollectionsKt.R("upgradeType", "isForcedUpgrade", "alert", "bff");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            UpgradeType upgradeTypeA = null;
            Boolean bool = null;
            AppConfigQuery.Alert alert = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    upgradeTypeA = UpgradeType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    alert = (AppConfigQuery.Alert) Adapters.b(Adapters.c(Alert.f8522a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (upgradeTypeA == null) {
                Assertions.a(reader, "upgradeType");
                throw null;
            }
            if (str != null) {
                return new AppConfigQuery.Config(upgradeTypeA, bool, alert, str);
            }
            Assertions.a(reader, "bff");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AppConfigQuery.Config value = (AppConfigQuery.Config) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("upgradeType");
            writer.v0(value.f8517a.d);
            writer.F1("isForcedUpgrade");
            Adapters.l.toJson(writer, customScalarAdapters, value.b);
            writer.F1("alert");
            Adapters.b(Adapters.c(Alert.f8522a, true)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("bff");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/force/upgrade/shop/adapter/AppConfigQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/force/upgrade/shop/AppConfigQuery$Data;", "force-upgrade-data-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<AppConfigQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f8524a = new Data();
        public static final List b = CollectionsKt.Q(MlModel.MODEL_FILE_SUFFIX);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            AppConfigQuery.Config config = null;
            while (reader.o2(b) == 0) {
                config = (AppConfigQuery.Config) Adapters.c(Config.f8523a, false).fromJson(reader, customScalarAdapters);
            }
            if (config != null) {
                return new AppConfigQuery.Data(config);
            }
            Assertions.a(reader, MlModel.MODEL_FILE_SUFFIX);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AppConfigQuery.Data value = (AppConfigQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(MlModel.MODEL_FILE_SUFFIX);
            Adapters.c(Config.f8523a, false).toJson(writer, customScalarAdapters, value.f8518a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/force/upgrade/shop/adapter/AppConfigQuery_ResponseAdapter$OnAppConfigForcedAlert;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/force/upgrade/shop/AppConfigQuery$OnAppConfigForcedAlert;", "force-upgrade-data-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnAppConfigForcedAlert implements Adapter<AppConfigQuery.OnAppConfigForcedAlert> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f8525a = CollectionsKt.R("title", "message", "primaryActionLabel", "rewardsCardActionLabel");

        public static AppConfigQuery.OnAppConfigForcedAlert a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                int iO2 = reader.o2(f8525a);
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
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "message");
                throw null;
            }
            if (str3 != null) {
                return new AppConfigQuery.OnAppConfigForcedAlert(str, str2, str3, str4);
            }
            Assertions.a(reader, "primaryActionLabel");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AppConfigQuery.OnAppConfigForcedAlert value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f8519a);
            writer.F1("message");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("primaryActionLabel");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("rewardsCardActionLabel");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (AppConfigQuery.OnAppConfigForcedAlert) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/force/upgrade/shop/adapter/AppConfigQuery_ResponseAdapter$OnAppConfigSoftAlert;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/force/upgrade/shop/AppConfigQuery$OnAppConfigSoftAlert;", "force-upgrade-data-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnAppConfigSoftAlert implements Adapter<AppConfigQuery.OnAppConfigSoftAlert> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f8526a = CollectionsKt.R("title", "message", "primaryActionLabel", "secondaryActionLabel");

        public static AppConfigQuery.OnAppConfigSoftAlert a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                int iO2 = reader.o2(f8526a);
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
                    str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "message");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, "primaryActionLabel");
                throw null;
            }
            if (str4 != null) {
                return new AppConfigQuery.OnAppConfigSoftAlert(str, str2, str3, str4);
            }
            Assertions.a(reader, "secondaryActionLabel");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AppConfigQuery.OnAppConfigSoftAlert value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f8520a);
            writer.F1("message");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("primaryActionLabel");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("secondaryActionLabel");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (AppConfigQuery.OnAppConfigSoftAlert) obj);
        }
    }
}
