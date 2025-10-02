package au.com.woolworths.feature.product.list.legacy.databinding;

import android.util.SparseIntArray;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.product.list.legacy.nutrition.NutritionBottomSheetContract;
import au.com.woolworths.feature.product.list.legacy.nutrition.NutritionBottomSheetViewModel;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class FragmentNutritionBottomSheetLegacyBindingImpl extends FragmentNutritionBottomSheetLegacyBinding {
    public static final SparseIntArray D;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.grab_handle_image_view, 3);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((NutritionBottomSheetViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.product.list.legacy.databinding.FragmentNutritionBottomSheetLegacyBinding
    public final void L(NutritionBottomSheetViewModel nutritionBottomSheetViewModel) throws Throwable {
        this.B = nutritionBottomSheetViewModel;
        synchronized (this) {
            this.C |= 2;
        }
        h(273);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String str;
        boolean z;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        NutritionBottomSheetViewModel nutritionBottomSheetViewModel = this.B;
        long j2 = j & 7;
        String str2 = null;
        if (j2 != 0) {
            MutableLiveData mutableLiveData = nutritionBottomSheetViewModel != null ? nutritionBottomSheetViewModel.f : null;
            I(0, mutableLiveData);
            NutritionBottomSheetContract.ViewState viewState = mutableLiveData != null ? (NutritionBottomSheetContract.ViewState) mutableLiveData.e() : null;
            if (viewState != null) {
                str2 = viewState.b;
                str = viewState.f5372a;
            } else {
                str = null;
            }
            boolean z2 = str2 != null;
            z = str != null;
            z = z2;
        } else {
            str = null;
            z = false;
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.z, str2);
            BindingAdaptersKt.o(this.z, z);
            TextViewBindingAdapter.b(this.A, str);
            BindingAdaptersKt.o(this.A, z);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.C = 4L;
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
            this.C |= 1;
        }
        return true;
    }
}
