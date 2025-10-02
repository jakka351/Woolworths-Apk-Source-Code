package au.com.woolworths.foundation.wxid.shop;

import au.com.woolworths.android.onesite.a;
import au.com.woolworths.foundation.wxid.shop.adapter.WxidDetailsQuery_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/wxid/shop/WxidDetailsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/foundation/wxid/shop/WxidDetailsQuery$Data;", "Data", "WxidDetails", "Companion", "wxid-data-shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WxidDetailsQuery implements Query<Data> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/wxid/shop/WxidDetailsQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "wxid-data-shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/wxid/shop/WxidDetailsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "wxid-data-shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final WxidDetails f8940a;

        public Data(WxidDetails wxidDetails) {
            this.f8940a = wxidDetails;
        }

        /* renamed from: a, reason: from getter */
        public final WxidDetails getF8940a() {
            return this.f8940a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f8940a, ((Data) obj).f8940a);
        }

        public final int hashCode() {
            return this.f8940a.hashCode();
        }

        public final String toString() {
            return "Data(wxidDetails=" + this.f8940a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/wxid/shop/WxidDetailsQuery$WxidDetails;", "", "wxid-data-shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class WxidDetails {

        /* renamed from: a, reason: collision with root package name */
        public final String f8941a;
        public final double b;

        public WxidDetails(String str, double d) {
            this.f8941a = str;
            this.b = d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WxidDetails)) {
                return false;
            }
            WxidDetails wxidDetails = (WxidDetails) obj;
            return Intrinsics.c(this.f8941a, wxidDetails.f8941a) && Double.compare(this.b, wxidDetails.b) == 0;
        }

        public final int hashCode() {
            String str = this.f8941a;
            return Double.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sbR = a.r(this.b, "WxidDetails(wxid=", this.f8941a, ", nextFetchTime=");
            sbR.append(")");
            return sbR.toString();
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(WxidDetailsQuery_ResponseAdapter.Data.f8942a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query WxidDetails { wxidDetails { wxid nextFetchTime } }";
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == WxidDetailsQuery.class;
    }

    public final int hashCode() {
        return Reflection.f24268a.b(WxidDetailsQuery.class).hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "0dbdbef8d09c325f471ebf06a98a71af6a5b066017d8cf082cd1dc21aa1fc0d3";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "WxidDetails";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
    }
}
