package me.oriient.internal.services.auth;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import me.oriient.internal.infra.rest.RestService;

/* loaded from: classes7.dex */
public final /* synthetic */ class I extends FunctionReferenceImpl implements Function2, SuspendFunction {
    public I(Object obj) {
        super(2, obj, RestService.class, "getString", "getString(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RestService) this.receiver).getString((Function1) obj, (Continuation) obj2);
    }
}
