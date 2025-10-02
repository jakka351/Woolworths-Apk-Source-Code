package com.woolworths.feature.shop.bundles;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.CartProductQuantityAction;
import au.com.woolworths.shop.graphql.type.UpdateCartBundleQuantitiesInput;
import au.com.woolworths.shop.graphql.type.UpdateCartProductQuantityFailedReason;
import au.com.woolworths.shop.graphql.type.adapter.UpdateCartBundleQuantitiesInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.bundles.adapter.UpdateCartBundleQuantitiesMutation_ResponseAdapter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/woolworths/feature/shop/bundles/UpdateCartBundleQuantitiesMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/feature/shop/bundles/UpdateCartBundleQuantitiesMutation$Data;", "Data", "UpdateCartBundleQuantities", "UpdatedBundleQuantitySelector", "OnBundleQuantityStepper", "UpdatedProductQuantity", "Error", "Companion", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UpdateCartBundleQuantitiesMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final UpdateCartBundleQuantitiesInput f19441a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/bundles/UpdateCartBundleQuantitiesMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/UpdateCartBundleQuantitiesMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final UpdateCartBundleQuantities f19442a;

        public Data(UpdateCartBundleQuantities updateCartBundleQuantities) {
            this.f19442a = updateCartBundleQuantities;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f19442a, ((Data) obj).f19442a);
        }

        public final int hashCode() {
            return this.f19442a.hashCode();
        }

        public final String toString() {
            return "Data(updateCartBundleQuantities=" + this.f19442a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/UpdateCartBundleQuantitiesMutation$Error;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Error {

        /* renamed from: a, reason: collision with root package name */
        public final UpdateCartProductQuantityFailedReason f19443a;
        public final String b;

        public Error(UpdateCartProductQuantityFailedReason updateCartProductQuantityFailedReason, String str) {
            this.f19443a = updateCartProductQuantityFailedReason;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return this.f19443a == error.f19443a && Intrinsics.c(this.b, error.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19443a.hashCode() * 31);
        }

        public final String toString() {
            return "Error(reason=" + this.f19443a + ", message=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/UpdateCartBundleQuantitiesMutation$OnBundleQuantityStepper;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnBundleQuantityStepper {

        /* renamed from: a, reason: collision with root package name */
        public final int f19444a;
        public final int b;
        public final int c;
        public final int d;
        public final String e;
        public final String f;
        public final String g;

        public OnBundleQuantityStepper(int i, int i2, int i3, int i4, String str, String str2, String str3) {
            this.f19444a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = str;
            this.f = str2;
            this.g = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnBundleQuantityStepper)) {
                return false;
            }
            OnBundleQuantityStepper onBundleQuantityStepper = (OnBundleQuantityStepper) obj;
            return this.f19444a == onBundleQuantityStepper.f19444a && this.b == onBundleQuantityStepper.b && this.c == onBundleQuantityStepper.c && this.d == onBundleQuantityStepper.d && Intrinsics.c(this.e, onBundleQuantityStepper.e) && Intrinsics.c(this.f, onBundleQuantityStepper.f) && Intrinsics.c(this.g, onBundleQuantityStepper.g);
        }

        public final int hashCode() {
            int iC = b.c(b.a(this.d, b.a(this.c, b.a(this.b, Integer.hashCode(this.f19444a) * 31, 31), 31), 31), 31, this.e);
            String str = this.f;
            return this.g.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbQ = a.q(this.f19444a, this.b, "OnBundleQuantityStepper(minimum=", ", maximum=", ", increment=");
            a.w(this.c, this.d, ", inCart=", ", addToCartLabel=", sbQ);
            androidx.constraintlayout.core.state.a.B(sbQ, this.e, ", maximumReachedLabel=", this.f, ", offerId=");
            return a.o(sbQ, this.g, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/UpdateCartBundleQuantitiesMutation$UpdateCartBundleQuantities;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdateCartBundleQuantities {

        /* renamed from: a, reason: collision with root package name */
        public final int f19445a;
        public final int b;
        public final UpdatedBundleQuantitySelector c;
        public final ArrayList d;

        public UpdateCartBundleQuantities(int i, int i2, UpdatedBundleQuantitySelector updatedBundleQuantitySelector, ArrayList arrayList) {
            this.f19445a = i;
            this.b = i2;
            this.c = updatedBundleQuantitySelector;
            this.d = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateCartBundleQuantities)) {
                return false;
            }
            UpdateCartBundleQuantities updateCartBundleQuantities = (UpdateCartBundleQuantities) obj;
            return this.f19445a == updateCartBundleQuantities.f19445a && this.b == updateCartBundleQuantities.b && this.c.equals(updateCartBundleQuantities.c) && this.d.equals(updateCartBundleQuantities.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + b.a(this.b, Integer.hashCode(this.f19445a) * 31, 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbQ = a.q(this.f19445a, this.b, "UpdateCartBundleQuantities(productCount=", ", totalProductCount=", ", updatedBundleQuantitySelector=");
            sbQ.append(this.c);
            sbQ.append(", updatedProductQuantities=");
            sbQ.append(this.d);
            sbQ.append(")");
            return sbQ.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/UpdateCartBundleQuantitiesMutation$UpdatedBundleQuantitySelector;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdatedBundleQuantitySelector {

        /* renamed from: a, reason: collision with root package name */
        public final String f19446a;
        public final OnBundleQuantityStepper b;

        public UpdatedBundleQuantitySelector(String str, OnBundleQuantityStepper onBundleQuantityStepper) {
            this.f19446a = str;
            this.b = onBundleQuantityStepper;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdatedBundleQuantitySelector)) {
                return false;
            }
            UpdatedBundleQuantitySelector updatedBundleQuantitySelector = (UpdatedBundleQuantitySelector) obj;
            return Intrinsics.c(this.f19446a, updatedBundleQuantitySelector.f19446a) && Intrinsics.c(this.b, updatedBundleQuantitySelector.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19446a.hashCode() * 31);
        }

        public final String toString() {
            return "UpdatedBundleQuantitySelector(__typename=" + this.f19446a + ", onBundleQuantityStepper=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/UpdateCartBundleQuantitiesMutation$UpdatedProductQuantity;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdatedProductQuantity {

        /* renamed from: a, reason: collision with root package name */
        public final String f19447a;
        public final double b;
        public final boolean c;
        public final Error d;
        public final Double e;
        public final String f;
        public final CartProductQuantityAction g;

        public UpdatedProductQuantity(String str, double d, boolean z, Error error, Double d2, String str2, CartProductQuantityAction cartProductQuantityAction) {
            this.f19447a = str;
            this.b = d;
            this.c = z;
            this.d = error;
            this.e = d2;
            this.f = str2;
            this.g = cartProductQuantityAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdatedProductQuantity)) {
                return false;
            }
            UpdatedProductQuantity updatedProductQuantity = (UpdatedProductQuantity) obj;
            return Intrinsics.c(this.f19447a, updatedProductQuantity.f19447a) && Double.compare(this.b, updatedProductQuantity.b) == 0 && this.c == updatedProductQuantity.c && Intrinsics.c(this.d, updatedProductQuantity.d) && Intrinsics.c(this.e, updatedProductQuantity.e) && Intrinsics.c(this.f, updatedProductQuantity.f) && this.g == updatedProductQuantity.g;
        }

        public final int hashCode() {
            int iE = b.e(android.support.v4.media.session.a.a(this.b, this.f19447a.hashCode() * 31, 31), 31, this.c);
            Error error = this.d;
            int iHashCode = (iE + (error == null ? 0 : error.hashCode())) * 31;
            Double d = this.e;
            int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
            String str = this.f;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            CartProductQuantityAction cartProductQuantityAction = this.g;
            return iHashCode3 + (cartProductQuantityAction != null ? cartProductQuantityAction.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbR = au.com.woolworths.android.onesite.a.r(this.b, "UpdatedProductQuantity(productId=", this.f19447a, ", updatedQuantity=");
            sbR.append(", success=");
            sbR.append(this.c);
            sbR.append(", error=");
            sbR.append(this.d);
            sbR.append(", deltaQuantity=");
            sbR.append(this.e);
            sbR.append(", deltaSubtotal=");
            sbR.append(this.f);
            sbR.append(", productQuantityAction=");
            sbR.append(this.g);
            sbR.append(")");
            return sbR.toString();
        }
    }

    public UpdateCartBundleQuantitiesMutation(UpdateCartBundleQuantitiesInput updateCartBundleQuantitiesInput) {
        this.f19441a = updateCartBundleQuantitiesInput;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(UpdateCartBundleQuantitiesMutation_ResponseAdapter.Data.f19496a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation UpdateCartBundleQuantities($input: UpdateCartBundleQuantitiesInput!) { updateCartBundleQuantities(updateCartBundleQuantitiesInput: $input) { productCount totalProductCount updatedBundleQuantitySelector { __typename ... on BundleQuantityStepper { minimum maximum increment inCart addToCartLabel maximumReachedLabel offerId } } updatedProductQuantities { productId updatedQuantity success error { reason message } deltaQuantity deltaSubtotal productQuantityAction } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdateCartBundleQuantitiesMutation) && Intrinsics.c(this.f19441a, ((UpdateCartBundleQuantitiesMutation) obj).f19441a);
    }

    public final int hashCode() {
        return this.f19441a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "333af1604bc17598ef5efd192a47da65a5279bbee496c7605e6eeebd983af41f";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "UpdateCartBundleQuantities";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("input");
        Adapters.c(UpdateCartBundleQuantitiesInput_InputAdapter.f12133a, false).toJson(jsonWriter, customScalarAdapters, this.f19441a);
    }

    public final String toString() {
        return "UpdateCartBundleQuantitiesMutation(input=" + this.f19441a + ")";
    }
}
