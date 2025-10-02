package androidx.compose.runtime.saveable;

import androidx.camera.core.impl.b;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "Companion", "runtime-saveable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class SaveableStateHolderImpl implements SaveableStateHolder {
    public static final SaverKt$Saver$1 e;

    /* renamed from: a, reason: collision with root package name */
    public final Map f1696a;
    public final MutableScatterMap b;
    public SaveableStateRegistry c;
    public final Function1 d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$Companion;", "", "runtime-saveable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        SaverKt$Saver$1 saverKt$Saver$1 = SaverKt.f1701a;
        e = new SaverKt$Saver$1(SaveableStateHolderImpl$Companion$Saver$2.h, SaveableStateHolderImpl$Companion$Saver$1.h);
    }

    public SaveableStateHolderImpl(Map map) {
        this.f1696a = map;
        long[] jArr = ScatterMapKt.f699a;
        this.b = new MutableScatterMap();
        this.d = new SaveableStateHolderImpl$canBeSaved$1(this);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public final void d(Object obj) {
        if (this.b.k(obj) == null) {
            this.f1696a.remove(obj);
        }
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public final void f(final Object obj, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        composer.o(-1198538093);
        composer.h(obj);
        Object objG = composer.G();
        Object obj2 = Composer.Companion.f1624a;
        if (objG == obj2) {
            Function1 function1 = this.d;
            if (!((Boolean) ((SaveableStateHolderImpl$canBeSaved$1) function1).invoke(obj)).booleanValue()) {
                throw new IllegalArgumentException(b.n(obj, "Type of the key ", " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
            Map map = (Map) this.f1696a.get(obj);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = SaveableStateRegistryKt.f1700a;
            Object saveableStateRegistryImpl = new SaveableStateRegistryImpl(map, function1);
            composer.A(saveableStateRegistryImpl);
            objG = saveableStateRegistryImpl;
        }
        final SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) objG;
        CompositionLocalKt.a(SaveableStateRegistryKt.f1700a.b(saveableStateRegistry), composableLambdaImpl, composer, (i & 112) | 8);
        boolean zI = composer.I(this) | composer.I(obj) | composer.I(saveableStateRegistry);
        Object objG2 = composer.G();
        if (zI || objG2 == obj2) {
            objG2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$SaveableStateProvider$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    final SaveableStateHolderImpl saveableStateHolderImpl = this.h;
                    MutableScatterMap mutableScatterMap = saveableStateHolderImpl.b;
                    final Object obj4 = obj;
                    if (mutableScatterMap.b(obj4)) {
                        throw new IllegalArgumentException(b.n(obj4, "Key ", " was used multiple times ").toString());
                    }
                    saveableStateHolderImpl.f1696a.remove(obj4);
                    final SaveableStateRegistry saveableStateRegistry2 = saveableStateRegistry;
                    mutableScatterMap.m(obj4, saveableStateRegistry2);
                    return new DisposableEffectResult() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$SaveableStateProvider$1$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public final void dispose() {
                            SaveableStateHolderImpl saveableStateHolderImpl2 = saveableStateHolderImpl;
                            MutableScatterMap mutableScatterMap2 = saveableStateHolderImpl2.b;
                            Object obj5 = obj4;
                            Object objK = mutableScatterMap2.k(obj5);
                            SaveableStateRegistry saveableStateRegistry3 = saveableStateRegistry2;
                            if (objK == saveableStateRegistry3) {
                                Map map2 = saveableStateHolderImpl2.f1696a;
                                Map mapC = saveableStateRegistry3.c();
                                if (mapC.isEmpty()) {
                                    map2.remove(obj5);
                                } else {
                                    map2.put(obj5, mapC);
                                }
                            }
                        }
                    };
                }
            };
            composer.A(objG2);
        }
        EffectsKt.c(Unit.f24250a, (Function1) objG2, composer);
        composer.E();
        composer.l();
    }
}
