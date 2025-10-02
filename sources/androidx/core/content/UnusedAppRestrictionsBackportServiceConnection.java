package androidx.core.content;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService;

/* loaded from: classes2.dex */
class UnusedAppRestrictionsBackportServiceConnection implements ServiceConnection {
    public IUnusedAppRestrictionsBackportService d;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IUnusedAppRestrictionsBackportService iUnusedAppRestrictionsBackportServiceH1 = IUnusedAppRestrictionsBackportService.Stub.h1(iBinder);
        this.d = iUnusedAppRestrictionsBackportServiceH1;
        try {
            iUnusedAppRestrictionsBackportServiceH1.M0(new IUnusedAppRestrictionsBackportCallback.Stub() { // from class: androidx.core.content.UnusedAppRestrictionsBackportServiceConnection.1
                {
                    attachInterface(this, IUnusedAppRestrictionsBackportCallback.f3);
                }

                @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback
                public final void A0(boolean z, boolean z2) {
                    UnusedAppRestrictionsBackportServiceConnection unusedAppRestrictionsBackportServiceConnection = UnusedAppRestrictionsBackportServiceConnection.this;
                    if (!z) {
                        unusedAppRestrictionsBackportServiceConnection.getClass();
                        throw null;
                    }
                    if (z2) {
                        unusedAppRestrictionsBackportServiceConnection.getClass();
                        throw null;
                    }
                    unusedAppRestrictionsBackportServiceConnection.getClass();
                    throw null;
                }
            });
        } catch (RemoteException unused) {
            throw null;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.d = null;
    }
}
