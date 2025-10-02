package me.oriient.internal.services.dataManager.plai;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lme/oriient/internal/services/dataManager/plai/PlaiUrlResponse;", "", "Companion", "$serializer", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class PlaiUrlResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    private final String f25287a;
    private final String b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/plai/PlaiUrlResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/plai/PlaiUrlResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<PlaiUrlResponse> serializer() {
            return PlaiUrlResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PlaiUrlResponse(int i, String str, String str2) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.a(i, 3, PlaiUrlResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f25287a = str;
        this.b = str2;
    }

    public static final /* synthetic */ void a(PlaiUrlResponse plaiUrlResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.p(serialDescriptor, 0, plaiUrlResponse.f25287a);
        compositeEncoder.p(serialDescriptor, 1, plaiUrlResponse.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaiUrlResponse)) {
            return false;
        }
        PlaiUrlResponse plaiUrlResponse = (PlaiUrlResponse) obj;
        return Intrinsics.c(this.f25287a, plaiUrlResponse.f25287a) && Intrinsics.c(this.b, plaiUrlResponse.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f25287a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaiUrlResponse(floorId=");
        sb.append(this.f25287a);
        sb.append(", link=");
        return me.oriient.internal.infra.rest.e.a(sb, this.b, ')');
    }

    public final a0 a() {
        return new a0(this.f25287a, this.b);
    }
}
