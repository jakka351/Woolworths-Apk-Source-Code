package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2$1$1", f = "TextFieldSelectionState.kt", l = {502, 510}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TextFieldSelectionState$detectTextFieldTapGestures$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ PressGestureScope r;
    public final /* synthetic */ TextFieldSelectionState s;
    public final /* synthetic */ long t;
    public final /* synthetic */ MutableInteractionSource u;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2$1$1$1", f = "TextFieldSelectionState.kt", l = {494, 499}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object p;
        public int q;
        public final /* synthetic */ TextFieldSelectionState r;
        public final /* synthetic */ long s;
        public final /* synthetic */ MutableInteractionSource t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TextFieldSelectionState textFieldSelectionState, long j, MutableInteractionSource mutableInteractionSource, Continuation continuation) {
            super(2, continuation);
            this.r = textFieldSelectionState;
            this.s = j;
            this.t = mutableInteractionSource;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.r, this.s, this.t, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r1 = r7.q
                androidx.compose.foundation.interaction.MutableInteractionSource r2 = r7.t
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r3 = r7.r
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L28
                if (r1 == r5) goto L20
                if (r1 != r4) goto L18
                java.lang.Object r0 = r7.p
                androidx.compose.foundation.interaction.PressInteraction$Press r0 = (androidx.compose.foundation.interaction.PressInteraction.Press) r0
                kotlin.ResultKt.b(r8)
                goto L56
            L18:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L20:
                java.lang.Object r1 = r7.p
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r1 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r1
                kotlin.ResultKt.b(r8)
                goto L40
            L28:
                kotlin.ResultKt.b(r8)
                androidx.compose.foundation.interaction.PressInteraction$Press r8 = r3.j
                if (r8 == 0) goto L43
                androidx.compose.foundation.interaction.PressInteraction$Cancel r1 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
                r1.<init>(r8)
                r7.p = r3
                r7.q = r5
                java.lang.Object r8 = r2.b(r1, r7)
                if (r8 != r0) goto L3f
                goto L54
            L3f:
                r1 = r3
            L40:
                r8 = 0
                r1.j = r8
            L43:
                androidx.compose.foundation.interaction.PressInteraction$Press r8 = new androidx.compose.foundation.interaction.PressInteraction$Press
                long r5 = r7.s
                r8.<init>(r5)
                r7.p = r8
                r7.q = r4
                java.lang.Object r1 = r2.b(r8, r7)
                if (r1 != r0) goto L55
            L54:
                return r0
            L55:
                r0 = r8
            L56:
                r3.j = r0
                kotlin.Unit r8 = kotlin.Unit.f24250a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectTextFieldTapGestures$2$1$1(PressGestureScope pressGestureScope, TextFieldSelectionState textFieldSelectionState, long j, MutableInteractionSource mutableInteractionSource, Continuation continuation) {
        super(2, continuation);
        this.r = pressGestureScope;
        this.s = textFieldSelectionState;
        this.t = j;
        this.u = mutableInteractionSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TextFieldSelectionState$detectTextFieldTapGestures$2$1$1 textFieldSelectionState$detectTextFieldTapGestures$2$1$1 = new TextFieldSelectionState$detectTextFieldTapGestures$2$1$1(this.r, this.s, this.t, this.u, continuation);
        textFieldSelectionState$detectTextFieldTapGestures$2$1$1.q = obj;
        return textFieldSelectionState$detectTextFieldTapGestures$2$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TextFieldSelectionState$detectTextFieldTapGestures$2$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r11.u.b(r12, r11) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r11.p
            r2 = 0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r4 = r11.s
            r9 = 2
            r10 = 1
            if (r1 == 0) goto L1f
            if (r1 == r10) goto L1b
            if (r1 != r9) goto L13
            kotlin.ResultKt.b(r12)
            goto L61
        L13:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1b:
            kotlin.ResultKt.b(r12)
            goto L3f
        L1f:
            kotlin.ResultKt.b(r12)
            java.lang.Object r12 = r11.q
            kotlinx.coroutines.CoroutineScope r12 = (kotlinx.coroutines.CoroutineScope) r12
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2$1$1$1 r3 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2$1$1$1
            androidx.compose.foundation.interaction.MutableInteractionSource r7 = r11.u
            r8 = 0
            long r5 = r11.t
            r3.<init>(r4, r5, r7, r8)
            r1 = 3
            kotlinx.coroutines.BuildersKt.c(r12, r2, r2, r3, r1)
            r11.p = r10
            androidx.compose.foundation.gestures.PressGestureScope r12 = r11.r
            java.lang.Object r12 = r12.Y0(r11)
            if (r12 != r0) goto L3f
            goto L60
        L3f:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            androidx.compose.foundation.interaction.PressInteraction$Press r1 = r4.j
            if (r1 == 0) goto L61
            if (r12 == 0) goto L51
            androidx.compose.foundation.interaction.PressInteraction$Release r12 = new androidx.compose.foundation.interaction.PressInteraction$Release
            r12.<init>(r1)
            goto L56
        L51:
            androidx.compose.foundation.interaction.PressInteraction$Cancel r12 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
            r12.<init>(r1)
        L56:
            r11.p = r9
            androidx.compose.foundation.interaction.MutableInteractionSource r1 = r11.u
            java.lang.Object r12 = r1.b(r12, r11)
            if (r12 != r0) goto L61
        L60:
            return r0
        L61:
            r4.j = r2
            kotlin.Unit r12 = kotlin.Unit.f24250a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
