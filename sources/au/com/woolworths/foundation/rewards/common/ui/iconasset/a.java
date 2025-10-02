package au.com.woolworths.foundation.rewards.common.ui.iconasset;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.rewards.base.data.IconAsset;
import au.com.woolworths.sdui.legacy.banner.BannerAction;
import au.com.woolworths.sdui.legacy.banner.InsetBannerUiKt;
import au.com.woolworths.shop.productcard.data.ProductPriceInfo;
import au.com.woolworths.shop.productcard.ui.components.ProductPriceKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ a(ProductPriceInfo productPriceInfo, Modifier modifier, long j, int i, int i2) {
        this.d = 2;
        this.i = productPriceInfo;
        this.f = modifier;
        this.e = j;
        this.g = i;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                IconAssetUiKt.b((IconAsset) this.i, this.e, this.f, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
            case 1:
                ((Integer) obj2).getClass();
                InsetBannerUiKt.d((BannerAction) this.i, this.e, this.f, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
            default:
                ((Integer) obj2).getClass();
                ProductPriceKt.a((ProductPriceInfo) this.i, this.f, this.e, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(Object obj, long j, Modifier modifier, int i, int i2, int i3) {
        this.d = i3;
        this.i = obj;
        this.e = j;
        this.f = modifier;
        this.g = i;
        this.h = i2;
    }
}
