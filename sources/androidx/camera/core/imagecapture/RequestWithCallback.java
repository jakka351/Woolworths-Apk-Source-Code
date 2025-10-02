package androidx.camera.core.imagecapture;

import androidx.camera.core.impl.utils.Threads;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes2.dex */
public class RequestWithCallback implements TakePictureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final TakePictureRequest f451a;
    public final TakePictureManager b;
    public final ListenableFuture c;
    public final ListenableFuture d;
    public CallbackToFutureAdapter.Completer e;
    public CallbackToFutureAdapter.Completer f;
    public boolean g = false;
    public boolean h = false;
    public ListenableFuture i;

    public RequestWithCallback(TakePictureRequest takePictureRequest, TakePictureManager takePictureManager) {
        this.f451a = takePictureRequest;
        this.b = takePictureManager;
        final int i = 0;
        this.c = CallbackToFutureAdapter.a(new CallbackToFutureAdapter.Resolver(this) { // from class: androidx.camera.core.imagecapture.i
            public final /* synthetic */ RequestWithCallback e;

            {
                this.e = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                switch (i) {
                    case 0:
                        this.e.e = completer;
                        return "CaptureCompleteFuture";
                    default:
                        this.e.f = completer;
                        return "RequestCompleteFuture";
                }
            }
        });
        final int i2 = 1;
        this.d = CallbackToFutureAdapter.a(new CallbackToFutureAdapter.Resolver(this) { // from class: androidx.camera.core.imagecapture.i
            public final /* synthetic */ RequestWithCallback e;

            {
                this.e = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                switch (i2) {
                    case 0:
                        this.e.e = completer;
                        return "CaptureCompleteFuture";
                    default:
                        this.e.f = completer;
                        return "RequestCompleteFuture";
                }
            }
        });
    }

    public final void a() {
        Preconditions.f("The callback can only complete once.", !this.d.isDone());
        this.f.b(null);
    }

    public final void b() {
        Threads.a();
        if (this.g || this.h) {
            return;
        }
        this.h = true;
    }
}
