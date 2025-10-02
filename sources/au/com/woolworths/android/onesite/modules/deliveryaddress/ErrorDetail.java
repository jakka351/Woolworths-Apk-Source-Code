package au.com.woolworths.android.onesite.modules.deliveryaddress;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/android/onesite/modules/deliveryaddress/ErrorDetail;", "", "", "code", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ErrorDetail {

    @SerializedName("Code")
    @NotNull
    private final String code;

    @SerializedName("Message")
    @NotNull
    private final String message;

    public ErrorDetail(@NotNull String code, @NotNull String message) {
        Intrinsics.h(code, "code");
        Intrinsics.h(message, "message");
        this.code = code;
        this.message = message;
    }

    /* renamed from: a, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: b, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorDetail)) {
            return false;
        }
        ErrorDetail errorDetail = (ErrorDetail) obj;
        return Intrinsics.c(this.code, errorDetail.code) && Intrinsics.c(this.message, errorDetail.message);
    }

    public final int hashCode() {
        return this.message.hashCode() + (this.code.hashCode() * 31);
    }

    public final String toString() {
        return a.j("ErrorDetail(code=", this.code, ", message=", this.message, ")");
    }
}
