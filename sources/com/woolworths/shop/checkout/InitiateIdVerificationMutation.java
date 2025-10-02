package com.woolworths.shop.checkout;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.checkout.adapter.InitiateIdVerificationMutation_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/checkout/InitiateIdVerificationMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/shop/checkout/InitiateIdVerificationMutation$Data;", "Data", "InitiateIdVerification", "Companion", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InitiateIdVerificationMutation implements Mutation<Data> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/checkout/InitiateIdVerificationMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/InitiateIdVerificationMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final InitiateIdVerification f21842a;

        public Data(InitiateIdVerification initiateIdVerification) {
            this.f21842a = initiateIdVerification;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21842a, ((Data) obj).f21842a);
        }

        public final int hashCode() {
            return this.f21842a.hashCode();
        }

        public final String toString() {
            return "Data(initiateIdVerification=" + this.f21842a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/InitiateIdVerificationMutation$InitiateIdVerification;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InitiateIdVerification {

        /* renamed from: a, reason: collision with root package name */
        public final String f21843a;
        public final String b;

        public InitiateIdVerification(String str, String str2) {
            this.f21843a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitiateIdVerification)) {
                return false;
            }
            InitiateIdVerification initiateIdVerification = (InitiateIdVerification) obj;
            return Intrinsics.c(this.f21843a, initiateIdVerification.f21843a) && Intrinsics.c(this.b, initiateIdVerification.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21843a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("InitiateIdVerification(verificationFormUrl=", this.f21843a, ", callbackUrlPattern=", this.b, ")");
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(InitiateIdVerificationMutation_ResponseAdapter.Data.f21979a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation initiateIdVerification { initiateIdVerification { verificationFormUrl callbackUrlPattern } }";
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == InitiateIdVerificationMutation.class;
    }

    public final int hashCode() {
        return Reflection.f24268a.b(InitiateIdVerificationMutation.class).hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "4f6c48d962f6c3dbdb22e12db73db28f84725171f4e5d5225e09f1b425c989c5";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "initiateIdVerification";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
    }
}
