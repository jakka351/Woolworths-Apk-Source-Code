package au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui;

import androidx.compose.runtime.MutableIntState;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function0 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e(int i, MutableIntState mutableIntState) {
        this.e = i;
        this.f = mutableIntState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                ((MutableIntState) this.f).i(this.e);
                return Unit.f24250a;
            default:
                ArrayList arrayList = (ArrayList) this.f;
                return Integer.valueOf(Math.min(arrayList.size(), (arrayList.size() + 1) / this.e));
        }
    }

    public /* synthetic */ e(int i, ArrayList arrayList) {
        this.f = arrayList;
        this.e = i;
    }
}
