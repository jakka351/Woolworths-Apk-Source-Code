package au.com.woolworths.feature.shared.receipt.details.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.graphql.MappedName;
import com.google.gson.annotations.SerializedName;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDetailsPayment;", "", "", lqlqqlq.mmm006Dm006Dm, "amount", "iconUrl", "altText", "", "Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDetailsPaymentInfo;", ErrorBundle.DETAIL_ENTRY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "e", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "receipt-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EReceiptDetailsPayment {

    @SerializedName("altText")
    @Nullable
    private final String altText;

    @SerializedName("amount")
    @NotNull
    private final String amount;

    @SerializedName(lqlqqlq.mmm006Dm006Dm)
    @NotNull
    private final String description;

    @SerializedName("paymentDetails")
    @MappedName
    @Nullable
    private final List<EReceiptDetailsPaymentInfo> details;

    @SerializedName("iconUrl")
    @Nullable
    private final String iconUrl;

    public EReceiptDetailsPayment(@NotNull String description, @NotNull String amount, @Nullable String str, @Nullable String str2, @Nullable List<EReceiptDetailsPaymentInfo> list) {
        Intrinsics.h(description, "description");
        Intrinsics.h(amount, "amount");
        this.description = description;
        this.amount = amount;
        this.iconUrl = str;
        this.altText = str2;
        this.details = list;
    }

    /* renamed from: a, reason: from getter */
    public final String getAltText() {
        return this.altText;
    }

    /* renamed from: b, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    /* renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: d, reason: from getter */
    public final List getDetails() {
        return this.details;
    }

    /* renamed from: e, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EReceiptDetailsPayment)) {
            return false;
        }
        EReceiptDetailsPayment eReceiptDetailsPayment = (EReceiptDetailsPayment) obj;
        return Intrinsics.c(this.description, eReceiptDetailsPayment.description) && Intrinsics.c(this.amount, eReceiptDetailsPayment.amount) && Intrinsics.c(this.iconUrl, eReceiptDetailsPayment.iconUrl) && Intrinsics.c(this.altText, eReceiptDetailsPayment.altText) && Intrinsics.c(this.details, eReceiptDetailsPayment.details);
    }

    public final int hashCode() {
        int iC = b.c(this.description.hashCode() * 31, 31, this.amount);
        String str = this.iconUrl;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.altText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<EReceiptDetailsPaymentInfo> list = this.details;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str = this.description;
        String str2 = this.amount;
        String str3 = this.iconUrl;
        String str4 = this.altText;
        List<EReceiptDetailsPaymentInfo> list = this.details;
        StringBuilder sbV = a.v("EReceiptDetailsPayment(description=", str, ", amount=", str2, ", iconUrl=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", altText=", str4, ", details=");
        return android.support.v4.media.session.a.t(sbV, list, ")");
    }
}
