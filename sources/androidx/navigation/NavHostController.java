package androidx.navigation;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.navigation.internal.NavControllerImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/navigation/NavHostController;", "Landroidx/navigation/NavController;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class NavHostController extends NavController {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostController(@NotNull Context context) {
        super(context);
        Intrinsics.h(context, "context");
    }

    public final void j(LifecycleOwner owner) {
        Lifecycle d;
        Intrinsics.h(owner, "owner");
        NavControllerImpl navControllerImpl = this.b;
        androidx.compose.material3.internal.a aVar = navControllerImpl.s;
        if (owner.equals(navControllerImpl.o)) {
            return;
        }
        LifecycleOwner lifecycleOwner = navControllerImpl.o;
        if (lifecycleOwner != null && (d = lifecycleOwner.getD()) != null) {
            d.c(aVar);
        }
        navControllerImpl.o = owner;
        owner.getD().a(aVar);
    }

    public final void k(ViewModelStore viewModelStore) {
        Intrinsics.h(viewModelStore, "viewModelStore");
        NavControllerImpl navControllerImpl = this.b;
        navControllerImpl.getClass();
        NavControllerViewModel navControllerViewModel = navControllerImpl.p;
        InitializerViewModelFactory initializerViewModelFactory = NavControllerViewModelKt.f3477a;
        CreationExtras.Empty empty = CreationExtras.Empty.b;
        ViewModelProvider viewModelProviderA = ViewModelProvider.Companion.a(viewModelStore, initializerViewModelFactory, empty);
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        if (Intrinsics.c(navControllerViewModel, (NavControllerViewModel) viewModelProviderA.a(reflectionFactory.b(NavControllerViewModel.class)))) {
            return;
        }
        if (!navControllerImpl.f.isEmpty()) {
            throw new IllegalStateException("ViewModelStore should be set before setGraph call");
        }
        navControllerImpl.p = (NavControllerViewModel) ViewModelProvider.Companion.a(viewModelStore, initializerViewModelFactory, empty).a(reflectionFactory.b(NavControllerViewModel.class));
    }
}
