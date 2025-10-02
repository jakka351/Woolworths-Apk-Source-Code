package com.woolworths.scanlibrary.models.receipt;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import com.google.gson.annotations.SerializedName;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/woolworths/scanlibrary/models/receipt/Transaction;", "", "txnTime", "Ljava/util/Date;", "seqNumber", "", "date", "dateString", "time", "<init>", "(Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTxnTime", "()Ljava/util/Date;", "getSeqNumber", "()Ljava/lang/String;", "getDate", "getDateString", "getTime", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Transaction {
    public static final int $stable = 8;

    @SerializedName("date")
    @NotNull
    private final String date;

    @SerializedName("datestring")
    @NotNull
    private final String dateString;

    @SerializedName("seqnumber")
    @NotNull
    private final String seqNumber;

    @SerializedName("time")
    @NotNull
    private final String time;

    @SerializedName("txntime")
    @NotNull
    private final Date txnTime;

    public Transaction(@NotNull Date txnTime, @NotNull String seqNumber, @NotNull String date, @NotNull String dateString, @NotNull String time) {
        Intrinsics.h(txnTime, "txnTime");
        Intrinsics.h(seqNumber, "seqNumber");
        Intrinsics.h(date, "date");
        Intrinsics.h(dateString, "dateString");
        Intrinsics.h(time, "time");
        this.txnTime = txnTime;
        this.seqNumber = seqNumber;
        this.date = date;
        this.dateString = dateString;
        this.time = time;
    }

    public static /* synthetic */ Transaction copy$default(Transaction transaction, Date date, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            date = transaction.txnTime;
        }
        if ((i & 2) != 0) {
            str = transaction.seqNumber;
        }
        if ((i & 4) != 0) {
            str2 = transaction.date;
        }
        if ((i & 8) != 0) {
            str3 = transaction.dateString;
        }
        if ((i & 16) != 0) {
            str4 = transaction.time;
        }
        String str5 = str4;
        String str6 = str2;
        return transaction.copy(date, str, str6, str3, str5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Date getTxnTime() {
        return this.txnTime;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSeqNumber() {
        return this.seqNumber;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getDateString() {
        return this.dateString;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    @NotNull
    public final Transaction copy(@NotNull Date txnTime, @NotNull String seqNumber, @NotNull String date, @NotNull String dateString, @NotNull String time) {
        Intrinsics.h(txnTime, "txnTime");
        Intrinsics.h(seqNumber, "seqNumber");
        Intrinsics.h(date, "date");
        Intrinsics.h(dateString, "dateString");
        Intrinsics.h(time, "time");
        return new Transaction(txnTime, seqNumber, date, dateString, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Transaction)) {
            return false;
        }
        Transaction transaction = (Transaction) other;
        return Intrinsics.c(this.txnTime, transaction.txnTime) && Intrinsics.c(this.seqNumber, transaction.seqNumber) && Intrinsics.c(this.date, transaction.date) && Intrinsics.c(this.dateString, transaction.dateString) && Intrinsics.c(this.time, transaction.time);
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    @NotNull
    public final String getDateString() {
        return this.dateString;
    }

    @NotNull
    public final String getSeqNumber() {
        return this.seqNumber;
    }

    @NotNull
    public final String getTime() {
        return this.time;
    }

    @NotNull
    public final Date getTxnTime() {
        return this.txnTime;
    }

    public int hashCode() {
        return this.time.hashCode() + b.c(b.c(b.c(this.txnTime.hashCode() * 31, 31, this.seqNumber), 31, this.date), 31, this.dateString);
    }

    @NotNull
    public String toString() {
        Date date = this.txnTime;
        String str = this.seqNumber;
        String str2 = this.date;
        String str3 = this.dateString;
        String str4 = this.time;
        StringBuilder sb = new StringBuilder("Transaction(txnTime=");
        sb.append(date);
        sb.append(", seqNumber=");
        sb.append(str);
        sb.append(", date=");
        a.B(sb, str2, ", dateString=", str3, ", time=");
        return YU.a.o(sb, str4, ")");
    }
}
