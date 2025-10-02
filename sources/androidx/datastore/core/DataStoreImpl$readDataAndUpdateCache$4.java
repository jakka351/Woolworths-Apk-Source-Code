package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Landroidx/datastore/core/State;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "locked"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", f = "DataStoreImpl.kt", l = {306, 309}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DataStoreImpl$readDataAndUpdateCache$4 extends SuspendLambda implements Function2<Boolean, Continuation<? super Pair<? extends State<Object>, ? extends Boolean>>, Object> {
    public Throwable p;
    public int q;
    public /* synthetic */ boolean r;
    public final /* synthetic */ DataStoreImpl s;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readDataAndUpdateCache$4(DataStoreImpl dataStoreImpl, int i, Continuation continuation) {
        super(2, continuation);
        this.s = dataStoreImpl;
        this.t = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DataStoreImpl$readDataAndUpdateCache$4 dataStoreImpl$readDataAndUpdateCache$4 = new DataStoreImpl$readDataAndUpdateCache$4(this.s, this.t, continuation);
        dataStoreImpl$readDataAndUpdateCache$4.r = ((Boolean) obj).booleanValue();
        return dataStoreImpl$readDataAndUpdateCache$4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((DataStoreImpl$readDataAndUpdateCache$4) create(bool, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        int iIntValue;
        boolean z;
        State state;
        boolean z2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        boolean z3 = this.q;
        DataStoreImpl dataStoreImpl = this.s;
        try {
        } catch (Throwable th2) {
            if (z3 != 0) {
                InterProcessCoordinator interProcessCoordinatorG = dataStoreImpl.g();
                this.p = th2;
                this.r = z3;
                this.q = 2;
                Object objB = interProcessCoordinatorG.b(this);
                if (objB != coroutineSingletons) {
                    z = z3;
                    th = th2;
                    obj = objB;
                }
            } else {
                boolean z4 = z3;
                th = th2;
                iIntValue = this.t;
                z = z4;
            }
        }
        if (z3 == 0) {
            ResultKt.b(obj);
            boolean z5 = this.r;
            this.r = z5;
            this.q = 1;
            obj = DataStoreImpl.f(dataStoreImpl, z5, this);
            z3 = z5;
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (z3 != 1) {
                if (z3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = this.r;
                th = this.p;
                ResultKt.b(obj);
                iIntValue = ((Number) obj).intValue();
                ReadException readException = new ReadException(th, iIntValue);
                z2 = z;
                state = readException;
                return new Pair(state, Boolean.valueOf(z2));
            }
            boolean z6 = this.r;
            ResultKt.b(obj);
            z3 = z6;
        }
        state = (State) obj;
        z2 = z3;
        return new Pair(state, Boolean.valueOf(z2));
    }
}
