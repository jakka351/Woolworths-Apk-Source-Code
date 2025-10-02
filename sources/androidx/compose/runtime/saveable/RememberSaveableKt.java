package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime-saveable_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RememberSaveableKt {
    public static final String a(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final MutableState b(Object[] objArr, final Saver saver, Function0 function0, Composer composer) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.f(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver, kotlin.Any>");
        Function2<SaverScope, MutableState<Object>, MutableState<Object>> function2 = new Function2<SaverScope, MutableState<Object>, MutableState<Object>>() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$mutableStateSaver$1$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                SaverScope saverScope = (SaverScope) obj;
                MutableState mutableState = (MutableState) obj2;
                if (!(mutableState instanceof SnapshotMutableState)) {
                    throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
                }
                Object objA = saver.a(saverScope, mutableState.getD());
                if (objA == null) {
                    return null;
                }
                SnapshotMutationPolicy e = ((SnapshotMutableState) mutableState).getE();
                Intrinsics.f(e, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
                return SnapshotStateKt.e(objA, e);
            }
        };
        Function1<MutableState<Object>, MutableState<Object>> function1 = new Function1<MutableState<Object>, MutableState<Object>>() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$mutableStateSaver$1$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object objB;
                MutableState mutableState = (MutableState) obj;
                if (!(mutableState instanceof SnapshotMutableState)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                if (mutableState.getD() != null) {
                    Object d = mutableState.getD();
                    Intrinsics.e(d);
                    objB = saver.b(d);
                } else {
                    objB = null;
                }
                SnapshotMutationPolicy e = ((SnapshotMutableState) mutableState).getE();
                Intrinsics.f(e, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver?>");
                return SnapshotStateKt.e(objB, e);
            }
        };
        SaverKt$Saver$1 saverKt$Saver$1 = SaverKt.f1701a;
        return (MutableState) c(objArrCopyOf, new SaverKt$Saver$1(function1, function2), function0, composer, 0, 0);
    }

    public static final Object c(Object[] objArr, Saver saver, Function0 function0, Composer composer, int i, int i2) {
        Object[] objArr2;
        final Object obj;
        Object objE;
        if ((i2 & 2) != 0) {
            saver = SaverKt.f1701a;
        }
        final Saver saver2 = saver;
        int p = composer.getP();
        CharsKt.b(36);
        final String string = Integer.toString(p, 36);
        Intrinsics.g(string, "toString(...)");
        Intrinsics.f(saver2, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        final SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) composer.x(SaveableStateRegistryKt.f1700a);
        Object objG = composer.G();
        Object obj2 = Composer.Companion.f1624a;
        if (objG == obj2) {
            Object objB = (saveableStateRegistry == null || (objE = saveableStateRegistry.e(string)) == null) ? null : saver2.b(objE);
            if (objB == null) {
                objB = function0.invoke();
            }
            objArr2 = objArr;
            Object saveableHolder = new SaveableHolder(saver2, saveableStateRegistry, string, objB, objArr2);
            composer.A(saveableHolder);
            objG = saveableHolder;
        } else {
            objArr2 = objArr;
        }
        final SaveableHolder saveableHolder2 = (SaveableHolder) objG;
        Object objInvoke = Arrays.equals(objArr2, saveableHolder2.h) ? saveableHolder2.g : null;
        if (objInvoke == null) {
            objInvoke = function0.invoke();
        }
        boolean zI = composer.I(saveableHolder2) | composer.I(saver2) | composer.I(saveableStateRegistry) | composer.n(string) | composer.I(objInvoke) | composer.I(objArr2);
        Object objG2 = composer.G();
        if (zI || objG2 == obj2) {
            final Object[] objArr3 = objArr2;
            obj = objInvoke;
            Object obj3 = new Function0<Unit>() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean z;
                    SaveableHolder saveableHolder3 = saveableHolder2;
                    SaveableStateRegistry saveableStateRegistry2 = saveableHolder3.e;
                    SaveableStateRegistry saveableStateRegistry3 = saveableStateRegistry;
                    boolean z2 = true;
                    if (saveableStateRegistry2 != saveableStateRegistry3) {
                        saveableHolder3.e = saveableStateRegistry3;
                        z = true;
                    } else {
                        z = false;
                    }
                    String str = saveableHolder3.f;
                    String str2 = string;
                    if (Intrinsics.c(str, str2)) {
                        z2 = z;
                    } else {
                        saveableHolder3.f = str2;
                    }
                    saveableHolder3.d = saver2;
                    saveableHolder3.g = obj;
                    saveableHolder3.h = objArr3;
                    SaveableStateRegistry.Entry entry = saveableHolder3.i;
                    if (entry != null && z2) {
                        entry.unregister();
                        saveableHolder3.i = null;
                        saveableHolder3.b();
                    }
                    return Unit.f24250a;
                }
            };
            composer.A(obj3);
            objG2 = obj3;
        } else {
            obj = objInvoke;
        }
        composer.g((Function0) objG2);
        return obj;
    }
}
