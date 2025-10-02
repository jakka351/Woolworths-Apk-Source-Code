package au.com.woolworths.feature.shop.login.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/feature/shop/login/data/ShopLoginFailureData;", "", "", "statusCode", "", "error", "message", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/Integer;", "getStatusCode", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getError", "()Ljava/lang/String;", "getMessage", "login_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ShopLoginFailureData {

    @SerializedName("error")
    @Nullable
    private final String error;

    @SerializedName("message")
    @Nullable
    private final String message;

    @SerializedName("statusCode")
    @Nullable
    private final Integer statusCode;

    public ShopLoginFailureData(@Nullable Integer num, @Nullable String str, @Nullable String str2) {
        this.statusCode = num;
        this.error = str;
        this.message = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopLoginFailureData)) {
            return false;
        }
        ShopLoginFailureData shopLoginFailureData = (ShopLoginFailureData) obj;
        return Intrinsics.c(this.statusCode, shopLoginFailureData.statusCode) && Intrinsics.c(this.error, shopLoginFailureData.error) && Intrinsics.c(this.message, shopLoginFailureData.message);
    }

    public final int hashCode() {
        Integer num = this.statusCode;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.error;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.statusCode;
        String str = this.error;
        String str2 = this.message;
        StringBuilder sb = new StringBuilder("ShopLoginFailureData(statusCode=");
        sb.append(num);
        sb.append(", error=");
        sb.append(str);
        sb.append(", message=");
        return a.o(sb, str2, ")");
    }
}
