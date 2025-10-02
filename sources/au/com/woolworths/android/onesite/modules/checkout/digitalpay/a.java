package au.com.woolworths.android.onesite.modules.checkout.digitalpay;

import io.reactivex.internal.operators.maybe.MaybeEmpty;
import io.reactivex.internal.operators.maybe.MaybeJust;
import java.io.Serializable;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Callable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Serializable e;

    public /* synthetic */ a(int i, Serializable serializable) {
        this.d = i;
        this.e = serializable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.d) {
            case 0:
                String strD = ((BasePayEmptyResultCallback) this.e).e.d(null);
                return strD == null ? MaybeEmpty.d : new MaybeJust(strD);
            default:
                String strD2 = ((BasePayResultCallback) this.e).e.d(null);
                return strD2 == null ? MaybeEmpty.d : new MaybeJust(strD2);
        }
    }
}
