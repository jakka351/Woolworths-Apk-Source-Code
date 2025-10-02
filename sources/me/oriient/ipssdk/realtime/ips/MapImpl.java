package me.oriient.ipssdk.realtime.ips;

import android.graphics.Bitmap;
import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.services.dataManager.floorMetadata.SignMark;
import me.oriient.internal.services.dataManager.floorMetadata.SignMarkVisibleRange;
import me.oriient.ipssdk.api.models.IPSMap;
import me.oriient.ipssdk.api.models.IPSOffset;
import me.oriient.ipssdk.api.models.IPSSignMark;
import me.oriient.ipssdk.api.models.IPSSignMarkMetadata;
import me.oriient.ipssdk.api.models.IPSSignMarkVisibleRange;
import me.oriient.ipssdk.common.utils.models.Offset;
import me.oriient.ipssdk.realtime.utils.models.Coordinate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\u0010\u000fJ\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\b\u0010\u0015\u001a\u00020\u000bH\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0006H\u0016J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0002\u0010\u001bJ\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\rH\u0016J\b\u0010\u001d\u001a\u00020\u0006H\u0016J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010 \u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012¨\u0006!"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/MapImpl;", "Lme/oriient/ipssdk/api/models/IPSMap;", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "pixelToMeter", "", "mapOffset", "Lme/oriient/ipssdk/common/utils/models/Offset;", "preferredInitialRotationDegrees", "image", "Landroid/graphics/Bitmap;", "signMarks", "", "Lme/oriient/internal/services/dataManager/floorMetadata/SignMark;", "(Ljava/lang/String;Ljava/lang/String;DLme/oriient/ipssdk/common/utils/models/Offset;Ljava/lang/Double;Landroid/graphics/Bitmap;Ljava/util/List;)V", "ipsSignMarks", "Lme/oriient/ipssdk/api/models/IPSSignMark;", "Ljava/lang/Double;", "getHeightInMeters", "getId", "getImage", "getName", "getOffset", "Lme/oriient/ipssdk/api/models/IPSOffset;", "getPixelToMeter", "getPreferredInitialRotationDegrees", "()Ljava/lang/Double;", "getSignMarks", "getWidthInMeters", "setImage", "", "toString", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MapImpl implements IPSMap {

    @NotNull
    private final String id;

    @Nullable
    private Bitmap image;

    @NotNull
    private final List<IPSSignMark> ipsSignMarks;

    @NotNull
    private final Offset mapOffset;

    @NotNull
    private final String name;
    private final double pixelToMeter;

    @Nullable
    private final Double preferredInitialRotationDegrees;

    public MapImpl(@NotNull String id, @NotNull String name, double d, @NotNull Offset mapOffset, @Nullable Double d2, @Nullable Bitmap bitmap, @NotNull List<SignMark> signMarks) {
        ArrayList arrayList;
        Intrinsics.h(id, "id");
        Intrinsics.h(name, "name");
        Intrinsics.h(mapOffset, "mapOffset");
        Intrinsics.h(signMarks, "signMarks");
        this.id = id;
        this.name = name;
        this.pixelToMeter = d;
        this.mapOffset = mapOffset;
        this.preferredInitialRotationDegrees = d2;
        this.image = bitmap;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(signMarks, 10));
        for (SignMark signMark : signMarks) {
            String id2 = signMark.getId();
            String text = signMark.getText();
            Coordinate coordinate = new Coordinate(signMark.getCoordinates().getX(), signMark.getCoordinates().getY());
            List<SignMarkVisibleRange> visibleRanges = signMark.getMetadata().getVisibleRanges();
            if (visibleRanges != null) {
                arrayList = new ArrayList(CollectionsKt.s(visibleRanges, 10));
                for (SignMarkVisibleRange signMarkVisibleRange : visibleRanges) {
                    arrayList.add(new IPSSignMarkVisibleRange(signMarkVisibleRange.getBelowMeters(), signMarkVisibleRange.getAboveMeters()));
                }
            } else {
                arrayList = null;
            }
            arrayList2.add(new IPSSignMark(id2, text, coordinate, new IPSSignMarkMetadata(arrayList), signMark.getRawMetadata()));
        }
        this.ipsSignMarks = arrayList2;
    }

    @Override // me.oriient.ipssdk.api.models.IPSMap
    public double getHeightInMeters() {
        if (this.pixelToMeter <= 0.0d) {
            return 0.0d;
        }
        return (this.image != null ? r0.getHeight() : 0.0d) / this.pixelToMeter;
    }

    @Override // me.oriient.ipssdk.api.models.IPSMap
    @NotNull
    public String getId() {
        return this.id;
    }

    @Override // me.oriient.ipssdk.api.models.IPSMap
    @NotNull
    public Bitmap getImage() {
        Bitmap bitmap = this.image;
        Intrinsics.e(bitmap);
        return bitmap;
    }

    @Override // me.oriient.ipssdk.api.models.IPSMap
    @NotNull
    public String getName() {
        return this.name;
    }

    @Override // me.oriient.ipssdk.api.models.IPSMap
    @NotNull
    public IPSOffset getOffset() {
        return this.mapOffset;
    }

    @Override // me.oriient.ipssdk.api.models.IPSMap
    public double getPixelToMeter() {
        return this.pixelToMeter;
    }

    @Override // me.oriient.ipssdk.api.models.IPSMap
    @Nullable
    public Double getPreferredInitialRotationDegrees() {
        return this.preferredInitialRotationDegrees;
    }

    @Override // me.oriient.ipssdk.api.models.IPSMap
    @NotNull
    public List<IPSSignMark> getSignMarks() {
        return this.ipsSignMarks;
    }

    @Override // me.oriient.ipssdk.api.models.IPSMap
    public double getWidthInMeters() {
        if (this.pixelToMeter <= 0.0d) {
            return 0.0d;
        }
        return (this.image != null ? r0.getWidth() : 0.0d) / this.pixelToMeter;
    }

    public final void setImage(@NotNull Bitmap image) {
        Intrinsics.h(image, "image");
        this.image = image;
    }

    @NotNull
    public String toString() {
        return "MapImpl{id='" + this.id + "', name='" + this.name + "', pixelToMeter=" + this.pixelToMeter + ", mapOffset=" + this.mapOffset + ", image=" + this.image + '}';
    }
}
