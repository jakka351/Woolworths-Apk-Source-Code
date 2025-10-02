package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
class SnackbarManager {
    public static SnackbarManager e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f14655a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.material.snackbar.SnackbarManager.1
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            SnackbarManager snackbarManager = SnackbarManager.this;
            SnackbarRecord snackbarRecord = (SnackbarRecord) message.obj;
            synchronized (snackbarManager.f14655a) {
                try {
                    if (snackbarManager.c == snackbarRecord || snackbarManager.d == snackbarRecord) {
                        snackbarManager.a(snackbarRecord, 2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
    });
    public SnackbarRecord c;
    public SnackbarRecord d;

    public interface Callback {
        void a();

        void b(int i);
    }

    public static class SnackbarRecord {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f14656a;
        public int b;
        public boolean c;

        public SnackbarRecord(int i, BaseTransientBottomBar.AnonymousClass5 anonymousClass5) {
            this.f14656a = new WeakReference(anonymousClass5);
            this.b = i;
        }
    }

    public static SnackbarManager b() {
        if (e == null) {
            e = new SnackbarManager();
        }
        return e;
    }

    public final boolean a(SnackbarRecord snackbarRecord, int i) {
        Callback callback = (Callback) snackbarRecord.f14656a.get();
        if (callback == null) {
            return false;
        }
        this.b.removeCallbacksAndMessages(snackbarRecord);
        callback.b(i);
        return true;
    }

    public final boolean c(Callback callback) {
        SnackbarRecord snackbarRecord = this.c;
        return (snackbarRecord == null || callback == null || snackbarRecord.f14656a.get() != callback) ? false : true;
    }

    public final void d(BaseTransientBottomBar.AnonymousClass5 anonymousClass5) {
        synchronized (this.f14655a) {
            try {
                if (c(anonymousClass5)) {
                    SnackbarRecord snackbarRecord = this.c;
                    if (!snackbarRecord.c) {
                        snackbarRecord.c = true;
                        this.b.removeCallbacksAndMessages(snackbarRecord);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(BaseTransientBottomBar.AnonymousClass5 anonymousClass5) {
        synchronized (this.f14655a) {
            try {
                if (c(anonymousClass5)) {
                    SnackbarRecord snackbarRecord = this.c;
                    if (snackbarRecord.c) {
                        snackbarRecord.c = false;
                        f(snackbarRecord);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(SnackbarRecord snackbarRecord) {
        int i = snackbarRecord.b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED : 2750;
        }
        Handler handler = this.b;
        handler.removeCallbacksAndMessages(snackbarRecord);
        handler.sendMessageDelayed(Message.obtain(handler, 0, snackbarRecord), i);
    }
}
