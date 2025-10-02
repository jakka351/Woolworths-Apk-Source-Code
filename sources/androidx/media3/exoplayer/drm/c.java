package androidx.media3.exoplayer.drm;

import android.os.Looper;
import androidx.media3.common.Format;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                DrmSessionEventListener.EventDispatcher eventDispatcher = (DrmSessionEventListener.EventDispatcher) this.e;
                ((DrmSessionEventListener) this.f).Q(eventDispatcher.f3079a, eventDispatcher.b);
                return;
            case 1:
                DrmSessionEventListener.EventDispatcher eventDispatcher2 = (DrmSessionEventListener.EventDispatcher) this.e;
                ((DrmSessionEventListener) this.f).k0(eventDispatcher2.f3079a, eventDispatcher2.b);
                return;
            case 2:
                DrmSessionEventListener.EventDispatcher eventDispatcher3 = (DrmSessionEventListener.EventDispatcher) this.e;
                ((DrmSessionEventListener) this.f).F(eventDispatcher3.f3079a, eventDispatcher3.b);
                return;
            default:
                DefaultDrmSessionManager.PreacquiredSessionReference preacquiredSessionReference = (DefaultDrmSessionManager.PreacquiredSessionReference) this.e;
                Format format = (Format) this.f;
                DefaultDrmSessionManager defaultDrmSessionManager = preacquiredSessionReference.g;
                if (defaultDrmSessionManager.b == 0 || preacquiredSessionReference.f) {
                    return;
                }
                Looper looper = defaultDrmSessionManager.f;
                looper.getClass();
                preacquiredSessionReference.e = defaultDrmSessionManager.e(looper, preacquiredSessionReference.d, format, false);
                throw null;
        }
    }
}
