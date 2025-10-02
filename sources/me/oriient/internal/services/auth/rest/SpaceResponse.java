package me.oriient.internal.services.auth.rest;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import me.oriient.internal.services.auth.Space;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lme/oriient/internal/services/auth/rest/SpaceResponse;", "", "Companion", "$serializer", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class SpaceResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    private final String f25043a;
    private final String b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/auth/rest/SpaceResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/auth/rest/SpaceResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<SpaceResponse> serializer() {
            return SpaceResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SpaceResponse(int i, String str, String str2) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.a(i, 3, SpaceResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f25043a = str;
        this.b = str2;
    }

    public static final /* synthetic */ void a(SpaceResponse spaceResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.p(serialDescriptor, 0, spaceResponse.f25043a);
        compositeEncoder.p(serialDescriptor, 1, spaceResponse.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpaceResponse)) {
            return false;
        }
        SpaceResponse spaceResponse = (SpaceResponse) obj;
        return Intrinsics.c(this.f25043a, spaceResponse.f25043a) && Intrinsics.c(this.b, spaceResponse.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f25043a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpaceResponse(id=");
        sb.append(this.f25043a);
        sb.append(", name=");
        return me.oriient.internal.infra.rest.e.a(sb, this.b, ')');
    }

    public final Space a() {
        return new Space(this.f25043a, this.b);
    }
}
