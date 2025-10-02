package au.com.woolworths.feature.shop.myorders.details;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ OrderDetailsController e;

    public /* synthetic */ d(OrderDetailsController orderDetailsController, int i) {
        this.d = i;
        this.e = orderDetailsController;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String url = (String) obj;
        String linkText = (String) obj2;
        switch (this.d) {
            case 0:
                Intrinsics.h(url, "url");
                Intrinsics.h(linkText, "linkText");
                this.e.viewModel.U3(url, linkText);
                break;
            default:
                Intrinsics.h(url, "url");
                Intrinsics.h(linkText, "linkText");
                this.e.viewModel.U3(url, linkText);
                break;
        }
        return Unit.f24250a;
    }
}
