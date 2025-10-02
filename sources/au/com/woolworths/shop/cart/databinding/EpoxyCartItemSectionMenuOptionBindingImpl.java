package au.com.woolworths.shop.cart.databinding;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.shop.cart.generated.callback.OnClickListener;
import au.com.woolworths.shop.cart.ui.CartSectionOptionsListener;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;

/* loaded from: classes4.dex */
public class EpoxyCartItemSectionMenuOptionBindingImpl extends EpoxyCartItemSectionMenuOptionBinding implements OnClickListener.Listener {
    public final ConstraintLayout F;
    public final OnClickListener G;
    public long H;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyCartItemSectionMenuOptionBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, null);
        super(view, (ImageView) objArrT[1], (TextView) objArrT[2], dataBindingComponent);
        this.H = -1L;
        this.y.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.F = constraintLayout;
        constraintLayout.setTag(null);
        this.z.setTag(null);
        E(view);
        this.G = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (224 == i) {
            this.C = (String) obj;
            synchronized (this) {
                this.H |= 1;
            }
            h(BERTags.FLAGS);
            y();
            return true;
        }
        if (103 == i) {
            this.A = (Integer) obj;
            synchronized (this) {
                this.H |= 2;
            }
            h(103);
            y();
            return true;
        }
        if (186 == i) {
            this.B = (Text) obj;
            synchronized (this) {
                this.H |= 4;
            }
            h(186);
            y();
            return true;
        }
        if (157 == i) {
            this.E = (CartSectionOptionsListener) obj;
            synchronized (this) {
                this.H |= 8;
            }
            h(157);
            y();
            return true;
        }
        if (133 != i) {
            return false;
        }
        this.D = (Boolean) obj;
        synchronized (this) {
            this.H |= 16;
        }
        h(133);
        y();
        return true;
    }

    @Override // au.com.woolworths.shop.cart.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        String str = this.C;
        CartSectionOptionsListener cartSectionOptionsListener = this.E;
        Boolean bool = this.D;
        if (cartSectionOptionsListener != null) {
            cartSectionOptionsListener.b5(str, bool.booleanValue());
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        Drawable drawable;
        synchronized (this) {
            j = this.H;
            this.H = 0L;
        }
        Integer num = this.A;
        Text text = this.B;
        long j2 = 34 & j;
        CharSequence text2 = null;
        if (j2 != 0) {
            drawable = this.h.getContext().getDrawable(ViewDataBinding.z(num));
        } else {
            drawable = null;
        }
        long j3 = 36 & j;
        if (j3 != 0 && text != null) {
            text2 = text.getText(this.h.getContext());
        }
        if (j2 != 0) {
            ImageView view = this.y;
            Intrinsics.h(view, "view");
            view.setImageDrawable(drawable);
        }
        if ((j & 32) != 0) {
            this.F.setOnClickListener(this.G);
        }
        if (j3 != 0) {
            TextViewBindingAdapter.b(this.z, text2);
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
            this.H = 32L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
