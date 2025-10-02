package androidx.compose.material;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$1$1", f = "FloatingActionButton.kt", l = {272}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DefaultFloatingActionButtonElevation$elevation$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ FloatingActionButtonElevationAnimatable q;
    public final /* synthetic */ DefaultFloatingActionButtonElevation r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFloatingActionButtonElevation$elevation$1$1(FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, DefaultFloatingActionButtonElevation defaultFloatingActionButtonElevation, Continuation continuation) {
        super(2, continuation);
        this.q = floatingActionButtonElevationAnimatable;
        this.r = defaultFloatingActionButtonElevation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DefaultFloatingActionButtonElevation$elevation$1$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultFloatingActionButtonElevation$elevation$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        Unit unit = Unit.f24250a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        DefaultFloatingActionButtonElevation defaultFloatingActionButtonElevation = this.r;
        float f = defaultFloatingActionButtonElevation.f1267a;
        float f2 = defaultFloatingActionButtonElevation.b;
        float f3 = defaultFloatingActionButtonElevation.c;
        float f4 = defaultFloatingActionButtonElevation.d;
        this.p = 1;
        FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable = this.q;
        floatingActionButtonElevationAnimatable.f1287a = f;
        floatingActionButtonElevationAnimatable.b = f2;
        floatingActionButtonElevationAnimatable.c = f3;
        floatingActionButtonElevationAnimatable.d = f4;
        Object objB = floatingActionButtonElevationAnimatable.b(this);
        if (objB != coroutineSingletons) {
            objB = unit;
        }
        return objB == coroutineSingletons ? coroutineSingletons : unit;
    }
}
