package au.com.woolworths.shop.lists.databinding;

import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonBindingKt;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonClickHandler;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.BoostAllBannerState;

/* loaded from: classes4.dex */
public class IncludeBoostAllBannerBindingImpl extends IncludeBoostAllBannerBinding {
    public long E;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (35 == i) {
            M((StatefulButtonClickHandler) obj);
            return true;
        }
        if (18 != i) {
            return false;
        }
        L((BoostAllBannerState) obj);
        return true;
    }

    @Override // au.com.woolworths.shop.lists.databinding.IncludeBoostAllBannerBinding
    public final void L(BoostAllBannerState boostAllBannerState) throws Throwable {
        this.D = boostAllBannerState;
        synchronized (this) {
            this.E |= 2;
        }
        h(18);
        y();
    }

    @Override // au.com.woolworths.shop.lists.databinding.IncludeBoostAllBannerBinding
    public final void M(StatefulButtonClickHandler statefulButtonClickHandler) throws Throwable {
        this.C = statefulButtonClickHandler;
        synchronized (this) {
            this.E |= 1;
        }
        h(35);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        long j2;
        boolean z;
        boolean z2;
        CharSequence text;
        String string;
        StatefulButtonState statefulButtonState;
        boolean z3;
        Text text2;
        Text text3;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        StatefulButtonClickHandler statefulButtonClickHandler = this.C;
        BoostAllBannerState boostAllBannerState = this.D;
        long j3 = j & 6;
        if (j3 != 0) {
            if (boostAllBannerState != null) {
                statefulButtonState = boostAllBannerState.e;
                z2 = boostAllBannerState.d;
                z3 = boostAllBannerState.f12374a && !z2;
                j2 = 0;
                text2 = boostAllBannerState.b;
                text3 = boostAllBannerState.c;
            } else {
                j2 = 0;
                z2 = false;
                z3 = false;
                text2 = null;
                text3 = null;
                statefulButtonState = null;
            }
            z = statefulButtonState == null;
            z = !z3;
            if (j3 != 0) {
                j |= z ? 16L : 8L;
            }
            text = text2 != null ? text2.getText(this.h.getContext()) : null;
            CharSequence text4 = text3 != null ? text3.getText(this.h.getContext()) : null;
            string = text4 != null ? text4.toString() : null;
        } else {
            j2 = 0;
            z = false;
            z2 = false;
            text = null;
            string = null;
            statefulButtonState = null;
        }
        long j4 = 6 & j;
        StatefulButtonState statefulButtonState2 = j4 != j2 ? z ? StatefulButtonState.d : statefulButtonState : null;
        if (j4 != j2) {
            BindingAdaptersKt.o(this.y, z2);
            this.A.setStatefulButtonState(statefulButtonState2);
            BindingAdaptersKt.j(this.A, z);
            StatefulButtonBindingKt.a(this.A, string);
            TextViewBindingAdapter.b(this.B, text);
        }
        if ((j & 5) != j2) {
            this.A.setClickHandler(statefulButtonClickHandler);
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
