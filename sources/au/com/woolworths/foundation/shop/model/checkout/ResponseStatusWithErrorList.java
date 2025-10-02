package au.com.woolworths.foundation.shop.model.checkout;

import YU.a;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lau/com/woolworths/foundation/shop/model/checkout/ResponseStatusWithErrorList;", "", "", "errorCode", "message", "stackTrace", "", "Lau/com/woolworths/foundation/shop/model/checkout/ResponseError;", "errors", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "getErrorCode", "()Ljava/lang/String;", "b", "getStackTrace", "Ljava/util/List;", "a", "()Ljava/util/List;", "model"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ResponseStatusWithErrorList {

    @SerializedName("ErrorCode")
    @Nullable
    private final String errorCode;

    @SerializedName("Errors")
    @Nullable
    private final List<ResponseError> errors;

    @SerializedName("Message")
    @Nullable
    private final String message;

    @SerializedName("StackTrace")
    @Nullable
    private final String stackTrace;

    public ResponseStatusWithErrorList(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<ResponseError> list) {
        this.errorCode = str;
        this.message = str2;
        this.stackTrace = str3;
        this.errors = list;
    }

    /* renamed from: a, reason: from getter */
    public final List getErrors() {
        return this.errors;
    }

    /* renamed from: b, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseStatusWithErrorList)) {
            return false;
        }
        ResponseStatusWithErrorList responseStatusWithErrorList = (ResponseStatusWithErrorList) obj;
        return Intrinsics.c(this.errorCode, responseStatusWithErrorList.errorCode) && Intrinsics.c(this.message, responseStatusWithErrorList.message) && Intrinsics.c(this.stackTrace, responseStatusWithErrorList.stackTrace) && Intrinsics.c(this.errors, responseStatusWithErrorList.errors);
    }

    public final int hashCode() {
        String str = this.errorCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.stackTrace;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<ResponseError> list = this.errors;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str = this.errorCode;
        String str2 = this.message;
        String str3 = this.stackTrace;
        List<ResponseError> list = this.errors;
        StringBuilder sbV = a.v("ResponseStatusWithErrorList(errorCode=", str, ", message=", str2, ", stackTrace=");
        sbV.append(str3);
        sbV.append(", errors=");
        sbV.append(list);
        sbV.append(")");
        return sbV.toString();
    }
}
