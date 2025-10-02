package me.oriient.ipssdk.base.remoteconfig;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.rest.OriientApiProvider;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.dataManager.rest.RestHelper;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u000b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0004\u0012\u00020\n0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lme/oriient/ipssdk/base/remoteconfig/RemoteConfigRestImpl;", "Lme/oriient/ipssdk/base/remoteconfig/RemoteConfigRest;", "<init>", "()V", "Lme/oriient/ipssdk/base/auth/User;", "user", "Lme/oriient/internal/infra/utils/core/Outcome;", "Lkotlin/Pair;", "", "Lme/oriient/ipssdk/base/remoteconfig/responses/RemoteConfigResponse;", "Lme/oriient/internal/infra/utils/core/OriientError;", "fetchRemoteConfig", "(Lme/oriient/ipssdk/base/auth/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "me/oriient/ipssdk/base/remoteconfig/e", "me.oriient.sdk-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RemoteConfigRestImpl implements RemoteConfigRest {

    @NotNull
    private static final e Companion = new e();

    /* renamed from: a, reason: collision with root package name */
    private final Lazy f25702a;
    private final Lazy b;
    private final Lazy c;
    private final Lazy d;

    public RemoteConfigRestImpl() {
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f25702a = di.inject(reflectionFactory.b(Logger.class));
        this.b = DependencyInjectionKt.getDi().inject(reflectionFactory.b(OriientApiProvider.class));
        this.c = DependencyInjectionKt.getDi().inject(reflectionFactory.b(RestHelper.class));
        this.d = DependencyInjectionKt.getDi().inject(reflectionFactory.b(RemoteConfigDataGenerator.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // me.oriient.ipssdk.base.remoteconfig.RemoteConfigRest
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object fetchRemoteConfig(@org.jetbrains.annotations.NotNull me.oriient.ipssdk.base.auth.User r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<kotlin.Pair<java.lang.String, me.oriient.ipssdk.base.remoteconfig.responses.RemoteConfigResponse>, me.oriient.internal.infra.utils.core.OriientError>> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof me.oriient.ipssdk.base.remoteconfig.f
            if (r0 == 0) goto L14
            r0 = r12
            me.oriient.ipssdk.base.remoteconfig.f r0 = (me.oriient.ipssdk.base.remoteconfig.f) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.d = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            me.oriient.ipssdk.base.remoteconfig.f r0 = new me.oriient.ipssdk.base.remoteconfig.f
            r0.<init>(r10, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r7.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r7.d
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            me.oriient.ipssdk.base.remoteconfig.RemoteConfigRestImpl r11 = r7.f25708a
            kotlin.ResultKt.b(r12)
            goto L7a
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            kotlin.ResultKt.b(r12)
            kotlin.Lazy r12 = r10.c
            java.lang.Object r12 = r12.getD()
            r1 = r12
            me.oriient.internal.services.dataManager.rest.RestHelper r1 = (me.oriient.internal.services.dataManager.rest.RestHelper) r1
            kotlin.Lazy r12 = r10.b
            java.lang.Object r12 = r12.getD()
            me.oriient.internal.infra.rest.OriientApiProvider r12 = (me.oriient.internal.infra.rest.OriientApiProvider) r12
            me.oriient.internal.infra.rest.OriientApi r12 = r12.getOriientApi()
            java.lang.String r3 = r12.getSdkConfigUrl()
            me.oriient.internal.infra.rest.HttpRequestBody$String r4 = new me.oriient.internal.infra.rest.HttpRequestBody$String
            kotlin.Lazy r12 = r10.d
            java.lang.Object r12 = r12.getD()
            me.oriient.ipssdk.base.remoteconfig.RemoteConfigDataGenerator r12 = (me.oriient.ipssdk.base.remoteconfig.RemoteConfigDataGenerator) r12
            java.lang.String r5 = "Regular"
            me.oriient.ipssdk.base.remoteconfig.RemoteConfigAppData r11 = r12.generate(r11, r5)
            java.lang.String r11 = me.oriient.internal.infra.serializerJson.JsonSerializationKt.serializeToJsonString(r11)
            r4.<init>(r11)
            me.oriient.ipssdk.base.remoteconfig.g r6 = me.oriient.ipssdk.base.remoteconfig.g.f25709a
            r7.f25708a = r10
            r7.d = r2
            r8 = 8
            r9 = 0
            java.lang.String r2 = "RemoteConfigRest"
            r5 = 0
            java.lang.Object r12 = me.oriient.internal.services.dataManager.rest.RestHelper.DefaultImpls.postStringData$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r12 != r0) goto L79
            return r0
        L79:
            r11 = r10
        L7a:
            me.oriient.internal.infra.utils.core.Outcome r12 = (me.oriient.internal.infra.utils.core.Outcome) r12
            boolean r0 = r12 instanceof me.oriient.internal.infra.utils.core.Outcome.Failure
            if (r0 == 0) goto L98
            r0 = r12
            me.oriient.internal.infra.utils.core.Outcome$Failure r0 = (me.oriient.internal.infra.utils.core.Outcome.Failure) r0
            java.lang.Exception r0 = r0.getValue()
            me.oriient.internal.infra.utils.core.OriientError r0 = (me.oriient.internal.infra.utils.core.OriientError) r0
            kotlin.Lazy r11 = r11.f25702a
            java.lang.Object r11 = r11.getD()
            me.oriient.internal.infra.utils.core.Logger r11 = (me.oriient.internal.infra.utils.core.Logger) r11
            java.lang.String r1 = "RemoteConfigRest"
            java.lang.String r2 = "fetchRemoteConfig: error"
            r11.e(r1, r2, r0)
        L98:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.base.remoteconfig.RemoteConfigRestImpl.fetchRemoteConfig(me.oriient.ipssdk.base.auth.User, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
