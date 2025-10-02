package au.com.woolworths.design.core.ui.component.stable.snackbar;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ SnackbarData e;

    public /* synthetic */ e(SnackbarData snackbarData, int i) {
        this.d = i;
        this.e = snackbarData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.e.dismiss();
                break;
            case 1:
                this.e.a();
                break;
            default:
                this.e.a();
                break;
        }
        return Unit.f24250a;
    }
}
