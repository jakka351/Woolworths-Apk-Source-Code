package au.com.woolworths.feature.product.list.databinding;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.databinding.adapters.ViewBindingAdapter;
import androidx.lifecycle.MediatorLiveData;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.utils.Extensions;
import au.com.woolworths.feature.product.list.ProductListContract;
import au.com.woolworths.feature.product.list.ProductListViewModel;
import au.com.woolworths.feature.product.list.ProductsDisplayMode;
import au.com.woolworths.feature.product.list.ProductsDisplayModeKt;
import au.com.woolworths.feature.product.list.generated.callback.OnClickListener;
import au.com.woolworths.feature.product.list.j;
import com.woolworths.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class IncludeProductListHeaderBindingImpl extends IncludeProductListHeaderBinding implements OnClickListener.Listener {
    public static final SparseIntArray F;
    public final OnClickListener D;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(R.id.barrier, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IncludeProductListHeaderBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 6, null, F);
        super(dataBindingComponent, view, (ComposeView) objArrT[1], (ImageView) objArrT[4], (TextView) objArrT[3], (TextView) objArrT[2]);
        this.E = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        E(view);
        this.D = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((ProductListViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.product.list.databinding.IncludeProductListHeaderBinding
    public final void L(ProductListViewModel productListViewModel) throws Throwable {
        this.C = productListViewModel;
        synchronized (this) {
            this.E |= 2;
        }
        h(273);
        y();
    }

    @Override // au.com.woolworths.feature.product.list.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        ProductsDisplayMode productsDisplayMode;
        ProductListViewModel productListViewModel = this.C;
        if (productListViewModel != null) {
            ProductsDisplayMode productsDisplayMode2 = productListViewModel.L;
            Intrinsics.h(productsDisplayMode2, "<this>");
            int iOrdinal = productsDisplayMode2.ordinal();
            if (iOrdinal == 0) {
                productsDisplayMode = ProductsDisplayMode.e;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                productsDisplayMode = ProductsDisplayMode.d;
            }
            productListViewModel.I6(productsDisplayMode, true);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        long j2;
        long j3;
        String str;
        String str2;
        Activities.ProductList.Extras pageExtras;
        boolean z;
        boolean z2;
        int iC;
        boolean z3;
        j jVar;
        boolean z4;
        boolean z5;
        ProductsDisplayMode productsDisplayMode;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        ProductListViewModel productListViewModel = this.C;
        long j4 = 7 & j;
        if (j4 != 0) {
            if ((j & 6) != 0) {
                ProductsDisplayMode productsDisplayMode2 = productListViewModel != null ? productListViewModel.L : null;
                Intrinsics.h(productsDisplayMode2, "<this>");
                int iOrdinal = productsDisplayMode2.ordinal();
                if (iOrdinal == 0) {
                    productsDisplayMode = ProductsDisplayMode.e;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    productsDisplayMode = ProductsDisplayMode.d;
                }
                iC = ProductsDisplayModeKt.c(productsDisplayMode);
            } else {
                iC = 0;
            }
            MediatorLiveData mediatorLiveData = productListViewModel != null ? productListViewModel.C : null;
            I(0, mediatorLiveData);
            ProductListContract.ViewState viewState = mediatorLiveData != null ? (ProductListContract.ViewState) mediatorLiveData.e() : null;
            if (viewState != null) {
                pageExtras = viewState.k;
                boolean z6 = viewState.b;
                z5 = (z6 || viewState.f5249a <= 0 || viewState.g) ? false : true;
                z4 = z6 && viewState.f5249a > 0 && viewState.j;
                j2 = 0;
                z = viewState.o;
                jVar = viewState.B;
            } else {
                j2 = 0;
                jVar = null;
                pageExtras = null;
                z = false;
                z4 = false;
                z5 = false;
            }
            Activities.ProductList.ExtrasPageData extrasPageData = pageExtras != null ? pageExtras.d : null;
            z3 = !z5;
            j3 = 6;
            str = jVar != null ? (String) jVar.invoke(this.h.getContext()) : null;
            str2 = extrasPageData != null ? extrasPageData.e : null;
            z2 = str2 != null;
            z = z4;
        } else {
            j2 = 0;
            j3 = 6;
            str = null;
            str2 = null;
            pageExtras = null;
            z = false;
            z2 = false;
            iC = 0;
            z3 = false;
        }
        if (j4 != 0) {
            BindingAdaptersKt.o(this.y, z);
            BindingAdaptersKt.j(this.z, z3);
            TextViewBindingAdapter.b(this.A, str);
            BindingAdaptersKt.j(this.A, z);
            TextView textView = this.A;
            Intrinsics.h(textView, "textView");
            Intrinsics.h(pageExtras, "pageExtras");
            Activities.ProductList.ExtraProductListSource extraProductListSource = pageExtras.e;
            textView.setTextAppearance(extraProductListSource.getE().m);
            Context context = textView.getContext();
            Intrinsics.g(context, "getContext(...)");
            textView.setTextColor(Extensions.a(extraProductListSource.getE().n, context));
            TextViewBindingAdapter.b(this.B, str2);
            BindingAdaptersKt.o(this.B, z2);
        }
        if ((4 & j) != j2) {
            ViewBindingAdapter.b(this.z, this.D, true);
        }
        if ((j & j3) != j2) {
            BindingAdaptersKt.m(this.z, iC, null);
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
        if (i != 0) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.E |= 1;
        }
        return true;
    }
}
