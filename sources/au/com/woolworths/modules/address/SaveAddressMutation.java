package au.com.woolworths.modules.address;

import androidx.camera.core.impl.b;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.modules.address.adapter.SaveAddressMutation_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.AddressInput;
import au.com.woolworths.shop.graphql.type.adapter.AddressInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/modules/address/SaveAddressMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lau/com/woolworths/modules/address/SaveAddressMutation$Data;", "Data", "SaveAddress", "Companion", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SaveAddressMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final AddressInput f9058a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/modules/address/SaveAddressMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/address/SaveAddressMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final SaveAddress f9059a;

        public Data(SaveAddress saveAddress) {
            this.f9059a = saveAddress;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f9059a, ((Data) obj).f9059a);
        }

        public final int hashCode() {
            SaveAddress saveAddress = this.f9059a;
            if (saveAddress == null) {
                return 0;
            }
            return saveAddress.hashCode();
        }

        public final String toString() {
            return "Data(saveAddress=" + this.f9059a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/address/SaveAddressMutation$SaveAddress;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SaveAddress {

        /* renamed from: a, reason: collision with root package name */
        public final int f9060a;
        public final String b;
        public final boolean c;
        public final String d;
        public final String e;
        public final String f;
        public final int g;
        public final String h;

        public SaveAddress(int i, String str, boolean z, String str2, String str3, String str4, int i2, String str5) {
            this.f9060a = i;
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
            if (!(obj instanceof SaveAddress)) {
                return false;
            }
            SaveAddress saveAddress = (SaveAddress) obj;
            return this.f9060a == saveAddress.f9060a && Intrinsics.c(this.b, saveAddress.b) && this.c == saveAddress.c && Intrinsics.c(this.d, saveAddress.d) && Intrinsics.c(this.e, saveAddress.e) && Intrinsics.c(this.f, saveAddress.f) && this.g == saveAddress.g && Intrinsics.c(this.h, saveAddress.h);
        }

        public final int hashCode() {
            return this.h.hashCode() + b.a(this.g, b.c(b.c(b.c(b.e(b.c(Integer.hashCode(this.f9060a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31);
        }

        public final String toString() {
            StringBuilder sbP = a.p("SaveAddress(id=", this.f9060a, ", text=", this.b, ", isPrimary=");
            au.com.woolworths.android.onesite.a.y(", postalCode=", this.d, ", street1=", sbP, this.c);
            a.B(sbP, this.e, ", street2=", this.f, ", suburbId=");
            sbP.append(this.g);
            sbP.append(", suburbName=");
            sbP.append(this.h);
            sbP.append(")");
            return sbP.toString();
        }
    }

    public SaveAddressMutation(AddressInput addressInput) {
        this.f9058a = addressInput;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(SaveAddressMutation_ResponseAdapter.Data.f9070a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation saveAddress($address: AddressInput!) { saveAddress(address: $address) { id text isPrimary postalCode street1 street2 suburbId suburbName } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SaveAddressMutation) && Intrinsics.c(this.f9058a, ((SaveAddressMutation) obj).f9058a);
    }

    public final int hashCode() {
        return this.f9058a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "9ec16892eb18ce1e9d7c1acfeb32e1191fdfc651b96cfd34092c98fcd95f006d";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "saveAddress";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("address");
        Adapters.c(AddressInput_InputAdapter.f12034a, false).toJson(jsonWriter, customScalarAdapters, this.f9058a);
    }

    public final String toString() {
        return "SaveAddressMutation(address=" + this.f9058a + ")";
    }
}
