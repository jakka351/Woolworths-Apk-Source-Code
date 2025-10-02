package au.com.woolworths.feature.shop.homepage.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBindingKtx;
import androidx.databinding.adapters.ViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import au.com.woolworths.analytics.supers.homepage.HomepageAnalytics;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.feature.shop.homepage.data.DeliveryNowBottomBanner;
import au.com.woolworths.feature.shop.homepage.generated.callback.OnRefreshListener;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageContract;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageErrorState;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel;
import au.com.woolworths.feature.shop.homepage.presentation.deliverynowbanner.DeliveryNowBannerView;
import au.com.woolworths.foundation.shop.editorder.ui.EditOrderBannerView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes3.dex */
public class FragmentHomePageBindingImpl extends FragmentHomePageBinding implements OnRefreshListener.Listener {
    public static final ViewDataBinding.IncludedLayouts N;
    public static final SparseIntArray O;
    public final LinearLayout I;
    public final OnRefreshListener J;
    public Function0Impl K;
    public Function0Impl1 L;
    public long M;

    public static class Function0Impl implements Function0<Unit> {
        public HomePageViewModel d;

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            this.d.E6();
            return null;
        }
    }

    public static class Function0Impl1 implements Function0<Unit> {
        public HomePageViewModel d;

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            DeliveryNowBottomBanner deliveryNowBottomBanner;
            ContentCta contentCta;
            HomePageViewModel homePageViewModel = this.d;
            homePageViewModel.f.g(HomepageAnalytics.HomeScreen.Action.f);
            HomePageContract.DeliveryNowData deliveryNowData = ((HomePageContract.ViewState) homePageViewModel.I.getValue()).f;
            String url = (deliveryNowData == null || (deliveryNowBottomBanner = deliveryNowData.b) == null || (contentCta = deliveryNowBottomBanner.i) == null) ? null : contentCta.getUrl();
            if (url == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            homePageViewModel.w6(new HomePageContract.Actions.LaunchDeepLink(url));
            return null;
        }
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(11);
        N = includedLayouts;
        includedLayouts.a(2, new int[]{6}, new int[]{R.layout.include_generic_error_state}, new String[]{"include_generic_error_state"});
        includedLayouts.a(3, new int[]{7}, new int[]{R.layout.include_generic_error_state}, new String[]{"include_generic_error_state"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(R.id.edit_order_banner, 8);
        sparseIntArray.put(R.id.recycler_view, 9);
        sparseIntArray.put(R.id.content_page_feed, 10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentHomePageBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 11, N, O);
        super(dataBindingComponent, view, (IncludeGenericErrorStateBinding) objArrT[7], (ComposeView) objArrT[10], (DeliveryNowBannerView) objArrT[4], (EditOrderBannerView) objArrT[8], (IncludeGenericErrorStateBinding) objArrT[6], (ProgressBar) objArrT[5], (EpoxyRecyclerView) objArrT[9], (SwipeRefreshLayout) objArrT[1]);
        this.M = -1L;
        IncludeGenericErrorStateBinding includeGenericErrorStateBinding = this.y;
        if (includeGenericErrorStateBinding != null) {
            includeGenericErrorStateBinding.n = this;
        }
        this.A.setTag(null);
        IncludeGenericErrorStateBinding includeGenericErrorStateBinding2 = this.C;
        if (includeGenericErrorStateBinding2 != null) {
            includeGenericErrorStateBinding2.n = this;
        }
        ((ConstraintLayout) objArrT[0]).setTag(null);
        ((LinearLayout) objArrT[2]).setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArrT[3];
        this.I = linearLayout;
        linearLayout.setTag(null);
        this.D.setTag(null);
        this.F.setTag(null);
        E(view);
        this.J = new OnRefreshListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.C.D(lifecycleOwner);
        this.y.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((HomePageViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.homepage.databinding.FragmentHomePageBinding
    public final void L(HomePageViewModel homePageViewModel) throws Throwable {
        this.G = homePageViewModel;
        synchronized (this) {
            this.M |= 8;
        }
        h(273);
        y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [au.com.woolworths.feature.shop.homepage.presentation.HomePageContract$DeliveryNowViewState] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        long j2;
        long j3;
        long j4;
        Function0Impl function0Impl;
        DeliveryNowBottomBanner deliveryNowBottomBanner;
        Function0Impl1 function0Impl1;
        boolean z;
        ?? r5;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        float dimension;
        float f;
        StateFlow stateFlow;
        HomePageErrorState homePageErrorState;
        HomePageContract.DeliveryNowData deliveryNowData;
        boolean z6;
        boolean z7;
        boolean z8;
        synchronized (this) {
            j = this.M;
            this.M = 0L;
        }
        HomePageViewModel homePageViewModel = this.G;
        long j5 = j & 28;
        HomePageErrorState homePageErrorState2 = null;
        if (j5 != 0) {
            if (homePageViewModel != null) {
                function0Impl = this.K;
                if (function0Impl == null) {
                    function0Impl = new Function0Impl();
                    this.K = function0Impl;
                }
                function0Impl.d = homePageViewModel;
                stateFlow = homePageViewModel.I;
                function0Impl1 = this.L;
                if (function0Impl1 == null) {
                    function0Impl1 = new Function0Impl1();
                    this.L = function0Impl1;
                }
                function0Impl1.d = homePageViewModel;
            } else {
                function0Impl = null;
                stateFlow = null;
                function0Impl1 = null;
            }
            ViewDataBindingKtx.a(this, 2, stateFlow);
            HomePageContract.ViewState viewState = stateFlow != null ? (HomePageContract.ViewState) stateFlow.getValue() : null;
            if (viewState != null) {
                z8 = viewState.k;
                j2 = 0;
                z6 = viewState.j;
                z7 = viewState.l;
                j3 = 28;
                homePageErrorState = viewState.c;
                z3 = viewState.g;
                deliveryNowData = viewState.f;
            } else {
                j2 = 0;
                j3 = 28;
                homePageErrorState = null;
                deliveryNowData = null;
                z6 = false;
                z7 = false;
                z3 = false;
                z8 = false;
            }
            if (j5 != 0) {
                j |= z7 ? 64L : 32L;
            }
            z4 = !z6;
            int i = z7 ? 0 : 8;
            boolean z9 = !z3;
            if (deliveryNowData != null) {
                DeliveryNowBottomBanner deliveryNowBottomBanner2 = deliveryNowData.b;
                ?? r13 = deliveryNowData.f7236a;
                deliveryNowBottomBanner = deliveryNowBottomBanner2;
                homePageErrorState2 = r13;
            } else {
                deliveryNowBottomBanner = null;
            }
            i = homePageErrorState2 == HomePageContract.DeliveryNowViewState.f ? 1 : 0;
            if ((j & j3) != j2) {
                j |= i != 0 ? 1280L : 640L;
            }
            float dimension2 = i != 0 ? this.I.getResources().getDimension(R.dimen.homepage_delivery_now_padding_height) : BitmapDescriptorFactory.HUE_RED;
            long j6 = j;
            HomePageErrorState homePageErrorState3 = homePageErrorState;
            z2 = z6;
            dimension = i != 0 ? this.F.getResources().getDimension(R.dimen.homepage_delivery_now_padding_height) : BitmapDescriptorFactory.HUE_RED;
            f = dimension2;
            homePageErrorState2 = homePageErrorState3;
            int i2 = i;
            i = i;
            r5 = i2;
            z = z8;
            z5 = z9;
            j4 = j6;
        } else {
            j2 = 0;
            j3 = 28;
            j4 = j;
            function0Impl = null;
            deliveryNowBottomBanner = null;
            function0Impl1 = null;
            z = false;
            r5 = 0;
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            dimension = BitmapDescriptorFactory.HUE_RED;
            f = BitmapDescriptorFactory.HUE_RED;
        }
        if ((j4 & j3) != j2) {
            this.y.h.setVisibility(i);
            this.y.M(homePageErrorState2);
            BindingAdaptersKt.o(this.A, r5);
            DeliveryNowBannerView view = this.A;
            Intrinsics.h(view, "view");
            view.setData(deliveryNowBottomBanner);
            view.setOnBannerClicked(function0Impl1);
            view.setOnCloseClicked(function0Impl);
            this.C.h.setVisibility(i);
            this.C.M(homePageErrorState2);
            ViewBindingAdapter.c(this.I, f);
            BindingAdaptersKt.o(this.I, z3);
            BindingAdaptersKt.o(this.D, z2);
            this.F.setEnabled(z4);
            BindingAdaptersKt.o(this.F, z5);
            this.F.setRefreshing(z);
            ViewBindingAdapter.c(this.F, dimension);
        }
        if ((j4 & 24) != j2) {
            this.y.L(homePageViewModel);
            this.C.L(homePageViewModel);
        }
        if ((j4 & 16) != j2) {
            this.F.setOnRefreshListener(this.J);
        }
        this.C.k();
        this.y.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.M != 0) {
                    return true;
                }
                return this.C.p() || this.y.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.M = 16L;
        }
        this.C.r();
        this.y.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.M |= 1;
            }
            return true;
        }
        if (i == 1) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.M |= 2;
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
            this.M |= 4;
        }
        return true;
    }
}
