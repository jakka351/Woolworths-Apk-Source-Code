package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.internal.SynchronizedObject;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/viewmodel/ViewModelProviderImpl;", "", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ViewModelProviderImpl {

    /* renamed from: a, reason: collision with root package name */
    public final ViewModelStore f2815a;
    public final ViewModelProvider.Factory b;
    public final CreationExtras c;
    public final SynchronizedObject d;

    public ViewModelProviderImpl(ViewModelStore store, ViewModelProvider.Factory factory, CreationExtras defaultExtras) {
        Intrinsics.h(store, "store");
        Intrinsics.h(factory, "factory");
        Intrinsics.h(defaultExtras, "defaultExtras");
        this.f2815a = store;
        this.b = factory;
        this.c = defaultExtras;
        this.d = new SynchronizedObject();
    }

    public final ViewModel a(KClass modelClass, String key) {
        ViewModel viewModel;
        ViewModel viewModelC;
        Intrinsics.h(modelClass, "modelClass");
        Intrinsics.h(key, "key");
        synchronized (this.d) {
            try {
                ViewModelStore viewModelStore = this.f2815a;
                viewModelStore.getClass();
                viewModel = (ViewModel) viewModelStore.f2804a.get(key);
                if (modelClass.z(viewModel)) {
                    Object obj = this.b;
                    if (obj instanceof ViewModelProvider.OnRequeryFactory) {
                        Intrinsics.e(viewModel);
                        ((ViewModelProvider.OnRequeryFactory) obj).d(viewModel);
                    }
                    Intrinsics.f(viewModel, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
                } else {
                    MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(this.c);
                    mutableCreationExtras.f2811a.put(ViewModelProvider.b, key);
                    ViewModelProvider.Factory factory = this.b;
                    Intrinsics.h(factory, "factory");
                    try {
                        try {
                            viewModelC = factory.a(modelClass, mutableCreationExtras);
                        } catch (AbstractMethodError unused) {
                            viewModelC = factory.b(JvmClassMappingKt.b(modelClass), mutableCreationExtras);
                        }
                    } catch (AbstractMethodError unused2) {
                        viewModelC = factory.c(JvmClassMappingKt.b(modelClass));
                    }
                    viewModel = viewModelC;
                    ViewModelStore viewModelStore2 = this.f2815a;
                    viewModelStore2.getClass();
                    Intrinsics.h(viewModel, "viewModel");
                    ViewModel viewModel2 = (ViewModel) viewModelStore2.f2804a.put(key, viewModel);
                    if (viewModel2 != null) {
                        viewModel2.m6();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return viewModel;
    }
}
