package au.com.woolworths.modules.address;

import au.com.woolworths.android.onesite.a;
import au.com.woolworths.modules.address.adapter.SearchAddressesQuery_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.actions.SearchIntents;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/modules/address/SearchAddressesQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/modules/address/SearchAddressesQuery$Data;", "Data", "SearchAddress", "Companion", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SearchAddressesQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f9061a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/modules/address/SearchAddressesQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/address/SearchAddressesQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final List f9062a;

        public Data(List list) {
            this.f9062a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f9062a, ((Data) obj).f9062a);
        }

        public final int hashCode() {
            List list = this.f9062a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final String toString() {
            return a.l("Data(searchAddresses=", ")", this.f9062a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/address/SearchAddressesQuery$SearchAddress;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SearchAddress {

        /* renamed from: a, reason: collision with root package name */
        public final String f9063a;
        public final String b;
        public final String c;

        public SearchAddress(String str, String str2, String str3) {
            this.f9063a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchAddress)) {
                return false;
            }
            SearchAddress searchAddress = (SearchAddress) obj;
            return Intrinsics.c(this.f9063a, searchAddress.f9063a) && Intrinsics.c(this.b, searchAddress.b) && Intrinsics.c(this.c, searchAddress.c);
        }

        public final int hashCode() {
            String str = this.f9063a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return YU.a.o(YU.a.v("SearchAddress(id=", this.f9063a, ", text=", this.b, ", postcode="), this.c, ")");
        }
    }

    public SearchAddressesQuery(String query) {
        Intrinsics.h(query, "query");
        this.f9061a = query;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(SearchAddressesQuery_ResponseAdapter.Data.f9072a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query SearchAddresses($query: String!) { searchAddresses(query: $query) { id text postcode } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchAddressesQuery) && Intrinsics.c(this.f9061a, ((SearchAddressesQuery) obj).f9061a);
    }

    public final int hashCode() {
        return this.f9061a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "50849c0d8ddca34891aaff0a346453018b42201c33d5c5de17ce6cdbb1a543cc";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "SearchAddresses";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1(SearchIntents.EXTRA_QUERY);
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.f9061a);
    }

    public final String toString() {
        return YU.a.h("SearchAddressesQuery(query=", this.f9061a, ")");
    }
}
