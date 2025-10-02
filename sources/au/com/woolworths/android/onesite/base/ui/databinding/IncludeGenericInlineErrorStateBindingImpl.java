package au.com.woolworths.android.onesite.base.ui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.generated.callback.OnClickListener;
import au.com.woolworths.android.onesite.modules.common.InlineErrorCause;
import au.com.woolworths.android.onesite.modules.common.InlineErrorStateClickHandler;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class IncludeGenericInlineErrorStateBindingImpl extends IncludeGenericInlineErrorStateBinding implements OnClickListener.Listener {
    public static final SparseIntArray I;
    public final ConstraintLayout F;
    public final OnClickListener G;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(R.id.guideline, 6);
        sparseIntArray.put(R.id.icon_barrier, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IncludeGenericInlineErrorStateBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 8, null, I);
        View view2 = (View) objArrT[5];
        Button button = (Button) objArrT[4];
        super(dataBindingComponent, view, view2, button, (ImageView) objArrT[2], (ImageView) objArrT[1], (TextView) objArrT[3]);
        this.H = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.F = constraintLayout;
        constraintLayout.setTag(null);
        E(view);
        this.G = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (36 == i) {
            L((InlineErrorStateClickHandler) obj);
            return true;
        }
        if (76 != i) {
            return false;
        }
        M((InlineErrorCause) obj);
        return true;
    }

    @Override // au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericInlineErrorStateBinding
    public final void L(InlineErrorStateClickHandler inlineErrorStateClickHandler) throws Throwable {
        this.E = inlineErrorStateClickHandler;
        synchronized (this) {
            this.H |= 1;
        }
        h(36);
        y();
    }

    @Override // au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericInlineErrorStateBinding
    public final void M(InlineErrorCause inlineErrorCause) throws Throwable {
        this.D = inlineErrorCause;
        synchronized (this) {
            this.H |= 2;
        }
        h(76);
        y();
    }

    @Override // au.com.woolworths.android.onesite.base.ui.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        InlineErrorStateClickHandler inlineErrorStateClickHandler = this.E;
        if (inlineErrorStateClickHandler != null) {
            inlineErrorStateClickHandler.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericInlineErrorStateBindingImpl.j():void");
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
            this.H = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
