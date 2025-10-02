package au.com.woolworths.android.onesite.modules.collectionmode.api;

import YU.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/android/onesite/modules/collectionmode/api/UpdateSelectedPickUpLocationRequest;", "", "", "addressId", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getAddressId", "()Ljava/lang/String;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UpdateSelectedPickUpLocationRequest {

    @SerializedName("storeAddressId")
    @NotNull
    private final String addressId;

    public UpdateSelectedPickUpLocationRequest(@NotNull String addressId) {
        Intrinsics.h(addressId, "addressId");
        this.addressId = addressId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdateSelectedPickUpLocationRequest) && Intrinsics.c(this.addressId, ((UpdateSelectedPickUpLocationRequest) obj).addressId);
    }

    public final int hashCode() {
        return this.addressId.hashCode();
    }

    public final String toString() {
        return a.h("UpdateSelectedPickUpLocationRequest(addressId=", this.addressId, ")");
    }
}
