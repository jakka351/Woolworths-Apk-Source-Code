package au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.foundation.rewards.offers.ui.RewardsOfferTileKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ float e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ Object g;

    public /* synthetic */ b(float f, int i, ComposableLambdaImpl composableLambdaImpl, Modifier modifier) {
        this.e = f;
        this.f = modifier;
        this.g = composableLambdaImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(385);
                CollapsingToolbarHeaderKt.a((DownloadableAsset) this.g, this.e, this.f, (Composer) obj, iA);
                break;
            default:
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) this.g;
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(385);
                RewardsOfferTileKt.f(this.e, iA2, (Composer) obj, composableLambdaImpl, this.f);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ b(DownloadableAsset downloadableAsset, float f, Modifier modifier, int i) {
        this.g = downloadableAsset;
        this.e = f;
        this.f = modifier;
    }
}
