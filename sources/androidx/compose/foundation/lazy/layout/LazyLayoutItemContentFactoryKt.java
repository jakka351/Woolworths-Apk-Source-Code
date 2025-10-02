package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutItemContentFactoryKt {
    public static final void a(final LazyLayoutItemProvider lazyLayoutItemProvider, final Object obj, final int i, final Object obj2, Composer composer, final int i2) {
        int i3;
        ComposerImpl composerImplV = composer.v(1439843069);
        if ((i2 & 6) == 0) {
            i3 = (composerImplV.n(lazyLayoutItemProvider) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerImplV.n(obj) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.r(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerImplV.n(obj2) ? 2048 : 1024;
        }
        if (composerImplV.z(i3 & 1, (i3 & 1171) != 1170)) {
            ((SaveableStateHolder) obj).f(obj2, ComposableLambdaKt.c(980966366, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactoryKt$SkippableItem$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    Composer composer2 = (Composer) obj3;
                    int iIntValue = ((Number) obj4).intValue();
                    if (composer2.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                        lazyLayoutItemProvider.h(i, composer2, obj2);
                    } else {
                        composer2.j();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 48);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactoryKt$SkippableItem$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Number) obj4).intValue();
                    LazyLayoutItemContentFactoryKt.a(lazyLayoutItemProvider, obj, i, obj2, (Composer) obj3, RecomposeScopeImplKt.a(i2 | 1));
                    return Unit.f24250a;
                }
            };
        }
    }
}
