package me.oriient.internal.services.auth.rest;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lme/oriient/internal/services/auth/rest/LoginRequestBody;", "", "Companion", "$serializer", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class LoginRequestBody {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    private final String f25040a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/auth/rest/LoginRequestBody$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/auth/rest/LoginRequestBody;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<LoginRequestBody> serializer() {
            return LoginRequestBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LoginRequestBody(int i, String str) {
        if (1 == (i & 1)) {
            this.f25040a = str;
        } else {
            PluginExceptionsKt.a(i, 1, LoginRequestBody$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LoginRequestBody) && Intrinsics.c(this.f25040a, ((LoginRequestBody) obj).f25040a);
    }

    public final int hashCode() {
        return this.f25040a.hashCode();
    }

    public final String toString() {
        return me.oriient.internal.infra.rest.e.a(new StringBuilder("LoginRequestBody(apiKeyId="), this.f25040a, ')');
    }

    public LoginRequestBody(String apiKeyId) {
        Intrinsics.h(apiKeyId, "apiKeyId");
        this.f25040a = apiKeyId;
    }
}
