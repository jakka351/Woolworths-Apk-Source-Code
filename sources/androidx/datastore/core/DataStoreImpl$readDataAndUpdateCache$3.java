package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlnlnnn;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001\"\u0004\b\u0000\u0010\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Landroidx/datastore/core/State;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", f = "DataStoreImpl.kt", l = {298, nlnlnnn.xxx00780078x0078}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DataStoreImpl$readDataAndUpdateCache$3 extends SuspendLambda implements Function1<Continuation<? super Pair<? extends State<Object>, ? extends Boolean>>, Object> {
    public Throwable p;
    public int q;
    public final /* synthetic */ DataStoreImpl r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readDataAndUpdateCache$3(DataStoreImpl dataStoreImpl, Continuation continuation) {
        super(1, continuation);
        this.r = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DataStoreImpl$readDataAndUpdateCache$3(this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((DataStoreImpl$readDataAndUpdateCache$3) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        State readException;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        DataStoreImpl dataStoreImpl = this.r;
        try {
        } catch (Throwable th2) {
            InterProcessCoordinator interProcessCoordinatorG = dataStoreImpl.g();
            this.p = th2;
            this.q = 2;
            Object objB = interProcessCoordinatorG.b(this);
            if (objB != coroutineSingletons) {
                th = th2;
                obj = objB;
            }
        }
        if (i == 0) {
            ResultKt.b(obj);
            this.q = 1;
            obj = DataStoreImpl.f(dataStoreImpl, true, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = this.p;
                ResultKt.b(obj);
                readException = new ReadException(th, ((Number) obj).intValue());
                return new Pair(readException, Boolean.TRUE);
            }
            ResultKt.b(obj);
        }
        readException = (State) obj;
        return new Pair(readException, Boolean.TRUE);
    }
}
