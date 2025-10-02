package me.oriient.positioningengine.support.device_data;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataManager.rest.RestHelper;

/* loaded from: classes8.dex */
public final class h extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26526a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ DeviceDataRestImpl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, String str2, DeviceDataRestImpl deviceDataRestImpl, Continuation continuation) {
        super(2, continuation);
        this.b = str;
        this.c = str2;
        this.d = deviceDataRestImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new h(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26526a;
        if (i == 0) {
            ResultKt.b(obj);
            String str = "?deviceType=" + this.b + "&userSessionId=" + this.c;
            RestHelper restHelper = this.d.getRestHelper();
            String str2 = DeviceDataRestImpl.TAG;
            String str3 = this.d.getOriientApiProvider().getOriientApi().getEngineUrl() + DeviceDataRestImpl.DEVICE_DATA_PATH + str;
            f fVar = f.f26524a;
            this.f26526a = 1;
            obj = RestHelper.DefaultImpls.getStringData$default(restHelper, str2, str3, false, fVar, this, 4, null);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return ((Outcome) obj).mapFailure(g.f26525a);
    }
}
