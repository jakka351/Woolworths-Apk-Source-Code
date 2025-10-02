package com.woolworths.feature.shop.myorders;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.ToggleOrderLeaveUnattendedInput;
import au.com.woolworths.shop.graphql.type.ToggleOrderLeaveUnattendedReason;
import au.com.woolworths.shop.graphql.type.adapter.ToggleOrderLeaveUnattendedInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.myorders.adapter.ToggleOrderLeaveUnattendedMutation_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/myorders/ToggleOrderLeaveUnattendedMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/feature/shop/myorders/ToggleOrderLeaveUnattendedMutation$Data;", "Data", "ToggleOrderLeaveUnattended", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ToggleOrderLeaveUnattendedMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final ToggleOrderLeaveUnattendedInput f20022a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/myorders/ToggleOrderLeaveUnattendedMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/ToggleOrderLeaveUnattendedMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final ToggleOrderLeaveUnattended f20023a;

        public Data(ToggleOrderLeaveUnattended toggleOrderLeaveUnattended) {
            this.f20023a = toggleOrderLeaveUnattended;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20023a, ((Data) obj).f20023a);
        }

        public final int hashCode() {
            return this.f20023a.hashCode();
        }

        public final String toString() {
            return "Data(toggleOrderLeaveUnattended=" + this.f20023a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/ToggleOrderLeaveUnattendedMutation$ToggleOrderLeaveUnattended;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ToggleOrderLeaveUnattended {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f20024a;
        public final ToggleOrderLeaveUnattendedReason b;
        public final String c;

        public ToggleOrderLeaveUnattended(boolean z, ToggleOrderLeaveUnattendedReason toggleOrderLeaveUnattendedReason, String str) {
            this.f20024a = z;
            this.b = toggleOrderLeaveUnattendedReason;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ToggleOrderLeaveUnattended)) {
                return false;
            }
            ToggleOrderLeaveUnattended toggleOrderLeaveUnattended = (ToggleOrderLeaveUnattended) obj;
            return this.f20024a == toggleOrderLeaveUnattended.f20024a && this.b == toggleOrderLeaveUnattended.b && Intrinsics.c(this.c, toggleOrderLeaveUnattended.c);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f20024a) * 31;
            ToggleOrderLeaveUnattendedReason toggleOrderLeaveUnattendedReason = this.b;
            int iHashCode2 = (iHashCode + (toggleOrderLeaveUnattendedReason == null ? 0 : toggleOrderLeaveUnattendedReason.hashCode())) * 31;
            String str = this.c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ToggleOrderLeaveUnattended(success=");
            sb.append(this.f20024a);
            sb.append(", reason=");
            sb.append(this.b);
            sb.append(", message=");
            return a.o(sb, this.c, ")");
        }
    }

    public ToggleOrderLeaveUnattendedMutation(ToggleOrderLeaveUnattendedInput toggleOrderLeaveUnattendedInput) {
        this.f20022a = toggleOrderLeaveUnattendedInput;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(ToggleOrderLeaveUnattendedMutation_ResponseAdapter.Data.f20188a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation toggleOrderLeaveUnattended($input: ToggleOrderLeaveUnattendedInput!) { toggleOrderLeaveUnattended(toggleOrderLeaveUnattendedInput: $input) { success reason message } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ToggleOrderLeaveUnattendedMutation) && Intrinsics.c(this.f20022a, ((ToggleOrderLeaveUnattendedMutation) obj).f20022a);
    }

    public final int hashCode() {
        return this.f20022a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "404d7a4567058ac62a16ac448a482c45eaeb9136be66b2dca60a3ad7e60c32b5";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "toggleOrderLeaveUnattended";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("input");
        Adapters.c(ToggleOrderLeaveUnattendedInput_InputAdapter.f12128a, false).toJson(jsonWriter, customScalarAdapters, this.f20022a);
    }

    public final String toString() {
        return "ToggleOrderLeaveUnattendedMutation(input=" + this.f20022a + ")";
    }
}
