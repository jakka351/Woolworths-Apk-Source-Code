package androidx.compose.foundation;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "invoke", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BasicTooltipKt$handleGestures$1 implements PointerInputEventHandler {

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1", f = "BasicTooltip.kt", l = {162}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1", f = "BasicTooltip.kt", l = {166, 169, 175}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C00081 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            public PointerEventPass q;
            public int r;
            public /* synthetic */ Object s;

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1$1", f = "BasicTooltip.kt", l = {172}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1$1, reason: invalid class name and collision with other inner class name */
            final class C00091 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    throw null;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    throw null;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                    ResultKt.b(obj);
                    throw null;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                throw null;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                throw null;
            }

            /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
            
                if (r8 == r0) goto L24;
             */
            /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object, java.util.List] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                    int r1 = r7.r
                    r2 = 0
                    r3 = 2
                    r4 = 3
                    r5 = 1
                    if (r1 == 0) goto L43
                    if (r1 == r5) goto L39
                    if (r1 == r3) goto L31
                    if (r1 != r4) goto L29
                    kotlin.ResultKt.b(r8)
                    androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.ui.input.pointer.PointerEvent) r8
                    java.lang.Object r8 = r8.f1851a
                    int r0 = r8.size()
                L1b:
                    if (r2 >= r0) goto L7b
                    java.lang.Object r1 = r8.get(r2)
                    androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
                    r1.a()
                    int r2 = r2 + 1
                    goto L1b
                L29:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L31:
                    java.lang.Object r0 = r7.s
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r0 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r0
                    kotlin.ResultKt.b(r8)
                    goto L72
                L39:
                    androidx.compose.ui.input.pointer.PointerEventPass r1 = r7.q
                    java.lang.Object r2 = r7.s
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r2
                    kotlin.ResultKt.b(r8)
                    goto L5c
                L43:
                    kotlin.ResultKt.b(r8)
                    java.lang.Object r8 = r7.s
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
                    androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.d
                    r7.s = r8
                    r7.q = r1
                    r7.r = r5
                    java.lang.Object r2 = androidx.compose.foundation.gestures.TapGestureDetectorKt.c(r8, r2, r7, r5)
                    if (r2 != r0) goto L59
                    goto L71
                L59:
                    r6 = r2
                    r2 = r8
                    r8 = r6
                L5c:
                    androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
                    int r8 = r8.i
                    if (r8 != r5) goto L63
                    goto L65
                L63:
                    if (r8 != r4) goto L7b
                L65:
                    r7.s = r2
                    r7.q = r1
                    r7.r = r3
                    java.lang.Object r8 = androidx.compose.foundation.gestures.TapGestureDetectorKt.j(r2, r1, r7)
                    if (r8 != r0) goto L72
                L71:
                    return r0
                L72:
                    androidx.compose.foundation.gestures.LongPressResult r8 = (androidx.compose.foundation.gestures.LongPressResult) r8
                    boolean r8 = r8 instanceof androidx.compose.foundation.gestures.LongPressResult.Success
                    if (r8 != 0) goto L79
                    goto L7b
                L79:
                    r8 = 0
                    throw r8
                L7b:
                    kotlin.Unit r8 = kotlin.Unit.f24250a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicTooltipKt$handleGestures$1.AnonymousClass1.C00081.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            throw null;
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        throw null;
    }
}
