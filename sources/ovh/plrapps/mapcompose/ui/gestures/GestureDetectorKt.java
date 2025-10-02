package ovh.plrapps.mapcompose.ui.gestures;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"mapcompose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class GestureDetectorKt {
    public static Object a(PointerInputScope pointerInputScope, Function4 function4, Function0 function0, Function1 function1, Function1 function12, Function2 function2, Continuation continuation) {
        Object objC = ForEachGestureKt.c(pointerInputScope, new GestureDetectorKt$detectTransformGestures$2(function0, function4, function2, function1, RangesKt.j(-8000.0f, 8000.0f), (float) Math.pow(pointerInputScope.T1(200), 2), function12, null), continuation);
        return objC == CoroutineSingletons.d ? objC : Unit.f24250a;
    }
}
