package com.scandit.datacapture.core.framesave;

import com.scandit.datacapture.core.framesave.FrameSaveSessionListener;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class a implements FrameSaveSessionListener {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f18513a;

    public a(BurstFrameSaveSession owner) {
        Intrinsics.h(owner, "owner");
        this.f18513a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.core.framesave.FrameSaveSessionListener
    public final void onFrameSaveFailure(FrameSaveSession session, String message, long j) {
        CopyOnWriteArraySet<FrameSaveSessionListener> listeners$scandit_capture_core;
        Intrinsics.h(session, "session");
        Intrinsics.h(message, "message");
        BurstFrameSaveSession burstFrameSaveSession = (BurstFrameSaveSession) this.f18513a.get();
        if (burstFrameSaveSession == null || (listeners$scandit_capture_core = burstFrameSaveSession.getListeners$scandit_capture_core()) == null) {
            return;
        }
        Iterator<T> it = listeners$scandit_capture_core.iterator();
        while (it.hasNext()) {
            ((FrameSaveSessionListener) it.next()).onFrameSaveFailure(session, message, j);
        }
    }

    @Override // com.scandit.datacapture.core.framesave.FrameSaveSessionListener
    public final void onFrameSaveSuccess(FrameSaveSession session, String message, long j) {
        CopyOnWriteArraySet<FrameSaveSessionListener> listeners$scandit_capture_core;
        Intrinsics.h(session, "session");
        Intrinsics.h(message, "message");
        BurstFrameSaveSession burstFrameSaveSession = (BurstFrameSaveSession) this.f18513a.get();
        if (burstFrameSaveSession == null || (listeners$scandit_capture_core = burstFrameSaveSession.getListeners$scandit_capture_core()) == null) {
            return;
        }
        Iterator<T> it = listeners$scandit_capture_core.iterator();
        while (it.hasNext()) {
            ((FrameSaveSessionListener) it.next()).onFrameSaveSuccess(session, message, j);
        }
    }

    @Override // com.scandit.datacapture.core.framesave.FrameSaveSessionListener
    public final void onObservationStarted(FrameSaveSession frameSaveSession) {
        FrameSaveSessionListener.DefaultImpls.onObservationStarted(this, frameSaveSession);
    }

    @Override // com.scandit.datacapture.core.framesave.FrameSaveSessionListener
    public final void onObservationStopped(FrameSaveSession frameSaveSession) {
        FrameSaveSessionListener.DefaultImpls.onObservationStopped(this, frameSaveSession);
    }
}
