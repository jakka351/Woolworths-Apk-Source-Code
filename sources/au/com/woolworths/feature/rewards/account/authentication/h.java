package au.com.woolworths.feature.rewards.account.authentication;

import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Function, Consumer {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ h(int i, Function1 function1) {
        this.d = i;
        this.e = function1;
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        switch (this.d) {
            case 1:
                ((i) this.e).invoke(obj);
                break;
            default:
                ((i) this.e).invoke(obj);
                break;
        }
    }

    @Override // io.reactivex.functions.Function
    /* renamed from: apply */
    public Object mo0apply(Object p0) {
        switch (this.d) {
            case 0:
                au.com.woolworths.feature.product.list.legacy.compose.filter.a aVar = (au.com.woolworths.feature.product.list.legacy.compose.filter.a) this.e;
                Intrinsics.h(p0, "p0");
                return (String) aVar.invoke(p0);
            default:
                g gVar = (g) this.e;
                Intrinsics.h(p0, "p0");
                return (SingleSource) gVar.invoke(p0);
        }
    }
}
