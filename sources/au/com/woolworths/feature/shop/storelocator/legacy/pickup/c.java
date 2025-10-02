package au.com.woolworths.feature.shop.storelocator.legacy.pickup;

import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Consumer, Function {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ c(int i, Function1 function1) {
        this.d = i;
        this.e = function1;
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        int i = this.d;
        Function1 function1 = this.e;
        switch (i) {
            case 0:
                int i2 = PickUpLocatorActivity.K;
                ((b) function1).invoke(obj);
                break;
            case 1:
                ((d) function1).invoke(obj);
                break;
            case 2:
                ((d) function1).invoke(obj);
                break;
            default:
                ((d) function1).invoke(obj);
                break;
        }
    }

    @Override // io.reactivex.functions.Function
    /* renamed from: apply */
    public Object mo0apply(Object p0) {
        d dVar = (d) this.e;
        Intrinsics.h(p0, "p0");
        return (SingleSource) dVar.invoke(p0);
    }
}
