package au.com.woolworths.feature.rewards.account.authentication.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.feature.shop.account.ui.details.components.AccountDetailsScreenKt;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.PromotionListingScreenKt;
import au.com.woolworths.feature.shop.voc.score.VocSurveyCardKt;
import au.com.woolworths.shop.rewards.ShopRewardsActivityUiKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function0 e;

    public /* synthetic */ b(int i, int i2, Function0 function0) {
        this.d = i2;
        this.e = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(1);
                RewardsLoginScreenKt.b(this.e, (Composer) obj, iA);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(1);
                AccountDetailsScreenKt.b(this.e, (Composer) obj, iA2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iA3 = RecomposeScopeImplKt.a(1);
                PromotionListingScreenKt.c(this.e, (Composer) obj, iA3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iA4 = RecomposeScopeImplKt.a(7);
                VocSurveyCardKt.e(this.e, (Composer) obj, iA4);
                break;
            case 4:
                this.e.invoke();
                break;
            case 5:
                Intrinsics.h((String) obj, "<unused var>");
                Intrinsics.h((String) obj2, "<unused var>");
                this.e.invoke();
                break;
            case 6:
                Intrinsics.h((String) obj, "<unused var>");
                Intrinsics.h((String) obj2, "<unused var>");
                this.e.invoke();
                break;
            case 7:
                ((Integer) obj2).getClass();
                int iA5 = RecomposeScopeImplKt.a(1);
                ShopRewardsActivityUiKt.a(this.e, (Composer) obj, iA5);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA6 = RecomposeScopeImplKt.a(1);
                ShopRewardsActivityUiKt.c(this.e, (Composer) obj, iA6);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ b(int i, Function0 function0) {
        this.d = i;
        this.e = function0;
    }
}
