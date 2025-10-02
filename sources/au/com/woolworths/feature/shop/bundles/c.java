package au.com.woolworths.feature.shop.bundles;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import au.com.woolworths.android.onesite.extensions.DialogFragmentExtKt;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.feature.shop.bundles.AddBundlesToCartBottomSheetFragment;
import au.com.woolworths.feature.shop.bundles.BundlesViewModel;
import au.com.woolworths.feature.shop.bundles.data.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ BundlesActivity e;

    public /* synthetic */ c(BundlesActivity bundlesActivity, int i) {
        this.d = i;
        this.e = bundlesActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws NumberFormatException {
        int i = this.d;
        Unit unit = Unit.f24250a;
        BundlesActivity bundlesActivity = this.e;
        switch (i) {
            case 0:
                BundlesViewModel.Factory factory = (BundlesViewModel.Factory) obj;
                int i2 = BundlesActivity.A;
                Intrinsics.h(factory, "factory");
                Activities.BundlesActivity.Extras extras = (Activities.BundlesActivity.Extras) bundlesActivity.x.getD();
                return factory.a(extras != null ? extras.e : null);
            case 1:
                Bundle bundle = (Bundle) obj;
                Intrinsics.h(bundle, "bundle");
                FragmentManager supportFragmentManager = bundlesActivity.getSupportFragmentManager();
                AddBundlesToCartBottomSheetFragment.Extras extras2 = new AddBundlesToCartBottomSheetFragment.Extras(bundle);
                if (supportFragmentManager != null) {
                    FragmentTransaction fragmentTransactionE = supportFragmentManager.e();
                    AddBundlesToCartBottomSheetFragment addBundlesToCartBottomSheetFragment = new AddBundlesToCartBottomSheetFragment();
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    bundle2.putParcelable("EXTRAS_BUNDLE_DATA", extras2);
                    addBundlesToCartBottomSheetFragment.setArguments(bundle2);
                    DialogFragmentExtKt.a(addBundlesToCartBottomSheetFragment, supportFragmentManager, "AddBundlesToCartBottomSheetFragment");
                    fragmentTransactionE.f();
                }
                return unit;
            default:
                String it = (String) obj;
                Intrinsics.h(it, "it");
                ShopAppNavigator shopAppNavigator = bundlesActivity.z;
                if (shopAppNavigator != null) {
                    shopAppNavigator.d(it);
                    return unit;
                }
                Intrinsics.p("shopAppNavigator");
                throw null;
        }
    }
}
