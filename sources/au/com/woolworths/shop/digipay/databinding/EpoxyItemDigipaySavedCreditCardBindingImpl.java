package au.com.woolworths.shop.digipay.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.digipay.creditcard.CreditCardEventHandler;
import au.com.woolworths.shop.digipay.generated.callback.OnClickListener;
import au.com.woolworths.shop.digipay.models.PaymentInfo;
import au.com.woolworths.shop.digipay.models.SavedCreditCard;
import au.com.woolworths.views.CheckableConstraintLayout;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class EpoxyItemDigipaySavedCreditCardBindingImpl extends EpoxyItemDigipaySavedCreditCardBinding implements OnClickListener.Listener {
    public static final SparseIntArray P;
    public final Group L;
    public final OnClickListener M;
    public final OnClickListener N;
    public long O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(R.id.start_barrier, 12);
        sparseIntArray.put(R.id.end_barrier, 13);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemDigipaySavedCreditCardBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 14, null, P);
        ImageView imageView = (ImageView) objArrT[2];
        TextView textView = (TextView) objArrT[4];
        CheckableConstraintLayout checkableConstraintLayout = (CheckableConstraintLayout) objArrT[1];
        FrameLayout frameLayout = (FrameLayout) objArrT[6];
        TextView textView2 = (TextView) objArrT[5];
        TextView textView3 = (TextView) objArrT[7];
        TextView textView4 = (TextView) objArrT[8];
        Button button = (Button) objArrT[10];
        super(dataBindingComponent, view, imageView, textView, checkableConstraintLayout, frameLayout, textView2, textView3, textView4, button, (ImageView) objArrT[11], (View) objArrT[3]);
        this.O = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        Group group = (Group) objArrT[9];
        this.L = group;
        group.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        E(view);
        this.M = new OnClickListener(this, 2);
        this.N = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (35 == i) {
            this.J = (CreditCardEventHandler) obj;
            synchronized (this) {
                this.O |= 1;
            }
            h(35);
            y();
            return true;
        }
        if (53 == i) {
            this.I = (SavedCreditCard) obj;
            synchronized (this) {
                this.O |= 2;
            }
            h(53);
            y();
            return true;
        }
        if (197 != i) {
            return false;
        }
        this.K = (PaymentInfo) obj;
        synchronized (this) {
            this.O |= 4;
        }
        h(197);
        y();
        return true;
    }

    @Override // au.com.woolworths.shop.digipay.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        if (i == 1) {
            CreditCardEventHandler creditCardEventHandler = this.J;
            SavedCreditCard savedCreditCard = this.I;
            if (creditCardEventHandler != null) {
                creditCardEventHandler.k6(savedCreditCard);
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        CreditCardEventHandler creditCardEventHandler2 = this.J;
        SavedCreditCard savedCreditCard2 = this.I;
        if (creditCardEventHandler2 != null) {
            creditCardEventHandler2.J0(savedCreditCard2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.digipay.databinding.EpoxyItemDigipaySavedCreditCardBindingImpl.j():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.O != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.O = 8L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
