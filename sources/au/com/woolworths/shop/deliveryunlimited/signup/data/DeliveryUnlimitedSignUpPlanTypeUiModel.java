package au.com.woolworths.shop.deliveryunlimited.signup.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSignUpPlanTypeUiModel;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeliveryUnlimitedSignUpPlanTypeUiModel {

    /* renamed from: a, reason: collision with root package name */
    public final String f10870a;
    public final List b;
    public final boolean c;

    public DeliveryUnlimitedSignUpPlanTypeUiModel(String title, boolean z, List list) {
        Intrinsics.h(title, "title");
        this.f10870a = title;
        this.b = list;
        this.c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public static DeliveryUnlimitedSignUpPlanTypeUiModel a(DeliveryUnlimitedSignUpPlanTypeUiModel deliveryUnlimitedSignUpPlanTypeUiModel, ArrayList arrayList, boolean z, int i) {
        String title = deliveryUnlimitedSignUpPlanTypeUiModel.f10870a;
        ArrayList arrayList2 = arrayList;
        if ((i & 2) != 0) {
            arrayList2 = deliveryUnlimitedSignUpPlanTypeUiModel.b;
        }
        if ((i & 4) != 0) {
            z = deliveryUnlimitedSignUpPlanTypeUiModel.c;
        }
        deliveryUnlimitedSignUpPlanTypeUiModel.getClass();
        Intrinsics.h(title, "title");
        return new DeliveryUnlimitedSignUpPlanTypeUiModel(title, z, arrayList2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryUnlimitedSignUpPlanTypeUiModel)) {
            return false;
        }
        DeliveryUnlimitedSignUpPlanTypeUiModel deliveryUnlimitedSignUpPlanTypeUiModel = (DeliveryUnlimitedSignUpPlanTypeUiModel) obj;
        return Intrinsics.c(this.f10870a, deliveryUnlimitedSignUpPlanTypeUiModel.f10870a) && Intrinsics.c(this.b, deliveryUnlimitedSignUpPlanTypeUiModel.b) && this.c == deliveryUnlimitedSignUpPlanTypeUiModel.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + b.d(this.f10870a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return a.k(")", au.com.woolworths.android.onesite.a.s("DeliveryUnlimitedSignUpPlanTypeUiModel(title=", this.f10870a, ", feed=", ", isSelected=", this.b), this.c);
    }
}
