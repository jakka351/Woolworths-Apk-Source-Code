package au.com.woolworths.android.onesite.app;

import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Predicate, Consumer {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ a(int i, Function1 function1) {
        this.d = i;
        this.e = function1;
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        int i = this.d;
        d dVar = (d) this.e;
        switch (i) {
            case 1:
                int i2 = BaseShopApplication.i;
                dVar.invoke(obj);
                break;
            case 2:
                int i3 = BaseShopApplication.i;
                dVar.invoke(obj);
                break;
            case 3:
                int i4 = BaseShopApplication.i;
                dVar.invoke(obj);
                break;
            case 4:
                int i5 = BaseShopApplication.i;
                dVar.invoke(obj);
                break;
            case 5:
                int i6 = BaseShopApplication.i;
                dVar.invoke(obj);
                break;
            case 6:
                int i7 = BaseShopApplication.i;
                dVar.invoke(obj);
                break;
            case 7:
                int i8 = BaseShopApplication.i;
                dVar.invoke(obj);
                break;
            default:
                dVar.invoke(obj);
                break;
        }
    }

    @Override // io.reactivex.functions.Predicate
    public boolean test(Object p0) {
        au.com.woolworths.android.onesite.analytics.a11y.a aVar = (au.com.woolworths.android.onesite.analytics.a11y.a) this.e;
        int i = BaseShopApplication.i;
        Intrinsics.h(p0, "p0");
        return ((Boolean) aVar.invoke(p0)).booleanValue();
    }
}
