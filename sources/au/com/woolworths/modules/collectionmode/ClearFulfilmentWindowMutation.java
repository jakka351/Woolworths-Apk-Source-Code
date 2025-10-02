package au.com.woolworths.modules.collectionmode;

import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.modules.collectionmode.adapter.ClearFulfilmentWindowMutation_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/modules/collectionmode/ClearFulfilmentWindowMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lau/com/woolworths/modules/collectionmode/ClearFulfilmentWindowMutation$Data;", "Data", "ClearFulfilmentWindowState", "Companion", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ClearFulfilmentWindowMutation implements Mutation<Data> {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/ClearFulfilmentWindowMutation$ClearFulfilmentWindowState;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ClearFulfilmentWindowState {

        /* renamed from: a, reason: collision with root package name */
        public final Boolean f9081a;

        public ClearFulfilmentWindowState(Boolean bool) {
            this.f9081a = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClearFulfilmentWindowState) && Intrinsics.c(this.f9081a, ((ClearFulfilmentWindowState) obj).f9081a);
        }

        public final int hashCode() {
            Boolean bool = this.f9081a;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final String toString() {
            return a.k(this.f9081a, "ClearFulfilmentWindowState(_excluded=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/modules/collectionmode/ClearFulfilmentWindowMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/ClearFulfilmentWindowMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final ClearFulfilmentWindowState f9082a;

        public Data(ClearFulfilmentWindowState clearFulfilmentWindowState) {
            this.f9082a = clearFulfilmentWindowState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f9082a, ((Data) obj).f9082a);
        }

        public final int hashCode() {
            ClearFulfilmentWindowState clearFulfilmentWindowState = this.f9082a;
            if (clearFulfilmentWindowState == null) {
                return 0;
            }
            return clearFulfilmentWindowState.hashCode();
        }

        public final String toString() {
            return "Data(clearFulfilmentWindowState=" + this.f9082a + ")";
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(ClearFulfilmentWindowMutation_ResponseAdapter.Data.f9122a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation ClearFulfilmentWindow { clearFulfilmentWindowState { _excluded: _ } }";
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == ClearFulfilmentWindowMutation.class;
    }

    public final int hashCode() {
        return Reflection.f24268a.b(ClearFulfilmentWindowMutation.class).hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "7ce737eed6b478f52cea4b4619132d3c274b40fd5af186e38a89de831adce2f2";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "ClearFulfilmentWindow";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
    }
}
