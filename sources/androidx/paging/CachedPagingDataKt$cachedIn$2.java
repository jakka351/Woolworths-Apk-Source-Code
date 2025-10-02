package androidx.paging;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.JobSupport;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Landroidx/paging/MulticastedPagingData;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "prev", "next"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.CachedPagingDataKt$cachedIn$2", f = "CachedPagingData.kt", l = {104}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CachedPagingDataKt$cachedIn$2 extends SuspendLambda implements Function3<MulticastedPagingData<Object>, MulticastedPagingData<Object>, Continuation<? super MulticastedPagingData<Object>>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public /* synthetic */ Object r;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CachedPagingDataKt$cachedIn$2 cachedPagingDataKt$cachedIn$2 = new CachedPagingDataKt$cachedIn$2(3, (Continuation) obj3);
        cachedPagingDataKt$cachedIn$2.q = (MulticastedPagingData) obj;
        cachedPagingDataKt$cachedIn$2.r = (MulticastedPagingData) obj2;
        return cachedPagingDataKt$cachedIn$2.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MulticastedPagingData multicastedPagingData = (MulticastedPagingData) this.q;
            ResultKt.b(obj);
            return multicastedPagingData;
        }
        ResultKt.b(obj);
        MulticastedPagingData multicastedPagingData2 = (MulticastedPagingData) this.q;
        MulticastedPagingData multicastedPagingData3 = (MulticastedPagingData) this.r;
        this.q = multicastedPagingData3;
        this.p = 1;
        ((JobSupport) multicastedPagingData2.c.d).cancel((CancellationException) null);
        return Unit.f24250a == coroutineSingletons ? coroutineSingletons : multicastedPagingData3;
    }
}
