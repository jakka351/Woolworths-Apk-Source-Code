package au.com.woolworths.feature.shop.bundles.ui;

import androidx.compose.material3.TopAppBarScrollBehavior;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.bundles.ui.BundlesPageKt$BundlesPageUi$1$1", f = "BundlesPage.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class BundlesPageKt$BundlesPageUi$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ TopAppBarScrollBehavior p;
    public final /* synthetic */ Function1 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundlesPageKt$BundlesPageUi$1$1(TopAppBarScrollBehavior topAppBarScrollBehavior, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.p = topAppBarScrollBehavior;
        this.q = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BundlesPageKt$BundlesPageUi$1$1(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        BundlesPageKt$BundlesPageUi$1$1 bundlesPageKt$BundlesPageUi$1$1 = (BundlesPageKt$BundlesPageUi$1$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        bundlesPageKt$BundlesPageUi$1$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        float fA = this.p.getF1443a().a();
        Function1 function1 = this.q;
        if (fA == 1.0f) {
            function1.invoke(Boolean.FALSE);
        } else {
            function1.invoke(Boolean.TRUE);
        }
        return Unit.f24250a;
    }
}
