package androidx.asynclayoutinflater.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import java.util.concurrent.ArrayBlockingQueue;

/* loaded from: classes2.dex */
public final class AsyncLayoutInflater {

    /* renamed from: a, reason: collision with root package name */
    public final LayoutInflater f201a;

    public static class BasicInflater extends LayoutInflater {

        /* renamed from: a, reason: collision with root package name */
        public static final String[] f202a = {"android.widget.", "android.webkit.", "android.app."};

        public BasicInflater(Context context) {
            super(context);
        }

        @Override // android.view.LayoutInflater
        public final LayoutInflater cloneInContext(Context context) {
            return new BasicInflater(context);
        }

        @Override // android.view.LayoutInflater
        public final View onCreateView(String str, AttributeSet attributeSet) throws InflateException, ClassNotFoundException {
            View viewCreateView;
            for (int i = 0; i < 3; i++) {
                try {
                    viewCreateView = createView(str, f202a[i], attributeSet);
                } catch (ClassNotFoundException unused) {
                }
                if (viewCreateView != null) {
                    return viewCreateView;
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    public static class InflateRequest {

        /* renamed from: a, reason: collision with root package name */
        public View f203a;
    }

    public static class InflateThread extends Thread {
        public static final /* synthetic */ int e = 0;
        public ArrayBlockingQueue d;

        static {
            InflateThread inflateThread = new InflateThread();
            inflateThread.d = new ArrayBlockingQueue(10);
            new Pools.SynchronizedPool(10);
            inflateThread.start();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            while (true) {
                try {
                    InflateRequest inflateRequest = (InflateRequest) this.d.take();
                    try {
                        inflateRequest.getClass();
                        throw null;
                    } catch (RuntimeException e2) {
                        Log.w("AsyncLayoutInflater", "Failed to inflate resource in the background! Retrying on the UI thread", e2);
                        inflateRequest.getClass();
                        throw null;
                    }
                } catch (InterruptedException e3) {
                    Log.w("AsyncLayoutInflater", e3);
                }
            }
        }
    }

    public interface OnInflateFinishedListener {
    }

    public AsyncLayoutInflater(@NonNull Context context) {
        Handler.Callback callback = new Handler.Callback() { // from class: androidx.asynclayoutinflater.view.AsyncLayoutInflater.1
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                InflateRequest inflateRequest = (InflateRequest) message.obj;
                if (inflateRequest.f203a != null) {
                    throw null;
                }
                inflateRequest.f203a = AsyncLayoutInflater.this.f201a.inflate(0, (ViewGroup) null, false);
                throw null;
            }
        };
        this.f201a = new BasicInflater(context);
        new Handler(callback);
        int i = InflateThread.e;
    }
}
