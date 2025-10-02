package au.com.woolworths.android.onesite.modules.collectionmode.api;

import au.com.woolworths.android.onesite.modules.deliveryaddress.DeliveryFulfilmentInfo;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lau/com/woolworths/android/onesite/modules/collectionmode/api/FulfilmentResponse;", "", "Lau/com/woolworths/android/onesite/modules/deliveryaddress/DeliveryFulfilmentInfo;", "deliveryInfo", "Lau/com/woolworths/android/onesite/modules/collectionmode/api/PickUpFulfilmentWrapperApiModel;", "pickUpInfo", "Lau/com/woolworths/android/onesite/modules/collectionmode/api/FulfilmentInfoApiModel;", "fulfilment", "<init>", "(Lau/com/woolworths/android/onesite/modules/deliveryaddress/DeliveryFulfilmentInfo;Lau/com/woolworths/android/onesite/modules/collectionmode/api/PickUpFulfilmentWrapperApiModel;Lau/com/woolworths/android/onesite/modules/collectionmode/api/FulfilmentInfoApiModel;)V", "Lau/com/woolworths/android/onesite/modules/deliveryaddress/DeliveryFulfilmentInfo;", "getDeliveryInfo", "()Lau/com/woolworths/android/onesite/modules/deliveryaddress/DeliveryFulfilmentInfo;", "Lau/com/woolworths/android/onesite/modules/collectionmode/api/PickUpFulfilmentWrapperApiModel;", "getPickUpInfo", "()Lau/com/woolworths/android/onesite/modules/collectionmode/api/PickUpFulfilmentWrapperApiModel;", "Lau/com/woolworths/android/onesite/modules/collectionmode/api/FulfilmentInfoApiModel;", "getFulfilment", "()Lau/com/woolworths/android/onesite/modules/collectionmode/api/FulfilmentInfoApiModel;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FulfilmentResponse {

    @SerializedName("Delivery")
    @Nullable
    private final DeliveryFulfilmentInfo deliveryInfo;

    @SerializedName("Fulfilment")
    @NotNull
    private final FulfilmentInfoApiModel fulfilment;

    @SerializedName("Pickup")
    @Nullable
    private final PickUpFulfilmentWrapperApiModel pickUpInfo;

    public FulfilmentResponse(@Nullable DeliveryFulfilmentInfo deliveryFulfilmentInfo, @Nullable PickUpFulfilmentWrapperApiModel pickUpFulfilmentWrapperApiModel, @NotNull FulfilmentInfoApiModel fulfilment) {
        Intrinsics.h(fulfilment, "fulfilment");
        this.deliveryInfo = deliveryFulfilmentInfo;
        this.pickUpInfo = pickUpFulfilmentWrapperApiModel;
        this.fulfilment = fulfilment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FulfilmentResponse)) {
            return false;
        }
        FulfilmentResponse fulfilmentResponse = (FulfilmentResponse) obj;
        return Intrinsics.c(this.deliveryInfo, fulfilmentResponse.deliveryInfo) && Intrinsics.c(this.pickUpInfo, fulfilmentResponse.pickUpInfo) && Intrinsics.c(this.fulfilment, fulfilmentResponse.fulfilment);
    }

    public final int hashCode() {
        DeliveryFulfilmentInfo deliveryFulfilmentInfo = this.deliveryInfo;
        int iHashCode = (deliveryFulfilmentInfo == null ? 0 : deliveryFulfilmentInfo.hashCode()) * 31;
        PickUpFulfilmentWrapperApiModel pickUpFulfilmentWrapperApiModel = this.pickUpInfo;
        return this.fulfilment.hashCode() + ((iHashCode + (pickUpFulfilmentWrapperApiModel != null ? pickUpFulfilmentWrapperApiModel.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "FulfilmentResponse(deliveryInfo=" + this.deliveryInfo + ", pickUpInfo=" + this.pickUpInfo + ", fulfilment=" + this.fulfilment + ")";
    }
}
