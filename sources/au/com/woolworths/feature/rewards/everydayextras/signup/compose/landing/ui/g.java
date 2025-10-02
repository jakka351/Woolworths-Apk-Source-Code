package au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KType;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ArrayList e;

    public /* synthetic */ g(int i, ArrayList arrayList) {
        this.d = i;
        this.e = arrayList;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return Integer.valueOf(this.e.size());
            default:
                return ((KType) this.e.get(0)).e();
        }
    }
}
