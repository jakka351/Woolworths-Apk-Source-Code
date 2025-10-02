package me.oriient.internal.services.uploadingManager.rest;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.infra.rest.HttpResponse;
import me.oriient.internal.infra.serializerJson.JsonSerializationKt;
import me.oriient.internal.infra.utils.core.OutcomeKt;
import me.oriient.internal.infra.utils.core.ParsingError;
import me.oriient.internal.services.uploadingManager.rest.DataUploaderRest;

/* loaded from: classes7.dex */
public final class g extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25651a;
    public final /* synthetic */ DataUploaderRestImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(DataUploaderRestImpl dataUploaderRestImpl, Continuation continuation) {
        super(2, continuation);
        this.b = dataUploaderRestImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        g gVar = new g(this.b, continuation);
        gVar.f25651a = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        g gVar = new g(this.b, (Continuation) obj2);
        gVar.f25651a = (HttpResponse.StringResponse) obj;
        return gVar.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        try {
            return OutcomeKt.toOutcomeSuccess(JsonSerializationKt.parseAsJson(((HttpResponse.StringResponse) this.f25651a).getString(), Reflection.b(DataUploaderRest.FileUploadDestinationData.class)));
        } catch (Exception e) {
            this.b.getLogger().e("DataUploaderRest", "sendStartChunk: failed to parse start chunk response", e);
            return OutcomeKt.toOutcomeFailure(new ParsingError("start chunk response"));
        }
    }
}
