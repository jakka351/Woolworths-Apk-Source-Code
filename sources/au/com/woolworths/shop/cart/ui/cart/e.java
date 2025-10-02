package au.com.woolworths.shop.cart.ui.cart;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import me.onebone.toolbar.CollapsingToolbarScaffoldState;

/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj = this.e;
        switch (i) {
            case 0:
                ((Function0) obj).invoke();
                return unit;
            case 1:
                ((Function0) obj).invoke();
                return unit;
            default:
                float f = CartScreenKt.f10493a;
                return Boolean.valueOf(((CollapsingToolbarScaffoldState) obj).f24914a.j() == BitmapDescriptorFactory.HUE_RED);
        }
    }
}
