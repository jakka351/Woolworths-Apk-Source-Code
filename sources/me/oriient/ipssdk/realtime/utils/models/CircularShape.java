package me.oriient.ipssdk.realtime.utils.models;

import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.api.models.IPSCircularShape;
import me.oriient.ipssdk.api.models.IPSCoordinate;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007B\u0015\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lme/oriient/ipssdk/realtime/utils/models/CircularShape;", "Lme/oriient/ipssdk/realtime/utils/models/Shape;", "Lme/oriient/ipssdk/api/models/IPSCircularShape;", "x", "", "y", "radiusMeters", "(DDD)V", "center", "Lme/oriient/ipssdk/realtime/utils/models/Coordinate;", "(Lme/oriient/ipssdk/realtime/utils/models/Coordinate;D)V", "getCenter", "getRadiusMeters", "getType", "", "getX", "getY", "isInside", "", "toString", "", "Companion", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CircularShape extends Shape implements IPSCircularShape {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "CircularShape";

    @NotNull
    private final Coordinate center;
    private final double radiusMeters;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lme/oriient/ipssdk/realtime/utils/models/CircularShape$Companion;", "", "Lme/oriient/ipssdk/api/models/IPSCoordinate;", "center", "", "radiusMeters", "x", "y", "", "isPointInsideCircle", "(Lme/oriient/ipssdk/api/models/IPSCoordinate;DDD)Z", "", "TAG", "Ljava/lang/String;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final boolean isPointInsideCircle(@NotNull IPSCoordinate center, double radiusMeters, double x, double y) {
            Intrinsics.h(center, "center");
            return Math.sqrt(Math.pow(y - center.getE(), 2.0d) + Math.pow(x - center.getD(), 2.0d)) < radiusMeters;
        }
    }

    public CircularShape(@NotNull Coordinate center, double d) {
        Intrinsics.h(center, "center");
        this.center = center;
        this.radiusMeters = d;
    }

    @Override // me.oriient.ipssdk.api.models.IPSCircularShape
    public double getRadiusMeters() {
        return this.radiusMeters;
    }

    @Override // me.oriient.ipssdk.api.models.IPSShape
    public int getType() {
        return 1;
    }

    @Override // me.oriient.ipssdk.api.models.IPSCircularShape
    public double getX() {
        return this.center.getD();
    }

    @Override // me.oriient.ipssdk.api.models.IPSCircularShape
    public double getY() {
        return this.center.getE();
    }

    @Override // me.oriient.ipssdk.realtime.utils.models.Shape
    public boolean isInside(double x, double y) {
        return INSTANCE.isPointInsideCircle(this.center, this.radiusMeters, x, y);
    }

    @Override // me.oriient.ipssdk.realtime.utils.models.Shape
    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("CircularShape{center=");
        sb.append(this.center);
        sb.append(", radiusMeters=");
        return b.p(sb, this.radiusMeters, '}');
    }

    @Override // me.oriient.ipssdk.api.models.IPSShape
    @NotNull
    public Coordinate getCenter() {
        return this.center;
    }

    public CircularShape(double d, double d2, double d3) {
        this(new Coordinate(d, d2), d3);
    }
}
