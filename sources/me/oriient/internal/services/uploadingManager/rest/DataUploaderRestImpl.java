package me.oriient.internal.services.uploadingManager.rest;

import androidx.annotation.Keep;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.rest.RestService;
import me.oriient.internal.infra.utils.core.BuildData;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.OsData;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.auth.UnauthenticatedRestService;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItem;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 <2\u00020\u0001:\u0001=B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ4\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J6\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001f\u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u001f\u001a\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\u001f\u001a\u0004\b9\u0010:¨\u0006>"}, d2 = {"Lme/oriient/internal/services/uploadingManager/rest/DataUploaderRestImpl;", "Lme/oriient/internal/services/uploadingManager/rest/DataUploaderRest;", "", "sdkType", "<init>", "(Ljava/lang/String;)V", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;", "item", "applyQueryParams", "(Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;)Ljava/lang/String;", "callerMethod", "", "useJwtAuthentication", "Lme/oriient/internal/infra/utils/core/Outcome;", "Lme/oriient/internal/services/uploadingManager/rest/DataUploaderRest$FileUploadDestinationData;", "Lme/oriient/internal/infra/utils/core/OriientError;", "sendStartChunk", "(Ljava/lang/String;Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "url", "Ljava/io/File;", "file", "Lme/oriient/internal/infra/rest/HttpEncoding;", "contentEncoding", "", "uploadFile", "(Ljava/lang/String;Ljava/io/File;Lme/oriient/internal/infra/rest/HttpEncoding;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEndChunk", "(Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/lang/String;", "Lme/oriient/internal/infra/utils/core/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "logger", "Lme/oriient/internal/infra/utils/core/BuildData;", "buildData$delegate", "getBuildData", "()Lme/oriient/internal/infra/utils/core/BuildData;", "buildData", "Lme/oriient/internal/infra/utils/core/OsData;", "osData$delegate", "getOsData", "()Lme/oriient/internal/infra/utils/core/OsData;", "osData", "Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider$delegate", "getTimeProvider", "()Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider", "Lme/oriient/internal/services/auth/UnauthenticatedRestService;", "unauthenticatedRestService$delegate", "getUnauthenticatedRestService", "()Lme/oriient/internal/services/auth/UnauthenticatedRestService;", "unauthenticatedRestService", "Lme/oriient/internal/infra/rest/RestService;", "authenticatedRestService$delegate", "getAuthenticatedRestService", "()Lme/oriient/internal/infra/rest/RestService;", "authenticatedRestService", "Companion", "me/oriient/internal/services/uploadingManager/rest/a", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DataUploaderRestImpl implements DataUploaderRest {

    @NotNull
    private static final a Companion = new a();

    @NotNull
    private static final String TAG = "DataUploaderRest";

    /* renamed from: authenticatedRestService$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy authenticatedRestService;

    /* renamed from: buildData$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy buildData;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy logger;

    /* renamed from: osData$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy osData;

    @NotNull
    private final String sdkType;

    /* renamed from: timeProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy timeProvider;

    /* renamed from: unauthenticatedRestService$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy unauthenticatedRestService;

    public DataUploaderRestImpl(@NotNull String sdkType) {
        Intrinsics.h(sdkType, "sdkType");
        this.sdkType = sdkType;
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.logger = di.inject(reflectionFactory.b(Logger.class));
        this.buildData = InternalDiKt.getDi().inject(reflectionFactory.b(BuildData.class));
        this.osData = InternalDiKt.getDi().inject(reflectionFactory.b(OsData.class));
        this.timeProvider = InternalDiKt.getDi().inject(reflectionFactory.b(TimeProvider.class));
        this.unauthenticatedRestService = InternalDiKt.getDi().inject(reflectionFactory.b(UnauthenticatedRestService.class));
        this.authenticatedRestService = InternalDiKt.getDi().inject(reflectionFactory.b(RestService.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String applyQueryParams(DataUploaderItem item) {
        String str = "spaceId=" + item.getMetadata().getSpaceId() + "&bundleId=" + getBuildData().getBundleId() + "&type=" + item.getDataType().getStrValue();
        Intrinsics.g(str, "toString(...)");
        return str;
    }

    private final RestService getAuthenticatedRestService() {
        return (RestService) this.authenticatedRestService.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BuildData getBuildData() {
        return (BuildData) this.buildData.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger getLogger() {
        return (Logger) this.logger.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OsData getOsData() {
        return (OsData) this.osData.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TimeProvider getTimeProvider() {
        return (TimeProvider) this.timeProvider.getD();
    }

    private final UnauthenticatedRestService getUnauthenticatedRestService() {
        return (UnauthenticatedRestService) this.unauthenticatedRestService.getD();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // me.oriient.internal.services.uploadingManager.rest.DataUploaderRest
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object sendEndChunk(@org.jetbrains.annotations.NotNull me.oriient.internal.services.uploadingManager.models.DataUploaderItem r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<kotlin.Unit, me.oriient.internal.infra.utils.core.OriientError>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof me.oriient.internal.services.uploadingManager.rest.b
            if (r0 == 0) goto L13
            r0 = r6
            me.oriient.internal.services.uploadingManager.rest.b r0 = (me.oriient.internal.services.uploadingManager.rest.b) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            me.oriient.internal.services.uploadingManager.rest.b r0 = new me.oriient.internal.services.uploadingManager.rest.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f25646a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r6)
            goto L44
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.b(r6)
            me.oriient.internal.services.auth.UnauthenticatedRestService r6 = r4.getUnauthenticatedRestService()
            me.oriient.internal.services.uploadingManager.rest.c r2 = new me.oriient.internal.services.uploadingManager.rest.c
            r2.<init>(r5, r4)
            r0.c = r3
            java.lang.Object r6 = r6.postReturningUnit(r2, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            me.oriient.internal.infra.utils.core.Outcome r6 = (me.oriient.internal.infra.utils.core.Outcome) r6
            me.oriient.internal.services.uploadingManager.rest.d r5 = me.oriient.internal.services.uploadingManager.rest.d.f25648a
            me.oriient.internal.infra.utils.core.Outcome r5 = r6.map(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.uploadingManager.rest.DataUploaderRestImpl.sendEndChunk(me.oriient.internal.services.uploadingManager.models.DataUploaderItem, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // me.oriient.internal.services.uploadingManager.rest.DataUploaderRest
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object sendStartChunk(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull me.oriient.internal.services.uploadingManager.models.DataUploaderItem r6, boolean r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<me.oriient.internal.services.uploadingManager.rest.DataUploaderRest.FileUploadDestinationData, me.oriient.internal.infra.utils.core.OriientError>> r8) {
        /*
            r4 = this;
            boolean r5 = r8 instanceof me.oriient.internal.services.uploadingManager.rest.e
            if (r5 == 0) goto L13
            r5 = r8
            me.oriient.internal.services.uploadingManager.rest.e r5 = (me.oriient.internal.services.uploadingManager.rest.e) r5
            int r0 = r5.d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.d = r0
            goto L18
        L13:
            me.oriient.internal.services.uploadingManager.rest.e r5 = new me.oriient.internal.services.uploadingManager.rest.e
            r5.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r5.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r5.d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L38
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            kotlin.ResultKt.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            me.oriient.internal.services.uploadingManager.rest.DataUploaderRestImpl r6 = r5.f25649a
            kotlin.ResultKt.b(r8)
            goto L59
        L38:
            kotlin.ResultKt.b(r8)
            if (r7 != r3) goto L42
            me.oriient.internal.infra.rest.RestService r7 = r4.getAuthenticatedRestService()
            goto L48
        L42:
            if (r7 != 0) goto L6d
            me.oriient.internal.services.auth.UnauthenticatedRestService r7 = r4.getUnauthenticatedRestService()
        L48:
            me.oriient.internal.services.uploadingManager.rest.f r8 = new me.oriient.internal.services.uploadingManager.rest.f
            r8.<init>(r6, r4)
            r5.f25649a = r4
            r5.d = r3
            java.lang.Object r8 = r7.postReturningString(r8, r5)
            if (r8 != r0) goto L58
            goto L6b
        L58:
            r6 = r4
        L59:
            me.oriient.internal.infra.utils.core.Outcome r8 = (me.oriient.internal.infra.utils.core.Outcome) r8
            me.oriient.internal.services.uploadingManager.rest.g r7 = new me.oriient.internal.services.uploadingManager.rest.g
            r1 = 0
            r7.<init>(r6, r1)
            r5.f25649a = r1
            r5.d = r2
            java.lang.Object r5 = r8.then(r7, r5)
            if (r5 != r0) goto L6c
        L6b:
            return r0
        L6c:
            return r5
        L6d:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.uploadingManager.rest.DataUploaderRestImpl.sendStartChunk(java.lang.String, me.oriient.internal.services.uploadingManager.models.DataUploaderItem, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // me.oriient.internal.services.uploadingManager.rest.DataUploaderRest
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object uploadFile(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull java.io.File r7, @org.jetbrains.annotations.Nullable me.oriient.internal.infra.rest.HttpEncoding r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<kotlin.Unit, me.oriient.internal.infra.utils.core.OriientError>> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof me.oriient.internal.services.uploadingManager.rest.h
            if (r0 == 0) goto L13
            r0 = r9
            me.oriient.internal.services.uploadingManager.rest.h r0 = (me.oriient.internal.services.uploadingManager.rest.h) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            me.oriient.internal.services.uploadingManager.rest.h r0 = new me.oriient.internal.services.uploadingManager.rest.h
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f25652a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r9)
            goto L63
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            kotlin.ResultKt.b(r9)
            me.oriient.internal.infra.utils.core.Logger r9 = r5.getLogger()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "uploadFile() called with: url = "
            r2.<init>(r4)
            r2.append(r6)
            java.lang.String r4 = ", file = "
            r2.append(r4)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "DataUploaderRest"
            r9.d(r4, r2)
            me.oriient.internal.services.auth.UnauthenticatedRestService r9 = r5.getUnauthenticatedRestService()
            me.oriient.internal.services.uploadingManager.rest.i r2 = new me.oriient.internal.services.uploadingManager.rest.i
            r2.<init>(r6, r8, r7)
            r0.c = r3
            java.lang.Object r9 = r9.putReturningUnit(r2, r0)
            if (r9 != r1) goto L63
            return r1
        L63:
            me.oriient.internal.infra.utils.core.Outcome r9 = (me.oriient.internal.infra.utils.core.Outcome) r9
            me.oriient.internal.services.uploadingManager.rest.j r6 = me.oriient.internal.services.uploadingManager.rest.j.f25654a
            me.oriient.internal.infra.utils.core.Outcome r6 = r9.map(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.uploadingManager.rest.DataUploaderRestImpl.uploadFile(java.lang.String, java.io.File, me.oriient.internal.infra.rest.HttpEncoding, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
