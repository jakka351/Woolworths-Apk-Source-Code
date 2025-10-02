package com.woolworths.shop.cart.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.graphql.common.fragment.ProductCardImpl_ResponseAdapter;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFieldsImpl_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.OfferType;
import au.com.woolworths.shop.graphql.type.ProgressStepType;
import au.com.woolworths.shop.graphql.type.TooltipType;
import au.com.woolworths.shop.graphql.type.adapter.OfferType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ProgressStepType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.TooltipType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$IntAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.woolworths.shop.cart.UpdateOfferProductListMutation;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/woolworths/shop/cart/adapter/UpdateOfferProductListMutation_ResponseAdapter;", "", "Data", "UpdateOfferProductList", "OnOfferProductListResponseSuccess", "Progress", "OfferProduct", "ImpressionAnalytics", "OnOfferProductListResponseFailure", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UpdateOfferProductListMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/UpdateOfferProductListMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/UpdateOfferProductListMutation$Data;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<UpdateOfferProductListMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f21621a = new Data();
        public static final List b = CollectionsKt.Q("updateOfferProductList");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            UpdateOfferProductListMutation.UpdateOfferProductList updateOfferProductList = null;
            while (reader.o2(b) == 0) {
                updateOfferProductList = (UpdateOfferProductListMutation.UpdateOfferProductList) Adapters.c(UpdateOfferProductList.f21627a, true).fromJson(reader, customScalarAdapters);
            }
            if (updateOfferProductList != null) {
                return new UpdateOfferProductListMutation.Data(updateOfferProductList);
            }
            Assertions.a(reader, "updateOfferProductList");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdateOfferProductListMutation.Data value = (UpdateOfferProductListMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("updateOfferProductList");
            Adapters.c(UpdateOfferProductList.f21627a, true).toJson(writer, customScalarAdapters, value.f21567a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/UpdateOfferProductListMutation_ResponseAdapter$ImpressionAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/UpdateOfferProductListMutation$ImpressionAnalytics;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ImpressionAnalytics implements Adapter<UpdateOfferProductListMutation.ImpressionAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final ImpressionAnalytics f21622a = new ImpressionAnalytics();
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
                return new UpdateOfferProductListMutation.ImpressionAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdateOfferProductListMutation.ImpressionAnalytics value = (UpdateOfferProductListMutation.ImpressionAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21568a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/UpdateOfferProductListMutation_ResponseAdapter$OfferProduct;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/UpdateOfferProductListMutation$OfferProduct;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OfferProduct implements Adapter<UpdateOfferProductListMutation.OfferProduct> {

        /* renamed from: a, reason: collision with root package name */
        public static final OfferProduct f21623a = new OfferProduct();
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
            ProductCard productCardA = ProductCardImpl_ResponseAdapter.ProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new UpdateOfferProductListMutation.OfferProduct(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdateOfferProductListMutation.OfferProduct value = (UpdateOfferProductListMutation.OfferProduct) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21569a);
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/UpdateOfferProductListMutation_ResponseAdapter$OnOfferProductListResponseFailure;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/UpdateOfferProductListMutation$OnOfferProductListResponseFailure;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnOfferProductListResponseFailure implements Adapter<UpdateOfferProductListMutation.OnOfferProductListResponseFailure> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21624a = CollectionsKt.Q("errorDescription");

        public static UpdateOfferProductListMutation.OnOfferProductListResponseFailure a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f21624a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new UpdateOfferProductListMutation.OnOfferProductListResponseFailure(str);
            }
            Assertions.a(reader, "errorDescription");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, UpdateOfferProductListMutation.OnOfferProductListResponseFailure value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("errorDescription");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21570a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (UpdateOfferProductListMutation.OnOfferProductListResponseFailure) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/UpdateOfferProductListMutation_ResponseAdapter$OnOfferProductListResponseSuccess;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/UpdateOfferProductListMutation$OnOfferProductListResponseSuccess;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnOfferProductListResponseSuccess implements Adapter<UpdateOfferProductListMutation.OnOfferProductListResponseSuccess> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21625a = CollectionsKt.R("isApplied", "badgeImage", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "progress", "offerType", "offerProducts", "impressionAnalytics");

        public static UpdateOfferProductListMutation.OnOfferProductListResponseSuccess a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            UpdateOfferProductListMutation.Progress progress = null;
            OfferType offerTypeA = null;
            ArrayList arrayListFromJson = null;
            UpdateOfferProductListMutation.ImpressionAnalytics impressionAnalytics = null;
            while (true) {
                switch (reader.o2(f21625a)) {
                    case 0:
                        bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        progress = (UpdateOfferProductListMutation.Progress) Adapters.c(Progress.f21626a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        offerTypeA = OfferType_ResponseAdapter.a(reader, customScalarAdapters);
                        break;
                    case 6:
                        arrayListFromJson = Adapters.a(Adapters.c(OfferProduct.f21623a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        impressionAnalytics = (UpdateOfferProductListMutation.ImpressionAnalytics) Adapters.c(ImpressionAnalytics.f21622a, true).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (bool == null) {
                            Assertions.a(reader, "isApplied");
                            throw null;
                        }
                        boolean zBooleanValue = bool.booleanValue();
                        if (str == null) {
                            Assertions.a(reader, "badgeImage");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
                            throw null;
                        }
                        if (progress == null) {
                            Assertions.a(reader, "progress");
                            throw null;
                        }
                        if (offerTypeA == null) {
                            Assertions.a(reader, "offerType");
                            throw null;
                        }
                        if (arrayListFromJson == null) {
                            Assertions.a(reader, "offerProducts");
                            throw null;
                        }
                        if (impressionAnalytics != null) {
                            return new UpdateOfferProductListMutation.OnOfferProductListResponseSuccess(zBooleanValue, str, str2, str3, progress, offerTypeA, arrayListFromJson, impressionAnalytics);
                        }
                        Assertions.a(reader, "impressionAnalytics");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, UpdateOfferProductListMutation.OnOfferProductListResponseSuccess value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("isApplied");
            d.B(value.f21571a, Adapters.f, writer, customScalarAdapters, "badgeImage");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("progress");
            Adapters.c(Progress.f21626a, false).toJson(writer, customScalarAdapters, value.e);
            writer.F1("offerType");
            OfferType_ResponseAdapter.b(writer, customScalarAdapters, value.f);
            writer.F1("offerProducts");
            Adapters.a(Adapters.c(OfferProduct.f21623a, true)).toJson(writer, customScalarAdapters, value.g);
            writer.F1("impressionAnalytics");
            Adapters.c(ImpressionAnalytics.f21622a, true).toJson(writer, customScalarAdapters, value.h);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (UpdateOfferProductListMutation.OnOfferProductListResponseSuccess) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/UpdateOfferProductListMutation_ResponseAdapter$Progress;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/UpdateOfferProductListMutation$Progress;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Progress implements Adapter<UpdateOfferProductListMutation.Progress> {

        /* renamed from: a, reason: collision with root package name */
        public static final Progress f21626a = new Progress();
        public static final List b = CollectionsKt.R("currentStep", "currentStepPosition", "currentStepType", "totalSteps", "imageName");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Integer num;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num2 = null;
            String str = null;
            Integer num3 = null;
            ProgressStepType progressStepTypeA = null;
            TooltipType tooltipType = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    num = num2;
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    progressStepTypeA = ProgressStepType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    num = num2;
                    num3 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    num = num2;
                    tooltipType = (TooltipType) Adapters.b(TooltipType_ResponseAdapter.f12131a).fromJson(reader, customScalarAdapters);
                }
                num2 = num;
            }
            Integer num4 = num2;
            if (str == null) {
                Assertions.a(reader, "currentStep");
                throw null;
            }
            if (num4 == null) {
                Assertions.a(reader, "currentStepPosition");
                throw null;
            }
            Integer num5 = num3;
            int iIntValue = num4.intValue();
            if (progressStepTypeA == null) {
                Assertions.a(reader, "currentStepType");
                throw null;
            }
            if (num5 != null) {
                return new UpdateOfferProductListMutation.Progress(str, iIntValue, progressStepTypeA, num5.intValue(), tooltipType);
            }
            Assertions.a(reader, "totalSteps");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdateOfferProductListMutation.Progress value = (UpdateOfferProductListMutation.Progress) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("currentStep");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21572a);
            writer.F1("currentStepPosition");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.b, adapters$IntAdapter$1, writer, customScalarAdapters, "currentStepType");
            ProgressStepType_ResponseAdapter.b(writer, customScalarAdapters, value.c);
            writer.F1("totalSteps");
            d.y(value.d, adapters$IntAdapter$1, writer, customScalarAdapters, "imageName");
            Adapters.b(TooltipType_ResponseAdapter.f12131a).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/UpdateOfferProductListMutation_ResponseAdapter$UpdateOfferProductList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/UpdateOfferProductListMutation$UpdateOfferProductList;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UpdateOfferProductList implements Adapter<UpdateOfferProductListMutation.UpdateOfferProductList> {

        /* renamed from: a, reason: collision with root package name */
        public static final UpdateOfferProductList f21627a = new UpdateOfferProductList();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            UpdateOfferProductListMutation.OnOfferProductListResponseSuccess onOfferProductListResponseSuccessA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            UpdateOfferProductListMutation.OnOfferProductListResponseFailure onOfferProductListResponseFailureA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("OfferProductListResponseSuccess"))) {
                reader.o();
                onOfferProductListResponseSuccessA = OnOfferProductListResponseSuccess.a(reader, customScalarAdapters);
            } else {
                onOfferProductListResponseSuccessA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("OfferProductListResponseFailure"))) {
                reader.o();
                onOfferProductListResponseFailureA = OnOfferProductListResponseFailure.a(reader, customScalarAdapters);
            }
            return new UpdateOfferProductListMutation.UpdateOfferProductList(str, onOfferProductListResponseSuccessA, onOfferProductListResponseFailureA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdateOfferProductListMutation.UpdateOfferProductList value = (UpdateOfferProductListMutation.UpdateOfferProductList) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21573a);
            UpdateOfferProductListMutation.OnOfferProductListResponseSuccess onOfferProductListResponseSuccess = value.b;
            if (onOfferProductListResponseSuccess != null) {
                OnOfferProductListResponseSuccess.b(writer, customScalarAdapters, onOfferProductListResponseSuccess);
            }
            UpdateOfferProductListMutation.OnOfferProductListResponseFailure onOfferProductListResponseFailure = value.c;
            if (onOfferProductListResponseFailure != null) {
                OnOfferProductListResponseFailure.b(writer, customScalarAdapters, onOfferProductListResponseFailure);
            }
        }
    }
}
