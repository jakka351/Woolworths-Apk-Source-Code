package au.com.woolworths.shop.deliveryunlimited.signup.selectplan;

import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSignUpPlanTypeUiModel;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSignUpPlanUiModel;
import au.com.woolworths.shop.deliveryunlimited.signup.selectplan.SelectPlanContract;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-delivery-unlimited-sign-up_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SelectPlanContractKt {
    public static final String a(SelectPlanContract.ViewState viewState) {
        Object next;
        Intrinsics.h(viewState, "<this>");
        Iterable iterable = (Iterable) viewState.f10900a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((DeliveryUnlimitedSignUpPlanTypeUiModel) obj).c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CollectionsKt.h(((DeliveryUnlimitedSignUpPlanTypeUiModel) it.next()).b, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (next2 instanceof DeliveryUnlimitedSignUpPlanUiModel) {
                arrayList3.add(next2);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            if (((DeliveryUnlimitedSignUpPlanUiModel) next).f) {
                break;
            }
        }
        DeliveryUnlimitedSignUpPlanUiModel deliveryUnlimitedSignUpPlanUiModel = (DeliveryUnlimitedSignUpPlanUiModel) next;
        if (deliveryUnlimitedSignUpPlanUiModel != null) {
            return deliveryUnlimitedSignUpPlanUiModel.f10871a;
        }
        return null;
    }
}
