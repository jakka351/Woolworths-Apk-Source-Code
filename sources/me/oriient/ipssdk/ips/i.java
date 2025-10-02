package me.oriient.ipssdk.ips;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;

/* loaded from: classes4.dex */
public final class i implements Observer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f25796a;
    public final /* synthetic */ IPSCalibrationDialog b;

    public i(IPSCalibrationDialog iPSCalibrationDialog, FragmentActivity fragmentActivity) {
        this.b = iPSCalibrationDialog;
        this.f25796a = fragmentActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        this.f25796a.runOnUiThread(new h(this, (String) obj));
    }
}
