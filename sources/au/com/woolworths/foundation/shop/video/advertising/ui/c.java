package au.com.woolworths.foundation.shop.video.advertising.ui;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import au.com.woolworths.design.core.ui.component.experimental.coachmark.CoachMarkState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ c(Object obj, boolean z, int i) {
        this.d = i;
        this.e = obj;
        this.f = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                ((Function1) this.e).invoke(Boolean.valueOf(!this.f));
                break;
            case 1:
                ((Function1) this.e).invoke(Boolean.valueOf(!this.f));
                break;
            default:
                ((SnapshotMutableStateImpl) ((CoachMarkState) this.e).f4721a).setValue(Boolean.valueOf(this.f));
                break;
        }
        return Unit.f24250a;
    }
}
