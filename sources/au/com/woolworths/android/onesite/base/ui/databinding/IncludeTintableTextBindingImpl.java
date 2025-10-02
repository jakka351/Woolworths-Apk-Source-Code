package au.com.woolworths.android.onesite.base.ui.databinding;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.modules.customviews.tintabletext.TintableTextData;
import au.com.woolworths.android.onesite.modules.customviews.tintabletext.TintableTextDataKt;
import au.com.woolworths.android.onesite.utils.Extensions;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class IncludeTintableTextBindingImpl extends IncludeTintableTextBinding {
    public final View C;
    public long D;

    /* JADX WARN: Illegal instructions before constructor call */
    public IncludeTintableTextBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 5, null, null);
        super(dataBindingComponent, view, (ImageView) objArrT[3], (ImageView) objArrT[2], (TextView) objArrT[4]);
        this.D = -1L;
        ((ConstraintLayout) objArrT[0]).setTag(null);
        View view2 = (View) objArrT[1];
        this.C = view2;
        view2.setTag(null);
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (53 != i) {
            return false;
        }
        L((TintableTextData) obj);
        return true;
    }

    @Override // au.com.woolworths.android.onesite.base.ui.databinding.IncludeTintableTextBinding
    public final void L(TintableTextData tintableTextData) throws Throwable {
        this.B = tintableTextData;
        synchronized (this) {
            this.D |= 1;
        }
        h(53);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String str;
        int i;
        int i2;
        boolean z;
        boolean z2;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        TintableTextData tintableTextData = this.B;
        long j2 = j & 3;
        if (j2 != 0) {
            if (tintableTextData != null) {
                i = tintableTextData.d;
                i2 = tintableTextData.c;
                str = tintableTextData.f4322a;
            } else {
                str = null;
                i = 0;
                i2 = 0;
            }
            z = true;
            z2 = i != 0;
            if (i2 == 0) {
                z = false;
            }
        } else {
            str = null;
            i = 0;
            i2 = 0;
            z = false;
            z2 = false;
        }
        if (j2 != 0) {
            View view = this.C;
            Intrinsics.h(view, "view");
            if (tintableTextData != null) {
                Context context = view.getContext();
                Intrinsics.g(context, "getContext(...)");
                int iA = TintableTextDataKt.a(tintableTextData, context);
                if (iA == 0) {
                    iA = view.getContext().getColor(R.color.transparent);
                }
                view.setBackgroundTintList(ColorStateList.valueOf(iA));
            }
            BindingAdaptersKt.u(this.y, i);
            BindingAdaptersKt.o(this.y, z2);
            ImageView view2 = this.z;
            Intrinsics.h(view2, "view");
            if (i2 != 0) {
                view2.setImageResource(i2);
            } else {
                view2.setImageDrawable(null);
            }
            BindingAdaptersKt.o(this.z, z);
            TextViewBindingAdapter.b(this.A, str);
            TextView view3 = this.A;
            Intrinsics.h(view3, "view");
            if (tintableTextData != null) {
                Context context2 = view3.getContext();
                Intrinsics.g(context2, "getContext(...)");
                int iA2 = TintableTextDataKt.a(tintableTextData, context2);
                if (iA2 == 0) {
                    Context context3 = view3.getContext();
                    Intrinsics.g(context3, "getContext(...)");
                    iA2 = Extensions.a(R.attr.textColorPrimary, context3);
                }
                view3.setTextColor(iA2);
            }
            if (ViewDataBinding.s >= 14) {
                this.A.setAllCaps(false);
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.D = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
