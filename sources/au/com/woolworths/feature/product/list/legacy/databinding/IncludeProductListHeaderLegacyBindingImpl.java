package au.com.woolworths.feature.product.list.legacy.databinding;

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
import au.com.woolworths.feature.product.list.legacy.ProductListContract;
import au.com.woolworths.feature.product.list.legacy.ProductListViewModel;
import au.com.woolworths.feature.product.list.legacy.ProductsDisplayMode;
import au.com.woolworths.feature.product.list.legacy.ProductsDisplayModeKt;
import au.com.woolworths.feature.product.list.legacy.generated.callback.OnClickListener;
import au.com.woolworths.feature.product.list.legacy.i;
import au.com.woolworths.pagingutils.NetworkState;
import au.com.woolworths.pagingutils.Status;
import com.woolworths.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class IncludeProductListHeaderLegacyBindingImpl extends IncludeProductListHeaderLegacyBinding implements OnClickListener.Listener {
    public static final SparseIntArray F;
    public final OnClickListener D;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(R.id.barrier, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IncludeProductListHeaderLegacyBindingImpl(DataBindingComponent dataBindingComponent, View view) {
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

    @Override // au.com.woolworths.feature.product.list.legacy.databinding.IncludeProductListHeaderLegacyBinding
    public final void L(ProductListViewModel productListViewModel) throws Throwable {
        this.C = productListViewModel;
        synchronized (this) {
            this.E |= 4;
        }
        h(273);
        y();
    }

    @Override // au.com.woolworths.feature.product.list.legacy.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        ProductsDisplayMode productsDisplayMode;
        ProductListViewModel productListViewModel = this.C;
        if (productListViewModel != null) {
            ProductsDisplayMode productsDisplayMode2 = productListViewModel.I;
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
            productListViewModel.W6(productsDisplayMode, true);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        boolean z;
        long j2;
        long j3;
        long j4;
        long j5;
        String str;
        boolean z2;
        String str2;
        int iC;
        boolean z3;
        MediatorLiveData mediatorLiveData;
        NetworkState networkState;
        Status status;
        boolean z4;
        Activities.ProductList.Extras pageExtras;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        i iVar;
        ProductsDisplayMode productsDisplayMode;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        ProductListViewModel productListViewModel = this.C;
        long j6 = j & 15;
        if (j6 != 0) {
            if ((j & 12) != 0) {
                ProductsDisplayMode productsDisplayMode2 = productListViewModel != null ? productListViewModel.I : null;
                j4 = 14;
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
                j4 = 14;
                iC = 0;
            }
            if ((j & 13) != 0) {
                mediatorLiveData = productListViewModel != null ? productListViewModel.C : null;
                I(0, mediatorLiveData);
                networkState = mediatorLiveData != null ? (NetworkState) mediatorLiveData.e() : null;
                j5 = 32;
                status = networkState != null ? networkState.f9174a : null;
                z4 = status != Status.d;
            } else {
                j5 = 32;
                z4 = false;
                mediatorLiveData = null;
                networkState = null;
                status = null;
            }
            j2 = 13;
            MediatorLiveData mediatorLiveData2 = productListViewModel != null ? productListViewModel.F : null;
            I(1, mediatorLiveData2);
            ProductListContract.ViewState viewState = mediatorLiveData2 != null ? (ProductListContract.ViewState) mediatorLiveData2.e() : null;
            pageExtras = viewState != null ? viewState.k : null;
            z = true;
            Activities.ProductList.ExtrasPageData extrasPageData = pageExtras != null ? pageExtras.d : null;
            str = extrasPageData != null ? extrasPageData.e : null;
            z6 = str != null;
            if (j6 != 0) {
                j = z6 ? j | j5 : j | 16;
            }
            if ((j & j4) != 0) {
                if (viewState != null) {
                    boolean z9 = viewState.b;
                    j3 = 12;
                    z8 = (z9 || viewState.f5323a <= 0 || viewState.g) ? false : true;
                    z3 = z9 && viewState.f5323a > 0 && viewState.j;
                    z2 = viewState.o;
                    iVar = viewState.w;
                } else {
                    j3 = 12;
                    z2 = false;
                    z3 = false;
                    z8 = false;
                    iVar = null;
                }
                z5 = !z8;
                str2 = iVar != null ? (String) iVar.invoke(this.h.getContext()) : null;
            } else {
                j3 = 12;
                z2 = false;
                str2 = null;
                z3 = false;
                z5 = false;
            }
        } else {
            z = true;
            j2 = 13;
            j3 = 12;
            j4 = 14;
            j5 = 32;
            str = null;
            z2 = false;
            str2 = null;
            iC = 0;
            z3 = false;
            mediatorLiveData = null;
            networkState = null;
            status = null;
            z4 = false;
            pageExtras = null;
            z5 = false;
            z6 = false;
        }
        if ((j & j5) != 0) {
            if (productListViewModel != null) {
                mediatorLiveData = productListViewModel.C;
            }
            z7 = false;
            I(0, mediatorLiveData);
            if (mediatorLiveData != null) {
                networkState = (NetworkState) mediatorLiveData.e();
            }
            if (networkState != null) {
                status = networkState.f9174a;
            }
            if (status == Status.d) {
                z = false;
            }
            z4 = z;
        } else {
            z7 = false;
        }
        long j7 = j & 15;
        if (j7 != 0 && z6) {
            z7 = z4;
        }
        if ((j & j4) != 0) {
            BindingAdaptersKt.o(this.y, z3);
            BindingAdaptersKt.j(this.z, z5);
            TextViewBindingAdapter.b(this.A, str2);
            BindingAdaptersKt.j(this.A, z2);
            TextView textView = this.A;
            Intrinsics.h(textView, "textView");
            Intrinsics.h(pageExtras, "pageExtras");
            Activities.ProductList.ExtraProductListSource extraProductListSource = pageExtras.e;
            textView.setTextAppearance(extraProductListSource.getE().m);
            Context context = textView.getContext();
            Intrinsics.g(context, "getContext(...)");
            textView.setTextColor(Extensions.a(extraProductListSource.getE().n, context));
            TextViewBindingAdapter.b(this.B, str);
        }
        if ((j & j2) != 0) {
            ViewBindingAdapter.b(this.z, this.D, z4);
        }
        if ((j & j3) != 0) {
            BindingAdaptersKt.m(this.z, iC, null);
        }
        if (j7 != 0) {
            BindingAdaptersKt.o(this.B, z7);
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
            this.E = 8L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.E |= 1;
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
            this.E |= 2;
        }
        return true;
    }
}
