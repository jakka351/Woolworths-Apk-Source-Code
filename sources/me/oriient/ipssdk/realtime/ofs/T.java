package me.oriient.ipssdk.realtime.ofs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.ipssdk.api.listeners.IPSGetByIdListener;
import me.oriient.ipssdk.base.auth.User;
import me.oriient.ipssdk.common.utils.models.BuildingId;
import me.oriient.ipssdk.common.utils.models.Error;
import me.oriient.ipssdk.realtime.services.rest.ContentRestServiceImpl;
import me.oriient.ipssdk.realtime.services.rest.responses.Content;

/* loaded from: classes8.dex */
public final class T extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26009a;
    public final /* synthetic */ List b;
    public final /* synthetic */ ContentRestServiceImpl c;
    public final /* synthetic */ User d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ IPSGetByIdListener g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(List list, ContentRestServiceImpl contentRestServiceImpl, User user, String str, String str2, IPSGetByIdListener iPSGetByIdListener, Continuation continuation) {
        super(2, continuation);
        this.b = list;
        this.c = contentRestServiceImpl;
        this.d = user;
        this.e = str;
        this.f = str2;
        this.g = iPSGetByIdListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new T(this.b, this.c, this.d, this.e, this.f, this.g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((T) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objAccess$getRegionsByIdsSync;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26009a;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                String strM = CollectionsKt.M(this.b, ",", null, null, null, 62);
                ContentRestServiceImpl contentRestServiceImpl = this.c;
                String id = this.d.getSpace().getId();
                String str = this.e;
                String str2 = this.f;
                this.f26009a = 1;
                objAccess$getRegionsByIdsSync = ContentRestServiceImpl.access$getRegionsByIdsSync(contentRestServiceImpl, id, str, str2, strM, this);
                if (objAccess$getRegionsByIdsSync == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                objAccess$getRegionsByIdsSync = obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) objAccess$getRegionsByIdsSync).iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(((Content) it.next()).m470toRegionTVSKQeo(BuildingId.m441constructorimpl(this.f)));
                } catch (Throwable th) {
                    ContentRestServiceImpl.access$getLogger(this.c).e("ContentRestService", "getRegionsById: failed to parse location tag: " + th.getMessage());
                }
            }
            this.g.onResults(arrayList);
        } catch (Throwable th2) {
            if (!(th2 instanceof CancellationException)) {
                ContentRestServiceImpl.access$getLogger(this.c).e("ContentRestService", "getRegionsById: " + th2.getMessage());
                this.g.onError(new Error("failed to getRegionsById: " + th2.getMessage(), 0, 1));
            }
        }
        return Unit.f24250a;
    }
}
