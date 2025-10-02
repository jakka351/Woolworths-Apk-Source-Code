package au.com.woolworths.feature.shop.contentpage.ui;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import com.google.accompanist.systemuicontroller.SystemUiController;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.contentpage.ui.ContentPageScreenKt$ContentPageScreen$1$1", f = "ContentPageScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ContentPageScreenKt$ContentPageScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ SystemUiController p;
    public final /* synthetic */ State q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentPageScreenKt$ContentPageScreen$1$1(SystemUiController systemUiController, State state, Continuation continuation) {
        super(2, continuation);
        this.p = systemUiController;
        this.q = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ContentPageScreenKt$ContentPageScreen$1$1(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ContentPageScreenKt$ContentPageScreen$1$1 contentPageScreenKt$ContentPageScreen$1$1 = (ContentPageScreenKt$ContentPageScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        contentPageScreenKt$ContentPageScreen$1$1.invokeSuspend(unit);
        return unit;
    }

    /* JADX WARN: Failed to inline method: com.google.accompanist.systemuicontroller.SystemUiController.c(com.google.accompanist.systemuicontroller.SystemUiController, long):void */
    /* JADX WARN: Not passed register '(r0v1 'j' long)' in method call: com.google.accompanist.systemuicontroller.SystemUiController.c(com.google.accompanist.systemuicontroller.SystemUiController, long):void */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        long j = Color.j;
        SystemUiController systemUiController = this.p;
        SystemUiController.c(systemUiController, j);
        systemUiController.f(!((Boolean) this.q.getD()).booleanValue());
        return Unit.f24250a;
    }
}
