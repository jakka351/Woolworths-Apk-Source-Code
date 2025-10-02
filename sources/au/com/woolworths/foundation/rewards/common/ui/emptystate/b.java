package au.com.woolworths.foundation.rewards.common.ui.emptystate;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ RewardsEmptyStateSpec e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ Function1 g;

    public /* synthetic */ b(RewardsEmptyStateSpec rewardsEmptyStateSpec, Modifier modifier, Function1 function1, int i, int i2) {
        this.d = i2;
        this.e = rewardsEmptyStateSpec;
        this.f = modifier;
        this.g = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                RewardsEmptyStateKt.b(this.e, this.f, this.g, composer, RecomposeScopeImplKt.a(1));
                break;
            default:
                RewardsEmptyStateKt.d(this.e, this.f, this.g, composer, RecomposeScopeImplKt.a(1));
                break;
        }
        return Unit.f24250a;
    }
}
