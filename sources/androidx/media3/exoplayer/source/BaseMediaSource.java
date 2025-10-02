package androidx.media3.exoplayer.source;

import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

@UnstableApi
/* loaded from: classes2.dex */
public abstract class BaseMediaSource implements MediaSource {
    public final ArrayList d = new ArrayList(1);
    public final HashSet e = new HashSet(1);
    public final MediaSourceEventListener.EventDispatcher f = new MediaSourceEventListener.EventDispatcher(new CopyOnWriteArrayList(), 0, null);
    public final DrmSessionEventListener.EventDispatcher g = new DrmSessionEventListener.EventDispatcher(new CopyOnWriteArrayList(), 0, null);
    public Looper h;
    public Timeline i;
    public PlayerId j;

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void D(MediaSourceEventListener mediaSourceEventListener) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            MediaSourceEventListener.EventDispatcher.ListenerAndHandler listenerAndHandler = (MediaSourceEventListener.EventDispatcher.ListenerAndHandler) it.next();
            if (listenerAndHandler.b == mediaSourceEventListener) {
                copyOnWriteArrayList.remove(listenerAndHandler);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void G(DrmSessionEventListener drmSessionEventListener) {
        this.g.g(drmSessionEventListener);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void I(MediaSource.MediaSourceCaller mediaSourceCaller, TransferListener transferListener, PlayerId playerId) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.h;
        Assertions.b(looper == null || looper == looperMyLooper);
        this.j = playerId;
        Timeline timeline = this.i;
        this.d.add(mediaSourceCaller);
        if (this.h == null) {
            this.h = looperMyLooper;
            this.e.add(mediaSourceCaller);
            U(transferListener);
        } else if (timeline != null) {
            K(mediaSourceCaller);
            mediaSourceCaller.C(this, timeline);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void K(MediaSource.MediaSourceCaller mediaSourceCaller) {
        this.h.getClass();
        HashSet hashSet = this.e;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(mediaSourceCaller);
        if (zIsEmpty) {
            S();
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void N(MediaSource.MediaSourceCaller mediaSourceCaller) {
        HashSet hashSet = this.e;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(mediaSourceCaller);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        P();
    }

    public void P() {
    }

    public void S() {
    }

    public void T(Timeline timeline) {
        W(timeline);
    }

    public abstract void U(TransferListener transferListener);

    public final void W(Timeline timeline) {
        this.i = timeline;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((MediaSource.MediaSourceCaller) it.next()).C(this, timeline);
        }
    }

    public abstract void X();

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void a(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
        handler.getClass();
        MediaSourceEventListener.EventDispatcher eventDispatcher = this.f;
        eventDispatcher.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = eventDispatcher.c;
        MediaSourceEventListener.EventDispatcher.ListenerAndHandler listenerAndHandler = new MediaSourceEventListener.EventDispatcher.ListenerAndHandler();
        listenerAndHandler.f3132a = handler;
        listenerAndHandler.b = mediaSourceEventListener;
        copyOnWriteArrayList.add(listenerAndHandler);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void q(Handler handler, DrmSessionEventListener drmSessionEventListener) {
        handler.getClass();
        this.g.a(handler, drmSessionEventListener);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void u(MediaSource.MediaSourceCaller mediaSourceCaller) {
        ArrayList arrayList = this.d;
        arrayList.remove(mediaSourceCaller);
        if (!arrayList.isEmpty()) {
            N(mediaSourceCaller);
            return;
        }
        this.h = null;
        this.i = null;
        this.j = null;
        this.e.clear();
        X();
    }
}
