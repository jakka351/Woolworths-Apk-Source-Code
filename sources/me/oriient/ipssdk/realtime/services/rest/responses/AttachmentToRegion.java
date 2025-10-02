package me.oriient.ipssdk.realtime.services.rest.responses;

import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import me.oriient.ipssdk.common.utils.models.PostProcessable;
import me.oriient.ipssdk.realtime.utils.models.RegionAttachment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 ,2\u00020\u0001:\u0002+,B5\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\fJ\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fø\u0001\u0000¢\u0006\u0004\b \u0010!J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J&\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)HÁ\u0001¢\u0006\u0002\b*R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Lme/oriient/ipssdk/realtime/services/rest/responses/AttachmentToRegion;", "Lme/oriient/ipssdk/common/utils/models/PostProcessable;", "seen1", "", "placementId", "", "clientCategory", "region", "Lme/oriient/ipssdk/realtime/services/rest/responses/Content;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ILme/oriient/ipssdk/realtime/services/rest/responses/Content;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;ILme/oriient/ipssdk/realtime/services/rest/responses/Content;)V", "getClientCategory", "()I", "getPlacementId", "()Ljava/lang/String;", "getRegion", "()Lme/oriient/ipssdk/realtime/services/rest/responses/Content;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toRegionAttachment", "Lme/oriient/ipssdk/realtime/utils/models/RegionAttachment;", "buildingId", "Lme/oriient/ipssdk/common/utils/models/BuildingId;", "toRegionAttachment-TVSKQeo", "(Ljava/lang/String;)Lme/oriient/ipssdk/realtime/utils/models/RegionAttachment;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$me_oriient_sdk_realtime", "$serializer", "Companion", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes8.dex */
public final /* data */ class AttachmentToRegion implements PostProcessable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int clientCategory;

    @NotNull
    private final String placementId;

    @NotNull
    private final Content region;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/ipssdk/realtime/services/rest/responses/AttachmentToRegion$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/ipssdk/realtime/services/rest/responses/AttachmentToRegion;", "serializer", "()Lkotlinx/serialization/KSerializer;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final KSerializer<AttachmentToRegion> serializer() {
            return AttachmentToRegion$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ AttachmentToRegion(int i, String str, int i2, Content content, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.a(i, 7, AttachmentToRegion$$serializer.INSTANCE.getB());
            throw null;
        }
        this.placementId = str;
        this.clientCategory = i2;
        this.region = content;
    }

    public static /* synthetic */ AttachmentToRegion copy$default(AttachmentToRegion attachmentToRegion, String str, int i, Content content, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = attachmentToRegion.placementId;
        }
        if ((i2 & 2) != 0) {
            i = attachmentToRegion.clientCategory;
        }
        if ((i2 & 4) != 0) {
            content = attachmentToRegion.region;
        }
        return attachmentToRegion.copy(str, i, content);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$me_oriient_sdk_realtime(AttachmentToRegion self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.placementId);
        output.C(1, self.clientCategory, serialDesc);
        output.F(serialDesc, 2, Content$$serializer.INSTANCE, self.region);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPlacementId() {
        return this.placementId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getClientCategory() {
        return this.clientCategory;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Content getRegion() {
        return this.region;
    }

    @NotNull
    public final AttachmentToRegion copy(@NotNull String placementId, int clientCategory, @NotNull Content region) {
        Intrinsics.h(placementId, "placementId");
        Intrinsics.h(region, "region");
        return new AttachmentToRegion(placementId, clientCategory, region);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttachmentToRegion)) {
            return false;
        }
        AttachmentToRegion attachmentToRegion = (AttachmentToRegion) other;
        return Intrinsics.c(this.placementId, attachmentToRegion.placementId) && this.clientCategory == attachmentToRegion.clientCategory && Intrinsics.c(this.region, attachmentToRegion.region);
    }

    public final int getClientCategory() {
        return this.clientCategory;
    }

    @NotNull
    public final String getPlacementId() {
        return this.placementId;
    }

    @NotNull
    public final Content getRegion() {
        return this.region;
    }

    public int hashCode() {
        return this.region.hashCode() + b.a(this.clientCategory, this.placementId.hashCode() * 31, 31);
    }

    @NotNull
    /* renamed from: toRegionAttachment-TVSKQeo, reason: not valid java name */
    public final RegionAttachment m463toRegionAttachmentTVSKQeo(@NotNull String buildingId) {
        Intrinsics.h(buildingId, "buildingId");
        return new RegionAttachment(this.placementId, this.clientCategory, this.region.m469toPlacedRegionTVSKQeo(buildingId));
    }

    @NotNull
    public String toString() {
        return "AttachmentToRegion(placementId=" + this.placementId + ", clientCategory=" + this.clientCategory + ", region=" + this.region + ')';
    }

    public AttachmentToRegion(@NotNull String placementId, int i, @NotNull Content region) {
        Intrinsics.h(placementId, "placementId");
        Intrinsics.h(region, "region");
        this.placementId = placementId;
        this.clientCategory = i;
        this.region = region;
    }
}
