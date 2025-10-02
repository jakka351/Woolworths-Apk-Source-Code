package au.com.woolworths.feature.shop.account.model.delete;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/account/model/delete/DeleteAccountTnCData;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DeleteAccountTnCData {

    /* renamed from: a, reason: collision with root package name */
    public final String f6573a;
    public final String b;
    public final String c;
    public final DeleteButtonData d;

    public DeleteAccountTnCData(String str, String str2, String str3, DeleteButtonData deleteButtonData) {
        this.f6573a = str;
        this.b = str2;
        this.c = str3;
        this.d = deleteButtonData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteAccountTnCData)) {
            return false;
        }
        DeleteAccountTnCData deleteAccountTnCData = (DeleteAccountTnCData) obj;
        return Intrinsics.c(this.f6573a, deleteAccountTnCData.f6573a) && Intrinsics.c(this.b, deleteAccountTnCData.b) && Intrinsics.c(this.c, deleteAccountTnCData.c) && Intrinsics.c(this.d, deleteAccountTnCData.d);
    }

    public final int hashCode() {
        return this.d.f6574a.hashCode() + b.c(b.c(this.f6573a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbV = a.v("DeleteAccountTnCData(title=", this.f6573a, ", termsAndConditions=", this.b, ", termsAndConditionsAgreeText=");
        sbV.append(this.c);
        sbV.append(", deleteButton=");
        sbV.append(this.d);
        sbV.append(")");
        return sbV.toString();
    }
}
