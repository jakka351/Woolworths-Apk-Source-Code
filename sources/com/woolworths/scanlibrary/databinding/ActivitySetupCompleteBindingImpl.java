package com.woolworths.scanlibrary.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.extensions.SharedPreferenceExtKt$boolean$$inlined$delegate$1;
import com.woolworths.R;
import com.woolworths.scanlibrary.configuration.UserConfigurations;
import com.woolworths.scanlibrary.generated.callback.OnClickListener;
import com.woolworths.scanlibrary.ui.setupcomplete.SetupCompleteContract;
import com.woolworths.scanlibrary.ui.setupcomplete.SetupUpCompleteViewModel;
import com.woolworths.scanlibrary.ui.setupcomplete.analytics.SetupCompleteTracking;
import com.woolworths.scanlibrary.util.device.DeviceInfoProvider;
import kotlin.reflect.KProperty;

/* loaded from: classes7.dex */
public class ActivitySetupCompleteBindingImpl extends ActivitySetupCompleteBinding implements OnClickListener.Listener {
    public static final SparseIntArray C;
    public final OnClickListener A;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.textViewTitle, 2);
        sparseIntArray.put(R.id.imageView5, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivitySetupCompleteBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, null, C);
        Button button = (Button) objArrT[1];
        super(dataBindingComponent, view, button);
        this.B = -1L;
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.y.setTag(null);
        E(view);
        this.A = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((SetupUpCompleteViewModel) obj);
        return true;
    }

    @Override // com.woolworths.scanlibrary.databinding.ActivitySetupCompleteBinding
    public final void L(SetupUpCompleteViewModel setupUpCompleteViewModel) throws Throwable {
        this.z = setupUpCompleteViewModel;
        synchronized (this) {
            this.B |= 1;
        }
        h(273);
        y();
    }

    @Override // com.woolworths.scanlibrary.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        SetupUpCompleteViewModel setupUpCompleteViewModel = this.z;
        if (setupUpCompleteViewModel != null) {
            DeviceInfoProvider deviceInfoProvider = setupUpCompleteViewModel.j;
            UserConfigurations userConfigurations = setupUpCompleteViewModel.i;
            SharedPreferenceExtKt$boolean$$inlined$delegate$1 sharedPreferenceExtKt$boolean$$inlined$delegate$1 = userConfigurations.j;
            KProperty[] kPropertyArr = UserConfigurations.k;
            sharedPreferenceExtKt$boolean$$inlined$delegate$1.setValue(userConfigurations, kPropertyArr[12], Boolean.TRUE);
            if (((String) userConfigurations.f.getValue(userConfigurations, kPropertyArr[6])).length() == 0) {
                userConfigurations.e.setValue(userConfigurations, kPropertyArr[5], Integer.valueOf(deviceInfoProvider.getAppVersionCode()));
                userConfigurations.b(deviceInfoProvider.getAppVersionName());
            }
            setupUpCompleteViewModel.l.f(SetupCompleteContract.Actions.SetupComplete.f21334a);
            setupUpCompleteViewModel.k.c(SetupCompleteTracking.d);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        if ((j & 2) != 0) {
            this.y.setOnClickListener(this.A);
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
            this.B = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
