package au.com.woolworths.rewards.base.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.common.FullPageErrorBindingAdaptersKt;
import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.rewards.base.generated.callback.OnClickListener;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class EpoxyIncludeRewardsGenericErrorStateBindingImpl extends EpoxyIncludeRewardsGenericErrorStateBinding implements OnClickListener.Listener {
    public static final SparseIntArray J;
    public final ConstraintLayout F;
    public final OnClickListener G;
    public final OnClickListener H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(R.id.error_message_left_guideline, 6);
        sparseIntArray.put(R.id.error_message_right_guideline, 7);
        sparseIntArray.put(R.id.error_actions_button_left_guideline, 8);
        sparseIntArray.put(R.id.error_actions_button_right_guideline, 9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyIncludeRewardsGenericErrorStateBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 10, null, J);
        ImageView imageView = (ImageView) objArrT[1];
        super(dataBindingComponent, view, imageView, (TextView) objArrT[3], (Button) objArrT[5], (TextView) objArrT[2], (Button) objArrT[4]);
        this.I = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.F = constraintLayout;
        constraintLayout.setTag(null);
        this.C.setTag(null);
        E(view);
        this.G = new OnClickListener(this, 1);
        this.H = new OnClickListener(this, 2);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (76 == i) {
            M((FullPageErrorCause) obj);
            return true;
        }
        if (36 != i) {
            return false;
        }
        L((FullPageErrorStateClickHandler) obj);
        return true;
    }

    @Override // au.com.woolworths.rewards.base.databinding.EpoxyIncludeRewardsGenericErrorStateBinding
    public final void L(FullPageErrorStateClickHandler fullPageErrorStateClickHandler) throws Throwable {
        this.E = fullPageErrorStateClickHandler;
        synchronized (this) {
            this.I |= 2;
        }
        h(36);
        y();
    }

    @Override // au.com.woolworths.rewards.base.databinding.EpoxyIncludeRewardsGenericErrorStateBinding
    public final void M(FullPageErrorCause fullPageErrorCause) throws Throwable {
        this.D = fullPageErrorCause;
        synchronized (this) {
            this.I |= 1;
        }
        h(76);
        y();
    }

    @Override // au.com.woolworths.rewards.base.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        FullPageErrorStateClickHandler fullPageErrorStateClickHandler;
        if (i != 1) {
            if (i == 2 && (fullPageErrorStateClickHandler = this.E) != null) {
                fullPageErrorStateClickHandler.onSecondaryActionClicked();
                return;
            }
            return;
        }
        FullPageErrorStateClickHandler fullPageErrorStateClickHandler2 = this.E;
        if (fullPageErrorStateClickHandler2 != null) {
            fullPageErrorStateClickHandler2.onPrimaryActionClicked();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        Text d;
        boolean z;
        int i;
        int f;
        CharSequence text;
        Text e;
        int primaryActionRes;
        int g;
        synchronized (this) {
            j = this.I;
            this.I = 0L;
        }
        FullPageErrorCause fullPageErrorCause = this.D;
        long j2 = 5 & j;
        Text text2 = null;
        if (j2 != 0) {
            if (fullPageErrorCause != null) {
                primaryActionRes = fullPageErrorCause.getPrimaryActionRes();
                d = fullPageErrorCause.getD();
                e = fullPageErrorCause.getE();
                f = fullPageErrorCause.getF();
                g = fullPageErrorCause.getG();
            } else {
                d = null;
                e = null;
                primaryActionRes = 0;
                f = 0;
                g = 0;
            }
            text = d != null ? d.getText(this.h.getContext()) : null;
            text2 = e;
            i = primaryActionRes;
            z = g != 0;
        } else {
            d = null;
            z = false;
            i = 0;
            f = 0;
            text = null;
        }
        if (j2 != 0) {
            FullPageErrorBindingAdaptersKt.a(this.y, fullPageErrorCause);
            BindingAdaptersKt.o(this.y, z);
            BindingAdaptersKt.s(this.z, text2);
            BindingAdaptersKt.r(this.A, f);
            BindingAdaptersKt.s(this.B, d);
            BindingAdaptersKt.r(this.C, i);
            if (ViewDataBinding.s >= 4) {
                this.F.setContentDescription(text);
            }
        }
        if ((j & 4) != 0) {
            this.A.setOnClickListener(this.H);
            this.C.setOnClickListener(this.G);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.I != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.I = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
