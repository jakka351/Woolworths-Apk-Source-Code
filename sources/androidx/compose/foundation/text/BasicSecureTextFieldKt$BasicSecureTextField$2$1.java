package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$2$1", f = "BasicSecureTextField.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class BasicSecureTextFieldKt$BasicSecureTextField$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ boolean p;
    public final /* synthetic */ SecureTextFieldController q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicSecureTextFieldKt$BasicSecureTextField$2$1(boolean z, SecureTextFieldController secureTextFieldController, Continuation continuation) {
        super(2, continuation);
        this.p = z;
        this.q = secureTextFieldController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BasicSecureTextFieldKt$BasicSecureTextField$2$1(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        BasicSecureTextFieldKt$BasicSecureTextField$2$1 basicSecureTextFieldKt$BasicSecureTextField$2$1 = (BasicSecureTextFieldKt$BasicSecureTextField$2$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        basicSecureTextFieldKt$BasicSecureTextField$2$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        if (this.p) {
            return Unit.f24250a;
        }
        this.q.getClass();
        throw null;
    }
}
