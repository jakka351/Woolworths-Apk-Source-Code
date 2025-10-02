package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazySaveableStateHolder;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class LazySaveableStateHolder implements SaveableStateRegistry, SaveableStateHolder {

    /* renamed from: a, reason: collision with root package name */
    public final SaveableStateRegistry f1056a;
    public final SaveableStateHolder b;
    public final MutableScatterSet c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazySaveableStateHolder$Companion;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public LazySaveableStateHolder(final SaveableStateRegistry saveableStateRegistry, Map map, SaveableStateHolder saveableStateHolder) {
        this.f1056a = SaveableStateRegistryKt.a(map, new Function1<Object, Boolean>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SaveableStateRegistry saveableStateRegistry2 = saveableStateRegistry;
                return Boolean.valueOf(saveableStateRegistry2 != null ? saveableStateRegistry2.a(obj) : true);
            }
        });
        this.b = saveableStateHolder;
        int i = ScatterSetKt.f701a;
        this.c = new MutableScatterSet();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final boolean a(Object obj) {
        return this.f1056a.a(obj);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final SaveableStateRegistry.Entry b(String str, Function0 function0) {
        return this.f1056a.b(str, function0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map c() {
        /*
            r14 = this;
            androidx.collection.MutableScatterSet r0 = r14.c
            java.lang.Object[] r1 = r0.b
            long[] r0 = r0.f700a
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L47
            r3 = 0
            r4 = r3
        Ld:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L42
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L27:
            if (r9 >= r7) goto L40
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3c
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            androidx.compose.runtime.saveable.SaveableStateHolder r11 = r14.b
            r11.d(r10)
        L3c:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L27
        L40:
            if (r7 != r8) goto L47
        L42:
            if (r4 == r2) goto L47
            int r4 = r4 + 1
            goto Ld
        L47:
            androidx.compose.runtime.saveable.SaveableStateRegistry r0 = r14.f1056a
            java.util.Map r0 = r0.c()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.c():java.util.Map");
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public final void d(Object obj) {
        this.b.d(obj);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final Object e(String str) {
        return this.f1056a.e(str);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public final void f(final Object obj, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        composer.o(-697180401);
        this.b.f(obj, composableLambdaImpl, composer, i & 126);
        boolean zI = composer.I(this) | composer.I(obj);
        Object objG = composer.G();
        if (zI || objG == Composer.Companion.f1624a) {
            objG = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$SaveableStateProvider$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    final LazySaveableStateHolder lazySaveableStateHolder = this.h;
                    MutableScatterSet mutableScatterSet = lazySaveableStateHolder.c;
                    final Object obj3 = obj;
                    mutableScatterSet.k(obj3);
                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$SaveableStateProvider$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public final void dispose() {
                            lazySaveableStateHolder.c.m(obj3);
                        }
                    };
                }
            };
            composer.A(objG);
        }
        EffectsKt.c(obj, (Function1) objG, composer);
        composer.l();
    }
}
