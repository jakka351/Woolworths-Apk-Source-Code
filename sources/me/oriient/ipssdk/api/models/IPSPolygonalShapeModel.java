package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lme/oriient/ipssdk/api/models/IPSPolygonalShapeModel;", "Lme/oriient/ipssdk/api/models/IPSPolygonalShape;", "points", "", "Lme/oriient/ipssdk/api/models/IPSCoordinate;", "(Ljava/util/List;)V", "bottomLeft", "topRight", "getBottomLeft", "getCenter", "getPoints", "", "getTopRight", "getType", "", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class IPSPolygonalShapeModel implements IPSPolygonalShape {

    @NotNull
    private final IPSCoordinate bottomLeft;

    @NotNull
    private final List<IPSCoordinate> points;

    @NotNull
    private final IPSCoordinate topRight;

    /* JADX WARN: Multi-variable type inference failed */
    public IPSPolygonalShapeModel(@NotNull List<? extends IPSCoordinate> points) {
        Intrinsics.h(points, "points");
        this.points = points;
        double dMax = Double.MIN_VALUE;
        double dMax2 = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        double dMin2 = Double.MAX_VALUE;
        for (IPSCoordinate iPSCoordinate : points) {
            dMax = Math.max(dMax, iPSCoordinate.getD());
            dMin = Math.min(dMin, iPSCoordinate.getD());
            dMax2 = Math.max(dMax2, iPSCoordinate.getE());
            dMin2 = Math.min(dMin2, iPSCoordinate.getE());
        }
        this.bottomLeft = new IPSCoordinateModel(dMin, dMin2, 0.0d, 4, null);
        this.topRight = new IPSCoordinateModel(dMax, dMax2, 0.0d, 4, null);
    }

    @Override // me.oriient.ipssdk.api.models.IPSPolygonalShape
    @NotNull
    public IPSCoordinate getBottomLeft() {
        return this.bottomLeft;
    }

    @Override // me.oriient.ipssdk.api.models.IPSShape
    @NotNull
    public IPSCoordinate getCenter() {
        double d = 2;
        return new IPSCoordinateModel(this.topRight.getD() - ((this.topRight.getD() - this.bottomLeft.getD()) / d), this.topRight.getE() - ((this.topRight.getE() - this.bottomLeft.getE()) / d), 0.0d);
    }

    @Override // me.oriient.ipssdk.api.models.IPSPolygonalShape
    @NotNull
    public List<IPSCoordinate> getPoints() {
        return CollectionsKt.J0(this.points);
    }

    @Override // me.oriient.ipssdk.api.models.IPSPolygonalShape
    @NotNull
    public IPSCoordinate getTopRight() {
        return this.topRight;
    }

    @Override // me.oriient.ipssdk.api.models.IPSShape
    public int getType() {
        return 2;
    }
}
