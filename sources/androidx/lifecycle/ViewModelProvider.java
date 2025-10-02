package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.lifecycle.viewmodel.ViewModelProviderImpl;
import androidx.lifecycle.viewmodel.internal.DefaultViewModelProviderFactory;
import androidx.lifecycle.viewmodel.internal.JvmViewModelProviders;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/ViewModelProvider;", "", "Factory", "OnRequeryFactory", "NewInstanceFactory", "AndroidViewModelFactory", "Companion", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class ViewModelProvider {
    public static final ViewModelProvider$special$$inlined$Key$1 b = new ViewModelProvider$special$$inlined$Key$1();

    /* renamed from: a, reason: collision with root package name */
    public final ViewModelProviderImpl f2802a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "Companion", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static class AndroidViewModelFactory extends NewInstanceFactory {
        public static AndroidViewModelFactory c;
        public static final ViewModelProvider$AndroidViewModelFactory$special$$inlined$Key$1 d = new ViewModelProvider$AndroidViewModelFactory$special$$inlined$Key$1();
        public final Application b;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory$Companion;", "", "Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "_instance", "Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "Landroid/app/Application;", "APPLICATION_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
        }

        public AndroidViewModelFactory(Application application) {
            this.b = application;
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        public final ViewModel b(Class cls, MutableCreationExtras mutableCreationExtras) {
            if (this.b != null) {
                return c(cls);
            }
            Application application = (Application) mutableCreationExtras.f2811a.get(d);
            if (application != null) {
                return d(cls, application);
            }
            if (AndroidViewModel.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return JvmViewModelProviders.a(cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        public final ViewModel c(Class cls) {
            Application application = this.b;
            if (application != null) {
                return d(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        public final ViewModel d(Class cls, Application application) {
            if (!AndroidViewModel.class.isAssignableFrom(cls)) {
                return JvmViewModelProviders.a(cls);
            }
            try {
                ViewModel viewModel = (ViewModel) cls.getConstructor(Application.class).newInstance(application);
                Intrinsics.e(viewModel);
                return viewModel;
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Companion;", "", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "", "VIEW_MODEL_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static ViewModelProvider a(ViewModelStore store, Factory factory, CreationExtras extras) {
            Intrinsics.h(store, "store");
            Intrinsics.h(factory, "factory");
            Intrinsics.h(extras, "extras");
            return new ViewModelProvider(store, factory, extras);
        }

        public static ViewModelProvider b(ViewModelStoreOwner owner, Factory factory, int i) {
            if ((i & 2) != 0) {
                Intrinsics.h(owner, "owner");
                factory = owner instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) owner).getDefaultViewModelProviderFactory() : DefaultViewModelProviderFactory.f2817a;
            }
            Intrinsics.h(owner, "owner");
            CreationExtras extras = owner instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) owner).getDefaultViewModelCreationExtras() : CreationExtras.Empty.b;
            Intrinsics.h(owner, "owner");
            Intrinsics.h(factory, "factory");
            Intrinsics.h(extras, "extras");
            return new ViewModelProvider(owner.getViewModelStore(), factory, extras);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory;", "", "Companion", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory$Companion;", "", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
        }

        default ViewModel a(KClass modelClass, MutableCreationExtras mutableCreationExtras) {
            Intrinsics.h(modelClass, "modelClass");
            return b(JvmClassMappingKt.b(modelClass), mutableCreationExtras);
        }

        default ViewModel b(Class cls, MutableCreationExtras mutableCreationExtras) {
            return c(cls);
        }

        default ViewModel c(Class cls) {
            throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Companion", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class NewInstanceFactory implements Factory {

        /* renamed from: a, reason: collision with root package name */
        public static NewInstanceFactory f2803a;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory$Companion;", "", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "_instance", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "", "VIEW_MODEL_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final ViewModel a(KClass modelClass, MutableCreationExtras mutableCreationExtras) {
            Intrinsics.h(modelClass, "modelClass");
            return b(JvmClassMappingKt.b(modelClass), mutableCreationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel b(Class cls, MutableCreationExtras mutableCreationExtras) {
            return c(cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel c(Class cls) {
            return JvmViewModelProviders.a(cls);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @RestrictTo
    public static class OnRequeryFactory {
        public void d(ViewModel viewModel) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(ViewModelStore store, Factory factory) {
        this(store, factory, CreationExtras.Empty.b);
        Intrinsics.h(store, "store");
    }

    public final ViewModel a(KClass modelClass) {
        Intrinsics.h(modelClass, "modelClass");
        String strX = modelClass.x();
        if (strX == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return this.f2802a.a(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strX));
    }

    public ViewModelProvider(ViewModelStore store, Factory factory, CreationExtras defaultCreationExtras) {
        Intrinsics.h(store, "store");
        Intrinsics.h(factory, "factory");
        Intrinsics.h(defaultCreationExtras, "defaultCreationExtras");
        this.f2802a = new ViewModelProviderImpl(store, factory, defaultCreationExtras);
    }
}
