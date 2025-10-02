package au.com.woolworths.shop.addtolist.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeHorizontalDividerBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButton;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonBindingKt;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductShoppingList;
import au.com.woolworths.product.quantityselector.QuantitySelectorInfoExtKt;
import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetContract;
import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetContractKt;
import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel;
import au.com.woolworths.shop.addtolist.add.AddToListMode;
import au.com.woolworths.shop.addtolist.generated.callback.OnClickListener;
import au.com.woolworths.shop.addtolist.generated.callback.StatefulButtonClickHandler;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.woolworths.R;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class FragmentAddToListBottomSheetBindingImpl extends FragmentAddToListBottomSheetBinding implements OnClickListener.Listener, StatefulButtonClickHandler.Listener {
    public static final ViewDataBinding.IncludedLayouts S;
    public static final SparseIntArray T;
    public final OnClickListener P;
    public final StatefulButtonClickHandler Q;
    public long R;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(16);
        S = includedLayouts;
        includedLayouts.a(1, new int[]{11, 12}, new int[]{R.layout.epoxy_item_lists_add, R.layout.include_horizontal_divider}, new String[]{"epoxy_item_lists_add", "include_horizontal_divider"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        T = sparseIntArray;
        sparseIntArray.put(R.id.shopping_lists, 13);
        sparseIntArray.put(R.id.transparent_loading_mask, 14);
        sparseIntArray.put(R.id.overlay_view, 15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentAddToListBottomSheetBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 16, S, T);
        super(dataBindingComponent, view, (EpoxyItemListsAddBinding) objArrT[11], (IncludeHorizontalDividerBinding) objArrT[12], (TextView) objArrT[6], (FrameLayout) objArrT[2], (HorizontalSelectorView) objArrT[3], (Group) objArrT[8], (Group) objArrT[5], (Group) objArrT[4], (FrameLayout) objArrT[15], (StatefulButton) objArrT[9], (EpoxyRecyclerView) objArrT[13], (TextView) objArrT[7], (View) objArrT[14], (Button) objArrT[10]);
        this.R = -1L;
        EpoxyItemListsAddBinding epoxyItemListsAddBinding = this.y;
        if (epoxyItemListsAddBinding != null) {
            epoxyItemListsAddBinding.n = this;
        }
        IncludeHorizontalDividerBinding includeHorizontalDividerBinding = this.z;
        if (includeHorizontalDividerBinding != null) {
            includeHorizontalDividerBinding.n = this;
        }
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        ((NestedScrollView) objArrT[0]).setTag(null);
        ((ConstraintLayout) objArrT[1]).setTag(null);
        this.H.setTag(null);
        this.J.setTag(null);
        this.L.setTag(null);
        E(view);
        this.P = new OnClickListener(this, 2);
        this.Q = new StatefulButtonClickHandler(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.y.D(lifecycleOwner);
        this.z.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (115 == i) {
            L((View) obj);
            return true;
        }
        if (273 == i) {
            N((AddToListBottomSheetViewModel) obj);
            return true;
        }
        if (208 != i) {
            return false;
        }
        M((ProductCard) obj);
        return true;
    }

    @Override // au.com.woolworths.shop.addtolist.databinding.FragmentAddToListBottomSheetBinding
    public final void L(View view) throws Throwable {
        this.O = view;
        synchronized (this) {
            this.R |= 8;
        }
        h(115);
        y();
    }

    @Override // au.com.woolworths.shop.addtolist.databinding.FragmentAddToListBottomSheetBinding
    public final void M(ProductCard productCard) throws Throwable {
        this.M = productCard;
        synchronized (this) {
            this.R |= 32;
        }
        h(208);
        y();
    }

    @Override // au.com.woolworths.shop.addtolist.databinding.FragmentAddToListBottomSheetBinding
    public final void N(AddToListBottomSheetViewModel addToListBottomSheetViewModel) throws Throwable {
        this.N = addToListBottomSheetViewModel;
        synchronized (this) {
            this.R |= 16;
        }
        h(273);
        y();
    }

    @Override // au.com.woolworths.shop.addtolist.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        AddToListBottomSheetViewModel addToListBottomSheetViewModel = this.N;
        if (addToListBottomSheetViewModel != null) {
            addToListBottomSheetViewModel.B6();
        }
    }

    @Override // au.com.woolworths.shop.addtolist.generated.callback.StatefulButtonClickHandler.Listener
    public final void b(int i) {
        AddToListBottomSheetViewModel addToListBottomSheetViewModel = this.N;
        if (addToListBottomSheetViewModel != null) {
            addToListBottomSheetViewModel.A6();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        long j2;
        long j3;
        CharSequence text;
        boolean z;
        boolean z2;
        boolean z3;
        boolean zA;
        boolean z4;
        boolean z5;
        boolean z6;
        ArrayList arrayListA;
        int i;
        Text text2;
        int i2;
        int i3;
        synchronized (this) {
            j = this.R;
            this.R = 0L;
        }
        View view = this.O;
        AddToListBottomSheetViewModel addToListBottomSheetViewModel = this.N;
        ProductCard productCard = this.M;
        int i4 = ((72 & j) > 0L ? 1 : ((72 & j) == 0L ? 0 : -1));
        boolean z7 = (i4 == 0 || view == null) ? false : true;
        long j4 = 82 & j;
        if (j4 != 0) {
            MutableLiveData mutableLiveData = addToListBottomSheetViewModel != null ? addToListBottomSheetViewModel.k : null;
            I(1, mutableLiveData);
            AddToListBottomSheetContract.ViewState viewState = mutableLiveData != null ? (AddToListBottomSheetContract.ViewState) mutableLiveData.e() : null;
            z5 = (viewState == null || AddToListBottomSheetContractKt.a(viewState)) ? false : true;
            j3 = 0;
            z2 = viewState != null && ((viewState.h == AddToListMode.d && !viewState.b.isEmpty()) || viewState.e != null);
            z3 = viewState != null && viewState.h == AddToListMode.d && viewState.b.isEmpty();
            zA = AddToListBottomSheetContractKt.a(viewState);
            if (viewState != null) {
                z4 = viewState.f;
                i3 = viewState.d;
                j2 = j;
                text2 = viewState.f10113a;
                i2 = viewState.c;
            } else {
                j2 = j;
                text2 = null;
                i2 = 0;
                z4 = false;
                i3 = 0;
            }
            text = text2 != null ? text2.getText(this.h.getContext()) : null;
            z = i3 != i2;
        } else {
            j2 = j;
            j3 = 0;
            text = null;
            z = false;
            z2 = false;
            z3 = false;
            zA = false;
            z4 = false;
            z5 = false;
        }
        long j5 = j2 & 96;
        if (j5 != j3) {
            ProductShoppingList productShoppingList = productCard != null ? productCard.getProductShoppingList() : null;
            arrayListA = QuantitySelectorInfoExtKt.a(productShoppingList);
            z6 = productShoppingList.getUnitLabel() != null;
        } else {
            z6 = false;
            arrayListA = null;
        }
        if ((j2 & 80) != j3) {
            i = i4;
            this.y.L(addToListBottomSheetViewModel);
            this.C.setViewListener(addToListBottomSheetViewModel);
            this.C.setAnalyticsListener(addToListBottomSheetViewModel);
        } else {
            i = i4;
        }
        if (j4 != 0) {
            BindingAdaptersKt.o(this.A, z3);
            BindingAdaptersKt.o(this.C, z4);
            BindingAdaptersKt.p(this.D, zA);
            BindingAdaptersKt.p(this.E, z5);
            BindingAdaptersKt.p(this.F, z2);
            TextViewBindingAdapter.b(this.J, text);
            this.L.setEnabled(z);
        }
        if (i != 0) {
            FrameLayout layout = this.B;
            Intrinsics.h(layout, "layout");
            layout.removeAllViews();
            if (view != null) {
                layout.addView(view);
            }
            BindingAdaptersKt.o(this.B, z7);
        }
        if (j5 != j3) {
            this.C.setDataSet(arrayListA);
            this.C.setWideItems(z6);
        }
        if ((j2 & 64) != j3) {
            this.H.setClickHandler(this.Q);
            this.H.setStatefulButtonState(StatefulButtonState.d);
            StatefulButton statefulButton = this.H;
            StatefulButtonBindingKt.a(statefulButton, statefulButton.getResources().getString(R.string.remove));
            this.L.setOnClickListener(this.P);
        }
        this.y.k();
        this.z.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.R != 0) {
                    return true;
                }
                return this.y.p() || this.z.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.R = 64L;
        }
        this.y.r();
        this.z.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.R |= 1;
            }
            return true;
        }
        if (i == 1) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.R |= 2;
            }
            return true;
        }
        if (i != 2) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.R |= 4;
        }
        return true;
    }
}
