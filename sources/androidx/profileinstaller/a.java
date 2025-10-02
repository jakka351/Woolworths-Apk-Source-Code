package androidx.profileinstaller;

import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.profileinstaller.ProfileInstaller;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ a(Object obj, int i, int i2, Object obj2) {
        this.d = i2;
        this.g = obj;
        this.e = i;
        this.f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                ProfileInstaller.DiagnosticsCallback diagnosticsCallback = (ProfileInstaller.DiagnosticsCallback) this.g;
                ((ProfileInstallReceiver.ResultDiagnostics) diagnosticsCallback).a(this.e, this.f);
                break;
            default:
                DeviceProfileWriter deviceProfileWriter = (DeviceProfileWriter) this.g;
                deviceProfileWriter.c.a(this.e, this.f);
                break;
        }
    }
}
