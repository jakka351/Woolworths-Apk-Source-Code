package au.com.woolworths.feature.shop.myorders.details.epoxy;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.myorders.ItemProgressStepperInfoDescriptionBindingModel_;
import au.com.woolworths.feature.shop.myorders.details.infomodal.ProgressStepperInfoController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/epoxy/ProgressStepperInfoDescription;", "Lau/com/woolworths/feature/shop/myorders/details/epoxy/ProgressStepperInfoItem;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class ProgressStepperInfoDescription implements ProgressStepperInfoItem {

    /* renamed from: a, reason: collision with root package name */
    public final String f7699a;

    public ProgressStepperInfoDescription(String description) {
        Intrinsics.h(description, "description");
        this.f7699a = description;
    }

    @Override // au.com.woolworths.feature.shop.myorders.details.epoxy.ProgressStepperInfoItem
    public final void a(ProgressStepperInfoController progressStepperInfoController) {
        ItemProgressStepperInfoDescriptionBindingModel_ itemProgressStepperInfoDescriptionBindingModel_ = new ItemProgressStepperInfoDescriptionBindingModel_();
        itemProgressStepperInfoDescriptionBindingModel_.M();
        itemProgressStepperInfoDescriptionBindingModel_.t();
        itemProgressStepperInfoDescriptionBindingModel_.n = this.f7699a;
        progressStepperInfoController.add(itemProgressStepperInfoDescriptionBindingModel_);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProgressStepperInfoDescription) && Intrinsics.c(this.f7699a, ((ProgressStepperInfoDescription) obj).f7699a);
    }

    public final int hashCode() {
        return this.f7699a.hashCode();
    }

    public final String toString() {
        return YU.a.h("ProgressStepperInfoDescription(description=", this.f7699a, ")");
    }
}
