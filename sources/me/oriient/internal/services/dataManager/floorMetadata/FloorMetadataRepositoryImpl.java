package me.oriient.internal.services.dataManager.floorMetadata;

import androidx.annotation.Keep;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.services.dataManager.DataRepository;
import me.oriient.internal.services.elog.ELog;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001,B]\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J,\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0019\u0010\u0018J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dR&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR&\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001fR\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lme/oriient/internal/services/dataManager/floorMetadata/FloorMetadataRepositoryImpl;", "Lme/oriient/internal/services/dataManager/floorMetadata/FloorMetadataRepository;", "Lme/oriient/internal/services/dataManager/DataRepository;", "Lme/oriient/internal/services/dataManager/floorMetadata/FloorMetadata;", "Lme/oriient/internal/services/dataManager/floorMetadata/FloorFetchData;", "Lme/oriient/internal/infra/utils/core/OriientError;", "floorMetadataRepository", "Lme/oriient/internal/services/dataManager/floorMetadata/FloorMetadataWithImage;", "floorMetadataWithImageRepository", "Lme/oriient/internal/services/dataManager/floorMetadata/FloorMetadataWithSvgImage;", "floorMetadataWithSvgImageRepository", "Lme/oriient/internal/services/dataManager/floorMetadata/j;", "floorMetadataPriorityLoader", "<init>", "(Lme/oriient/internal/services/dataManager/DataRepository;Lme/oriient/internal/services/dataManager/DataRepository;Lme/oriient/internal/services/dataManager/DataRepository;Lme/oriient/internal/services/dataManager/floorMetadata/j;)V", "", "buildingId", "floorId", "", "allowOutdated", "Lme/oriient/internal/infra/utils/core/Outcome;", "fetchFloorMetadata", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchFloorMetadataWithBitmap", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchFloorMetadataWithSvg", "", "cleanData", "cleanCache", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme/oriient/internal/services/dataManager/DataRepository;", "Lme/oriient/internal/services/dataManager/floorMetadata/j;", "Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "coroutineContextProvider$delegate", "Lkotlin/Lazy;", "getCoroutineContextProvider", "()Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "coroutineContextProvider", "Lme/oriient/internal/services/elog/ELog;", "eLog$delegate", "getELog", "()Lme/oriient/internal/services/elog/ELog;", "eLog", "Companion", "me/oriient/internal/services/dataManager/floorMetadata/m", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class FloorMetadataRepositoryImpl implements FloorMetadataRepository {

    @NotNull
    public static final C1283m Companion = new C1283m();

    @NotNull
    private static final String TAG = "FloorMetadataRepository";

    /* renamed from: coroutineContextProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy coroutineContextProvider;

    /* renamed from: eLog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy eLog;

    @NotNull
    private final InterfaceC1280j floorMetadataPriorityLoader;

    @NotNull
    private final DataRepository<FloorMetadata, FloorFetchData, OriientError> floorMetadataRepository;

    @NotNull
    private final DataRepository<FloorMetadataWithImage, FloorFetchData, OriientError> floorMetadataWithImageRepository;

    @NotNull
    private final DataRepository<FloorMetadataWithSvgImage, FloorFetchData, OriientError> floorMetadataWithSvgImageRepository;

    public FloorMetadataRepositoryImpl(@NotNull DataRepository<FloorMetadata, FloorFetchData, OriientError> floorMetadataRepository, @NotNull DataRepository<FloorMetadataWithImage, FloorFetchData, OriientError> floorMetadataWithImageRepository, @NotNull DataRepository<FloorMetadataWithSvgImage, FloorFetchData, OriientError> floorMetadataWithSvgImageRepository, @NotNull InterfaceC1280j floorMetadataPriorityLoader) {
        Intrinsics.h(floorMetadataRepository, "floorMetadataRepository");
        Intrinsics.h(floorMetadataWithImageRepository, "floorMetadataWithImageRepository");
        Intrinsics.h(floorMetadataWithSvgImageRepository, "floorMetadataWithSvgImageRepository");
        Intrinsics.h(floorMetadataPriorityLoader, "floorMetadataPriorityLoader");
        this.floorMetadataRepository = floorMetadataRepository;
        this.floorMetadataWithImageRepository = floorMetadataWithImageRepository;
        this.floorMetadataWithSvgImageRepository = floorMetadataWithSvgImageRepository;
        this.floorMetadataPriorityLoader = floorMetadataPriorityLoader;
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.coroutineContextProvider = di.inject(reflectionFactory.b(CoroutineContextProvider.class));
        this.eLog = InternalDiKt.getDi().inject(reflectionFactory.b(ELog.class));
    }

    private final CoroutineContextProvider getCoroutineContextProvider() {
        return (CoroutineContextProvider) this.coroutineContextProvider.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ELog getELog() {
        return (ELog) this.eLog.getD();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        if (r7.cleanCache(r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataRepository
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object cleanCache(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof me.oriient.internal.services.dataManager.floorMetadata.C1284n
            if (r0 == 0) goto L13
            r0 = r7
            me.oriient.internal.services.dataManager.floorMetadata.n r0 = (me.oriient.internal.services.dataManager.floorMetadata.C1284n) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            me.oriient.internal.services.dataManager.floorMetadata.n r0 = new me.oriient.internal.services.dataManager.floorMetadata.n
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.b(r7)
            goto L6d
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataRepositoryImpl r2 = r0.f25164a
            kotlin.ResultKt.b(r7)
            goto L5f
        L3b:
            me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataRepositoryImpl r2 = r0.f25164a
            kotlin.ResultKt.b(r7)
            goto L52
        L41:
            kotlin.ResultKt.b(r7)
            me.oriient.internal.services.dataManager.DataRepository<me.oriient.internal.services.dataManager.floorMetadata.FloorMetadata, me.oriient.internal.services.dataManager.floorMetadata.FloorFetchData, me.oriient.internal.infra.utils.core.OriientError> r7 = r6.floorMetadataRepository
            r0.f25164a = r6
            r0.d = r5
            java.lang.Object r7 = r7.cleanCache(r0)
            if (r7 != r1) goto L51
            goto L6c
        L51:
            r2 = r6
        L52:
            me.oriient.internal.services.dataManager.DataRepository<me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataWithImage, me.oriient.internal.services.dataManager.floorMetadata.FloorFetchData, me.oriient.internal.infra.utils.core.OriientError> r7 = r2.floorMetadataWithImageRepository
            r0.f25164a = r2
            r0.d = r4
            java.lang.Object r7 = r7.cleanCache(r0)
            if (r7 != r1) goto L5f
            goto L6c
        L5f:
            me.oriient.internal.services.dataManager.DataRepository<me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataWithSvgImage, me.oriient.internal.services.dataManager.floorMetadata.FloorFetchData, me.oriient.internal.infra.utils.core.OriientError> r7 = r2.floorMetadataWithSvgImageRepository
            r2 = 0
            r0.f25164a = r2
            r0.d = r3
            java.lang.Object r7 = r7.cleanCache(r0)
            if (r7 != r1) goto L6d
        L6c:
            return r1
        L6d:
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataRepositoryImpl.cleanCache(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        if (r8.cleanData(r7, r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataRepository
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object cleanData(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof me.oriient.internal.services.dataManager.floorMetadata.C1285o
            if (r0 == 0) goto L13
            r0 = r9
            me.oriient.internal.services.dataManager.floorMetadata.o r0 = (me.oriient.internal.services.dataManager.floorMetadata.C1285o) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            me.oriient.internal.services.dataManager.floorMetadata.o r0 = new me.oriient.internal.services.dataManager.floorMetadata.o
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.b(r9)
            goto L7d
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            me.oriient.internal.services.dataManager.floorMetadata.FloorFetchData r7 = r0.b
            me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataRepositoryImpl r8 = r0.f25165a
            kotlin.ResultKt.b(r9)
            goto L6d
        L3d:
            me.oriient.internal.services.dataManager.floorMetadata.FloorFetchData r7 = r0.b
            me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataRepositoryImpl r8 = r0.f25165a
            kotlin.ResultKt.b(r9)
            goto L5e
        L45:
            kotlin.ResultKt.b(r9)
            me.oriient.internal.services.dataManager.floorMetadata.FloorFetchData r9 = new me.oriient.internal.services.dataManager.floorMetadata.FloorFetchData
            r9.<init>(r7, r8)
            me.oriient.internal.services.dataManager.DataRepository<me.oriient.internal.services.dataManager.floorMetadata.FloorMetadata, me.oriient.internal.services.dataManager.floorMetadata.FloorFetchData, me.oriient.internal.infra.utils.core.OriientError> r7 = r6.floorMetadataRepository
            r0.f25165a = r6
            r0.b = r9
            r0.e = r5
            java.lang.Object r7 = r7.cleanData(r9, r0)
            if (r7 != r1) goto L5c
            goto L7c
        L5c:
            r8 = r6
            r7 = r9
        L5e:
            me.oriient.internal.services.dataManager.DataRepository<me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataWithImage, me.oriient.internal.services.dataManager.floorMetadata.FloorFetchData, me.oriient.internal.infra.utils.core.OriientError> r9 = r8.floorMetadataWithImageRepository
            r0.f25165a = r8
            r0.b = r7
            r0.e = r4
            java.lang.Object r9 = r9.cleanData(r7, r0)
            if (r9 != r1) goto L6d
            goto L7c
        L6d:
            me.oriient.internal.services.dataManager.DataRepository<me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataWithSvgImage, me.oriient.internal.services.dataManager.floorMetadata.FloorFetchData, me.oriient.internal.infra.utils.core.OriientError> r8 = r8.floorMetadataWithSvgImageRepository
            r9 = 0
            r0.f25165a = r9
            r0.b = r9
            r0.e = r3
            java.lang.Object r7 = r8.cleanData(r7, r0)
            if (r7 != r1) goto L7d
        L7c:
            return r1
        L7d:
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataRepositoryImpl.cleanData(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataRepository
    @Nullable
    public Object fetchFloorMetadata(@NotNull String str, @NotNull String str2, boolean z, @NotNull Continuation<? super Outcome<FloorMetadata, OriientError>> continuation) {
        return BuildersKt.f(getCoroutineContextProvider().getIo(), new C1286p(str, str2, this, z, null), continuation);
    }

    @Override // me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataRepository
    @Nullable
    public Object fetchFloorMetadataWithBitmap(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Outcome<FloorMetadataWithImage, OriientError>> continuation) {
        return BuildersKt.f(getCoroutineContextProvider().getIo(), new C1287q(this, str, str2, null), continuation);
    }

    @Override // me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataRepository
    @Nullable
    public Object fetchFloorMetadataWithSvg(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Outcome<FloorMetadataWithSvgImage, OriientError>> continuation) {
        return BuildersKt.f(getCoroutineContextProvider().getIo(), new r(this, str, str2, null), continuation);
    }
}
