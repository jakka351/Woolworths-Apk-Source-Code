package androidx.media3.common.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.util.HandlerWrapper;
import java.util.ArrayList;

/* loaded from: classes2.dex */
final class SystemHandlerWrapper implements HandlerWrapper {
    public static final ArrayList b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    public final Handler f2924a;

    public static final class SystemMessage implements HandlerWrapper.Message {

        /* renamed from: a, reason: collision with root package name */
        public Message f2925a;

        @Override // androidx.media3.common.util.HandlerWrapper.Message
        public final void a() {
            Message message = this.f2925a;
            message.getClass();
            message.sendToTarget();
            b();
        }

        public final void b() {
            this.f2925a = null;
            ArrayList arrayList = SystemHandlerWrapper.b;
            synchronized (arrayList) {
                try {
                    if (arrayList.size() < 50) {
                        arrayList.add(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public SystemHandlerWrapper(Handler handler) {
        this.f2924a = handler;
    }

    public static SystemMessage l() {
        SystemMessage systemMessage;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                systemMessage = arrayList.isEmpty() ? new SystemMessage() : (SystemMessage) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return systemMessage;
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public final boolean a() {
        return this.f2924a.hasMessages(1);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public final HandlerWrapper.Message b(int i) {
        SystemMessage systemMessageL = l();
        systemMessageL.f2925a = this.f2924a.obtainMessage(i);
        return systemMessageL;
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public final void c() {
        this.f2924a.removeCallbacksAndMessages(null);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public final HandlerWrapper.Message d(int i, Object obj) {
        SystemMessage systemMessageL = l();
        systemMessageL.f2925a = this.f2924a.obtainMessage(i, obj);
        return systemMessageL;
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public final HandlerWrapper.Message e(int i, int i2, int i3) {
        SystemMessage systemMessageL = l();
        systemMessageL.f2925a = this.f2924a.obtainMessage(i, i2, i3);
        return systemMessageL;
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public final HandlerWrapper.Message f(int i, int i2, Object obj) {
        SystemMessage systemMessageL = l();
        systemMessageL.f2925a = this.f2924a.obtainMessage(i, 0, i2, obj);
        return systemMessageL;
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public final boolean g(HandlerWrapper.Message message) {
        SystemMessage systemMessage = (SystemMessage) message;
        Message message2 = systemMessage.f2925a;
        message2.getClass();
        boolean zSendMessageAtFrontOfQueue = this.f2924a.sendMessageAtFrontOfQueue(message2);
        systemMessage.b();
        return zSendMessageAtFrontOfQueue;
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public final Looper h() {
        return this.f2924a.getLooper();
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public final boolean i(long j) {
        return this.f2924a.sendEmptyMessageAtTime(2, j);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public final boolean j(int i) {
        return this.f2924a.sendEmptyMessage(i);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public final void k(int i) {
        Assertions.b(i != 0);
        this.f2924a.removeMessages(i);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public final boolean post(Runnable runnable) {
        return this.f2924a.post(runnable);
    }
}
