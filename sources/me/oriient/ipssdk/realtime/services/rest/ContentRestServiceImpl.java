package me.oriient.ipssdk.realtime.services.rest;

import androidx.camera.core.impl.b;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import me.oriient.ipssdk.api.listeners.IPSContentSearchListener;
import me.oriient.ipssdk.api.listeners.IPSGetByIdListener;
import me.oriient.ipssdk.api.models.IPSLocationTag;
import me.oriient.ipssdk.api.models.IPSRegion;
import me.oriient.ipssdk.base.auth.User;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.common.services.rest.RestRequest;
import me.oriient.ipssdk.common.utils.models.BuildingId;
import me.oriient.ipssdk.ips.IPSContentSearchPage;
import me.oriient.ipssdk.realtime.ofs.J;
import me.oriient.ipssdk.realtime.ofs.M;
import me.oriient.ipssdk.realtime.ofs.P;
import me.oriient.ipssdk.realtime.ofs.T;
import me.oriient.ipssdk.realtime.ofs.W;
import me.oriient.ipssdk.realtime.services.rest.responses.Content;
import me.oriient.ipssdk.realtime.services.rest.responses.ContentContainer;
import me.oriient.ipssdk.realtime.services.rest.responses.Pagination;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017JC\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00182\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJC\u0010 \u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00182\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001aH\u0016¢\u0006\u0004\b \u0010\u001d¨\u0006\""}, d2 = {"Lme/oriient/ipssdk/realtime/services/rest/ContentRestServiceImpl;", "Lme/oriient/ipssdk/realtime/services/rest/ContentRestService;", "<init>", "()V", "", "buildingId", "", "pageSize", "filter", "Lme/oriient/ipssdk/base/auth/User;", "user", "userSessionId", "Lme/oriient/ipssdk/api/listeners/IPSContentSearchListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lme/oriient/ipssdk/common/services/rest/RestRequest;", "search", "(Ljava/lang/String;ILjava/lang/String;Lme/oriient/ipssdk/base/auth/User;Ljava/lang/String;Lme/oriient/ipssdk/api/listeners/IPSContentSearchListener;)Lme/oriient/ipssdk/common/services/rest/RestRequest;", "Lme/oriient/ipssdk/ips/IPSContentSearchPage;", "page", "fetch", "(Lme/oriient/ipssdk/ips/IPSContentSearchPage;Lme/oriient/ipssdk/api/listeners/IPSContentSearchListener;)Lme/oriient/ipssdk/common/services/rest/RestRequest;", "Lme/oriient/ipssdk/realtime/services/rest/IRegionsListener;", "getAllRegions", "(Ljava/lang/String;Lme/oriient/ipssdk/base/auth/User;Ljava/lang/String;Lme/oriient/ipssdk/realtime/services/rest/IRegionsListener;)Lme/oriient/ipssdk/common/services/rest/RestRequest;", "", "locationTagIds", "Lme/oriient/ipssdk/api/listeners/IPSGetByIdListener;", "Lme/oriient/ipssdk/api/models/IPSLocationTag;", "getLocationTagsById", "(Ljava/lang/String;Ljava/util/List;Lme/oriient/ipssdk/base/auth/User;Ljava/lang/String;Lme/oriient/ipssdk/api/listeners/IPSGetByIdListener;)Lme/oriient/ipssdk/common/services/rest/RestRequest;", "regionsIds", "Lme/oriient/ipssdk/api/models/IPSRegion;", "getRegionsById", "Companion", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class ContentRestServiceImpl implements ContentRestService {

    @NotNull
    public static final String CONTENT_TYPE_LOCATION_TAGS = "location-tags";

    @NotNull
    public static final String CONTENT_TYPE_REGIONS = "regions";

    /* renamed from: a, reason: collision with root package name */
    private final Lazy f26187a;
    private final Lazy b;
    private final Lazy c;

    public ContentRestServiceImpl() {
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f26187a = di.inject(reflectionFactory.b(Logger.class));
        this.b = DependencyInjectionKt.getDi().inject(reflectionFactory.b(RestService.class));
        this.c = DependencyInjectionKt.getDi().inject(reflectionFactory.b(OriientApiProvider.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object access$fetchSync(me.oriient.ipssdk.realtime.services.rest.ContentRestServiceImpl r4, java.lang.String r5, kotlin.coroutines.Continuation r6) throws me.oriient.ipssdk.base.rest.RestException {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof me.oriient.ipssdk.realtime.ofs.K
            if (r0 == 0) goto L16
            r0 = r6
            me.oriient.ipssdk.realtime.ofs.K r0 = (me.oriient.ipssdk.realtime.ofs.K) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.d = r1
            goto L1b
        L16:
            me.oriient.ipssdk.realtime.ofs.K r0 = new me.oriient.ipssdk.realtime.ofs.K
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            me.oriient.ipssdk.realtime.services.rest.ContentRestServiceImpl r4 = r0.f25962a
            kotlin.ResultKt.b(r6)
            goto L4f
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            kotlin.ResultKt.b(r6)
            kotlin.Lazy r6 = r4.b
            java.lang.Object r6 = r6.getD()
            me.oriient.internal.infra.rest.RestService r6 = (me.oriient.internal.infra.rest.RestService) r6
            me.oriient.ipssdk.realtime.ofs.L r2 = new me.oriient.ipssdk.realtime.ofs.L
            r2.<init>(r5)
            r0.f25962a = r4
            r0.d = r3
            java.lang.Object r6 = r6.getString(r2, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            me.oriient.internal.infra.utils.core.Outcome r6 = (me.oriient.internal.infra.utils.core.Outcome) r6
            boolean r5 = r6 instanceof me.oriient.internal.infra.utils.core.Outcome.Failure
            if (r5 != 0) goto L95
            kotlin.Lazy r4 = r4.f26187a
            java.lang.Object r4 = r4.getD()
            me.oriient.internal.infra.utils.core.Logger r4 = (me.oriient.internal.infra.utils.core.Logger) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "fetchSync: response: "
            r5.<init>(r0)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "ContentRestService"
            r4.d(r0, r5)
            java.lang.Object r4 = r6.successOrNull()
            me.oriient.internal.infra.rest.HttpResponse$StringResponse r4 = (me.oriient.internal.infra.rest.HttpResponse.StringResponse) r4
            if (r4 == 0) goto L8d
            java.lang.String r4 = r4.getString()
            if (r4 == 0) goto L8d
            java.lang.Class<me.oriient.ipssdk.realtime.services.rest.responses.ContentContainer> r5 = me.oriient.ipssdk.realtime.services.rest.responses.ContentContainer.class
            kotlin.reflect.KType r5 = kotlin.jvm.internal.Reflection.b(r5)
            java.lang.Object r4 = me.oriient.internal.infra.serializerJson.JsonSerializationKt.parseAsJson(r4, r5)
            me.oriient.ipssdk.realtime.services.rest.responses.ContentContainer r4 = (me.oriient.ipssdk.realtime.services.rest.responses.ContentContainer) r4
            if (r4 == 0) goto L8d
            return r4
        L8d:
            me.oriient.ipssdk.base.rest.RestException r4 = new me.oriient.ipssdk.base.rest.RestException
            java.lang.String r5 = "Empty body"
            r4.<init>(r5)
            throw r4
        L95:
            me.oriient.internal.infra.utils.core.Outcome$Failure r6 = (me.oriient.internal.infra.utils.core.Outcome.Failure) r6
            java.lang.Exception r4 = r6.getValue()
            me.oriient.internal.infra.utils.core.OriientError r4 = (me.oriient.internal.infra.utils.core.OriientError) r4
            me.oriient.ipssdk.base.rest.RestException r5 = new me.oriient.ipssdk.base.rest.RestException
            java.lang.String r4 = r4.getMessage()
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.services.rest.ContentRestServiceImpl.access$fetchSync(me.oriient.ipssdk.realtime.services.rest.ContentRestServiceImpl, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: access$getAllRegionsSync-Y0ert8M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m459access$getAllRegionsSyncY0ert8M(me.oriient.ipssdk.realtime.services.rest.ContentRestServiceImpl r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, kotlin.coroutines.Continuation r8) throws me.oriient.ipssdk.base.rest.RestException {
        /*
            r4.getClass()
            boolean r0 = r8 instanceof me.oriient.ipssdk.realtime.ofs.N
            if (r0 == 0) goto L16
            r0 = r8
            me.oriient.ipssdk.realtime.ofs.N r0 = (me.oriient.ipssdk.realtime.ofs.N) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.d = r1
            goto L1b
        L16:
            me.oriient.ipssdk.realtime.ofs.N r0 = new me.oriient.ipssdk.realtime.ofs.N
            r0.<init>(r4, r8)
        L1b:
            java.lang.Object r8 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            me.oriient.ipssdk.realtime.services.rest.ContentRestServiceImpl r4 = r0.f25978a
            kotlin.ResultKt.b(r8)
            goto L4f
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            kotlin.ResultKt.b(r8)
            kotlin.Lazy r8 = r4.b
            java.lang.Object r8 = r8.getD()
            me.oriient.internal.infra.rest.RestService r8 = (me.oriient.internal.infra.rest.RestService) r8
            me.oriient.ipssdk.realtime.ofs.O r2 = new me.oriient.ipssdk.realtime.ofs.O
            r2.<init>(r4, r7, r5, r6)
            r0.f25978a = r4
            r0.d = r3
            java.lang.Object r8 = r8.getString(r2, r0)
            if (r8 != r1) goto L4f
            return r1
        L4f:
            me.oriient.internal.infra.utils.core.Outcome r8 = (me.oriient.internal.infra.utils.core.Outcome) r8
            boolean r5 = r8 instanceof me.oriient.internal.infra.utils.core.Outcome.Failure
            if (r5 == 0) goto L6e
            me.oriient.internal.infra.utils.core.Outcome$Failure r8 = (me.oriient.internal.infra.utils.core.Outcome.Failure) r8
            java.lang.Exception r4 = r8.getValue()
            me.oriient.internal.infra.utils.core.OriientError r4 = (me.oriient.internal.infra.utils.core.OriientError) r4
            boolean r5 = r4 instanceof me.oriient.internal.infra.utils.core.OperationCanceled
            if (r5 == 0) goto L64
            kotlin.collections.EmptyList r4 = kotlin.collections.EmptyList.d
            return r4
        L64:
            me.oriient.ipssdk.base.rest.RestException r5 = new me.oriient.ipssdk.base.rest.RestException
            java.lang.String r4 = r4.getMessage()
            r5.<init>(r4)
            throw r5
        L6e:
            kotlin.Lazy r4 = r4.f26187a
            java.lang.Object r4 = r4.getD()
            me.oriient.internal.infra.utils.core.Logger r4 = (me.oriient.internal.infra.utils.core.Logger) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "getAllRegionsSync: response: "
            r5.<init>(r6)
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "ContentRestService"
            r4.d(r6, r5)
            java.lang.Object r4 = r8.successOrNull()
            me.oriient.internal.infra.rest.HttpResponse$StringResponse r4 = (me.oriient.internal.infra.rest.HttpResponse.StringResponse) r4
            if (r4 == 0) goto Lb0
            java.lang.String r4 = r4.getString()
            if (r4 == 0) goto Lb0
            kotlin.reflect.KTypeProjection r5 = kotlin.reflect.KTypeProjection.c
            java.lang.Class<me.oriient.ipssdk.realtime.services.rest.responses.Content> r5 = me.oriient.ipssdk.realtime.services.rest.responses.Content.class
            kotlin.reflect.KType r5 = kotlin.jvm.internal.Reflection.b(r5)
            kotlin.reflect.KTypeProjection r5 = kotlin.reflect.KTypeProjection.Companion.a(r5)
            kotlin.reflect.KType r5 = kotlin.jvm.internal.Reflection.c(r5)
            java.lang.Object r4 = me.oriient.internal.infra.serializerJson.JsonSerializationKt.parseAsJson(r4, r5)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto Lb0
            return r4
        Lb0:
            me.oriient.ipssdk.base.rest.RestException r4 = new me.oriient.ipssdk.base.rest.RestException
            java.lang.String r5 = "Empty body"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.services.rest.ContentRestServiceImpl.m459access$getAllRegionsSyncY0ert8M(me.oriient.ipssdk.realtime.services.rest.ContentRestServiceImpl, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object access$getLocationTagsByIdsSync(me.oriient.ipssdk.realtime.services.rest.ContentRestServiceImpl r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, kotlin.coroutines.Continuation r10) throws me.oriient.ipssdk.base.rest.RestException {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.services.rest.ContentRestServiceImpl.access$getLocationTagsByIdsSync(me.oriient.ipssdk.realtime.services.rest.ContentRestServiceImpl, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Logger access$getLogger(ContentRestServiceImpl contentRestServiceImpl) {
        return (Logger) contentRestServiceImpl.f26187a.getD();
    }

    public static final OriientApiProvider access$getOriientApiProvider(ContentRestServiceImpl contentRestServiceImpl) {
        return (OriientApiProvider) contentRestServiceImpl.c.getD();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object access$getRegionsByIdsSync(me.oriient.ipssdk.realtime.services.rest.ContentRestServiceImpl r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, kotlin.coroutines.Continuation r10) throws me.oriient.ipssdk.base.rest.RestException {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.services.rest.ContentRestServiceImpl.access$getRegionsByIdsSync(me.oriient.ipssdk.realtime.services.rest.ContentRestServiceImpl, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void access$parseContent(ContentRestServiceImpl contentRestServiceImpl, ContentContainer contentContainer, IPSContentSearchListener iPSContentSearchListener, String str, String str2, int i) {
        contentRestServiceImpl.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<Content> it = contentContainer.getData().iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(it.next().m465toIpsContentItemTVSKQeo(BuildingId.m441constructorimpl(str)));
            } catch (Throwable th) {
                ((Logger) contentRestServiceImpl.f26187a.getD()).e("ContentRestService", "parseContent: failed to parse content: " + th.getMessage());
            }
        }
        Pagination pagination = contentContainer.getPagination();
        iPSContentSearchListener.onSearchResult(arrayList, pagination != null ? pagination.m471toContentSearchPagedfyszzk(BuildingId.m441constructorimpl(str), str2, i) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: access$searchSync-WlLixbM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m460access$searchSyncWlLixbM(me.oriient.ipssdk.realtime.services.rest.ContentRestServiceImpl r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.Integer r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, kotlin.coroutines.Continuation r13) throws me.oriient.ipssdk.base.rest.RestException {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.services.rest.ContentRestServiceImpl.m460access$searchSyncWlLixbM(me.oriient.ipssdk.realtime.services.rest.ContentRestServiceImpl, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // me.oriient.ipssdk.realtime.services.rest.ContentRestService
    @NotNull
    public RestRequest fetch(@NotNull IPSContentSearchPage page, @NotNull IPSContentSearchListener listener) {
        Intrinsics.h(page, "page");
        Intrinsics.h(listener, "listener");
        ((Logger) this.f26187a.getD()).d("ContentRestService", "fetch() called with: page = [" + page + "], listener = [" + listener + ']');
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return new RestRequest(BuildersKt.c(GlobalScope.d, DefaultIoScheduler.f, null, new J(this, page, listener, null), 2));
    }

    @Override // me.oriient.ipssdk.realtime.services.rest.ContentRestService
    @NotNull
    public RestRequest getAllRegions(@NotNull String buildingId, @NotNull User user, @NotNull String userSessionId, @NotNull IRegionsListener listener) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(user, "user");
        Intrinsics.h(userSessionId, "userSessionId");
        Intrinsics.h(listener, "listener");
        ((Logger) this.f26187a.getD()).d("ContentRestService", "getAllRegions() called with: buildingId = " + buildingId + ", user = " + user + ", userSessionId = " + userSessionId + ", listener = " + listener);
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return new RestRequest(BuildersKt.c(GlobalScope.d, DefaultIoScheduler.f, null, new M(this, user, userSessionId, buildingId, listener, null), 2));
    }

    @Override // me.oriient.ipssdk.realtime.services.rest.ContentRestService
    @NotNull
    public RestRequest getLocationTagsById(@NotNull String buildingId, @NotNull List<String> locationTagIds, @NotNull User user, @NotNull String userSessionId, @NotNull IPSGetByIdListener<IPSLocationTag> listener) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(locationTagIds, "locationTagIds");
        Intrinsics.h(user, "user");
        Intrinsics.h(userSessionId, "userSessionId");
        Intrinsics.h(listener, "listener");
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return new RestRequest(BuildersKt.c(GlobalScope.d, DefaultIoScheduler.f, null, new P(locationTagIds, this, user, userSessionId, buildingId, listener, null), 2));
    }

    @Override // me.oriient.ipssdk.realtime.services.rest.ContentRestService
    @NotNull
    public RestRequest getRegionsById(@NotNull String buildingId, @NotNull List<String> regionsIds, @NotNull User user, @NotNull String userSessionId, @NotNull IPSGetByIdListener<IPSRegion> listener) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(regionsIds, "regionsIds");
        Intrinsics.h(user, "user");
        Intrinsics.h(userSessionId, "userSessionId");
        Intrinsics.h(listener, "listener");
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return new RestRequest(BuildersKt.c(GlobalScope.d, DefaultIoScheduler.f, null, new T(regionsIds, this, user, userSessionId, buildingId, listener, null), 2));
    }

    @Override // me.oriient.ipssdk.realtime.services.rest.ContentRestService
    @NotNull
    public RestRequest search(@NotNull String buildingId, int pageSize, @NotNull String filter, @NotNull User user, @NotNull String userSessionId, @NotNull IPSContentSearchListener listener) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(filter, "filter");
        Intrinsics.h(user, "user");
        Intrinsics.h(userSessionId, "userSessionId");
        Intrinsics.h(listener, "listener");
        Logger logger = (Logger) this.f26187a.getD();
        StringBuilder sbU = b.u("search() called with: buildingId = ", pageSize, buildingId, ", pageSize = ", ", filter = ");
        sbU.append(filter);
        sbU.append(", user = ");
        sbU.append(user);
        sbU.append(", userSessionId = ");
        sbU.append(userSessionId);
        sbU.append(", listener = ");
        sbU.append(listener);
        logger.d("ContentRestService", sbU.toString());
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return new RestRequest(BuildersKt.c(GlobalScope.d, DefaultIoScheduler.f, null, new W(this, user, userSessionId, buildingId, pageSize, filter, listener, null), 2));
    }
}
