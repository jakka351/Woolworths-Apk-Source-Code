package me.oriient.ipssdk.common.utils.runtimedata;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.services.runtimeDataProvider.RuntimeDataProvider;
import me.oriient.ipssdk.base.auth.User;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\r\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Lme/oriient/ipssdk/common/utils/runtimedata/CommonRuntimeDataProviderImpl;", "Lme/oriient/ipssdk/common/utils/runtimedata/CommonRuntimeDataProvider;", "<init>", "()V", "Lme/oriient/ipssdk/base/auth/User;", "getUser", "()Lme/oriient/ipssdk/base/auth/User;", "user", "", "setUser", "(Lme/oriient/ipssdk/base/auth/User;)V", "Lme/oriient/ipssdk/common/utils/runtimedata/UserSessionId;", "getUserSessionId-TZY0a_w", "()Ljava/lang/String;", "getUserSessionId", "", "getUserSessionIdJava", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CommonRuntimeDataProviderImpl implements CommonRuntimeDataProvider {

    /* renamed from: a, reason: collision with root package name */
    private User f25787a;
    private final Lazy b = DependencyInjectionKt.getDi().inject(Reflection.f24268a.b(RuntimeDataProvider.class));

    @Override // me.oriient.ipssdk.common.utils.runtimedata.CommonRuntimeDataProvider
    @Nullable
    /* renamed from: getUser, reason: from getter */
    public User getF25787a() {
        return this.f25787a;
    }

    @Override // me.oriient.ipssdk.common.utils.runtimedata.CommonRuntimeDataProvider
    @NotNull
    /* renamed from: getUserSessionId-TZY0a_w */
    public String mo450getUserSessionIdTZY0a_w() {
        return UserSessionId.m452constructorimpl(((RuntimeDataProvider) this.b.getD()).getUserSession().getId());
    }

    @Override // me.oriient.ipssdk.common.utils.runtimedata.CommonRuntimeDataProvider
    @NotNull
    public String getUserSessionIdJava() {
        return UserSessionId.m452constructorimpl(((RuntimeDataProvider) this.b.getD()).getUserSession().getId());
    }

    @Override // me.oriient.ipssdk.common.utils.runtimedata.CommonRuntimeDataProvider
    public void setUser(@Nullable User user) {
        this.f25787a = user;
    }
}
