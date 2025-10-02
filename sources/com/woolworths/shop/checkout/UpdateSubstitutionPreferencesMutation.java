package com.woolworths.shop.checkout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.shop.graphql.type.UserSubstitutionPreferencesInput;
import au.com.woolworths.shop.graphql.type.adapter.UserSubstitutionPreferencesInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.checkout.adapter.UpdateSubstitutionPreferencesMutation_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/woolworths/shop/checkout/UpdateSubstitutionPreferencesMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/shop/checkout/UpdateSubstitutionPreferencesMutation$Data;", "Data", "UpdateSubstitutionPreferences", "OnUpdateSubstitutionPreferencesSuccessResponse", "Companion", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class UpdateSubstitutionPreferencesMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final UserSubstitutionPreferencesInput f21936a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/checkout/UpdateSubstitutionPreferencesMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/UpdateSubstitutionPreferencesMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final UpdateSubstitutionPreferences f21937a;

        public Data(UpdateSubstitutionPreferences updateSubstitutionPreferences) {
            this.f21937a = updateSubstitutionPreferences;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21937a, ((Data) obj).f21937a);
        }

        public final int hashCode() {
            return this.f21937a.hashCode();
        }

        public final String toString() {
            return "Data(updateSubstitutionPreferences=" + this.f21937a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/UpdateSubstitutionPreferencesMutation$OnUpdateSubstitutionPreferencesSuccessResponse;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnUpdateSubstitutionPreferencesSuccessResponse {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f21938a;

        public OnUpdateSubstitutionPreferencesSuccessResponse(boolean z) {
            this.f21938a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnUpdateSubstitutionPreferencesSuccessResponse) && this.f21938a == ((OnUpdateSubstitutionPreferencesSuccessResponse) obj).f21938a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f21938a);
        }

        public final String toString() {
            return a.n("OnUpdateSubstitutionPreferencesSuccessResponse(isSuccess=", ")", this.f21938a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/UpdateSubstitutionPreferencesMutation$UpdateSubstitutionPreferences;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdateSubstitutionPreferences {

        /* renamed from: a, reason: collision with root package name */
        public final String f21939a;
        public final OnUpdateSubstitutionPreferencesSuccessResponse b;

        public UpdateSubstitutionPreferences(String __typename, OnUpdateSubstitutionPreferencesSuccessResponse onUpdateSubstitutionPreferencesSuccessResponse) {
            Intrinsics.h(__typename, "__typename");
            this.f21939a = __typename;
            this.b = onUpdateSubstitutionPreferencesSuccessResponse;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateSubstitutionPreferences)) {
                return false;
            }
            UpdateSubstitutionPreferences updateSubstitutionPreferences = (UpdateSubstitutionPreferences) obj;
            return Intrinsics.c(this.f21939a, updateSubstitutionPreferences.f21939a) && Intrinsics.c(this.b, updateSubstitutionPreferences.b);
        }

        public final int hashCode() {
            int iHashCode = this.f21939a.hashCode() * 31;
            OnUpdateSubstitutionPreferencesSuccessResponse onUpdateSubstitutionPreferencesSuccessResponse = this.b;
            return iHashCode + (onUpdateSubstitutionPreferencesSuccessResponse == null ? 0 : Boolean.hashCode(onUpdateSubstitutionPreferencesSuccessResponse.f21938a));
        }

        public final String toString() {
            return "UpdateSubstitutionPreferences(__typename=" + this.f21939a + ", onUpdateSubstitutionPreferencesSuccessResponse=" + this.b + ")";
        }
    }

    public UpdateSubstitutionPreferencesMutation(UserSubstitutionPreferencesInput userSubstitutionPreferencesInput) {
        this.f21936a = userSubstitutionPreferencesInput;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(UpdateSubstitutionPreferencesMutation_ResponseAdapter.Data.f22055a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation updateSubstitutionPreferences($preference: UserSubstitutionPreferencesInput!) { updateSubstitutionPreferences(preferences: $preference) { __typename ... on UpdateSubstitutionPreferencesSuccessResponse { isSuccess } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdateSubstitutionPreferencesMutation) && Intrinsics.c(this.f21936a, ((UpdateSubstitutionPreferencesMutation) obj).f21936a);
    }

    public final int hashCode() {
        return this.f21936a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "aa23b7db4539da5492454ebcdf8a9af9210abf5418ed4550bc64b6194033c685";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "updateSubstitutionPreferences";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("preference");
        Adapters.c(UserSubstitutionPreferencesInput_InputAdapter.f12141a, false).toJson(jsonWriter, customScalarAdapters, this.f21936a);
    }

    public final String toString() {
        return "UpdateSubstitutionPreferencesMutation(preference=" + this.f21936a + ")";
    }
}
