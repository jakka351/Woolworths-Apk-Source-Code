package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.transition.Transition;

/* loaded from: classes4.dex */
public final class PreloadTarget<Z> extends CustomTarget<Z> {
    public static final Handler g = new Handler(Looper.getMainLooper(), new AnonymousClass1());

    /* renamed from: com.bumptech.glide.request.target.PreloadTarget$1, reason: invalid class name */
    public class AnonymousClass1 implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((PreloadTarget) message.obj).getClass();
            throw null;
        }
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void d(Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void e(Object obj, Transition transition) {
        Request request = this.f;
        if (request == null || !request.isComplete()) {
            return;
        }
        g.obtainMessage(1, this).sendToTarget();
    }
}
