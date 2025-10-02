package au.com.woolworths.feature.shop.catalogue.databinding;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.SeekBarBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.viewpager.widget.ViewPager;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.bindings.ViewPagerBindingKt;
import au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsContract;
import au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsPageErrorState;
import au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsViewModel;
import au.com.woolworths.feature.shop.catalogue.generated.callback.OnPageSelectedListener;
import au.com.woolworths.feature.shop.catalogue.generated.callback.OnProgressChanged;
import au.com.woolworths.feature.shop.catalogue.models.CataloguePageWrapper;
import au.com.woolworths.feature.shop.catalogue.models.CatalogueSaleDetailInfo;
import com.woolworths.R;
import java.util.List;

/* loaded from: classes3.dex */
public class ActivityCatalogueDetailsBindingImpl extends ActivityCatalogueDetailsBinding implements OnPageSelectedListener.Listener, OnProgressChanged.Listener {
    public static final ViewDataBinding.IncludedLayouts K;
    public static final SparseIntArray L;
    public final Group G;
    public final OnPageSelectedListener H;
    public final OnProgressChanged I;
    public long J;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(10);
        K = includedLayouts;
        includedLayouts.a(1, new int[]{7}, new int[]{R.layout.include_generic_error_state}, new String[]{"include_generic_error_state"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(R.id.appbar_layout, 8);
        sparseIntArray.put(R.id.toolbar, 9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityCatalogueDetailsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 10, K, L);
        super(dataBindingComponent, view, (TextView) objArrT[5], (AppCompatSeekBar) objArrT[4], (ViewPager) objArrT[3], (ConstraintLayout) objArrT[1], (IncludeGenericErrorStateBinding) objArrT[7], (ProgressBar) objArrT[6], (Toolbar) objArrT[9]);
        this.J = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        IncludeGenericErrorStateBinding includeGenericErrorStateBinding = this.C;
        if (includeGenericErrorStateBinding != null) {
            includeGenericErrorStateBinding.n = this;
        }
        ((ConstraintLayout) objArrT[0]).setTag(null);
        Group group = (Group) objArrT[2];
        this.G = group;
        group.setTag(null);
        this.D.setTag(null);
        E(view);
        this.H = new OnPageSelectedListener(this);
        this.I = new OnProgressChanged(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.C.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((CatalogueDetailsViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.catalogue.databinding.ActivityCatalogueDetailsBinding
    public final void L(CatalogueDetailsViewModel catalogueDetailsViewModel) throws Throwable {
        this.F = catalogueDetailsViewModel;
        synchronized (this) {
            this.J |= 4;
        }
        h(273);
        y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.databinding.ViewDataBinding
    public final void j() throws Resources.NotFoundException {
        long j;
        long j2;
        long j3;
        int i;
        boolean z;
        boolean z2;
        CatalogueDetailsPageErrorState catalogueDetailsPageErrorState;
        String string;
        int i2;
        CatalogueDetailsPageErrorState catalogueDetailsPageErrorState2;
        CatalogueSaleDetailInfo catalogueSaleDetailInfo;
        CatalogueDetailsContract.PageState pageState;
        synchronized (this) {
            j = this.J;
            this.J = 0L;
        }
        CatalogueDetailsViewModel catalogueDetailsViewModel = this.F;
        long j4 = j & 14;
        String string2 = null;
        if (j4 != 0) {
            MutableLiveData mutableLiveData = catalogueDetailsViewModel != null ? catalogueDetailsViewModel.k : null;
            I(1, mutableLiveData);
            CatalogueDetailsContract.ViewState viewState = mutableLiveData != null ? (CatalogueDetailsContract.ViewState) mutableLiveData.e() : null;
            if (viewState != null) {
                catalogueSaleDetailInfo = viewState.c;
                i2 = viewState.d;
                pageState = viewState.f6825a;
                j2 = 0;
                catalogueDetailsPageErrorState2 = viewState.b;
            } else {
                j2 = 0;
                i2 = 0;
                catalogueDetailsPageErrorState2 = null;
                catalogueSaleDetailInfo = null;
                pageState = null;
            }
            z = (viewState != null ? viewState.f6825a : null) == CatalogueDetailsContract.PageState.e;
            List<CataloguePageWrapper> cataloguePageItems = catalogueSaleDetailInfo != null ? catalogueSaleDetailInfo.getCataloguePageItems() : null;
            int i3 = i2 + 1;
            byte b = pageState == CatalogueDetailsContract.PageState.f;
            z2 = pageState == CatalogueDetailsContract.PageState.d;
            if (j4 != 0) {
                j |= b != false ? 32L : 16L;
            }
            int size = cataloguePageItems != null ? cataloguePageItems.size() : 0;
            i = b == true ? 0 : 8;
            string2 = this.y.getResources().getString(R.string.catalogue_details_pagination_label, Integer.valueOf(i3), Integer.valueOf(size));
            j3 = 14;
            catalogueDetailsPageErrorState = catalogueDetailsPageErrorState2;
            i = i;
            i = size - 1;
            string = this.z.getResources().getString(R.string.catalogue_details_pagination_label, Integer.valueOf(i3), Integer.valueOf(size));
        } else {
            j2 = 0;
            j3 = 14;
            i = 0;
            z = false;
            z2 = false;
            catalogueDetailsPageErrorState = null;
            string = null;
        }
        if ((j & j3) != j2) {
            TextViewBindingAdapter.b(this.y, string2);
            this.z.setMax(i);
            this.C.h.setVisibility(i);
            this.C.M(catalogueDetailsPageErrorState);
            BindingAdaptersKt.p(this.G, z);
            BindingAdaptersKt.o(this.D, z2);
            if (ViewDataBinding.s >= 4) {
                this.z.setContentDescription(string);
            }
        }
        if ((8 & j) != j2) {
            SeekBarBindingAdapter.a(this.z, this.I);
            ViewPagerBindingKt.a(this.A, this.H);
        }
        if ((j & 12) != j2) {
            this.C.L(catalogueDetailsViewModel);
        }
        this.C.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.J != 0) {
                    return true;
                }
                return this.C.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.J = 8L;
        }
        this.C.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.J |= 1;
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.J |= 2;
        }
        return true;
    }
}
