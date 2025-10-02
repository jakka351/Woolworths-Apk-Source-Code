package au.com.woolworths.feature.rewards.offers.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.databinding.adapters.ViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.rewards.offers.OfferSectionViewItem;
import au.com.woolworths.feature.rewards.offers.RewardsOffersClickListener;
import au.com.woolworths.feature.rewards.offers.generated.callback.OnClickListener;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import org.bouncycastle.asn1.BERTags;

/* loaded from: classes3.dex */
public class EpoxyItemRewardsOfferSectionTitleBindingImpl extends EpoxyItemRewardsOfferSectionTitleBinding implements OnClickListener.Listener {
    public final OnClickListener H;
    public long I;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemRewardsOfferSectionTitleBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, null, null);
        super(dataBindingComponent, view, (Button) objArrT[2], (ProgressBar) objArrT[3], (TextView) objArrT[1]);
        this.I = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.A.setTag(null);
        E(view);
        this.H = new OnClickListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (222 == i) {
            this.B = (OfferSectionViewItem) obj;
            synchronized (this) {
                this.I |= 1;
            }
            h(222);
            y();
            return true;
        }
        if (192 == i) {
            this.G = (Float) obj;
            synchronized (this) {
                this.I |= 2;
            }
            h(BERTags.PRIVATE);
            y();
            return true;
        }
        if (263 == i) {
            this.C = (String) obj;
            synchronized (this) {
                this.I |= 4;
            }
            h(263);
            y();
            return true;
        }
        if (157 == i) {
            this.F = (RewardsOffersClickListener) obj;
            synchronized (this) {
                this.I |= 8;
            }
            h(157);
            y();
            return true;
        }
        if (125 == i) {
            this.E = ((Boolean) obj).booleanValue();
            synchronized (this) {
                this.I |= 16;
            }
            h(125);
            y();
            return true;
        }
        if (52 != i) {
            return false;
        }
        this.D = (String) obj;
        synchronized (this) {
            this.I |= 32;
        }
        h(52);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.rewards.offers.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        OfferSectionViewItem offerSectionViewItem = this.B;
        RewardsOffersClickListener rewardsOffersClickListener = this.F;
        if (rewardsOffersClickListener != null) {
            rewardsOffersClickListener.u2(offerSectionViewItem);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        boolean z;
        boolean z2;
        synchronized (this) {
            j = this.I;
            this.I = 0L;
        }
        Float f = this.G;
        String str = this.C;
        boolean z3 = this.E;
        String str2 = this.D;
        long j2 = j & 66;
        float fFloatValue = BitmapDescriptorFactory.HUE_RED;
        if (j2 != 0 && f != null) {
            fFloatValue = f.floatValue();
        }
        long j3 = j & 112;
        boolean z4 = false;
        if (j3 != 0) {
            z = str2 == null;
            z2 = str2 != null;
            if (j3 != 0) {
                j |= z ? 256L : 128L;
            }
            if ((j & 112) != 0) {
                j |= z2 ? llqqqql.c00630063c0063c0063 : 512L;
            }
        } else {
            z = false;
            z2 = false;
        }
        long j4 = 112 & j;
        if (j4 != 0) {
            boolean z5 = z ? true : z3;
            if (!z2) {
                z3 = false;
            }
            z4 = z5;
        } else {
            z3 = false;
        }
        if ((64 & j) != 0) {
            this.y.setOnClickListener(this.H);
        }
        if ((96 & j) != 0) {
            TextViewBindingAdapter.b(this.y, str2);
            BindingAdaptersKt.t(this.y, str2);
        }
        if (j4 != 0) {
            BindingAdaptersKt.j(this.y, z4);
            BindingAdaptersKt.o(this.z, z3);
        }
        if ((j & 66) != 0) {
            ViewBindingAdapter.c(this.A, fFloatValue);
        }
        if ((j & 68) != 0) {
            TextViewBindingAdapter.b(this.A, str);
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
            this.I = 64L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
