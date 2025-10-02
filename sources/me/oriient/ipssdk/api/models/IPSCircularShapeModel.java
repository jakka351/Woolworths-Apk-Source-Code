package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lme/oriient/ipssdk/api/models/IPSCircularShapeModel;", "Lme/oriient/ipssdk/api/models/IPSCircularShape;", "center", "Lme/oriient/ipssdk/api/models/IPSCoordinate;", "radiusMeters", "", "(Lme/oriient/ipssdk/api/models/IPSCoordinate;D)V", "getCenter", "getRadiusMeters", "getType", "", "getX", "getY", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IPSCircularShapeModel implements IPSCircularShape {

    @NotNull
    private final IPSCoordinate center;
    private final double radiusMeters;

    public IPSCircularShapeModel(@NotNull IPSCoordinate center, double d) {
        Intrinsics.h(center, "center");
        this.center = center;
        this.radiusMeters = d;
    }

    @Override // me.oriient.ipssdk.api.models.IPSShape
    @NotNull
    public IPSCoordinate getCenter() {
        return this.center;
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
        return this.center.getF26194a();
    }

    @Override // me.oriient.ipssdk.api.models.IPSCircularShape
    public double getY() {
        return this.center.getB();
    }
}
