package me.oriient.internal.services.uploadingManager;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.serializerJson.Jsonable;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItem;
import me.oriient.internal.services.uploadingManager.models.DataUploaderSession;
import me.oriient.internal.services.uploadingManager.models.UploadableSample;

/* renamed from: me.oriient.internal.services.uploadingManager.l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1534l extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25639a;
    public final /* synthetic */ C1536n b;
    public final /* synthetic */ UploadableSample c;
    public final /* synthetic */ Map d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1534l(C1536n c1536n, UploadableSample uploadableSample, Map map, Continuation continuation) {
        super(2, continuation);
        this.b = c1536n;
        this.c = uploadableSample;
        this.d = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C1534l c1534l = new C1534l(this.b, this.c, this.d, continuation);
        c1534l.f25639a = obj;
        return c1534l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1534l) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Unit unit;
        boolean z;
        String str;
        String str2;
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        C1536n c1536n = this.b;
        DataUploaderSession dataUploaderSession = c1536n.p;
        Unit unit2 = Unit.f24250a;
        if (dataUploaderSession == null) {
            ((Logger) c1536n.j.getD()).w("DataUploadManager", "Received data but no session");
            return unit2;
        }
        Long l = c1536n.r;
        long jLongValue = l != null ? l.longValue() : this.c.getStartTimeMillis();
        C1536n c1536n2 = this.b;
        if (c1536n2.r == null) {
            c1536n2.r = new Long(this.c.getStartTimeMillis());
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        C1536n c1536n3 = this.b;
        objectRef.d = c1536n3.q;
        Map map = this.d;
        if (map != null) {
            HashMap<String, Jsonable> clientMetadata = dataUploaderSession.getClientMetadata();
            HashMap<String, Jsonable> map2 = new HashMap<>((Map<? extends String, ? extends Jsonable>) (clientMetadata != null ? MapsKt.m(clientMetadata, map) : EmptyMap.d));
            C1536n.a(c1536n3, "upload", dataUploaderSession, map2);
            dataUploaderSession.setClientMetadata(map2);
            me.oriient.internal.services.uploadingManager.models.a aVar = (me.oriient.internal.services.uploadingManager.models.a) objectRef.d;
            DataUploaderItem dataUploaderItem = aVar != null ? aVar.c : null;
            if (dataUploaderItem != null) {
                dataUploaderItem.setClientMetadata(map2);
            }
        }
        if (objectRef.d == null) {
            C1536n.a(this.b).d("DataUploadManager", "upload: new chunk");
            try {
                C1536n c1536n4 = this.b;
                try {
                    obj2 = "sessionId";
                    unit = unit2;
                    try {
                        objectRef.d = C1536n.a(c1536n4, dataUploaderSession, c1536n4.s, jLongValue, this.c.getStartTimeMillis());
                        C1536n.a(this.b).d("DataUploadManager", "Creating chunk " + this.b.s + ' ' + ((me.oriient.internal.services.uploadingManager.models.a) objectRef.d).c.getDataType().name());
                        C1536n c1536n5 = this.b;
                        z = true;
                        c1536n5.s = c1536n5.s + 1;
                    } catch (Exception e) {
                        e = e;
                        C1536n c1536n6 = this.b;
                        ((Logger) c1536n6.j.getD()).e("DataUploadManager", "sessionFailed() called with: session = " + dataUploaderSession + ", e = " + e);
                        ((ELog) c1536n6.k.getD()).e("DataUploadManager", "Session failed", MapsKt.j(new Pair("errorMessage", e.getMessage()), new Pair(obj2, dataUploaderSession.getId()), new Pair("dataType", c1536n6.e.name()), new Pair("sessionType", dataUploaderSession.getSessionType().getValue())));
                        c1536n6.stop(new DataUploaderSession.EndReason.Error(e), null);
                        return unit;
                    }
                } catch (Exception e2) {
                    e = e2;
                    obj2 = "sessionId";
                    unit = unit2;
                    C1536n c1536n62 = this.b;
                    ((Logger) c1536n62.j.getD()).e("DataUploadManager", "sessionFailed() called with: session = " + dataUploaderSession + ", e = " + e);
                    ((ELog) c1536n62.k.getD()).e("DataUploadManager", "Session failed", MapsKt.j(new Pair("errorMessage", e.getMessage()), new Pair(obj2, dataUploaderSession.getId()), new Pair("dataType", c1536n62.e.name()), new Pair("sessionType", dataUploaderSession.getSessionType().getValue())));
                    c1536n62.stop(new DataUploaderSession.EndReason.Error(e), null);
                    return unit;
                }
            } catch (Exception e3) {
                e = e3;
                obj2 = "sessionId";
            }
        } else {
            obj2 = "sessionId";
            unit = unit2;
            z = true;
        }
        Long l2 = ((me.oriient.internal.services.uploadingManager.models.a) objectRef.d).f;
        long jLongValue2 = l2 != null ? l2.longValue() : this.c.getStartTimeMillis();
        me.oriient.internal.services.uploadingManager.models.a aVar2 = (me.oriient.internal.services.uploadingManager.models.a) objectRef.d;
        if (aVar2.f == null) {
            str = "DataUploadManager";
            aVar2.f = new Long(this.c.getStartTimeMillis());
        } else {
            str = "DataUploadManager";
        }
        if (this.b.t || ((me.oriient.internal.services.uploadingManager.models.a) objectRef.d).h <= this.c.getStartTimeMillis()) {
            str2 = str;
            j = jLongValue;
        } else {
            C1536n c1536n7 = this.b;
            c1536n7.t = z;
            str2 = str;
            ((Logger) c1536n7.j.getD()).e(str2, "wrong timestamp order (type: " + this.b.e.getStrValue() + "). last - " + ((me.oriient.internal.services.uploadingManager.models.a) objectRef.d).h + ", next - " + this.c.getStartTimeMillis());
            j = jLongValue;
            ((ELog) this.b.k.getD()).e(str2, "wrong timestamp order", MapsKt.j(new Pair(obj2, dataUploaderSession.getId()), new Pair("dataType", this.b.e.name()), new Pair("sessionType", dataUploaderSession.getSessionType().getValue()), new Pair("lastSampleTimeMillis", new Long(((me.oriient.internal.services.uploadingManager.models.a) objectRef.d).h)), new Pair("nextSampleTimeMillis", new Long(this.c.getStartTimeMillis()))));
        }
        ((me.oriient.internal.services.uploadingManager.models.a) objectRef.d).h = this.c.getStartTimeMillis();
        me.oriient.internal.services.uploadingManager.models.a aVar3 = (me.oriient.internal.services.uploadingManager.models.a) objectRef.d;
        byte[] data = this.c.getPayload();
        aVar3.getClass();
        Intrinsics.h(data, "data");
        aVar3.d = ArraysKt.Z(aVar3.d, data);
        aVar3.e++;
        DataUploaderItem dataUploaderItem2 = ((me.oriient.internal.services.uploadingManager.models.a) objectRef.d).c;
        dataUploaderItem2.setBytesCount(dataUploaderItem2.getBytesCount() + this.c.getPayload().length);
        ((me.oriient.internal.services.uploadingManager.models.a) objectRef.d).c.setStopTimeMillis(Math.abs(this.c.getEndTimeMillis() - j) + dataUploaderSession.getSessionStartTimeMillis());
        this.b.a((me.oriient.internal.services.uploadingManager.models.a) objectRef.d, "upload", false);
        if (Math.abs(this.c.getEndTimeMillis() - jLongValue2) > TimeUnit.SECONDS.toMillis(this.b.f.getChunkLengthSeconds())) {
            C1536n.a(this.b).d(str2, "Finished chunk " + ((me.oriient.internal.services.uploadingManager.models.a) objectRef.d).f25641a + ' ' + ((me.oriient.internal.services.uploadingManager.models.a) objectRef.d).c.getDataType().name());
            this.b.a((me.oriient.internal.services.uploadingManager.models.a) objectRef.d, (DataUploaderItem.EndReason) new DataUploaderItem.EndReason.EndOfChunk(), false);
            this.b.q = null;
        } else {
            this.b.q = (me.oriient.internal.services.uploadingManager.models.a) objectRef.d;
        }
        long jAbs = Math.abs(this.c.getEndTimeMillis() - j) / TimeUnit.MINUTES.toMillis(1L);
        if (jAbs > this.b.f.getMaxSessionLengthMin()) {
            C1536n.a(this.b).d(str2, "reached session time limit " + ((me.oriient.internal.services.uploadingManager.models.a) objectRef.d).c.getDataType().name());
            this.b.stop(new DataUploaderSession.EndReason.SessionLimit(jAbs), this.d);
        }
        return unit;
    }
}
