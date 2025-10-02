package au.com.woolworths.foundation.rewards.onboarding.ui;

import au.com.woolworths.android.onesite.data.ContentCta;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                float f = CoachMarkFrameKt.f8637a;
                BuildersKt.c((CoroutineScope) obj2, null, null, new CoachMarkFrameKt$CoachMarkFrameWx$3$3$1$1((Function0) obj, null), 3);
                break;
            default:
                ((Function1) obj2).invoke((ContentCta) obj);
                break;
        }
        return unit;
    }
}
