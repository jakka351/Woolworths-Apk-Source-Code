package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher;", "", "Api33Impl", "Api34Impl", "LifecycleOnBackPressedCancellable", "OnBackPressedCancellable", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f57a;
    public final ArrayDeque b = new ArrayDeque();
    public OnBackPressedCallback c;
    public final OnBackInvokedCallback d;
    public OnBackInvokedDispatcher e;
    public boolean f;
    public boolean g;

    @RequiresApi
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$Api33Impl;", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Api33Impl {
        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.activity.k] */
        public static k a(final Function0 function0) {
            return new OnBackInvokedCallback() { // from class: androidx.activity.k
                public final void onBackInvoked() {
                    function0.invoke();
                }
            };
        }

        public static void b(Object dispatcher, Object callback) {
            Intrinsics.h(dispatcher, "dispatcher");
            Intrinsics.h(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(0, (OnBackInvokedCallback) callback);
        }

        public static void c(Object dispatcher, Object callback) {
            Intrinsics.h(dispatcher, "dispatcher");
            Intrinsics.h(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    @RequiresApi
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$Api34Impl;", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api34Impl {
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/activity/Cancellable;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class LifecycleOnBackPressedCancellable implements LifecycleEventObserver, Cancellable {
        public final Lifecycle d;
        public final OnBackPressedCallback e;
        public Cancellable f;
        public final /* synthetic */ OnBackPressedDispatcher g;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, Lifecycle lifecycle, OnBackPressedCallback onBackPressedCallback) {
            Intrinsics.h(onBackPressedCallback, "onBackPressedCallback");
            this.g = onBackPressedDispatcher;
            this.d = lifecycle;
            this.e = onBackPressedCallback;
            lifecycle.a(this);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void T(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START) {
                this.f = this.g.b(this.e);
                return;
            }
            if (event != Lifecycle.Event.ON_STOP) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    cancel();
                }
            } else {
                Cancellable cancellable = this.f;
                if (cancellable != null) {
                    ((OnBackPressedCancellable) cancellable).cancel();
                }
            }
        }

        @Override // androidx.activity.Cancellable
        public final void cancel() {
            this.d.c(this);
            this.e.b.remove(this);
            Cancellable cancellable = this.f;
            if (cancellable != null) {
                ((OnBackPressedCancellable) cancellable).cancel();
            }
            this.f = null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$OnBackPressedCancellable;", "Landroidx/activity/Cancellable;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class OnBackPressedCancellable implements Cancellable {
        public final OnBackPressedCallback d;
        public final /* synthetic */ OnBackPressedDispatcher e;

        public OnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, OnBackPressedCallback onBackPressedCallback) {
            Intrinsics.h(onBackPressedCallback, "onBackPressedCallback");
            this.e = onBackPressedDispatcher;
            this.d = onBackPressedCallback;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.FunctionReferenceImpl] */
        @Override // androidx.activity.Cancellable
        public final void cancel() {
            OnBackPressedDispatcher onBackPressedDispatcher = this.e;
            ArrayDeque arrayDeque = onBackPressedDispatcher.b;
            OnBackPressedCallback onBackPressedCallback = this.d;
            arrayDeque.remove(onBackPressedCallback);
            if (Intrinsics.c(onBackPressedDispatcher.c, onBackPressedCallback)) {
                onBackPressedCallback.d();
                onBackPressedDispatcher.c = null;
            }
            onBackPressedCallback.b.remove(this);
            ?? r0 = onBackPressedCallback.c;
            if (r0 != 0) {
                r0.invoke();
            }
            onBackPressedCallback.c = null;
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        OnBackInvokedCallback onBackInvokedCallbackA;
        this.f57a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                final Function1<BackEventCompat, Unit> function1 = new Function1<BackEventCompat, Unit>() { // from class: androidx.activity.OnBackPressedDispatcher.1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Object objPrevious;
                        BackEventCompat backEvent = (BackEventCompat) obj;
                        Intrinsics.h(backEvent, "backEvent");
                        OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                        ArrayDeque arrayDeque = onBackPressedDispatcher.b;
                        ListIterator<E> listIterator = arrayDeque.listIterator(arrayDeque.getK());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                objPrevious = null;
                                break;
                            }
                            objPrevious = listIterator.previous();
                            if (((OnBackPressedCallback) objPrevious).f56a) {
                                break;
                            }
                        }
                        OnBackPressedCallback onBackPressedCallback = (OnBackPressedCallback) objPrevious;
                        if (onBackPressedDispatcher.c != null) {
                            onBackPressedDispatcher.c();
                        }
                        onBackPressedDispatcher.c = onBackPressedCallback;
                        if (onBackPressedCallback != null) {
                            onBackPressedCallback.g(backEvent);
                        }
                        return Unit.f24250a;
                    }
                };
                final Function1<BackEventCompat, Unit> function12 = new Function1<BackEventCompat, Unit>() { // from class: androidx.activity.OnBackPressedDispatcher.2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Object objPrevious;
                        BackEventCompat backEvent = (BackEventCompat) obj;
                        Intrinsics.h(backEvent, "backEvent");
                        OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                        OnBackPressedCallback onBackPressedCallback = onBackPressedDispatcher.c;
                        if (onBackPressedCallback == null) {
                            ArrayDeque arrayDeque = onBackPressedDispatcher.b;
                            ListIterator<E> listIterator = arrayDeque.listIterator(arrayDeque.getK());
                            while (true) {
                                if (!listIterator.hasPrevious()) {
                                    objPrevious = null;
                                    break;
                                }
                                objPrevious = listIterator.previous();
                                if (((OnBackPressedCallback) objPrevious).f56a) {
                                    break;
                                }
                            }
                            onBackPressedCallback = (OnBackPressedCallback) objPrevious;
                        }
                        if (onBackPressedCallback != null) {
                            onBackPressedCallback.f(backEvent);
                        }
                        return Unit.f24250a;
                    }
                };
                final Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.activity.OnBackPressedDispatcher.3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        OnBackPressedDispatcher.this.d();
                        return Unit.f24250a;
                    }
                };
                final Function0<Unit> function02 = new Function0<Unit>() { // from class: androidx.activity.OnBackPressedDispatcher.4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        OnBackPressedDispatcher.this.c();
                        return Unit.f24250a;
                    }
                };
                onBackInvokedCallbackA = new OnBackAnimationCallback() { // from class: androidx.activity.OnBackPressedDispatcher$Api34Impl$createOnBackAnimationCallback$1
                    public final void onBackCancelled() {
                        function02.invoke();
                    }

                    public final void onBackInvoked() {
                        function0.invoke();
                    }

                    public final void onBackProgressed(BackEvent backEvent) {
                        Intrinsics.h(backEvent, "backEvent");
                        function12.invoke(new BackEventCompat(backEvent));
                    }

                    public final void onBackStarted(BackEvent backEvent) {
                        Intrinsics.h(backEvent, "backEvent");
                        function1.invoke(new BackEventCompat(backEvent));
                    }
                };
            } else {
                onBackInvokedCallbackA = Api33Impl.a(new Function0<Unit>() { // from class: androidx.activity.OnBackPressedDispatcher.5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        OnBackPressedDispatcher.this.d();
                        return Unit.f24250a;
                    }
                });
            }
            this.d = onBackInvokedCallbackA;
        }
    }

    public final void a(LifecycleOwner owner, OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.h(owner, "owner");
        Intrinsics.h(onBackPressedCallback, "onBackPressedCallback");
        Lifecycle lifecycle = owner.getD();
        if (lifecycle.getD() == Lifecycle.State.d) {
            return;
        }
        onBackPressedCallback.b.add(new LifecycleOnBackPressedCancellable(this, lifecycle, onBackPressedCallback));
        f();
        onBackPressedCallback.c = new OnBackPressedDispatcher$addCallback$1(0, this, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
    }

    public final Cancellable b(OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.h(onBackPressedCallback, "onBackPressedCallback");
        this.b.addLast(onBackPressedCallback);
        OnBackPressedCancellable onBackPressedCancellable = new OnBackPressedCancellable(this, onBackPressedCallback);
        onBackPressedCallback.b.add(onBackPressedCancellable);
        f();
        onBackPressedCallback.c = new OnBackPressedDispatcher$addCancellableCallback$1(0, this, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        return onBackPressedCancellable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void c() {
        OnBackPressedCallback onBackPressedCallbackPrevious;
        OnBackPressedCallback onBackPressedCallback = this.c;
        if (onBackPressedCallback == null) {
            ArrayDeque arrayDeque = this.b;
            ListIterator listIterator = arrayDeque.listIterator(arrayDeque.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    onBackPressedCallbackPrevious = 0;
                    break;
                } else {
                    onBackPressedCallbackPrevious = listIterator.previous();
                    if (((OnBackPressedCallback) onBackPressedCallbackPrevious).f56a) {
                        break;
                    }
                }
            }
            onBackPressedCallback = onBackPressedCallbackPrevious;
        }
        this.c = null;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void d() {
        OnBackPressedCallback onBackPressedCallbackPrevious;
        OnBackPressedCallback onBackPressedCallback = this.c;
        if (onBackPressedCallback == null) {
            ArrayDeque arrayDeque = this.b;
            ListIterator listIterator = arrayDeque.listIterator(arrayDeque.getK());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    onBackPressedCallbackPrevious = 0;
                    break;
                } else {
                    onBackPressedCallbackPrevious = listIterator.previous();
                    if (((OnBackPressedCallback) onBackPressedCallbackPrevious).f56a) {
                        break;
                    }
                }
            }
            onBackPressedCallback = onBackPressedCallbackPrevious;
        }
        this.c = null;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.e();
            return;
        }
        Runnable runnable = this.f57a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void e(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.d) == null) {
            return;
        }
        if (z && !this.f) {
            Api33Impl.b(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = true;
        } else {
            if (z || !this.f) {
                return;
            }
            Api33Impl.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = false;
        }
    }

    public final void f() {
        boolean z = this.g;
        boolean z2 = false;
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque == null || !arrayDeque.isEmpty()) {
            Iterator<E> it = arrayDeque.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((OnBackPressedCallback) it.next()).f56a) {
                    z2 = true;
                    break;
                }
            }
        }
        this.g = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        e(z2);
    }
}
