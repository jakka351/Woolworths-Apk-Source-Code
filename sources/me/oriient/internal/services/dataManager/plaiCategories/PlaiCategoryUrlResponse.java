package me.oriient.internal.services.dataManager.plaiCategories;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lme/oriient/internal/services/dataManager/plaiCategories/PlaiCategoryUrlResponse;", "", "Companion", "$serializer", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class PlaiCategoryUrlResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    private final String f25332a;
    private final String b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/plaiCategories/PlaiCategoryUrlResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/plaiCategories/PlaiCategoryUrlResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<PlaiCategoryUrlResponse> serializer() {
            return PlaiCategoryUrlResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PlaiCategoryUrlResponse(int i, String str, String str2) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.a(i, 3, PlaiCategoryUrlResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f25332a = str;
        this.b = str2;
    }

    public static final /* synthetic */ void a(PlaiCategoryUrlResponse plaiCategoryUrlResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.p(serialDescriptor, 0, plaiCategoryUrlResponse.f25332a);
        compositeEncoder.p(serialDescriptor, 1, plaiCategoryUrlResponse.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaiCategoryUrlResponse)) {
            return false;
        }
        PlaiCategoryUrlResponse plaiCategoryUrlResponse = (PlaiCategoryUrlResponse) obj;
        return Intrinsics.c(this.f25332a, plaiCategoryUrlResponse.f25332a) && Intrinsics.c(this.b, plaiCategoryUrlResponse.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f25332a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaiCategoryUrlResponse(floorId=");
        sb.append(this.f25332a);
        sb.append(", link=");
        return me.oriient.internal.infra.rest.e.a(sb, this.b, ')');
    }

    public final a0 a() {
        return new a0(this.f25332a, this.b);
    }
}
