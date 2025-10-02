package au.com.woolworths.foundation.rewards.offers.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ RewardsOfferData e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Modifier g;

    public /* synthetic */ a(RewardsOfferData rewardsOfferData, boolean z, Modifier modifier, int i, int i2) {
        this.d = i2;
        this.e = rewardsOfferData;
        this.f = z;
        this.g = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                RewardsOfferTileKt.d(this.e, this.f, this.g, composer, RecomposeScopeImplKt.a(1));
                break;
            default:
                RewardsOfferTileKt.j(this.e, this.f, this.g, composer, RecomposeScopeImplKt.a(1));
                break;
        }
        return Unit.f24250a;
    }
}
