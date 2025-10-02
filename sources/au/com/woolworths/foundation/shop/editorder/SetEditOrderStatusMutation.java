package au.com.woolworths.foundation.shop.editorder;

import au.com.woolworths.foundation.shop.editorder.adapter.SetEditOrderStatusMutation_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.EditOrderMode;
import au.com.woolworths.shop.graphql.type.EditOrderReason;
import au.com.woolworths.shop.graphql.type.SetEditOrderStatusInput;
import au.com.woolworths.shop.graphql.type.adapter.SetEditOrderStatusInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/SetEditOrderStatusMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lau/com/woolworths/foundation/shop/editorder/SetEditOrderStatusMutation$Data;", "Data", "SetEditOrderStatus", "Companion", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SetEditOrderStatusMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final SetEditOrderStatusInput f8729a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/SetEditOrderStatusMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/SetEditOrderStatusMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final SetEditOrderStatus f8730a;

        public Data(SetEditOrderStatus setEditOrderStatus) {
            this.f8730a = setEditOrderStatus;
        }

        /* renamed from: a, reason: from getter */
        public final SetEditOrderStatus getF8730a() {
            return this.f8730a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f8730a, ((Data) obj).f8730a);
        }

        public final int hashCode() {
            return this.f8730a.hashCode();
        }

        public final String toString() {
            return "Data(setEditOrderStatus=" + this.f8730a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/SetEditOrderStatusMutation$SetEditOrderStatus;", "", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SetEditOrderStatus {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f8731a;
        public final EditOrderReason b;
        public final String c;
        public final EditOrderMode d;

        public SetEditOrderStatus(boolean z, EditOrderReason editOrderReason, String str, EditOrderMode editOrderMode) {
            this.f8731a = z;
            this.b = editOrderReason;
            this.c = str;
            this.d = editOrderMode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetEditOrderStatus)) {
                return false;
            }
            SetEditOrderStatus setEditOrderStatus = (SetEditOrderStatus) obj;
            return this.f8731a == setEditOrderStatus.f8731a && this.b == setEditOrderStatus.b && Intrinsics.c(this.c, setEditOrderStatus.c) && this.d == setEditOrderStatus.d;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f8731a) * 31;
            EditOrderReason editOrderReason = this.b;
            int iHashCode2 = (iHashCode + (editOrderReason == null ? 0 : editOrderReason.hashCode())) * 31;
            String str = this.c;
            return this.d.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "SetEditOrderStatus(success=" + this.f8731a + ", reason=" + this.b + ", message=" + this.c + ", currentMode=" + this.d + ")";
        }
    }

    public SetEditOrderStatusMutation(SetEditOrderStatusInput setEditOrderStatusInput) {
        this.f8729a = setEditOrderStatusInput;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(SetEditOrderStatusMutation_ResponseAdapter.Data.f8738a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation setEditOrderStatus($setEditOrderStatusInput: SetEditOrderStatusInput!) { setEditOrderStatus(setEditOrderStatusInput: $setEditOrderStatusInput) { success reason message currentMode } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SetEditOrderStatusMutation) && Intrinsics.c(this.f8729a, ((SetEditOrderStatusMutation) obj).f8729a);
    }

    public final int hashCode() {
        return this.f8729a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "e83b050609a887a1b1ad25dedc39a5bfddcd32ae5c4fb57c264e472f78cd329c";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "setEditOrderStatus";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("setEditOrderStatusInput");
        Adapters.c(SetEditOrderStatusInput_InputAdapter.f12116a, false).toJson(jsonWriter, customScalarAdapters, this.f8729a);
    }

    public final String toString() {
        return "SetEditOrderStatusMutation(setEditOrderStatusInput=" + this.f8729a + ")";
    }
}
