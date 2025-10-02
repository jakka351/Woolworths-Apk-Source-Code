package androidx.core.os;

import androidx.camera.core.processing.f;

@Deprecated
/* loaded from: classes2.dex */
public final class CancellationSignal {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2440a;
    public f b;
    public android.os.CancellationSignal c;
    public boolean d;

    public interface OnCancelListener {
    }

    public final void a() {
        synchronized (this) {
            try {
                if (this.f2440a) {
                    return;
                }
                this.f2440a = true;
                this.d = true;
                f fVar = this.b;
                android.os.CancellationSignal cancellationSignal = this.c;
                if (fVar != null) {
                    try {
                        fVar.a();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.cancel();
                }
                synchronized (this) {
                    this.d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }
}
