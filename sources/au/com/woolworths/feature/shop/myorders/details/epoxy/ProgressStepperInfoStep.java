package au.com.woolworths.feature.shop.myorders.details.epoxy;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.myorders.ItemProgressStepperInfoStepBindingModel_;
import au.com.woolworths.feature.shop.myorders.details.infomodal.ProgressStepperInfoController;
import au.com.woolworths.feature.shop.myorders.details.models.ToolTipStepInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/epoxy/ProgressStepperInfoStep;", "Lau/com/woolworths/feature/shop/myorders/details/epoxy/ProgressStepperInfoItem;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class ProgressStepperInfoStep implements ProgressStepperInfoItem {

    /* renamed from: a, reason: collision with root package name */
    public final ToolTipStepInfo f7700a;

    public ProgressStepperInfoStep(ToolTipStepInfo progressStepperToolTipStepInfo) {
        Intrinsics.h(progressStepperToolTipStepInfo, "progressStepperToolTipStepInfo");
        this.f7700a = progressStepperToolTipStepInfo;
    }

    @Override // au.com.woolworths.feature.shop.myorders.details.epoxy.ProgressStepperInfoItem
    public final void a(ProgressStepperInfoController progressStepperInfoController) {
        ItemProgressStepperInfoStepBindingModel_ itemProgressStepperInfoStepBindingModel_ = new ItemProgressStepperInfoStepBindingModel_();
        ToolTipStepInfo toolTipStepInfo = this.f7700a;
        itemProgressStepperInfoStepBindingModel_.M("progress_stepper_info_step_" + toolTipStepInfo.d);
        itemProgressStepperInfoStepBindingModel_.t();
        itemProgressStepperInfoStepBindingModel_.n = toolTipStepInfo;
        progressStepperInfoController.add(itemProgressStepperInfoStepBindingModel_);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProgressStepperInfoStep) && Intrinsics.c(this.f7700a, ((ProgressStepperInfoStep) obj).f7700a);
    }

    public final int hashCode() {
        return this.f7700a.hashCode();
    }

    public final String toString() {
        return "ProgressStepperInfoStep(progressStepperToolTipStepInfo=" + this.f7700a + ")";
    }
}
