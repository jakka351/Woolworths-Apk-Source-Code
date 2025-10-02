package com.woolworths.shop.cart;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.foundation.shop.prompt.handler.fragment.Prompts;
import au.com.woolworths.shop.graphql.type.CartProductQuantityAction;
import au.com.woolworths.shop.graphql.type.UpdateCartProductQuantitiesInput;
import au.com.woolworths.shop.graphql.type.UpdateCartProductQuantityFailedReason;
import au.com.woolworths.shop.graphql.type.adapter.UpdateCartProductQuantitiesInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.cart.adapter.UpdateCartProductQuantitiesLiteMutation_ResponseAdapter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/woolworths/shop/cart/UpdateCartProductQuantitiesLiteMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/shop/cart/UpdateCartProductQuantitiesLiteMutation$Data;", "Data", "UpdateCartProductQuantities", "UpdatedProductQuantity", "Error", "ErrorPrompt", "Companion", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class UpdateCartProductQuantitiesLiteMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final UpdateCartProductQuantitiesInput f21553a;
    public final boolean b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/cart/UpdateCartProductQuantitiesLiteMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/UpdateCartProductQuantitiesLiteMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final UpdateCartProductQuantities f21554a;

        public Data(UpdateCartProductQuantities updateCartProductQuantities) {
            this.f21554a = updateCartProductQuantities;
        }

        /* renamed from: a, reason: from getter */
        public final UpdateCartProductQuantities getF21554a() {
            return this.f21554a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21554a, ((Data) obj).f21554a);
        }

        public final int hashCode() {
            return this.f21554a.hashCode();
        }

        public final String toString() {
            return "Data(updateCartProductQuantities=" + this.f21554a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/UpdateCartProductQuantitiesLiteMutation$Error;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Error {

        /* renamed from: a, reason: collision with root package name */
        public final UpdateCartProductQuantityFailedReason f21555a;
        public final String b;

        public Error(UpdateCartProductQuantityFailedReason updateCartProductQuantityFailedReason, String str) {
            this.f21555a = updateCartProductQuantityFailedReason;
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
            return this.f21555a == error.f21555a && Intrinsics.c(this.b, error.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21555a.hashCode() * 31);
        }

        public final String toString() {
            return "Error(reason=" + this.f21555a + ", message=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/UpdateCartProductQuantitiesLiteMutation$ErrorPrompt;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ErrorPrompt {

        /* renamed from: a, reason: collision with root package name */
        public final String f21556a;
        public final Prompts b;

        public ErrorPrompt(String str, Prompts prompts) {
            this.f21556a = str;
            this.b = prompts;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ErrorPrompt)) {
                return false;
            }
            ErrorPrompt errorPrompt = (ErrorPrompt) obj;
            return Intrinsics.c(this.f21556a, errorPrompt.f21556a) && Intrinsics.c(this.b, errorPrompt.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21556a.hashCode() * 31);
        }

        public final String toString() {
            return "ErrorPrompt(__typename=" + this.f21556a + ", prompts=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/UpdateCartProductQuantitiesLiteMutation$UpdateCartProductQuantities;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdateCartProductQuantities {

        /* renamed from: a, reason: collision with root package name */
        public final int f21557a;
        public final int b;
        public final ArrayList c;
        public final ErrorPrompt d;

        public UpdateCartProductQuantities(int i, int i2, ArrayList arrayList, ErrorPrompt errorPrompt) {
            this.f21557a = i;
            this.b = i2;
            this.c = arrayList;
            this.d = errorPrompt;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateCartProductQuantities)) {
                return false;
            }
            UpdateCartProductQuantities updateCartProductQuantities = (UpdateCartProductQuantities) obj;
            return this.f21557a == updateCartProductQuantities.f21557a && this.b == updateCartProductQuantities.b && this.c.equals(updateCartProductQuantities.c) && Intrinsics.c(this.d, updateCartProductQuantities.d);
        }

        public final int hashCode() {
            int iB = a.b(b.a(this.b, Integer.hashCode(this.f21557a) * 31, 31), 31, this.c);
            ErrorPrompt errorPrompt = this.d;
            return iB + (errorPrompt == null ? 0 : errorPrompt.hashCode());
        }

        public final String toString() {
            StringBuilder sbQ = YU.a.q(this.f21557a, this.b, "UpdateCartProductQuantities(productCount=", ", totalProductCount=", ", updatedProductQuantities=");
            sbQ.append(this.c);
            sbQ.append(", errorPrompt=");
            sbQ.append(this.d);
            sbQ.append(")");
            return sbQ.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/UpdateCartProductQuantitiesLiteMutation$UpdatedProductQuantity;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdatedProductQuantity {

        /* renamed from: a, reason: collision with root package name */
        public final String f21558a;
        public final double b;
        public final boolean c;
        public final Error d;
        public final Double e;
        public final String f;
        public final CartProductQuantityAction g;

        public UpdatedProductQuantity(String str, double d, boolean z, Error error, Double d2, String str2, CartProductQuantityAction cartProductQuantityAction) {
            this.f21558a = str;
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
            return Intrinsics.c(this.f21558a, updatedProductQuantity.f21558a) && Double.compare(this.b, updatedProductQuantity.b) == 0 && this.c == updatedProductQuantity.c && Intrinsics.c(this.d, updatedProductQuantity.d) && Intrinsics.c(this.e, updatedProductQuantity.e) && Intrinsics.c(this.f, updatedProductQuantity.f) && this.g == updatedProductQuantity.g;
        }

        public final int hashCode() {
            int iE = b.e(android.support.v4.media.session.a.a(this.b, this.f21558a.hashCode() * 31, 31), 31, this.c);
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
            StringBuilder sbR = au.com.woolworths.android.onesite.a.r(this.b, "UpdatedProductQuantity(productId=", this.f21558a, ", updatedQuantity=");
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

    public UpdateCartProductQuantitiesLiteMutation(UpdateCartProductQuantitiesInput updateCartProductQuantitiesInput, boolean z) {
        this.f21553a = updateCartProductQuantitiesInput;
        this.b = z;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(UpdateCartProductQuantitiesLiteMutation_ResponseAdapter.Data.f21610a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation UpdateCartProductQuantitiesLite($input: UpdateCartProductQuantitiesInput!, $isPromptEnabled: Boolean!) { updateCartProductQuantities(updateCartProductQuantitiesInput: $input) { productCount totalProductCount updatedProductQuantities { productId updatedQuantity success error { reason message } deltaQuantity deltaSubtotal productQuantityAction } errorPrompt @include(if: $isPromptEnabled) { __typename ...prompts } } }  fragment prompts on Prompt { __typename ... on BottomSheet { bottomSheetTitle bottomSheetBody bottomSheetButtons { coreButtonStyle coreButtonLabel coreButtonAction { type action } coreButtonEnabled } } ... on PromptAlert { alertTitle alertBody alertPrimaryCta { label action { type action } } alertSecondaryCta { label action { type action } } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateCartProductQuantitiesLiteMutation)) {
            return false;
        }
        UpdateCartProductQuantitiesLiteMutation updateCartProductQuantitiesLiteMutation = (UpdateCartProductQuantitiesLiteMutation) obj;
        return Intrinsics.c(this.f21553a, updateCartProductQuantitiesLiteMutation.f21553a) && this.b == updateCartProductQuantitiesLiteMutation.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f21553a.f11992a.hashCode() * 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "58bf7f926258e1474d1d8e3cd6763dc3d0b5432b13ea768b5f58beb83ac856f4";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "UpdateCartProductQuantitiesLite";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("input");
        Adapters.c(UpdateCartProductQuantitiesInput_InputAdapter.f12134a, false).toJson(jsonWriter, customScalarAdapters, this.f21553a);
        jsonWriter.F1("isPromptEnabled");
        Adapters.f.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.b));
    }

    public final String toString() {
        return "UpdateCartProductQuantitiesLiteMutation(input=" + this.f21553a + ", isPromptEnabled=" + this.b + ")";
    }
}
