package com.woolworths.scanlibrary.models.profile;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003JJ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0002\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/woolworths/scanlibrary/models/profile/PaymentMethodVerification;", "", "isPaymentMethodVerified", "", "notificationTitle", "", "notificationMessage", "positiveAction", "negativeAction", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNotificationTitle", "()Ljava/lang/String;", "getNotificationMessage", "getPositiveAction", "getNegativeAction", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/woolworths/scanlibrary/models/profile/PaymentMethodVerification;", "equals", "other", "hashCode", "", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PaymentMethodVerification {
    public static final int $stable = 0;

    @SerializedName("ispaymentverified")
    @Nullable
    private final Boolean isPaymentMethodVerified;

    @SerializedName("negativeaction")
    @Nullable
    private final String negativeAction;

    @SerializedName("notificationmessage")
    @Nullable
    private final String notificationMessage;

    @SerializedName("notificationtitle")
    @Nullable
    private final String notificationTitle;

    @SerializedName("positiveaction")
    @Nullable
    private final String positiveAction;

    public PaymentMethodVerification() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ PaymentMethodVerification copy$default(PaymentMethodVerification paymentMethodVerification, Boolean bool, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = paymentMethodVerification.isPaymentMethodVerified;
        }
        if ((i & 2) != 0) {
            str = paymentMethodVerification.notificationTitle;
        }
        if ((i & 4) != 0) {
            str2 = paymentMethodVerification.notificationMessage;
        }
        if ((i & 8) != 0) {
            str3 = paymentMethodVerification.positiveAction;
        }
        if ((i & 16) != 0) {
            str4 = paymentMethodVerification.negativeAction;
        }
        String str5 = str4;
        String str6 = str2;
        return paymentMethodVerification.copy(bool, str, str6, str3, str5);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Boolean getIsPaymentMethodVerified() {
        return this.isPaymentMethodVerified;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getNotificationTitle() {
        return this.notificationTitle;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getNotificationMessage() {
        return this.notificationMessage;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getPositiveAction() {
        return this.positiveAction;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getNegativeAction() {
        return this.negativeAction;
    }

    @NotNull
    public final PaymentMethodVerification copy(@Nullable Boolean isPaymentMethodVerified, @Nullable String notificationTitle, @Nullable String notificationMessage, @Nullable String positiveAction, @Nullable String negativeAction) {
        return new PaymentMethodVerification(isPaymentMethodVerified, notificationTitle, notificationMessage, positiveAction, negativeAction);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodVerification)) {
            return false;
        }
        PaymentMethodVerification paymentMethodVerification = (PaymentMethodVerification) other;
        return Intrinsics.c(this.isPaymentMethodVerified, paymentMethodVerification.isPaymentMethodVerified) && Intrinsics.c(this.notificationTitle, paymentMethodVerification.notificationTitle) && Intrinsics.c(this.notificationMessage, paymentMethodVerification.notificationMessage) && Intrinsics.c(this.positiveAction, paymentMethodVerification.positiveAction) && Intrinsics.c(this.negativeAction, paymentMethodVerification.negativeAction);
    }

    @Nullable
    public final String getNegativeAction() {
        return this.negativeAction;
    }

    @Nullable
    public final String getNotificationMessage() {
        return this.notificationMessage;
    }

    @Nullable
    public final String getNotificationTitle() {
        return this.notificationTitle;
    }

    @Nullable
    public final String getPositiveAction() {
        return this.positiveAction;
    }

    public int hashCode() {
        Boolean bool = this.isPaymentMethodVerified;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.notificationTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.notificationMessage;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.positiveAction;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.negativeAction;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @Nullable
    public final Boolean isPaymentMethodVerified() {
        return this.isPaymentMethodVerified;
    }

    @NotNull
    public String toString() {
        Boolean bool = this.isPaymentMethodVerified;
        String str = this.notificationTitle;
        String str2 = this.notificationMessage;
        String str3 = this.positiveAction;
        String str4 = this.negativeAction;
        StringBuilder sb = new StringBuilder("PaymentMethodVerification(isPaymentMethodVerified=");
        sb.append(bool);
        sb.append(", notificationTitle=");
        sb.append(str);
        sb.append(", notificationMessage=");
        a.B(sb, str2, ", positiveAction=", str3, ", negativeAction=");
        return YU.a.o(sb, str4, ")");
    }

    public PaymentMethodVerification(@Nullable Boolean bool, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.isPaymentMethodVerified = bool;
        this.notificationTitle = str;
        this.notificationMessage = str2;
        this.positiveAction = str3;
        this.negativeAction = str4;
    }

    public /* synthetic */ PaymentMethodVerification(Boolean bool, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }
}
