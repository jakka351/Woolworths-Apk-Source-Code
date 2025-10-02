package au.com.woolworths.feature.rewards.offers.detail.composable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import au.com.woolworths.foundation.rewards.common.ui.modal.RewardsModalScreenKt;
import au.com.woolworths.rewards.base.info.FeatureInfoFooter;
import au.com.woolworths.rewards.modal.RewardsAppModalData;
import au.com.woolworths.shop.rewards.promo.composable.PromoRewardsAppScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function2 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ float e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ c(FeatureInfoFooter featureInfoFooter, float f, Modifier modifier, Function1 function1, Function1 function12, int i) {
        this.g = featureInfoFooter;
        this.e = f;
        this.f = modifier;
        this.h = function1;
        this.i = function12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(24577);
                RewardsOfferDetailsScreenLegacyKt.b((String) this.g, (String) this.h, (String) this.i, this.e, this.f, (Composer) obj, iA);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(441);
                RewardsModalScreenKt.a((FeatureInfoFooter) this.g, this.e, this.f, (Function1) this.h, (Function1) this.i, (Composer) obj, iA2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA3 = RecomposeScopeImplKt.a(9);
                PromoRewardsAppScreenKt.a((RewardsAppModalData) this.g, this.e, (NestedScrollConnection) this.h, (Function1) this.i, this.f, (Composer) obj, iA3);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ c(RewardsAppModalData rewardsAppModalData, float f, NestedScrollConnection nestedScrollConnection, Function1 function1, Modifier modifier, int i) {
        this.g = rewardsAppModalData;
        this.e = f;
        this.h = nestedScrollConnection;
        this.i = function1;
        this.f = modifier;
    }

    public /* synthetic */ c(String str, String str2, String str3, float f, Modifier modifier, int i) {
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.e = f;
        this.f = modifier;
    }
}
