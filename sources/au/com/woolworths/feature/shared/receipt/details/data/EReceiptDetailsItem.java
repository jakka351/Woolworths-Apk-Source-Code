package au.com.woolworths.feature.shared.receipt.details.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDetailsItem;", "", "", lqlqqlq.mmm006Dm006Dm, "amount", "prefixChar", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "a", "c", "receipt-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EReceiptDetailsItem {

    @SerializedName("amount")
    @Nullable
    private final String amount;

    @SerializedName(lqlqqlq.mmm006Dm006Dm)
    @NotNull
    private final String description;

    @SerializedName("prefixChar")
    @Nullable
    private final String prefixChar;

    public EReceiptDetailsItem(@NotNull String description, @Nullable String str, @Nullable String str2) {
        Intrinsics.h(description, "description");
        this.description = description;
        this.amount = str;
        this.prefixChar = str2;
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
        if (!(obj instanceof EReceiptDetailsItem)) {
            return false;
        }
        EReceiptDetailsItem eReceiptDetailsItem = (EReceiptDetailsItem) obj;
        return Intrinsics.c(this.description, eReceiptDetailsItem.description) && Intrinsics.c(this.amount, eReceiptDetailsItem.amount) && Intrinsics.c(this.prefixChar, eReceiptDetailsItem.prefixChar);
    }

    public final int hashCode() {
        int iHashCode = this.description.hashCode() * 31;
        String str = this.amount;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.prefixChar;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.description;
        String str2 = this.amount;
        return a.o(a.v("EReceiptDetailsItem(description=", str, ", amount=", str2, ", prefixChar="), this.prefixChar, ")");
    }
}
