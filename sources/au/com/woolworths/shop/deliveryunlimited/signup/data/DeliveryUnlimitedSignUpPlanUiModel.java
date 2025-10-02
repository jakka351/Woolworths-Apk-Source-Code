package au.com.woolworths.shop.deliveryunlimited.signup.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSignUpPlanUiModel;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeliveryUnlimitedSignUpPlanUiModel {

    /* renamed from: a, reason: collision with root package name */
    public final String f10871a;
    public final String b;
    public final String c;
    public final int d;
    public final BrandLabel e;
    public final boolean f;

    public DeliveryUnlimitedSignUpPlanUiModel(String identifier, String title, String subtitle, int i, BrandLabel brandLabel, boolean z) {
        Intrinsics.h(identifier, "identifier");
        Intrinsics.h(title, "title");
        Intrinsics.h(subtitle, "subtitle");
        this.f10871a = identifier;
        this.b = title;
        this.c = subtitle;
        this.d = i;
        this.e = brandLabel;
        this.f = z;
    }

    public static DeliveryUnlimitedSignUpPlanUiModel a(DeliveryUnlimitedSignUpPlanUiModel deliveryUnlimitedSignUpPlanUiModel, boolean z) {
        String identifier = deliveryUnlimitedSignUpPlanUiModel.f10871a;
        String title = deliveryUnlimitedSignUpPlanUiModel.b;
        String subtitle = deliveryUnlimitedSignUpPlanUiModel.c;
        int i = deliveryUnlimitedSignUpPlanUiModel.d;
        BrandLabel brandLabel = deliveryUnlimitedSignUpPlanUiModel.e;
        Intrinsics.h(identifier, "identifier");
        Intrinsics.h(title, "title");
        Intrinsics.h(subtitle, "subtitle");
        return new DeliveryUnlimitedSignUpPlanUiModel(identifier, title, subtitle, i, brandLabel, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryUnlimitedSignUpPlanUiModel)) {
            return false;
        }
        DeliveryUnlimitedSignUpPlanUiModel deliveryUnlimitedSignUpPlanUiModel = (DeliveryUnlimitedSignUpPlanUiModel) obj;
        return Intrinsics.c(this.f10871a, deliveryUnlimitedSignUpPlanUiModel.f10871a) && Intrinsics.c(this.b, deliveryUnlimitedSignUpPlanUiModel.b) && Intrinsics.c(this.c, deliveryUnlimitedSignUpPlanUiModel.c) && this.d == deliveryUnlimitedSignUpPlanUiModel.d && Intrinsics.c(this.e, deliveryUnlimitedSignUpPlanUiModel.e) && this.f == deliveryUnlimitedSignUpPlanUiModel.f;
    }

    public final int hashCode() {
        int iA = b.a(this.d, b.c(b.c(this.f10871a.hashCode() * 31, 31, this.b), 31, this.c), 31);
        BrandLabel brandLabel = this.e;
        return Boolean.hashCode(this.f) + ((iA + (brandLabel == null ? 0 : brandLabel.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbV = a.v("DeliveryUnlimitedSignUpPlanUiModel(identifier=", this.f10871a, ", title=", this.b, ", subtitle=");
        a.x(this.d, this.c, ", price=", ", badge=", sbV);
        sbV.append(this.e);
        sbV.append(", isSelected=");
        sbV.append(this.f);
        sbV.append(")");
        return sbV.toString();
    }
}
