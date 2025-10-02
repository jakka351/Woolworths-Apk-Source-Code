package androidx.compose.ui.platform;

import android.os.Looper;
import android.view.View;
import androidx.compose.runtime.Latch;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements WindowRecomposerFactory {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.platform.WindowRecomposerFactory
    public final Recomposer a(final View view) {
        CoroutineContext coroutineContext;
        final PausableMonotonicFrameClock pausableMonotonicFrameClock;
        LinkedHashMap linkedHashMap = WindowRecomposer_androidKt.f1991a;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.d;
        Lazy lazy = AndroidUiDispatcher.p;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            coroutineContext = (CoroutineContext) AndroidUiDispatcher.p.getD();
        } else {
            coroutineContext = AndroidUiDispatcher.q.get();
            if (coroutineContext == null) {
                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
            }
        }
        CoroutineContext coroutineContextPlus = coroutineContext.plus(emptyCoroutineContext);
        MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) coroutineContextPlus.get(MonotonicFrameClock.Key.d);
        if (monotonicFrameClock != null) {
            PausableMonotonicFrameClock pausableMonotonicFrameClock2 = new PausableMonotonicFrameClock(monotonicFrameClock);
            Latch latch = pausableMonotonicFrameClock2.e;
            synchronized (latch.f1643a) {
                latch.d = false;
            }
            pausableMonotonicFrameClock = pausableMonotonicFrameClock2;
        } else {
            pausableMonotonicFrameClock = 0;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        CoroutineContext motionDurationScaleImpl = (MotionDurationScale) coroutineContextPlus.get(MotionDurationScale.Key.d);
        if (motionDurationScaleImpl == null) {
            motionDurationScaleImpl = new MotionDurationScaleImpl();
            objectRef.d = motionDurationScaleImpl;
        }
        if (pausableMonotonicFrameClock != 0) {
            emptyCoroutineContext = pausableMonotonicFrameClock;
        }
        CoroutineContext coroutineContextPlus2 = coroutineContextPlus.plus(emptyCoroutineContext).plus(motionDurationScaleImpl);
        final Recomposer recomposer = new Recomposer(coroutineContextPlus2);
        synchronized (recomposer.b) {
            recomposer.t = true;
        }
        final ContextScope contextScopeA = CoroutineScopeKt.a(coroutineContextPlus2);
        LifecycleOwner lifecycleOwnerA = ViewTreeLifecycleOwner.a(view);
        Lifecycle d = lifecycleOwnerA != null ? lifecycleOwnerA.getD() : null;
        if (d != null) {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$1
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view2) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view2) {
                    view.removeOnAttachStateChangeListener(this);
                    recomposer.x();
                }
            });
            d.a(new LifecycleEventObserver() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2

                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {

                    /* renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f1992a;

                    static {
                        int[] iArr = new int[Lifecycle.Event.values().length];
                        try {
                            iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 6;
                        } catch (NoSuchFieldError unused6) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
                        } catch (NoSuchFieldError unused7) {
                        }
                        f1992a = iArr;
                    }
                }

                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void T(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    boolean z;
                    int i = WhenMappings.f1992a[event.ordinal()];
                    CancellableContinuation cancellableContinuationZ = null;
                    if (i == 1) {
                        BuildersKt.c(contextScopeA, null, CoroutineStart.g, new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(objectRef, recomposer, lifecycleOwner, this, view, null), 1);
                        return;
                    }
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return;
                            }
                            recomposer.x();
                            return;
                        } else {
                            Recomposer recomposer2 = recomposer;
                            synchronized (recomposer2.b) {
                                recomposer2.t = true;
                            }
                            return;
                        }
                    }
                    PausableMonotonicFrameClock pausableMonotonicFrameClock3 = pausableMonotonicFrameClock;
                    if (pausableMonotonicFrameClock3 != null) {
                        Latch latch2 = pausableMonotonicFrameClock3.e;
                        synchronized (latch2.f1643a) {
                            try {
                                synchronized (latch2.f1643a) {
                                    z = latch2.d;
                                }
                                if (!z) {
                                    ArrayList arrayList = latch2.b;
                                    latch2.b = latch2.c;
                                    latch2.c = arrayList;
                                    latch2.d = true;
                                    int size = arrayList.size();
                                    for (int i2 = 0; i2 < size; i2++) {
                                        ((Continuation) arrayList.get(i2)).resumeWith(Unit.f24250a);
                                    }
                                    arrayList.clear();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    Recomposer recomposer3 = recomposer;
                    synchronized (recomposer3.b) {
                        if (recomposer3.t) {
                            recomposer3.t = false;
                            cancellableContinuationZ = recomposer3.z();
                        }
                    }
                    if (cancellableContinuationZ != null) {
                        ((CancellableContinuationImpl) cancellableContinuationZ).resumeWith(Unit.f24250a);
                    }
                }
            });
            return recomposer;
        }
        InlineClassHelperKt.c("ViewTreeLifecycleOwner not found from " + view);
        throw new KotlinNothingValueException();
    }
}
