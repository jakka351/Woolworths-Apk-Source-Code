package com.woolworths.shop.brandedshop.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFieldsImpl_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.TagStyle;
import au.com.woolworths.shop.graphql.type.adapter.ActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.TagStyle_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$IntAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.woolworths.shop.brandedshop.TrafficDriversQuery;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/TrafficDriversQuery_ResponseAdapter;", "", "Data", "TrafficDrivers", "Analytics", "Item", "Action", "Analytics1", "Tag", "ImpressionAnalytics", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TrafficDriversQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/TrafficDriversQuery_ResponseAdapter$Action;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/TrafficDriversQuery$Action;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action implements Adapter<TrafficDriversQuery.Action> {

        /* renamed from: a, reason: collision with root package name */
        public static final Action f21484a = new Action();
        public static final List b = CollectionsKt.R("__typename", "type", UrlHandler.ACTION, "id", "analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ActionType actionTypeA = null;
            String str2 = null;
            String str3 = null;
            TrafficDriversQuery.Analytics1 analytics1 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    analytics1 = (TrafficDriversQuery.Analytics1) Adapters.b(Adapters.c(Analytics1.f21486a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str2 != null) {
                return new TrafficDriversQuery.Action(str, actionTypeA, str2, str3, analytics1);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            TrafficDriversQuery.Action value = (TrafficDriversQuery.Action) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21433a);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(UrlHandler.ACTION);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics1.f21486a, true)).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/TrafficDriversQuery_ResponseAdapter$Analytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/TrafficDriversQuery$Analytics;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics implements Adapter<TrafficDriversQuery.Analytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics f21485a = new Analytics();
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
                return new TrafficDriversQuery.Analytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            TrafficDriversQuery.Analytics value = (TrafficDriversQuery.Analytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21434a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/TrafficDriversQuery_ResponseAdapter$Analytics1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/TrafficDriversQuery$Analytics1;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics1 implements Adapter<TrafficDriversQuery.Analytics1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics1 f21486a = new Analytics1();
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
                return new TrafficDriversQuery.Analytics1(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            TrafficDriversQuery.Analytics1 value = (TrafficDriversQuery.Analytics1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21435a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/TrafficDriversQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/TrafficDriversQuery$Data;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<TrafficDriversQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f21487a = new Data();
        public static final List b = CollectionsKt.Q("trafficDrivers");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            TrafficDriversQuery.TrafficDrivers trafficDrivers = null;
            while (reader.o2(b) == 0) {
                trafficDrivers = (TrafficDriversQuery.TrafficDrivers) Adapters.c(TrafficDrivers.f21491a, false).fromJson(reader, customScalarAdapters);
            }
            if (trafficDrivers != null) {
                return new TrafficDriversQuery.Data(trafficDrivers);
            }
            Assertions.a(reader, "trafficDrivers");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            TrafficDriversQuery.Data value = (TrafficDriversQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("trafficDrivers");
            Adapters.c(TrafficDrivers.f21491a, false).toJson(writer, customScalarAdapters, value.f21436a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/TrafficDriversQuery_ResponseAdapter$ImpressionAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/TrafficDriversQuery$ImpressionAnalytics;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ImpressionAnalytics implements Adapter<TrafficDriversQuery.ImpressionAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final ImpressionAnalytics f21488a = new ImpressionAnalytics();
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
                return new TrafficDriversQuery.ImpressionAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            TrafficDriversQuery.ImpressionAnalytics value = (TrafficDriversQuery.ImpressionAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21437a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/TrafficDriversQuery_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/TrafficDriversQuery$Item;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<TrafficDriversQuery.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f21489a = new Item();
        public static final List b = CollectionsKt.R("__typename", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "imageUrl", "keywords", UrlHandler.ACTION, "tag", "impressionAnalytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            ArrayList arrayListFromJson = null;
            TrafficDriversQuery.Action action = null;
            TrafficDriversQuery.Tag tag = null;
            TrafficDriversQuery.ImpressionAnalytics impressionAnalytics = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        arrayListFromJson = Adapters.a(Adapters.f13493a).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        action = (TrafficDriversQuery.Action) Adapters.c(Action.f21484a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        tag = (TrafficDriversQuery.Tag) Adapters.b(Adapters.c(Tag.f21490a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        impressionAnalytics = (TrafficDriversQuery.ImpressionAnalytics) Adapters.b(Adapters.c(ImpressionAnalytics.f21488a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "__typename");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (str4 == null) {
                            Assertions.a(reader, "imageUrl");
                            throw null;
                        }
                        if (arrayListFromJson == null) {
                            Assertions.a(reader, "keywords");
                            throw null;
                        }
                        if (action != null) {
                            return new TrafficDriversQuery.Item(str, str2, str3, str4, arrayListFromJson, action, tag, impressionAnalytics);
                        }
                        Assertions.a(reader, UrlHandler.ACTION);
                        throw null;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            TrafficDriversQuery.Item value = (TrafficDriversQuery.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21438a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("keywords");
            Adapters.a(adapters$StringAdapter$1).toJson(writer, customScalarAdapters, value.e);
            writer.F1(UrlHandler.ACTION);
            Adapters.c(Action.f21484a, false).toJson(writer, customScalarAdapters, value.f);
            writer.F1("tag");
            Adapters.b(Adapters.c(Tag.f21490a, false)).toJson(writer, customScalarAdapters, value.g);
            writer.F1("impressionAnalytics");
            Adapters.b(Adapters.c(ImpressionAnalytics.f21488a, true)).toJson(writer, customScalarAdapters, value.h);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/TrafficDriversQuery_ResponseAdapter$Tag;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/TrafficDriversQuery$Tag;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Tag implements Adapter<TrafficDriversQuery.Tag> {

        /* renamed from: a, reason: collision with root package name */
        public static final Tag f21490a = new Tag();
        public static final List b = CollectionsKt.R(TextBundle.TEXT_ENTRY, "style");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            TagStyle tagStyle = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    tagStyle = (TagStyle) Adapters.b(TagStyle_ResponseAdapter.f12127a).fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new TrafficDriversQuery.Tag(str, tagStyle);
            }
            Assertions.a(reader, TextBundle.TEXT_ENTRY);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            TrafficDriversQuery.Tag value = (TrafficDriversQuery.Tag) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21439a);
            writer.F1("style");
            Adapters.b(TagStyle_ResponseAdapter.f12127a).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/brandedshop/adapter/TrafficDriversQuery_ResponseAdapter$TrafficDrivers;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/brandedshop/TrafficDriversQuery$TrafficDrivers;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TrafficDrivers implements Adapter<TrafficDriversQuery.TrafficDrivers> {

        /* renamed from: a, reason: collision with root package name */
        public static final TrafficDrivers f21491a = new TrafficDrivers();
        public static final List b = CollectionsKt.R("__typename", "numberOfItemsToDisplay", "startingIndex", "analytics", "items");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Integer num;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num2 = null;
            String str = null;
            Integer num3 = null;
            TrafficDriversQuery.Analytics analytics = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    num = num2;
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    num = num2;
                    num3 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    num = num2;
                    analytics = (TrafficDriversQuery.Analytics) Adapters.b(Adapters.c(Analytics.f21485a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Item.f21489a, false)).fromJson(reader, customScalarAdapters);
                    num2 = num2;
                    num3 = num3;
                }
                num2 = num;
            }
            Integer num4 = num2;
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (num4 == null) {
                Assertions.a(reader, "numberOfItemsToDisplay");
                throw null;
            }
            Integer num5 = num3;
            int iIntValue = num4.intValue();
            if (num5 == null) {
                Assertions.a(reader, "startingIndex");
                throw null;
            }
            int iIntValue2 = num5.intValue();
            if (arrayListFromJson != null) {
                return new TrafficDriversQuery.TrafficDrivers(str, iIntValue, iIntValue2, analytics, arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            TrafficDriversQuery.TrafficDrivers value = (TrafficDriversQuery.TrafficDrivers) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21440a);
            writer.F1("numberOfItemsToDisplay");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.b, adapters$IntAdapter$1, writer, customScalarAdapters, "startingIndex");
            d.y(value.c, adapters$IntAdapter$1, writer, customScalarAdapters, "analytics");
            Adapters.b(Adapters.c(Analytics.f21485a, true)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("items");
            Adapters.a(Adapters.c(Item.f21489a, false)).toJson(writer, customScalarAdapters, value.e);
        }
    }
}
