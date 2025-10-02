package au.com.woolworths.feature.shop.bundles.generated.callback;

import android.view.View;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.feature.shop.bundles.bottomsheet.AddBundlesBottomSheetContract;
import au.com.woolworths.feature.shop.bundles.bottomsheet.AddBundlesToCartViewModel;
import au.com.woolworths.feature.shop.bundles.bottomsheet.BundlesBottomSheetActionType;
import au.com.woolworths.feature.shop.bundles.data.Bundle;
import au.com.woolworths.feature.shop.bundles.data.BundlesExtKt;
import au.com.woolworths.feature.shop.bundles.databinding.FragmentAddBundlesToCartBindingImpl;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes3.dex */
public final class StatefulButtonClickHandler implements au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonClickHandler {
    public final FragmentAddBundlesToCartBindingImpl d;
    public final int e;

    public interface Listener {
    }

    public StatefulButtonClickHandler(FragmentAddBundlesToCartBindingImpl fragmentAddBundlesToCartBindingImpl, int i) {
        this.d = fragmentAddBundlesToCartBindingImpl;
        this.e = i;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonClickHandler
    public final void T2(View view, StatefulButtonState statefulButtonState) {
        AddBundlesToCartViewModel addBundlesToCartViewModel;
        FragmentAddBundlesToCartBindingImpl fragmentAddBundlesToCartBindingImpl = this.d;
        int i = this.e;
        if (i == 1) {
            AddBundlesToCartViewModel addBundlesToCartViewModel2 = fragmentAddBundlesToCartBindingImpl.E;
            if (addBundlesToCartViewModel2 != null) {
                BundlesBottomSheetActionType bundlesBottomSheetActionType = BundlesBottomSheetActionType.d;
                addBundlesToCartViewModel2.p6(new AddBundlesBottomSheetContract.Actions.ShowLoading(bundlesBottomSheetActionType));
                Bundle bundle = addBundlesToCartViewModel2.e;
                addBundlesToCartViewModel2.q6(bundle, BundlesExtKt.b(bundle, 1), bundlesBottomSheetActionType);
                return;
            }
            return;
        }
        if (i != 2) {
            if (i == 3 && (addBundlesToCartViewModel = fragmentAddBundlesToCartBindingImpl.E) != null) {
                BundlesBottomSheetActionType bundlesBottomSheetActionType2 = BundlesBottomSheetActionType.f;
                addBundlesToCartViewModel.p6(new AddBundlesBottomSheetContract.Actions.ShowLoading(bundlesBottomSheetActionType2));
                Bundle bundle2 = addBundlesToCartViewModel.e;
                MapBuilder mapBuilderB = BundlesExtKt.b(bundle2, 0);
                addBundlesToCartViewModel.r6(0, mapBuilderB);
                addBundlesToCartViewModel.q6(bundle2, mapBuilderB, bundlesBottomSheetActionType2);
                return;
            }
            return;
        }
        AddBundlesToCartViewModel addBundlesToCartViewModel3 = fragmentAddBundlesToCartBindingImpl.E;
        if (addBundlesToCartViewModel3 != null) {
            BundlesBottomSheetActionType bundlesBottomSheetActionType3 = BundlesBottomSheetActionType.e;
            addBundlesToCartViewModel3.p6(new AddBundlesBottomSheetContract.Actions.ShowLoading(bundlesBottomSheetActionType3));
            int i2 = ((AddBundlesBottomSheetContract.ViewState) addBundlesToCartViewModel3.j.getValue()).f6750a + 1;
            Bundle bundle3 = addBundlesToCartViewModel3.e;
            MapBuilder mapBuilderB2 = BundlesExtKt.b(bundle3, i2);
            addBundlesToCartViewModel3.r6(i2, mapBuilderB2);
            addBundlesToCartViewModel3.q6(bundle3, mapBuilderB2, bundlesBottomSheetActionType3);
        }
    }
}
