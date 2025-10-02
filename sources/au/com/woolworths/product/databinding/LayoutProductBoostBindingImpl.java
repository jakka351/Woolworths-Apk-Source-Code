package au.com.woolworths.product.databinding;

import android.os.Handler;
import android.os.Looper;
import androidx.camera.core.impl.utils.futures.e;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.modules.customviews.tintabletext.TintableTextData;
import au.com.woolworths.feature.shop.myorders.details.infomodal.a;
import au.com.woolworths.foundation.rewards.offers.ui.RewardsOfferDataExtKt;
import au.com.woolworths.product.models.ProductCard;
import com.airbnb.lottie.LottieAnimationView;
import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import com.woolworths.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class LayoutProductBoostBindingImpl extends LayoutProductBoostBinding {
    public static final ViewDataBinding.IncludedLayouts I;
    public long H;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(4);
        I = includedLayouts;
        includedLayouts.a(0, new int[]{3}, new int[]{R.layout.include_tintable_text}, new String[]{"include_tintable_text"});
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (246 == i) {
            Q(((Boolean) obj).booleanValue());
            return true;
        }
        if (61 == i) {
            M((String) obj);
            return true;
        }
        if (206 == i) {
            return true;
        }
        if (202 == i) {
            N((ProductCard) obj);
            return true;
        }
        if (19 == i) {
            L(((Integer) obj).intValue());
            return true;
        }
        if (237 == i) {
            O(((Boolean) obj).booleanValue());
            return true;
        }
        if (245 != i) {
            return false;
        }
        P(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // au.com.woolworths.product.databinding.LayoutProductBoostBinding
    public final void L(int i) throws Throwable {
        this.G = i;
        synchronized (this) {
            this.H |= 32;
        }
        h(19);
        y();
    }

    @Override // au.com.woolworths.product.databinding.LayoutProductBoostBinding
    public final void M(String str) throws Throwable {
        this.C = str;
        synchronized (this) {
            this.H |= 4;
        }
        h(61);
        y();
    }

    @Override // au.com.woolworths.product.databinding.LayoutProductBoostBinding
    public final void N(ProductCard productCard) throws Throwable {
        this.B = productCard;
        synchronized (this) {
            this.H |= 16;
        }
        h(DatastoreTestTrace.FirestoreV1Action.DATABASE_CONTENTS_BEFORE_ACTION_FIELD_NUMBER);
        y();
    }

    @Override // au.com.woolworths.product.databinding.LayoutProductBoostBinding
    public final void O(boolean z) throws Throwable {
        this.D = z;
        synchronized (this) {
            this.H |= 64;
        }
        h(237);
        y();
    }

    @Override // au.com.woolworths.product.databinding.LayoutProductBoostBinding
    public final void P(boolean z) throws Throwable {
        this.E = z;
        synchronized (this) {
            this.H |= 128;
        }
        h(245);
        y();
    }

    @Override // au.com.woolworths.product.databinding.LayoutProductBoostBinding
    public final void Q(boolean z) throws Throwable {
        this.F = z;
        synchronized (this) {
            this.H |= 2;
        }
        h(246);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.H;
            this.H = 0L;
        }
        boolean z = this.F;
        String str = this.C;
        ProductCard productCard = this.B;
        int i = this.G;
        boolean z2 = this.D;
        boolean z3 = this.E;
        long j2 = 258 & j;
        long j3 = 260 & j;
        long j4 = 272 & j;
        TintableTextData tintableTextDataB = null;
        if (j4 != 0) {
            tintableTextDataB = RewardsOfferDataExtKt.b(productCard != null ? productCard.getRewardsOfferInfo() : null, this.h.getContext());
        }
        long j5 = 288 & j;
        long j6 = 320 & j;
        long j7 = j & 384;
        if (j4 != 0) {
            this.y.L(tintableTextDataB);
        }
        if (j2 != 0) {
            BindingAdaptersKt.o(this.y.h, z);
        }
        if (j6 != 0) {
            LottieAnimationView lottieView = this.z;
            Intrinsics.h(lottieView, "lottieView");
            if (!z2) {
                lottieView.d();
            } else if (!lottieView.k.k()) {
                new Handler(Looper.getMainLooper()).post(new e(25, lottieView, new a(lottieView, 26)));
            }
        }
        if (j5 != 0) {
            this.z.setVisibility(i);
        }
        if (j3 != 0) {
            TextViewBindingAdapter.b(this.A, str);
        }
        if (j7 != 0) {
            BindingAdaptersKt.o(this.A, z3);
        }
        this.y.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.H != 0) {
                    return true;
                }
                return this.y.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.H = 256L;
        }
        this.y.r();
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
            this.H |= 1;
        }
        return true;
    }
}
