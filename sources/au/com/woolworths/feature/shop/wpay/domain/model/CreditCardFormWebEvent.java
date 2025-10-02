package au.com.woolworths.feature.shop.wpay.domain.model;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/CreditCardFormWebEvent;", "", "<init>", "()V", "ValidationError", "FormChanged", "Success", "Fail", "Invalid", "Unknown", "Lau/com/woolworths/feature/shop/wpay/domain/model/CreditCardFormWebEvent$Fail;", "Lau/com/woolworths/feature/shop/wpay/domain/model/CreditCardFormWebEvent$FormChanged;", "Lau/com/woolworths/feature/shop/wpay/domain/model/CreditCardFormWebEvent$Invalid;", "Lau/com/woolworths/feature/shop/wpay/domain/model/CreditCardFormWebEvent$Success;", "Lau/com/woolworths/feature/shop/wpay/domain/model/CreditCardFormWebEvent$Unknown;", "Lau/com/woolworths/feature/shop/wpay/domain/model/CreditCardFormWebEvent$ValidationError;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CreditCardFormWebEvent {
    public static final int $stable = 0;

    @StabilityInferred
    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JF\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/CreditCardFormWebEvent$Fail;", "Lau/com/woolworths/feature/shop/wpay/domain/model/CreditCardFormWebEvent;", "reason", "", "status", "", "code", "message", "checkoutSessionId", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "getStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCode", "getMessage", "getCheckoutSessionId", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lau/com/woolworths/feature/shop/wpay/domain/model/CreditCardFormWebEvent$Fail;", "equals", "", "other", "", "hashCode", "toString", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Fail extends CreditCardFormWebEvent {
        public static final int $stable = 0;

        @NotNull
        private final String checkoutSessionId;

        @Nullable
        private final String code;

        @Nullable
        private final String message;

        @NotNull
        private final String reason;

        @Nullable
        private final Integer status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Fail(@NotNull String reason, @Nullable Integer num, @Nullable String str, @Nullable String str2, @NotNull String checkoutSessionId) {
            super(null);
            Intrinsics.h(reason, "reason");
            Intrinsics.h(checkoutSessionId, "checkoutSessionId");
            this.reason = reason;
            this.status = num;
            this.code = str;
            this.message = str2;
            this.checkoutSessionId = checkoutSessionId;
        }

        public static /* synthetic */ Fail copy$default(Fail fail, String str, Integer num, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fail.reason;
            }
            if ((i & 2) != 0) {
                num = fail.status;
            }
            if ((i & 4) != 0) {
                str2 = fail.code;
            }
            if ((i & 8) != 0) {
                str3 = fail.message;
            }
            if ((i & 16) != 0) {
                str4 = fail.checkoutSessionId;
            }
            String str5 = str4;
            String str6 = str2;
            return fail.copy(str, num, str6, str3, str5);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Integer getStatus() {
            return this.status;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final String getCheckoutSessionId() {
            return this.checkoutSessionId;
        }

        @NotNull
        public final Fail copy(@NotNull String reason, @Nullable Integer status, @Nullable String code, @Nullable String message, @NotNull String checkoutSessionId) {
            Intrinsics.h(reason, "reason");
            Intrinsics.h(checkoutSessionId, "checkoutSessionId");
            return new Fail(reason, status, code, message, checkoutSessionId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Fail)) {
                return false;
            }
            Fail fail = (Fail) other;
            return Intrinsics.c(this.reason, fail.reason) && Intrinsics.c(this.status, fail.status) && Intrinsics.c(this.code, fail.code) && Intrinsics.c(this.message, fail.message) && Intrinsics.c(this.checkoutSessionId, fail.checkoutSessionId);
        }

        @NotNull
        public final String getCheckoutSessionId() {
            return this.checkoutSessionId;
        }

        @Nullable
        public final String getCode() {
            return this.code;
        }

        @Nullable
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final String getReason() {
            return this.reason;
        }

        @Nullable
        public final Integer getStatus() {
            return this.status;
        }

        public int hashCode() {
            int iHashCode = this.reason.hashCode() * 31;
            Integer num = this.status;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.code;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.message;
            return this.checkoutSessionId.hashCode() + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.reason;
            Integer num = this.status;
            String str2 = this.code;
            String str3 = this.message;
            String str4 = this.checkoutSessionId;
            StringBuilder sb = new StringBuilder("Fail(reason=");
            sb.append(str);
            sb.append(", status=");
            sb.append(num);
            sb.append(", code=");
            a.B(sb, str2, ", message=", str3, ", checkoutSessionId=");
            return YU.a.o(sb, str4, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/CreditCardFormWebEvent$FormChanged;", "Lau/com/woolworths/feature/shop/wpay/domain/model/CreditCardFormWebEvent;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FormChanged extends CreditCardFormWebEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final FormChanged f8280a = new FormChanged(null);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FormChanged);
        }

        public final int hashCode() {
            return 227527898;
        }

        public final String toString() {
            return "FormChanged";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/CreditCardFormWebEvent$Invalid;", "Lau/com/woolworths/feature/shop/wpay/domain/model/CreditCardFormWebEvent;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Invalid extends CreditCardFormWebEvent {

        /* renamed from: a, reason: collision with root package name */
        public final Exception f8281a;

        public Invalid(Exception exc) {
            super(null);
            this.f8281a = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Invalid) && Intrinsics.c(this.f8281a, ((Invalid) obj).f8281a);
        }

        public final int hashCode() {
            return this.f8281a.hashCode();
        }

        public final String toString() {
            return "Invalid(exception=" + this.f8281a + ")";
        }
    }

    @StabilityInferred
    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/CreditCardFormWebEvent$Success;", "Lau/com/woolworths/feature/shop/wpay/domain/model/CreditCardFormWebEvent;", "checkoutSessionId", "", "paymentMethodId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCheckoutSessionId", "()Ljava/lang/String;", "getPaymentMethodId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Success extends CreditCardFormWebEvent {
        public static final int $stable = 0;

        @NotNull
        private final String checkoutSessionId;

        @NotNull
        private final String paymentMethodId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull String checkoutSessionId, @NotNull String paymentMethodId) {
            super(null);
            Intrinsics.h(checkoutSessionId, "checkoutSessionId");
            Intrinsics.h(paymentMethodId, "paymentMethodId");
            this.checkoutSessionId = checkoutSessionId;
            this.paymentMethodId = paymentMethodId;
        }

        public static /* synthetic */ Success copy$default(Success success, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.checkoutSessionId;
            }
            if ((i & 2) != 0) {
                str2 = success.paymentMethodId;
            }
            return success.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getCheckoutSessionId() {
            return this.checkoutSessionId;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getPaymentMethodId() {
            return this.paymentMethodId;
        }

        @NotNull
        public final Success copy(@NotNull String checkoutSessionId, @NotNull String paymentMethodId) {
            Intrinsics.h(checkoutSessionId, "checkoutSessionId");
            Intrinsics.h(paymentMethodId, "paymentMethodId");
            return new Success(checkoutSessionId, paymentMethodId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.c(this.checkoutSessionId, success.checkoutSessionId) && Intrinsics.c(this.paymentMethodId, success.paymentMethodId);
        }

        @NotNull
        public final String getCheckoutSessionId() {
            return this.checkoutSessionId;
        }

        @NotNull
        public final String getPaymentMethodId() {
            return this.paymentMethodId;
        }

        public int hashCode() {
            return this.paymentMethodId.hashCode() + (this.checkoutSessionId.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return YU.a.j("Success(checkoutSessionId=", this.checkoutSessionId, ", paymentMethodId=", this.paymentMethodId, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/CreditCardFormWebEvent$Unknown;", "Lau/com/woolworths/feature/shop/wpay/domain/model/CreditCardFormWebEvent;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Unknown extends CreditCardFormWebEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final Unknown f8282a = new Unknown(null);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Unknown);
        }

        public final int hashCode() {
            return 1683227860;
        }

        public final String toString() {
            return "Unknown";
        }
    }

    @StabilityInferred
    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/CreditCardFormWebEvent$ValidationError;", "Lau/com/woolworths/feature/shop/wpay/domain/model/CreditCardFormWebEvent;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ValidationError extends CreditCardFormWebEvent {
        public static final int $stable = 0;

        @Nullable
        private final String message;

        public ValidationError(@Nullable String str) {
            super(null);
            this.message = str;
        }

        public static /* synthetic */ ValidationError copy$default(ValidationError validationError, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = validationError.message;
            }
            return validationError.copy(str);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final ValidationError copy(@Nullable String message) {
            return new ValidationError(message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ValidationError) && Intrinsics.c(this.message, ((ValidationError) other).message);
        }

        @Nullable
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return YU.a.h("ValidationError(message=", this.message, ")");
        }
    }

    public /* synthetic */ CreditCardFormWebEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CreditCardFormWebEvent() {
    }
}
