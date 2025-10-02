package com.woolworths.scanlibrary.models.payment;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.google.android.gms.common.api.internal.a;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003JW\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0016¨\u0006*"}, d2 = {"Lcom/woolworths/scanlibrary/models/payment/PaymentInformation;", "", "paymentInstrumentId", "", "amount", "Ljava/math/BigDecimal;", "cardSuffix", "scheme", "stepUpToken", "expired", "", "PaymentInstrumentType", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getPaymentInstrumentId", "()Ljava/lang/String;", "getAmount", "()Ljava/math/BigDecimal;", "getCardSuffix", "getScheme", "getStepUpToken", "setStepUpToken", "(Ljava/lang/String;)V", "getExpired", "()Z", "setExpired", "(Z)V", "getPaymentInstrumentType", "setPaymentInstrumentType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PaymentInformation {
    public static final int $stable = 8;

    @SerializedName("paymentInstrumentType")
    @Nullable
    private String PaymentInstrumentType;

    @SerializedName("amount")
    @NotNull
    private final BigDecimal amount;

    @SerializedName("cardSuffix")
    @Nullable
    private final String cardSuffix;

    @SerializedName("expired")
    private boolean expired;

    @SerializedName("paymentInstrumentId")
    @NotNull
    private final String paymentInstrumentId;

    @SerializedName("scheme")
    @Nullable
    private final String scheme;

    @SerializedName("stepUpToken")
    @Nullable
    private String stepUpToken;

    public PaymentInformation(@NotNull String paymentInstrumentId, @NotNull BigDecimal amount, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, @Nullable String str4) {
        Intrinsics.h(paymentInstrumentId, "paymentInstrumentId");
        Intrinsics.h(amount, "amount");
        this.paymentInstrumentId = paymentInstrumentId;
        this.amount = amount;
        this.cardSuffix = str;
        this.scheme = str2;
        this.stepUpToken = str3;
        this.expired = z;
        this.PaymentInstrumentType = str4;
    }

    public static /* synthetic */ PaymentInformation copy$default(PaymentInformation paymentInformation, String str, BigDecimal bigDecimal, String str2, String str3, String str4, boolean z, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentInformation.paymentInstrumentId;
        }
        if ((i & 2) != 0) {
            bigDecimal = paymentInformation.amount;
        }
        if ((i & 4) != 0) {
            str2 = paymentInformation.cardSuffix;
        }
        if ((i & 8) != 0) {
            str3 = paymentInformation.scheme;
        }
        if ((i & 16) != 0) {
            str4 = paymentInformation.stepUpToken;
        }
        if ((i & 32) != 0) {
            z = paymentInformation.expired;
        }
        if ((i & 64) != 0) {
            str5 = paymentInformation.PaymentInstrumentType;
        }
        boolean z2 = z;
        String str6 = str5;
        String str7 = str4;
        String str8 = str2;
        return paymentInformation.copy(str, bigDecimal, str8, str3, str7, z2, str6);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPaymentInstrumentId() {
        return this.paymentInstrumentId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getCardSuffix() {
        return this.cardSuffix;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getStepUpToken() {
        return this.stepUpToken;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getExpired() {
        return this.expired;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getPaymentInstrumentType() {
        return this.PaymentInstrumentType;
    }

    @NotNull
    public final PaymentInformation copy(@NotNull String paymentInstrumentId, @NotNull BigDecimal amount, @Nullable String cardSuffix, @Nullable String scheme, @Nullable String stepUpToken, boolean expired, @Nullable String PaymentInstrumentType) {
        Intrinsics.h(paymentInstrumentId, "paymentInstrumentId");
        Intrinsics.h(amount, "amount");
        return new PaymentInformation(paymentInstrumentId, amount, cardSuffix, scheme, stepUpToken, expired, PaymentInstrumentType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentInformation)) {
            return false;
        }
        PaymentInformation paymentInformation = (PaymentInformation) other;
        return Intrinsics.c(this.paymentInstrumentId, paymentInformation.paymentInstrumentId) && Intrinsics.c(this.amount, paymentInformation.amount) && Intrinsics.c(this.cardSuffix, paymentInformation.cardSuffix) && Intrinsics.c(this.scheme, paymentInformation.scheme) && Intrinsics.c(this.stepUpToken, paymentInformation.stepUpToken) && this.expired == paymentInformation.expired && Intrinsics.c(this.PaymentInstrumentType, paymentInformation.PaymentInstrumentType);
    }

    @NotNull
    public final BigDecimal getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getCardSuffix() {
        return this.cardSuffix;
    }

    public final boolean getExpired() {
        return this.expired;
    }

    @NotNull
    public final String getPaymentInstrumentId() {
        return this.paymentInstrumentId;
    }

    @Nullable
    public final String getPaymentInstrumentType() {
        return this.PaymentInstrumentType;
    }

    @Nullable
    public final String getScheme() {
        return this.scheme;
    }

    @Nullable
    public final String getStepUpToken() {
        return this.stepUpToken;
    }

    public int hashCode() {
        int iC = a.c(this.amount, this.paymentInstrumentId.hashCode() * 31, 31);
        String str = this.cardSuffix;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.scheme;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.stepUpToken;
        int iE = b.e((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.expired);
        String str4 = this.PaymentInstrumentType;
        return iE + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setExpired(boolean z) {
        this.expired = z;
    }

    public final void setPaymentInstrumentType(@Nullable String str) {
        this.PaymentInstrumentType = str;
    }

    public final void setStepUpToken(@Nullable String str) {
        this.stepUpToken = str;
    }

    @NotNull
    public String toString() {
        String str = this.paymentInstrumentId;
        BigDecimal bigDecimal = this.amount;
        String str2 = this.cardSuffix;
        String str3 = this.scheme;
        String str4 = this.stepUpToken;
        boolean z = this.expired;
        String str5 = this.PaymentInstrumentType;
        StringBuilder sb = new StringBuilder("PaymentInformation(paymentInstrumentId=");
        sb.append(str);
        sb.append(", amount=");
        sb.append(bigDecimal);
        sb.append(", cardSuffix=");
        androidx.constraintlayout.core.state.a.B(sb, str2, ", scheme=", str3, ", stepUpToken=");
        d.A(str4, ", expired=", ", PaymentInstrumentType=", sb, z);
        return YU.a.o(sb, str5, ")");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ PaymentInformation(java.lang.String r2, java.math.BigDecimal r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, boolean r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r10 = r9 & 4
            r0 = 0
            if (r10 == 0) goto Lc
            r4 = r0
        Lc:
            r10 = r9 & 8
            if (r10 == 0) goto L11
            r5 = r0
        L11:
            r10 = r9 & 16
            if (r10 == 0) goto L16
            r6 = r0
        L16:
            r10 = r9 & 32
            if (r10 == 0) goto L1b
            r7 = 0
        L1b:
            r9 = r9 & 64
            if (r9 == 0) goto L28
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L30
        L28:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L30:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.woolworths.scanlibrary.models.payment.PaymentInformation.<init>(java.lang.String, java.math.BigDecimal, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
