package au.com.woolworths.foundation.shop.model.checkout;

import YU.a;
import androidx.camera.core.impl.b;
import au.com.woolworths.foundation.shop.model.checkout.CheckoutRecognisedError;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0010B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0011"}, d2 = {"Lau/com/woolworths/foundation/shop/model/checkout/CheckoutError;", "", "", "key", "", "errorCode", "message", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "I", "a", "()I", "b", "Companion", "model"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CheckoutError {

    @SerializedName("ErrorCode")
    private final int errorCode;

    @SerializedName("Key")
    @NotNull
    private final String key;

    @SerializedName("Message")
    @NotNull
    private final String message;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/foundation/shop/model/checkout/CheckoutError$Companion;", "", "", "INVALID_WINDOW_ERROR_MESSAGE", "Ljava/lang/String;", "UNAVAILABLE_WINDOW_ERROR_MESSAGE", "NO_AVAILABLE_ITEMS_ERROR_MESSAGE", "model"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public CheckoutError(@NotNull String key, int i, @NotNull String message) {
        Intrinsics.h(key, "key");
        Intrinsics.h(message, "message");
        this.key = key;
        this.errorCode = i;
        this.message = message;
    }

    /* renamed from: a, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: b, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final boolean c() {
        CheckoutRecognisedError.Companion companion = CheckoutRecognisedError.e;
        int i = this.errorCode;
        companion.getClass();
        return CheckoutRecognisedError.Companion.a(i) == CheckoutRecognisedError.g || CheckoutRecognisedError.Companion.a(this.errorCode) == CheckoutRecognisedError.h || "WindowInvalid".equals(this.key) || "WindowUnavailable".equals(this.key);
    }

    public final boolean d() {
        CheckoutRecognisedError.Companion companion = CheckoutRecognisedError.e;
        int i = this.errorCode;
        companion.getClass();
        return CheckoutRecognisedError.Companion.a(i) == CheckoutRecognisedError.i && "AvailableItems".equals(this.key);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutError)) {
            return false;
        }
        CheckoutError checkoutError = (CheckoutError) obj;
        return Intrinsics.c(this.key, checkoutError.key) && this.errorCode == checkoutError.errorCode && Intrinsics.c(this.message, checkoutError.message);
    }

    public final int hashCode() {
        return this.message.hashCode() + b.a(this.errorCode, this.key.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.key;
        int i = this.errorCode;
        return a.o(b.u("CheckoutError(key=", i, str, ", errorCode=", ", message="), this.message, ")");
    }
}
