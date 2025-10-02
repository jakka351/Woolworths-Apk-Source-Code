package me.oriient.internal.services.auth;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow;
import me.oriient.internal.services.config.InternalConfig;
import me.oriient.internal.services.config.InternalConfigManager;

/* renamed from: me.oriient.internal.services.auth.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1213e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25027a;
    public final /* synthetic */ D b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1213e(D d, Continuation continuation) {
        super(2, continuation);
        this.b = d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1213e(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1213e(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25027a;
        if (i == 0) {
            ResultKt.b(obj);
            StateFlow<InternalConfig> config = ((InternalConfigManager) this.b.h.getD()).getConfig();
            C1212d c1212d = new C1212d(this.b);
            this.f25027a = 1;
            if (config.collect(c1212d, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
