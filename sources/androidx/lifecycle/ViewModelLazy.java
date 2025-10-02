package androidx.lifecycle;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/ViewModelLazy;", "Landroidx/lifecycle/ViewModel;", "VM", "Lkotlin/Lazy;", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ViewModelLazy<VM extends ViewModel> implements Lazy<VM> {
    public final KClass d;
    public final Function0 e;
    public final Function0 f;
    public final Function0 g;
    public ViewModel h;

    public ViewModelLazy(KClass viewModelClass, Function0 function0, Function0 function02, Function0 function03) {
        Intrinsics.h(viewModelClass, "viewModelClass");
        this.d = viewModelClass;
        this.e = function0;
        this.f = function02;
        this.g = function03;
    }

    @Override // kotlin.Lazy
    /* renamed from: getValue */
    public final Object getD() {
        ViewModel viewModel = this.h;
        if (viewModel != null) {
            return viewModel;
        }
        ViewModel viewModelA = ViewModelProvider.Companion.a((ViewModelStore) this.e.invoke(), (ViewModelProvider.Factory) this.f.invoke(), (CreationExtras) this.g.invoke()).a(this.d);
        this.h = viewModelA;
        return viewModelA;
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return this.h != null;
    }
}
