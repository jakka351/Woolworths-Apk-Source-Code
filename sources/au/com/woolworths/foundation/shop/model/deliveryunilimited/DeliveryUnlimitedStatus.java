package au.com.woolworths.foundation.shop.model.deliveryunilimited;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/shop/model/deliveryunilimited/DeliveryUnlimitedStatus;", "", "<init>", "(Ljava/lang/String;I)V", "SUBSCRIBED", "NOT_SUBSCRIBED", "model"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeliveryUnlimitedStatus {

    @SerializedName("NOT_SUBSCRIBED")
    public static final DeliveryUnlimitedStatus NOT_SUBSCRIBED;

    @SerializedName("SUBSCRIBED")
    public static final DeliveryUnlimitedStatus SUBSCRIBED;
    public static final DeliveryUnlimitedStatus d;
    public static final /* synthetic */ DeliveryUnlimitedStatus[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        DeliveryUnlimitedStatus deliveryUnlimitedStatus = new DeliveryUnlimitedStatus("SUBSCRIBED", 0);
        SUBSCRIBED = deliveryUnlimitedStatus;
        DeliveryUnlimitedStatus deliveryUnlimitedStatus2 = new DeliveryUnlimitedStatus("NOT_SUBSCRIBED", 1);
        NOT_SUBSCRIBED = deliveryUnlimitedStatus2;
        DeliveryUnlimitedStatus deliveryUnlimitedStatus3 = new DeliveryUnlimitedStatus("UNKNOWN", 2);
        d = deliveryUnlimitedStatus3;
        DeliveryUnlimitedStatus[] deliveryUnlimitedStatusArr = {deliveryUnlimitedStatus, deliveryUnlimitedStatus2, deliveryUnlimitedStatus3};
        e = deliveryUnlimitedStatusArr;
        f = EnumEntriesKt.a(deliveryUnlimitedStatusArr);
    }

    private DeliveryUnlimitedStatus(String str, int i) {
    }

    public static DeliveryUnlimitedStatus valueOf(String str) {
        return (DeliveryUnlimitedStatus) Enum.valueOf(DeliveryUnlimitedStatus.class, str);
    }

    public static DeliveryUnlimitedStatus[] values() {
        return (DeliveryUnlimitedStatus[]) e.clone();
    }
}
