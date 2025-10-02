package lib.android.paypal.com.magnessdk.network.base;

import com.medallia.digital.mobilesdk.l8;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public abstract class c implements Runnable {
    public final void a() {
        d dVar;
        synchronized (d.b) {
            try {
                if (d.c == null) {
                    d dVar2 = new d();
                    try {
                        dVar2.f24905a = new ThreadPoolExecutor(10, 10, l8.b.b, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(256), new ThreadPoolExecutor.DiscardPolicy());
                    } catch (Exception unused) {
                    }
                    d.c = dVar2;
                }
                dVar = d.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        dVar.f24905a.execute(this);
    }
}
