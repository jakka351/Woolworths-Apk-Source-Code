package me.oriient.ipssdk.realtime.services.rest;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.rest.OriientApiProvider;
import me.oriient.internal.infra.rest.RestService;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.ipssdk.base.auth.User;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.common.services.rest.RestRequest;
import me.oriient.ipssdk.realtime.ofs.C1758z2;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lme/oriient/ipssdk/realtime/services/rest/MapsRestServiceImpl;", "Lme/oriient/ipssdk/realtime/services/rest/MapsRestService;", "<init>", "()V", "Lme/oriient/ipssdk/base/auth/User;", "user", "", "userSessionId", "mapId", "floorId", "", "floorOrder", "buildingId", "Lme/oriient/ipssdk/realtime/services/rest/IRegionsTriggersListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lme/oriient/ipssdk/common/services/rest/RestRequest;", "getAllMapEntitiesJava", "(Lme/oriient/ipssdk/base/auth/User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lme/oriient/ipssdk/realtime/services/rest/IRegionsTriggersListener;)Lme/oriient/ipssdk/common/services/rest/RestRequest;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MapsRestServiceImpl implements MapsRestService {

    /* renamed from: a, reason: collision with root package name */
    private final Lazy f26188a;
    private final Lazy b;
    private final Lazy c;

    public MapsRestServiceImpl() {
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f26188a = di.inject(reflectionFactory.b(Logger.class));
        this.b = DependencyInjectionKt.getDi().inject(reflectionFactory.b(RestService.class));
        this.c = DependencyInjectionKt.getDi().inject(reflectionFactory.b(OriientApiProvider.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: access$getAllMapEntitiesSuspend-lD5TqXI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m462access$getAllMapEntitiesSuspendlD5TqXI(me.oriient.ipssdk.realtime.services.rest.MapsRestServiceImpl r10, java.lang.String r11, java.lang.String r12, me.oriient.ipssdk.base.auth.User r13, java.lang.String r14, kotlin.coroutines.Continuation r15) throws me.oriient.ipssdk.base.rest.RestException {
        /*
            r10.getClass()
            boolean r0 = r15 instanceof me.oriient.ipssdk.realtime.ofs.A2
            if (r0 == 0) goto L16
            r0 = r15
            me.oriient.ipssdk.realtime.ofs.A2 r0 = (me.oriient.ipssdk.realtime.ofs.A2) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.d = r1
            goto L1b
        L16:
            me.oriient.ipssdk.realtime.ofs.A2 r0 = new me.oriient.ipssdk.realtime.ofs.A2
            r0.<init>(r10, r15)
        L1b:
            java.lang.Object r15 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            me.oriient.ipssdk.realtime.services.rest.MapsRestServiceImpl r10 = r0.f25909a
            kotlin.ResultKt.b(r15)
            goto L55
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            kotlin.ResultKt.b(r15)
            kotlin.Lazy r15 = r10.b
            java.lang.Object r15 = r15.getD()
            me.oriient.internal.infra.rest.RestService r15 = (me.oriient.internal.infra.rest.RestService) r15
            me.oriient.ipssdk.realtime.ofs.B2 r4 = new me.oriient.ipssdk.realtime.ofs.B2
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f25909a = r5
            r0.d = r3
            java.lang.Object r15 = r15.getString(r4, r0)
            if (r15 != r1) goto L54
            return r1
        L54:
            r10 = r5
        L55:
            me.oriient.internal.infra.utils.core.Outcome r15 = (me.oriient.internal.infra.utils.core.Outcome) r15
            boolean r11 = r15 instanceof me.oriient.internal.infra.utils.core.Outcome.Failure
            if (r11 != 0) goto L9b
            kotlin.Lazy r10 = r10.f26188a
            java.lang.Object r10 = r10.getD()
            me.oriient.internal.infra.utils.core.Logger r10 = (me.oriient.internal.infra.utils.core.Logger) r10
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "getAllMapEntitiesSuspend: response: "
            r11.<init>(r12)
            r11.append(r15)
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "MapsRestService"
            r10.d(r12, r11)
            java.lang.Object r10 = r15.successOrNull()
            me.oriient.internal.infra.rest.HttpResponse$StringResponse r10 = (me.oriient.internal.infra.rest.HttpResponse.StringResponse) r10
            if (r10 == 0) goto L93
            java.lang.String r10 = r10.getString()
            if (r10 == 0) goto L93
            java.lang.Class<me.oriient.ipssdk.realtime.services.rest.responses.MapEntitiesResponse> r11 = me.oriient.ipssdk.realtime.services.rest.responses.MapEntitiesResponse.class
            kotlin.reflect.KType r11 = kotlin.jvm.internal.Reflection.b(r11)
            java.lang.Object r10 = me.oriient.internal.infra.serializerJson.JsonSerializationKt.parseAsJson(r10, r11)
            me.oriient.ipssdk.realtime.services.rest.responses.MapEntitiesResponse r10 = (me.oriient.ipssdk.realtime.services.rest.responses.MapEntitiesResponse) r10
            if (r10 == 0) goto L93
            return r10
        L93:
            me.oriient.ipssdk.base.rest.RestException r10 = new me.oriient.ipssdk.base.rest.RestException
            java.lang.String r11 = "Empty body"
            r10.<init>(r11)
            throw r10
        L9b:
            me.oriient.internal.infra.utils.core.Outcome$Failure r15 = (me.oriient.internal.infra.utils.core.Outcome.Failure) r15
            java.lang.Exception r10 = r15.getValue()
            me.oriient.internal.infra.utils.core.OriientError r10 = (me.oriient.internal.infra.utils.core.OriientError) r10
            me.oriient.ipssdk.base.rest.RestException r11 = new me.oriient.ipssdk.base.rest.RestException
            java.lang.String r10 = r10.getMessage()
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.services.rest.MapsRestServiceImpl.m462access$getAllMapEntitiesSuspendlD5TqXI(me.oriient.ipssdk.realtime.services.rest.MapsRestServiceImpl, java.lang.String, java.lang.String, me.oriient.ipssdk.base.auth.User, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Logger access$getLogger(MapsRestServiceImpl mapsRestServiceImpl) {
        return (Logger) mapsRestServiceImpl.f26188a.getD();
    }

    public static final OriientApiProvider access$getOriientApiProvider(MapsRestServiceImpl mapsRestServiceImpl) {
        return (OriientApiProvider) mapsRestServiceImpl.c.getD();
    }

    @Override // me.oriient.ipssdk.realtime.services.rest.MapsRestService
    @NotNull
    public RestRequest getAllMapEntitiesJava(@NotNull User user, @NotNull String userSessionId, @NotNull String mapId, @NotNull String floorId, int floorOrder, @NotNull String buildingId, @NotNull IRegionsTriggersListener listener) {
        Intrinsics.h(user, "user");
        Intrinsics.h(userSessionId, "userSessionId");
        Intrinsics.h(mapId, "mapId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(listener, "listener");
        ((Logger) this.f26188a.getD()).d("MapsRestService", "getAllMapEntitiesJava() called with: user = [" + user + "], mapId = [" + mapId + "], buildingId = [" + buildingId + "], listener = [" + listener + ']');
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return new RestRequest(BuildersKt.c(GlobalScope.d, DefaultIoScheduler.f, null, new C1758z2(this, buildingId, floorId, user, userSessionId, mapId, floorOrder, listener, null), 2));
    }
}
