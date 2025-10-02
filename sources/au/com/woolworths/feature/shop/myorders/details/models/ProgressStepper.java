package au.com.woolworths.feature.shop.myorders.details.models;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/ProgressStepper;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProgressStepper {

    /* renamed from: a, reason: collision with root package name */
    public final String f7775a;
    public final int b;
    public final ProgressStepTypeApiData c;
    public final int d;
    public final TooltipType e;

    public ProgressStepper(String str, int i, ProgressStepTypeApiData progressStepTypeApiData, int i2, TooltipType tooltipType) {
        this.f7775a = str;
        this.b = i;
        this.c = progressStepTypeApiData;
        this.d = i2;
        this.e = tooltipType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressStepper)) {
            return false;
        }
        ProgressStepper progressStepper = (ProgressStepper) obj;
        return Intrinsics.c(this.f7775a, progressStepper.f7775a) && this.b == progressStepper.b && this.c == progressStepper.c && this.d == progressStepper.d && this.e == progressStepper.e;
    }

    public final int hashCode() {
        int iA = b.a(this.d, (this.c.hashCode() + b.a(this.b, this.f7775a.hashCode() * 31, 31)) * 31, 31);
        TooltipType tooltipType = this.e;
        return iA + (tooltipType == null ? 0 : tooltipType.hashCode());
    }

    public final String toString() {
        StringBuilder sbU = b.u("ProgressStepper(currentStep=", this.b, this.f7775a, ", totalSteps=", ", progressStepTypeApiData=");
        sbU.append(this.c);
        sbU.append(", currentStepPosition=");
        sbU.append(this.d);
        sbU.append(", imageName=");
        sbU.append(this.e);
        sbU.append(")");
        return sbU.toString();
    }
}
