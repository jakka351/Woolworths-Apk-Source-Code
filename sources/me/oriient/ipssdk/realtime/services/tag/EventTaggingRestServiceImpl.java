package me.oriient.ipssdk.realtime.services.tag;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.rest.OriientApiProvider;
import me.oriient.internal.infra.rest.RestService;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.ipssdk.api.listeners.IPSCompletionListener;
import me.oriient.ipssdk.base.auth.User;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.realtime.ofs.S1;
import me.oriient.ipssdk.realtime.ofs.V1;
import me.oriient.ipssdk.realtime.ofs.W1;
import me.oriient.ipssdk.realtime.services.tag.model.TagRequest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Lme/oriient/ipssdk/realtime/services/tag/EventTaggingRestServiceImpl;", "Lme/oriient/ipssdk/realtime/services/tag/EventTaggingRestService;", "Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "coroutineContextProvider", "<init>", "(Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;)V", "Lme/oriient/ipssdk/realtime/services/tag/model/TagRequest;", "tagRequest", "Lme/oriient/ipssdk/base/auth/User;", "user", "Lme/oriient/ipssdk/common/utils/runtimedata/UserSessionId;", "userSessionId", "Lme/oriient/ipssdk/api/listeners/IPSCompletionListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "sendTagDataJava-9ntpYrY", "(Lme/oriient/ipssdk/realtime/services/tag/model/TagRequest;Lme/oriient/ipssdk/base/auth/User;Ljava/lang/String;Lme/oriient/ipssdk/api/listeners/IPSCompletionListener;)V", "sendTagDataJava", "sendTagData-q7C-U6k", "(Lme/oriient/ipssdk/realtime/services/tag/model/TagRequest;Lme/oriient/ipssdk/base/auth/User;Ljava/lang/String;Lme/oriient/ipssdk/api/listeners/IPSCompletionListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendTagData", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class EventTaggingRestServiceImpl implements EventTaggingRestService {

    /* renamed from: a, reason: collision with root package name */
    private final CoroutineContextProvider f26192a;
    private final Lazy b;
    private final Lazy c;
    private final Lazy d;
    private final Lazy e;

    public EventTaggingRestServiceImpl(@NotNull CoroutineContextProvider coroutineContextProvider) {
        Intrinsics.h(coroutineContextProvider, "coroutineContextProvider");
        this.f26192a = coroutineContextProvider;
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.b = di.inject(reflectionFactory.b(Logger.class));
        this.c = DependencyInjectionKt.getDi().inject(reflectionFactory.b(RestService.class));
        this.d = DependencyInjectionKt.getDi().inject(reflectionFactory.b(OriientApiProvider.class));
        this.e = LazyKt.b(new S1(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* renamed from: access$sendEventTag-q7C-U6k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m477access$sendEventTagq7CU6k(me.oriient.ipssdk.realtime.services.tag.EventTaggingRestServiceImpl r7, me.oriient.ipssdk.realtime.services.tag.model.TagRequest r8, me.oriient.ipssdk.base.auth.User r9, java.lang.String r10, me.oriient.ipssdk.api.listeners.IPSCompletionListener r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.services.tag.EventTaggingRestServiceImpl.m477access$sendEventTagq7CU6k(me.oriient.ipssdk.realtime.services.tag.EventTaggingRestServiceImpl, me.oriient.ipssdk.realtime.services.tag.model.TagRequest, me.oriient.ipssdk.base.auth.User, java.lang.String, me.oriient.ipssdk.api.listeners.IPSCompletionListener, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // me.oriient.ipssdk.realtime.services.tag.EventTaggingRestService
    @Nullable
    /* renamed from: sendTagData-q7C-U6k */
    public Object mo475sendTagDataq7CU6k(@NotNull TagRequest tagRequest, @NotNull User user, @NotNull String str, @NotNull IPSCompletionListener iPSCompletionListener, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objF = BuildersKt.f(this.f26192a.getIo(), new V1(this, tagRequest, user, str, iPSCompletionListener, null), continuation);
        return objF == CoroutineSingletons.d ? objF : Unit.f24250a;
    }

    @Override // me.oriient.ipssdk.realtime.services.tag.EventTaggingRestService
    /* renamed from: sendTagDataJava-9ntpYrY */
    public void mo476sendTagDataJava9ntpYrY(@NotNull TagRequest tagRequest, @NotNull User user, @NotNull String userSessionId, @NotNull IPSCompletionListener listener) {
        Intrinsics.h(tagRequest, "tagRequest");
        Intrinsics.h(user, "user");
        Intrinsics.h(userSessionId, "userSessionId");
        Intrinsics.h(listener, "listener");
        BuildersKt.c((CoroutineScope) this.e.getD(), null, null, new W1(this, tagRequest, user, userSessionId, listener, null), 3);
    }
}
