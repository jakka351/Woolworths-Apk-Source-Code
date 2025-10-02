package me.oriient.ipssdk.realtime.utils.models;

import androidx.compose.ui.input.pointer.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import me.oriient.ipssdk.api.models.IPSCoordinate;
import me.oriient.ipssdk.api.models.IPSPolygonalShape;
import me.oriient.ipssdk.realtime.ips.BuildingExtKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lme/oriient/ipssdk/realtime/utils/models/PolygonalShape;", "Lme/oriient/ipssdk/realtime/utils/models/Shape;", "Lme/oriient/ipssdk/api/models/IPSPolygonalShape;", "", "Lme/oriient/ipssdk/realtime/utils/models/Coordinate;", "points", "<init>", "(Ljava/util/List;)V", "", "x", "y", "", "isInside", "(DD)Z", "getCenter", "()Lme/oriient/ipssdk/realtime/utils/models/Coordinate;", "", "getType", "()I", "Lme/oriient/ipssdk/api/models/IPSCoordinate;", "getTopRight", "()Lme/oriient/ipssdk/api/models/IPSCoordinate;", "getBottomLeft", "getPoints", "()Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class PolygonalShape extends Shape implements IPSPolygonalShape {

    /* renamed from: a, reason: collision with root package name */
    private final List f26198a;
    private final Coordinate b;
    private final Coordinate c;

    public PolygonalShape(@NotNull List<? extends Coordinate> points) {
        Intrinsics.h(points, "points");
        this.f26198a = points;
        double dMax = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        double dMin2 = Double.MAX_VALUE;
        double dMax2 = Double.MIN_VALUE;
        for (Coordinate coordinate : points) {
            dMax = Math.max(dMax, coordinate.getX());
            dMin = Math.min(dMin, coordinate.getX());
            dMax2 = Math.max(dMax2, coordinate.getY());
            dMin2 = Math.min(dMin2, coordinate.getY());
        }
        this.b = new Coordinate(dMin, dMin2);
        this.c = new Coordinate(dMax, dMax2);
    }

    @Override // me.oriient.ipssdk.api.models.IPSPolygonalShape
    @NotNull
    public IPSCoordinate getBottomLeft() {
        return this.b;
    }

    @Override // me.oriient.ipssdk.api.models.IPSPolygonalShape
    @NotNull
    public List<Coordinate> getPoints() {
        return CollectionsKt.G0(this.f26198a);
    }

    @Override // me.oriient.ipssdk.api.models.IPSPolygonalShape
    @NotNull
    public IPSCoordinate getTopRight() {
        return this.c;
    }

    @Override // me.oriient.ipssdk.api.models.IPSShape
    public int getType() {
        return 2;
    }

    @Override // me.oriient.ipssdk.realtime.utils.models.Shape
    public boolean isInside(double x, double y) {
        IndoorCoordinate indoorCoordinate = new IndoorCoordinate(x, y, 0.0d, 4, (DefaultConstructorMarker) null);
        List list = this.f26198a;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(BuildingExtKt.toIndoorCoordinate((Coordinate) it.next()));
        }
        return IndoorCoordinate.isPointInsidePolygon$default(indoorCoordinate, arrayList, false, 0.0d, 6, null);
    }

    @Override // me.oriient.ipssdk.realtime.utils.models.Shape
    @NotNull
    public String toString() {
        return a.o(new StringBuilder("PolygonalShape{points="), this.f26198a, '}');
    }

    @Override // me.oriient.ipssdk.api.models.IPSShape
    @NotNull
    public Coordinate getCenter() {
        double d = 2;
        return new Coordinate(this.c.getX() - ((this.c.getX() - this.b.getX()) / d), this.c.getY() - ((this.c.getY() - this.b.getY()) / d), 0.0d);
    }
}
