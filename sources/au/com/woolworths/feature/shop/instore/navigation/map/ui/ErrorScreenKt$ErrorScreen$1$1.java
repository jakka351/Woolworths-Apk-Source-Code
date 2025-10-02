package au.com.woolworths.feature.shop.instore.navigation.map.ui;

import android.content.Context;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapErrorState;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.MapAnalyticsEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.ErrorScreenKt$ErrorScreen$1$1", f = "ErrorScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ErrorScreenKt$ErrorScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Context p;
    public final /* synthetic */ Function1 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorScreenKt$ErrorScreen$1$1(Context context, Function1 function1, Continuation continuation) {
        super(2, continuation);
        InstoreMapErrorState instoreMapErrorState = InstoreMapErrorState.d;
        this.p = context;
        this.q = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        InstoreMapErrorState instoreMapErrorState = InstoreMapErrorState.d;
        return new ErrorScreenKt$ErrorScreen$1$1(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ErrorScreenKt$ErrorScreen$1$1 errorScreenKt$ErrorScreen$1$1 = (ErrorScreenKt$ErrorScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        errorScreenKt$ErrorScreen$1$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String string;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        InstoreMapErrorState instoreMapErrorState = InstoreMapErrorState.d;
        Context context = this.p;
        Intrinsics.h(context, "context");
        InstoreMapErrorState.SERVER server = (InstoreMapErrorState.SERVER) instoreMapErrorState;
        Text d = server.getD();
        if (d == null || (string = d.getText(context).toString()) == null) {
            string = "";
        }
        this.q.invoke(new MapAnalyticsEvent.MapLoadServerError(string, server.getE().getText(context).toString()));
        return Unit.f24250a;
    }
}
