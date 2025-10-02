package com.woolworths.scanlibrary.models.tapon;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/woolworths/scanlibrary/models/tapon/Transaction;", "", "id", "", "seqNumber", "", "<init>", "(Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getSeqNumber", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Transaction {
    public static final int $stable = 0;

    @SerializedName("id")
    @NotNull
    private final String id;

    @SerializedName("seqnumber")
    private final int seqNumber;

    public Transaction(@NotNull String id, int i) {
        Intrinsics.h(id, "id");
        this.id = id;
        this.seqNumber = i;
    }

    public static /* synthetic */ Transaction copy$default(Transaction transaction, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = transaction.id;
        }
        if ((i2 & 2) != 0) {
            i = transaction.seqNumber;
        }
        return transaction.copy(str, i);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSeqNumber() {
        return this.seqNumber;
    }

    @NotNull
    public final Transaction copy(@NotNull String id, int seqNumber) {
        Intrinsics.h(id, "id");
        return new Transaction(id, seqNumber);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Transaction)) {
            return false;
        }
        Transaction transaction = (Transaction) other;
        return Intrinsics.c(this.id, transaction.id) && this.seqNumber == transaction.seqNumber;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final int getSeqNumber() {
        return this.seqNumber;
    }

    public int hashCode() {
        return Integer.hashCode(this.seqNumber) + (this.id.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a.p("Transaction(id=", this.seqNumber, this.id, ", seqNumber=", ")");
    }

    public /* synthetic */ Transaction(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 0 : i);
    }
}
