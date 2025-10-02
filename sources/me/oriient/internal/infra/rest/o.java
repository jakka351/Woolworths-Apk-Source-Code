package me.oriient.internal.infra.rest;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;

/* loaded from: classes7.dex */
public final /* synthetic */ class o extends FunctionReferenceImpl implements Function1 {
    public o(RestServiceImpl restServiceImpl) {
        super(1, restServiceImpl, RestServiceImpl.class, "responseToBytes", "responseToBytes(Lokhttp3/Response;)Lme/oriient/internal/infra/utils/core/Outcome;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Response p0 = (Response) obj;
        Intrinsics.h(p0, "p0");
        return ((RestServiceImpl) this.receiver).responseToBytes(p0);
    }
}
