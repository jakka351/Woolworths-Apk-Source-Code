package au.com.woolworths.modules.collectionmode;

import au.com.woolworths.modules.collectionmode.adapter.ShoppingModeVariantQuery_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.ShoppingModeId;
import au.com.woolworths.shop.graphql.type.ShoppingModeVariantState;
import au.com.woolworths.shop.graphql.type.adapter.ShoppingModeId_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/modules/collectionmode/ShoppingModeVariantQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/modules/collectionmode/ShoppingModeVariantQuery$Data;", "Data", "ShoppingMode", "Companion", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ShoppingModeVariantQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final ShoppingModeId f9118a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/modules/collectionmode/ShoppingModeVariantQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/ShoppingModeVariantQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final ShoppingMode f9119a;

        public Data(ShoppingMode shoppingMode) {
            this.f9119a = shoppingMode;
        }

        /* renamed from: a, reason: from getter */
        public final ShoppingMode getF9119a() {
            return this.f9119a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f9119a, ((Data) obj).f9119a);
        }

        public final int hashCode() {
            return this.f9119a.f9120a.hashCode();
        }

        public final String toString() {
            return "Data(shoppingMode=" + this.f9119a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/ShoppingModeVariantQuery$ShoppingMode;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ShoppingMode {

        /* renamed from: a, reason: collision with root package name */
        public final ShoppingModeVariantState f9120a;

        public ShoppingMode(ShoppingModeVariantState shoppingModeVariantState) {
            this.f9120a = shoppingModeVariantState;
        }

        /* renamed from: a, reason: from getter */
        public final ShoppingModeVariantState getF9120a() {
            return this.f9120a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShoppingMode) && this.f9120a == ((ShoppingMode) obj).f9120a;
        }

        public final int hashCode() {
            return this.f9120a.hashCode();
        }

        public final String toString() {
            return "ShoppingMode(state=" + this.f9120a + ")";
        }
    }

    public ShoppingModeVariantQuery(ShoppingModeId shoppingModeId) {
        this.f9118a = shoppingModeId;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(ShoppingModeVariantQuery_ResponseAdapter.Data.f9158a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query ShoppingModeVariant($shoppingModeId: ShoppingModeId!) { shoppingMode(id: $shoppingModeId) { state } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShoppingModeVariantQuery) && this.f9118a == ((ShoppingModeVariantQuery) obj).f9118a;
    }

    public final int hashCode() {
        return this.f9118a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "203d3b18a4419b552595628091585d9a0793d585466fd4100d21a18b12d8903d";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "ShoppingModeVariant";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("shoppingModeId");
        ShoppingModeId_ResponseAdapter.b(jsonWriter, customScalarAdapters, this.f9118a);
    }

    public final String toString() {
        return "ShoppingModeVariantQuery(shoppingModeId=" + this.f9118a + ")";
    }
}
