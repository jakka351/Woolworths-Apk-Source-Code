package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.layout.PinnableContainerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LazyLayoutPinnableItemKt {
    public static final void a(final Object obj, final int i, final LazyLayoutPinnedItemList lazyLayoutPinnedItemList, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i2) {
        int i3;
        ComposerImpl composerImplV = composer.v(-2079116560);
        if ((i2 & 6) == 0) {
            i3 = (composerImplV.I(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerImplV.r(i) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.I(lazyLayoutPinnedItemList) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerImplV.I(composableLambdaImpl) ? 2048 : 1024;
        }
        if (composerImplV.z(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zN = composerImplV.n(obj) | composerImplV.n(lazyLayoutPinnedItemList);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zN || objG == composer$Companion$Empty$1) {
                objG = new LazyLayoutPinnableItem(obj, lazyLayoutPinnedItemList);
                composerImplV.A(objG);
            }
            final LazyLayoutPinnableItem lazyLayoutPinnableItem = (LazyLayoutPinnableItem) objG;
            lazyLayoutPinnableItem.c = i;
            MutableState mutableState = lazyLayoutPinnableItem.g;
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = PinnableContainerKt.f1891a;
            PinnableContainer pinnableContainer = (PinnableContainer) composerImplV.x(dynamicProvidableCompositionLocal);
            Snapshot snapshotA = Snapshot.Companion.a();
            Function1 function1E = snapshotA != null ? snapshotA.getE() : null;
            Snapshot snapshotB = Snapshot.Companion.b(snapshotA);
            try {
                if (pinnableContainer != ((PinnableContainer) ((SnapshotMutableStateImpl) mutableState).getD())) {
                    ((SnapshotMutableStateImpl) mutableState).setValue(pinnableContainer);
                    if (lazyLayoutPinnableItem.d > 0) {
                        PinnableContainer.PinnedHandle pinnedHandle = lazyLayoutPinnableItem.e;
                        if (pinnedHandle != null) {
                            pinnedHandle.release();
                        }
                        lazyLayoutPinnableItem.e = pinnableContainer != null ? pinnableContainer.a() : null;
                    }
                }
                Snapshot.Companion.e(snapshotA, snapshotB, function1E);
                boolean zN2 = composerImplV.n(lazyLayoutPinnableItem);
                Object objG2 = composerImplV.G();
                if (zN2 || objG2 == composer$Companion$Empty$1) {
                    objG2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            final LazyLayoutPinnableItem lazyLayoutPinnableItem2 = lazyLayoutPinnableItem;
                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public final void dispose() {
                                    lazyLayoutPinnableItem2.f = true;
                                }
                            };
                        }
                    };
                    composerImplV.A(objG2);
                }
                EffectsKt.c(lazyLayoutPinnableItem, (Function1) objG2, composerImplV);
                CompositionLocalKt.a(dynamicProvidableCompositionLocal.b(lazyLayoutPinnableItem), composableLambdaImpl, composerImplV, ((i3 >> 6) & 112) | 8);
            } catch (Throwable th) {
                Snapshot.Companion.e(snapshotA, snapshotB, function1E);
                throw th;
            }
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Number) obj3).intValue();
                    LazyLayoutPinnableItemKt.a(obj, i, lazyLayoutPinnedItemList, composableLambdaImpl, (Composer) obj2, RecomposeScopeImplKt.a(i2 | 1));
                    return Unit.f24250a;
                }
            };
        }
    }
}
