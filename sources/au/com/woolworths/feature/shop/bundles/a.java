package au.com.woolworths.feature.shop.bundles;

import androidx.activity.result.ActivityResultCaller;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.feature.shop.bundles.AddBundlesToCartBottomSheetFragment;
import dagger.hilt.android.lifecycle.HiltViewModelExtensions;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ AddBundlesToCartBottomSheetFragment e;

    public /* synthetic */ a(AddBundlesToCartBottomSheetFragment addBundlesToCartBottomSheetFragment, int i) {
        this.d = i;
        this.e = addBundlesToCartBottomSheetFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                AddBundlesToCartBottomSheetFragment addBundlesToCartBottomSheetFragment = this.e;
                CreationExtras defaultViewModelCreationExtras = addBundlesToCartBottomSheetFragment.getDefaultViewModelCreationExtras();
                Intrinsics.g(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
                return HiltViewModelExtensions.a(defaultViewModelCreationExtras, new e(addBundlesToCartBottomSheetFragment, 1));
            default:
                AddBundlesToCartBottomSheetFragment addBundlesToCartBottomSheetFragment2 = this.e;
                ActivityResultCaller parentFragment = addBundlesToCartBottomSheetFragment2.getParentFragment();
                if (parentFragment == null) {
                    parentFragment = addBundlesToCartBottomSheetFragment2.getActivity();
                }
                if (parentFragment instanceof AddBundlesToCartBottomSheetFragment.BottomSheetHost) {
                    return (AddBundlesToCartBottomSheetFragment.BottomSheetHost) parentFragment;
                }
                return null;
        }
    }
}
