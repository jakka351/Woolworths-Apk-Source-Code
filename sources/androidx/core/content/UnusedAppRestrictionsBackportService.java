package androidx.core.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService;

/* loaded from: classes2.dex */
public abstract class UnusedAppRestrictionsBackportService extends Service {
    public final IUnusedAppRestrictionsBackportService.Stub d = new IUnusedAppRestrictionsBackportService.Stub() { // from class: androidx.core.content.UnusedAppRestrictionsBackportService.1
        {
            attachInterface(this, IUnusedAppRestrictionsBackportService.g3);
        }

        @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
        public final void M0(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) {
            if (iUnusedAppRestrictionsBackportCallback == null) {
                return;
            }
            UnusedAppRestrictionsBackportService.this.a();
        }
    };

    public abstract void a();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.d;
    }
}
