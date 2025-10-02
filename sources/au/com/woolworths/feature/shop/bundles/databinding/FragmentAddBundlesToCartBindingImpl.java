package au.com.woolworths.feature.shop.bundles.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBindingKtx;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButton;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonBindingKt;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.feature.shop.bundles.bottomsheet.AddBundlesBottomSheetContract;
import au.com.woolworths.feature.shop.bundles.bottomsheet.AddBundlesToCartViewModel;
import au.com.woolworths.feature.shop.bundles.data.Bundle;
import au.com.woolworths.feature.shop.bundles.data.BundleQuantityStepper;
import au.com.woolworths.feature.shop.bundles.generated.callback.StatefulButtonClickHandler;
import au.com.woolworths.views.BottomSheetWithHandle;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorView;
import com.woolworths.R;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes3.dex */
public class FragmentAddBundlesToCartBindingImpl extends FragmentAddBundlesToCartBinding implements StatefulButtonClickHandler.Listener {
    public static final SparseIntArray L;
    public final StatefulButtonClickHandler H;
    public final StatefulButtonClickHandler I;
    public final StatefulButtonClickHandler J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(R.id.begin_guide_line, 5);
        sparseIntArray.put(R.id.end_guide_line, 6);
        sparseIntArray.put(R.id.compose_bundles, 7);
        sparseIntArray.put(R.id.overlay_view, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentAddBundlesToCartBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 9, null, L);
        StatefulButton statefulButton = (StatefulButton) objArrT[2];
        ComposeView composeView = (ComposeView) objArrT[7];
        super(dataBindingComponent, view, statefulButton, composeView, (HorizontalSelectorView) objArrT[1], (FrameLayout) objArrT[8], (StatefulButton) objArrT[4], (StatefulButton) objArrT[3]);
        this.K = -1L;
        this.y.setTag(null);
        this.A.setTag(null);
        ((BottomSheetWithHandle) objArrT[0]).setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        E(view);
        this.H = new StatefulButtonClickHandler(this, 2);
        this.I = new StatefulButtonClickHandler(this, 3);
        this.J = new StatefulButtonClickHandler(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (22 == i) {
            L((Bundle) obj);
            return true;
        }
        if (207 == i) {
            return true;
        }
        if (273 != i) {
            return false;
        }
        M((AddBundlesToCartViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.bundles.databinding.FragmentAddBundlesToCartBinding
    public final void L(Bundle bundle) throws Throwable {
        this.F = bundle;
        synchronized (this) {
            this.K |= 2;
        }
        h(22);
        y();
    }

    @Override // au.com.woolworths.feature.shop.bundles.databinding.FragmentAddBundlesToCartBinding
    public final void M(AddBundlesToCartViewModel addBundlesToCartViewModel) throws Throwable {
        this.E = addBundlesToCartViewModel;
        synchronized (this) {
            this.K |= 8;
        }
        h(273);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        boolean z;
        boolean z2;
        long j2;
        StatefulButtonState statefulButtonState;
        synchronized (this) {
            j = this.K;
            this.K = 0L;
        }
        Bundle bundle = this.F;
        AddBundlesToCartViewModel addBundlesToCartViewModel = this.E;
        long j3 = 18 & j;
        int i = 1;
        ArrayList arrayList = null;
        if (j3 != 0) {
            BundleQuantityStepper bundleQuantityStepper = bundle != null ? bundle.c : null;
            int i2 = bundleQuantityStepper != null ? bundleQuantityStepper.d : 0;
            z2 = i2 != 0;
            z = i2 == 0;
        } else {
            z = false;
            z2 = false;
        }
        long j4 = 25 & j;
        if (j4 != 0) {
            StateFlow stateFlow = addBundlesToCartViewModel != null ? addBundlesToCartViewModel.k : null;
            ViewDataBindingKtx.a(this, 0, stateFlow);
            AddBundlesBottomSheetContract.ViewState viewState = stateFlow != null ? (AddBundlesBottomSheetContract.ViewState) stateFlow.getValue() : null;
            statefulButtonState = viewState != null ? viewState.b : null;
            if ((j & 24) == 0 || addBundlesToCartViewModel == null) {
                j2 = 0;
            } else {
                Bundle bundle2 = addBundlesToCartViewModel.e;
                BundleQuantityStepper bundleQuantityStepper2 = bundle2.c;
                j2 = 0;
                int i3 = bundleQuantityStepper2.f6759a;
                int i4 = bundleQuantityStepper2.c;
                IntRange intRange = new IntRange((i3 / i4) - 1, (bundleQuantityStepper2.b / i4) - 1, 1);
                ArrayList arrayList2 = new ArrayList(CollectionsKt.s(intRange, 10));
                IntProgressionIterator it = intRange.iterator();
                while (it.f) {
                    arrayList2.add(String.valueOf((it.nextInt() + i) * bundle2.c.c));
                    i = 1;
                }
                arrayList = arrayList2;
            }
        } else {
            j2 = 0;
            statefulButtonState = null;
        }
        if ((16 & j) != j2) {
            this.y.setClickHandler(this.J);
            StatefulButton statefulButton = this.y;
            StatefulButtonState statefulButtonState2 = StatefulButtonState.d;
            statefulButton.setStatefulButtonState(statefulButtonState2);
            StatefulButton statefulButton2 = this.y;
            StatefulButtonBindingKt.a(statefulButton2, statefulButton2.getResources().getString(R.string.add_to_cart_text));
            this.C.setClickHandler(this.I);
            this.C.setStatefulButtonState(statefulButtonState2);
            StatefulButton statefulButton3 = this.C;
            StatefulButtonBindingKt.a(statefulButton3, statefulButton3.getResources().getString(R.string.product_bottom_sheet_remove));
            this.D.setClickHandler(this.H);
            StatefulButton statefulButton4 = this.D;
            StatefulButtonBindingKt.a(statefulButton4, statefulButton4.getResources().getString(R.string.product_bottom_sheet_update_cart));
        }
        if (j3 != 0) {
            BindingAdaptersKt.o(this.y, z);
            BindingAdaptersKt.o(this.C, z2);
            BindingAdaptersKt.o(this.D, z2);
        }
        if ((j & 24) != j2) {
            this.A.setDataSet(arrayList);
            this.A.setViewListener(addBundlesToCartViewModel);
        }
        if (j4 != 0) {
            this.D.setStatefulButtonState(statefulButtonState);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.K != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.K = 16L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i != 0) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.K |= 1;
        }
        return true;
    }
}
