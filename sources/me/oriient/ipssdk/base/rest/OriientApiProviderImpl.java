package me.oriient.ipssdk.base.rest;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import me.oriient.internal.infra.rest.OriientApi;
import me.oriient.internal.infra.rest.OriientApiImpl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lme/oriient/ipssdk/base/rest/OriientApiProviderImpl;", "Lme/oriient/ipssdk/base/rest/SdkOriientApiProvider;", "<init>", "()V", "", "ipsDomain", "", "onLogin", "(Ljava/lang/String;)V", "Lme/oriient/internal/infra/rest/OriientApi;", "oriientApi", "Lme/oriient/internal/infra/rest/OriientApi;", "getOriientApi", "()Lme/oriient/internal/infra/rest/OriientApi;", "setOriientApi", "(Lme/oriient/internal/infra/rest/OriientApi;)V", "Lkotlinx/coroutines/flow/MutableStateFlow;", "a", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getOriientApiFlow", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "oriientApiFlow", "me.oriient.sdk-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OriientApiProviderImpl implements SdkOriientApiProvider {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow oriientApiFlow = StateFlowKt.a(null);
    public OriientApi oriientApi;

    @Override // me.oriient.internal.infra.rest.OriientApiProvider
    @NotNull
    public OriientApi getOriientApi() {
        OriientApi oriientApi = this.oriientApi;
        if (oriientApi != null) {
            return oriientApi;
        }
        Intrinsics.p("oriientApi");
        throw null;
    }

    @Override // me.oriient.ipssdk.base.rest.SdkOriientApiProvider
    public void onLogin(@NotNull String ipsDomain) {
        Intrinsics.h(ipsDomain, "ipsDomain");
        OriientApiImpl oriientApiImpl = new OriientApiImpl(ipsDomain);
        setOriientApi(oriientApiImpl);
        getOriientApiFlow().setValue(oriientApiImpl);
    }

    public void setOriientApi(@NotNull OriientApi oriientApi) {
        Intrinsics.h(oriientApi, "<set-?>");
        this.oriientApi = oriientApi;
    }

    @Override // me.oriient.ipssdk.base.rest.SdkOriientApiProvider
    @NotNull
    public MutableStateFlow<OriientApi> getOriientApiFlow() {
        return this.oriientApiFlow;
    }
}
