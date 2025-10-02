package me.oriient.ipssdk.realtime.utils.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.api.models.IPSCoordinate;
import me.oriient.ipssdk.api.models.IPSRectangularShape;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0018B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u000fJ\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lme/oriient/ipssdk/realtime/utils/models/RectangularShape;", "Lme/oriient/ipssdk/realtime/utils/models/Shape;", "Lme/oriient/ipssdk/api/models/IPSRectangularShape;", "Lme/oriient/ipssdk/realtime/utils/models/Coordinate;", "topRight", "bottomLeft", "<init>", "(Lme/oriient/ipssdk/realtime/utils/models/Coordinate;Lme/oriient/ipssdk/realtime/utils/models/Coordinate;)V", "", "x", "y", "", "isInside", "(DD)Z", "getCenter", "()Lme/oriient/ipssdk/realtime/utils/models/Coordinate;", "", "getType", "()I", "getTopRight", "getBottomLeft", "", "toString", "()Ljava/lang/String;", "Companion", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RectangularShape extends Shape implements IPSRectangularShape {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final Coordinate f26201a;
    private final Coordinate b;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lme/oriient/ipssdk/realtime/utils/models/RectangularShape$Companion;", "", "Lme/oriient/ipssdk/api/models/IPSCoordinate;", "topRight", "bottomLeft", "", "x", "y", "", "isPointInsideRectangle", "(Lme/oriient/ipssdk/api/models/IPSCoordinate;Lme/oriient/ipssdk/api/models/IPSCoordinate;DD)Z", "", "TAG", "Ljava/lang/String;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final boolean isPointInsideRectangle(@NotNull IPSCoordinate topRight, @NotNull IPSCoordinate bottomLeft, double x, double y) {
            Intrinsics.h(topRight, "topRight");
            Intrinsics.h(bottomLeft, "bottomLeft");
            return x > bottomLeft.getX() && x < topRight.getX() && y > bottomLeft.getY() && y < topRight.getY();
        }
    }

    public RectangularShape(@NotNull Coordinate topRight, @NotNull Coordinate bottomLeft) {
        Intrinsics.h(topRight, "topRight");
        Intrinsics.h(bottomLeft, "bottomLeft");
        this.f26201a = topRight;
        this.b = bottomLeft;
    }

    @Override // me.oriient.ipssdk.api.models.IPSShape
    public int getType() {
        return 0;
    }

    @Override // me.oriient.ipssdk.realtime.utils.models.Shape
    public boolean isInside(double x, double y) {
        return INSTANCE.isPointInsideRectangle(this.f26201a, this.b, x, y);
    }

    @Override // me.oriient.ipssdk.realtime.utils.models.Shape
    @NotNull
    public String toString() {
        return "RectangularShape{topRight=" + this.f26201a + ", bottomLeft=" + this.b + '}';
    }

    @Override // me.oriient.ipssdk.api.models.IPSRectangularShape
    @NotNull
    /* renamed from: getBottomLeft, reason: from getter */
    public Coordinate getB() {
        return this.b;
    }

    @Override // me.oriient.ipssdk.api.models.IPSShape
    @NotNull
    public Coordinate getCenter() {
        double d = 2;
        return new Coordinate(this.f26201a.getX() - ((this.f26201a.getX() - this.b.getX()) / d), this.f26201a.getY() - ((this.f26201a.getY() - this.b.getY()) / d), 0.0d);
    }

    @Override // me.oriient.ipssdk.api.models.IPSRectangularShape
    @NotNull
    /* renamed from: getTopRight, reason: from getter */
    public Coordinate getF26201a() {
        return this.f26201a;
    }
}
