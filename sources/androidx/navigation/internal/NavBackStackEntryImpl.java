package androidx.navigation.internal;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavViewModelStoreProvider;
import androidx.navigation.internal.NavBackStackEntryImpl;
import androidx.os.SavedStateRegistryController;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/navigation/internal/NavBackStackEntryImpl;", "", "SavedStateViewModel", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class NavBackStackEntryImpl {

    /* renamed from: a, reason: collision with root package name */
    public final NavBackStackEntry f3507a;
    public final NavDestination b;
    public final Bundle c;
    public Lifecycle.State d;
    public final NavViewModelStoreProvider e;
    public final String f;
    public final Bundle g;
    public final SavedStateRegistryController h;
    public boolean i;
    public final Lazy j;
    public final LifecycleRegistry k;
    public Lifecycle.State l;
    public final SavedStateViewModelFactory m;
    public final Lazy n;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/navigation/internal/NavBackStackEntryImpl$SavedStateViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/SavedStateHandle;", "handle", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SavedStateViewModel extends ViewModel {
        public final SavedStateHandle e;

        public SavedStateViewModel(@NotNull SavedStateHandle handle) {
            Intrinsics.h(handle, "handle");
            this.e = handle;
        }
    }

    public NavBackStackEntryImpl(NavBackStackEntry navBackStackEntry) {
        this.f3507a = navBackStackEntry;
        this.b = navBackStackEntry.e;
        this.c = navBackStackEntry.f;
        this.d = navBackStackEntry.g;
        this.e = navBackStackEntry.h;
        this.f = navBackStackEntry.i;
        this.g = navBackStackEntry.j;
        this.h = SavedStateRegistryController.Companion.a(navBackStackEntry);
        final int i = 1;
        Lazy lazyB = LazyKt.b(new Function0() { // from class: androidx.navigation.internal.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
                        initializerViewModelFactoryBuilder.a(Reflection.f24268a.b(NavBackStackEntryImpl.SavedStateViewModel.class), new b(0));
                        return initializerViewModelFactoryBuilder.b();
                    default:
                        return new SavedStateViewModelFactory();
                }
            }
        });
        this.j = lazyB;
        this.k = new LifecycleRegistry(navBackStackEntry, true);
        this.l = Lifecycle.State.e;
        this.m = (SavedStateViewModelFactory) lazyB.getD();
        final int i2 = 0;
        this.n = LazyKt.b(new Function0() { // from class: androidx.navigation.internal.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
                        initializerViewModelFactoryBuilder.a(Reflection.f24268a.b(NavBackStackEntryImpl.SavedStateViewModel.class), new b(0));
                        return initializerViewModelFactoryBuilder.b();
                    default:
                        return new SavedStateViewModelFactory();
                }
            }
        });
    }

    public final Bundle a() {
        Bundle bundle = this.c;
        if (bundle == null) {
            return null;
        }
        Bundle bundleA = BundleKt.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
        bundleA.putAll(bundle);
        return bundleA;
    }

    public final SavedStateHandle b() {
        if (!this.i) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (this.k.d == Lifecycle.State.d) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
        }
        return ((SavedStateViewModel) ViewModelProvider.Companion.b(this.f3507a, (ViewModelProvider.Factory) this.n.getD(), 4).a(Reflection.f24268a.b(SavedStateViewModel.class))).e;
    }

    public final void c() {
        if (!this.i) {
            SavedStateRegistryController savedStateRegistryController = this.h;
            savedStateRegistryController.f3732a.a();
            this.i = true;
            if (this.e != null) {
                SavedStateHandleSupport.b(this.f3507a);
            }
            savedStateRegistryController.a(this.g);
        }
        int iOrdinal = this.d.ordinal();
        int iOrdinal2 = this.l.ordinal();
        LifecycleRegistry lifecycleRegistry = this.k;
        if (iOrdinal < iOrdinal2) {
            lifecycleRegistry.h(this.d);
        } else {
            lifecycleRegistry.h(this.l);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Reflection.f24268a.b(NavBackStackEntry.class).B());
        sb.append("(" + this.f + ')');
        sb.append(" destination=");
        sb.append(this.b);
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }
}
