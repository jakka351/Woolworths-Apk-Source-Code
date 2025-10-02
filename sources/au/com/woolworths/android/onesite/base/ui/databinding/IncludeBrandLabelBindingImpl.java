package au.com.woolworths.android.onesite.base.ui.databinding;

import android.content.res.Resources;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabel;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabelKt;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabelType;

/* loaded from: classes3.dex */
public class IncludeBrandLabelBindingImpl extends IncludeBrandLabelBinding {
    public long D;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (127 == i) {
            N((Boolean) obj);
            return true;
        }
        if (21 == i) {
            L((BrandLabel) obj);
            return true;
        }
        if (132 == i) {
            ((Boolean) obj).getClass();
            return true;
        }
        if (123 != i) {
            if (108 != i) {
                return false;
            }
            M((Integer) obj);
            return true;
        }
        this.A = (Boolean) obj;
        synchronized (this) {
            this.D |= 8;
        }
        h(123);
        y();
        return true;
    }

    @Override // au.com.woolworths.android.onesite.base.ui.databinding.IncludeBrandLabelBinding
    public final void L(BrandLabel brandLabel) throws Throwable {
        this.z = brandLabel;
        synchronized (this) {
            this.D |= 2;
        }
        h(21);
        y();
    }

    @Override // au.com.woolworths.android.onesite.base.ui.databinding.IncludeBrandLabelBinding
    public final void M(Integer num) throws Throwable {
        this.C = num;
        synchronized (this) {
            this.D |= 16;
        }
        h(108);
        y();
    }

    @Override // au.com.woolworths.android.onesite.base.ui.databinding.IncludeBrandLabelBinding
    public final void N(Boolean bool) throws Throwable {
        this.B = bool;
        synchronized (this) {
            this.D |= 1;
        }
        h(127);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() throws Resources.NotFoundException {
        long j;
        long j2;
        CharSequence text;
        BrandLabelType type;
        Text text2;
        Text accessibilityText;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        Boolean bool = this.B;
        BrandLabel brandLabel = this.z;
        Boolean bool2 = this.A;
        Integer num = this.C;
        long j3 = 33 & j;
        boolean zB = j3 != 0 ? ViewDataBinding.B(bool) : false;
        long j4 = 34 & j;
        if (j4 != 0) {
            if (brandLabel != null) {
                text2 = brandLabel.getText();
                accessibilityText = brandLabel.getAccessibilityText();
                type = brandLabel.getType();
            } else {
                text2 = null;
                accessibilityText = null;
                type = null;
            }
            j2 = 0;
            text = text2 != null ? text2.getText(this.h.getContext()) : null;
            text = accessibilityText != null ? accessibilityText.getText(this.h.getContext()) : null;
        } else {
            j2 = 0;
            text = null;
            type = null;
        }
        long j5 = 40 & j;
        boolean zB2 = j5 != j2 ? ViewDataBinding.B(bool2) : false;
        long j6 = j & 48;
        int iZ = j6 != j2 ? ViewDataBinding.z(num) : 0;
        if (j5 != j2) {
            this.y.setChecked(zB2);
        }
        if (j3 != 0) {
            this.y.setEnabled(zB);
        }
        if (j4 != 0) {
            BrandLabelKt.b(this.y, brandLabel);
            TextViewBindingAdapter.b(this.y, text);
            BrandLabelKt.a(this.y, type);
            BrandLabelKt.c(this.y, brandLabel);
            if (ViewDataBinding.s >= 4) {
                this.y.setContentDescription(text);
            }
        }
        if (j6 == j2 || ViewDataBinding.s < 16) {
            return;
        }
        this.y.setImportantForAccessibility(iZ);
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
            this.D = 32L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
