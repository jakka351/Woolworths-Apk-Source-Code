package me.oriient.ipssdk.ips;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;

/* loaded from: classes4.dex */
public final class k implements Observer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f25798a;
    public final /* synthetic */ IPSCalibrationDialog b;

    public k(IPSCalibrationDialog iPSCalibrationDialog, FragmentActivity fragmentActivity) {
        this.b = iPSCalibrationDialog;
        this.f25798a = fragmentActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        this.f25798a.runOnUiThread(new j(this, (String) obj));
    }
}
