package com.woolworths.feature.shop.myorders;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.PickupOrderLocationUpdateInput;
import au.com.woolworths.shop.graphql.type.adapter.PickupOrderLocationUpdateInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.myorders.adapter.UpdatePickupOrderLocationMutation_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/myorders/UpdatePickupOrderLocationMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/feature/shop/myorders/UpdatePickupOrderLocationMutation$Data;", "Data", "UpdatePickupOrderLocation", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UpdatePickupOrderLocationMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final PickupOrderLocationUpdateInput f20025a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/myorders/UpdatePickupOrderLocationMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/UpdatePickupOrderLocationMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final UpdatePickupOrderLocation f20026a;

        public Data(UpdatePickupOrderLocation updatePickupOrderLocation) {
            this.f20026a = updatePickupOrderLocation;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20026a, ((Data) obj).f20026a);
        }

        public final int hashCode() {
            UpdatePickupOrderLocation updatePickupOrderLocation = this.f20026a;
            if (updatePickupOrderLocation == null) {
                return 0;
            }
            return updatePickupOrderLocation.hashCode();
        }

        public final String toString() {
            return "Data(updatePickupOrderLocation=" + this.f20026a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/UpdatePickupOrderLocationMutation$UpdatePickupOrderLocation;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdatePickupOrderLocation {

        /* renamed from: a, reason: collision with root package name */
        public final int f20027a;
        public final int b;
        public final boolean c;

        public UpdatePickupOrderLocation(int i, int i2, boolean z) {
            this.f20027a = i;
            this.b = i2;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdatePickupOrderLocation)) {
                return false;
            }
            UpdatePickupOrderLocation updatePickupOrderLocation = (UpdatePickupOrderLocation) obj;
            return this.f20027a == updatePickupOrderLocation.f20027a && this.b == updatePickupOrderLocation.b && this.c == updatePickupOrderLocation.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + b.a(this.b, Integer.hashCode(this.f20027a) * 31, 31);
        }

        public final String toString() {
            return a.k(")", a.q(this.f20027a, this.b, "UpdatePickupOrderLocation(travelTimeInSec=", ", bufferTimeInSec=", ", stopLocationTracking="), this.c);
        }
    }

    public UpdatePickupOrderLocationMutation(PickupOrderLocationUpdateInput pickupOrderLocationUpdateInput) {
        this.f20025a = pickupOrderLocationUpdateInput;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(UpdatePickupOrderLocationMutation_ResponseAdapter.Data.f20190a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation updatePickupOrderLocation($pickupOrderLocationUpdateInput: PickupOrderLocationUpdateInput!) { updatePickupOrderLocation(pickupOrderLocationUpdateInput: $pickupOrderLocationUpdateInput) { travelTimeInSec bufferTimeInSec stopLocationTracking } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdatePickupOrderLocationMutation) && Intrinsics.c(this.f20025a, ((UpdatePickupOrderLocationMutation) obj).f20025a);
    }

    public final int hashCode() {
        return this.f20025a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "1d98397d0fcd090748b57eaf9ef36bf2634f89abc6594dbb19ce0453c83ad6f0";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "updatePickupOrderLocation";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("pickupOrderLocationUpdateInput");
        Adapters.c(PickupOrderLocationUpdateInput_InputAdapter.f12098a, false).toJson(jsonWriter, customScalarAdapters, this.f20025a);
    }

    public final String toString() {
        return "UpdatePickupOrderLocationMutation(pickupOrderLocationUpdateInput=" + this.f20025a + ")";
    }
}
