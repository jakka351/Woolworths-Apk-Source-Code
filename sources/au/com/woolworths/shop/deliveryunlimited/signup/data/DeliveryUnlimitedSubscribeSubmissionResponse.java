package au.com.woolworths.shop.deliveryunlimited.signup.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSubscribeSubmissionResponse;", "", "", "success", "", "message", "<init>", "(ZLjava/lang/String;)V", "Z", "b", "()Z", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeliveryUnlimitedSubscribeSubmissionResponse {

    @SerializedName("message")
    @Nullable
    private final String message;

    @SerializedName("success")
    private final boolean success;

    public DeliveryUnlimitedSubscribeSubmissionResponse(boolean z, @Nullable String str) {
        this.success = z;
        this.message = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryUnlimitedSubscribeSubmissionResponse)) {
            return false;
        }
        DeliveryUnlimitedSubscribeSubmissionResponse deliveryUnlimitedSubscribeSubmissionResponse = (DeliveryUnlimitedSubscribeSubmissionResponse) obj;
        return this.success == deliveryUnlimitedSubscribeSubmissionResponse.success && Intrinsics.c(this.message, deliveryUnlimitedSubscribeSubmissionResponse.message);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.success) * 31;
        String str = this.message;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return a.m("DeliveryUnlimitedSubscribeSubmissionResponse(success=", this.success, ", message=", this.message, ")");
    }
}
