package androidx.datastore.core;

import androidx.datastore.core.DataStoreImpl;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$incrementCollector$2$1", f = "DataStoreImpl.kt", l = {134, 135}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class DataStoreImpl$incrementCollector$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ DataStoreImpl q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$incrementCollector$2$1(DataStoreImpl dataStoreImpl, Continuation continuation) {
        super(2, continuation);
        this.q = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DataStoreImpl$incrementCollector$2$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DataStoreImpl$incrementCollector$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        Unit unit = Unit.f24250a;
        final DataStoreImpl dataStoreImpl = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            DataStoreImpl.InitDataStore initDataStore = dataStoreImpl.i;
            this.p = 1;
            Object objAwait = initDataStore.b.await(this);
            if (objAwait != coroutineSingletons) {
                objAwait = unit;
            }
            if (objAwait != coroutineSingletons) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        Flow flowC = FlowKt.c(dataStoreImpl.g().getC(), -1);
        FlowCollector flowCollector = new FlowCollector() { // from class: androidx.datastore.core.DataStoreImpl$incrementCollector$2$1.1
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj2, Continuation continuation) {
                Object objE;
                DataStoreImpl dataStoreImpl2 = dataStoreImpl;
                return ((dataStoreImpl2.h.a() instanceof Final) || (objE = DataStoreImpl.e(dataStoreImpl2, true, continuation)) != CoroutineSingletons.d) ? Unit.f24250a : objE;
            }
        };
        this.p = 2;
        return flowC.collect(flowCollector, this) == coroutineSingletons ? coroutineSingletons : unit;
    }
}
