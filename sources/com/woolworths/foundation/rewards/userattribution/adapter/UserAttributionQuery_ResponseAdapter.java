package com.woolworths.foundation.rewards.userattribution.adapter;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.rewards.graphql.type.AnalyticsService;
import au.com.woolworths.rewards.graphql.type.adapter.AnalyticsService_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.foundation.rewards.userattribution.UserAttributionQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/woolworths/foundation/rewards/userattribution/adapter/UserAttributionQuery_ResponseAdapter;", "", "Data", "UserAttribution", "ServiceDatum", "Property", "OnBoolAttributionProperty", "OnStringAttributionProperty", "userattribution-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UserAttributionQuery_ResponseAdapter {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/foundation/rewards/userattribution/adapter/UserAttributionQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/foundation/rewards/userattribution/UserAttributionQuery$Data;", "userattribution-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<UserAttributionQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f20484a = new Data();
        public static final List b = CollectionsKt.Q("userAttribution");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            UserAttributionQuery.UserAttribution userAttribution = null;
            while (reader.o2(b) == 0) {
                userAttribution = (UserAttributionQuery.UserAttribution) Adapters.c(UserAttribution.f20489a, false).fromJson(reader, customScalarAdapters);
            }
            if (userAttribution != null) {
                return new UserAttributionQuery.Data(userAttribution);
            }
            Assertions.a(reader, "userAttribution");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UserAttributionQuery.Data value = (UserAttributionQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("userAttribution");
            Adapters.c(UserAttribution.f20489a, false).toJson(writer, customScalarAdapters, value.f20478a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/foundation/rewards/userattribution/adapter/UserAttributionQuery_ResponseAdapter$OnBoolAttributionProperty;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/foundation/rewards/userattribution/UserAttributionQuery$OnBoolAttributionProperty;", "userattribution-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnBoolAttributionProperty implements Adapter<UserAttributionQuery.OnBoolAttributionProperty> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20485a = CollectionsKt.R("boolValue", "key");

        public static UserAttributionQuery.OnBoolAttributionProperty a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(f20485a);
                if (iO2 == 0) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (bool == null) {
                Assertions.a(reader, "boolValue");
                throw null;
            }
            boolean zBooleanValue = bool.booleanValue();
            if (str != null) {
                return new UserAttributionQuery.OnBoolAttributionProperty(zBooleanValue, str);
            }
            Assertions.a(reader, "key");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, UserAttributionQuery.OnBoolAttributionProperty value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("boolValue");
            d.B(value.f20479a, Adapters.f, writer, customScalarAdapters, "key");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (UserAttributionQuery.OnBoolAttributionProperty) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/foundation/rewards/userattribution/adapter/UserAttributionQuery_ResponseAdapter$OnStringAttributionProperty;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/foundation/rewards/userattribution/UserAttributionQuery$OnStringAttributionProperty;", "userattribution-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnStringAttributionProperty implements Adapter<UserAttributionQuery.OnStringAttributionProperty> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20486a = CollectionsKt.R("stringValue", "key");

        public static UserAttributionQuery.OnStringAttributionProperty a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f20486a);
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
                Assertions.a(reader, "stringValue");
                throw null;
            }
            if (str2 != null) {
                return new UserAttributionQuery.OnStringAttributionProperty(str, str2);
            }
            Assertions.a(reader, "key");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, UserAttributionQuery.OnStringAttributionProperty value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("stringValue");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20480a);
            writer.F1("key");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (UserAttributionQuery.OnStringAttributionProperty) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/foundation/rewards/userattribution/adapter/UserAttributionQuery_ResponseAdapter$Property;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/foundation/rewards/userattribution/UserAttributionQuery$Property;", "userattribution-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Property implements Adapter<UserAttributionQuery.Property> {

        /* renamed from: a, reason: collision with root package name */
        public static final Property f20487a = new Property();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            UserAttributionQuery.OnBoolAttributionProperty onBoolAttributionPropertyA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            UserAttributionQuery.OnStringAttributionProperty onStringAttributionPropertyA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("BoolAttributionProperty"))) {
                reader.o();
                onBoolAttributionPropertyA = OnBoolAttributionProperty.a(reader, customScalarAdapters);
            } else {
                onBoolAttributionPropertyA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("StringAttributionProperty"))) {
                reader.o();
                onStringAttributionPropertyA = OnStringAttributionProperty.a(reader, customScalarAdapters);
            }
            return new UserAttributionQuery.Property(str, onBoolAttributionPropertyA, onStringAttributionPropertyA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UserAttributionQuery.Property value = (UserAttributionQuery.Property) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20481a);
            UserAttributionQuery.OnBoolAttributionProperty onBoolAttributionProperty = value.b;
            if (onBoolAttributionProperty != null) {
                OnBoolAttributionProperty.b(writer, customScalarAdapters, onBoolAttributionProperty);
            }
            UserAttributionQuery.OnStringAttributionProperty onStringAttributionProperty = value.c;
            if (onStringAttributionProperty != null) {
                OnStringAttributionProperty.b(writer, customScalarAdapters, onStringAttributionProperty);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/foundation/rewards/userattribution/adapter/UserAttributionQuery_ResponseAdapter$ServiceDatum;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/foundation/rewards/userattribution/UserAttributionQuery$ServiceDatum;", "userattribution-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ServiceDatum implements Adapter<UserAttributionQuery.ServiceDatum> {

        /* renamed from: a, reason: collision with root package name */
        public static final ServiceDatum f20488a = new ServiceDatum();
        public static final List b = CollectionsKt.R("service", "properties");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            AnalyticsService analyticsServiceA = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    analyticsServiceA = AnalyticsService_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Property.f20487a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (analyticsServiceA == null) {
                Assertions.a(reader, "service");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new UserAttributionQuery.ServiceDatum(analyticsServiceA, arrayListFromJson);
            }
            Assertions.a(reader, "properties");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UserAttributionQuery.ServiceDatum value = (UserAttributionQuery.ServiceDatum) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("service");
            writer.v0(value.f20482a.d);
            writer.F1("properties");
            Adapters.a(Adapters.c(Property.f20487a, true)).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/foundation/rewards/userattribution/adapter/UserAttributionQuery_ResponseAdapter$UserAttribution;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/foundation/rewards/userattribution/UserAttributionQuery$UserAttribution;", "userattribution-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UserAttribution implements Adapter<UserAttributionQuery.UserAttribution> {

        /* renamed from: a, reason: collision with root package name */
        public static final UserAttribution f20489a = new UserAttribution();
        public static final List b = CollectionsKt.Q("serviceData");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(b) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(ServiceDatum.f20488a, false)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new UserAttributionQuery.UserAttribution(arrayListFromJson);
            }
            Assertions.a(reader, "serviceData");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UserAttributionQuery.UserAttribution value = (UserAttributionQuery.UserAttribution) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("serviceData");
            Adapters.a(Adapters.c(ServiceDatum.f20488a, false)).toJson(writer, customScalarAdapters, value.f20483a);
        }
    }
}
