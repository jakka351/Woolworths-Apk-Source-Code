package au.com.woolworths.feature.shop.bundles.ui;

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
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class BundlesScreenKt$LoadingUi$1$1 implements PointerInputEventHandler {
    public static final BundlesScreenKt$LoadingUi$1$1 d = new BundlesScreenKt$LoadingUi$1$1();

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.bundles.ui.BundlesScreenKt$LoadingUi$1$1$1", f = "BundlesScreen.kt", l = {234}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.bundles.ui.BundlesScreenKt$LoadingUi$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        public int q;
        public /* synthetic */ Object r;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, continuation);
            anonymousClass1.r = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass1) create((AwaitPointerEventScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            return CoroutineSingletons.d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AwaitPointerEventScope awaitPointerEventScope;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.q;
            if (i == 0) {
                ResultKt.b(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.r;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                awaitPointerEventScope = (AwaitPointerEventScope) this.r;
                ResultKt.b(obj);
            }
            do {
                this.r = awaitPointerEventScope;
                this.q = 1;
            } while (awaitPointerEventScope.x1(PointerEventPass.e, this) != coroutineSingletons);
            return coroutineSingletons;
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        Object objC1 = pointerInputScope.c1(new AnonymousClass1(2, null), continuation);
        return objC1 == CoroutineSingletons.d ? objC1 : Unit.f24250a;
    }
}
