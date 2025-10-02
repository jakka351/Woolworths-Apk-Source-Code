package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Context e;

    public /* synthetic */ c(Context context, int i) {
        this.d = i;
        this.e = context;
    }

    @Override // java.lang.Runnable
    public final void run() throws PackageManager.NameNotFoundException, IOException {
        switch (this.d) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new c(this.e, 1));
                break;
            default:
                ProfileInstaller.b(this.e, new androidx.arch.core.executor.a(2), ProfileInstaller.f3640a, false);
                break;
        }
    }
}
