package me.oriient.ipssdk.realtime.ofs;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.ipssdk.api.listeners.IPSContentSearchListener;
import me.oriient.ipssdk.common.utils.models.Error;
import me.oriient.ipssdk.ips.IPSContentSearchPage;
import me.oriient.ipssdk.realtime.services.rest.ContentRestServiceImpl;
import me.oriient.ipssdk.realtime.services.rest.responses.ContentContainer;

/* loaded from: classes8.dex */
public final class J extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25959a;
    public final /* synthetic */ ContentRestServiceImpl b;
    public final /* synthetic */ IPSContentSearchPage c;
    public final /* synthetic */ IPSContentSearchListener d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(ContentRestServiceImpl contentRestServiceImpl, IPSContentSearchPage iPSContentSearchPage, IPSContentSearchListener iPSContentSearchListener, Continuation continuation) {
        super(2, continuation);
        this.b = contentRestServiceImpl;
        this.c = iPSContentSearchPage;
        this.d = iPSContentSearchListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new J(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((J) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25959a;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                ContentRestServiceImpl contentRestServiceImpl = this.b;
                String url = this.c.getUrl();
                this.f25959a = 1;
                obj = ContentRestServiceImpl.access$fetchSync(contentRestServiceImpl, url, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            ContentRestServiceImpl.access$parseContent(this.b, (ContentContainer) obj, this.d, this.c.getBuildingId(), this.c.getSearchTerm(), this.c.getPageSize());
        } catch (Throwable th) {
            if (!(th instanceof CancellationException)) {
                ContentRestServiceImpl.access$getLogger(this.b).e("ContentRestService", "fetch: " + th.getMessage());
                this.d.onError(new Error("failed to fetch: " + th.getMessage(), 0, 1));
            }
        }
        return Unit.f24250a;
    }
}
