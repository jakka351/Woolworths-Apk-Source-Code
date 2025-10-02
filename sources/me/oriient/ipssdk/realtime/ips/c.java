package me.oriient.ipssdk.realtime.ips;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.services.dataModel.engine.EngineConfig;
import me.oriient.ipssdk.api.listeners.IPSLoginListener;
import me.oriient.ipssdk.base.auth.User;
import me.oriient.ipssdk.realtime.ips.Core;

/* loaded from: classes8.dex */
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public List f25873a;
    public User b;
    public EngineConfig c;
    public long d;
    public int e;
    public final /* synthetic */ List f;
    public final /* synthetic */ Core.LoginCandidate g;
    public final /* synthetic */ String h;
    public final /* synthetic */ CoreLogic i;
    public final /* synthetic */ IPSLoginListener j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(List list, Core.LoginCandidate loginCandidate, String str, CoreLogic coreLogic, IPSLoginListener iPSLoginListener, Continuation continuation) {
        super(2, continuation);
        this.f = list;
        this.g = loginCandidate;
        this.h = str;
        this.i = coreLogic;
        this.j = iPSLoginListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f, this.g, this.h, this.i, this.j, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032 A[PHI: r2 r4 r9
  0x0032: PHI (r2v33 me.oriient.internal.services.dataModel.engine.EngineConfig) = 
  (r2v31 me.oriient.internal.services.dataModel.engine.EngineConfig)
  (r2v35 me.oriient.internal.services.dataModel.engine.EngineConfig)
 binds: [B:34:0x01aa, B:9:0x0029] A[DONT_GENERATE, DONT_INLINE]
  0x0032: PHI (r4v11 me.oriient.ipssdk.base.auth.User) = (r4v9 me.oriient.ipssdk.base.auth.User), (r4v14 me.oriient.ipssdk.base.auth.User) binds: [B:34:0x01aa, B:9:0x0029] A[DONT_GENERATE, DONT_INLINE]
  0x0032: PHI (r9v21 java.util.List<me.oriient.ipssdk.api.models.IPSSpace>) = 
  (r9v19 java.util.List<me.oriient.ipssdk.api.models.IPSSpace>)
  (r9v22 java.util.List<me.oriient.ipssdk.api.models.IPSSpace>)
 binds: [B:34:0x01aa, B:9:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x017a A[PHI: r2 r4 r9
  0x017a: PHI (r2v31 me.oriient.internal.services.dataModel.engine.EngineConfig) = 
  (r2v29 me.oriient.internal.services.dataModel.engine.EngineConfig)
  (r2v32 me.oriient.internal.services.dataModel.engine.EngineConfig)
 binds: [B:31:0x0176, B:11:0x0039] A[DONT_GENERATE, DONT_INLINE]
  0x017a: PHI (r4v9 me.oriient.ipssdk.base.auth.User) = (r4v7 me.oriient.ipssdk.base.auth.User), (r4v10 me.oriient.ipssdk.base.auth.User) binds: [B:31:0x0176, B:11:0x0039] A[DONT_GENERATE, DONT_INLINE]
  0x017a: PHI (r9v19 java.util.List<me.oriient.ipssdk.api.models.IPSSpace>) = 
  (r9v17 java.util.List<me.oriient.ipssdk.api.models.IPSSpace>)
  (r9v20 java.util.List<me.oriient.ipssdk.api.models.IPSSpace>)
 binds: [B:31:0x0176, B:11:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01e2 A[PHI: r2 r4 r9
  0x01e2: PHI (r2v36 me.oriient.ipssdk.base.auth.User) = (r2v34 me.oriient.ipssdk.base.auth.User), (r2v46 me.oriient.ipssdk.base.auth.User) binds: [B:37:0x01de, B:8:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x01e2: PHI (r4v15 java.lang.Object) = (r4v13 java.lang.Object), (r4v25 java.lang.Object) binds: [B:37:0x01de, B:8:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x01e2: PHI (r9v23 java.util.List<me.oriient.ipssdk.api.models.IPSSpace>) = 
  (r9v21 java.util.List<me.oriient.ipssdk.api.models.IPSSpace>)
  (r9v24 java.util.List<me.oriient.ipssdk.api.models.IPSSpace>)
 binds: [B:37:0x01de, B:8:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02e2 A[RETURN] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v17, types: [kotlin.jvm.internal.ReflectionFactory] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.ips.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
