package au.com.woolworths.shop.checkout.domain.model.breakdown;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR&\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/breakdown/OrderSummaryTotalDetails;", "", "", "title", "", "Lau/com/woolworths/shop/checkout/domain/model/breakdown/OrderTotalDetailsSection;", "sections", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/List;", "a", "()Ljava/util/List;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OrderSummaryTotalDetails {

    @SerializedName("sections")
    @NotNull
    private final List<List<OrderTotalDetailsSection>> sections;

    @SerializedName("title")
    @NotNull
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public OrderSummaryTotalDetails(@NotNull String title, @NotNull List<? extends List<OrderTotalDetailsSection>> sections) {
        Intrinsics.h(title, "title");
        Intrinsics.h(sections, "sections");
        this.title = title;
        this.sections = sections;
    }

    /* renamed from: a, reason: from getter */
    public final List getSections() {
        return this.sections;
    }

    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderSummaryTotalDetails)) {
            return false;
        }
        OrderSummaryTotalDetails orderSummaryTotalDetails = (OrderSummaryTotalDetails) obj;
        return Intrinsics.c(this.title, orderSummaryTotalDetails.title) && Intrinsics.c(this.sections, orderSummaryTotalDetails.sections);
    }

    public final int hashCode() {
        return this.sections.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return a.i("OrderSummaryTotalDetails(title=", this.title, ", sections=", ")", this.sections);
    }
}
