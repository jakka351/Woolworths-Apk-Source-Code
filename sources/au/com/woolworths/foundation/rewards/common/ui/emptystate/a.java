package au.com.woolworths.foundation.rewards.common.ui.emptystate;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ RewardsEmptyStateSpec e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    public /* synthetic */ a(RewardsEmptyStateSpec rewardsEmptyStateSpec, Modifier modifier, Function1 function1, int i, int i2, int i3) {
        this.d = i3;
        this.e = rewardsEmptyStateSpec;
        this.f = modifier;
        this.g = function1;
        this.h = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                RewardsEmptyStateKt.a(this.e, this.f, this.g, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
            default:
                ((Integer) obj2).getClass();
                RewardsEmptyStateKt.c(this.e, this.f, this.g, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
        }
        return Unit.f24250a;
    }
}
