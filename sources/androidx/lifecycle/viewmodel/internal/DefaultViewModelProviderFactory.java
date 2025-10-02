package androidx.lifecycle.viewmodel.internal;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/viewmodel/internal/DefaultViewModelProviderFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DefaultViewModelProviderFactory implements ViewModelProvider.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final DefaultViewModelProviderFactory f2817a = new DefaultViewModelProviderFactory();

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel a(KClass modelClass, MutableCreationExtras mutableCreationExtras) {
        Intrinsics.h(modelClass, "modelClass");
        return JvmViewModelProviders.a(JvmClassMappingKt.b(modelClass));
    }
}
