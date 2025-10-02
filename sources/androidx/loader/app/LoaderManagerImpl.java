package androidx.loader.app;

import android.os.Looper;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayCompatKt;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.constraintlayout.core.state.a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import kotlin.jvm.JvmClassMappingKt;

/* loaded from: classes2.dex */
class LoaderManagerImpl extends LoaderManager {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2819a;
    public final LoaderViewModel b;

    public static class LoaderInfo<D> extends MutableLiveData<D> implements Loader.OnLoadCompleteListener<D> {
        public final int l;
        public final Loader m;
        public Object n;
        public LoaderObserver o;

        public LoaderInfo(int i, Loader loader) {
            this.l = i;
            this.m = loader;
            loader.registerListener(i, this);
        }

        @Override // androidx.loader.content.Loader.OnLoadCompleteListener
        public final void a(Object obj) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                super.m(obj);
            } else {
                j(obj);
            }
        }

        @Override // androidx.lifecycle.LiveData
        public final void h() {
            this.m.startLoading();
        }

        @Override // androidx.lifecycle.LiveData
        public final void i() {
            this.m.stopLoading();
        }

        @Override // androidx.lifecycle.LiveData
        public final void k(Observer observer) {
            super.k(observer);
            this.n = null;
            this.o = null;
        }

        public final void n() {
            Loader loader = this.m;
            loader.cancelLoad();
            loader.abandon();
            LoaderObserver loaderObserver = this.o;
            if (loaderObserver != null) {
                k(loaderObserver);
                if (loaderObserver.f) {
                    loaderObserver.e.onLoaderReset(loaderObserver.d);
                }
            }
            loader.unregisterListener(this);
            if (loaderObserver != null) {
                boolean z = loaderObserver.f;
            }
            loader.reset();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.LifecycleOwner, java.lang.Object] */
        public final void o() {
            ?? r0 = this.n;
            LoaderObserver loaderObserver = this.o;
            if (r0 == 0 || loaderObserver == null) {
                return;
            }
            super.k(loaderObserver);
            f(r0, loaderObserver);
        }

        public final String toString() {
            StringBuilder sbO = a.o(64, "LoaderInfo{");
            sbO.append(Integer.toHexString(System.identityHashCode(this)));
            sbO.append(" #");
            sbO.append(this.l);
            sbO.append(" : ");
            Class<?> cls = this.m.getClass();
            sbO.append(cls.getSimpleName());
            sbO.append("{");
            sbO.append(Integer.toHexString(System.identityHashCode(cls)));
            sbO.append("}}");
            return sbO.toString();
        }
    }

    public static class LoaderObserver<D> implements Observer<D> {
        public final Loader d;
        public final LoaderManager.LoaderCallbacks e;
        public boolean f = false;

        public LoaderObserver(Loader loader, LoaderManager.LoaderCallbacks loaderCallbacks) {
            this.d = loader;
            this.e = loaderCallbacks;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            this.f = true;
            this.e.onLoadFinished(this.d, obj);
        }

        public final String toString() {
            return this.e.toString();
        }
    }

    public static class LoaderViewModel extends ViewModel {
        public static final ViewModelProvider.Factory g = new AnonymousClass1();
        public final SparseArrayCompat e = new SparseArrayCompat(0);
        public boolean f = false;

        /* renamed from: androidx.loader.app.LoaderManagerImpl$LoaderViewModel$1, reason: invalid class name */
        public static class AnonymousClass1 implements ViewModelProvider.Factory {
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final ViewModel c(Class cls) {
                return new LoaderViewModel();
            }
        }

        @Override // androidx.lifecycle.ViewModel
        public final void o6() {
            SparseArrayCompat sparseArrayCompat = this.e;
            int iE = sparseArrayCompat.e();
            for (int i = 0; i < iE; i++) {
                ((LoaderInfo) sparseArrayCompat.f(i)).n();
            }
            int i2 = sparseArrayCompat.g;
            Object[] objArr = sparseArrayCompat.f;
            for (int i3 = 0; i3 < i2; i3++) {
                objArr[i3] = null;
            }
            sparseArrayCompat.g = 0;
            sparseArrayCompat.d = false;
        }
    }

    public LoaderManagerImpl(LifecycleOwner lifecycleOwner, ViewModelStore viewModelStore) {
        this.f2819a = lifecycleOwner;
        this.b = (LoaderViewModel) new ViewModelProvider(viewModelStore, LoaderViewModel.g).a(JvmClassMappingKt.e(LoaderViewModel.class));
    }

    @Override // androidx.loader.app.LoaderManager
    public final void a() {
        LoaderViewModel loaderViewModel = this.b;
        boolean z = loaderViewModel.f;
        SparseArrayCompat sparseArrayCompat = loaderViewModel.e;
        if (z) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        sparseArrayCompat.getClass();
        LoaderInfo loaderInfo = (LoaderInfo) SparseArrayCompatKt.b(sparseArrayCompat, 54321);
        if (loaderInfo != null) {
            loaderInfo.n();
            sparseArrayCompat.getClass();
            int iA = ContainerHelpersKt.a(sparseArrayCompat.g, 54321, sparseArrayCompat.e);
            if (iA >= 0) {
                Object[] objArr = sparseArrayCompat.f;
                Object obj = objArr[iA];
                Object obj2 = SparseArrayCompatKt.f704a;
                if (obj != obj2) {
                    objArr[iA] = obj2;
                    sparseArrayCompat.d = true;
                }
            }
        }
    }

    @Override // androidx.loader.app.LoaderManager
    public final void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        SparseArrayCompat sparseArrayCompat = this.b.e;
        if (sparseArrayCompat.e() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < sparseArrayCompat.e(); i++) {
                LoaderInfo loaderInfo = (LoaderInfo) sparseArrayCompat.f(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(sparseArrayCompat.c(i));
                printWriter.print(": ");
                printWriter.println(loaderInfo.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(loaderInfo.l);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                Loader loader = loaderInfo.m;
                printWriter.println(loader);
                loader.dump(str2 + "  ", fileDescriptor, printWriter, strArr);
                if (loaderInfo.o != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(loaderInfo.o);
                    LoaderObserver loaderObserver = loaderInfo.o;
                    loaderObserver.getClass();
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(loaderObserver.f);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                printWriter.println(loader.dataToString(loaderInfo.e()));
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(loaderInfo.c > 0);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.LifecycleOwner, java.lang.Object] */
    @Override // androidx.loader.app.LoaderManager
    public final Loader d(int i, LoaderManager.LoaderCallbacks loaderCallbacks) {
        LoaderViewModel loaderViewModel = this.b;
        boolean z = loaderViewModel.f;
        SparseArrayCompat sparseArrayCompat = loaderViewModel.e;
        if (z) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        sparseArrayCompat.getClass();
        LoaderInfo loaderInfo = (LoaderInfo) SparseArrayCompatKt.b(sparseArrayCompat, i);
        ?? r3 = this.f2819a;
        if (loaderInfo != 0) {
            Loader loader = loaderInfo.m;
            LoaderObserver loaderObserver = new LoaderObserver(loader, loaderCallbacks);
            loaderInfo.f(r3, loaderObserver);
            LoaderObserver loaderObserver2 = loaderInfo.o;
            if (loaderObserver2 != null) {
                loaderInfo.k(loaderObserver2);
            }
            loaderInfo.n = r3;
            loaderInfo.o = loaderObserver;
            return loader;
        }
        try {
            loaderViewModel.f = true;
            Loader loaderOnCreateLoader = loaderCallbacks.onCreateLoader(i, null);
            if (loaderOnCreateLoader == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (loaderOnCreateLoader.getClass().isMemberClass() && !Modifier.isStatic(loaderOnCreateLoader.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + loaderOnCreateLoader);
            }
            LoaderInfo loaderInfo2 = new LoaderInfo(i, loaderOnCreateLoader);
            sparseArrayCompat.d(i, loaderInfo2);
            loaderViewModel.f = false;
            Loader loader2 = loaderInfo2.m;
            LoaderObserver loaderObserver3 = new LoaderObserver(loader2, loaderCallbacks);
            loaderInfo2.f(r3, loaderObserver3);
            LoaderObserver loaderObserver4 = loaderInfo2.o;
            if (loaderObserver4 != null) {
                loaderInfo2.k(loaderObserver4);
            }
            loaderInfo2.n = r3;
            loaderInfo2.o = loaderObserver3;
            return loader2;
        } catch (Throwable th) {
            loaderViewModel.f = false;
            throw th;
        }
    }

    @Override // androidx.loader.app.LoaderManager
    public final void e() {
        SparseArrayCompat sparseArrayCompat = this.b.e;
        int iE = sparseArrayCompat.e();
        for (int i = 0; i < iE; i++) {
            ((LoaderInfo) sparseArrayCompat.f(i)).o();
        }
    }

    public final String toString() {
        StringBuilder sbO = a.o(128, "LoaderManager{");
        sbO.append(Integer.toHexString(System.identityHashCode(this)));
        sbO.append(" in ");
        Class<?> cls = this.f2819a.getClass();
        sbO.append(cls.getSimpleName());
        sbO.append("{");
        sbO.append(Integer.toHexString(System.identityHashCode(cls)));
        sbO.append("}}");
        return sbO.toString();
    }
}
