package com.halilibo.richtext.ui.util;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "it", "Landroidx/compose/ui/geometry/Offset;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.halilibo.richtext.ui.util.ConditionalTapGestureDetectorKt$NoPressGesture$1", f = "ConditionalTapGestureDetector.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class ConditionalTapGestureDetectorKt$NoPressGesture$1 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((Offset) obj2).f1751a;
        ConditionalTapGestureDetectorKt$NoPressGesture$1 conditionalTapGestureDetectorKt$NoPressGesture$1 = new ConditionalTapGestureDetectorKt$NoPressGesture$1(3, (Continuation) obj3);
        Unit unit = Unit.f24250a;
        conditionalTapGestureDetectorKt$NoPressGesture$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        return Unit.f24250a;
    }
}
