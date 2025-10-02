package au.com.woolworths.foundation.shop.nhp.datasource.adapter;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.foundation.shop.nhp.datasource.BoostEdrOfferMutation;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFieldsImpl_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.RtlBoostState;
import au.com.woolworths.shop.graphql.type.RtlOfferStatus;
import au.com.woolworths.shop.graphql.type.adapter.ActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.RtlBoostState_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.RtlOfferStatus_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/foundation/shop/nhp/datasource/adapter/BoostEdrOfferMutation_ResponseAdapter;", "", "Data", "BoostEdrOffer", "OnEdrOffer", "OfferButtonAction", "OfferButtonLabel", "Analytics", "OnSnackBar", "Analytics1", "ImpressionAnalytics", "nhp-datasource_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BoostEdrOfferMutation_ResponseAdapter {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/nhp/datasource/adapter/BoostEdrOfferMutation_ResponseAdapter$Analytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/shop/nhp/datasource/BoostEdrOfferMutation$Analytics;", "nhp-datasource_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics implements Adapter<BoostEdrOfferMutation.Analytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics f8767a = new Analytics();
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
                return new BoostEdrOfferMutation.Analytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BoostEdrOfferMutation.Analytics value = (BoostEdrOfferMutation.Analytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f8757a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/nhp/datasource/adapter/BoostEdrOfferMutation_ResponseAdapter$Analytics1;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/shop/nhp/datasource/BoostEdrOfferMutation$Analytics1;", "nhp-datasource_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics1 implements Adapter<BoostEdrOfferMutation.Analytics1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics1 f8768a = new Analytics1();
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
                return new BoostEdrOfferMutation.Analytics1(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BoostEdrOfferMutation.Analytics1 value = (BoostEdrOfferMutation.Analytics1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f8758a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/nhp/datasource/adapter/BoostEdrOfferMutation_ResponseAdapter$BoostEdrOffer;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/shop/nhp/datasource/BoostEdrOfferMutation$BoostEdrOffer;", "nhp-datasource_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BoostEdrOffer implements Adapter<BoostEdrOfferMutation.BoostEdrOffer> {

        /* renamed from: a, reason: collision with root package name */
        public static final BoostEdrOffer f8769a = new BoostEdrOffer();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            BoostEdrOfferMutation.OnEdrOffer onEdrOfferA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            BoostEdrOfferMutation.OnSnackBar onSnackBarA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("EdrOffer"))) {
                reader.o();
                onEdrOfferA = OnEdrOffer.a(reader, customScalarAdapters);
            } else {
                onEdrOfferA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("SnackBar"))) {
                reader.o();
                onSnackBarA = OnSnackBar.a(reader, customScalarAdapters);
            }
            return new BoostEdrOfferMutation.BoostEdrOffer(str, onEdrOfferA, onSnackBarA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BoostEdrOfferMutation.BoostEdrOffer value = (BoostEdrOfferMutation.BoostEdrOffer) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f8759a);
            BoostEdrOfferMutation.OnEdrOffer onEdrOffer = value.b;
            if (onEdrOffer != null) {
                OnEdrOffer.b(writer, customScalarAdapters, onEdrOffer);
            }
            BoostEdrOfferMutation.OnSnackBar onSnackBar = value.c;
            if (onSnackBar != null) {
                OnSnackBar.b(writer, customScalarAdapters, onSnackBar);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/nhp/datasource/adapter/BoostEdrOfferMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/shop/nhp/datasource/BoostEdrOfferMutation$Data;", "nhp-datasource_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<BoostEdrOfferMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f8770a = new Data();
        public static final List b = CollectionsKt.Q("boostEdrOffer");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            BoostEdrOfferMutation.BoostEdrOffer boostEdrOffer = null;
            while (reader.o2(b) == 0) {
                boostEdrOffer = (BoostEdrOfferMutation.BoostEdrOffer) Adapters.c(BoostEdrOffer.f8769a, true).fromJson(reader, customScalarAdapters);
            }
            if (boostEdrOffer != null) {
                return new BoostEdrOfferMutation.Data(boostEdrOffer);
            }
            Assertions.a(reader, "boostEdrOffer");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BoostEdrOfferMutation.Data value = (BoostEdrOfferMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("boostEdrOffer");
            Adapters.c(BoostEdrOffer.f8769a, true).toJson(writer, customScalarAdapters, value.f8760a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/nhp/datasource/adapter/BoostEdrOfferMutation_ResponseAdapter$ImpressionAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/shop/nhp/datasource/BoostEdrOfferMutation$ImpressionAnalytics;", "nhp-datasource_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ImpressionAnalytics implements Adapter<BoostEdrOfferMutation.ImpressionAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final ImpressionAnalytics f8771a = new ImpressionAnalytics();
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
                return new BoostEdrOfferMutation.ImpressionAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BoostEdrOfferMutation.ImpressionAnalytics value = (BoostEdrOfferMutation.ImpressionAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f8761a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/nhp/datasource/adapter/BoostEdrOfferMutation_ResponseAdapter$OfferButtonAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/shop/nhp/datasource/BoostEdrOfferMutation$OfferButtonAction;", "nhp-datasource_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OfferButtonAction implements Adapter<BoostEdrOfferMutation.OfferButtonAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final OfferButtonAction f8772a = new OfferButtonAction();
        public static final List b = CollectionsKt.R("__typename", "type", UrlHandler.ACTION, "id");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ActionType actionTypeA = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
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
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str2 != null) {
                return new BoostEdrOfferMutation.OfferButtonAction(str, actionTypeA, str2, str3);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BoostEdrOfferMutation.OfferButtonAction value = (BoostEdrOfferMutation.OfferButtonAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f8762a);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(UrlHandler.ACTION);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/nhp/datasource/adapter/BoostEdrOfferMutation_ResponseAdapter$OfferButtonLabel;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/shop/nhp/datasource/BoostEdrOfferMutation$OfferButtonLabel;", "nhp-datasource_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OfferButtonLabel implements Adapter<BoostEdrOfferMutation.OfferButtonLabel> {

        /* renamed from: a, reason: collision with root package name */
        public static final OfferButtonLabel f8773a = new OfferButtonLabel();
        public static final List b = CollectionsKt.R("__typename", TextBundle.TEXT_ENTRY, "altText");

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
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, TextBundle.TEXT_ENTRY);
                throw null;
            }
            if (str3 != null) {
                return new BoostEdrOfferMutation.OfferButtonLabel(str, str2, str3);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BoostEdrOfferMutation.OfferButtonLabel value = (BoostEdrOfferMutation.OfferButtonLabel) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f8763a);
            writer.F1(TextBundle.TEXT_ENTRY);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/nhp/datasource/adapter/BoostEdrOfferMutation_ResponseAdapter$OnEdrOffer;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/shop/nhp/datasource/BoostEdrOfferMutation$OnEdrOffer;", "nhp-datasource_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnEdrOffer implements Adapter<BoostEdrOfferMutation.OnEdrOffer> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f8774a = CollectionsKt.R("__typename", "offerId", "offerType", "linkedEdrHashCrn", "offerBoostState", "offerStatus", "offerButtonAction", "offerButtonLabel", "analytics");

        public static BoostEdrOfferMutation.OnEdrOffer a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            RtlBoostState rtlBoostState = null;
            RtlOfferStatus rtlOfferStatus = null;
            BoostEdrOfferMutation.OfferButtonAction offerButtonAction = null;
            BoostEdrOfferMutation.OfferButtonLabel offerButtonLabel = null;
            BoostEdrOfferMutation.Analytics analytics = null;
            while (true) {
                switch (reader.o2(f8774a)) {
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
                        rtlBoostState = (RtlBoostState) Adapters.b(RtlBoostState_ResponseAdapter.f12113a).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        rtlOfferStatus = (RtlOfferStatus) Adapters.b(RtlOfferStatus_ResponseAdapter.f12114a).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        offerButtonAction = (BoostEdrOfferMutation.OfferButtonAction) Adapters.b(Adapters.c(OfferButtonAction.f8772a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        offerButtonLabel = (BoostEdrOfferMutation.OfferButtonLabel) Adapters.b(Adapters.c(OfferButtonLabel.f8773a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        analytics = (BoostEdrOfferMutation.Analytics) Adapters.b(Adapters.c(Analytics.f8767a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "__typename");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "offerId");
                            throw null;
                        }
                        if (str4 != null) {
                            return new BoostEdrOfferMutation.OnEdrOffer(str, str2, str3, str4, rtlBoostState, rtlOfferStatus, offerButtonAction, offerButtonLabel, analytics);
                        }
                        Assertions.a(reader, "linkedEdrHashCrn");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, BoostEdrOfferMutation.OnEdrOffer value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f8764a);
            writer.F1("offerId");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("offerType");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
            writer.F1("linkedEdrHashCrn");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("offerBoostState");
            Adapters.b(RtlBoostState_ResponseAdapter.f12113a).toJson(writer, customScalarAdapters, value.e);
            writer.F1("offerStatus");
            Adapters.b(RtlOfferStatus_ResponseAdapter.f12114a).toJson(writer, customScalarAdapters, value.f);
            writer.F1("offerButtonAction");
            Adapters.b(Adapters.c(OfferButtonAction.f8772a, false)).toJson(writer, customScalarAdapters, value.g);
            writer.F1("offerButtonLabel");
            Adapters.b(Adapters.c(OfferButtonLabel.f8773a, false)).toJson(writer, customScalarAdapters, value.h);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics.f8767a, true)).toJson(writer, customScalarAdapters, value.i);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (BoostEdrOfferMutation.OnEdrOffer) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/nhp/datasource/adapter/BoostEdrOfferMutation_ResponseAdapter$OnSnackBar;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/shop/nhp/datasource/BoostEdrOfferMutation$OnSnackBar;", "nhp-datasource_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnSnackBar implements Adapter<BoostEdrOfferMutation.OnSnackBar> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f8775a = CollectionsKt.R("__typename", "message", "eventSource", "analytics", "impressionAnalytics");

        public static BoostEdrOfferMutation.OnSnackBar a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            BoostEdrOfferMutation.Analytics1 analytics1 = null;
            BoostEdrOfferMutation.ImpressionAnalytics impressionAnalytics = null;
            while (true) {
                int iO2 = reader.o2(f8775a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    analytics1 = (BoostEdrOfferMutation.Analytics1) Adapters.b(Adapters.c(Analytics1.f8768a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    impressionAnalytics = (BoostEdrOfferMutation.ImpressionAnalytics) Adapters.b(Adapters.c(ImpressionAnalytics.f8771a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "message");
                throw null;
            }
            if (str3 != null) {
                return new BoostEdrOfferMutation.OnSnackBar(str, str2, str3, analytics1, impressionAnalytics);
            }
            Assertions.a(reader, "eventSource");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, BoostEdrOfferMutation.OnSnackBar value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f8765a);
            writer.F1("message");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("eventSource");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics1.f8768a, true)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("impressionAnalytics");
            Adapters.b(Adapters.c(ImpressionAnalytics.f8771a, true)).toJson(writer, customScalarAdapters, value.e);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (BoostEdrOfferMutation.OnSnackBar) obj);
        }
    }
}
