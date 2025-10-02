package com.woolworths.scanlibrary.data.payment;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/woolworths/scanlibrary/data/payment/PaymentStatus;", "", "status", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "COMPLETED", "PAID", "UNKNOWN", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PaymentStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PaymentStatus[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String status;
    public static final PaymentStatus COMPLETED = new PaymentStatus("COMPLETED", 0, "COMPLETED");
    public static final PaymentStatus PAID = new PaymentStatus("PAID", 1, "PAID");
    public static final PaymentStatus UNKNOWN = new PaymentStatus("UNKNOWN", 2, "UNKNOWN");

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/data/payment/PaymentStatus$Companion;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    private static final /* synthetic */ PaymentStatus[] $values() {
        return new PaymentStatus[]{COMPLETED, PAID, UNKNOWN};
    }

    static {
        PaymentStatus[] paymentStatusArr$values = $values();
        $VALUES = paymentStatusArr$values;
        $ENTRIES = EnumEntriesKt.a(paymentStatusArr$values);
        INSTANCE = new Companion();
    }

    private PaymentStatus(String str, int i, String str2) {
        this.status = str2;
    }

    @NotNull
    public static EnumEntries<PaymentStatus> getEntries() {
        return $ENTRIES;
    }

    public static PaymentStatus valueOf(String str) {
        return (PaymentStatus) Enum.valueOf(PaymentStatus.class, str);
    }

    public static PaymentStatus[] values() {
        return (PaymentStatus[]) $VALUES.clone();
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }
}
