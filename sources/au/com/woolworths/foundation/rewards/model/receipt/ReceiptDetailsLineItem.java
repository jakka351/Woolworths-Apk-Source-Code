package au.com.woolworths.foundation.rewards.model.receipt;

import YU.a;
import androidx.camera.core.impl.b;
import com.google.gson.annotations.SerializedName;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lau/com/woolworths/foundation/rewards/model/receipt/ReceiptDetailsLineItem;", "", "", "prefixChar", lqlqqlq.mmm006Dm006Dm, "amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "a", "model"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ReceiptDetailsLineItem {

    @SerializedName("amount")
    @Nullable
    private final String amount;

    @SerializedName(lqlqqlq.mmm006Dm006Dm)
    @NotNull
    private final String description;

    @SerializedName("prefixChar")
    @Nullable
    private final String prefixChar;

    public ReceiptDetailsLineItem(@Nullable String str, @NotNull String description, @Nullable String str2) {
        Intrinsics.h(description, "description");
        this.prefixChar = str;
        this.description = description;
        this.amount = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: c, reason: from getter */
    public final String getPrefixChar() {
        return this.prefixChar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReceiptDetailsLineItem)) {
            return false;
        }
        ReceiptDetailsLineItem receiptDetailsLineItem = (ReceiptDetailsLineItem) obj;
        return Intrinsics.c(this.prefixChar, receiptDetailsLineItem.prefixChar) && Intrinsics.c(this.description, receiptDetailsLineItem.description) && Intrinsics.c(this.amount, receiptDetailsLineItem.amount);
    }

    public final int hashCode() {
        String str = this.prefixChar;
        int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.description);
        String str2 = this.amount;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.prefixChar;
        String str2 = this.description;
        return a.o(a.v("ReceiptDetailsLineItem(prefixChar=", str, ", description=", str2, ", amount="), this.amount, ")");
    }
}
