package me.oriient.ipssdk.ips;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;

/* loaded from: classes4.dex */
public final class o implements Observer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f25802a;
    public final /* synthetic */ IPSCalibrationDialog b;

    public o(IPSCalibrationDialog iPSCalibrationDialog, FragmentActivity fragmentActivity) {
        this.b = iPSCalibrationDialog;
        this.f25802a = fragmentActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        this.f25802a.runOnUiThread(new n(this, (String) obj));
    }
}
