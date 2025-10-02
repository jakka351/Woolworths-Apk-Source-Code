package au.com.woolworths.feature.shared.instore.wifi.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeHorizontalDividerBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.shared.instore.wifi.generated.callback.OnCheckedChangeListener;
import au.com.woolworths.feature.shared.instore.wifi.generated.callback.OnClickListener;
import au.com.woolworths.feature.shared.instore.wifi.ui.JoinWifiContract;
import au.com.woolworths.feature.shared.instore.wifi.ui.JoinWifiViewModel;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ActivityJoinWifiBindingImpl extends ActivityJoinWifiBinding implements OnClickListener.Listener, OnCheckedChangeListener.Listener {
    public static final ViewDataBinding.IncludedLayouts M;
    public static final SparseIntArray N;
    public final IncludeHorizontalDividerBinding G;
    public final IncludeHorizontalDividerBinding H;
    public final OnClickListener I;
    public final OnClickListener J;
    public final OnCheckedChangeListener K;
    public long L;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(10);
        M = includedLayouts;
        includedLayouts.a(1, new int[]{7, 8}, new int[]{R.layout.include_horizontal_divider, R.layout.include_horizontal_divider}, new String[]{"include_horizontal_divider", "include_horizontal_divider"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(R.id.text_information, 9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityJoinWifiBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 10, M, N);
        super(dataBindingComponent, view, (ImageButton) objArrT[2], (Button) objArrT[4], (View) objArrT[5], (ProgressBar) objArrT[6], (SwitchMaterial) objArrT[3], (TextView) objArrT[9]);
        this.L = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        ((ScrollView) objArrT[0]).setTag(null);
        ((ConstraintLayout) objArrT[1]).setTag(null);
        IncludeHorizontalDividerBinding includeHorizontalDividerBinding = (IncludeHorizontalDividerBinding) objArrT[7];
        this.G = includeHorizontalDividerBinding;
        if (includeHorizontalDividerBinding != null) {
            includeHorizontalDividerBinding.n = this;
        }
        IncludeHorizontalDividerBinding includeHorizontalDividerBinding2 = (IncludeHorizontalDividerBinding) objArrT[8];
        this.H = includeHorizontalDividerBinding2;
        if (includeHorizontalDividerBinding2 != null) {
            includeHorizontalDividerBinding2.n = this;
        }
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        E(view);
        this.I = new OnClickListener(this, 3);
        this.J = new OnClickListener(this, 1);
        this.K = new OnCheckedChangeListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (274 == i) {
            M((JoinWifiContract.ViewState) obj);
            return true;
        }
        if (273 != i) {
            return false;
        }
        L((JoinWifiViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shared.instore.wifi.databinding.ActivityJoinWifiBinding
    public final void L(JoinWifiViewModel joinWifiViewModel) throws Throwable {
        this.E = joinWifiViewModel;
        synchronized (this) {
            this.L |= 2;
        }
        h(273);
        y();
    }

    @Override // au.com.woolworths.feature.shared.instore.wifi.databinding.ActivityJoinWifiBinding
    public final void M(JoinWifiContract.ViewState viewState) throws Throwable {
        this.F = viewState;
        synchronized (this) {
            this.L |= 1;
        }
        h(274);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        boolean z;
        boolean z2;
        synchronized (this) {
            j = this.L;
            this.L = 0L;
        }
        JoinWifiContract.ViewState viewState = this.F;
        long j2 = 5 & j;
        if (j2 == 0 || viewState == null) {
            z = false;
            z2 = false;
        } else {
            z = viewState.f6538a;
            z2 = viewState.b;
        }
        if ((j & 4) != 0) {
            this.y.setOnClickListener(this.J);
            this.z.setOnClickListener(this.I);
            this.C.setOnCheckedChangeListener(this.K);
        }
        if (j2 != 0) {
            this.z.setEnabled(z2);
            BindingAdaptersKt.o(this.A, z);
            BindingAdaptersKt.o(this.B, z);
        }
        this.G.k();
        this.H.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.L != 0) {
                    return true;
                }
                return this.G.p() || this.H.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.L = 4L;
        }
        this.G.r();
        this.H.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
