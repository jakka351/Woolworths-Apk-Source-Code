package com.woolworths.feature.shop.bundles.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.CartProductQuantityAction;
import au.com.woolworths.shop.graphql.type.UpdateCartProductQuantityFailedReason;
import au.com.woolworths.shop.graphql.type.adapter.CartProductQuantityAction_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.UpdateCartProductQuantityFailedReason_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$IntAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.bundles.UpdateCartBundleQuantitiesMutation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/UpdateCartBundleQuantitiesMutation_ResponseAdapter;", "", "Data", "UpdateCartBundleQuantities", "UpdatedBundleQuantitySelector", "OnBundleQuantityStepper", "UpdatedProductQuantity", "Error", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UpdateCartBundleQuantitiesMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/UpdateCartBundleQuantitiesMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/UpdateCartBundleQuantitiesMutation$Data;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<UpdateCartBundleQuantitiesMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f19496a = new Data();
        public static final List b = CollectionsKt.Q("updateCartBundleQuantities");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            UpdateCartBundleQuantitiesMutation.UpdateCartBundleQuantities updateCartBundleQuantities = null;
            while (reader.o2(b) == 0) {
                updateCartBundleQuantities = (UpdateCartBundleQuantitiesMutation.UpdateCartBundleQuantities) Adapters.c(UpdateCartBundleQuantities.f19499a, false).fromJson(reader, customScalarAdapters);
            }
            if (updateCartBundleQuantities != null) {
                return new UpdateCartBundleQuantitiesMutation.Data(updateCartBundleQuantities);
            }
            Assertions.a(reader, "updateCartBundleQuantities");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdateCartBundleQuantitiesMutation.Data value = (UpdateCartBundleQuantitiesMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("updateCartBundleQuantities");
            Adapters.c(UpdateCartBundleQuantities.f19499a, false).toJson(writer, customScalarAdapters, value.f19442a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/UpdateCartBundleQuantitiesMutation_ResponseAdapter$Error;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/UpdateCartBundleQuantitiesMutation$Error;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Error implements Adapter<UpdateCartBundleQuantitiesMutation.Error> {

        /* renamed from: a, reason: collision with root package name */
        public static final Error f19497a = new Error();
        public static final List b = CollectionsKt.R("reason", "message");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            UpdateCartProductQuantityFailedReason updateCartProductQuantityFailedReasonA = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    updateCartProductQuantityFailedReasonA = UpdateCartProductQuantityFailedReason_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (updateCartProductQuantityFailedReasonA == null) {
                Assertions.a(reader, "reason");
                throw null;
            }
            if (str != null) {
                return new UpdateCartBundleQuantitiesMutation.Error(updateCartProductQuantityFailedReasonA, str);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdateCartBundleQuantitiesMutation.Error value = (UpdateCartBundleQuantitiesMutation.Error) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("reason");
            UpdateCartProductQuantityFailedReason_ResponseAdapter.b(writer, customScalarAdapters, value.f19443a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/UpdateCartBundleQuantitiesMutation_ResponseAdapter$OnBundleQuantityStepper;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/UpdateCartBundleQuantitiesMutation$OnBundleQuantityStepper;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnBundleQuantityStepper implements Adapter<UpdateCartBundleQuantitiesMutation.OnBundleQuantityStepper> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19498a = CollectionsKt.R("minimum", "maximum", "increment", "inCart", "addToCartLabel", "maximumReachedLabel", "offerId");

        public static UpdateCartBundleQuantitiesMutation.OnBundleQuantityStepper a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                switch (reader.o2(f19498a)) {
                    case 0:
                        num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        num3 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        num4 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (num == null) {
                            Assertions.a(reader, "minimum");
                            throw null;
                        }
                        int iIntValue = num.intValue();
                        if (num2 == null) {
                            Assertions.a(reader, "maximum");
                            throw null;
                        }
                        int iIntValue2 = num2.intValue();
                        if (num3 == null) {
                            Assertions.a(reader, "increment");
                            throw null;
                        }
                        int iIntValue3 = num3.intValue();
                        if (num4 == null) {
                            Assertions.a(reader, "inCart");
                            throw null;
                        }
                        int iIntValue4 = num4.intValue();
                        if (str == null) {
                            Assertions.a(reader, "addToCartLabel");
                            throw null;
                        }
                        if (str3 != null) {
                            return new UpdateCartBundleQuantitiesMutation.OnBundleQuantityStepper(iIntValue, iIntValue2, iIntValue3, iIntValue4, str, str2, str3);
                        }
                        Assertions.a(reader, "offerId");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, UpdateCartBundleQuantitiesMutation.OnBundleQuantityStepper value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("minimum");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.f19444a, adapters$IntAdapter$1, writer, customScalarAdapters, "maximum");
            d.y(value.b, adapters$IntAdapter$1, writer, customScalarAdapters, "increment");
            d.y(value.c, adapters$IntAdapter$1, writer, customScalarAdapters, "inCart");
            d.y(value.d, adapters$IntAdapter$1, writer, customScalarAdapters, "addToCartLabel");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("maximumReachedLabel");
            Adapters.i.toJson(writer, customScalarAdapters, value.f);
            writer.F1("offerId");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.g);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (UpdateCartBundleQuantitiesMutation.OnBundleQuantityStepper) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/UpdateCartBundleQuantitiesMutation_ResponseAdapter$UpdateCartBundleQuantities;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/UpdateCartBundleQuantitiesMutation$UpdateCartBundleQuantities;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UpdateCartBundleQuantities implements Adapter<UpdateCartBundleQuantitiesMutation.UpdateCartBundleQuantities> {

        /* renamed from: a, reason: collision with root package name */
        public static final UpdateCartBundleQuantities f19499a = new UpdateCartBundleQuantities();
        public static final List b = CollectionsKt.R("productCount", "totalProductCount", "updatedBundleQuantitySelector", "updatedProductQuantities");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            Integer num2 = null;
            UpdateCartBundleQuantitiesMutation.UpdatedBundleQuantitySelector updatedBundleQuantitySelector = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    updatedBundleQuantitySelector = (UpdateCartBundleQuantitiesMutation.UpdatedBundleQuantitySelector) Adapters.c(UpdatedBundleQuantitySelector.f19500a, true).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(UpdatedProductQuantity.f19501a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (num == null) {
                Assertions.a(reader, "productCount");
                throw null;
            }
            int iIntValue = num.intValue();
            if (num2 == null) {
                Assertions.a(reader, "totalProductCount");
                throw null;
            }
            int iIntValue2 = num2.intValue();
            if (updatedBundleQuantitySelector == null) {
                Assertions.a(reader, "updatedBundleQuantitySelector");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new UpdateCartBundleQuantitiesMutation.UpdateCartBundleQuantities(iIntValue, iIntValue2, updatedBundleQuantitySelector, arrayListFromJson);
            }
            Assertions.a(reader, "updatedProductQuantities");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdateCartBundleQuantitiesMutation.UpdateCartBundleQuantities value = (UpdateCartBundleQuantitiesMutation.UpdateCartBundleQuantities) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productCount");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.f19445a, adapters$IntAdapter$1, writer, customScalarAdapters, "totalProductCount");
            d.y(value.b, adapters$IntAdapter$1, writer, customScalarAdapters, "updatedBundleQuantitySelector");
            Adapters.c(UpdatedBundleQuantitySelector.f19500a, true).toJson(writer, customScalarAdapters, value.c);
            writer.F1("updatedProductQuantities");
            Adapters.a(Adapters.c(UpdatedProductQuantity.f19501a, false)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/UpdateCartBundleQuantitiesMutation_ResponseAdapter$UpdatedBundleQuantitySelector;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/UpdateCartBundleQuantitiesMutation$UpdatedBundleQuantitySelector;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UpdatedBundleQuantitySelector implements Adapter<UpdateCartBundleQuantitiesMutation.UpdatedBundleQuantitySelector> {

        /* renamed from: a, reason: collision with root package name */
        public static final UpdatedBundleQuantitySelector f19500a = new UpdatedBundleQuantitySelector();
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
            UpdateCartBundleQuantitiesMutation.OnBundleQuantityStepper onBundleQuantityStepperA = OnBundleQuantityStepper.a(reader, customScalarAdapters);
            if (str != null) {
                return new UpdateCartBundleQuantitiesMutation.UpdatedBundleQuantitySelector(str, onBundleQuantityStepperA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdateCartBundleQuantitiesMutation.UpdatedBundleQuantitySelector value = (UpdateCartBundleQuantitiesMutation.UpdatedBundleQuantitySelector) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19446a);
            List list = OnBundleQuantityStepper.f19498a;
            OnBundleQuantityStepper.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/bundles/adapter/UpdateCartBundleQuantitiesMutation_ResponseAdapter$UpdatedProductQuantity;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/bundles/UpdateCartBundleQuantitiesMutation$UpdatedProductQuantity;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UpdatedProductQuantity implements Adapter<UpdateCartBundleQuantitiesMutation.UpdatedProductQuantity> {

        /* renamed from: a, reason: collision with root package name */
        public static final UpdatedProductQuantity f19501a = new UpdatedProductQuantity();
        public static final List b = CollectionsKt.R("productId", "updatedQuantity", "success", "error", "deltaQuantity", "deltaSubtotal", "productQuantityAction");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Double d;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Double d2 = null;
            String str = null;
            Boolean bool = null;
            UpdateCartBundleQuantitiesMutation.Error error = null;
            Double d3 = null;
            String str2 = null;
            CartProductQuantityAction cartProductQuantityAction = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        d = d2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        d2 = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                        continue;
                    case 2:
                        d = d2;
                        bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        error = (UpdateCartBundleQuantitiesMutation.Error) Adapters.b(Adapters.c(Error.f19497a, false)).fromJson(reader, customScalarAdapters);
                        d2 = d2;
                        bool = bool;
                        continue;
                    case 4:
                        d = d2;
                        d3 = (Double) Adapters.j.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        d = d2;
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        d = d2;
                        cartProductQuantityAction = (CartProductQuantityAction) Adapters.b(CartProductQuantityAction_ResponseAdapter.f12044a).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Double d4 = d2;
                        if (str == null) {
                            Assertions.a(reader, "productId");
                            throw null;
                        }
                        if (d4 == null) {
                            Assertions.a(reader, "updatedQuantity");
                            throw null;
                        }
                        Boolean bool2 = bool;
                        double dDoubleValue = d4.doubleValue();
                        if (bool2 != null) {
                            return new UpdateCartBundleQuantitiesMutation.UpdatedProductQuantity(str, dDoubleValue, bool2.booleanValue(), error, d3, str2, cartProductQuantityAction);
                        }
                        Assertions.a(reader, "success");
                        throw null;
                }
                d2 = d;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdateCartBundleQuantitiesMutation.UpdatedProductQuantity value = (UpdateCartBundleQuantitiesMutation.UpdatedProductQuantity) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productId");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19447a);
            writer.F1("updatedQuantity");
            Adapters.c.toJson(writer, customScalarAdapters, Double.valueOf(value.b));
            writer.F1("success");
            d.B(value.c, Adapters.f, writer, customScalarAdapters, "error");
            Adapters.b(Adapters.c(Error.f19497a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("deltaQuantity");
            Adapters.j.toJson(writer, customScalarAdapters, value.e);
            writer.F1("deltaSubtotal");
            Adapters.i.toJson(writer, customScalarAdapters, value.f);
            writer.F1("productQuantityAction");
            Adapters.b(CartProductQuantityAction_ResponseAdapter.f12044a).toJson(writer, customScalarAdapters, value.g);
        }
    }
}
