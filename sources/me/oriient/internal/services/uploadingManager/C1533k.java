package me.oriient.internal.services.uploadingManager;

import java.util.HashMap;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.serializerJson.Jsonable;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItem;
import me.oriient.internal.services.uploadingManager.models.DataUploaderSession;

/* renamed from: me.oriient.internal.services.uploadingManager.k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1533k extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25638a;
    public final /* synthetic */ C1536n b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ Long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1533k(C1536n c1536n, Map map, Long l, Continuation continuation) {
        super(2, continuation);
        this.b = c1536n;
        this.c = map;
        this.d = l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C1533k c1533k = new C1533k(this.b, this.c, this.d, continuation);
        c1533k.f25638a = obj;
        return c1533k;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1533k) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        C1536n c1536n = this.b;
        DataUploaderSession dataUploaderSession = c1536n.p;
        Unit unit = Unit.f24250a;
        if (dataUploaderSession == null) {
            ((Logger) c1536n.j.getD()).w("DataUploadManager", "(" + c1536n.e + ") no session in which to update metadata");
            return unit;
        }
        HashMap<String, Jsonable> clientMetadata = dataUploaderSession.getClientMetadata();
        HashMap<String, Jsonable> map = new HashMap<>((Map<? extends String, ? extends Jsonable>) (clientMetadata != null ? MapsKt.m(clientMetadata, this.c) : EmptyMap.d));
        dataUploaderSession.setClientMetadata(map);
        C1536n c1536n2 = this.b;
        me.oriient.internal.services.uploadingManager.models.a aVar = c1536n2.q;
        if (aVar != null) {
            Long l = this.d;
            aVar.c.setClientMetadata(map);
            DataUploaderItem dataUploaderItem = aVar.c;
            dataUploaderItem.setStopTimeMillis(l != null ? l.longValue() : dataUploaderItem.getStopTimeMillis());
            c1536n2.a(aVar, "updateClientMetadata", false);
        }
        return unit;
    }
}
