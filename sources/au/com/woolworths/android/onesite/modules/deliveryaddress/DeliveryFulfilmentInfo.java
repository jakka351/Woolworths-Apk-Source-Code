package au.com.woolworths.android.onesite.modules.deliveryaddress;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/android/onesite/modules/deliveryaddress/DeliveryFulfilmentInfo;", "", "Lau/com/woolworths/android/onesite/modules/deliveryaddress/DeliveryAddressInfo;", "deliveryAddressInfo", "<init>", "(Lau/com/woolworths/android/onesite/modules/deliveryaddress/DeliveryAddressInfo;)V", "Lau/com/woolworths/android/onesite/modules/deliveryaddress/DeliveryAddressInfo;", "getDeliveryAddressInfo", "()Lau/com/woolworths/android/onesite/modules/deliveryaddress/DeliveryAddressInfo;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DeliveryFulfilmentInfo {

    @SerializedName("Address")
    @NotNull
    private final DeliveryAddressInfo deliveryAddressInfo;

    public DeliveryFulfilmentInfo(@NotNull DeliveryAddressInfo deliveryAddressInfo) {
        Intrinsics.h(deliveryAddressInfo, "deliveryAddressInfo");
        this.deliveryAddressInfo = deliveryAddressInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeliveryFulfilmentInfo) && Intrinsics.c(this.deliveryAddressInfo, ((DeliveryFulfilmentInfo) obj).deliveryAddressInfo);
    }

    public final int hashCode() {
        return this.deliveryAddressInfo.hashCode();
    }

    public final String toString() {
        return "DeliveryFulfilmentInfo(deliveryAddressInfo=" + this.deliveryAddressInfo + ")";
    }
}
