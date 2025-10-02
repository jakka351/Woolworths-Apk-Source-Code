package me.oriient.ipssdk.realtime.services.tag;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import me.oriient.internal.infra.networkManager.NetworkManager;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.services.elog.ELog;
import me.oriient.ipssdk.api.listeners.IPSCompletionListener;
import me.oriient.ipssdk.base.auth.User;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager;
import me.oriient.ipssdk.common.utils.runtimedata.CommonRuntimeDataProvider;
import me.oriient.ipssdk.realtime.ofs.J1;
import me.oriient.ipssdk.realtime.ofs.K1;
import me.oriient.ipssdk.realtime.ofs.O1;
import me.oriient.ipssdk.realtime.services.tag.model.EventTag;
import me.oriient.ipssdk.realtime.services.tag.model.EventTagRecord;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eBK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lme/oriient/ipssdk/realtime/services/tag/EventTaggingManagerImpl;", "Lme/oriient/ipssdk/realtime/services/tag/EventTaggingManager;", "Lme/oriient/ipssdk/realtime/services/tag/EventTaggingRestService;", "rest", "Lme/oriient/ipssdk/realtime/services/tag/EventTaggingDatabase;", "database", "Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "coroutineContextProvider", "Lme/oriient/internal/infra/networkManager/NetworkManager;", "networkManager", "Lme/oriient/ipssdk/common/utils/runtimedata/CommonRuntimeDataProvider;", "commonDataProvider", "Lme/oriient/ipssdk/base/remoteconfig/RemoteConfigManager;", "configManager", "Lme/oriient/internal/services/elog/ELog;", "eLog", "Lme/oriient/internal/infra/utils/core/Logger;", "logger", "<init>", "(Lme/oriient/ipssdk/realtime/services/tag/EventTaggingRestService;Lme/oriient/ipssdk/realtime/services/tag/EventTaggingDatabase;Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;Lme/oriient/internal/infra/networkManager/NetworkManager;Lme/oriient/ipssdk/common/utils/runtimedata/CommonRuntimeDataProvider;Lme/oriient/ipssdk/base/remoteconfig/RemoteConfigManager;Lme/oriient/internal/services/elog/ELog;Lme/oriient/internal/infra/utils/core/Logger;)V", "", "init", "()V", "Lme/oriient/ipssdk/realtime/services/tag/model/EventTag;", "eventTag", "Lme/oriient/ipssdk/api/listeners/IPSCompletionListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "sendTag", "(Lme/oriient/ipssdk/realtime/services/tag/model/EventTag;Lme/oriient/ipssdk/api/listeners/IPSCompletionListener;)V", "Companion", "me/oriient/ipssdk/realtime/ofs/J1", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class EventTaggingManagerImpl implements EventTaggingManager {

    @NotNull
    private static final J1 Companion = new J1();

    @Deprecated
    @NotNull
    public static final String TAG = "EventTaggingManager";

    /* renamed from: a, reason: collision with root package name */
    private final EventTaggingRestService f26190a;
    private final EventTaggingDatabase b;
    private final NetworkManager c;
    private final CommonRuntimeDataProvider d;
    private final RemoteConfigManager e;
    private final ELog f;
    private final Logger g;
    private final CoroutineScope h;
    private boolean i;
    private Job j;

    public EventTaggingManagerImpl(@NotNull EventTaggingRestService rest, @NotNull EventTaggingDatabase database, @NotNull CoroutineContextProvider coroutineContextProvider, @NotNull NetworkManager networkManager, @NotNull CommonRuntimeDataProvider commonDataProvider, @NotNull RemoteConfigManager configManager, @NotNull ELog eLog, @Nullable Logger logger) {
        Intrinsics.h(rest, "rest");
        Intrinsics.h(database, "database");
        Intrinsics.h(coroutineContextProvider, "coroutineContextProvider");
        Intrinsics.h(networkManager, "networkManager");
        Intrinsics.h(commonDataProvider, "commonDataProvider");
        Intrinsics.h(configManager, "configManager");
        Intrinsics.h(eLog, "eLog");
        this.f26190a = rest;
        this.b = database;
        this.c = networkManager;
        this.d = commonDataProvider;
        this.e = configManager;
        this.f = eLog;
        this.g = logger;
        this.h = CoroutineScopeKt.a(coroutineContextProvider.getIo());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object access$onRequestError(me.oriient.ipssdk.realtime.services.tag.EventTaggingManagerImpl r12, me.oriient.ipssdk.realtime.services.tag.model.EventTagRecord r13, kotlin.coroutines.Continuation r14) {
        /*
            r12.getClass()
            boolean r0 = r14 instanceof me.oriient.ipssdk.realtime.ofs.L1
            if (r0 == 0) goto L16
            r0 = r14
            me.oriient.ipssdk.realtime.ofs.L1 r0 = (me.oriient.ipssdk.realtime.ofs.L1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.d = r1
            goto L1b
        L16:
            me.oriient.ipssdk.realtime.ofs.L1 r0 = new me.oriient.ipssdk.realtime.ofs.L1
            r0.<init>(r12, r14)
        L1b:
            java.lang.Object r14 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.d
            java.lang.String r3 = "EventTaggingManager"
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            me.oriient.ipssdk.realtime.services.tag.EventTaggingManagerImpl r12 = r0.f25968a
            kotlin.ResultKt.b(r14)
            goto Lb1
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            kotlin.ResultKt.b(r14)
            me.oriient.internal.services.elog.ELog r14 = r12.f
            me.oriient.ipssdk.realtime.services.tag.model.EventTag r2 = r13.getTag()
            java.lang.String r2 = r2.getCustomerTagId()
            kotlin.Pair r5 = new kotlin.Pair
            java.lang.String r6 = "eventTag"
            r5.<init>(r6, r2)
            int r2 = r13.getRetries()
            int r2 = r2 + r4
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r2)
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r7 = "retries"
            r2.<init>(r7, r6)
            kotlin.Pair[] r2 = new kotlin.Pair[]{r5, r2}
            java.util.Map r2 = kotlin.collections.MapsKt.j(r2)
            java.lang.String r5 = "Failed to send tag, retry attempts increased"
            r14.e(r3, r5, r2)
            me.oriient.internal.infra.utils.core.Logger r14 = r12.g
            if (r14 == 0) goto L93
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "Failed to send tag "
            r2.<init>(r5)
            me.oriient.ipssdk.realtime.services.tag.model.EventTag r5 = r13.getTag()
            java.lang.String r5 = r5.getCustomerTagId()
            r2.append(r5)
            java.lang.String r5 = ", retries: "
            r2.append(r5)
            int r5 = r13.getRetries()
            int r5 = r5 + r4
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r14.e(r3, r2)
        L93:
            me.oriient.ipssdk.realtime.services.tag.EventTaggingDatabase r14 = r12.b
            me.oriient.ipssdk.realtime.services.tag.model.TagSendingStatus r8 = me.oriient.ipssdk.realtime.services.tag.model.TagSendingStatus.NEW
            int r2 = r13.getRetries()
            int r9 = r2 + 1
            r10 = 3
            r11 = 0
            r6 = 0
            r7 = 0
            r5 = r13
            me.oriient.ipssdk.realtime.services.tag.model.EventTagRecord r13 = me.oriient.ipssdk.realtime.services.tag.model.EventTagRecord.copy$default(r5, r6, r7, r8, r9, r10, r11)
            r0.f25968a = r12
            r0.d = r4
            java.lang.Object r13 = r14.saveTag(r13, r0)
            if (r13 != r1) goto Lb1
            return r1
        Lb1:
            kotlinx.coroutines.Job r13 = r12.j
            if (r13 == 0) goto Lb6
            goto Lce
        Lb6:
            me.oriient.internal.infra.utils.core.Logger r13 = r12.g
            if (r13 == 0) goto Lbf
            java.lang.String r14 = "Timer was started"
            r13.d(r3, r14)
        Lbf:
            kotlinx.coroutines.CoroutineScope r13 = r12.h
            me.oriient.ipssdk.realtime.ofs.R1 r14 = new me.oriient.ipssdk.realtime.ofs.R1
            r0 = 0
            r14.<init>(r12, r0)
            r1 = 3
            kotlinx.coroutines.Job r13 = kotlinx.coroutines.BuildersKt.c(r13, r0, r0, r14, r1)
            r12.j = r13
        Lce:
            kotlin.Unit r12 = kotlin.Unit.f24250a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.services.tag.EventTaggingManagerImpl.access$onRequestError(me.oriient.ipssdk.realtime.services.tag.EventTaggingManagerImpl, me.oriient.ipssdk.realtime.services.tag.model.EventTagRecord, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object access$onRequestSuccess(EventTaggingManagerImpl eventTaggingManagerImpl, EventTagRecord eventTagRecord, Continuation continuation) {
        Logger logger = eventTaggingManagerImpl.g;
        if (logger != null) {
            logger.d(TAG, "Tag send successfully, removing from db " + eventTagRecord.getTag().getCustomerTagId());
        }
        Object objRemoveTag = eventTaggingManagerImpl.b.removeTag(eventTagRecord.getTag().getTimestamp(), continuation);
        return objRemoveTag == CoroutineSingletons.d ? objRemoveTag : Unit.f24250a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        if (r15 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object access$resetAllInProgressTags(me.oriient.ipssdk.realtime.services.tag.EventTaggingManagerImpl r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.services.tag.EventTaggingManagerImpl.access$resetAllInProgressTags(me.oriient.ipssdk.realtime.services.tag.EventTaggingManagerImpl, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a5, code lost:
    
        if (r11 == r3) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a6, code lost:
    
        r13 = r4;
        r4 = r13;
        r14 = r0;
        r0 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object access$sendCachedEventTags(me.oriient.ipssdk.realtime.services.tag.EventTaggingManagerImpl r17, kotlin.coroutines.Continuation r18) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.services.tag.EventTaggingManagerImpl.access$sendCachedEventTags(me.oriient.ipssdk.realtime.services.tag.EventTaggingManagerImpl, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: access$sendTagWithCachingFallback-9ntpYrY, reason: not valid java name */
    public static final Object m474access$sendTagWithCachingFallback9ntpYrY(EventTaggingManagerImpl eventTaggingManagerImpl, EventTagRecord eventTagRecord, User user, String str, Continuation continuation) {
        Object objMo475sendTagDataq7CU6k;
        boolean zBooleanValue = ((Boolean) eventTaggingManagerImpl.c.isConnected().getValue()).booleanValue();
        Unit unit = Unit.f24250a;
        return (zBooleanValue && (objMo475sendTagDataq7CU6k = eventTaggingManagerImpl.f26190a.mo475sendTagDataq7CU6k(eventTagRecord.getTag().toRequest(), user, str, new EventTaggingManagerImpl$sendTagWithCachingFallback$2(eventTaggingManagerImpl, eventTagRecord), continuation)) == CoroutineSingletons.d) ? objMo475sendTagDataq7CU6k : unit;
    }

    @Override // me.oriient.ipssdk.realtime.services.tag.EventTaggingManager
    public void init() {
        if (!this.e.getRealTimeConfig().getMisc().getEventTagsCachingEnabled()) {
            Logger logger = this.g;
            if (logger != null) {
                logger.d(TAG, "event tagging caching disabled");
                return;
            }
            return;
        }
        if (!this.i) {
            this.i = true;
            BuildersKt.c(this.h, null, null, new K1(this, null), 3);
        } else {
            Logger logger2 = this.g;
            if (logger2 != null) {
                logger2.d(TAG, "EventTaggingManager was already started");
            }
        }
    }

    @Override // me.oriient.ipssdk.realtime.services.tag.EventTaggingManager
    public void sendTag(@NotNull EventTag eventTag, @NotNull IPSCompletionListener listener) {
        Intrinsics.h(eventTag, "eventTag");
        Intrinsics.h(listener, "listener");
        User f25787a = this.d.getF25787a();
        if (f25787a == null) {
            return;
        }
        String strMo450getUserSessionIdTZY0a_w = this.d.mo450getUserSessionIdTZY0a_w();
        if (this.e.getRealTimeConfig().getMisc().getEventTagsCachingEnabled()) {
            BuildersKt.c(this.h, null, null, new O1(eventTag, f25787a, this, listener, strMo450getUserSessionIdTZY0a_w, null), 3);
        } else {
            this.f26190a.mo476sendTagDataJava9ntpYrY(eventTag.toRequest(), f25787a, strMo450getUserSessionIdTZY0a_w, listener);
        }
    }

    public /* synthetic */ EventTaggingManagerImpl(EventTaggingRestService eventTaggingRestService, EventTaggingDatabase eventTaggingDatabase, CoroutineContextProvider coroutineContextProvider, NetworkManager networkManager, CommonRuntimeDataProvider commonRuntimeDataProvider, RemoteConfigManager remoteConfigManager, ELog eLog, Logger logger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eventTaggingRestService, eventTaggingDatabase, coroutineContextProvider, networkManager, commonRuntimeDataProvider, remoteConfigManager, eLog, (i & 128) != 0 ? null : logger);
    }
}
