package androidx.compose.foundation.text.input.internal;

import androidx.camera.core.impl.e;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.ui.platform.PlatformTextInputSession;
import androidx.compose.ui.platform.ViewConfiguration;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.MutableSharedFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3", f = "AndroidTextInputSession.android.kt", l = {124}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {
    public final /* synthetic */ ViewConfiguration A;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ MutableSharedFlow r;
    public final /* synthetic */ TransformedTextFieldState s;
    public final /* synthetic */ TextLayoutState t;
    public final /* synthetic */ ComposeInputMethodManager u;
    public final /* synthetic */ PlatformTextInputSession v;
    public final /* synthetic */ ImeOptions w;
    public final /* synthetic */ ReceiveContentConfiguration x;
    public final /* synthetic */ Function1 y;
    public final /* synthetic */ Function0 z;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1", f = "AndroidTextInputSession.android.kt", l = {86}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ TransformedTextFieldState q;
        public final /* synthetic */ ComposeInputMethodManager r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TransformedTextFieldState transformedTextFieldState, ComposeInputMethodManager composeInputMethodManager, Continuation continuation) {
            super(2, continuation);
            this.q = transformedTextFieldState;
            this.r = composeInputMethodManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.q, this.r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            int i2 = 1;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw android.support.v4.media.session.a.v(obj);
            }
            ResultKt.b(obj);
            e eVar = new e(this.r, i2);
            this.p = 1;
            this.q.a(eVar, this);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3(MutableSharedFlow mutableSharedFlow, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, ComposeInputMethodManager composeInputMethodManager, PlatformTextInputSession platformTextInputSession, ImeOptions imeOptions, ReceiveContentConfiguration receiveContentConfiguration, Function1 function1, Function0 function0, ViewConfiguration viewConfiguration, Continuation continuation) {
        super(2, continuation);
        this.r = mutableSharedFlow;
        this.s = transformedTextFieldState;
        this.t = textLayoutState;
        this.u = composeInputMethodManager;
        this.v = platformTextInputSession;
        this.w = imeOptions;
        this.x = receiveContentConfiguration;
        this.y = function1;
        this.z = function0;
        this.A = viewConfiguration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 androidTextInputSession_androidKt$platformSpecificTextInputSession$3 = new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, continuation);
        androidTextInputSession_androidKt$platformSpecificTextInputSession$3.q = obj;
        return androidTextInputSession_androidKt$platformSpecificTextInputSession$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
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
        CoroutineScope coroutineScope = (CoroutineScope) this.q;
        CoroutineStart coroutineStart = CoroutineStart.g;
        TransformedTextFieldState transformedTextFieldState = this.s;
        ComposeInputMethodManager composeInputMethodManager = this.u;
        BuildersKt.c(coroutineScope, null, coroutineStart, new AnonymousClass1(transformedTextFieldState, composeInputMethodManager, null), 1);
        MutableSharedFlow mutableSharedFlow = this.r;
        if (mutableSharedFlow != null) {
            BuildersKt.c(coroutineScope, null, null, new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1(mutableSharedFlow, composeInputMethodManager, null), 3);
        }
        a aVar = new a(this.s, this.w, this.x, this.u, this.y, new CursorAnchorInfoController(transformedTextFieldState, this.t, composeInputMethodManager, coroutineScope), this.t, this.z, this.A);
        this.p = 1;
        this.v.a(aVar, this);
        return coroutineSingletons;
    }
}
