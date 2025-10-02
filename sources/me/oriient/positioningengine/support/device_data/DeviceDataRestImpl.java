package me.oriient.positioningengine.support.device_data;

import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.rest.OriientApiProvider;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataManager.rest.RestHelper;
import me.oriient.internal.services.elog.ELog;
import me.oriient.positioningengine.common.DiKt;
import me.oriient.positioningengine.common.util.PositioningEngineError;
import me.oriient.positioningengine.support.device_data.model.DeviceData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 /2\u00020\u0001:\u00010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ_\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u0012\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000e\u001a\u00020\u000223\u0010\u0016\u001a/\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u000f¢\u0006\u0002\b\u0015H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J,\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010-¨\u00061"}, d2 = {"Lme/oriient/positioningengine/support/device_data/DeviceDataRestImpl;", "Lme/oriient/positioningengine/support/device_data/DeviceDataRest;", "", "timeoutMillis", "<init>", "(J)V", "", "code", "", "message", "", "eLogRequestFailed", "(ILjava/lang/String;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "timeMillis", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "Lme/oriient/internal/infra/utils/core/Outcome;", "Lme/oriient/positioningengine/common/util/PositioningEngineError;", "", "Lkotlin/ExtensionFunctionType;", "block", "withTimeoutOrFailure", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deviceModel", "userSessionId", "Lme/oriient/positioningengine/support/device_data/model/DeviceData;", "loadDeviceData", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "J", "Lme/oriient/internal/infra/rest/OriientApiProvider;", "oriientApiProvider$delegate", "Lkotlin/Lazy;", "getOriientApiProvider", "()Lme/oriient/internal/infra/rest/OriientApiProvider;", "oriientApiProvider", "Lme/oriient/internal/services/elog/ELog;", "eLog$delegate", "getELog", "()Lme/oriient/internal/services/elog/ELog;", "eLog", "Lme/oriient/internal/services/dataManager/rest/RestHelper;", "restHelper$delegate", "getRestHelper", "()Lme/oriient/internal/services/dataManager/rest/RestHelper;", "restHelper", "Companion", "me/oriient/positioningengine/support/device_data/e", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class DeviceDataRestImpl implements DeviceDataRest {

    @NotNull
    private static final e Companion = new e();

    @Deprecated
    @NotNull
    public static final String DEVICE_DATA_PATH = "/api/v1/engine/device-data";

    @NotNull
    private static final String TAG = "DeviceDataRest";

    /* renamed from: eLog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy eLog;

    /* renamed from: oriientApiProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy oriientApiProvider;

    /* renamed from: restHelper$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy restHelper;
    private final long timeoutMillis;

    public DeviceDataRestImpl(long j) {
        this.timeoutMillis = j;
        DependencyInjection di = DiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.oriientApiProvider = di.inject(reflectionFactory.b(OriientApiProvider.class));
        this.eLog = DiKt.getDi().inject(reflectionFactory.b(ELog.class));
        this.restHelper = DiKt.getDi().inject(reflectionFactory.b(RestHelper.class));
    }

    private final void eLogRequestFailed(int code, String message) {
        getELog().e(TAG, "Failed to load Device data", MapsKt.j(new Pair("errorCode", Integer.valueOf(code)), new Pair("errorMessage", message)));
    }

    private final ELog getELog() {
        return (ELog) this.eLog.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OriientApiProvider getOriientApiProvider() {
        return (OriientApiProvider) this.oriientApiProvider.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RestHelper getRestHelper() {
        return (RestHelper) this.restHelper.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> java.lang.Object withTimeoutOrFailure(long r5, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<T, me.oriient.positioningengine.common.util.PositioningEngineError>>, ? extends java.lang.Object> r7, kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<T, me.oriient.positioningengine.common.util.PositioningEngineError>> r8) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r8 instanceof me.oriient.positioningengine.support.device_data.i
            if (r0 == 0) goto L13
            r0 = r8
            me.oriient.positioningengine.support.device_data.i r0 = (me.oriient.positioningengine.support.device_data.i) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            me.oriient.positioningengine.support.device_data.i r0 = new me.oriient.positioningengine.support.device_data.i
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            me.oriient.positioningengine.support.device_data.DeviceDataRestImpl r5 = r0.f26527a
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Exception -> L44
            goto L40
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r8)
            r0.f26527a = r4     // Catch: java.lang.Exception -> L43
            r0.d = r3     // Catch: java.lang.Exception -> L43
            java.lang.Object r8 = kotlinx.coroutines.TimeoutKt.b(r5, r7, r0)     // Catch: java.lang.Exception -> L43
            if (r8 != r1) goto L3f
            return r1
        L3f:
            r5 = r4
        L40:
            me.oriient.internal.infra.utils.core.Outcome r8 = (me.oriient.internal.infra.utils.core.Outcome) r8     // Catch: java.lang.Exception -> L44
            return r8
        L43:
            r5 = r4
        L44:
            r6 = 504(0x1f8, float:7.06E-43)
            java.lang.String r7 = "Timeout exceeded"
            r5.eLogRequestFailed(r6, r7)
            me.oriient.internal.infra.utils.core.Outcome$Failure r5 = new me.oriient.internal.infra.utils.core.Outcome$Failure
            me.oriient.positioningengine.common.util.PositioningEngineError$ServerError r8 = new me.oriient.positioningengine.common.util.PositioningEngineError$ServerError
            r8.<init>(r6, r7)
            r5.<init>(r8)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.support.device_data.DeviceDataRestImpl.withTimeoutOrFailure(long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // me.oriient.positioningengine.support.device_data.DeviceDataRest
    @Nullable
    public Object loadDeviceData(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Outcome<DeviceData, PositioningEngineError>> continuation) {
        return withTimeoutOrFailure(this.timeoutMillis, new h(str, str2, this, null), continuation);
    }
}
