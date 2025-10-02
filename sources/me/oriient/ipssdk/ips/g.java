package me.oriient.ipssdk.ips;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;

/* loaded from: classes4.dex */
public final class g implements Observer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f25794a;
    public final /* synthetic */ IPSCalibrationDialog b;

    public g(IPSCalibrationDialog iPSCalibrationDialog, FragmentActivity fragmentActivity) {
        this.b = iPSCalibrationDialog;
        this.f25794a = fragmentActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        this.f25794a.runOnUiThread(new f(this, (Double) obj));
    }
}
