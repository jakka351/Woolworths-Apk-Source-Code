package au.com.woolworths.feature.shared.receipt.details.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDetailsCouponSection;", "", "", "sectionTitle", "", ErrorBundle.DETAIL_ENTRY, "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/List;", "a", "()Ljava/util/List;", "receipt-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EReceiptDetailsCouponSection {

    @SerializedName(ErrorBundle.DETAIL_ENTRY)
    @NotNull
    private final List<String> details;

    @SerializedName("sectionTitle")
    @Nullable
    private final String sectionTitle;

    public EReceiptDetailsCouponSection(@Nullable String str, @NotNull List<String> details) {
        Intrinsics.h(details, "details");
        this.sectionTitle = str;
        this.details = details;
    }

    /* renamed from: a, reason: from getter */
    public final List getDetails() {
        return this.details;
    }

    /* renamed from: b, reason: from getter */
    public final String getSectionTitle() {
        return this.sectionTitle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EReceiptDetailsCouponSection)) {
            return false;
        }
        EReceiptDetailsCouponSection eReceiptDetailsCouponSection = (EReceiptDetailsCouponSection) obj;
        return Intrinsics.c(this.sectionTitle, eReceiptDetailsCouponSection.sectionTitle) && Intrinsics.c(this.details, eReceiptDetailsCouponSection.details);
    }

    public final int hashCode() {
        String str = this.sectionTitle;
        return this.details.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return a.i("EReceiptDetailsCouponSection(sectionTitle=", this.sectionTitle, ", details=", ")", this.details);
    }
}
