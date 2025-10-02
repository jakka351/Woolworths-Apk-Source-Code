package au.com.woolworths.feature.shop.instore.navigation.map.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ InstoreMapViewModel e;
    public final /* synthetic */ String f;

    public /* synthetic */ f(InstoreMapViewModel instoreMapViewModel, String str, int i) {
        this.d = i;
        this.e = instoreMapViewModel;
        this.f = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                InstoreMapViewModel.s6(this.e, this.f);
                break;
            case 1:
                InstoreMapViewModel.s6(this.e, this.f);
                break;
            default:
                InstoreMapViewModel.s6(this.e, this.f);
                break;
        }
        return Unit.f24250a;
    }
}
