package au.com.woolworths.foundation.deeplink.resolver;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.deeplink.resolver.adapter.DeepLinkQuery_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.DeepLinkInput;
import au.com.woolworths.shop.graphql.type.adapter.DeepLinkInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/foundation/deeplink/resolver/DeepLinkQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/foundation/deeplink/resolver/DeepLinkQuery$Data;", "Data", "Companion", "deeplink-resolver_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeepLinkQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final DeepLinkInput f8487a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/deeplink/resolver/DeepLinkQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "deeplink-resolver_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/deeplink/resolver/DeepLinkQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "deeplink-resolver_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final String f8488a;

        public Data(String str) {
            this.f8488a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f8488a, ((Data) obj).f8488a);
        }

        public final int hashCode() {
            String str = this.f8488a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return a.h("Data(deepLink=", this.f8488a, ")");
        }
    }

    public DeepLinkQuery(DeepLinkInput deepLinkInput) {
        this.f8487a = deepLinkInput;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(DeepLinkQuery_ResponseAdapter.Data.f8489a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query DeepLink($deepLinkInput: DeepLinkInput!) { deepLink(deepLinkInput: $deepLinkInput) }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeepLinkQuery) && Intrinsics.c(this.f8487a, ((DeepLinkQuery) obj).f8487a);
    }

    public final int hashCode() {
        return this.f8487a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "c349c2765369f51ea3e8c1c34e1573615431b416d22b53121501d416aecd6e1c";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "DeepLink";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("deepLinkInput");
        Adapters.c(DeepLinkInput_InputAdapter.f12062a, false).toJson(jsonWriter, customScalarAdapters, this.f8487a);
    }

    public final String toString() {
        return "DeepLinkQuery(deepLinkInput=" + this.f8487a + ")";
    }
}
