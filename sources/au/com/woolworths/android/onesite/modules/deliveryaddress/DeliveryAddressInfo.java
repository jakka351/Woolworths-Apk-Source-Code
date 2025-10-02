package au.com.woolworths.android.onesite.modules.deliveryaddress;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/android/onesite/modules/deliveryaddress/DeliveryAddressInfo;", "", "", "id", "", TextBundle.TEXT_ENTRY, "<init>", "(ILjava/lang/String;)V", "I", "getId", "()I", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DeliveryAddressInfo {

    @SerializedName("Id")
    private final int id;

    @SerializedName("Text")
    @NotNull
    private final String text;

    public DeliveryAddressInfo(int i, @NotNull String text) {
        Intrinsics.h(text, "text");
        this.id = i;
        this.text = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryAddressInfo)) {
            return false;
        }
        DeliveryAddressInfo deliveryAddressInfo = (DeliveryAddressInfo) obj;
        return this.id == deliveryAddressInfo.id && Intrinsics.c(this.text, deliveryAddressInfo.text);
    }

    public final int hashCode() {
        return this.text.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        return "DeliveryAddressInfo(id=" + this.id + ", text=" + this.text + ")";
    }
}
