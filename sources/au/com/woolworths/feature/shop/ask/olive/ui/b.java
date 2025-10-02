package au.com.woolworths.feature.shop.ask.olive.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ AskOliveActivity e;

    public /* synthetic */ b(AskOliveActivity askOliveActivity, int i) {
        this.d = i;
        this.e = askOliveActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        AskOliveActivity askOliveActivity = this.e;
        switch (i) {
            case 0:
                int i2 = AskOliveActivity.I;
                askOliveActivity.finish();
                break;
            default:
                askOliveActivity.finish();
                break;
        }
        return unit;
    }
}
