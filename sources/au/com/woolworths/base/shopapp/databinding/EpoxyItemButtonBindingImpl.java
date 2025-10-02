package au.com.woolworths.base.shopapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.navigation.ui.a;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiDataExtKt;
import au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler;
import au.com.woolworths.base.shopapp.modules.button.ButtonStyleApiData;
import com.woolworths.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class EpoxyItemButtonBindingImpl extends EpoxyItemButtonBinding {
    public long B;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (92 == i) {
            M((ButtonClickHandler) obj);
            return true;
        }
        if (53 != i) {
            return false;
        }
        L((ButtonApiData) obj);
        return true;
    }

    @Override // au.com.woolworths.base.shopapp.databinding.EpoxyItemButtonBinding
    public final void L(ButtonApiData buttonApiData) throws Throwable {
        this.z = buttonApiData;
        synchronized (this) {
            this.B |= 2;
        }
        h(53);
        y();
    }

    @Override // au.com.woolworths.base.shopapp.databinding.EpoxyItemButtonBinding
    public final void M(ButtonClickHandler buttonClickHandler) throws Throwable {
        this.A = buttonClickHandler;
        synchronized (this) {
            this.B |= 1;
        }
        h(92);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        ViewDataBinding viewDataBinding;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        ButtonClickHandler buttonClickHandler = this.A;
        ButtonApiData buttonApiData = this.z;
        if ((j & 7) != 0) {
            FrameLayout container = this.y;
            Intrinsics.h(container, "container");
            if (buttonApiData == null) {
                return;
            }
            container.removeAllViews();
            ButtonStyleApiData style = buttonApiData.getStyle();
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(container.getContext());
            int i = style == null ? -1 : ButtonApiDataExtKt.WhenMappings.f4621a[style.ordinal()];
            if (i == 1) {
                DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
                viewDataBinding = (ButtonPrimaryBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.button_primary, container, false, null);
                Intrinsics.g(viewDataBinding, "inflate(...)");
            } else if (i == 2) {
                DataBinderMapperImpl dataBinderMapperImpl2 = DataBindingUtil.f2545a;
                viewDataBinding = (ButtonSecondaryBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.button_secondary, container, false, null);
                Intrinsics.g(viewDataBinding, "inflate(...)");
            } else if (i == 3) {
                DataBinderMapperImpl dataBinderMapperImpl3 = DataBindingUtil.f2545a;
                viewDataBinding = (ButtonTertiaryBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.button_tertiary, container, false, null);
                Intrinsics.g(viewDataBinding, "inflate(...)");
            } else if (i != 4) {
                DataBinderMapperImpl dataBinderMapperImpl4 = DataBindingUtil.f2545a;
                viewDataBinding = (ButtonPrimaryBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.button_primary, container, false, null);
                Intrinsics.g(viewDataBinding, "inflate(...)");
            } else {
                DataBinderMapperImpl dataBinderMapperImpl5 = DataBindingUtil.f2545a;
                viewDataBinding = (ButtonDestructiveBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.button_destructive, container, false, null);
                Intrinsics.g(viewDataBinding, "inflate(...)");
            }
            View view = viewDataBinding.h;
            Button button = view instanceof Button ? (Button) view : null;
            if (button == null) {
                throw new IllegalStateException("Root of view hierarchy should be `Button`");
            }
            button.setEnabled(buttonApiData.getEnabled());
            button.setOnClickListener(new a(6, buttonClickHandler, buttonApiData));
            button.setText(buttonApiData.getLabel());
            button.setDuplicateParentStateEnabled(true);
            container.addView(view);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.B != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.B = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
