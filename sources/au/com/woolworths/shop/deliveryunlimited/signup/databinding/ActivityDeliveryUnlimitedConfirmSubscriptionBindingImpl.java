package au.com.woolworths.shop.deliveryunlimited.signup.databinding;

import android.graphics.drawable.ColorDrawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeHorizontalDividerBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButton;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.android.onesite.utils.ScrimUtil;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.ConfirmSubscriptionContract;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.ConfirmSubscriptionViewModel;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedIconItem;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSignUpFooter;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribePayment;
import au.com.woolworths.shop.deliveryunlimited.signup.landing.DeliveryUnlimitedSignUpErrorState;
import com.woolworths.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class ActivityDeliveryUnlimitedConfirmSubscriptionBindingImpl extends ActivityDeliveryUnlimitedConfirmSubscriptionBinding {
    public static final ViewDataBinding.IncludedLayouts O;
    public static final SparseIntArray P;
    public final Group L;
    public final TextView M;
    public long N;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(19);
        O = includedLayouts;
        includedLayouts.a(0, new int[]{13}, new int[]{R.layout.include_generic_error_state}, new String[]{"include_generic_error_state"});
        includedLayouts.a(4, new int[]{14}, new int[]{R.layout.include_horizontal_divider}, new String[]{"include_horizontal_divider"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(R.id.appbar, 15);
        sparseIntArray.put(R.id.nested_scroll_view, 16);
        sparseIntArray.put(R.id.select_payment_method_title, 17);
        sparseIntArray.put(R.id.credit_card_fragment_container, 18);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityDeliveryUnlimitedConfirmSubscriptionBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 19, O, P);
        TextView textView = (TextView) objArrT[5];
        FrameLayout frameLayout = (FrameLayout) objArrT[18];
        TextView textView2 = (TextView) objArrT[12];
        IncludeHorizontalDividerBinding includeHorizontalDividerBinding = (IncludeHorizontalDividerBinding) objArrT[14];
        IncludeGenericErrorStateBinding includeGenericErrorStateBinding = (IncludeGenericErrorStateBinding) objArrT[13];
        ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) objArrT[3];
        FrameLayout frameLayout2 = (FrameLayout) objArrT[9];
        super(dataBindingComponent, view, textView, frameLayout, textView2, includeHorizontalDividerBinding, includeGenericErrorStateBinding, contentLoadingProgressBar, frameLayout2, (View) objArrT[10], (ImageView) objArrT[7], (ConstraintLayout) objArrT[6], (Toolbar) objArrT[1], (StatefulButton) objArrT[11]);
        this.N = -1L;
        this.y.setTag(null);
        this.A.setTag(null);
        IncludeHorizontalDividerBinding includeHorizontalDividerBinding2 = this.B;
        if (includeHorizontalDividerBinding2 != null) {
            includeHorizontalDividerBinding2.n = this;
        }
        IncludeGenericErrorStateBinding includeGenericErrorStateBinding2 = this.C;
        if (includeGenericErrorStateBinding2 != null) {
            includeGenericErrorStateBinding2.n = this;
        }
        this.D.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        Group group = (Group) objArrT[2];
        this.L = group;
        group.setTag(null);
        ((ConstraintLayout) objArrT[4]).setTag(null);
        TextView textView3 = (TextView) objArrT[8];
        this.M = textView3;
        textView3.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.C.D(lifecycleOwner);
        this.B.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((ConfirmSubscriptionViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.shop.deliveryunlimited.signup.databinding.ActivityDeliveryUnlimitedConfirmSubscriptionBinding
    public final void L(ConfirmSubscriptionViewModel confirmSubscriptionViewModel) throws Throwable {
        this.K = confirmSubscriptionViewModel;
        synchronized (this) {
            this.N |= 8;
        }
        h(273);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        long j2;
        long j3;
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        String str2;
        String str3;
        StatefulButtonState statefulButtonState;
        DeliveryUnlimitedSignUpErrorState deliveryUnlimitedSignUpErrorState;
        String disclaimer;
        String str4;
        boolean z4;
        DeliveryUnlimitedSubscribePayment deliveryUnlimitedSubscribePayment;
        DeliveryUnlimitedSignUpFooter footer;
        String title;
        String description;
        DeliveryUnlimitedIconItem iconItem;
        String label;
        String iconUrl;
        synchronized (this) {
            j = this.N;
            this.N = 0L;
        }
        ConfirmSubscriptionViewModel confirmSubscriptionViewModel = this.K;
        long j4 = 25 & j;
        if (j4 != 0) {
            MutableLiveData mutableLiveData = confirmSubscriptionViewModel != null ? confirmSubscriptionViewModel.j : null;
            I(0, mutableLiveData);
            ConfirmSubscriptionContract.ViewState viewState = mutableLiveData != null ? (ConfirmSubscriptionContract.ViewState) mutableLiveData.e() : null;
            if (viewState != null) {
                z4 = viewState.f10862a;
                statefulButtonState = viewState.b;
                deliveryUnlimitedSignUpErrorState = viewState.d;
                deliveryUnlimitedSubscribePayment = viewState.c;
            } else {
                z4 = false;
                statefulButtonState = null;
                deliveryUnlimitedSignUpErrorState = null;
                deliveryUnlimitedSubscribePayment = null;
            }
            Intrinsics.h(viewState, "<this>");
            z = viewState.b == StatefulButtonState.e;
            z3 = !z4;
            if (deliveryUnlimitedSubscribePayment != null) {
                title = deliveryUnlimitedSubscribePayment.getTitle();
                description = deliveryUnlimitedSubscribePayment.getDescription();
                iconItem = deliveryUnlimitedSubscribePayment.getIconItem();
                footer = deliveryUnlimitedSubscribePayment.getFooter();
            } else {
                footer = null;
                title = null;
                description = null;
                iconItem = null;
            }
            if (iconItem != null) {
                label = iconItem.getLabel();
                iconUrl = iconItem.getIconUrl();
            } else {
                label = null;
                iconUrl = null;
            }
            z = iconItem != null;
            if (footer != null) {
                disclaimer = footer.getDisclaimer();
                boolean z5 = z4;
                z2 = z;
                z = z5;
            } else {
                boolean z6 = z4;
                z2 = z;
                z = z6;
                disclaimer = null;
            }
            str4 = title;
            str2 = description;
            j3 = 0;
            str3 = label;
            j2 = j;
            str = iconUrl;
        } else {
            j2 = j;
            j3 = 0;
            z = false;
            z2 = false;
            z3 = false;
            str = null;
            str2 = null;
            str3 = null;
            statefulButtonState = null;
            deliveryUnlimitedSignUpErrorState = null;
            disclaimer = null;
            str4 = null;
        }
        if (j4 != 0) {
            TextViewBindingAdapter.b(this.y, str2);
            TextViewBindingAdapter.b(this.A, disclaimer);
            this.C.M(deliveryUnlimitedSignUpErrorState);
            BindingAdaptersKt.o(this.D, z);
            BindingAdaptersKt.p(this.L, z3);
            TextViewBindingAdapter.b(this.M, str3);
            BindingAdaptersKt.o(this.E, z);
            ImageView imageView = this.G;
            d.z(imageView, R.drawable.ic_delivery_unlimited_sign_up_tick, imageView, str, null);
            BindingAdaptersKt.o(this.H, z2);
            this.I.setTitle(str4);
            this.J.setStatefulButtonState(statefulButtonState);
        }
        if ((j2 & 24) != j3) {
            this.C.L(confirmSubscriptionViewModel);
            this.J.setClickHandler(confirmSubscriptionViewModel);
        }
        if ((j2 & 16) != j3) {
            View view = this.F;
            ScrimUtil.a(view, 80, new ColorDrawable(ViewDataBinding.n(R.color.color_scrim_shadow, view)));
        }
        this.C.k();
        this.B.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.N != 0) {
                    return true;
                }
                return this.C.p() || this.B.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.N = 16L;
        }
        this.C.r();
        this.B.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.N |= 1;
            }
            return true;
        }
        if (i == 1) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.N |= 2;
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
            this.N |= 4;
        }
        return true;
    }
}
