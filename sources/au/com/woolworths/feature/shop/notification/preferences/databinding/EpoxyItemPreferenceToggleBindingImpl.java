package au.com.woolworths.feature.shop.notification.preferences.databinding;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.CompoundButtonBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.shop.notification.preferences.details.ShopPreferenceDetailsClickHandler;
import au.com.woolworths.feature.shop.notification.preferences.generated.callback.OnClickListener;
import au.com.woolworths.feature.shop.notification.preferences.models.PreferenceToggleData;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.woolworths.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class EpoxyItemPreferenceToggleBindingImpl extends EpoxyItemPreferenceToggleBinding implements OnClickListener.Listener {
    public final OnClickListener G;
    public long H;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemPreferenceToggleBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 5, null, null);
        super(dataBindingComponent, view, (TextView) objArrT[4], (ConstraintLayout) objArrT[0], (SwitchMaterial) objArrT[3], (TextView) objArrT[2], (TextView) objArrT[1]);
        this.H = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        E(view);
        this.G = new OnClickListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (141 == i) {
            this.F = (Boolean) obj;
            synchronized (this) {
                this.H |= 1;
            }
            h(141);
            y();
            return true;
        }
        if (35 == i) {
            this.E = (ShopPreferenceDetailsClickHandler) obj;
            synchronized (this) {
                this.H |= 2;
            }
            h(35);
            y();
            return true;
        }
        if (53 != i) {
            return false;
        }
        this.D = (PreferenceToggleData) obj;
        synchronized (this) {
            this.H |= 4;
        }
        h(53);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() throws Resources.NotFoundException {
        long j;
        boolean z;
        boolean z2;
        long j2;
        long j3;
        long j4;
        long j5;
        boolean z3;
        boolean z4;
        boolean z5;
        String str;
        String str2;
        String str3;
        String str4;
        boolean value;
        boolean value2;
        String footer;
        String subtitle;
        String altText;
        synchronized (this) {
            j = this.H;
            this.H = 0L;
        }
        Boolean bool = this.F;
        PreferenceToggleData preferenceToggleData = this.D;
        long j6 = j & 13;
        boolean z6 = false;
        if (j6 != 0) {
            boolean zB = ViewDataBinding.B(bool);
            z2 = !zB;
            if (j6 != 0) {
                j = !zB ? j | 32 : j | 16;
            }
            z = (j & 9) != 0 ? z2 : false;
        } else {
            z = false;
            z2 = false;
        }
        long j7 = j & 12;
        String title = null;
        if (j7 != 0) {
            if (preferenceToggleData != null) {
                title = preferenceToggleData.getTitle();
                value2 = preferenceToggleData.getValue();
                footer = preferenceToggleData.getFooter();
                subtitle = preferenceToggleData.getSubtitle();
                altText = preferenceToggleData.getAltText();
            } else {
                value2 = false;
                footer = null;
                subtitle = null;
                altText = null;
            }
            boolean z7 = title != null;
            boolean z8 = footer != null;
            boolean z9 = subtitle != null;
            z5 = z8;
            j5 = 32;
            str2 = title;
            value = value2;
            str = altText;
            str3 = footer;
            j2 = 0;
            str4 = subtitle;
            j3 = 13;
            z3 = z9;
            z4 = z7;
            j4 = 9;
        } else {
            j2 = 0;
            j3 = 13;
            j4 = 9;
            j5 = 32;
            z3 = false;
            z4 = false;
            z5 = false;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            value = false;
        }
        if ((j & j5) != j2 && preferenceToggleData != null) {
            value = preferenceToggleData.getValue();
        }
        boolean z10 = value;
        long j8 = j & j3;
        if (j8 != j2 && z2) {
            z6 = z10;
        }
        if (j7 != 0) {
            TextViewBindingAdapter.b(this.y, str3);
            BindingAdaptersKt.o(this.y, z5);
            CompoundButtonBindingAdapter.a(this.A, z10);
            TextViewBindingAdapter.b(this.B, str4);
            BindingAdaptersKt.o(this.B, z3);
            TextViewBindingAdapter.b(this.C, str2);
            BindingAdaptersKt.o(this.C, z4);
            if (ViewDataBinding.s >= 4) {
                this.z.setContentDescription(str);
            }
        }
        if ((j & j4) != j2) {
            this.z.setEnabled(z);
            this.A.setEnabled(z);
        }
        if ((j & 8) != j2) {
            this.z.setOnClickListener(this.G);
            ConstraintLayout constraintLayout = this.z;
            final String label = constraintLayout.getResources().getString(R.string.notifications_toggle_a11y_action_announcement);
            Intrinsics.h(label, "label");
            ViewCompat.A(constraintLayout, new AccessibilityDelegateCompat() { // from class: au.com.woolworths.android.onesite.bindings.BindingAdaptersKt$setAccessibilityClickLabel$1
                @Override // androidx.core.view.AccessibilityDelegateCompat
                public final void d(View host, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    Intrinsics.h(host, "host");
                    this.f2466a.onInitializeAccessibilityNodeInfo(host, accessibilityNodeInfoCompat.f2508a);
                    accessibilityNodeInfoCompat.b(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, label));
                }
            });
        }
        if (j8 != j2) {
            this.B.setEnabled(z6);
            this.C.setEnabled(z6);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.H != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.H = 8L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
