package au.com.woolworths.feature.rewards.offers.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.feature.shared.force.upgrade.ui.ShowRewardsCardActionKt;
import au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Modifier g;
    public final /* synthetic */ int h;

    public /* synthetic */ d(String str, Function0 function0, Modifier modifier, int i, int i2) {
        this.d = i2;
        this.e = str;
        this.f = function0;
        this.g = modifier;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                OffersSectionTitleKt.a(RecomposeScopeImplKt.a(this.h | 1), composer, this.g, this.e, this.f);
                break;
            case 1:
                ShowRewardsCardActionKt.a(RecomposeScopeImplKt.a(this.h | 1), composer, this.g, this.e, this.f);
                break;
            default:
                ProductFinderScreenKt.d(RecomposeScopeImplKt.a(this.h | 1), composer, this.g, this.e, this.f);
                break;
        }
        return Unit.f24250a;
    }
}
