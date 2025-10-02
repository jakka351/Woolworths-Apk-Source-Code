package me.oriient.internal.services.dataManager.plaiCategories;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import me.oriient.internal.services.config.InternalConfig;
import me.oriient.internal.services.config.InternalConfigManager;

/* renamed from: me.oriient.internal.services.dataManager.plaiCategories.j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1385j extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25349a;
    public final /* synthetic */ C1397w b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1385j(C1397w c1397w, Continuation continuation) {
        super(2, continuation);
        this.b = c1397w;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1385j(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1385j(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25349a;
        Unit unit = Unit.f24250a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        C1397w c1397w = this.b;
        int plaiInfoCacheExpirationDays = ((InternalConfig) ((InternalConfigManager) c1397w.e.getD()).getConfig().getValue()).getPlaiConfig().getPlaiInfoCacheExpirationDays();
        this.f25349a = 1;
        S s = (S) ((E) c1397w.f25359a.f25348a.getD());
        s.getClass();
        BuildersKt.c(s.f25334a, null, null, new K(new J(s, plaiInfoCacheExpirationDays, null), s, null), 3);
        return unit == coroutineSingletons ? coroutineSingletons : unit;
    }
}
