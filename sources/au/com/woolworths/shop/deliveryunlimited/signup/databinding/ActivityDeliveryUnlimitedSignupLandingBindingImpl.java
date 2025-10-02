package au.com.woolworths.shop.deliveryunlimited.signup.databinding;

import android.graphics.drawable.ColorDrawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeBrandLabelBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeDownloadableAssetBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.android.onesite.utils.ScrimUtil;
import au.com.woolworths.base.shopapp.databinding.EpoxyItemButtonBinding;
import au.com.woolworths.base.shopapp.modules.badge.BadgeApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSignUpFooter;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSignUpSummary;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribe;
import au.com.woolworths.shop.deliveryunlimited.signup.landing.DeliveryUnlimitedSignUpErrorState;
import au.com.woolworths.shop.deliveryunlimited.signup.landing.DeliveryUnlimitedSignUpLandingContract;
import au.com.woolworths.shop.deliveryunlimited.signup.landing.DeliveryUnlimitedSignUpLandingViewModel;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.woolworths.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class ActivityDeliveryUnlimitedSignupLandingBindingImpl extends ActivityDeliveryUnlimitedSignupLandingBinding {
    public static final ViewDataBinding.IncludedLayouts R;
    public static final SparseIntArray S;
    public final IncludeDownloadableAssetBinding N;
    public final ContentLoadingProgressBar O;
    public final Group P;
    public long Q;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(19);
        R = includedLayouts;
        includedLayouts.a(1, new int[]{14}, new int[]{R.layout.include_generic_error_state}, new String[]{"include_generic_error_state"});
        includedLayouts.a(2, new int[]{12}, new int[]{R.layout.include_downloadable_asset}, new String[]{"include_downloadable_asset"});
        includedLayouts.a(4, new int[]{13}, new int[]{R.layout.include_brand_label}, new String[]{"include_brand_label"});
        includedLayouts.a(10, new int[]{15}, new int[]{R.layout.epoxy_item_button}, new String[]{"epoxy_item_button"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        S = sparseIntArray;
        sparseIntArray.put(R.id.app_bar, 16);
        sparseIntArray.put(R.id.collapsing_toolbar, 17);
        sparseIntArray.put(R.id.toolbar, 18);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityDeliveryUnlimitedSignupLandingBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 19, R, S);
        super(dataBindingComponent, view, (AppBarLayout) objArrT[16], (CollapsingToolbarLayout) objArrT[17], (CoordinatorLayout) objArrT[1], (ConstraintLayout) objArrT[2], (TextView) objArrT[11], (IncludeGenericErrorStateBinding) objArrT[14], (ConstraintLayout) objArrT[10], (IncludeBrandLabelBinding) objArrT[13], (View) objArrT[3], (EpoxyRecyclerView) objArrT[6], (View) objArrT[9], (Toolbar) objArrT[18], (TextView) objArrT[5], (EpoxyItemButtonBinding) objArrT[15]);
        this.Q = -1L;
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        IncludeGenericErrorStateBinding includeGenericErrorStateBinding = this.D;
        if (includeGenericErrorStateBinding != null) {
            includeGenericErrorStateBinding.n = this;
        }
        this.E.setTag(null);
        IncludeBrandLabelBinding includeBrandLabelBinding = this.F;
        if (includeBrandLabelBinding != null) {
            includeBrandLabelBinding.n = this;
        }
        this.G.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        IncludeDownloadableAssetBinding includeDownloadableAssetBinding = (IncludeDownloadableAssetBinding) objArrT[12];
        this.N = includeDownloadableAssetBinding;
        if (includeDownloadableAssetBinding != null) {
            includeDownloadableAssetBinding.n = this;
        }
        ((ConstraintLayout) objArrT[4]).setTag(null);
        ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) objArrT[7];
        this.O = contentLoadingProgressBar;
        contentLoadingProgressBar.setTag(null);
        Group group = (Group) objArrT[8];
        this.P = group;
        group.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.K.setTag(null);
        EpoxyItemButtonBinding epoxyItemButtonBinding = this.L;
        if (epoxyItemButtonBinding != null) {
            epoxyItemButtonBinding.n = this;
        }
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.N.D(lifecycleOwner);
        this.F.D(lifecycleOwner);
        this.D.D(lifecycleOwner);
        this.L.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((DeliveryUnlimitedSignUpLandingViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.shop.deliveryunlimited.signup.databinding.ActivityDeliveryUnlimitedSignupLandingBinding
    public final void L(DeliveryUnlimitedSignUpLandingViewModel deliveryUnlimitedSignUpLandingViewModel) throws Throwable {
        this.M = deliveryUnlimitedSignUpLandingViewModel;
        synchronized (this) {
            this.Q |= 16;
        }
        h(273);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        long j2;
        boolean z;
        boolean z2;
        ButtonApiData buttonApiData;
        String str;
        DeliveryUnlimitedSignUpErrorState deliveryUnlimitedSignUpErrorState;
        BadgeApiData badgeApiData;
        DownloadableAsset downloadableAsset;
        String str2;
        boolean z3;
        DeliveryUnlimitedSignUpErrorState deliveryUnlimitedSignUpErrorState2;
        DeliveryUnlimitedSubscribe deliveryUnlimitedSubscribe;
        BadgeApiData badge;
        DeliveryUnlimitedSignUpFooter footer;
        DownloadableAsset bannerAsset;
        String title;
        ButtonApiData button;
        synchronized (this) {
            j = this.Q;
            this.Q = 0L;
        }
        DeliveryUnlimitedSignUpLandingViewModel deliveryUnlimitedSignUpLandingViewModel = this.M;
        long j3 = 49 & j;
        String disclaimer = null;
        if (j3 != 0) {
            MutableLiveData mutableLiveData = deliveryUnlimitedSignUpLandingViewModel != null ? deliveryUnlimitedSignUpLandingViewModel.i : null;
            I(0, mutableLiveData);
            DeliveryUnlimitedSignUpLandingContract.ViewState viewState = mutableLiveData != null ? (DeliveryUnlimitedSignUpLandingContract.ViewState) mutableLiveData.e() : null;
            if (viewState != null) {
                z2 = viewState.f10878a;
                deliveryUnlimitedSignUpErrorState2 = viewState.c;
                deliveryUnlimitedSubscribe = viewState.b;
            } else {
                z2 = false;
                deliveryUnlimitedSignUpErrorState2 = null;
                deliveryUnlimitedSubscribe = null;
            }
            Intrinsics.h(viewState, "<this>");
            z = !viewState.f10878a && viewState.c == null;
            boolean z4 = deliveryUnlimitedSignUpErrorState2 != null;
            DeliveryUnlimitedSignUpSummary summary = deliveryUnlimitedSubscribe != null ? deliveryUnlimitedSubscribe.getSummary() : null;
            if (summary != null) {
                footer = summary.getFooter();
                bannerAsset = summary.getBannerAsset();
                title = summary.getTitle();
                badge = summary.getBadge();
            } else {
                badge = null;
                footer = null;
                bannerAsset = null;
                title = null;
            }
            if (footer != null) {
                disclaimer = footer.getDisclaimer();
                button = footer.getButton();
            } else {
                button = null;
            }
            String str3 = disclaimer;
            z3 = badge != null;
            z = z4;
            badgeApiData = badge;
            deliveryUnlimitedSignUpErrorState = deliveryUnlimitedSignUpErrorState2;
            str = str3;
            downloadableAsset = bannerAsset;
            buttonApiData = button;
            str2 = title;
            j2 = 0;
        } else {
            j2 = 0;
            z = false;
            z2 = false;
            buttonApiData = null;
            str = null;
            deliveryUnlimitedSignUpErrorState = null;
            badgeApiData = null;
            downloadableAsset = null;
            str2 = null;
            z3 = false;
        }
        if (j3 != 0) {
            TextViewBindingAdapter.b(this.C, str);
            this.D.M(deliveryUnlimitedSignUpErrorState);
            BindingAdaptersKt.o(this.D.h, z);
            this.F.L(badgeApiData);
            BindingAdaptersKt.o(this.F.h, z3);
            this.N.L(downloadableAsset);
            BindingAdaptersKt.o(this.O, z2);
            BindingAdaptersKt.p(this.P, z);
            BindingAdaptersKt.o(this.H, z);
            TextViewBindingAdapter.b(this.K, str2);
            this.L.L(buttonApiData);
            if (ViewDataBinding.s >= 4) {
                this.K.setContentDescription(str2);
            }
        }
        if ((48 & j) != j2) {
            this.D.L(deliveryUnlimitedSignUpLandingViewModel);
            this.L.M(deliveryUnlimitedSignUpLandingViewModel);
        }
        if ((j & 32) != j2) {
            View view = this.G;
            ScrimUtil.a(view, 48, new ColorDrawable(ViewDataBinding.n(R.color.delivery_unlimited_toolbar_gradient_color, view)));
            View view2 = this.I;
            ScrimUtil.a(view2, 80, new ColorDrawable(ViewDataBinding.n(R.color.color_scrim_shadow, view2)));
        }
        this.N.k();
        this.F.k();
        this.D.k();
        this.L.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.Q != 0) {
                    return true;
                }
                return this.N.p() || this.F.p() || this.D.p() || this.L.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.Q = 32L;
        }
        this.N.r();
        this.F.r();
        this.D.r();
        this.L.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.Q |= 1;
            }
            return true;
        }
        if (i == 1) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.Q |= 2;
            }
            return true;
        }
        if (i == 2) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.Q |= 4;
            }
            return true;
        }
        if (i != 3) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.Q |= 8;
        }
        return true;
    }
}
