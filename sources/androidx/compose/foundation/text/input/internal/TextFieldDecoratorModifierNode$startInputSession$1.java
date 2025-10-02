package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.PlatformTextInputModifierNodeKt;
import androidx.compose.ui.platform.PlatformTextInputSessionScope;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
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
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1", f = "TextFieldDecoratorModifier.kt", l = {759}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TextFieldDecoratorModifierNode$startInputSession$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ TextFieldDecoratorModifierNode q;
    public final /* synthetic */ ReceiveContentConfiguration r;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1", f = "TextFieldDecoratorModifier.kt", l = {760}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<PlatformTextInputSessionScope, Continuation<?>, Object> {
        public int p;
        public /* synthetic */ Object q;
        public final /* synthetic */ TextFieldDecoratorModifierNode r;
        public final /* synthetic */ ReceiveContentConfiguration s;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1$1, reason: invalid class name and collision with other inner class name */
        final /* synthetic */ class C00291 extends FunctionReferenceImpl implements Function1<ImeAction, Unit> {
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                TextFieldDecoratorModifierNode.w2((TextFieldDecoratorModifierNode) this.receiver, ((ImeAction) obj).f2115a);
                return Unit.f24250a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, ReceiveContentConfiguration receiveContentConfiguration, Continuation continuation) {
            super(2, continuation);
            this.r = textFieldDecoratorModifierNode;
            this.s = receiveContentConfiguration;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, this.s, continuation);
            anonymousClass1.q = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass1) create((PlatformTextInputSessionScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            return CoroutineSingletons.d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw android.support.v4.media.session.a.v(obj);
            }
            ResultKt.b(obj);
            PlatformTextInputSessionScope platformTextInputSessionScope = (PlatformTextInputSessionScope) this.q;
            final TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.r;
            TransformedTextFieldState transformedTextFieldState = textFieldDecoratorModifierNode.t;
            TextLayoutState textLayoutState = textFieldDecoratorModifierNode.u;
            ImeOptions imeOptionsD = textFieldDecoratorModifierNode.z.d(textFieldDecoratorModifierNode.B);
            C00291 c00291 = new C00291(1, textFieldDecoratorModifierNode, TextFieldDecoratorModifierNode.class, "onImeActionPerformed", "onImeActionPerformed-KlQnJC8(I)V", 0);
            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.startInputSession.1.1.2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    textFieldDecoratorModifierNode.v.t(TextToolbarState.f);
                    return Unit.f24250a;
                }
            };
            MutableSharedFlow mutableSharedFlow = textFieldDecoratorModifierNode.E;
            ViewConfiguration viewConfiguration = (ViewConfiguration) CompositionLocalConsumerModifierNodeKt.a(textFieldDecoratorModifierNode, CompositionLocalsKt.s);
            this.p = 1;
            AndroidTextInputSession_androidKt.b(platformTextInputSessionScope, transformedTextFieldState, textLayoutState, imeOptionsD, this.s, c00291, function0, mutableSharedFlow, viewConfiguration, this);
            return coroutineSingletons;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$startInputSession$1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, ReceiveContentConfiguration receiveContentConfiguration, Continuation continuation) {
        super(2, continuation);
        this.q = textFieldDecoratorModifierNode;
        this.r = receiveContentConfiguration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TextFieldDecoratorModifierNode$startInputSession$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((TextFieldDecoratorModifierNode$startInputSession$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        return CoroutineSingletons.d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw android.support.v4.media.session.a.v(obj);
        }
        ResultKt.b(obj);
        ReceiveContentConfiguration receiveContentConfiguration = this.r;
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.q;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(textFieldDecoratorModifierNode, receiveContentConfiguration, null);
        this.p = 1;
        PlatformTextInputModifierNodeKt.a(textFieldDecoratorModifierNode, anonymousClass1, this);
        return coroutineSingletons;
    }
}
