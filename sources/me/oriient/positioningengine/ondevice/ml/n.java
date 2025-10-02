package me.oriient.positioningengine.ondevice.ml;

import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.infra.utils.core.FileManager;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.retryOperation.RetryExtensionsKt;

/* loaded from: classes8.dex */
public final class n extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26460a;
    public final /* synthetic */ o b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, Continuation continuation) {
        super(2, continuation);
        this.b = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new n(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new n(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26460a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        FileManager.DefaultImpls.deleteFiles$default((FileManager) this.b.f.getD(), "oriientConfigurations", false, new l(this.b), 2, null);
        File fileFindFile = ((FileManager) this.b.f.getD()).findFile("oriientConfigurations", this.b.f26461a);
        if (fileFindFile != null && fileFindFile.exists()) {
            return new Outcome.Success(Unit.f24250a);
        }
        Logger logger = (Logger) this.b.c.getD();
        int i2 = ((me.oriient.positioningengine.common.config.a) ((me.oriient.positioningengine.common.config.d) ((me.oriient.positioningengine.common.config.c) this.b.g.getD())).f26374a.getValue()).b;
        m mVar = new m(this.b, null);
        this.f26460a = 1;
        Object objRetryTo$default = RetryExtensionsKt.retryTo$default("MlModelRepository", "get model from rest", logger, i2, 0L, 0L, 0.0d, mVar, this, 112, null);
        return objRetryTo$default == coroutineSingletons ? coroutineSingletons : objRetryTo$default;
    }
}
