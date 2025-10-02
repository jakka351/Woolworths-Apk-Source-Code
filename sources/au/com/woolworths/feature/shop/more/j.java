package au.com.woolworths.feature.shop.more;

import io.reactivex.functions.Consumer;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Consumer {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ j(int i, Function1 function1) {
        this.d = i;
        this.e = function1;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        switch (this.d) {
            case 0:
                this.e.invoke(obj);
                break;
            default:
                ((c) this.e).invoke(obj);
                break;
        }
    }
}
