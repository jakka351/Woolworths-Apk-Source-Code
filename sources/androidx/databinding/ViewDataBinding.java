package androidx.databinding;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.CallbackRegistry;
import androidx.databinding.Observable;
import androidx.databinding.ObservableList;
import androidx.databinding.ObservableMap;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.viewbinding.ViewBinding;
import com.woolworths.R;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public abstract class ViewDataBinding extends BaseObservable implements ViewBinding {
    public static final boolean t = true;
    public final Runnable e;
    public boolean f;
    public final WeakListener[] g;
    public final View h;
    public boolean i;
    public final Choreographer j;
    public final Choreographer.FrameCallback k;
    public final Handler l;
    public final DataBindingComponent m;
    public ViewDataBinding n;
    public LifecycleOwner o;
    public OnStartListener p;
    public boolean q;
    public boolean r;
    public static final int s = Build.VERSION.SDK_INT;
    public static final AnonymousClass1 u = new AnonymousClass1();
    public static final AnonymousClass4 v = new AnonymousClass4();
    public static final ReferenceQueue w = new ReferenceQueue();
    public static final View.OnAttachStateChangeListener x = new AnonymousClass6();

    /* renamed from: androidx.databinding.ViewDataBinding$1, reason: invalid class name */
    public class AnonymousClass1 implements CreateWeakListener {
        @Override // androidx.databinding.CreateWeakListener
        public final WeakListener a(ViewDataBinding viewDataBinding, int i, ReferenceQueue referenceQueue) {
            return new WeakPropertyListener(viewDataBinding, i, referenceQueue).d;
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$2, reason: invalid class name */
    public class AnonymousClass2 implements CreateWeakListener {
        @Override // androidx.databinding.CreateWeakListener
        public final WeakListener a(ViewDataBinding viewDataBinding, int i, ReferenceQueue referenceQueue) {
            return new WeakListListener(viewDataBinding, i, referenceQueue).d;
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$3, reason: invalid class name */
    public class AnonymousClass3 implements CreateWeakListener {
        @Override // androidx.databinding.CreateWeakListener
        public final WeakListener a(ViewDataBinding viewDataBinding, int i, ReferenceQueue referenceQueue) {
            return new WeakMapListener(viewDataBinding, i, referenceQueue).d;
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$4, reason: invalid class name */
    public class AnonymousClass4 implements CreateWeakListener {
        @Override // androidx.databinding.CreateWeakListener
        public final WeakListener a(ViewDataBinding viewDataBinding, int i, ReferenceQueue referenceQueue) {
            return new LiveDataListener(viewDataBinding, i, referenceQueue).d;
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$5, reason: invalid class name */
    public class AnonymousClass5 extends CallbackRegistry.NotifierCallback<OnRebindCallback, ViewDataBinding, Void> {
        @Override // androidx.databinding.CallbackRegistry.NotifierCallback
        public final void a(int i, Object obj, Object obj2, Object obj3) {
            OnRebindCallback onRebindCallback = (OnRebindCallback) obj;
            if (i == 1) {
                onRebindCallback.getClass();
            } else if (i == 2) {
                onRebindCallback.getClass();
            } else {
                if (i != 3) {
                    return;
                }
                onRebindCallback.getClass();
            }
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$6, reason: invalid class name */
    public class AnonymousClass6 implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            ((AnonymousClass7) ViewDataBinding.m(view).e).run();
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$7, reason: invalid class name */
    public class AnonymousClass7 implements Runnable {
        public AnonymousClass7() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this) {
                ViewDataBinding.this.f = false;
            }
            while (true) {
                Reference referencePoll = ViewDataBinding.w.poll();
                if (referencePoll == null) {
                    break;
                } else if (referencePoll instanceof WeakListener) {
                    ((WeakListener) referencePoll).b();
                }
            }
            if (ViewDataBinding.this.h.isAttachedToWindow()) {
                ViewDataBinding.this.l();
                return;
            }
            View view = ViewDataBinding.this.h;
            View.OnAttachStateChangeListener onAttachStateChangeListener = ViewDataBinding.x;
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            ViewDataBinding.this.h.addOnAttachStateChangeListener(onAttachStateChangeListener);
        }
    }

    public static class IncludedLayouts {

        /* renamed from: a, reason: collision with root package name */
        public final String[][] f2548a;
        public final int[][] b;
        public final int[][] c;

        public IncludedLayouts(int i) {
            this.f2548a = new String[i][];
            this.b = new int[i][];
            this.c = new int[i][];
        }

        public final void a(int i, int[] iArr, int[] iArr2, String[] strArr) {
            this.f2548a[i] = strArr;
            this.b[i] = iArr;
            this.c[i] = iArr2;
        }
    }

    public static class LiveDataListener implements Observer, ObservableReference<LiveData<?>> {
        public final WeakListener d;
        public WeakReference e = null;

        public LiveDataListener(ViewDataBinding viewDataBinding, int i, ReferenceQueue referenceQueue) {
            this.d = new WeakListener(viewDataBinding, i, this, referenceQueue);
        }

        @Override // androidx.databinding.ObservableReference
        public final void b(LifecycleOwner lifecycleOwner) {
            WeakReference weakReference = this.e;
            LifecycleOwner lifecycleOwner2 = weakReference == null ? null : (LifecycleOwner) weakReference.get();
            LiveData liveData = (LiveData) this.d.c;
            if (liveData != null) {
                if (lifecycleOwner2 != null) {
                    liveData.k(this);
                }
                if (lifecycleOwner != null) {
                    liveData.f(lifecycleOwner, this);
                }
            }
            if (lifecycleOwner != null) {
                this.e = new WeakReference(lifecycleOwner);
            }
        }

        @Override // androidx.databinding.ObservableReference
        public final void c(Object obj) {
            ((LiveData) obj).k(this);
        }

        @Override // androidx.databinding.ObservableReference
        public final void d(Object obj) {
            LiveData liveData = (LiveData) obj;
            WeakReference weakReference = this.e;
            LifecycleOwner lifecycleOwner = weakReference == null ? null : (LifecycleOwner) weakReference.get();
            if (lifecycleOwner != null) {
                liveData.f(lifecycleOwner, this);
            }
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            WeakListener weakListener = this.d;
            ViewDataBinding viewDataBindingA = weakListener.a();
            if (viewDataBindingA != null) {
                viewDataBindingA.o(weakListener.b, 0, weakListener.c);
            }
        }
    }

    public static class OnStartListener implements LifecycleObserver {
        public final WeakReference d;

        public OnStartListener(ViewDataBinding viewDataBinding) {
            this.d = new WeakReference(viewDataBinding);
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        public void onStart() {
            ViewDataBinding viewDataBinding = (ViewDataBinding) this.d.get();
            if (viewDataBinding != null) {
                viewDataBinding.l();
            }
        }
    }

    public static abstract class PropertyChangedInverseListener extends Observable.OnPropertyChangedCallback implements InverseBindingListener {
        @Override // androidx.databinding.Observable.OnPropertyChangedCallback
        public final void e(Observable observable, int i) {
            if (i == 0 || i == 0) {
                a();
            }
        }
    }

    public static class WeakListListener extends ObservableList.OnListChangedCallback implements ObservableReference<ObservableList> {
        public final WeakListener d;

        public WeakListListener(ViewDataBinding viewDataBinding, int i, ReferenceQueue referenceQueue) {
            this.d = new WeakListener(viewDataBinding, i, this, referenceQueue);
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public final void a(ObservableList observableList) {
            ObservableList observableList2;
            WeakListener weakListener = this.d;
            ViewDataBinding viewDataBindingA = weakListener.a();
            if (viewDataBindingA != null && (observableList2 = (ObservableList) weakListener.c) == observableList) {
                viewDataBindingA.o(weakListener.b, 0, observableList2);
            }
        }

        @Override // androidx.databinding.ObservableReference
        public final void b(LifecycleOwner lifecycleOwner) {
        }

        @Override // androidx.databinding.ObservableReference
        public final void c(Object obj) {
            ((ObservableList) obj).b1(this);
        }

        @Override // androidx.databinding.ObservableReference
        public final void d(Object obj) {
            ((ObservableList) obj).O0(this);
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public final void e(ObservableList observableList) {
            a(observableList);
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public final void f(ObservableList observableList) {
            a(observableList);
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public final void g(ObservableList observableList) {
            a(observableList);
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public final void h(ObservableList observableList) {
            a(observableList);
        }
    }

    public static class WeakMapListener extends ObservableMap.OnMapChangedCallback implements ObservableReference<ObservableMap> {
        public final WeakListener d;

        public WeakMapListener(ViewDataBinding viewDataBinding, int i, ReferenceQueue referenceQueue) {
            this.d = new WeakListener(viewDataBinding, i, this, referenceQueue);
        }

        @Override // androidx.databinding.ObservableMap.OnMapChangedCallback
        public final void a(ObservableMap observableMap) {
            WeakListener weakListener = this.d;
            ViewDataBinding viewDataBindingA = weakListener.a();
            if (viewDataBindingA == null || observableMap != weakListener.c) {
                return;
            }
            viewDataBindingA.o(weakListener.b, 0, observableMap);
        }

        @Override // androidx.databinding.ObservableReference
        public final void b(LifecycleOwner lifecycleOwner) {
        }

        @Override // androidx.databinding.ObservableReference
        public final void c(Object obj) {
            ((ObservableMap) obj).x1(this);
        }

        @Override // androidx.databinding.ObservableReference
        public final void d(Object obj) {
            ((ObservableMap) obj).i0(this);
        }
    }

    public static class WeakPropertyListener extends Observable.OnPropertyChangedCallback implements ObservableReference<Observable> {
        public final WeakListener d;

        public WeakPropertyListener(ViewDataBinding viewDataBinding, int i, ReferenceQueue referenceQueue) {
            this.d = new WeakListener(viewDataBinding, i, this, referenceQueue);
        }

        @Override // androidx.databinding.ObservableReference
        public final void b(LifecycleOwner lifecycleOwner) {
        }

        @Override // androidx.databinding.ObservableReference
        public final void c(Object obj) {
            ((Observable) obj).f(this);
        }

        @Override // androidx.databinding.ObservableReference
        public final void d(Object obj) {
            ((Observable) obj).e(this);
        }

        @Override // androidx.databinding.Observable.OnPropertyChangedCallback
        public final void e(Observable observable, int i) {
            WeakListener weakListener = this.d;
            ViewDataBinding viewDataBindingA = weakListener.a();
            if (viewDataBindingA != null && ((Observable) weakListener.c) == observable) {
                viewDataBindingA.o(weakListener.b, i, observable);
            }
        }
    }

    public ViewDataBinding(Object obj, View view, int i) {
        DataBindingComponent dataBindingComponentI = i(obj);
        this.e = new AnonymousClass7();
        this.f = false;
        this.m = dataBindingComponentI;
        this.g = new WeakListener[i];
        this.h = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        if (t) {
            this.j = Choreographer.getInstance();
            this.k = new Choreographer.FrameCallback() { // from class: androidx.databinding.ViewDataBinding.8
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    ((AnonymousClass7) ViewDataBinding.this.e).run();
                }
            };
        } else {
            this.k = null;
            this.l = new Handler(Looper.myLooper());
        }
    }

    public static boolean B(Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static DataBindingComponent i(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof DataBindingComponent) {
            return (DataBindingComponent) obj;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    public static ViewDataBinding m(View view) {
        if (view != null) {
            return (ViewDataBinding) view.getTag(R.id.dataBinding);
        }
        return null;
    }

    public static int n(int i, View view) {
        return view.getContext().getColor(i);
    }

    public static ViewDataBinding q(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z, Object obj) {
        return DataBindingUtil.c(layoutInflater, i, viewGroup, z, i(obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void s(androidx.databinding.DataBindingComponent r20, android.view.View r21, java.lang.Object[] r22, androidx.databinding.ViewDataBinding.IncludedLayouts r23, android.util.SparseIntArray r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.s(androidx.databinding.DataBindingComponent, android.view.View, java.lang.Object[], androidx.databinding.ViewDataBinding$IncludedLayouts, android.util.SparseIntArray, boolean):void");
    }

    public static Object[] t(DataBindingComponent dataBindingComponent, View view, int i, IncludedLayouts includedLayouts, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i];
        s(dataBindingComponent, view, objArr, includedLayouts, sparseIntArray, true);
        return objArr;
    }

    public static Object[] u(DataBindingComponent dataBindingComponent, View[] viewArr, int i, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i];
        for (View view : viewArr) {
            s(dataBindingComponent, view, objArr, null, sparseIntArray, true);
        }
        return objArr;
    }

    public static int z(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public void D(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner instanceof Fragment) {
            Log.w("DataBinding", "Setting the fragment as the LifecycleOwner might cause memory leaks because views lives shorter than the Fragment. Consider using Fragment's view lifecycle");
        }
        LifecycleOwner lifecycleOwner2 = this.o;
        if (lifecycleOwner2 == lifecycleOwner) {
            return;
        }
        if (lifecycleOwner2 != null) {
            lifecycleOwner2.getD().c(this.p);
        }
        this.o = lifecycleOwner;
        if (lifecycleOwner != null) {
            if (this.p == null) {
                this.p = new OnStartListener(this);
            }
            lifecycleOwner.getD().a(this.p);
        }
        for (WeakListener weakListener : this.g) {
            if (weakListener != null) {
                weakListener.f2552a.b(lifecycleOwner);
            }
        }
    }

    public final void E(View view) {
        view.setTag(R.id.dataBinding, this);
    }

    public final void F(View[] viewArr) {
        for (View view : viewArr) {
            view.setTag(R.id.dataBinding, this);
        }
    }

    public abstract boolean G(int i, Object obj);

    public final void H() {
        for (WeakListener weakListener : this.g) {
            if (weakListener != null) {
                weakListener.b();
            }
        }
    }

    public final void I(int i, LiveData liveData) {
        this.q = true;
        try {
            K(i, liveData, v);
        } finally {
            this.q = false;
        }
    }

    public final void J(int i, BaseObservable baseObservable) {
        K(i, baseObservable, u);
    }

    public final boolean K(int i, Object obj, CreateWeakListener createWeakListener) {
        WeakListener[] weakListenerArr = this.g;
        if (obj == null) {
            WeakListener weakListener = weakListenerArr[i];
            if (weakListener != null) {
                return weakListener.b();
            }
            return false;
        }
        WeakListener weakListener2 = weakListenerArr[i];
        if (weakListener2 == null) {
            x(i, obj, createWeakListener);
            return true;
        }
        if (weakListener2.c == obj) {
            return false;
        }
        if (weakListener2 != null) {
            weakListener2.b();
        }
        x(i, obj, createWeakListener);
        return true;
    }

    public abstract void j();

    public final void k() {
        if (this.i) {
            y();
        } else if (p()) {
            this.i = true;
            j();
            this.i = false;
        }
    }

    public final void l() {
        ViewDataBinding viewDataBinding = this.n;
        if (viewDataBinding == null) {
            k();
        } else {
            viewDataBinding.l();
        }
    }

    public final void o(int i, int i2, Object obj) {
        if (this.q || this.r || !w(i, i2, obj)) {
            return;
        }
        y();
    }

    public abstract boolean p();

    public abstract void r();

    public abstract boolean w(int i, int i2, Object obj);

    public final void x(int i, Object obj, CreateWeakListener createWeakListener) {
        if (obj == null) {
            return;
        }
        WeakListener[] weakListenerArr = this.g;
        WeakListener weakListenerA = weakListenerArr[i];
        if (weakListenerA == null) {
            weakListenerA = createWeakListener.a(this, i, w);
            weakListenerArr[i] = weakListenerA;
            LifecycleOwner lifecycleOwner = this.o;
            if (lifecycleOwner != null) {
                weakListenerA.f2552a.b(lifecycleOwner);
            }
        }
        weakListenerA.b();
        weakListenerA.c = obj;
        weakListenerA.f2552a.d(obj);
    }

    public final void y() {
        ViewDataBinding viewDataBinding = this.n;
        if (viewDataBinding != null) {
            viewDataBinding.y();
            return;
        }
        LifecycleOwner lifecycleOwner = this.o;
        if (lifecycleOwner == null || lifecycleOwner.getD().getD().compareTo(Lifecycle.State.g) >= 0) {
            synchronized (this) {
                try {
                    if (this.f) {
                        return;
                    }
                    this.f = true;
                    if (t) {
                        this.j.postFrameCallback(this.k);
                    } else {
                        this.l.post(this.e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
