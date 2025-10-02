package au.com.woolworths.modules.address;

import au.com.woolworths.android.onesite.a;
import au.com.woolworths.modules.address.adapter.SearchSuburbsQuery_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/modules/address/SearchSuburbsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/modules/address/SearchSuburbsQuery$Data;", "Data", "SearchSuburb", "Companion", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SearchSuburbsQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f9064a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/modules/address/SearchSuburbsQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/address/SearchSuburbsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final List f9065a;

        public Data(List list) {
            this.f9065a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f9065a, ((Data) obj).f9065a);
        }

        public final int hashCode() {
            List list = this.f9065a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final String toString() {
            return a.l("Data(searchSuburbs=", ")", this.f9065a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/address/SearchSuburbsQuery$SearchSuburb;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SearchSuburb {

        /* renamed from: a, reason: collision with root package name */
        public final String f9066a;
        public final String b;
        public final String c;

        public SearchSuburb(String str, String str2, String str3) {
            this.f9066a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchSuburb)) {
                return false;
            }
            SearchSuburb searchSuburb = (SearchSuburb) obj;
            return Intrinsics.c(this.f9066a, searchSuburb.f9066a) && Intrinsics.c(this.b, searchSuburb.b) && Intrinsics.c(this.c, searchSuburb.c);
        }

        public final int hashCode() {
            String str = this.f9066a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return YU.a.o(YU.a.v("SearchSuburb(id=", this.f9066a, ", text=", this.b, ", postcode="), this.c, ")");
        }
    }

    public SearchSuburbsQuery(String postcode) {
        Intrinsics.h(postcode, "postcode");
        this.f9064a = postcode;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(SearchSuburbsQuery_ResponseAdapter.Data.f9074a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query searchSuburbs($postcode: String!) { searchSuburbs(postcode: $postcode) { id text postcode } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchSuburbsQuery) && Intrinsics.c(this.f9064a, ((SearchSuburbsQuery) obj).f9064a);
    }

    public final int hashCode() {
        return this.f9064a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "8cf261363947e0273da89e94ee34ebb011f0c43a1a8b2ffa75b5957b1e58df8f";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "searchSuburbs";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("postcode");
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.f9064a);
    }

    public final String toString() {
        return YU.a.h("SearchSuburbsQuery(postcode=", this.f9064a, ")");
    }
}
