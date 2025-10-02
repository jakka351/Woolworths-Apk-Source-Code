package me.oriient.internal.services.uploadingManager;

import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.serializerJson.Jsonable;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItem;
import me.oriient.internal.services.uploadingManager.models.DataUploaderSession;

/* renamed from: me.oriient.internal.services.uploadingManager.j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1532j extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1536n f25637a;
    public final /* synthetic */ DataUploaderSession.EndReason b;
    public final /* synthetic */ Map c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1532j(C1536n c1536n, DataUploaderSession.EndReason endReason, Map map, Continuation continuation) {
        super(2, continuation);
        this.f25637a = c1536n;
        this.b = endReason;
        this.c = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1532j(this.f25637a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1532j) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        C1536n.a(this.f25637a).d("DataUploadManager", "stop() called with: reason = " + this.b + ", updatedClientMetadata = " + this.c);
        C1536n c1536n = this.f25637a;
        DataUploaderSession dataUploaderSession = c1536n.p;
        if (dataUploaderSession != null) {
            DataUploaderSession.EndReason endReason = this.b;
            Map map = this.c;
            me.oriient.internal.services.uploadingManager.models.a aVar = c1536n.q;
            if (aVar != null) {
                ((ELog) c1536n.k.getD()).d("DataUploadManager", "Session stopped", MapsKt.j(new Pair("sessionId", dataUploaderSession.getId()), new Pair("reason", endReason.getKey()), new Pair("dataType", c1536n.e.name()), new Pair("sessionType", dataUploaderSession.getSessionType().getValue())));
                if (dataUploaderSession.getShouldBeUploaded()) {
                    if (map != null) {
                        HashMap<String, Jsonable> clientMetadata = dataUploaderSession.getClientMetadata();
                        HashMap<String, Jsonable> map2 = new HashMap<>((Map<? extends String, ? extends Jsonable>) (clientMetadata != null ? MapsKt.m(clientMetadata, map) : EmptyMap.d));
                        C1536n.a(c1536n, "stop", dataUploaderSession, map2);
                        dataUploaderSession.setClientMetadata(map2);
                        aVar.c.setClientMetadata(map2);
                    }
                    c1536n.a(aVar, (DataUploaderItem.EndReason) new DataUploaderItem.EndReason.EndOfSession(endReason.getKey()), true);
                } else {
                    BuildersKt.c((CoroutineScope) c1536n.u.getD(), null, null, new C1527e(c1536n, dataUploaderSession, null), 3);
                }
            }
        }
        this.f25637a.c.setCurrentSessionId(null);
        C1536n c1536n2 = this.f25637a;
        c1536n2.p = null;
        c1536n2.s = 0;
        c1536n2.r = null;
        c1536n2.o.set(false);
        C1536n c1536n3 = this.f25637a;
        c1536n3.q = null;
        c1536n3.d.reportDeviceStatistics();
        return Unit.f24250a;
    }
}
