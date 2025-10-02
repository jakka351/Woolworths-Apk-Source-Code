package au.com.woolworths.shop.digipay.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.CompoundButtonBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeInsetBannerBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.shop.digipay.creditcard.CardCaptureViewEventHandler;
import au.com.woolworths.shop.digipay.creditcard.CreditCardCaptureInlineErrorState;
import au.com.woolworths.shop.digipay.creditcard.CreditCardEventHandler;
import au.com.woolworths.shop.digipay.generated.callback.OnCheckedChangeListener;
import au.com.woolworths.shop.digipay.generated.callback.OnClickListener;
import au.com.woolworths.shop.digipay.models.AddNewCreditCard;
import au.com.woolworths.shop.digipay.models.CreditCardType;
import au.com.woolworths.shop.digipay.models.PaymentInfo;
import com.woolworths.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class EpoxyItemDigipayAddNewCreditCardBindingImpl extends EpoxyItemDigipayAddNewCreditCardBinding implements OnCheckedChangeListener.Listener, OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts T;
    public static final SparseIntArray U;
    public final IncludeDigipayCardCaptureErrorStateBinding P;
    public final OnCheckedChangeListener Q;
    public final OnClickListener R;
    public long S;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(17);
        T = includedLayouts;
        includedLayouts.a(0, new int[]{12, 13}, new int[]{R.layout.include_inset_banner, R.layout.include_digipay_card_capture_error_state}, new String[]{"include_inset_banner", "include_digipay_card_capture_error_state"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        U = sparseIntArray;
        sparseIntArray.put(R.id.payment_label, 14);
        sparseIntArray.put(R.id.card_capture_container, 15);
        sparseIntArray.put(R.id.top_barrier, 16);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemDigipayAddNewCreditCardBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 17, T, U);
        ImageView imageView = (ImageView) objArrT[7];
        FrameLayout frameLayout = (FrameLayout) objArrT[15];
        Button button = (Button) objArrT[4];
        Group group = (Group) objArrT[10];
        IncludeInsetBannerBinding includeInsetBannerBinding = (IncludeInsetBannerBinding) objArrT[12];
        ImageView imageView2 = (ImageView) objArrT[8];
        ImageView imageView3 = (ImageView) objArrT[9];
        ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) objArrT[11];
        ImageView imageView4 = (ImageView) objArrT[6];
        TextView textView = (TextView) objArrT[1];
        TextView textView2 = (TextView) objArrT[2];
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) objArrT[3];
        super(dataBindingComponent, view, imageView, frameLayout, button, group, includeInsetBannerBinding, imageView2, imageView3, contentLoadingProgressBar, imageView4, textView, textView2, appCompatCheckBox, (ImageView) objArrT[5]);
        this.S = -1L;
        this.y.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        IncludeInsetBannerBinding includeInsetBannerBinding2 = this.C;
        if (includeInsetBannerBinding2 != null) {
            includeInsetBannerBinding2.n = this;
        }
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        IncludeDigipayCardCaptureErrorStateBinding includeDigipayCardCaptureErrorStateBinding = (IncludeDigipayCardCaptureErrorStateBinding) objArrT[13];
        this.P = includeDigipayCardCaptureErrorStateBinding;
        if (includeDigipayCardCaptureErrorStateBinding != null) {
            includeDigipayCardCaptureErrorStateBinding.n = this;
        }
        this.H.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        this.K.setTag(null);
        E(view);
        this.Q = new OnCheckedChangeListener(this);
        this.R = new OnClickListener(this, 2);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (53 == i) {
            this.L = (AddNewCreditCard) obj;
            synchronized (this) {
                this.S |= 2;
            }
            h(53);
            y();
            return true;
        }
        if (92 == i) {
            this.M = (CreditCardEventHandler) obj;
            synchronized (this) {
                this.S |= 4;
            }
            h(92);
            y();
            return true;
        }
        if (197 == i) {
            this.O = (PaymentInfo) obj;
            synchronized (this) {
                this.S |= 8;
            }
            h(197);
            y();
            return true;
        }
        if (29 != i) {
            return false;
        }
        this.N = (CardCaptureViewEventHandler) obj;
        synchronized (this) {
            this.S |= 16;
        }
        h(29);
        y();
        return true;
    }

    @Override // au.com.woolworths.shop.digipay.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        CreditCardEventHandler creditCardEventHandler = this.M;
        if (creditCardEventHandler != null) {
            creditCardEventHandler.f6();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        long j2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        CreditCardCaptureInlineErrorState creditCardCaptureInlineErrorState;
        boolean z8;
        boolean zContains;
        int i;
        String str;
        String str2;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        String str3;
        CreditCardCaptureInlineErrorState creditCardCaptureInlineErrorState2;
        List list;
        boolean z14;
        synchronized (this) {
            j = this.S;
            this.S = 0L;
        }
        AddNewCreditCard addNewCreditCard = this.L;
        PaymentInfo paymentInfo = this.O;
        CardCaptureViewEventHandler cardCaptureViewEventHandler = this.N;
        int i2 = ((34 & j) > 0L ? 1 : ((34 & j) == 0L ? 0 : -1));
        if (i2 != 0) {
            if (addNewCreditCard != null) {
                creditCardCaptureInlineErrorState2 = addNewCreditCard.c;
                list = addNewCreditCard.b;
                z8 = addNewCreditCard.e;
                z14 = addNewCreditCard.d;
            } else {
                creditCardCaptureInlineErrorState2 = null;
                list = null;
                z8 = false;
                z14 = false;
            }
            j2 = 0;
            Intrinsics.h(addNewCreditCard, "<this>");
            z = (addNewCreditCard.d || addNewCreditCard.e) ? false : true;
            boolean z15 = creditCardCaptureInlineErrorState2 != null;
            boolean z16 = !z14;
            if (list != null) {
                zContains = list.contains(CreditCardType.j);
                boolean zContains2 = list.contains(CreditCardType.g);
                boolean zContains3 = list.contains(CreditCardType.k);
                boolean zContains4 = list.contains(CreditCardType.i);
                boolean z17 = z;
                boolean zContains5 = list.contains(CreditCardType.h);
                creditCardCaptureInlineErrorState = creditCardCaptureInlineErrorState2;
                z7 = zContains4;
                z6 = zContains3;
                z5 = zContains2;
                z4 = z16;
                z3 = z15;
                z2 = zContains5;
                z = z17;
            } else {
                z4 = z16;
                creditCardCaptureInlineErrorState = creditCardCaptureInlineErrorState2;
                z5 = false;
                z6 = false;
                z7 = false;
                zContains = false;
                z3 = z15;
                z2 = false;
            }
        } else {
            j2 = 0;
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
            z7 = false;
            creditCardCaptureInlineErrorState = null;
            z8 = false;
            zContains = false;
        }
        long j3 = j & 40;
        if (j3 != j2) {
            if (paymentInfo != null) {
                z13 = paymentInfo.f;
                str2 = paymentInfo.d;
                str3 = paymentInfo.e;
            } else {
                z13 = false;
                str2 = null;
                str3 = null;
            }
            z10 = !z13;
            z9 = str3 != null;
            i = i2;
            z11 = z13;
            str = str3;
        } else {
            i = i2;
            str = null;
            str2 = null;
            z9 = false;
            z10 = false;
            z11 = false;
        }
        long j4 = j & 48;
        if (i != 0) {
            z12 = z10;
            BindingAdaptersKt.o(this.y, z6);
            BindingAdaptersKt.j(this.B, z4);
            this.C.L(creditCardCaptureInlineErrorState);
            BindingAdaptersKt.o(this.C.h, z3);
            BindingAdaptersKt.o(this.D, z7);
            BindingAdaptersKt.o(this.E, zContains);
            BindingAdaptersKt.o(this.F, z);
            BindingAdaptersKt.o(this.G, z2);
            BindingAdaptersKt.o(this.P.h, z8);
            BindingAdaptersKt.o(this.K, z5);
        } else {
            z12 = z10;
        }
        if ((j & 32) != j2) {
            this.A.setOnClickListener(this.R);
            this.J.setOnCheckedChangeListener(this.Q);
        }
        if (j4 != j2) {
            this.P.L(cardCaptureViewEventHandler);
        }
        if (j3 != j2) {
            TextViewBindingAdapter.b(this.H, str2);
            TextViewBindingAdapter.b(this.I, str);
            BindingAdaptersKt.o(this.I, z9);
            this.J.setEnabled(z12);
            CompoundButtonBindingAdapter.a(this.J, z11);
        }
        this.C.k();
        this.P.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.S != 0) {
                    return true;
                }
                return this.C.p() || this.P.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.S = 32L;
        }
        this.C.r();
        this.P.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i != 0) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.S |= 1;
        }
        return true;
    }
}
