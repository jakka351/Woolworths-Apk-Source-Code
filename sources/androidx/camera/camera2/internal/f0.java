package androidx.camera.camera2.internal;

import androidx.camera.core.FocusMeteringResult;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes2.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ FocusMeteringControl e;
    public final /* synthetic */ long f;

    public /* synthetic */ f0(FocusMeteringControl focusMeteringControl, long j, int i) {
        this.d = i;
        this.e = focusMeteringControl;
        this.f = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                FocusMeteringControl focusMeteringControl = this.e;
                focusMeteringControl.b.execute(new f0(focusMeteringControl, this.f, 3));
                break;
            case 1:
                FocusMeteringControl focusMeteringControl2 = this.e;
                focusMeteringControl2.b.execute(new f0(focusMeteringControl2, this.f, 2));
                break;
            case 2:
                long j = this.f;
                FocusMeteringControl focusMeteringControl3 = this.e;
                if (j == focusMeteringControl3.k) {
                    focusMeteringControl3.b();
                    break;
                }
                break;
            default:
                long j2 = this.f;
                FocusMeteringControl focusMeteringControl4 = this.e;
                if (j2 == focusMeteringControl4.k) {
                    focusMeteringControl4.m = false;
                    ScheduledFuture scheduledFuture = focusMeteringControl4.j;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(true);
                        focusMeteringControl4.j = null;
                    }
                    CallbackToFutureAdapter.Completer completer = focusMeteringControl4.s;
                    if (completer != null) {
                        completer.b(new FocusMeteringResult(false));
                        focusMeteringControl4.s = null;
                        break;
                    }
                }
                break;
        }
    }
}
