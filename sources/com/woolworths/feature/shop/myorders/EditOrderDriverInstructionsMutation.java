package com.woolworths.feature.shop.myorders;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.EditOrderDriverInstructionsInput;
import au.com.woolworths.shop.graphql.type.EditOrderDriverInstructionsReason;
import au.com.woolworths.shop.graphql.type.adapter.EditOrderDriverInstructionsInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.myorders.adapter.EditOrderDriverInstructionsMutation_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/myorders/EditOrderDriverInstructionsMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/feature/shop/myorders/EditOrderDriverInstructionsMutation$Data;", "Data", "EditOrderDriverInstructions", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EditOrderDriverInstructionsMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final EditOrderDriverInstructionsInput f19855a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/myorders/EditOrderDriverInstructionsMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/EditOrderDriverInstructionsMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final EditOrderDriverInstructions f19856a;

        public Data(EditOrderDriverInstructions editOrderDriverInstructions) {
            this.f19856a = editOrderDriverInstructions;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f19856a, ((Data) obj).f19856a);
        }

        public final int hashCode() {
            return this.f19856a.hashCode();
        }

        public final String toString() {
            return "Data(editOrderDriverInstructions=" + this.f19856a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/EditOrderDriverInstructionsMutation$EditOrderDriverInstructions;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EditOrderDriverInstructions {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f19857a;
        public final EditOrderDriverInstructionsReason b;
        public final String c;

        public EditOrderDriverInstructions(boolean z, EditOrderDriverInstructionsReason editOrderDriverInstructionsReason, String str) {
            this.f19857a = z;
            this.b = editOrderDriverInstructionsReason;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EditOrderDriverInstructions)) {
                return false;
            }
            EditOrderDriverInstructions editOrderDriverInstructions = (EditOrderDriverInstructions) obj;
            return this.f19857a == editOrderDriverInstructions.f19857a && this.b == editOrderDriverInstructions.b && Intrinsics.c(this.c, editOrderDriverInstructions.c);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f19857a) * 31;
            EditOrderDriverInstructionsReason editOrderDriverInstructionsReason = this.b;
            int iHashCode2 = (iHashCode + (editOrderDriverInstructionsReason == null ? 0 : editOrderDriverInstructionsReason.hashCode())) * 31;
            String str = this.c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EditOrderDriverInstructions(success=");
            sb.append(this.f19857a);
            sb.append(", reason=");
            sb.append(this.b);
            sb.append(", message=");
            return a.o(sb, this.c, ")");
        }
    }

    public EditOrderDriverInstructionsMutation(EditOrderDriverInstructionsInput editOrderDriverInstructionsInput) {
        Intrinsics.h(editOrderDriverInstructionsInput, "editOrderDriverInstructionsInput");
        this.f19855a = editOrderDriverInstructionsInput;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(EditOrderDriverInstructionsMutation_ResponseAdapter.Data.f20030a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation editOrderDriverInstructions($editOrderDriverInstructionsInput: EditOrderDriverInstructionsInput!) { editOrderDriverInstructions(editOrderDriverInstructionsInput: $editOrderDriverInstructionsInput) { success reason message } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EditOrderDriverInstructionsMutation) && Intrinsics.c(this.f19855a, ((EditOrderDriverInstructionsMutation) obj).f19855a);
    }

    public final int hashCode() {
        return this.f19855a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "ddddb3dda35db5f8080834d0b511f18b975878685468eebe3ad53dec7f11172d";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "editOrderDriverInstructions";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("editOrderDriverInstructionsInput");
        Adapters.c(EditOrderDriverInstructionsInput_InputAdapter.f12072a, false).toJson(jsonWriter, customScalarAdapters, this.f19855a);
    }

    public final String toString() {
        return "EditOrderDriverInstructionsMutation(editOrderDriverInstructionsInput=" + this.f19855a + ")";
    }
}
