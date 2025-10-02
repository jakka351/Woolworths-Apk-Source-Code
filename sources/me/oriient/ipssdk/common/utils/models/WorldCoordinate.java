package me.oriient.ipssdk.common.utils.models;

import android.support.v4.media.session.a;
import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
import com.salesforce.marketingcloud.storage.db.h;
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
import me.oriient.ipssdk.api.models.IPSGlobalCoordinate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000 %2\u00020\u0001:\u0002$%B1\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ(\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J\u0016\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0005H\u0016J\b\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u0005H\u0016J\b\u0010\u001a\u001a\u00020\u0003H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J!\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#HÇ\u0001R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&\u0080å\b\u0004\u0080å\b\u0006\u0080å\b\u0007"}, d2 = {"Lme/oriient/ipssdk/common/utils/models/WorldCoordinate;", "Lme/oriient/ipssdk/api/models/IPSGlobalCoordinate;", "seen1", "", h.a.b, "", h.a.c, "altitude", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDDDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(DDD)V", "computeDistance", "lat1", "lon1", "lat2", "lon2", "distanceTo", "coordinate", "equals", "", "other", "", "getAltitude", "getLatitude", "getLongitude", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes2.dex */
public class WorldCoordinate implements IPSGlobalCoordinate {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final double altitude;
    private final double latitude;
    private final double longitude;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/ipssdk/common/utils/models/WorldCoordinate$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/ipssdk/common/utils/models/WorldCoordinate;", "serializer", "()Lkotlinx/serialization/KSerializer;", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final KSerializer<WorldCoordinate> serializer() {
            return WorldCoordinate$$serializer.INSTANCE;
        }
    }

    public WorldCoordinate(double d, double d2, double d3) {
        this.latitude = d;
        this.longitude = d2;
        this.altitude = d3;
    }

    private final double computeDistance(double lat1, double lon1, double lat2, double lon2) {
        double d = (0.017453292519943295d * lon2) - (lon1 * 0.017453292519943295d);
        double dAtan = Math.atan(Math.tan(lat1 * 0.017453292519943295d) * 0.996647189328169d);
        double dAtan2 = Math.atan(Math.tan(lat2 * 0.017453292519943295d) * 0.996647189328169d);
        double dCos = Math.cos(dAtan);
        double dCos2 = Math.cos(dAtan2);
        double dSin = Math.sin(dAtan);
        double dSin2 = Math.sin(dAtan2);
        double d2 = dCos * dCos2;
        double d3 = dSin * dSin2;
        int i = 0;
        double d4 = 0.0d;
        double dAtan22 = 0.0d;
        double d5 = 0.0d;
        double d6 = d;
        while (true) {
            if (i >= 20) {
                break;
            }
            double dCos3 = Math.cos(d6);
            double dSin3 = Math.sin(d6);
            double d7 = dCos2 * dSin3;
            double d8 = (dCos * dSin2) - ((dSin * dCos2) * dCos3);
            double dSqrt = Math.sqrt((d8 * d8) + (d7 * d7));
            double d9 = dSin;
            double d10 = (d2 * dCos3) + d3;
            dAtan22 = Math.atan2(dSqrt, d10);
            double d11 = dSqrt == 0.0d ? 0.0d : (dSin3 * d2) / dSqrt;
            double d12 = 1.0d - (d11 * d11);
            double d13 = d12 == 0.0d ? 0.0d : d10 - ((d3 * 2.0d) / d12);
            double d14 = 0.006739496756586903d * d12;
            double d15 = ((((((320.0d - (175.0d * d14)) * d14) - 768) * d14) + 4096.0d) * (d14 / 16384.0d)) + 1;
            double d16 = (((((74.0d - (47.0d * d14)) * d14) - 128.0d) * d14) + 256.0d) * (d14 / 1024.0d);
            double d17 = (((4.0d - (d12 * 3.0d)) * 0.0033528106718309896d) + 4.0d) * 2.0955066698943685E-4d * d12;
            double d18 = d13 * d13;
            double d19 = ((((((d18 * 2.0d) - 1.0d) * d10) - (((d18 * 4.0d) - 3.0d) * ((((dSqrt * 4.0d) * dSqrt) - 3.0d) * ((d16 / 6.0d) * d13)))) * (d16 / 4.0d)) + d13) * d16 * dSqrt;
            double d20 = ((((((((2.0d * d13) * d13) - 1.0d) * d17 * d10) + d13) * d17 * dSqrt) + dAtan22) * (1.0d - d17) * 0.0033528106718309896d * d11) + d;
            if (Math.abs((d20 - d6) / d20) < 1.0E-12d) {
                d4 = d15;
                d5 = d19;
                break;
            }
            i++;
            dSin = d9;
            d4 = d15;
            d6 = d20;
            d5 = d19;
        }
        return (dAtan22 - d5) * 6356752.3142d * d4;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(WorldCoordinate self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.G(serialDesc, 0, self.latitude);
        output.G(serialDesc, 1, self.longitude);
        output.G(serialDesc, 2, self.altitude);
    }

    public final double distanceTo(double latitude, double longitude) {
        return computeDistance(this.latitude, this.longitude, latitude, longitude);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!getClass().equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.f(other, "null cannot be cast to non-null type me.oriient.ipssdk.common.utils.models.WorldCoordinate");
        WorldCoordinate worldCoordinate = (WorldCoordinate) other;
        return this.latitude == worldCoordinate.latitude && this.longitude == worldCoordinate.longitude && this.altitude == worldCoordinate.altitude;
    }

    @Override // me.oriient.ipssdk.api.models.IPSGlobalCoordinate
    public double getAltitude() {
        return this.altitude;
    }

    @Override // me.oriient.ipssdk.api.models.IPSGlobalCoordinate
    public double getLatitude() {
        return this.latitude;
    }

    @Override // me.oriient.ipssdk.api.models.IPSGlobalCoordinate
    public double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        return Double.hashCode(this.altitude) + a.a(this.longitude, Double.hashCode(this.latitude) * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("WorldCoordinate(latitude=");
        sb.append(this.latitude);
        sb.append(", longitude=");
        sb.append(this.longitude);
        sb.append(", altitude=");
        return b.p(sb, this.altitude, ')');
    }

    public final double distanceTo(@NotNull IPSGlobalCoordinate coordinate) {
        Intrinsics.h(coordinate, "coordinate");
        return computeDistance(this.latitude, this.longitude, coordinate.getLatitude(), coordinate.getLongitude());
    }

    @Deprecated
    public /* synthetic */ WorldCoordinate(int i, double d, double d2, double d3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.a(i, 7, WorldCoordinate$$serializer.INSTANCE.getB());
            throw null;
        }
        this.latitude = d;
        this.longitude = d2;
        this.altitude = d3;
    }
}
