package au.com.woolworths.shop.lists.databinding;

import android.content.Context;
import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBindingKtx;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.base.shopapp.bindings.TextViewBindingsKt;
import au.com.woolworths.shop.lists.data.model.ShoppingList;
import au.com.woolworths.shop.lists.generated.callback.OnClickListener;
import au.com.woolworths.shop.lists.generated.callback.OnRefreshListener;
import au.com.woolworths.shop.lists.generated.callback.StatefulButtonClickHandler;
import au.com.woolworths.shop.lists.ui.details.ui.ListDetailsView;
import au.com.woolworths.shop.lists.ui.details.ui.ListDetailsViewListener;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.BoostAllBannerState;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ShoppingListDetailsUiModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByView;
import au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByViewListener;
import au.com.woolworths.shop.lists.ui.shoppinglist.ui.SngListSelectorInlineLabel;
import au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.button.MaterialButton;
import com.woolworths.R;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes4.dex */
public class ActivityShoppingListBindingImpl extends ActivityShoppingListBinding implements OnRefreshListener.Listener, OnClickListener.Listener, StatefulButtonClickHandler.Listener {
    public static final ViewDataBinding.IncludedLayouts d0;
    public static final SparseIntArray e0;
    public final FrameLayout W;
    public final OnRefreshListener X;
    public final OnClickListener Y;
    public final OnClickListener Z;
    public final OnClickListener a0;
    public final StatefulButtonClickHandler b0;
    public long c0;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(20);
        d0 = includedLayouts;
        includedLayouts.a(7, new int[]{14}, new int[]{R.layout.include_boost_all_banner}, new String[]{"include_boost_all_banner"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        e0 = sparseIntArray;
        sparseIntArray.put(R.id.appbar, 15);
        sparseIntArray.put(R.id.list_icon_image, 16);
        sparseIntArray.put(R.id.toolbar, 17);
        sparseIntArray.put(R.id.content, 18);
        sparseIntArray.put(R.id.recycler_view, 19);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityShoppingListBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 20, d0, e0);
        super(dataBindingComponent, view, (AppBarLayout) objArrT[15], (IncludeBoostAllBannerBinding) objArrT[14], (TextView) objArrT[3], (CollapsingToolbarLayout) objArrT[1], (ConstraintLayout) objArrT[18], (CoordinatorLayout) objArrT[0], (View) objArrT[5], (TextView) objArrT[2], (ComposeView) objArrT[16], (View) objArrT[9], (MaterialButton) objArrT[10], (EpoxyRecyclerView) objArrT[19], (Button) objArrT[12], (ConstraintLayout) objArrT[11], (SortByView) objArrT[4], (SwipeRefreshLayout) objArrT[8], (Toolbar) objArrT[17], (ListDetailsView) objArrT[13], (WatchlistToggleView) objArrT[6]);
        this.c0 = -1L;
        IncludeBoostAllBannerBinding includeBoostAllBannerBinding = this.z;
        if (includeBoostAllBannerBinding != null) {
            includeBoostAllBannerBinding.n = this;
        }
        this.A.setTag(null);
        this.B.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArrT[7];
        this.W = frameLayout;
        frameLayout.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.K.setTag(null);
        this.L.setTag(null);
        this.M.setTag(null);
        this.N.setTag(null);
        this.P.setTag(null);
        this.Q.setTag(null);
        E(view);
        this.X = new OnRefreshListener(this);
        this.Y = new OnClickListener(this, 4);
        this.Z = new OnClickListener(this, 5);
        this.a0 = new OnClickListener(this, 1);
        this.b0 = new StatefulButtonClickHandler(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.z.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (248 == i) {
            O((SortByViewListener) obj);
            return true;
        }
        if (154 == i) {
            N((String) obj);
            return true;
        }
        if (101 == i) {
            L((ListDetailsViewListener) obj);
            return true;
        }
        if (130 == i) {
            M((Boolean) obj);
            return true;
        }
        if (273 != i) {
            return false;
        }
        P((ShoppingListDetailsContract.IShoppingListDetailsViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.shop.lists.databinding.ActivityShoppingListBinding
    public final void L(ListDetailsViewListener listDetailsViewListener) throws Throwable {
        this.U = listDetailsViewListener;
        synchronized (this) {
            this.c0 |= 16;
        }
        h(101);
        y();
    }

    @Override // au.com.woolworths.shop.lists.databinding.ActivityShoppingListBinding
    public final void M(Boolean bool) throws Throwable {
        this.S = bool;
        synchronized (this) {
            this.c0 |= 32;
        }
        h(130);
        y();
    }

    @Override // au.com.woolworths.shop.lists.databinding.ActivityShoppingListBinding
    public final void N(String str) throws Throwable {
        this.T = str;
        synchronized (this) {
            this.c0 |= 8;
        }
        h(154);
        y();
    }

    @Override // au.com.woolworths.shop.lists.databinding.ActivityShoppingListBinding
    public final void O(SortByViewListener sortByViewListener) throws Throwable {
        this.V = sortByViewListener;
        synchronized (this) {
            this.c0 |= 4;
        }
        h(248);
        y();
    }

    @Override // au.com.woolworths.shop.lists.databinding.ActivityShoppingListBinding
    public final void P(ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel) throws Throwable {
        this.R = iShoppingListDetailsViewModel;
        synchronized (this) {
            this.c0 |= 64;
        }
        h(273);
        y();
    }

    @Override // au.com.woolworths.shop.lists.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel;
        if (i == 1) {
            ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel2 = this.R;
            if (iShoppingListDetailsViewModel2 != null) {
                iShoppingListDetailsViewModel2.l3();
                return;
            }
            return;
        }
        if (i != 4) {
            if (i == 5 && (iShoppingListDetailsViewModel = this.R) != null) {
                iShoppingListDetailsViewModel.t1();
                return;
            }
            return;
        }
        ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel3 = this.R;
        if (iShoppingListDetailsViewModel3 != null) {
            iShoppingListDetailsViewModel3.A5();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() throws Resources.NotFoundException {
        long j;
        long j2;
        int i;
        boolean z;
        boolean z2;
        String title;
        String str;
        BoostAllBannerState boostAllBannerState;
        boolean z3;
        CharSequence charSequence;
        boolean z4;
        int i2;
        int i3;
        int i4;
        ShoppingListDetailsUiModel shoppingListDetailsUiModel;
        BoostAllBannerState boostAllBannerState2;
        boolean z5;
        ResText resText;
        boolean z6;
        boolean z7;
        String quantityString;
        boolean zC;
        ShoppingList shoppingList;
        synchronized (this) {
            j = this.c0;
            this.c0 = 0L;
        }
        SortByViewListener sortByViewListener = this.V;
        String str2 = this.T;
        ListDetailsViewListener listDetailsViewListener = this.U;
        Boolean bool = this.S;
        ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel = this.R;
        int i5 = ((132 & j) > 0L ? 1 : ((132 & j) == 0L ? 0 : -1));
        int i6 = ((136 & j) > 0L ? 1 : ((136 & j) == 0L ? 0 : -1));
        int i7 = ((144 & j) > 0L ? 1 : ((144 & j) == 0L ? 0 : -1));
        int i8 = ((160 & j) > 0L ? 1 : ((160 & j) == 0L ? 0 : -1));
        boolean zB = i8 != 0 ? ViewDataBinding.B(bool) : false;
        long j3 = 193 & j;
        if (j3 != 0) {
            StateFlow stateFlowG = iShoppingListDetailsViewModel != null ? iShoppingListDetailsViewModel.G() : null;
            ViewDataBindingKtx.a(this, 0, stateFlowG);
            ShoppingListDetailsContract.ViewState viewState = stateFlowG != null ? (ShoppingListDetailsContract.ViewState) stateFlowG.getValue() : null;
            if (viewState != null) {
                z5 = viewState.e;
                ShoppingListDetailsUiModel shoppingListDetailsUiModel2 = viewState.f12428a;
                z = true;
                if (shoppingListDetailsUiModel2 == null || (shoppingList = shoppingListDetailsUiModel2.f12434a) == null) {
                    j2 = j;
                    zC = false;
                } else {
                    j2 = j;
                    zC = Intrinsics.c(shoppingList.isWatchlist(), Boolean.TRUE);
                }
                boolean z8 = zC && shoppingListDetailsUiModel2.b() != 0;
                shoppingListDetailsUiModel = viewState.f12428a;
                boostAllBannerState2 = viewState.h;
                z4 = !(shoppingListDetailsUiModel != null && shoppingListDetailsUiModel.b() == 0);
                resText = viewState.i;
                z6 = z8;
            } else {
                j2 = j;
                z = true;
                shoppingListDetailsUiModel = null;
                boostAllBannerState2 = null;
                z5 = false;
                resText = null;
                z4 = false;
                z6 = false;
            }
            Context context = this.h.getContext();
            BoostAllBannerState boostAllBannerState3 = boostAllBannerState2;
            Intrinsics.h(context, "context");
            if (shoppingListDetailsUiModel != null) {
                int iB = shoppingListDetailsUiModel.b();
                z7 = z5;
                i = i5;
                quantityString = context.getResources().getQuantityString(R.plurals.shop_lists_items, iB, Integer.valueOf(iB));
                Intrinsics.g(quantityString, "getQuantityString(...)");
            } else {
                z7 = z5;
                i = i5;
                quantityString = null;
            }
            ShoppingList shoppingList2 = shoppingListDetailsUiModel != null ? shoppingListDetailsUiModel.f12434a : null;
            CharSequence text = resText != null ? resText.getText(this.h.getContext()) : null;
            if (shoppingList2 != null) {
                charSequence = text;
                title = shoppingList2.getTitle();
                boostAllBannerState = boostAllBannerState3;
                z3 = z7;
            } else {
                charSequence = text;
                boostAllBannerState = boostAllBannerState3;
                z3 = z7;
                title = null;
            }
            str = quantityString;
            z2 = z6;
        } else {
            j2 = j;
            i = i5;
            z = true;
            z2 = false;
            title = null;
            str = null;
            boostAllBannerState = null;
            z3 = false;
            charSequence = null;
            z4 = false;
        }
        if ((j2 & 128) != 0) {
            i2 = i6;
            i3 = i7;
            this.z.M(this.b0);
            this.A.setOnClickListener(this.a0);
            i4 = i8;
            TextViewBindingsKt.c(this.A, SngListSelectorInlineLabel.d, z);
            this.I.setOnClickListener(this.Y);
            BindingAdaptersKt.o(this.I, false);
            this.K.setOnClickListener(this.Z);
            this.N.setOnRefreshListener(this.X);
        } else {
            i2 = i6;
            i3 = i7;
            i4 = i8;
        }
        if (j3 != 0) {
            this.z.L(boostAllBannerState);
            this.B.setTitle(title);
            BindingAdaptersKt.o(this.E, z2);
            TextViewBindingAdapter.b(this.F, str);
            BindingAdaptersKt.o(this.H, z3);
            TextViewBindingAdapter.b(this.K, charSequence);
            BindingAdaptersKt.o(this.M, z4);
            this.N.setRefreshing(z3);
            BindingAdaptersKt.o(this.Q, z2);
        }
        if (i4 != 0) {
            BindingAdaptersKt.o(this.A, zB);
            BindingAdaptersKt.o(this.L, zB);
        }
        if (i2 != 0) {
            this.M.setListId(str2);
            this.P.setListId(str2);
            this.Q.setListId(str2);
        }
        if (i != 0) {
            this.M.setSortByViewListener(sortByViewListener);
        }
        if (i3 != 0) {
            this.P.setHostViewListener(listDetailsViewListener);
        }
        this.z.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.c0 != 0) {
                    return true;
                }
                return this.z.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.c0 = 128L;
        }
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
                this.c0 |= 1;
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
            this.c0 |= 2;
        }
        return true;
    }
}
