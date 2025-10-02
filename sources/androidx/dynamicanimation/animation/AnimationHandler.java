package androidx.dynamicanimation.animation;

import android.os.SystemClock;
import android.view.Choreographer;
import androidx.annotation.RequiresApi;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* loaded from: classes2.dex */
class AnimationHandler {
    public static final ThreadLocal f = new ThreadLocal();
    public FrameCallbackProvider16 d;

    /* renamed from: a, reason: collision with root package name */
    public final SimpleArrayMap f2688a = new SimpleArrayMap(0);
    public final ArrayList b = new ArrayList();
    public final AnimationCallbackDispatcher c = new AnimationCallbackDispatcher();
    public boolean e = false;

    public class AnimationCallbackDispatcher {
        public AnimationCallbackDispatcher() {
        }
    }

    public interface AnimationFrameCallback {
        boolean doAnimationFrame(long j);
    }

    public static abstract class AnimationFrameCallbackProvider {

        /* renamed from: a, reason: collision with root package name */
        public final AnimationCallbackDispatcher f2690a;

        public AnimationFrameCallbackProvider(AnimationCallbackDispatcher animationCallbackDispatcher) {
            this.f2690a = animationCallbackDispatcher;
        }
    }

    public static class FrameCallbackProvider14 extends AnimationFrameCallbackProvider {

        /* renamed from: androidx.dynamicanimation.animation.AnimationHandler$FrameCallbackProvider14$1, reason: invalid class name */
        class AnonymousClass1 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }
    }

    @RequiresApi
    public static class FrameCallbackProvider16 extends AnimationFrameCallbackProvider {
        public final Choreographer b;
        public final Choreographer.FrameCallback c;

        public FrameCallbackProvider16(AnimationCallbackDispatcher animationCallbackDispatcher) {
            super(animationCallbackDispatcher);
            this.b = Choreographer.getInstance();
            this.c = new Choreographer.FrameCallback() { // from class: androidx.dynamicanimation.animation.AnimationHandler.FrameCallbackProvider16.1
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    AnimationHandler animationHandler = AnimationHandler.this;
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    ArrayList arrayList = animationHandler.b;
                    long jUptimeMillis2 = SystemClock.uptimeMillis();
                    for (int i = 0; i < arrayList.size(); i++) {
                        AnimationFrameCallback animationFrameCallback = (AnimationFrameCallback) arrayList.get(i);
                        if (animationFrameCallback != null) {
                            SimpleArrayMap simpleArrayMap = animationHandler.f2688a;
                            Long l = (Long) simpleArrayMap.get(animationFrameCallback);
                            if (l == null) {
                                animationFrameCallback.doAnimationFrame(jUptimeMillis);
                            } else if (l.longValue() < jUptimeMillis2) {
                                simpleArrayMap.remove(animationFrameCallback);
                                animationFrameCallback.doAnimationFrame(jUptimeMillis);
                            }
                        }
                    }
                    if (animationHandler.e) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            if (arrayList.get(size) == null) {
                                arrayList.remove(size);
                            }
                        }
                        animationHandler.e = false;
                    }
                    if (arrayList.size() > 0) {
                        if (animationHandler.d == null) {
                            animationHandler.d = new FrameCallbackProvider16(animationHandler.c);
                        }
                        animationHandler.d.a();
                    }
                }
            };
        }

        public final void a() {
            this.b.postFrameCallback(this.c);
        }
    }
}
