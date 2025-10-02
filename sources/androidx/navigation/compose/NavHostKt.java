package androidx.navigation.compose;

import androidx.collection.MutableObjectFloatMap;
import androidx.collection.ObjectFloatMapKt;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.SizeTransform;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import androidx.navigation.compose.ComposeNavigator;
import androidx.navigation.compose.internal.NavComposeUtils_androidKt;
import androidx.navigation.internal.NavControllerImpl;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004¨\u0006\t²\u0006\u0012\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\nX\u008a\u0084\u0002²\u0006\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "Landroidx/navigation/NavBackStackEntry;", "currentBackStack", "", "progress", "", "inPredictiveBack", "allVisibleEntries", "visibleEntries", "navigation-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class NavHostKt {
    public static final void a(final NavHostController navHostController, final NavGraph graph, final Modifier modifier, final Alignment alignment, final Function1 function1, final Function1 function12, final Function1 function13, final Function1 function14, Composer composer, final int i) {
        int i2;
        final Modifier modifier2;
        final Alignment alignment2;
        final Function1 function15;
        Function1 function16;
        final ComposeNavigator composeNavigator;
        MutableState mutableState;
        ComposerImpl composerImpl;
        NavigatorProvider navigatorProvider;
        DialogNavigator dialogNavigator;
        int i3;
        SaveableStateHolder saveableStateHolder;
        MutableObjectFloatMap mutableObjectFloatMap;
        NavBackStackEntry navBackStackEntry;
        boolean z;
        Function1 function17;
        final State state;
        ComposeNavigator composeNavigator2;
        ComposerImpl composerImplV = composer.v(-1964664536);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(navHostController) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(graph) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i2 |= composerImplV.n(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        if ((i & 3072) == 0) {
            alignment2 = alignment;
            i2 |= composerImplV.n(alignment2) ? 2048 : 1024;
        } else {
            alignment2 = alignment;
        }
        if ((i & 24576) == 0) {
            function15 = function1;
            i2 |= composerImplV.I(function15) ? 16384 : 8192;
        } else {
            function15 = function1;
        }
        if ((196608 & i) == 0) {
            function16 = function12;
            i2 |= composerImplV.I(function16) ? 131072 : 65536;
        } else {
            function16 = function12;
        }
        if ((i & 1572864) == 0) {
            i2 |= composerImplV.I(function13) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= composerImplV.I(function14) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= composerImplV.I(null) ? 67108864 : 33554432;
        }
        if ((i2 & 38347923) == 38347922 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImplV.u0();
            if ((i & 1) != 0 && !composerImplV.c0()) {
                composerImplV.j();
            }
            composerImplV.W();
            Object obj = (LifecycleOwner) composerImplV.x(LocalLifecycleOwnerKt.f2808a);
            ViewModelStoreOwner viewModelStoreOwnerA = LocalViewModelStoreOwner.a(composerImplV);
            if (viewModelStoreOwnerA == null) {
                throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
            }
            navHostController.k(viewModelStoreOwnerA.getD());
            NavControllerImpl navControllerImpl = navHostController.b;
            Intrinsics.h(graph, "graph");
            navControllerImpl.getClass();
            NavigatorProvider navigatorProvider2 = navControllerImpl.t;
            navControllerImpl.q(graph, null);
            Navigator navigatorB = navigatorProvider2.b("composable");
            ComposeNavigator composeNavigator3 = navigatorB instanceof ComposeNavigator ? (ComposeNavigator) navigatorB : null;
            if (composeNavigator3 == null) {
                RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
                if (recomposeScopeImplX != null) {
                    final int i4 = 2;
                    final Function1 function18 = function16;
                    recomposeScopeImplX.d = new Function2() { // from class: androidx.navigation.compose.m
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            switch (i4) {
                                case 0:
                                    ((Integer) obj3).getClass();
                                    NavHostKt.a(navHostController, graph, modifier2, alignment2, function15, function18, function13, function14, (Composer) obj2, RecomposeScopeImplKt.a(i | 1));
                                    break;
                                case 1:
                                    ((Integer) obj3).getClass();
                                    NavHostKt.a(navHostController, graph, modifier2, alignment2, function15, function18, function13, function14, (Composer) obj2, RecomposeScopeImplKt.a(i | 1));
                                    break;
                                default:
                                    ((Integer) obj3).getClass();
                                    NavHostKt.a(navHostController, graph, modifier2, alignment2, function15, function18, function13, function14, (Composer) obj2, RecomposeScopeImplKt.a(i | 1));
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    return;
                }
                return;
            }
            MutableState mutableStateA = SnapshotStateKt.a(composeNavigator3.b().e, composerImplV);
            Object objG = composerImplV.G();
            Object obj2 = Composer.Companion.f1624a;
            if (objG == obj2) {
                objG = PrimitiveSnapshotStateKt.a(BitmapDescriptorFactory.HUE_RED);
                composerImplV.A(objG);
            }
            MutableFloatState mutableFloatState = (MutableFloatState) objG;
            Object objG2 = composerImplV.G();
            if (objG2 == obj2) {
                objG2 = SnapshotStateKt.f(Boolean.FALSE);
                composerImplV.A(objG2);
            }
            final MutableState mutableState2 = (MutableState) objG2;
            boolean z2 = ((List) mutableStateA.getD()).size() > 1;
            boolean zN = composerImplV.n(mutableStateA) | composerImplV.I(composeNavigator3);
            Object objG3 = composerImplV.G();
            if (zN || objG3 == obj2) {
                ComposeNavigator composeNavigator4 = composeNavigator3;
                objG3 = new NavHostKt$NavHost$25$1(composeNavigator4, mutableStateA, mutableFloatState, mutableState2, null);
                composeNavigator = composeNavigator4;
                mutableState = mutableStateA;
                composerImplV.A(objG3);
            } else {
                ComposeNavigator composeNavigator5 = composeNavigator3;
                mutableState = mutableStateA;
                composeNavigator = composeNavigator5;
            }
            NavComposeUtils_androidKt.a(z2, (Function2) objG3, composerImplV, 0);
            boolean zI = composerImplV.I(navHostController) | composerImplV.I(obj);
            Object objG4 = composerImplV.G();
            if (zI || objG4 == obj2) {
                objG4 = new androidx.lifecycle.f(5, navHostController, obj);
                composerImplV.A(objG4);
            }
            EffectsKt.c(obj, (Function1) objG4, composerImplV);
            SaveableStateHolder saveableStateHolderA = SaveableStateHolderKt.a(composerImplV);
            MutableState mutableStateA2 = SnapshotStateKt.a(navControllerImpl.j, composerImplV);
            Object objG5 = composerImplV.G();
            if (objG5 == obj2) {
                objG5 = SnapshotStateKt.d(new g(mutableStateA2, 1));
                composerImplV.A(objG5);
            }
            State state2 = (State) objG5;
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) CollectionsKt.P((List) state2.getD());
            Object objG6 = composerImplV.G();
            if (objG6 == obj2) {
                int i5 = ObjectFloatMapKt.f691a;
                objG6 = new MutableObjectFloatMap();
                composerImplV.A(objG6);
            }
            MutableObjectFloatMap mutableObjectFloatMap2 = (MutableObjectFloatMap) objG6;
            if (navBackStackEntry2 != null) {
                composerImplV.o(-1797897781);
                boolean zI2 = composerImplV.I(composeNavigator) | ((((3670016 & i2) ^ 1572864) > 1048576 && composerImplV.n(function13)) || (i2 & 1572864) == 1048576) | ((57344 & i2) == 16384);
                Object objG7 = composerImplV.G();
                if (zI2 || objG7 == obj2) {
                    final int i6 = 1;
                    i3 = i2;
                    saveableStateHolder = saveableStateHolderA;
                    mutableObjectFloatMap = mutableObjectFloatMap2;
                    navBackStackEntry = navBackStackEntry2;
                    z = true;
                    Object obj3 = new Function1() { // from class: androidx.navigation.compose.j
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            Function1 function19;
                            Function1 function110;
                            Function1 function111;
                            Function1 function112;
                            int i7 = i6;
                            Object obj5 = null;
                            MutableState mutableState3 = mutableState2;
                            Function1 function113 = function1;
                            Function1 function114 = function13;
                            ComposeNavigator composeNavigator6 = composeNavigator;
                            AnimatedContentTransitionScope animatedContentTransitionScope = (AnimatedContentTransitionScope) obj4;
                            switch (i7) {
                                case 0:
                                    NavDestination navDestination = ((NavBackStackEntry) animatedContentTransitionScope.getF778a()).e;
                                    Intrinsics.f(navDestination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    ComposeNavigator.Destination destination = (ComposeNavigator.Destination) navDestination;
                                    if (((Boolean) ((SnapshotMutableStateImpl) composeNavigator6.c).getD()).booleanValue() || ((Boolean) mutableState3.getD()).booleanValue()) {
                                        int i8 = NavDestination.i;
                                        Iterator f24664a = NavDestination.Companion.b(destination).getF24664a();
                                        while (true) {
                                            if (f24664a.hasNext()) {
                                                NavDestination navDestination2 = (NavDestination) f24664a.next();
                                                ExitTransition exitTransition = (!(navDestination2 instanceof ComposeNavigator.Destination) || (function19 = ((ComposeNavigator.Destination) navDestination2).n) == null) ? null : (ExitTransition) function19.invoke(animatedContentTransitionScope);
                                                if (exitTransition != null) {
                                                    obj5 = exitTransition;
                                                }
                                            }
                                        }
                                        return obj5 == null ? (ExitTransition) function114.invoke(animatedContentTransitionScope) : obj5;
                                    }
                                    int i9 = NavDestination.i;
                                    Iterator f24664a2 = NavDestination.Companion.b(destination).getF24664a();
                                    while (true) {
                                        if (f24664a2.hasNext()) {
                                            NavDestination navDestination3 = (NavDestination) f24664a2.next();
                                            ExitTransition exitTransition2 = (!(navDestination3 instanceof ComposeNavigator.Destination) || (function110 = ((ComposeNavigator.Destination) navDestination3).l) == null) ? null : (ExitTransition) function110.invoke(animatedContentTransitionScope);
                                            if (exitTransition2 != null) {
                                                obj5 = exitTransition2;
                                            }
                                        }
                                    }
                                    return obj5 == null ? (ExitTransition) function113.invoke(animatedContentTransitionScope) : obj5;
                                default:
                                    NavDestination navDestination4 = ((NavBackStackEntry) animatedContentTransitionScope.getB()).e;
                                    Intrinsics.f(navDestination4, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    ComposeNavigator.Destination destination2 = (ComposeNavigator.Destination) navDestination4;
                                    if (((Boolean) ((SnapshotMutableStateImpl) composeNavigator6.c).getD()).booleanValue() || ((Boolean) mutableState3.getD()).booleanValue()) {
                                        int i10 = NavDestination.i;
                                        Iterator f24664a3 = NavDestination.Companion.b(destination2).getF24664a();
                                        while (true) {
                                            if (f24664a3.hasNext()) {
                                                NavDestination navDestination5 = (NavDestination) f24664a3.next();
                                                EnterTransition enterTransition = (!(navDestination5 instanceof ComposeNavigator.Destination) || (function111 = ((ComposeNavigator.Destination) navDestination5).m) == null) ? null : (EnterTransition) function111.invoke(animatedContentTransitionScope);
                                                if (enterTransition != null) {
                                                    obj5 = enterTransition;
                                                }
                                            }
                                        }
                                        return obj5 == null ? (EnterTransition) function114.invoke(animatedContentTransitionScope) : obj5;
                                    }
                                    int i11 = NavDestination.i;
                                    Iterator f24664a4 = NavDestination.Companion.b(destination2).getF24664a();
                                    while (true) {
                                        if (f24664a4.hasNext()) {
                                            NavDestination navDestination6 = (NavDestination) f24664a4.next();
                                            EnterTransition enterTransition2 = (!(navDestination6 instanceof ComposeNavigator.Destination) || (function112 = ((ComposeNavigator.Destination) navDestination6).k) == null) ? null : (EnterTransition) function112.invoke(animatedContentTransitionScope);
                                            if (enterTransition2 != null) {
                                                obj5 = enterTransition2;
                                            }
                                        }
                                    }
                                    return obj5 == null ? (EnterTransition) function113.invoke(animatedContentTransitionScope) : obj5;
                            }
                        }
                    };
                    composerImplV.A(obj3);
                    objG7 = obj3;
                } else {
                    i3 = i2;
                    saveableStateHolder = saveableStateHolderA;
                    mutableObjectFloatMap = mutableObjectFloatMap2;
                    navBackStackEntry = navBackStackEntry2;
                    z = true;
                }
                Function1 function19 = (Function1) objG7;
                boolean zI3 = composerImplV.I(composeNavigator) | (((((29360128 & i3) ^ 12582912) <= 8388608 || !composerImplV.n(function14)) && (i3 & 12582912) != 8388608) ? false : z) | ((458752 & i3) == 131072 ? z : false);
                Object objG8 = composerImplV.G();
                if (zI3 || objG8 == obj2) {
                    final int i7 = 0;
                    function17 = function19;
                    Object obj4 = new Function1() { // from class: androidx.navigation.compose.j
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj42) {
                            Function1 function192;
                            Function1 function110;
                            Function1 function111;
                            Function1 function112;
                            int i72 = i7;
                            Object obj5 = null;
                            MutableState mutableState3 = mutableState2;
                            Function1 function113 = function12;
                            Function1 function114 = function14;
                            ComposeNavigator composeNavigator6 = composeNavigator;
                            AnimatedContentTransitionScope animatedContentTransitionScope = (AnimatedContentTransitionScope) obj42;
                            switch (i72) {
                                case 0:
                                    NavDestination navDestination = ((NavBackStackEntry) animatedContentTransitionScope.getF778a()).e;
                                    Intrinsics.f(navDestination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    ComposeNavigator.Destination destination = (ComposeNavigator.Destination) navDestination;
                                    if (((Boolean) ((SnapshotMutableStateImpl) composeNavigator6.c).getD()).booleanValue() || ((Boolean) mutableState3.getD()).booleanValue()) {
                                        int i8 = NavDestination.i;
                                        Iterator f24664a = NavDestination.Companion.b(destination).getF24664a();
                                        while (true) {
                                            if (f24664a.hasNext()) {
                                                NavDestination navDestination2 = (NavDestination) f24664a.next();
                                                ExitTransition exitTransition = (!(navDestination2 instanceof ComposeNavigator.Destination) || (function192 = ((ComposeNavigator.Destination) navDestination2).n) == null) ? null : (ExitTransition) function192.invoke(animatedContentTransitionScope);
                                                if (exitTransition != null) {
                                                    obj5 = exitTransition;
                                                }
                                            }
                                        }
                                        return obj5 == null ? (ExitTransition) function114.invoke(animatedContentTransitionScope) : obj5;
                                    }
                                    int i9 = NavDestination.i;
                                    Iterator f24664a2 = NavDestination.Companion.b(destination).getF24664a();
                                    while (true) {
                                        if (f24664a2.hasNext()) {
                                            NavDestination navDestination3 = (NavDestination) f24664a2.next();
                                            ExitTransition exitTransition2 = (!(navDestination3 instanceof ComposeNavigator.Destination) || (function110 = ((ComposeNavigator.Destination) navDestination3).l) == null) ? null : (ExitTransition) function110.invoke(animatedContentTransitionScope);
                                            if (exitTransition2 != null) {
                                                obj5 = exitTransition2;
                                            }
                                        }
                                    }
                                    return obj5 == null ? (ExitTransition) function113.invoke(animatedContentTransitionScope) : obj5;
                                default:
                                    NavDestination navDestination4 = ((NavBackStackEntry) animatedContentTransitionScope.getB()).e;
                                    Intrinsics.f(navDestination4, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    ComposeNavigator.Destination destination2 = (ComposeNavigator.Destination) navDestination4;
                                    if (((Boolean) ((SnapshotMutableStateImpl) composeNavigator6.c).getD()).booleanValue() || ((Boolean) mutableState3.getD()).booleanValue()) {
                                        int i10 = NavDestination.i;
                                        Iterator f24664a3 = NavDestination.Companion.b(destination2).getF24664a();
                                        while (true) {
                                            if (f24664a3.hasNext()) {
                                                NavDestination navDestination5 = (NavDestination) f24664a3.next();
                                                EnterTransition enterTransition = (!(navDestination5 instanceof ComposeNavigator.Destination) || (function111 = ((ComposeNavigator.Destination) navDestination5).m) == null) ? null : (EnterTransition) function111.invoke(animatedContentTransitionScope);
                                                if (enterTransition != null) {
                                                    obj5 = enterTransition;
                                                }
                                            }
                                        }
                                        return obj5 == null ? (EnterTransition) function114.invoke(animatedContentTransitionScope) : obj5;
                                    }
                                    int i11 = NavDestination.i;
                                    Iterator f24664a4 = NavDestination.Companion.b(destination2).getF24664a();
                                    while (true) {
                                        if (f24664a4.hasNext()) {
                                            NavDestination navDestination6 = (NavDestination) f24664a4.next();
                                            EnterTransition enterTransition2 = (!(navDestination6 instanceof ComposeNavigator.Destination) || (function112 = ((ComposeNavigator.Destination) navDestination6).k) == null) ? null : (EnterTransition) function112.invoke(animatedContentTransitionScope);
                                            if (enterTransition2 != null) {
                                                obj5 = enterTransition2;
                                            }
                                        }
                                    }
                                    return obj5 == null ? (EnterTransition) function113.invoke(animatedContentTransitionScope) : obj5;
                            }
                        }
                    };
                    composerImplV.A(obj4);
                    objG8 = obj4;
                } else {
                    function17 = function19;
                }
                final Function1 function110 = (Function1) objG8;
                boolean z3 = (234881024 & i3) == 67108864 ? z : false;
                Object objG9 = composerImplV.G();
                if (z3 || objG9 == obj2) {
                    objG9 = new androidx.navigation.a(11);
                    composerImplV.A(objG9);
                }
                final Function1 function111 = (Function1) objG9;
                Boolean bool = Boolean.TRUE;
                boolean zI4 = composerImplV.I(composeNavigator);
                final MutableState mutableState3 = mutableState2;
                Object objG10 = composerImplV.G();
                if (zI4 || objG10 == obj2) {
                    objG10 = new androidx.lifecycle.f(4, state2, composeNavigator);
                    composerImplV.A(objG10);
                }
                EffectsKt.c(bool, (Function1) objG10, composerImplV);
                Object objG11 = composerImplV.G();
                if (objG11 == obj2) {
                    objG11 = new SeekableTransitionState(navBackStackEntry);
                    composerImplV.A(objG11);
                }
                final SeekableTransitionState seekableTransitionState = (SeekableTransitionState) objG11;
                Transition transitionE = TransitionKt.e(seekableTransitionState, "entry", composerImplV, 56);
                if (((Boolean) mutableState3.getD()).booleanValue()) {
                    composerImplV.o(-1795663766);
                    Float fValueOf = Float.valueOf(mutableFloatState.a());
                    boolean zN2 = composerImplV.n(mutableState) | composerImplV.I(seekableTransitionState);
                    state = state2;
                    Object objG12 = composerImplV.G();
                    if (zN2 || objG12 == obj2) {
                        navigatorProvider = navigatorProvider2;
                        objG12 = new NavHostKt$NavHost$28$1(seekableTransitionState, mutableState, mutableFloatState, null);
                        composerImplV.A(objG12);
                    } else {
                        navigatorProvider = navigatorProvider2;
                    }
                    EffectsKt.e(composerImplV, fValueOf, (Function2) objG12);
                    composerImplV.V(false);
                    dialogNavigator = null;
                } else {
                    navigatorProvider = navigatorProvider2;
                    state = state2;
                    composerImplV.o(-1795408729);
                    boolean zI5 = composerImplV.I(seekableTransitionState) | composerImplV.I(navBackStackEntry) | composerImplV.n(transitionE);
                    Object objG13 = composerImplV.G();
                    if (zI5 || objG13 == obj2) {
                        dialogNavigator = null;
                        objG13 = new NavHostKt$NavHost$29$1(seekableTransitionState, navBackStackEntry, transitionE, null);
                        composerImplV.A(objG13);
                    } else {
                        dialogNavigator = null;
                    }
                    EffectsKt.e(composerImplV, navBackStackEntry, (Function2) objG13);
                    composerImplV.V(false);
                }
                boolean zI6 = composerImplV.I(mutableObjectFloatMap) | composerImplV.I(composeNavigator) | composerImplV.n(function17) | composerImplV.n(function110) | composerImplV.n(function111);
                Object objG14 = composerImplV.G();
                if (zI6 || objG14 == obj2) {
                    final ComposeNavigator composeNavigator6 = composeNavigator;
                    final Function1 function112 = function17;
                    final MutableObjectFloatMap mutableObjectFloatMap3 = mutableObjectFloatMap;
                    objG14 = new Function1() { // from class: androidx.navigation.compose.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            float f;
                            AnimatedContentTransitionScope animatedContentTransitionScope = (AnimatedContentTransitionScope) obj5;
                            if (!((List) state.getD()).contains(animatedContentTransitionScope.getF778a())) {
                                return AnimatedContentKt.d(EnterTransition.f722a, ExitTransition.f723a);
                            }
                            String str = ((NavBackStackEntry) animatedContentTransitionScope.getF778a()).i;
                            MutableObjectFloatMap mutableObjectFloatMap4 = mutableObjectFloatMap3;
                            int iB = mutableObjectFloatMap4.b(str);
                            if (iB >= 0) {
                                f = mutableObjectFloatMap4.c[iB];
                            } else {
                                mutableObjectFloatMap4.g(str, BitmapDescriptorFactory.HUE_RED);
                                f = 0.0f;
                            }
                            if (!Intrinsics.c(((NavBackStackEntry) animatedContentTransitionScope.getB()).i, ((NavBackStackEntry) animatedContentTransitionScope.getF778a()).i)) {
                                f = (((Boolean) ((SnapshotMutableStateImpl) composeNavigator6.c).getD()).booleanValue() || ((Boolean) mutableState3.getD()).booleanValue()) ? f - 1.0f : f + 1.0f;
                            }
                            mutableObjectFloatMap4.g(((NavBackStackEntry) animatedContentTransitionScope.getB()).i, f);
                            return new ContentTransform((EnterTransition) function112.invoke(animatedContentTransitionScope), (ExitTransition) function110.invoke(animatedContentTransitionScope), f, (SizeTransform) function111.invoke(animatedContentTransitionScope));
                        }
                    };
                    composeNavigator2 = composeNavigator6;
                    mutableState3 = mutableState3;
                    composerImplV.A(objG14);
                } else {
                    composeNavigator2 = composeNavigator;
                }
                Function1 function113 = (Function1) objG14;
                Object objG15 = composerImplV.G();
                if (objG15 == obj2) {
                    objG15 = new androidx.navigation.a(13);
                    composerImplV.A(objG15);
                }
                final MutableState mutableState4 = mutableState3;
                final State state3 = state;
                final NavBackStackEntry navBackStackEntry3 = navBackStackEntry;
                final SaveableStateHolder saveableStateHolder2 = saveableStateHolder;
                AnimatedContentKt.a(transitionE, modifier, function113, alignment, (Function1) objG15, ComposableLambdaKt.c(820763100, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$32
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r0v8 */
                    /* JADX WARN: Type inference failed for: r0v9 */
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                        NavBackStackEntry navBackStackEntryPrevious;
                        final AnimatedContentScope animatedContentScope = (AnimatedContentScope) obj5;
                        final NavBackStackEntry navBackStackEntry4 = (NavBackStackEntry) obj6;
                        Composer composer2 = (Composer) obj7;
                        ((Number) obj8).intValue();
                        boolean zC = Intrinsics.c(((SnapshotMutableStateImpl) seekableTransitionState.c).getD(), navBackStackEntry3);
                        if (!((Boolean) mutableState4.getD()).booleanValue() && !zC) {
                            List list = (List) state3.getD();
                            ListIterator listIterator = list.listIterator(list.size());
                            while (true) {
                                if (!listIterator.hasPrevious()) {
                                    navBackStackEntryPrevious = 0;
                                    break;
                                }
                                navBackStackEntryPrevious = listIterator.previous();
                                if (Intrinsics.c(navBackStackEntry4, (NavBackStackEntry) navBackStackEntryPrevious)) {
                                    break;
                                }
                            }
                            navBackStackEntry4 = navBackStackEntryPrevious;
                        }
                        if (navBackStackEntry4 == null) {
                            composer2.o(105930796);
                        } else {
                            composer2.o(-1520603531);
                            NavBackStackEntryProviderKt.a(navBackStackEntry4, saveableStateHolder2, ComposableLambdaKt.c(-1263531443, new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$32.1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj9, Object obj10) {
                                    Composer composer3 = (Composer) obj9;
                                    if ((((Number) obj10).intValue() & 3) == 2 && composer3.c()) {
                                        composer3.j();
                                    } else {
                                        NavBackStackEntry navBackStackEntry5 = navBackStackEntry4;
                                        NavDestination navDestination = navBackStackEntry5.e;
                                        Intrinsics.f(navDestination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                        ((ComposeNavigator.Destination) navDestination).j.invoke(animatedContentScope, navBackStackEntry5, composer3, 0);
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer2), composer2, KyberEngine.KyberPolyBytes);
                        }
                        composer2.l();
                        return Unit.f24250a;
                    }
                }, composerImplV), composerImplV, ((i3 >> 3) & 112) | 221184 | (i3 & 7168));
                composerImpl = composerImplV;
                Object objA = transitionE.f776a.a();
                Object d = ((SnapshotMutableStateImpl) transitionE.d).getD();
                boolean zN3 = composerImpl.n(transitionE) | composerImpl.I(navHostController) | composerImpl.I(navBackStackEntry) | composerImpl.I(composeNavigator2) | composerImpl.I(mutableObjectFloatMap);
                Object objG16 = composerImpl.G();
                if (zN3 || objG16 == obj2) {
                    Object navHostKt$NavHost$33$1 = new NavHostKt$NavHost$33$1(transitionE, navHostController, navBackStackEntry, mutableObjectFloatMap, state3, composeNavigator2, null);
                    composerImpl.A(navHostKt$NavHost$33$1);
                    objG16 = navHostKt$NavHost$33$1;
                }
                EffectsKt.f(objA, d, (Function2) objG16, composerImpl);
                composerImpl.V(false);
            } else {
                composerImpl = composerImplV;
                navigatorProvider = navigatorProvider2;
                dialogNavigator = null;
                composerImpl.o(-1790256870);
                composerImpl.V(false);
            }
            Navigator navigatorB2 = navigatorProvider.b("dialog");
            if (navigatorB2 instanceof DialogNavigator) {
                dialogNavigator = (DialogNavigator) navigatorB2;
            }
            if (dialogNavigator == null) {
                RecomposeScopeImpl recomposeScopeImplX2 = composerImpl.X();
                if (recomposeScopeImplX2 != null) {
                    final int i8 = 0;
                    recomposeScopeImplX2.d = new Function2() { // from class: androidx.navigation.compose.m
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj22, Object obj32) {
                            switch (i8) {
                                case 0:
                                    ((Integer) obj32).getClass();
                                    NavHostKt.a(navHostController, graph, modifier, alignment, function1, function12, function13, function14, (Composer) obj22, RecomposeScopeImplKt.a(i | 1));
                                    break;
                                case 1:
                                    ((Integer) obj32).getClass();
                                    NavHostKt.a(navHostController, graph, modifier, alignment, function1, function12, function13, function14, (Composer) obj22, RecomposeScopeImplKt.a(i | 1));
                                    break;
                                default:
                                    ((Integer) obj32).getClass();
                                    NavHostKt.a(navHostController, graph, modifier, alignment, function1, function12, function13, function14, (Composer) obj22, RecomposeScopeImplKt.a(i | 1));
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    return;
                }
                return;
            }
            DialogHostKt.a(dialogNavigator, composerImpl, 0);
        }
        RecomposeScopeImpl recomposeScopeImplX3 = composerImpl.X();
        if (recomposeScopeImplX3 != null) {
            final int i9 = 1;
            recomposeScopeImplX3.d = new Function2() { // from class: androidx.navigation.compose.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj22, Object obj32) {
                    switch (i9) {
                        case 0:
                            ((Integer) obj32).getClass();
                            NavHostKt.a(navHostController, graph, modifier, alignment, function1, function12, function13, function14, (Composer) obj22, RecomposeScopeImplKt.a(i | 1));
                            break;
                        case 1:
                            ((Integer) obj32).getClass();
                            NavHostKt.a(navHostController, graph, modifier, alignment, function1, function12, function13, function14, (Composer) obj22, RecomposeScopeImplKt.a(i | 1));
                            break;
                        default:
                            ((Integer) obj32).getClass();
                            NavHostKt.a(navHostController, graph, modifier, alignment, function1, function12, function13, function14, (Composer) obj22, RecomposeScopeImplKt.a(i | 1));
                            break;
                    }
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final NavHostController navHostController, final Object obj, Modifier modifier, Alignment alignment, Map map, Function1 function1, Function1 function12, Function1 function13, Function1 function14, final Function1 function15, Composer composer, final int i) {
        Function1 function16;
        Function1 function17;
        Modifier modifier2;
        Alignment alignment2;
        int i2;
        Map map2;
        Function1 function18;
        Function1 function19;
        final Function1 function110;
        ComposerImpl composerImpl;
        final Function1 function111;
        final Function1 function112;
        final Map map3;
        final Function1 function113;
        final Alignment alignment3;
        final Modifier modifier3;
        ComposerImpl composerImplV = composer.v(-1476019057);
        int i3 = i | (composerImplV.I(navHostController) ? 4 : 2) | 316370304;
        int i4 = (composerImplV.I(function15) ? ' ' : (char) 16) | 6;
        if ((306783379 & i3) == 306783378 && (i4 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            modifier3 = modifier;
            alignment3 = alignment;
            map3 = map;
            function113 = function1;
            function111 = function12;
            function110 = function14;
            composerImpl = composerImplV;
            function112 = function13;
        } else {
            composerImplV.u0();
            int i5 = i & 1;
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (i5 == 0 || composerImplV.c0()) {
                Map map4 = EmptyMap.d;
                Object objG = composerImplV.G();
                if (objG == composer$Companion$Empty$1) {
                    objG = new androidx.navigation.a(10);
                    composerImplV.A(objG);
                }
                function16 = (Function1) objG;
                Object objG2 = composerImplV.G();
                if (objG2 == composer$Companion$Empty$1) {
                    objG2 = new androidx.navigation.a(12);
                    composerImplV.A(objG2);
                }
                function17 = (Function1) objG2;
                modifier2 = Modifier.Companion.d;
                alignment2 = Alignment.Companion.f1719a;
                i2 = i3 & (-2113929217);
                map2 = map4;
                function18 = function16;
                function19 = function17;
            } else {
                composerImplV.j();
                modifier2 = modifier;
                alignment2 = alignment;
                map2 = map;
                function18 = function1;
                function17 = function12;
                function16 = function13;
                i2 = i3 & (-2113929217);
                function19 = function14;
            }
            composerImplV.W();
            boolean zN = ((i4 & 112) == 32) | composerImplV.n(null) | composerImplV.n(obj);
            Object objG3 = composerImplV.G();
            if (zN || objG3 == composer$Companion$Empty$1) {
                NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHostController.b.t, obj, map2);
                function15.invoke(navGraphBuilder);
                objG3 = navGraphBuilder.c();
                composerImplV.A(objG3);
            }
            Function1 function114 = function17;
            Modifier modifier4 = modifier2;
            Function1 function115 = function16;
            Function1 function116 = function19;
            Alignment alignment4 = alignment2;
            a(navHostController, (NavGraph) objG3, modifier4, alignment4, function18, function114, function115, function116, composerImplV, (i2 & 8078) | 100884480);
            function110 = function116;
            composerImpl = composerImplV;
            function111 = function114;
            function112 = function115;
            map3 = map2;
            function113 = function18;
            alignment3 = alignment4;
            modifier3 = modifier4;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(obj, modifier3, alignment3, map3, function113, function111, function112, function110, function15, i) { // from class: androidx.navigation.compose.l
                public final /* synthetic */ Object e;
                public final /* synthetic */ Modifier f;
                public final /* synthetic */ Alignment g;
                public final /* synthetic */ Map h;
                public final /* synthetic */ Function1 i;
                public final /* synthetic */ Function1 j;
                public final /* synthetic */ Function1 k;
                public final /* synthetic */ Function1 l;
                public final /* synthetic */ Function1 m;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = RecomposeScopeImplKt.a(49);
                    NavHostKt.b(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (Composer) obj2, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
