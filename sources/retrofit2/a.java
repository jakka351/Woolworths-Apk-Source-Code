package retrofit2;

import java.io.IOException;
import retrofit2.DefaultCallAdapterFactory;

/* loaded from: classes8.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 e;
    public final /* synthetic */ Callback f;
    public final /* synthetic */ Object g;

    public /* synthetic */ a(DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 anonymousClass1, Callback callback, Object obj, int i) {
        this.d = i;
        this.e = anonymousClass1;
        this.f = callback;
        this.g = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                Response response = (Response) this.g;
                DefaultCallAdapterFactory.ExecutorCallbackCall executorCallbackCall = DefaultCallAdapterFactory.ExecutorCallbackCall.this;
                boolean zIsCanceled = executorCallbackCall.e.isCanceled();
                Callback callback = this.f;
                if (!zIsCanceled) {
                    callback.c(executorCallbackCall, response);
                    break;
                } else {
                    callback.a(executorCallbackCall, new IOException("Canceled"));
                    break;
                }
            default:
                Throwable th = (Throwable) this.g;
                this.f.a(DefaultCallAdapterFactory.ExecutorCallbackCall.this, th);
                break;
        }
    }
}
