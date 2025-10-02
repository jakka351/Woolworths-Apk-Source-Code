package au.com.woolworths.modules.address;

import androidx.camera.core.impl.b;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.modules.address.adapter.GetAddressesQuery_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/modules/address/GetAddressesQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/modules/address/GetAddressesQuery$Data;", "Data", "GetAddress", "Companion", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GetAddressesQuery implements Query<Data> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/modules/address/GetAddressesQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/address/GetAddressesQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final List f9056a;

        public Data(List list) {
            this.f9056a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f9056a, ((Data) obj).f9056a);
        }

        public final int hashCode() {
            List list = this.f9056a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final String toString() {
            return a.l("Data(getAddresses=", ")", this.f9056a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/address/GetAddressesQuery$GetAddress;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GetAddress {

        /* renamed from: a, reason: collision with root package name */
        public final int f9057a;
        public final String b;
        public final boolean c;
        public final String d;
        public final String e;
        public final String f;
        public final int g;
        public final String h;

        public GetAddress(int i, String str, boolean z, String str2, String str3, String str4, int i2, String str5) {
            this.f9057a = i;
            this.b = str;
            this.c = z;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.g = i2;
            this.h = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GetAddress)) {
                return false;
            }
            GetAddress getAddress = (GetAddress) obj;
            return this.f9057a == getAddress.f9057a && Intrinsics.c(this.b, getAddress.b) && this.c == getAddress.c && Intrinsics.c(this.d, getAddress.d) && Intrinsics.c(this.e, getAddress.e) && Intrinsics.c(this.f, getAddress.f) && this.g == getAddress.g && Intrinsics.c(this.h, getAddress.h);
        }

        public final int hashCode() {
            return this.h.hashCode() + b.a(this.g, b.c(b.c(b.c(b.e(b.c(Integer.hashCode(this.f9057a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31);
        }

        public final String toString() {
            StringBuilder sbP = androidx.constraintlayout.core.state.a.p("GetAddress(id=", this.f9057a, ", text=", this.b, ", isPrimary=");
            a.y(", postalCode=", this.d, ", street1=", sbP, this.c);
            androidx.constraintlayout.core.state.a.B(sbP, this.e, ", street2=", this.f, ", suburbId=");
            sbP.append(this.g);
            sbP.append(", suburbName=");
            sbP.append(this.h);
            sbP.append(")");
            return sbP.toString();
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(GetAddressesQuery_ResponseAdapter.Data.f9068a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query GetAddresses { getAddresses { id text isPrimary postalCode street1 street2 suburbId suburbName } }";
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == GetAddressesQuery.class;
    }

    public final int hashCode() {
        return Reflection.f24268a.b(GetAddressesQuery.class).hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "4a16b75dbf175397956969a0cee5f24b1b9f1355cacaebc401b64a519398401a";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "GetAddresses";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
    }
}
