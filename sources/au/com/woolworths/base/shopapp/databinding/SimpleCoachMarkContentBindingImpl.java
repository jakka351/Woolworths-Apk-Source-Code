package au.com.woolworths.base.shopapp.databinding;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.databinding.adapters.ViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.base.shopapp.customviews.SimpleCoachMarkSettings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class SimpleCoachMarkContentBindingImpl extends SimpleCoachMarkContentBinding {
    public final ConstraintLayout D;
    public long E;

    /* JADX WARN: Illegal instructions before constructor call */
    public SimpleCoachMarkContentBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, null, null);
        super(dataBindingComponent, view, (Button) objArrT[3], (TextView) objArrT[2], (TextView) objArrT[1]);
        this.E = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.D = constraintLayout;
        constraintLayout.setTag(null);
        this.A.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (38 != i) {
            return false;
        }
        L((SimpleCoachMarkSettings) obj);
        return true;
    }

    @Override // au.com.woolworths.base.shopapp.databinding.SimpleCoachMarkContentBinding
    public final void L(SimpleCoachMarkSettings simpleCoachMarkSettings) throws Throwable {
        this.B = simpleCoachMarkSettings;
        synchronized (this) {
            this.E |= 1;
        }
        h(38);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        float dimension;
        CharSequence charSequence;
        Text text;
        CharSequence text2;
        float dimension2;
        ResText resText;
        Text text3;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        SimpleCoachMarkSettings simpleCoachMarkSettings = this.B;
        long j2 = j & 3;
        if (j2 != 0) {
            if (simpleCoachMarkSettings != null) {
                text = simpleCoachMarkSettings.c;
                text3 = simpleCoachMarkSettings.f4615a;
                resText = simpleCoachMarkSettings.b;
            } else {
                resText = null;
                text = null;
                text3 = null;
            }
            boolean z = text != null;
            z = text3 != null;
            if (j2 != 0) {
                j |= z ? 40L : 20L;
            }
            CharSequence text4 = text != null ? text.getText(this.h.getContext()) : null;
            text2 = text3 != null ? text3.getText(this.h.getContext()) : null;
            text = resText != null ? resText.getText(this.h.getContext()) : null;
            Resources resources = this.D.getResources();
            dimension = z ? resources.getDimension(R.dimen.quarter_default_padding) : resources.getDimension(R.dimen.three_quarter_default_padding);
            dimension2 = z ? this.D.getResources().getDimension(R.dimen.default_padding) : this.D.getResources().getDimension(R.dimen.quarter_default_padding);
            CharSequence charSequence2 = text;
            text = text4;
            charSequence = charSequence2;
        } else {
            dimension = BitmapDescriptorFactory.HUE_RED;
            charSequence = null;
            text = null;
            text2 = null;
            dimension2 = 0.0f;
        }
        if ((j & 3) != 0) {
            TextViewBindingAdapter.b(this.y, text);
            BindingAdaptersKt.s(this.y, text);
            TextViewBindingAdapter.b(this.z, charSequence);
            ViewBindingAdapter.c(this.D, dimension);
            ViewBindingAdapter.f(this.D, dimension2);
            TextViewBindingAdapter.b(this.A, text2);
            BindingAdaptersKt.o(this.A, z);
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
            this.E = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
