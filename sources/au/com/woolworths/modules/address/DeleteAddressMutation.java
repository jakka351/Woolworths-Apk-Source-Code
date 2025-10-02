package au.com.woolworths.modules.address;

import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.modules.address.adapter.DeleteAddressMutation_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/modules/address/DeleteAddressMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lau/com/woolworths/modules/address/DeleteAddressMutation$Data;", "Data", "Companion", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeleteAddressMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final int f9054a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/modules/address/DeleteAddressMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/address/DeleteAddressMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final Boolean f9055a;

        public Data(Boolean bool) {
            this.f9055a = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f9055a, ((Data) obj).f9055a);
        }

        public final int hashCode() {
            Boolean bool = this.f9055a;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final String toString() {
            return a.k(this.f9055a, "Data(deleteAddress=", ")");
        }
    }

    public DeleteAddressMutation(int i) {
        this.f9054a = i;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(DeleteAddressMutation_ResponseAdapter.Data.f9067a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation deleteAddress($id: Int!) { deleteAddress(id: $id) }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeleteAddressMutation) && this.f9054a == ((DeleteAddressMutation) obj).f9054a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9054a);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "f6dc5b7af7cc780de26ec7687e38b8c49d560a29072bca914e16d308c93ac33e";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "deleteAddress";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("id");
        Adapters.b.toJson(jsonWriter, customScalarAdapters, Integer.valueOf(this.f9054a));
    }

    public final String toString() {
        return YU.a.e(this.f9054a, "DeleteAddressMutation(id=", ")");
    }
}
