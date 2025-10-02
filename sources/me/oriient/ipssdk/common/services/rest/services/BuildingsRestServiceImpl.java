package me.oriient.ipssdk.common.services.rest.services;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
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
import me.oriient.ipssdk.common.ofs.C1545c;
import me.oriient.ipssdk.common.services.rest.RestRequest;
import me.oriient.ipssdk.common.utils.IBuildingsSearchListener;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lme/oriient/ipssdk/common/services/rest/services/BuildingsRestServiceImpl;", "Lme/oriient/ipssdk/common/services/rest/services/BuildingsRestService;", "<init>", "()V", "Lme/oriient/ipssdk/base/auth/User;", "user", "", "userSessionId", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lme/oriient/ipssdk/common/utils/IBuildingsSearchListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lme/oriient/ipssdk/common/services/rest/RestRequest;", "searchBuildingByNameJava", "(Lme/oriient/ipssdk/base/auth/User;Ljava/lang/String;Ljava/lang/String;Lme/oriient/ipssdk/common/utils/IBuildingsSearchListener;)Lme/oriient/ipssdk/common/services/rest/RestRequest;", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class BuildingsRestServiceImpl implements BuildingsRestService {

    /* renamed from: a, reason: collision with root package name */
    private final Lazy f25782a;
    private final Lazy b;
    private final Lazy c;

    public BuildingsRestServiceImpl() {
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f25782a = di.inject(reflectionFactory.b(Logger.class));
        this.b = DependencyInjectionKt.getDi().inject(reflectionFactory.b(RestService.class));
        this.c = DependencyInjectionKt.getDi().inject(reflectionFactory.b(OriientApiProvider.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: access$getAllBuildingsSync-R0umqfA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m436access$getAllBuildingsSyncR0umqfA(me.oriient.ipssdk.common.services.rest.services.BuildingsRestServiceImpl r5, me.oriient.ipssdk.base.auth.User r6, java.lang.String r7, java.lang.String r8, kotlin.coroutines.Continuation r9) throws me.oriient.ipssdk.base.rest.RestException, me.oriient.ipssdk.base.rest.RestCanceledException {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.common.services.rest.services.BuildingsRestServiceImpl.m436access$getAllBuildingsSyncR0umqfA(me.oriient.ipssdk.common.services.rest.services.BuildingsRestServiceImpl, me.oriient.ipssdk.base.auth.User, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Logger access$getLogger(BuildingsRestServiceImpl buildingsRestServiceImpl) {
        return (Logger) buildingsRestServiceImpl.f25782a.getD();
    }

    @Override // me.oriient.ipssdk.common.services.rest.services.BuildingsRestService
    @NotNull
    public RestRequest searchBuildingByNameJava(@NotNull User user, @NotNull String userSessionId, @NotNull String name, @NotNull IBuildingsSearchListener listener) {
        Intrinsics.h(user, "user");
        Intrinsics.h(userSessionId, "userSessionId");
        Intrinsics.h(name, "name");
        Intrinsics.h(listener, "listener");
        ((Logger) this.f25782a.getD()).d("BuildingsRestService", "searchBuildingByNameJava() called with: user = [" + user + "], name = [" + name + "], listener = [" + listener + ']');
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return new RestRequest(BuildersKt.c(GlobalScope.d, DefaultIoScheduler.f, null, new C1545c(this, user, userSessionId, name, listener, null), 2));
    }
}
