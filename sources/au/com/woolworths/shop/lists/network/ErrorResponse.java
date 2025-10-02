package au.com.woolworths.shop.lists.network;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lau/com/woolworths/shop/lists/network/ErrorResponse;", "", "", "errorDetails", "httpStatusCode", "httpStatusText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getErrorDetails", "()Ljava/lang/String;", "getHttpStatusCode", "getHttpStatusText", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ErrorResponse {

    @SerializedName("errorDetails")
    @NotNull
    private final String errorDetails;

    @SerializedName("httpStatusCode")
    @NotNull
    private final String httpStatusCode;

    @SerializedName("httpStatusText")
    @NotNull
    private final String httpStatusText;

    public ErrorResponse(@NotNull String errorDetails, @NotNull String httpStatusCode, @NotNull String httpStatusText) {
        Intrinsics.h(errorDetails, "errorDetails");
        Intrinsics.h(httpStatusCode, "httpStatusCode");
        Intrinsics.h(httpStatusText, "httpStatusText");
        this.errorDetails = errorDetails;
        this.httpStatusCode = httpStatusCode;
        this.httpStatusText = httpStatusText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorResponse)) {
            return false;
        }
        ErrorResponse errorResponse = (ErrorResponse) obj;
        return Intrinsics.c(this.errorDetails, errorResponse.errorDetails) && Intrinsics.c(this.httpStatusCode, errorResponse.httpStatusCode) && Intrinsics.c(this.httpStatusText, errorResponse.httpStatusText);
    }

    public final int hashCode() {
        return this.httpStatusText.hashCode() + b.c(this.errorDetails.hashCode() * 31, 31, this.httpStatusCode);
    }

    public final String toString() {
        String str = this.errorDetails;
        String str2 = this.httpStatusCode;
        return a.o(a.v("ErrorResponse(errorDetails=", str, ", httpStatusCode=", str2, ", httpStatusText="), this.httpStatusText, ")");
    }
}
