package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LazySaveableStateHolderKt {
    public static final void a(final int i, Composer composer, final ComposableLambdaImpl composableLambdaImpl) {
        ComposerImpl composerImplV = composer.v(674185128);
        if (composerImplV.z(i & 1, (i & 3) != 2)) {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = SaveableStateRegistryKt.f1700a;
            final SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) composerImplV.x(staticProvidableCompositionLocal);
            final SaveableStateHolder saveableStateHolderA = SaveableStateHolderKt.a(composerImplV);
            Object[] objArr = {saveableStateRegistry};
            Function1<Map<String, ? extends List<? extends Object>>, LazySaveableStateHolder> function1 = new Function1<Map<String, ? extends List<? extends Object>>, LazySaveableStateHolder>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$Companion$saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return new LazySaveableStateHolder(saveableStateRegistry, (Map) obj, saveableStateHolderA);
                }
            };
            SaverKt$Saver$1 saverKt$Saver$1 = SaverKt.f1701a;
            SaverKt$Saver$1 saverKt$Saver$12 = new SaverKt$Saver$1(function1, LazySaveableStateHolder$Companion$saver$1.h);
            boolean zI = composerImplV.I(saveableStateRegistry) | composerImplV.I(saveableStateHolderA);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new Function0<LazySaveableStateHolder>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt$LazySaveableStateHolderProvider$holder$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return new LazySaveableStateHolder(saveableStateRegistry, EmptyMap.d, saveableStateHolderA);
                    }
                };
                composerImplV.A(objG);
            }
            final LazySaveableStateHolder lazySaveableStateHolder = (LazySaveableStateHolder) RememberSaveableKt.c(objArr, saverKt$Saver$12, (Function0) objG, composerImplV, 0, 4);
            CompositionLocalKt.a(staticProvidableCompositionLocal.b(lazySaveableStateHolder), ComposableLambdaKt.c(1863926504, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt$LazySaveableStateHolderProvider$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Number) obj2).intValue();
                    if (composer2.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                        composableLambdaImpl.invoke(lazySaveableStateHolder, composer2, 0);
                    } else {
                        composer2.j();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 56);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(i) { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt$LazySaveableStateHolderProvider$2
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    LazySaveableStateHolderKt.a(RecomposeScopeImplKt.a(7), (Composer) obj, this.h);
                    return Unit.f24250a;
                }
            };
        }
    }
}
