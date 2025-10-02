package au.com.woolworths.feature.shop.bundles.ui;

import au.com.woolworths.feature.shop.bundles.BundlesUiEvent;
import au.com.woolworths.feature.shop.bundles.data.Bundle;
import au.com.woolworths.feature.shop.bundles.data.BundleProductCard;
import au.com.woolworths.feature.shop.bundles.data.BundleSortOption;
import au.com.woolworths.feature.shop.bundles.data.BundlesData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d(int i, Object obj, Function1 function1) {
        this.d = i;
        this.e = function1;
        this.f = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.e.invoke(((BundleProductCard) this.f).f6758a);
                break;
            case 1:
                this.e.invoke(new BundlesUiEvent.AddBundleToCartClick((Bundle) this.f));
                break;
            case 2:
                this.e.invoke(new BundlesUiEvent.NoBundlesCtaClick((BundlesData.BundlesLandingErrorPage) ((BundlesData) this.f)));
                break;
            default:
                this.e.invoke(new BundlesUiEvent.SortOptionClick((BundleSortOption) this.f));
                break;
        }
        return Unit.f24250a;
    }
}
