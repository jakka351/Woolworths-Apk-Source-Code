package me.oriient.ipssdk.ips;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;

/* loaded from: classes4.dex */
public final class m implements Observer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f25800a;
    public final /* synthetic */ IPSCalibrationDialog b;

    public m(IPSCalibrationDialog iPSCalibrationDialog, FragmentActivity fragmentActivity) {
        this.b = iPSCalibrationDialog;
        this.f25800a = fragmentActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        this.f25800a.runOnUiThread(new l(this, (String) obj));
    }
}
