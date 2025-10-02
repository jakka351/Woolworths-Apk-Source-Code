package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntOffset;
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
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TimePickerKt$ClockText$2$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        final MutableState mutableState = null;
        final MutableState mutableState2 = null;
        final CoroutineScope coroutineScope = null;
        final AnalogTimePickerState analogTimePickerState = null;
        final float f = BitmapDescriptorFactory.HUE_RED;
        final boolean z = false;
        SemanticsPropertiesKt.h(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.TimePickerKt$ClockText$2$1.1

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material3.TimePickerKt$ClockText$2$1$1$1", f = "TimePicker.kt", l = {1674}, m = "invokeSuspend")
            /* renamed from: androidx.compose.material3.TimePickerKt$ClockText$2$1$1$1, reason: invalid class name and collision with other inner class name */
            final class C00631 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int p;
                public final /* synthetic */ AnalogTimePickerState q;
                public final /* synthetic */ float r;
                public final /* synthetic */ boolean s;
                public final /* synthetic */ MutableState t;
                public final /* synthetic */ MutableState u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00631(AnalogTimePickerState analogTimePickerState, float f, boolean z, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
                    super(2, continuation);
                    this.q = analogTimePickerState;
                    this.r = f;
                    this.s = z;
                    this.t = mutableState;
                    this.u = mutableState2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C00631(this.q, this.r, this.s, this.t, this.u, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ((C00631) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                    int i = this.p;
                    Unit unit = Unit.f24250a;
                    if (i == 0) {
                        ResultKt.b(obj);
                        float f = TimePickerKt.f1519a;
                        MutableState mutableState = this.t;
                        float fE = Offset.e(((Offset) mutableState.getD()).f1751a);
                        float f2 = Offset.f(((Offset) mutableState.getD()).f1751a);
                        long j = ((IntOffset) this.u.getD()).f2200a;
                        this.p = 1;
                        TimePickerKt.m(this.q, fE, f2, this.r, this.s, j, this);
                        if (unit == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj);
                    }
                    return unit;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BuildersKt.c(coroutineScope, null, null, new C00631(analogTimePickerState, f, z, mutableState, mutableState2, null), 3);
                return Boolean.TRUE;
            }
        });
        SemanticsPropertiesKt.s(semanticsPropertyReceiver, false);
        return Unit.f24250a;
    }
}
