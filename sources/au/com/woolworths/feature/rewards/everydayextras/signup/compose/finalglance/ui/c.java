package au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.ui;

import au.com.woolworths.feature.rewards.everydayextras.signup.data.finalglance.EverydayExtrasFinalGlanceContentItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ EverydayExtrasFinalGlanceContentItem.Button f;

    public /* synthetic */ c(Function1 function1, EverydayExtrasFinalGlanceContentItem.Button button, int i) {
        this.d = i;
        this.e = function1;
        this.f = button;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.e.invoke(this.f);
                break;
            default:
                this.e.invoke(this.f);
                break;
        }
        return Unit.f24250a;
    }
}
