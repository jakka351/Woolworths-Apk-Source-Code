package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.internal.WeakReference;
import androidx.os.compose.LocalSavedStateRegistryOwnerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"navigation-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class NavBackStackEntryProviderKt {
    public static final void a(NavBackStackEntry navBackStackEntry, final SaveableStateHolder saveableStateHolder, final ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(233973821);
        if ((((composerImplV.I(navBackStackEntry) ? 4 : 2) | i | (composerImplV.I(saveableStateHolder) ? 32 : 16)) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CompositionLocalKt.b(new ProvidedValue[]{LocalViewModelStoreOwner.f2816a.b(navBackStackEntry), LocalLifecycleOwnerKt.f2808a.b(navBackStackEntry), LocalSavedStateRegistryOwnerKt.f3733a.b(navBackStackEntry)}, ComposableLambdaKt.c(1808964477, new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavBackStackEntryProviderKt$LocalOwnersProvider$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        NavBackStackEntryProviderKt.b(saveableStateHolder, composableLambdaImpl, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 56);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new n(navBackStackEntry, saveableStateHolder, composableLambdaImpl, i);
        }
    }

    public static final void b(SaveableStateHolder saveableStateHolder, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(832919318);
        int i2 = (composerImplV.I(saveableStateHolder) ? 4 : 2) | i | (composerImplV.I(composableLambdaImpl) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new androidx.navigation.a(9);
                composerImplV.A(objG);
            }
            Function1 function1 = (Function1) objG;
            ViewModelStoreOwner viewModelStoreOwnerA = LocalViewModelStoreOwner.a(composerImplV);
            if (viewModelStoreOwnerA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            KClass kClassB = reflectionFactory.b(BackStackEntryIdViewModel.class);
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.a(reflectionFactory.b(BackStackEntryIdViewModel.class), function1);
            BackStackEntryIdViewModel backStackEntryIdViewModel = (BackStackEntryIdViewModel) ViewModelKt.a(viewModelStoreOwnerA, kClassB, initializerViewModelFactoryBuilder.b(), viewModelStoreOwnerA instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwnerA).getDefaultViewModelCreationExtras() : CreationExtras.Empty.b);
            backStackEntryIdViewModel.f = new WeakReference(saveableStateHolder);
            saveableStateHolder.f(backStackEntryIdViewModel.e, composableLambdaImpl, composerImplV, ((i2 << 6) & 896) | (i2 & 112));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(saveableStateHolder, i, 1, composableLambdaImpl);
        }
    }
}
