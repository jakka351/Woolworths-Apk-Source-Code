package au.com.woolworths.android.onesite.modules.collectionmode.api;

import androidx.constraintlayout.core.state.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/android/onesite/modules/collectionmode/api/PickUpLocationFulfilmentApiModel;", "", "", "addressId", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "addressText", "<init>", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "I", "getAddressId", "()I", "Ljava/lang/Integer;", "getId", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getAddressText", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PickUpLocationFulfilmentApiModel {

    @SerializedName("AddressId")
    private final int addressId;

    @SerializedName("AddressText")
    @NotNull
    private final String addressText;

    @SerializedName("Id")
    @Nullable
    private final Integer id;

    @SerializedName("Name")
    @Nullable
    private final String name;

    public PickUpLocationFulfilmentApiModel(int i, @Nullable Integer num, @Nullable String str, @NotNull String addressText) {
        Intrinsics.h(addressText, "addressText");
        this.addressId = i;
        this.id = num;
        this.name = str;
        this.addressText = addressText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PickUpLocationFulfilmentApiModel)) {
            return false;
        }
        PickUpLocationFulfilmentApiModel pickUpLocationFulfilmentApiModel = (PickUpLocationFulfilmentApiModel) obj;
        return this.addressId == pickUpLocationFulfilmentApiModel.addressId && Intrinsics.c(this.id, pickUpLocationFulfilmentApiModel.id) && Intrinsics.c(this.name, pickUpLocationFulfilmentApiModel.name) && Intrinsics.c(this.addressText, pickUpLocationFulfilmentApiModel.addressText);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.addressId) * 31;
        Integer num = this.id;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.name;
        return this.addressText.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        int i = this.addressId;
        Integer num = this.id;
        String str = this.name;
        String str2 = this.addressText;
        StringBuilder sb = new StringBuilder("PickUpLocationFulfilmentApiModel(addressId=");
        sb.append(i);
        sb.append(", id=");
        sb.append(num);
        sb.append(", name=");
        return a.l(sb, str, ", addressText=", str2, ")");
    }
}
