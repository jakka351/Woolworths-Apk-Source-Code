package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.IPostMessageService;

/* loaded from: classes2.dex */
public abstract class PostMessageServiceConnection implements PostMessageBackend, ServiceConnection {
    public IPostMessageService d;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.d = IPostMessageService.Stub.h1(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.d = null;
    }
}
