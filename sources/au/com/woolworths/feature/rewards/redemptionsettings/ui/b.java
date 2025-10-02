package au.com.woolworths.feature.rewards.redemptionsettings.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.base.rewards.account.data.RewardsRedemptionSettingsItem;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.shop.lists.ui.substitutions.SimilarProductsScreenKt;
import com.woolworths.shop.product.ui.ProductMultiBuyLabelKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ b(RewardsRedemptionSettingsItem rewardsRedemptionSettingsItem, Function0 function0, Modifier modifier, boolean z, boolean z2, int i) {
        this.h = rewardsRedemptionSettingsItem;
        this.i = function0;
        this.j = modifier;
        this.e = z;
        this.f = z2;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                RedemptionSettingKt.c((RewardsRedemptionSettingsItem) this.h, (Function0) this.i, (Modifier) this.j, this.e, this.f, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                SimilarProductsScreenKt.l((ProductCard) this.h, this.e, this.f, (ProductClickListener) this.i, (ComposableLambdaImpl) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ProductMultiBuyLabelKt.b((String) this.h, (String) this.i, this.e, this.f, (Modifier) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ b(ProductCard productCard, boolean z, boolean z2, ProductClickListener productClickListener, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.h = productCard;
        this.e = z;
        this.f = z2;
        this.i = productClickListener;
        this.j = composableLambdaImpl;
        this.g = i;
    }

    public /* synthetic */ b(String str, String str2, boolean z, boolean z2, Modifier modifier, int i) {
        this.h = str;
        this.i = str2;
        this.e = z;
        this.f = z2;
        this.j = modifier;
        this.g = i;
    }
}
