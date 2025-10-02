package me.oriient.internal.services.auth.rest;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import me.oriient.internal.infra.locationManager.K;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lme/oriient/internal/services/auth/rest/LoginResponse;", "", "Companion", "$serializer", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class LoginResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    private static final KSerializer[] e = {null, null, null, new ArrayListSerializer(SpaceResponse$$serializer.INSTANCE)};

    /* renamed from: a, reason: collision with root package name */
    private final boolean f25041a;
    private final String b;
    private final long c;
    private final List d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/auth/rest/LoginResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/auth/rest/LoginResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<LoginResponse> serializer() {
            return LoginResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LoginResponse(int i, boolean z, String str, long j, List list) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.a(i, 15, LoginResponse$$serializer.INSTANCE.getB());
            throw null;
        }
        this.f25041a = z;
        this.b = str;
        this.c = j;
        this.d = list;
    }

    /* renamed from: b, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: c, reason: from getter */
    public final long getC() {
        return this.c;
    }

    /* renamed from: d, reason: from getter */
    public final List getD() {
        return this.d;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getF25041a() {
        return this.f25041a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginResponse)) {
            return false;
        }
        LoginResponse loginResponse = (LoginResponse) obj;
        return this.f25041a == loginResponse.f25041a && Intrinsics.c(this.b, loginResponse.b) && this.c == loginResponse.c && Intrinsics.c(this.d, loginResponse.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + K.a(this.c, me.oriient.internal.infra.rest.a.a(this.b, Boolean.hashCode(this.f25041a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoginResponse(isSuspended=");
        sb.append(this.f25041a);
        sb.append(", accessToken=");
        sb.append(this.b);
        sb.append(", accessTokenExpiry=");
        sb.append(this.c);
        sb.append(", spaces=");
        return m.a(sb, this.d, ')');
    }

    public static final /* synthetic */ void a(LoginResponse loginResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = e;
        compositeEncoder.o(serialDescriptor, 0, loginResponse.f25041a);
        compositeEncoder.p(serialDescriptor, 1, loginResponse.b);
        compositeEncoder.t(serialDescriptor, 2, loginResponse.c);
        compositeEncoder.F(serialDescriptor, 3, kSerializerArr[3], loginResponse.d);
    }
}
