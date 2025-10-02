package au.com.woolworths.feature.shop.healthylifefoodtracker.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerEventListener;
import au.com.woolworths.feature.shop.healthylifefoodtracker.data.FoodTrackerFooterCard;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ b(Object obj, FoodTrackerEventListener foodTrackerEventListener, Modifier modifier, int i) {
        this.d = 1;
        this.f = obj;
        this.g = foodTrackerEventListener;
        this.e = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                FoodTrackerActionFooterUiKt.b((FoodTrackerFooterCard) this.f, (Modifier) this.e, (Function1) this.g, (Composer) obj, RecomposeScopeImplKt.a(49));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(385);
                FoodTrackerContentKt.c(this.f, (FoodTrackerEventListener) this.g, (Modifier) this.e, (Composer) obj, iA);
                break;
            default:
                ((Integer) obj2).getClass();
                FoodTrackerPageKt.a((State) this.f, (FoodTrackerEventListener) this.e, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ b(Object obj, Object obj2, Function function, int i, int i2) {
        this.d = i2;
        this.f = obj;
        this.e = obj2;
        this.g = function;
    }
}
