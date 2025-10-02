package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/viewmodel/InitializerViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InitializerViewModelFactory implements ViewModelProvider.Factory {

    /* renamed from: a, reason: collision with root package name */
    public final ViewModelInitializer[] f2812a;

    public InitializerViewModelFactory(ViewModelInitializer... initializers) {
        Intrinsics.h(initializers, "initializers");
        this.f2812a = initializers;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel b(Class cls, MutableCreationExtras mutableCreationExtras) {
        ViewModel viewModel;
        ViewModelInitializer viewModelInitializer;
        Function1 function1;
        KClass kClassE = JvmClassMappingKt.e(cls);
        ViewModelInitializer[] viewModelInitializerArr = this.f2812a;
        ViewModelInitializer[] initializers = (ViewModelInitializer[]) Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length);
        Intrinsics.h(initializers, "initializers");
        int length = initializers.length;
        int i = 0;
        while (true) {
            viewModel = null;
            if (i >= length) {
                viewModelInitializer = null;
                break;
            }
            viewModelInitializer = initializers[i];
            if (Intrinsics.c(viewModelInitializer.f2814a, kClassE)) {
                break;
            }
            i++;
        }
        if (viewModelInitializer != null && (function1 = viewModelInitializer.b) != null) {
            viewModel = (ViewModel) function1.invoke(mutableCreationExtras);
        }
        if (viewModel != null) {
            return viewModel;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + kClassE.x()).toString());
    }
}
