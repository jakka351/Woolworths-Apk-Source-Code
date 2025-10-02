package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\u0010\u0011R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0015\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013¨\u0006\""}, d2 = {"Lme/oriient/ipssdk/api/models/IPSFloorImageData;", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "image", "Lme/oriient/ipssdk/api/models/IPSFloorImage;", "pixelToMeter", "", "widthInMeters", "heightInMeters", "offset", "Lme/oriient/ipssdk/api/models/IPSOffset;", "preferredInitialRotationDegrees", "signMarks", "", "Lme/oriient/ipssdk/api/models/IPSSignMark;", "(Ljava/lang/String;Ljava/lang/String;Lme/oriient/ipssdk/api/models/IPSFloorImage;DDDLme/oriient/ipssdk/api/models/IPSOffset;Ljava/lang/Double;Ljava/util/List;)V", "getHeightInMeters", "()D", "getId", "()Ljava/lang/String;", "getImage", "()Lme/oriient/ipssdk/api/models/IPSFloorImage;", "getName", "getOffset", "()Lme/oriient/ipssdk/api/models/IPSOffset;", "getPixelToMeter", "getPreferredInitialRotationDegrees", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getSignMarks", "()Ljava/util/List;", "getWidthInMeters", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IPSFloorImageData {
    private final double heightInMeters;

    @NotNull
    private final String id;

    @NotNull
    private final IPSFloorImage image;

    @NotNull
    private final String name;

    @NotNull
    private final IPSOffset offset;
    private final double pixelToMeter;

    @Nullable
    private final Double preferredInitialRotationDegrees;

    @NotNull
    private final List<IPSSignMark> signMarks;
    private final double widthInMeters;

    public IPSFloorImageData(@NotNull String id, @NotNull String name, @NotNull IPSFloorImage image, double d, double d2, double d3, @NotNull IPSOffset offset, @Nullable Double d4, @NotNull List<IPSSignMark> signMarks) {
        Intrinsics.h(id, "id");
        Intrinsics.h(name, "name");
        Intrinsics.h(image, "image");
        Intrinsics.h(offset, "offset");
        Intrinsics.h(signMarks, "signMarks");
        this.id = id;
        this.name = name;
        this.image = image;
        this.pixelToMeter = d;
        this.widthInMeters = d2;
        this.heightInMeters = d3;
        this.offset = offset;
        this.preferredInitialRotationDegrees = d4;
        this.signMarks = signMarks;
    }

    public final double getHeightInMeters() {
        return this.heightInMeters;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final IPSFloorImage getImage() {
        return this.image;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final IPSOffset getOffset() {
        return this.offset;
    }

    public final double getPixelToMeter() {
        return this.pixelToMeter;
    }

    @Nullable
    public final Double getPreferredInitialRotationDegrees() {
        return this.preferredInitialRotationDegrees;
    }

    @NotNull
    public final List<IPSSignMark> getSignMarks() {
        return this.signMarks;
    }

    public final double getWidthInMeters() {
        return this.widthInMeters;
    }
}
