package au.com.woolworths.shop.checkout.ui.compose;

import androidx.compose.runtime.MutableState;
import au.com.woolworths.shop.checkout.ui.idverification.IdVerificationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                break;
            case 1:
                ((MutableState) this.e).setValue(Boolean.valueOf(!((Boolean) r0.getD()).booleanValue()));
                break;
            case 2:
                ((Function0) this.e).invoke();
                break;
            default:
                ((IdVerificationViewModel) this.e).q6();
                break;
        }
        return Unit.f24250a;
    }
}
