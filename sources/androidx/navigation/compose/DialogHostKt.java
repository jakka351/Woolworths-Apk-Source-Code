package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavigatorState;
import androidx.navigation.compose.DialogNavigator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002¨\u0006\u0005²\u0006\u0012\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00038\nX\u008a\u0084\u0002"}, d2 = {"", "Landroidx/navigation/NavBackStackEntry;", "dialogBackStack", "", "transitionInProgress", "navigation-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class DialogHostKt {
    public static final void a(DialogNavigator dialogNavigator, Composer composer, final int i) {
        final DialogNavigator dialogNavigator2;
        ComposerImpl composerImplV = composer.v(294589392);
        if ((((composerImplV.I(dialogNavigator) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            dialogNavigator2 = dialogNavigator;
        } else {
            final SaveableStateHolder saveableStateHolderA = SaveableStateHolderKt.a(composerImplV);
            MutableState mutableStateA = SnapshotStateKt.a(dialogNavigator.b().e, composerImplV);
            Object obj = (Collection) ((List) mutableStateA.getD());
            boolean zBooleanValue = ((Boolean) composerImplV.x(InspectionModeKt.f1972a)).booleanValue();
            boolean zN = composerImplV.n(obj);
            Object objG = composerImplV.G();
            Object obj2 = Composer.Companion.f1624a;
            Object obj3 = objG;
            if (zN || objG == obj2) {
                SnapshotStateList snapshotStateList = new SnapshotStateList();
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : (Iterable) obj) {
                    NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj4;
                    if (zBooleanValue || navBackStackEntry.k.k.d.compareTo(Lifecycle.State.g) >= 0) {
                        arrayList.add(obj4);
                    }
                }
                snapshotStateList.addAll(arrayList);
                composerImplV.A(snapshotStateList);
                obj3 = snapshotStateList;
            }
            SnapshotStateList snapshotStateList2 = (SnapshotStateList) obj3;
            b(snapshotStateList2, (List) mutableStateA.getD(), composerImplV, 0);
            MutableState mutableStateA2 = SnapshotStateKt.a(dialogNavigator.b().f, composerImplV);
            Object objG2 = composerImplV.G();
            if (objG2 == obj2) {
                objG2 = new SnapshotStateList();
                composerImplV.A(objG2);
            }
            SnapshotStateList snapshotStateList3 = (SnapshotStateList) objG2;
            composerImplV.o(-367418626);
            ListIterator listIterator = snapshotStateList2.listIterator();
            while (listIterator.hasNext()) {
                final NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) listIterator.next();
                NavDestination navDestination = navBackStackEntry2.e;
                Intrinsics.f(navDestination, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination");
                final DialogNavigator.Destination destination = (DialogNavigator.Destination) navDestination;
                boolean zI = composerImplV.I(dialogNavigator) | composerImplV.I(navBackStackEntry2);
                Object objG3 = composerImplV.G();
                if (zI || objG3 == obj2) {
                    objG3 = new a(0, dialogNavigator, navBackStackEntry2);
                    composerImplV.A(objG3);
                }
                final SnapshotStateList snapshotStateList4 = snapshotStateList3;
                final DialogNavigator dialogNavigator3 = dialogNavigator;
                AndroidDialog_androidKt.a((Function0) objG3, destination.j, ComposableLambdaKt.c(1129586364, new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$1$2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj5, Object obj6) {
                        Composer composer2 = (Composer) obj5;
                        if ((((Number) obj6).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            final NavBackStackEntry navBackStackEntry3 = navBackStackEntry2;
                            boolean zI2 = composer2.I(navBackStackEntry3);
                            final DialogNavigator dialogNavigator4 = dialogNavigator3;
                            boolean zI3 = zI2 | composer2.I(dialogNavigator4);
                            Object objG4 = composer2.G();
                            if (zI3 || objG4 == Composer.Companion.f1624a) {
                                final SnapshotStateList snapshotStateList5 = snapshotStateList4;
                                objG4 = new Function1() { // from class: androidx.navigation.compose.f
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj7) {
                                        final SnapshotStateList snapshotStateList6 = snapshotStateList5;
                                        final NavBackStackEntry navBackStackEntry4 = navBackStackEntry3;
                                        snapshotStateList6.add(navBackStackEntry4);
                                        final DialogNavigator dialogNavigator5 = dialogNavigator4;
                                        return new DisposableEffectResult() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$1$2$invoke$lambda$2$lambda$1$$inlined$onDispose$1
                                            @Override // androidx.compose.runtime.DisposableEffectResult
                                            public final void dispose() {
                                                NavigatorState navigatorStateB = dialogNavigator5.b();
                                                NavBackStackEntry navBackStackEntry5 = navBackStackEntry4;
                                                navigatorStateB.b(navBackStackEntry5);
                                                snapshotStateList6.remove(navBackStackEntry5);
                                            }
                                        };
                                    }
                                };
                                composer2.A(objG4);
                            }
                            EffectsKt.c(navBackStackEntry3, (Function1) objG4, composer2);
                            final DialogNavigator.Destination destination2 = destination;
                            NavBackStackEntryProviderKt.a(navBackStackEntry3, saveableStateHolderA, ComposableLambdaKt.c(-497631156, new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$1$2.2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj7, Object obj8) {
                                    Composer composer3 = (Composer) obj7;
                                    if ((((Number) obj8).intValue() & 3) == 2 && composer3.c()) {
                                        composer3.j();
                                    } else {
                                        destination2.k.invoke(navBackStackEntry3, composer3, 0);
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer2), composer2, KyberEngine.KyberPolyBytes);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), composerImplV, KyberEngine.KyberPolyBytes);
                dialogNavigator = dialogNavigator3;
                snapshotStateList3 = snapshotStateList4;
            }
            dialogNavigator2 = dialogNavigator;
            SnapshotStateList snapshotStateList5 = snapshotStateList3;
            composerImplV.V(false);
            Set set = (Set) mutableStateA2.getD();
            boolean zN2 = composerImplV.n(mutableStateA2) | composerImplV.I(dialogNavigator2);
            Object objG4 = composerImplV.G();
            if (zN2 || objG4 == obj2) {
                objG4 = new DialogHostKt$DialogHost$2$1(mutableStateA2, dialogNavigator2, snapshotStateList5, null);
                composerImplV.A(objG4);
            }
            EffectsKt.f(set, snapshotStateList5, (Function2) objG4, composerImplV);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(i) { // from class: androidx.navigation.compose.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    DialogHostKt.a(this.d, (Composer) obj5, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(List list, Collection collection, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1537894851);
        if ((((composerImplV.I(list) ? 4 : 2) | i | (composerImplV.I(collection) ? 32 : 16)) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            boolean zBooleanValue = ((Boolean) composerImplV.x(InspectionModeKt.f1972a)).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) it.next();
                LifecycleRegistry lifecycleRegistry = navBackStackEntry.k.k;
                boolean zP = composerImplV.p(zBooleanValue) | composerImplV.I(list) | composerImplV.I(navBackStackEntry);
                Object objG = composerImplV.G();
                if (zP || objG == Composer.Companion.f1624a) {
                    objG = new c(navBackStackEntry, 0, list, zBooleanValue);
                    composerImplV.A(objG);
                }
                EffectsKt.c(lifecycleRegistry, (Function1) objG, composerImplV);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(list, i, 0, collection);
        }
    }
}
