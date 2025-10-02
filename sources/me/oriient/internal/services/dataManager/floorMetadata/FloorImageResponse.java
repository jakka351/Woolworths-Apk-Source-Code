package me.oriient.internal.services.dataManager.floorMetadata;

import androidx.annotation.Keep;
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
import kotlinx.serialization.internal.StringSerializer;
import me.oriient.internal.services.dataManager.building.CoordinateResponse;
import me.oriient.internal.services.dataManager.building.CoordinateResponse$$serializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 92\u00020\u0001:\u000289Be\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0012J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J_\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\u0012\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010\u0005J\t\u0010/\u001a\u00020\u0005HÖ\u0001J&\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206HÁ\u0001¢\u0006\u0002\b7R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014¨\u0006:"}, d2 = {"Lme/oriient/internal/services/dataManager/floorMetadata/FloorImageResponse;", "", "seen1", "", "imageId", "", "imageUsage", "imageOffset", "Lme/oriient/internal/services/dataManager/building/CoordinateResponse;", "imageVersion", "pixelToMeter", "", "pngUrl", "svgUrl", "jsonUrl", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lme/oriient/internal/services/dataManager/building/CoordinateResponse;IDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Lme/oriient/internal/services/dataManager/building/CoordinateResponse;IDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImageId", "()Ljava/lang/String;", "getImageOffset", "()Lme/oriient/internal/services/dataManager/building/CoordinateResponse;", "getImageUsage", "getImageVersion", "()I", "getJsonUrl", "getPixelToMeter", "()D", "getPngUrl", "getSvgUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toFloorImage", "Lme/oriient/internal/services/dataManager/floorMetadata/FloorImage;", "url", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class FloorImageResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private final String imageId;

    @NotNull
    private final CoordinateResponse imageOffset;

    @NotNull
    private final String imageUsage;
    private final int imageVersion;

    @Nullable
    private final String jsonUrl;
    private final double pixelToMeter;

    @Nullable
    private final String pngUrl;

    @Nullable
    private final String svgUrl;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/floorMetadata/FloorImageResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/floorMetadata/FloorImageResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<FloorImageResponse> serializer() {
            return FloorImageResponse$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ FloorImageResponse(int i, String str, String str2, CoordinateResponse coordinateResponse, int i2, double d, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.a(i, 31, FloorImageResponse$$serializer.INSTANCE.getB());
            throw null;
        }
        this.imageId = str;
        this.imageUsage = str2;
        this.imageOffset = coordinateResponse;
        this.imageVersion = i2;
        this.pixelToMeter = d;
        if ((i & 32) == 0) {
            this.pngUrl = null;
        } else {
            this.pngUrl = str3;
        }
        if ((i & 64) == 0) {
            this.svgUrl = null;
        } else {
            this.svgUrl = str4;
        }
        if ((i & 128) == 0) {
            this.jsonUrl = null;
        } else {
            this.jsonUrl = str5;
        }
    }

    public static /* synthetic */ FloorImageResponse copy$default(FloorImageResponse floorImageResponse, String str, String str2, CoordinateResponse coordinateResponse, int i, double d, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = floorImageResponse.imageId;
        }
        if ((i2 & 2) != 0) {
            str2 = floorImageResponse.imageUsage;
        }
        if ((i2 & 4) != 0) {
            coordinateResponse = floorImageResponse.imageOffset;
        }
        if ((i2 & 8) != 0) {
            i = floorImageResponse.imageVersion;
        }
        if ((i2 & 16) != 0) {
            d = floorImageResponse.pixelToMeter;
        }
        if ((i2 & 32) != 0) {
            str3 = floorImageResponse.pngUrl;
        }
        if ((i2 & 64) != 0) {
            str4 = floorImageResponse.svgUrl;
        }
        if ((i2 & 128) != 0) {
            str5 = floorImageResponse.jsonUrl;
        }
        String str6 = str5;
        String str7 = str3;
        double d2 = d;
        CoordinateResponse coordinateResponse2 = coordinateResponse;
        int i3 = i;
        return floorImageResponse.copy(str, str2, coordinateResponse2, i3, d2, str7, str4, str6);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(FloorImageResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.imageId);
        output.p(serialDesc, 1, self.imageUsage);
        output.F(serialDesc, 2, CoordinateResponse$$serializer.INSTANCE, self.imageOffset);
        output.C(3, self.imageVersion, serialDesc);
        output.G(serialDesc, 4, self.pixelToMeter);
        if (output.q(serialDesc, 5) || self.pngUrl != null) {
            output.w(serialDesc, 5, StringSerializer.f24821a, self.pngUrl);
        }
        if (output.q(serialDesc, 6) || self.svgUrl != null) {
            output.w(serialDesc, 6, StringSerializer.f24821a, self.svgUrl);
        }
        if (!output.q(serialDesc, 7) && self.jsonUrl == null) {
            return;
        }
        output.w(serialDesc, 7, StringSerializer.f24821a, self.jsonUrl);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getImageId() {
        return this.imageId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getImageUsage() {
        return this.imageUsage;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final CoordinateResponse getImageOffset() {
        return this.imageOffset;
    }

    /* renamed from: component4, reason: from getter */
    public final int getImageVersion() {
        return this.imageVersion;
    }

    /* renamed from: component5, reason: from getter */
    public final double getPixelToMeter() {
        return this.pixelToMeter;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getPngUrl() {
        return this.pngUrl;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getSvgUrl() {
        return this.svgUrl;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getJsonUrl() {
        return this.jsonUrl;
    }

    @NotNull
    public final FloorImageResponse copy(@NotNull String imageId, @NotNull String imageUsage, @NotNull CoordinateResponse imageOffset, int imageVersion, double pixelToMeter, @Nullable String pngUrl, @Nullable String svgUrl, @Nullable String jsonUrl) {
        Intrinsics.h(imageId, "imageId");
        Intrinsics.h(imageUsage, "imageUsage");
        Intrinsics.h(imageOffset, "imageOffset");
        return new FloorImageResponse(imageId, imageUsage, imageOffset, imageVersion, pixelToMeter, pngUrl, svgUrl, jsonUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FloorImageResponse)) {
            return false;
        }
        FloorImageResponse floorImageResponse = (FloorImageResponse) other;
        return Intrinsics.c(this.imageId, floorImageResponse.imageId) && Intrinsics.c(this.imageUsage, floorImageResponse.imageUsage) && Intrinsics.c(this.imageOffset, floorImageResponse.imageOffset) && this.imageVersion == floorImageResponse.imageVersion && Double.compare(this.pixelToMeter, floorImageResponse.pixelToMeter) == 0 && Intrinsics.c(this.pngUrl, floorImageResponse.pngUrl) && Intrinsics.c(this.svgUrl, floorImageResponse.svgUrl) && Intrinsics.c(this.jsonUrl, floorImageResponse.jsonUrl);
    }

    @NotNull
    public final String getImageId() {
        return this.imageId;
    }

    @NotNull
    public final CoordinateResponse getImageOffset() {
        return this.imageOffset;
    }

    @NotNull
    public final String getImageUsage() {
        return this.imageUsage;
    }

    public final int getImageVersion() {
        return this.imageVersion;
    }

    @Nullable
    public final String getJsonUrl() {
        return this.jsonUrl;
    }

    public final double getPixelToMeter() {
        return this.pixelToMeter;
    }

    @Nullable
    public final String getPngUrl() {
        return this.pngUrl;
    }

    @Nullable
    public final String getSvgUrl() {
        return this.svgUrl;
    }

    public int hashCode() {
        int iA = me.oriient.internal.infra.locationManager.J.a(this.pixelToMeter, me.oriient.internal.services.config.a.a(this.imageVersion, (this.imageOffset.hashCode() + me.oriient.internal.infra.rest.a.a(this.imageUsage, this.imageId.hashCode() * 31, 31)) * 31, 31), 31);
        String str = this.pngUrl;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.svgUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.jsonUrl;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Nullable
    public final FloorImage toFloorImage(@Nullable String url) {
        if (url != null) {
            return new FloorImage(this.imageUsage, this.imageVersion, this.imageId, this.imageOffset.toOffset(), this.pixelToMeter, url);
        }
        return null;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("FloorImageResponse(imageId=");
        sb.append(this.imageId);
        sb.append(", imageUsage=");
        sb.append(this.imageUsage);
        sb.append(", imageOffset=");
        sb.append(this.imageOffset);
        sb.append(", imageVersion=");
        sb.append(this.imageVersion);
        sb.append(", pixelToMeter=");
        sb.append(this.pixelToMeter);
        sb.append(", pngUrl=");
        sb.append(this.pngUrl);
        sb.append(", svgUrl=");
        sb.append(this.svgUrl);
        sb.append(", jsonUrl=");
        return me.oriient.internal.infra.rest.e.a(sb, this.jsonUrl, ')');
    }

    public FloorImageResponse(@NotNull String imageId, @NotNull String imageUsage, @NotNull CoordinateResponse imageOffset, int i, double d, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.h(imageId, "imageId");
        Intrinsics.h(imageUsage, "imageUsage");
        Intrinsics.h(imageOffset, "imageOffset");
        this.imageId = imageId;
        this.imageUsage = imageUsage;
        this.imageOffset = imageOffset;
        this.imageVersion = i;
        this.pixelToMeter = d;
        this.pngUrl = str;
        this.svgUrl = str2;
        this.jsonUrl = str3;
    }

    public /* synthetic */ FloorImageResponse(String str, String str2, CoordinateResponse coordinateResponse, int i, double d, String str3, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, coordinateResponse, i, d, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? null : str5);
    }
}
