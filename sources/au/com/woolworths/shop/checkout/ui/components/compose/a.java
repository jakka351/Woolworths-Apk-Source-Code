package au.com.woolworths.shop.checkout.ui.components.compose;

import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                ((Function0) this.e).invoke();
                return Unit.f24250a;
            case 1:
                ((Function0) this.e).invoke();
                return Unit.f24250a;
            case 2:
                ((Function0) this.e).invoke();
                return Unit.f24250a;
            case 3:
                ((Function0) this.e).invoke();
                return Unit.f24250a;
            case 4:
                ((Function0) this.e).invoke();
                return Unit.f24250a;
            default:
                return SnapshotStateKt.f((String) this.e);
        }
    }
}
