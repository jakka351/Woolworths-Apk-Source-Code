package me.oriient.ipssdk.realtime.ofs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.ipssdk.base.auth.User;
import me.oriient.ipssdk.common.utils.models.BuildingId;
import me.oriient.ipssdk.common.utils.models.Error;
import me.oriient.ipssdk.common.utils.runtimedata.UserSessionId;
import me.oriient.ipssdk.realtime.services.rest.ContentRestServiceImpl;
import me.oriient.ipssdk.realtime.services.rest.IRegionsListener;
import me.oriient.ipssdk.realtime.services.rest.responses.Content;

/* loaded from: classes8.dex */
public final class M extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25972a;
    public final /* synthetic */ ContentRestServiceImpl b;
    public final /* synthetic */ User c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ IRegionsListener f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(ContentRestServiceImpl contentRestServiceImpl, User user, String str, String str2, IRegionsListener iRegionsListener, Continuation continuation) {
        super(2, continuation);
        this.b = contentRestServiceImpl;
        this.c = user;
        this.d = str;
        this.e = str2;
        this.f = iRegionsListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new M(this.b, this.c, this.d, this.e, this.f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((M) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25972a;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                ContentRestServiceImpl contentRestServiceImpl = this.b;
                String id = this.c.getSpace().getId();
                String strM452constructorimpl = UserSessionId.m452constructorimpl(this.d);
                String strM441constructorimpl = BuildingId.m441constructorimpl(this.e);
                this.f25972a = 1;
                obj = ContentRestServiceImpl.m459access$getAllRegionsSyncY0ert8M(contentRestServiceImpl, id, strM452constructorimpl, strM441constructorimpl, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(((Content) it.next()).m470toRegionTVSKQeo(BuildingId.m441constructorimpl(this.e)));
                } catch (Throwable th) {
                    ContentRestServiceImpl.access$getLogger(this.b).e("ContentRestService", "getAllRegions: failed to parse region: " + th.getMessage());
                }
            }
            this.f.onReceived(arrayList);
        } catch (Throwable th2) {
            if (!(th2 instanceof CancellationException)) {
                ContentRestServiceImpl.access$getLogger(this.b).e("ContentRestService", "fetch: " + th2.getMessage());
                this.f.onError(new Error("failed to fetch: " + th2.getMessage(), 0, 1));
            }
        }
        return Unit.f24250a;
    }
}
