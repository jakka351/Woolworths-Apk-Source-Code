package au.com.woolworths.modules.subscriptioninfo.adapter;

import au.com.woolworths.modules.subscriptioninfo.SubscriptionAnalyticsDataQuery;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/modules/subscriptioninfo/adapter/SubscriptionAnalyticsDataQuery_ResponseAdapter;", "", "Data", "Subscriptions", "AnalyticsData", "OnSubscriptionAnalyticsData", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SubscriptionAnalyticsDataQuery_ResponseAdapter {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/subscriptioninfo/adapter/SubscriptionAnalyticsDataQuery_ResponseAdapter$AnalyticsData;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/subscriptioninfo/SubscriptionAnalyticsDataQuery$AnalyticsData;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AnalyticsData implements Adapter<SubscriptionAnalyticsDataQuery.AnalyticsData> {

        /* renamed from: a, reason: collision with root package name */
        public static final AnalyticsData f9168a = new AnalyticsData();
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
            SubscriptionAnalyticsDataQuery.OnSubscriptionAnalyticsData onSubscriptionAnalyticsDataA = OnSubscriptionAnalyticsData.a(reader, customScalarAdapters);
            if (str != null) {
                return new SubscriptionAnalyticsDataQuery.AnalyticsData(str, onSubscriptionAnalyticsDataA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SubscriptionAnalyticsDataQuery.AnalyticsData value = (SubscriptionAnalyticsDataQuery.AnalyticsData) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f9164a);
            List list = OnSubscriptionAnalyticsData.f9170a;
            OnSubscriptionAnalyticsData.b(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/subscriptioninfo/adapter/SubscriptionAnalyticsDataQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/subscriptioninfo/SubscriptionAnalyticsDataQuery$Data;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<SubscriptionAnalyticsDataQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f9169a = new Data();
        public static final List b = CollectionsKt.Q("subscriptions");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            SubscriptionAnalyticsDataQuery.Subscriptions subscriptions = null;
            while (reader.o2(b) == 0) {
                subscriptions = (SubscriptionAnalyticsDataQuery.Subscriptions) Adapters.b(Adapters.c(Subscriptions.f9171a, false)).fromJson(reader, customScalarAdapters);
            }
            return new SubscriptionAnalyticsDataQuery.Data(subscriptions);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SubscriptionAnalyticsDataQuery.Data value = (SubscriptionAnalyticsDataQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("subscriptions");
            Adapters.b(Adapters.c(Subscriptions.f9171a, false)).toJson(writer, customScalarAdapters, value.f9165a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/subscriptioninfo/adapter/SubscriptionAnalyticsDataQuery_ResponseAdapter$OnSubscriptionAnalyticsData;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/subscriptioninfo/SubscriptionAnalyticsDataQuery$OnSubscriptionAnalyticsData;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnSubscriptionAnalyticsData implements Adapter<SubscriptionAnalyticsDataQuery.OnSubscriptionAnalyticsData> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f9170a = CollectionsKt.R("subscriptionTypes", "subscriptionBillingPeriods", "subscriptionAllowedUsageTypes", "subscriptionIds", "userStatus", "userSubscriberTypes");

        public static SubscriptionAnalyticsDataQuery.OnSubscriptionAnalyticsData a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            List list = null;
            List list2 = null;
            List list3 = null;
            List list4 = null;
            List list5 = null;
            List list6 = null;
            while (true) {
                int iO2 = reader.o2(f9170a);
                if (iO2 == 0) {
                    list = (List) Adapters.b(Adapters.a(Adapters.i)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    list2 = (List) Adapters.b(Adapters.a(Adapters.i)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    list3 = (List) Adapters.b(Adapters.a(Adapters.i)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    list4 = (List) Adapters.b(Adapters.a(Adapters.i)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    list5 = (List) Adapters.b(Adapters.a(Adapters.i)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        return new SubscriptionAnalyticsDataQuery.OnSubscriptionAnalyticsData(list, list2, list3, list4, list5, list6);
                    }
                    list6 = (List) Adapters.b(Adapters.a(Adapters.i)).fromJson(reader, customScalarAdapters);
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, SubscriptionAnalyticsDataQuery.OnSubscriptionAnalyticsData value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("subscriptionTypes");
            NullableAdapter nullableAdapter = Adapters.i;
            Adapters.b(Adapters.a(nullableAdapter)).toJson(writer, customScalarAdapters, value.f9166a);
            writer.F1("subscriptionBillingPeriods");
            Adapters.b(Adapters.a(nullableAdapter)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("subscriptionAllowedUsageTypes");
            Adapters.b(Adapters.a(nullableAdapter)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("subscriptionIds");
            Adapters.b(Adapters.a(nullableAdapter)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("userStatus");
            Adapters.b(Adapters.a(nullableAdapter)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("userSubscriberTypes");
            Adapters.b(Adapters.a(nullableAdapter)).toJson(writer, customScalarAdapters, value.f);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (SubscriptionAnalyticsDataQuery.OnSubscriptionAnalyticsData) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/subscriptioninfo/adapter/SubscriptionAnalyticsDataQuery_ResponseAdapter$Subscriptions;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/subscriptioninfo/SubscriptionAnalyticsDataQuery$Subscriptions;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Subscriptions implements Adapter<SubscriptionAnalyticsDataQuery.Subscriptions> {

        /* renamed from: a, reason: collision with root package name */
        public static final Subscriptions f9171a = new Subscriptions();
        public static final List b = CollectionsKt.Q("analyticsData");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            SubscriptionAnalyticsDataQuery.AnalyticsData analyticsData = null;
            while (reader.o2(b) == 0) {
                analyticsData = (SubscriptionAnalyticsDataQuery.AnalyticsData) Adapters.b(Adapters.c(AnalyticsData.f9168a, true)).fromJson(reader, customScalarAdapters);
            }
            return new SubscriptionAnalyticsDataQuery.Subscriptions(analyticsData);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SubscriptionAnalyticsDataQuery.Subscriptions value = (SubscriptionAnalyticsDataQuery.Subscriptions) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("analyticsData");
            Adapters.b(Adapters.c(AnalyticsData.f9168a, true)).toJson(writer, customScalarAdapters, value.f9167a);
        }
    }
}
