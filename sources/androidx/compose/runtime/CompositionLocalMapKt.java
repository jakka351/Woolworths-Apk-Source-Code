package androidx.compose.runtime;

import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CompositionLocalMapKt {
    public static final Object a(PersistentCompositionLocalMap persistentCompositionLocalMap, CompositionLocal compositionLocal) {
        Intrinsics.f(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        ValueHolder<Object> valueHolderA = persistentCompositionLocalMap.get(compositionLocal);
        if (valueHolderA == null) {
            valueHolderA = compositionLocal.a();
        }
        return valueHolderA.a(persistentCompositionLocalMap);
    }

    public static final PersistentCompositionLocalMap b(ProvidedValue[] providedValueArr, PersistentCompositionLocalMap persistentCompositionLocalMap, PersistentCompositionLocalMap persistentCompositionLocalMap2) {
        PersistentCompositionLocalHashMap persistentCompositionLocalHashMap = PersistentCompositionLocalHashMap.i;
        PersistentCompositionLocalHashMap.Builder builder = new PersistentCompositionLocalHashMap.Builder(persistentCompositionLocalHashMap);
        builder.j = persistentCompositionLocalHashMap;
        for (ProvidedValue providedValue : providedValueArr) {
            ProvidableCompositionLocal providableCompositionLocal = providedValue.f1655a;
            if (providedValue.h || !persistentCompositionLocalMap.containsKey(providableCompositionLocal)) {
                builder.put(providableCompositionLocal, providableCompositionLocal.c(providedValue, (ValueHolder) persistentCompositionLocalMap2.get(providableCompositionLocal)));
            }
        }
        return builder.build();
    }
}
