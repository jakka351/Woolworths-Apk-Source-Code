package au.com.woolworths.android.onesite.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.generated.callback.OnCheckedChangeListener;
import au.com.woolworths.android.onesite.generated.callback.OnClickListener;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.modules.main.HomepageChips;
import au.com.woolworths.android.onesite.modules.main.MainContract;
import au.com.woolworths.android.onesite.modules.main.MainViewModel;
import au.com.woolworths.base.shopapp.modules.collectionmode.data.CollectionModeLabel;
import com.google.android.material.chip.Chip;
import com.woolworths.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class IncludeToolbarHomeCollectionModesBindingImpl extends IncludeToolbarHomeCollectionModesBinding implements OnCheckedChangeListener.Listener, OnClickListener.Listener {
    public static final SparseIntArray S;
    public final OnCheckedChangeListener M;
    public final OnClickListener N;
    public final OnClickListener O;
    public final OnClickListener P;
    public final OnClickListener Q;
    public long R;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        S = sparseIntArray;
        sparseIntArray.put(R.id.collection_mode_chips, 9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IncludeToolbarHomeCollectionModesBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 10, null, S);
        super(dataBindingComponent, view, (TextView) objArrT[8], (Chip) objArrT[6], (HorizontalScrollView) objArrT[4], (Chip) objArrT[7], (Chip) objArrT[5], (Chip) objArrT[3], (TextView) objArrT[2], (Toolbar) objArrT[1]);
        this.R = -1L;
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        E(view);
        this.M = new OnCheckedChangeListener();
        this.N = new OnClickListener(this, 4);
        this.O = new OnClickListener(this, 3);
        this.P = new OnClickListener(this, 5);
        this.Q = new OnClickListener(this, 2);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (264 == i) {
            P((Integer) obj);
            return true;
        }
        if (173 == i) {
            O((MainContract.ModeChipsConfiguration) obj);
            return true;
        }
        if (41 == i) {
            L((CollectionModeLabel) obj);
            return true;
        }
        if (93 == i) {
            N((MainViewModel) obj);
            return true;
        }
        if (265 == i) {
            Q((String) obj);
            return true;
        }
        if (42 != i) {
            return false;
        }
        M((Text) obj);
        return true;
    }

    @Override // au.com.woolworths.android.onesite.databinding.IncludeToolbarHomeCollectionModesBinding
    public final void L(CollectionModeLabel collectionModeLabel) throws Throwable {
        this.K = collectionModeLabel;
        synchronized (this) {
            this.R |= 4;
        }
        h(41);
        y();
    }

    @Override // au.com.woolworths.android.onesite.databinding.IncludeToolbarHomeCollectionModesBinding
    public final void M(Text text) throws Throwable {
        this.J = text;
        synchronized (this) {
            this.R |= 32;
        }
        h(42);
        y();
    }

    @Override // au.com.woolworths.android.onesite.databinding.IncludeToolbarHomeCollectionModesBinding
    public final void N(MainViewModel mainViewModel) throws Throwable {
        this.L = mainViewModel;
        synchronized (this) {
            this.R |= 8;
        }
        h(93);
        y();
    }

    @Override // au.com.woolworths.android.onesite.databinding.IncludeToolbarHomeCollectionModesBinding
    public final void O(MainContract.ModeChipsConfiguration modeChipsConfiguration) throws Throwable {
        this.I = modeChipsConfiguration;
        synchronized (this) {
            this.R |= 2;
        }
        h(173);
        y();
    }

    @Override // au.com.woolworths.android.onesite.databinding.IncludeToolbarHomeCollectionModesBinding
    public final void P(Integer num) throws Throwable {
        this.H = num;
        synchronized (this) {
            this.R |= 1;
        }
        h(264);
        y();
    }

    @Override // au.com.woolworths.android.onesite.databinding.IncludeToolbarHomeCollectionModesBinding
    public final void Q(String str) throws Throwable {
        this.G = str;
        synchronized (this) {
            this.R |= 16;
        }
        h(265);
        y();
    }

    @Override // au.com.woolworths.android.onesite.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        Chip chip;
        Chip chip2;
        MainViewModel mainViewModel;
        Chip chip3;
        if (i == 2) {
            MainViewModel mainViewModel2 = this.L;
            CollectionModeLabel collectionModeLabel = this.K;
            if (mainViewModel2 == null || collectionModeLabel == null) {
                return;
            }
            CollectionMode mode = collectionModeLabel.f4625a;
            HomepageChips.g.getClass();
            Intrinsics.h(mode, "mode");
            HomepageChips homepageChips = (HomepageChips) HomepageChips.h.get(mode);
            Chip chip4 = this.D;
            if (chip4 != null) {
                chip4.getText();
                mainViewModel2.w6(homepageChips, chip4.getText());
                return;
            }
            return;
        }
        if (i == 3) {
            MainViewModel mainViewModel3 = this.L;
            if (mainViewModel3 == null || (chip = this.C) == null) {
                return;
            }
            chip.getText();
            mainViewModel3.w6(HomepageChips.i, chip.getText());
            return;
        }
        if (i != 4) {
            if (i != 5 || (mainViewModel = this.L) == null || (chip3 = this.B) == null) {
                return;
            }
            chip3.getText();
            mainViewModel.w6(HomepageChips.k, chip3.getText());
            return;
        }
        MainViewModel mainViewModel4 = this.L;
        if (mainViewModel4 == null || (chip2 = this.z) == null) {
            return;
        }
        chip2.getText();
        mainViewModel4.w6(HomepageChips.j, chip2.getText());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0111 A[PHI: r6
  0x0111: PHI (r6v4 java.lang.CharSequence) = (r6v3 java.lang.CharSequence), (r6v16 java.lang.CharSequence) binds: [B:66:0x00f8, B:72:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.databinding.IncludeToolbarHomeCollectionModesBindingImpl.j():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.R != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.R = 64L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
