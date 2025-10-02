package au.com.woolworths.feature.shop.inbox;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ MutableState e;

    public /* synthetic */ b(MutableState mutableState, int i) {
        this.d = i;
        this.e = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.e.setValue(null);
                break;
            default:
                this.e.setValue(null);
                break;
        }
        return Unit.f24250a;
    }
}
