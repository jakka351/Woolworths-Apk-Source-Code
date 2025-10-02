package au.com.woolworths.feature.shop.marketplace.databinding;

import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class FragmentMarketplaceContentBindingImpl extends FragmentMarketplaceContentBinding {
    public final FrameLayout C;
    public final ContentLoadingProgressBar D;
    public long E;

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentMarketplaceContentBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, null);
        super(dataBindingComponent, view, (EpoxyRecyclerView) objArrT[1]);
        this.E = -1L;
        FrameLayout frameLayout = (FrameLayout) objArrT[0];
        this.C = frameLayout;
        frameLayout.setTag(null);
        ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) objArrT[2];
        this.D = contentLoadingProgressBar;
        contentLoadingProgressBar.setTag(null);
        this.y.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (94 == i) {
            L(((Boolean) obj).booleanValue());
            return true;
        }
        if (131 != i) {
            return false;
        }
        M((Boolean) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.marketplace.databinding.FragmentMarketplaceContentBinding
    public final void L(boolean z) throws Throwable {
        this.A = z;
        synchronized (this) {
            this.E |= 1;
        }
        h(94);
        y();
    }

    @Override // au.com.woolworths.feature.shop.marketplace.databinding.FragmentMarketplaceContentBinding
    public final void M(Boolean bool) throws Throwable {
        this.z = bool;
        synchronized (this) {
            this.E |= 2;
        }
        h(131);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() throws Resources.NotFoundException {
        long j;
        float dimension;
        Resources resources;
        int i;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        boolean z = this.A;
        Boolean bool = this.z;
        long j2 = j & 5;
        if (j2 != 0) {
            if (j2 != 0) {
                j |= z ? 16L : 8L;
            }
            if (z) {
                resources = this.y.getResources();
                i = R.dimen.three_quarter_default_padding;
            } else {
                resources = this.y.getResources();
                i = R.dimen.no_padding;
            }
            dimension = resources.getDimension(i);
        } else {
            dimension = BitmapDescriptorFactory.HUE_RED;
        }
        long j3 = 6 & j;
        boolean zB = j3 != 0 ? ViewDataBinding.B(bool) : false;
        if (j3 != 0) {
            BindingAdaptersKt.o(this.D, zB);
        }
        if ((j & 5) != 0) {
            ViewBindingAdapter.e(this.y, dimension);
            ViewBindingAdapter.d(this.y, dimension);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.E != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.E = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
