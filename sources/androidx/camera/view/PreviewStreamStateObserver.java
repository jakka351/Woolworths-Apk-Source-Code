package androidx.camera.view;

import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.view.PreviewView;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class PreviewStreamStateObserver implements Observable.Observer<CameraInternal.State> {

    /* renamed from: a, reason: collision with root package name */
    public final CameraInfoInternal f644a;
    public final MutableLiveData b;
    public PreviewView.StreamState c;
    public final PreviewViewImplementation d;
    public FutureChain e;
    public boolean f = false;

    public PreviewStreamStateObserver(CameraInfoInternal cameraInfoInternal, MutableLiveData mutableLiveData, PreviewViewImplementation previewViewImplementation) {
        this.f644a = cameraInfoInternal;
        this.b = mutableLiveData;
        this.d = previewViewImplementation;
        synchronized (this) {
            this.c = (PreviewView.StreamState) mutableLiveData.e();
        }
    }

    @Override // androidx.camera.core.impl.Observable.Observer
    public final void a(Object obj) {
        CameraInternal.State state = (CameraInternal.State) obj;
        CameraInternal.State state2 = CameraInternal.State.CLOSING;
        PreviewView.StreamState streamState = PreviewView.StreamState.d;
        if (state == state2 || state == CameraInternal.State.CLOSED || state == CameraInternal.State.RELEASING || state == CameraInternal.State.RELEASED) {
            b(streamState);
            if (this.f) {
                this.f = false;
                FutureChain futureChain = this.e;
                if (futureChain != null) {
                    futureChain.cancel(false);
                    this.e = null;
                    return;
                }
                return;
            }
            return;
        }
        if ((state == CameraInternal.State.OPENING || state == CameraInternal.State.OPEN || state == CameraInternal.State.PENDING_OPEN) && !this.f) {
            b(streamState);
            final ArrayList arrayList = new ArrayList();
            final CameraInfoInternal cameraInfoInternal = this.f644a;
            FutureChain futureChain2 = (FutureChain) Futures.l((FutureChain) Futures.m(FutureChain.a(CallbackToFutureAdapter.a(new d(cameraInfoInternal, this, arrayList))), new e(this), CameraXExecutors.a()), new b(this, 1), CameraXExecutors.a());
            this.e = futureChain2;
            Futures.a(futureChain2, new FutureCallback<Void>() { // from class: androidx.camera.view.PreviewStreamStateObserver.1
                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public final void onFailure(Throwable th) {
                    this.e = null;
                    ArrayList arrayList2 = arrayList;
                    if (arrayList2.isEmpty()) {
                        return;
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((CameraInfoInternal) cameraInfoInternal).e((CameraCaptureCallback) it.next());
                    }
                    arrayList2.clear();
                }

                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public final void onSuccess(Object obj2) {
                    this.e = null;
                }
            }, CameraXExecutors.a());
            this.f = true;
        }
    }

    public final void b(PreviewView.StreamState streamState) {
        synchronized (this) {
            try {
                if (this.c.equals(streamState)) {
                    return;
                }
                this.c = streamState;
                Logger.a("StreamStateObserver", "Update Preview stream state to " + streamState);
                this.b.j(streamState);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.Observable.Observer
    public final void onError(Throwable th) {
        FutureChain futureChain = this.e;
        if (futureChain != null) {
            futureChain.cancel(false);
            this.e = null;
        }
        b(PreviewView.StreamState.d);
    }
}
