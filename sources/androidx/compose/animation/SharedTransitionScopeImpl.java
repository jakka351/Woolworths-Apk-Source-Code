package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadScope;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@ExperimentalSharedTransitionApi
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/animation/SharedTransitionScopeImpl;", "Landroidx/compose/animation/SharedTransitionScope;", "Landroidx/compose/ui/layout/LookaheadScope;", "Companion", "ShapeBasedClip", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Stable
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SharedTransitionScopeImpl implements SharedTransitionScope, LookaheadScope {
    public static final Object n = LazyKt.a(LazyThreadSafetyMode.e, SharedTransitionScopeImpl$Companion$SharedTransitionObserver$2.h);
    public final CoroutineScope d;
    public final /* synthetic */ LookaheadScope e;
    public boolean f;
    public LayoutCoordinates j;
    public LayoutCoordinates k;
    public final MutableState g = SnapshotStateKt.f(Boolean.FALSE);
    public final Function0 h = new Function0<Unit>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$observeAnimatingBlock$1
        {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke() {
            /*
                r15 = this;
                androidx.compose.animation.SharedTransitionScopeImpl r0 = r15.h
                androidx.collection.MutableScatterMap r0 = r0.m
                java.lang.Object[] r1 = r0.b
                java.lang.Object[] r2 = r0.c
                long[] r0 = r0.f698a
                int r3 = r0.length
                int r3 = r3 + (-2)
                if (r3 < 0) goto L4f
                r4 = 0
                r5 = r4
            L11:
                r6 = r0[r5]
                long r8 = ~r6
                r10 = 7
                long r8 = r8 << r10
                long r8 = r8 & r6
                r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r8 = r8 & r10
                int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r8 == 0) goto L4a
                int r8 = r5 - r3
                int r8 = ~r8
                int r8 = r8 >>> 31
                r9 = 8
                int r8 = 8 - r8
                r10 = r4
            L2b:
                if (r10 >= r8) goto L48
                r11 = 255(0xff, double:1.26E-321)
                long r11 = r11 & r6
                r13 = 128(0x80, double:6.32E-322)
                int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r11 < 0) goto L3a
                long r6 = r6 >> r9
                int r10 = r10 + 1
                goto L2b
            L3a:
                int r0 = r5 << 3
                int r0 = r0 + r10
                r1 = r1[r0]
                r0 = r2[r0]
                androidx.compose.animation.SharedElement r0 = (androidx.compose.animation.SharedElement) r0
                r0.getClass()
                r0 = 0
                throw r0
            L48:
                if (r8 != r9) goto L4f
            L4a:
                if (r5 == r3) goto L4f
                int r5 = r5 + 1
                goto L11
            L4f:
                kotlin.Unit r0 = kotlin.Unit.f24250a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.SharedTransitionScopeImpl$observeAnimatingBlock$1.invoke():java.lang.Object");
        }
    };
    public final Function1 i = new Function1<SharedTransitionScope, Unit>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$updateTransitionActiveness$1
        {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
        @Override // kotlin.jvm.functions.Function1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object r26) {
            /*
                Method dump skipped, instructions count: 277
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.SharedTransitionScopeImpl$updateTransitionActiveness$1.invoke(java.lang.Object):java.lang.Object");
        }
    };
    public final SnapshotStateList l = new SnapshotStateList();
    public final MutableScatterMap m = new MutableScatterMap();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/SharedTransitionScopeImpl$Companion;", "", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/SharedTransitionScopeImpl$ShapeBasedClip;", "Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShapeBasedClip implements SharedTransitionScope.OverlayClip {
    }

    public SharedTransitionScopeImpl(LookaheadScope lookaheadScope, CoroutineScope coroutineScope) {
        this.d = coroutineScope;
        this.e = lookaheadScope;
    }
}
