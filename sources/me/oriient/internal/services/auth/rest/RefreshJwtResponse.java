package me.oriient.internal.services.auth.rest;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lme/oriient/internal/services/auth/rest/RefreshJwtResponse;", "", "Companion", "$serializer", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class RefreshJwtResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    private final String f25042a;
    private final long b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/auth/rest/RefreshJwtResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/auth/rest/RefreshJwtResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<RefreshJwtResponse> serializer() {
            return RefreshJwtResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RefreshJwtResponse(int i, String str, long j) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.a(i, 3, RefreshJwtResponse$$serializer.INSTANCE.getB());
            throw null;
        }
        this.f25042a = str;
        this.b = j;
    }

    public static final /* synthetic */ void a(RefreshJwtResponse refreshJwtResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.p(serialDescriptor, 0, refreshJwtResponse.f25042a);
        compositeEncoder.t(serialDescriptor, 1, refreshJwtResponse.b);
    }

    /* renamed from: b, reason: from getter */
    public final long getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RefreshJwtResponse)) {
            return false;
        }
        RefreshJwtResponse refreshJwtResponse = (RefreshJwtResponse) obj;
        return Intrinsics.c(this.f25042a, refreshJwtResponse.f25042a) && this.b == refreshJwtResponse.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f25042a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RefreshJwtResponse(accessToken=");
        sb.append(this.f25042a);
        sb.append(", accessTokenExpiry=");
        return androidx.camera.core.impl.b.q(sb, this.b, ')');
    }

    /* renamed from: a, reason: from getter */
    public final String getF25042a() {
        return this.f25042a;
    }
}
