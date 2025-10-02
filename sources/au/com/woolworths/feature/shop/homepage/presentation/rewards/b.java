package au.com.woolworths.feature.shop.homepage.presentation.rewards;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.feature.shop.inbox.ui.MessageRowKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Modifier f;

    public /* synthetic */ b(boolean z, Modifier modifier, int i, int i2) {
        this.d = i2;
        this.e = z;
        this.f = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                RewardsBalanceCardUiKt.d(this.e, this.f, composer, RecomposeScopeImplKt.a(1));
                break;
            default:
                MessageRowKt.b(this.e, this.f, composer, RecomposeScopeImplKt.a(49));
                break;
        }
        return Unit.f24250a;
    }
}
