package au.com.woolworths.feature.shop.login.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lau/com/woolworths/feature/shop/login/data/ShopLoginCallbackResultData;", "", "", "loginFormUrl", "sessionToken", "callbackUrlPattern", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getLoginFormUrl", "()Ljava/lang/String;", "getSessionToken", "getCallbackUrlPattern", "login_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ShopLoginCallbackResultData {

    @SerializedName("callbackURLPattern")
    @NotNull
    private final String callbackUrlPattern;

    @SerializedName("loginFormURL")
    @NotNull
    private final String loginFormUrl;

    @SerializedName("sessionToken")
    @NotNull
    private final String sessionToken;

    public ShopLoginCallbackResultData(@NotNull String loginFormUrl, @NotNull String sessionToken, @NotNull String callbackUrlPattern) {
        Intrinsics.h(loginFormUrl, "loginFormUrl");
        Intrinsics.h(sessionToken, "sessionToken");
        Intrinsics.h(callbackUrlPattern, "callbackUrlPattern");
        this.loginFormUrl = loginFormUrl;
        this.sessionToken = sessionToken;
        this.callbackUrlPattern = callbackUrlPattern;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopLoginCallbackResultData)) {
            return false;
        }
        ShopLoginCallbackResultData shopLoginCallbackResultData = (ShopLoginCallbackResultData) obj;
        return Intrinsics.c(this.loginFormUrl, shopLoginCallbackResultData.loginFormUrl) && Intrinsics.c(this.sessionToken, shopLoginCallbackResultData.sessionToken) && Intrinsics.c(this.callbackUrlPattern, shopLoginCallbackResultData.callbackUrlPattern);
    }

    public final int hashCode() {
        return this.callbackUrlPattern.hashCode() + b.c(this.loginFormUrl.hashCode() * 31, 31, this.sessionToken);
    }

    public final String toString() {
        String str = this.loginFormUrl;
        String str2 = this.sessionToken;
        return a.o(a.v("ShopLoginCallbackResultData(loginFormUrl=", str, ", sessionToken=", str2, ", callbackUrlPattern="), this.callbackUrlPattern, ")");
    }
}
