package au.com.woolworths.foundation.shop.editorder;

import YU.a;
import androidx.camera.core.impl.b;
import au.com.woolworths.foundation.shop.editorder.adapter.EditOrderStatusQuery_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.EditOrderMode;
import au.com.woolworths.shop.graphql.type.adapter.EditOrderMode_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/EditOrderStatusQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/foundation/shop/editorder/EditOrderStatusQuery$Data;", "Data", "EditOrderStatus", "Details", "Banner", "Confirmation", "Message", "Companion", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class EditOrderStatusQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final EditOrderMode f8722a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/EditOrderStatusQuery$Banner;", "", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Banner {

        /* renamed from: a, reason: collision with root package name */
        public final String f8723a;
        public final String b;
        public final String c;
        public final Confirmation d;

        public Banner(String str, String str2, String str3, Confirmation confirmation) {
            this.f8723a = str;
            this.b = str2;
            this.c = str3;
            this.d = confirmation;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) obj;
            return Intrinsics.c(this.f8723a, banner.f8723a) && Intrinsics.c(this.b, banner.b) && Intrinsics.c(this.c, banner.c) && Intrinsics.c(this.d, banner.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + b.c(b.c(this.f8723a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sbV = a.v("Banner(title=", this.f8723a, ", message=", this.b, ", buttonTitle=");
            sbV.append(this.c);
            sbV.append(", confirmation=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/EditOrderStatusQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/EditOrderStatusQuery$Confirmation;", "", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Confirmation {

        /* renamed from: a, reason: collision with root package name */
        public final String f8724a;
        public final String b;

        public Confirmation(String str, String str2) {
            this.f8724a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Confirmation)) {
                return false;
            }
            Confirmation confirmation = (Confirmation) obj;
            return Intrinsics.c(this.f8724a, confirmation.f8724a) && Intrinsics.c(this.b, confirmation.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f8724a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("Confirmation(title=", this.f8724a, ", message=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/EditOrderStatusQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final EditOrderStatus f8725a;

        public Data(EditOrderStatus editOrderStatus) {
            this.f8725a = editOrderStatus;
        }

        /* renamed from: a, reason: from getter */
        public final EditOrderStatus getF8725a() {
            return this.f8725a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f8725a, ((Data) obj).f8725a);
        }

        public final int hashCode() {
            return this.f8725a.hashCode();
        }

        public final String toString() {
            return "Data(editOrderStatus=" + this.f8725a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/EditOrderStatusQuery$Details;", "", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Details {

        /* renamed from: a, reason: collision with root package name */
        public final String f8726a;
        public final Banner b;

        public Details(String str, Banner banner) {
            this.f8726a = str;
            this.b = banner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Details)) {
                return false;
            }
            Details details = (Details) obj;
            return Intrinsics.c(this.f8726a, details.f8726a) && Intrinsics.c(this.b, details.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f8726a.hashCode() * 31);
        }

        public final String toString() {
            return "Details(orderId=" + this.f8726a + ", banner=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/EditOrderStatusQuery$EditOrderStatus;", "", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EditOrderStatus {

        /* renamed from: a, reason: collision with root package name */
        public final EditOrderMode f8727a;
        public final Details b;
        public final Message c;

        public EditOrderStatus(EditOrderMode editOrderMode, Details details, Message message) {
            this.f8727a = editOrderMode;
            this.b = details;
            this.c = message;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EditOrderStatus)) {
                return false;
            }
            EditOrderStatus editOrderStatus = (EditOrderStatus) obj;
            return this.f8727a == editOrderStatus.f8727a && Intrinsics.c(this.b, editOrderStatus.b) && Intrinsics.c(this.c, editOrderStatus.c);
        }

        public final int hashCode() {
            int iHashCode = this.f8727a.hashCode() * 31;
            Details details = this.b;
            int iHashCode2 = (iHashCode + (details == null ? 0 : details.hashCode())) * 31;
            Message message = this.c;
            return iHashCode2 + (message != null ? message.hashCode() : 0);
        }

        public final String toString() {
            return "EditOrderStatus(mode=" + this.f8727a + ", details=" + this.b + ", message=" + this.c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/EditOrderStatusQuery$Message;", "", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Message {

        /* renamed from: a, reason: collision with root package name */
        public final String f8728a;
        public final String b;
        public final String c;

        public Message(String str, String str2, String str3) {
            this.f8728a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Message)) {
                return false;
            }
            Message message = (Message) obj;
            return Intrinsics.c(this.f8728a, message.f8728a) && Intrinsics.c(this.b, message.b) && Intrinsics.c(this.c, message.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f8728a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.o(a.v("Message(title=", this.f8728a, ", message=", this.b, ", buttonTitle="), this.c, ")");
        }
    }

    public EditOrderStatusQuery(EditOrderMode editOrderMode) {
        this.f8722a = editOrderMode;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(EditOrderStatusQuery_ResponseAdapter.Data.f8734a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query EditOrderStatus($currentMode: EditOrderMode!) { editOrderStatus(currentMode: $currentMode) { mode details { orderId banner { title message buttonTitle confirmation { title message } } } message { title message buttonTitle } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EditOrderStatusQuery) && this.f8722a == ((EditOrderStatusQuery) obj).f8722a;
    }

    public final int hashCode() {
        return this.f8722a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "f3525c2e4ca141ff7a09a7ac66e14f769b48ba0e232ff943c1e8071065a685e8";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "EditOrderStatus";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("currentMode");
        EditOrderMode_ResponseAdapter.b(jsonWriter, customScalarAdapters, this.f8722a);
    }

    public final String toString() {
        return "EditOrderStatusQuery(currentMode=" + this.f8722a + ")";
    }
}
