package com.woolworths.scanlibrary.ui.scanner;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.woolworths.scanlibrary.analytics.AnalyticsProvider;
import com.woolworths.scanlibrary.analytics.ScannerScreenTracking;
import com.woolworths.scanlibrary.base.BasePresenter;
import com.woolworths.scanlibrary.configuration.UserConfigurations;
import com.woolworths.scanlibrary.data.cart.Cart;
import com.woolworths.scanlibrary.domain.login.UserManager;
import com.woolworths.scanlibrary.ui.scanner.ScannerContract;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/scanlibrary/ui/scanner/ScannerPresenter;", "Lcom/woolworths/scanlibrary/base/BasePresenter;", "Lcom/woolworths/scanlibrary/ui/scanner/ScannerContract$View;", "Lcom/woolworths/scanlibrary/ui/scanner/ScannerContract$Presenter;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ScannerPresenter extends BasePresenter<ScannerContract.View> implements ScannerContract.Presenter {
    public final Cart c;
    public final FeatureToggleManager d;
    public final UserConfigurations e;
    public final AnalyticsProvider f;
    public final boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScannerPresenter(ScannerContract.View view, Cart shoppingCart, FeatureToggleManager featureToggleManager, UserConfigurations userConfigurations, UserManager userManager, AnalyticsProvider analyticsAggregator) {
        super(view);
        Intrinsics.h(shoppingCart, "shoppingCart");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(userConfigurations, "userConfigurations");
        Intrinsics.h(userManager, "userManager");
        Intrinsics.h(analyticsAggregator, "analyticsAggregator");
        this.c = shoppingCart;
        this.d = featureToggleManager;
        this.e = userConfigurations;
        this.f = analyticsAggregator;
        view.k1(this);
        analyticsAggregator.a(new ScannerScreenTracking("Scanner Screen"));
        this.g = true;
    }

    @Override // com.woolworths.scanlibrary.ui.scanner.ScannerContract.Presenter
    public final long E0() {
        UserConfigurations userConfigurations = this.e;
        return Long.parseLong((String) userConfigurations.c.getValue(userConfigurations, UserConfigurations.k[2]));
    }

    @Override // com.woolworths.scanlibrary.ui.scanner.ScannerContract.Presenter
    public final boolean F0() {
        UserConfigurations userConfigurations = this.e;
        return ((Boolean) userConfigurations.b.getValue(userConfigurations, UserConfigurations.k[1])).booleanValue();
    }

    @Override // com.woolworths.scanlibrary.ui.scanner.ScannerContract.Presenter
    public final boolean G0() {
        UserConfigurations userConfigurations = this.e;
        return ((Boolean) userConfigurations.f21148a.getValue(userConfigurations, UserConfigurations.k[0])).booleanValue();
    }

    @Override // com.woolworths.scanlibrary.ui.scanner.ScannerContract.Presenter
    public final List c() {
        return this.c.c();
    }

    @Override // com.woolworths.scanlibrary.ui.scanner.ScannerContract.Presenter
    public final boolean f1() {
        return (this.g || this.c.c().isEmpty()) ? false : true;
    }

    @Override // com.woolworths.scanlibrary.ui.scanner.ScannerContract.Presenter
    public final int l() {
        return this.c.z(false);
    }

    @Override // com.woolworths.scanlibrary.ui.scanner.ScannerContract.Presenter
    public final BigDecimal p() {
        return this.c.getE();
    }
}
