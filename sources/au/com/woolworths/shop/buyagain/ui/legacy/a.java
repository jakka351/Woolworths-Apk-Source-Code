package au.com.woolworths.shop.buyagain.ui.legacy;

import androidx.fragment.app.FragmentActivity;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.foundation.shop.instore.navigation.map.InstoreNavigationInteractor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                FragmentActivity fragmentActivityRequireActivity = ((BuyAgainFragmentLegacy) this.e).requireActivity();
                Intrinsics.g(fragmentActivityRequireActivity, "requireActivity(...)");
                BuyAgainLayoutManager buyAgainLayoutManager = new BuyAgainLayoutManager(fragmentActivityRequireActivity, 1);
                buyAgainLayoutManager.Q = true;
                return buyAgainLayoutManager;
            case 1:
                BuyAgainFragmentLegacy buyAgainFragmentLegacy = (BuyAgainFragmentLegacy) this.e;
                BuyAgainViewModelLegacy buyAgainViewModelLegacyQ1 = buyAgainFragmentLegacy.Q1();
                BuyAgainLayoutManager buyAgainLayoutManager2 = (BuyAgainLayoutManager) buyAgainFragmentLegacy.o.getD();
                FeatureToggleManager featureToggleManager = buyAgainFragmentLegacy.j;
                if (featureToggleManager == null) {
                    Intrinsics.p("featureToggleManager");
                    throw null;
                }
                InstoreNavigationInteractor instoreNavigationInteractor = buyAgainFragmentLegacy.k;
                if (instoreNavigationInteractor != null) {
                    return new BuyAgainProductListController(buyAgainViewModelLegacyQ1, buyAgainLayoutManager2, featureToggleManager, instoreNavigationInteractor.d());
                }
                Intrinsics.p("instoreNavigationInteractor");
                throw null;
            default:
                return ((BuyAgainViewModelLegacy) this.e).e.b();
        }
    }
}
