package au.com.woolworths.shop.addtolist.databinding;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.addtolist.generated.callback.OnClickListener;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class ItemColorSwatchBindingImpl extends ItemColorSwatchBinding implements OnClickListener.Listener {
    public final OnClickListener F;
    public long G;

    /* JADX WARN: Illegal instructions before constructor call */
    public ItemColorSwatchBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, null);
        super(dataBindingComponent, view, (ConstraintLayout) objArrT[0], (ImageView) objArrT[1], (ImageView) objArrT[2]);
        this.G = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        E(view);
        this.F = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (139 == i) {
            N(((Boolean) obj).booleanValue());
            return true;
        }
        if (184 == i) {
            O((Function1) obj);
            return true;
        }
        if (44 == i) {
            M((String) obj);
            return true;
        }
        if (43 != i) {
            return false;
        }
        L(((Integer) obj).intValue());
        return true;
    }

    @Override // au.com.woolworths.shop.addtolist.databinding.ItemColorSwatchBinding
    public final void L(int i) throws Throwable {
        this.C = i;
        synchronized (this) {
            this.G |= 8;
        }
        h(43);
        y();
    }

    @Override // au.com.woolworths.shop.addtolist.databinding.ItemColorSwatchBinding
    public final void M(String str) throws Throwable {
        this.E = str;
        synchronized (this) {
            this.G |= 4;
        }
        h(44);
        y();
    }

    @Override // au.com.woolworths.shop.addtolist.databinding.ItemColorSwatchBinding
    public final void N(boolean z) throws Throwable {
        this.D = z;
        synchronized (this) {
            this.G |= 1;
        }
        h(139);
        y();
    }

    @Override // au.com.woolworths.shop.addtolist.databinding.ItemColorSwatchBinding
    public final void O(Function1 function1) throws Throwable {
        this.B = function1;
        synchronized (this) {
            this.G |= 2;
        }
        h(184);
        y();
    }

    @Override // au.com.woolworths.shop.addtolist.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        Function1 function1 = this.B;
        int i2 = this.C;
        if (function1 != null) {
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.G;
            this.G = 0L;
        }
        boolean z = this.D;
        String str = this.E;
        int i = this.C;
        long j2 = 17 & j;
        long j3 = 24 & j;
        if ((20 & j) != 0 && ViewDataBinding.s >= 4) {
            this.y.setContentDescription(str);
        }
        if ((j & 16) != 0) {
            this.y.setOnClickListener(this.F);
        }
        if (j3 != 0 && ViewDataBinding.s >= 21) {
            this.z.setBackgroundTintList(ColorStateList.valueOf(i));
        }
        if (j2 != 0) {
            final ImageView view = this.A;
            Intrinsics.h(view, "view");
            if (view.getTag() == null) {
                view.setTag(Boolean.TRUE);
                view.setVisibility(z ? 0 : 8);
                return;
            }
            view.animate().cancel();
            if (z && view.getVisibility() != 0) {
                view.setVisibility(0);
                view.setAlpha(BitmapDescriptorFactory.HUE_RED);
                view.animate().alpha(1.0f).setListener(new AnimatorListenerAdapter() { // from class: au.com.woolworths.shop.addtolist.utils.BindingAdaptersKt$visibleAnimated$1$1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animation) {
                        Intrinsics.h(animation, "animation");
                        view.setAlpha(1.0f);
                    }
                });
            } else {
                if (z || view.getVisibility() != 0) {
                    return;
                }
                view.animate().alpha(BitmapDescriptorFactory.HUE_RED).setListener(new AnimatorListenerAdapter() { // from class: au.com.woolworths.shop.addtolist.utils.BindingAdaptersKt$visibleAnimated$1$2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animation) {
                        Intrinsics.h(animation, "animation");
                        View view2 = view;
                        view2.setAlpha(1.0f);
                        view2.setVisibility(8);
                    }
                });
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.G = 16L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
