package au.com.woolworths.android.onesite.modules.deliveryaddress;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lau/com/woolworths/android/onesite/modules/deliveryaddress/SaveAddressError;", "", "", "httpStatusCode", "", "errorCode", "errorMessage", "Lau/com/woolworths/android/onesite/modules/deliveryaddress/ErrorDetail;", "errorDetail", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lau/com/woolworths/android/onesite/modules/deliveryaddress/ErrorDetail;)V", "I", "getHttpStatusCode", "()I", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "getErrorMessage", "Lau/com/woolworths/android/onesite/modules/deliveryaddress/ErrorDetail;", "b", "()Lau/com/woolworths/android/onesite/modules/deliveryaddress/ErrorDetail;", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SaveAddressError {

    @SerializedName("errorCode")
    @NotNull
    private final String errorCode;

    @SerializedName("errorDetail")
    @NotNull
    private final ErrorDetail errorDetail;

    @SerializedName("errorMessage")
    @NotNull
    private final String errorMessage;

    @SerializedName("httpStatusCode")
    private final int httpStatusCode;

    public SaveAddressError(int i, @NotNull String errorCode, @NotNull String errorMessage, @NotNull ErrorDetail errorDetail) {
        Intrinsics.h(errorCode, "errorCode");
        Intrinsics.h(errorMessage, "errorMessage");
        Intrinsics.h(errorDetail, "errorDetail");
        this.httpStatusCode = i;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.errorDetail = errorDetail;
    }

    /* renamed from: a, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: b, reason: from getter */
    public final ErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaveAddressError)) {
            return false;
        }
        SaveAddressError saveAddressError = (SaveAddressError) obj;
        return this.httpStatusCode == saveAddressError.httpStatusCode && Intrinsics.c(this.errorCode, saveAddressError.errorCode) && Intrinsics.c(this.errorMessage, saveAddressError.errorMessage) && Intrinsics.c(this.errorDetail, saveAddressError.errorDetail);
    }

    public final int hashCode() {
        return this.errorDetail.hashCode() + b.c(b.c(Integer.hashCode(this.httpStatusCode) * 31, 31, this.errorCode), 31, this.errorMessage);
    }

    public final String toString() {
        int i = this.httpStatusCode;
        String str = this.errorCode;
        String str2 = this.errorMessage;
        ErrorDetail errorDetail = this.errorDetail;
        StringBuilder sbP = a.p("SaveAddressError(httpStatusCode=", i, ", errorCode=", str, ", errorMessage=");
        sbP.append(str2);
        sbP.append(", errorDetail=");
        sbP.append(errorDetail);
        sbP.append(")");
        return sbP.toString();
    }
}
