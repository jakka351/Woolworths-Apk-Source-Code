package com.adobe.marketing.mobile.services.ui.floatingbutton.views;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.unit.Dp;
import com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButtonScreenKt$FloatingButtonScreen$1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@DebugMetadata(c = "com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButtonKt$FloatingButton$1$2$1", f = "FloatingButton.kt", l = {109}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FloatingButtonKt$FloatingButton$1$2$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ Function1 r;
    public final /* synthetic */ MutableState s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ float u;
    public final /* synthetic */ MutableState v;
    public final /* synthetic */ float w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingButtonKt$FloatingButton$1$2$1(Function1 function1, MutableState mutableState, MutableState mutableState2, float f, MutableState mutableState3, float f2, Continuation continuation) {
        super(2, continuation);
        this.r = function1;
        this.s = mutableState;
        this.t = mutableState2;
        this.u = f;
        this.v = mutableState3;
        this.w = f2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FloatingButtonKt$FloatingButton$1$2$1 floatingButtonKt$FloatingButton$1$2$1 = new FloatingButtonKt$FloatingButton$1$2$1(this.r, this.s, this.t, this.u, this.v, this.w, continuation);
        floatingButtonKt$FloatingButton$1$2$1.q = obj;
        return floatingButtonKt$FloatingButton$1$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FloatingButtonKt$FloatingButton$1$2$1) create((PointerInputScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final PointerInputScope pointerInputScope = (PointerInputScope) this.q;
            final MutableState mutableState = this.s;
            final Function1 function1 = this.r;
            Function0<Unit> function0 = new Function0<Unit>() { // from class: com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButtonKt$FloatingButton$1$2$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    ((FloatingButtonScreenKt$FloatingButtonScreen$1.AnonymousClass2) function1).invoke(mutableState.getD());
                    return Unit.f24250a;
                }
            };
            final MutableState mutableState2 = this.v;
            final float f = this.w;
            final MutableState mutableState3 = this.t;
            final float f2 = this.u;
            Function2<PointerInputChange, Offset, Unit> function2 = new Function2<PointerInputChange, Offset, Unit>() { // from class: com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButtonKt$FloatingButton$1$2$1.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    PointerInputChange change = (PointerInputChange) obj2;
                    long j = ((Offset) obj3).f1751a;
                    Intrinsics.h(change, "change");
                    change.a();
                    MutableState mutableState4 = mutableState;
                    float fE = Offset.e(j) + Offset.e(((Offset) mutableState4.getD()).f1751a);
                    float f3 = Offset.f(j) + Offset.f(((Offset) mutableState4.getD()).f1751a);
                    float f4 = ((Dp) ((SnapshotMutableStateImpl) mutableState3).getD()).d - f2;
                    PointerInputScope pointerInputScope2 = pointerInputScope;
                    mutableState4.setValue(new Offset(OffsetKt.a(RangesKt.b(fE, BitmapDescriptorFactory.HUE_RED, pointerInputScope2.T1(f4)), RangesKt.b(f3, BitmapDescriptorFactory.HUE_RED, pointerInputScope2.T1(((Dp) ((SnapshotMutableStateImpl) mutableState2).getD()).d - f)))));
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (DragGestureDetectorKt.f(pointerInputScope, null, function0, function2, this, 5) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
