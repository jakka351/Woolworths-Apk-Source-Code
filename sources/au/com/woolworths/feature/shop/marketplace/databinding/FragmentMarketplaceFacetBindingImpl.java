package au.com.woolworths.feature.shop.marketplace.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.woolworths.R;
import org.bouncycastle.math.Primes;

/* loaded from: classes3.dex */
public class FragmentMarketplaceFacetBindingImpl extends FragmentMarketplaceFacetBinding {
    public static final SparseIntArray I;
    public final ContentLoadingProgressBar G;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(R.id.recycler_view, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentMarketplaceFacetBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 5, null, I);
        super(dataBindingComponent, view, (EpoxyRecyclerView) objArrT[4], (SearchView) objArrT[1], (TextView) objArrT[2]);
        this.H = -1L;
        ((ConstraintLayout) objArrT[0]).setTag(null);
        ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) objArrT[3];
        this.G = contentLoadingProgressBar;
        contentLoadingProgressBar.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (211 == i) {
            O((Integer) obj);
            return true;
        }
        if (138 == i) {
            N((Boolean) obj);
            return true;
        }
        if (131 == i) {
            L((Boolean) obj);
            return true;
        }
        if (137 != i) {
            return false;
        }
        M((Boolean) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.marketplace.databinding.FragmentMarketplaceFacetBinding
    public final void L(Boolean bool) throws Throwable {
        this.B = bool;
        synchronized (this) {
            this.H |= 4;
        }
        h(131);
        y();
    }

    @Override // au.com.woolworths.feature.shop.marketplace.databinding.FragmentMarketplaceFacetBinding
    public final void M(Boolean bool) throws Throwable {
        this.D = bool;
        synchronized (this) {
            this.H |= 8;
        }
        h(137);
        y();
    }

    @Override // au.com.woolworths.feature.shop.marketplace.databinding.FragmentMarketplaceFacetBinding
    public final void N(Boolean bool) throws Throwable {
        this.C = bool;
        synchronized (this) {
            this.H |= 2;
        }
        h(138);
        y();
    }

    @Override // au.com.woolworths.feature.shop.marketplace.databinding.FragmentMarketplaceFacetBinding
    public final void O(Integer num) throws Throwable {
        this.E = num;
        synchronized (this) {
            this.H |= 1;
        }
        h(Primes.SMALL_FACTOR_LIMIT);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        boolean z;
        synchronized (this) {
            j = this.H;
            this.H = 0L;
        }
        Integer num = this.E;
        Boolean bool = this.C;
        Boolean bool2 = this.B;
        Boolean bool3 = this.D;
        long j2 = j & 17;
        if (j2 != 0) {
            z = num != null;
            if (j2 != 0) {
                j = z ? j | 64 : j | 32;
            }
        } else {
            z = false;
        }
        long j3 = j & 18;
        boolean zB = j3 != 0 ? ViewDataBinding.B(bool) : false;
        long j4 = j & 20;
        boolean zB2 = j4 != 0 ? ViewDataBinding.B(bool2) : false;
        long j5 = j & 24;
        boolean zB3 = j5 != 0 ? ViewDataBinding.B(bool3) : false;
        String str = null;
        String string = (64 & j) != 0 ? this.h.getContext().getString(ViewDataBinding.z(num)) : null;
        long j6 = j & 17;
        if (j6 != 0 && z) {
            str = string;
        }
        if (j4 != 0) {
            BindingAdaptersKt.o(this.G, zB2);
        }
        if (j6 != 0) {
            this.z.setQueryHint(str);
            TextViewBindingAdapter.b(this.A, str);
        }
        if (j3 != 0) {
            BindingAdaptersKt.o(this.z, zB);
        }
        if (j5 != 0) {
            BindingAdaptersKt.o(this.A, zB3);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.H != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.H = 16L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
