package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.AbstractFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1", f = "AndroidTextFieldMagnifier.android.kt", l = {144}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TextFieldMagnifierNodeImpl28$restartAnimationJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ TextFieldMagnifierNodeImpl28 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldMagnifierNodeImpl28$restartAnimationJob$1(TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28, Continuation continuation) {
        super(2, continuation);
        this.r = textFieldMagnifierNodeImpl28;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TextFieldMagnifierNodeImpl28$restartAnimationJob$1 textFieldMagnifierNodeImpl28$restartAnimationJob$1 = new TextFieldMagnifierNodeImpl28$restartAnimationJob$1(this.r, continuation);
        textFieldMagnifierNodeImpl28$restartAnimationJob$1.q = obj;
        return textFieldMagnifierNodeImpl28$restartAnimationJob$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TextFieldMagnifierNodeImpl28$restartAnimationJob$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final CoroutineScope coroutineScope = (CoroutineScope) this.q;
            final TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28 = this.r;
            Flow flowM = SnapshotStateKt.m(new Function0<Offset>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1.1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl282 = textFieldMagnifierNodeImpl28;
                    if (textFieldMagnifierNodeImpl282.w) {
                        TextFieldMagnifierKt.a(textFieldMagnifierNodeImpl282.t, textFieldMagnifierNodeImpl282.u, textFieldMagnifierNodeImpl282.v, ((IntSize) ((SnapshotMutableStateImpl) textFieldMagnifierNodeImpl282.x).getD()).f2202a);
                        return new Offset(9205357640488583168L);
                    }
                    textFieldMagnifierNodeImpl282.u.getClass();
                    throw null;
                }
            });
            FlowCollector flowCollector = new FlowCollector() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1.2

                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1$2$1", f = "AndroidTextFieldMagnifier.android.kt", l = {160}, m = "invokeSuspend")
                /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1$2$1, reason: invalid class name */
                final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public int p;
                    public final /* synthetic */ TextFieldMagnifierNodeImpl28 q;
                    public final /* synthetic */ long r;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28, long j, Continuation continuation) {
                        super(2, continuation);
                        this.q = textFieldMagnifierNodeImpl28;
                        this.r = j;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new AnonymousClass1(this.q, this.r, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                        int i = this.p;
                        if (i == 0) {
                            ResultKt.b(obj);
                            Animatable animatable = this.q.y;
                            Offset offset = new Offset(this.r);
                            SpringSpec springSpec = SelectionMagnifierKt.d;
                            this.p = 1;
                            if (Animatable.d(animatable, offset, springSpec, null, null, this, 12) == coroutineSingletons) {
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

                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    long j = ((Offset) obj2).f1751a;
                    TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl282 = textFieldMagnifierNodeImpl28;
                    Animatable animatable = textFieldMagnifierNodeImpl282.y;
                    long j2 = ((Offset) animatable.f()).f1751a & 9223372034707292159L;
                    Unit unit = Unit.f24250a;
                    if (j2 == 9205357640488583168L || (9223372034707292159L & j) == 9205357640488583168L || Float.intBitsToFloat((int) (((Offset) animatable.f()).f1751a & 4294967295L)) == Float.intBitsToFloat((int) (j & 4294967295L))) {
                        Object objH = animatable.h(new Offset(j), continuation);
                        return objH == CoroutineSingletons.d ? objH : unit;
                    }
                    BuildersKt.c(coroutineScope, null, null, new AnonymousClass1(textFieldMagnifierNodeImpl282, j, null), 3);
                    return unit;
                }
            };
            this.p = 1;
            if (((AbstractFlow) flowM).collect(flowCollector, this) == coroutineSingletons) {
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
