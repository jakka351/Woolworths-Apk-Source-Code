package au.com.woolworths.feature.shop.myorders.details.infomodal;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/infomodal/ProgressStepperInfoViewState;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProgressStepperInfoViewState {

    /* renamed from: a, reason: collision with root package name */
    public final List f7738a;

    public ProgressStepperInfoViewState(List infoItems) {
        Intrinsics.h(infoItems, "infoItems");
        this.f7738a = infoItems;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProgressStepperInfoViewState) && Intrinsics.c(this.f7738a, ((ProgressStepperInfoViewState) obj).f7738a);
    }

    public final int hashCode() {
        return this.f7738a.hashCode();
    }

    public final String toString() {
        return au.com.woolworths.android.onesite.a.l("ProgressStepperInfoViewState(infoItems=", ")", this.f7738a);
    }
}
