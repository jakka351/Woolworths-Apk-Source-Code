package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lme/oriient/ipssdk/api/models/IPSRectangularShapeModel;", "Lme/oriient/ipssdk/api/models/IPSRectangularShape;", "topRight", "Lme/oriient/ipssdk/api/models/IPSCoordinate;", "bottomLeft", "(Lme/oriient/ipssdk/api/models/IPSCoordinate;Lme/oriient/ipssdk/api/models/IPSCoordinate;)V", "getBottomLeft", "getCenter", "getTopRight", "getType", "", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IPSRectangularShapeModel implements IPSRectangularShape {

    @NotNull
    private final IPSCoordinate bottomLeft;

    @NotNull
    private final IPSCoordinate topRight;

    public IPSRectangularShapeModel(@NotNull IPSCoordinate topRight, @NotNull IPSCoordinate bottomLeft) {
        Intrinsics.h(topRight, "topRight");
        Intrinsics.h(bottomLeft, "bottomLeft");
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
    }

    @Override // me.oriient.ipssdk.api.models.IPSRectangularShape
    @NotNull
    public IPSCoordinate getBottomLeft() {
        return this.bottomLeft;
    }

    @Override // me.oriient.ipssdk.api.models.IPSShape
    @NotNull
    public IPSCoordinate getCenter() {
        double d = 2;
        return new IPSCoordinateModel(this.topRight.getX() - ((this.topRight.getX() - this.bottomLeft.getX()) / d), this.topRight.getY() - ((this.topRight.getY() - this.bottomLeft.getY()) / d), 0.0d);
    }

    @Override // me.oriient.ipssdk.api.models.IPSRectangularShape
    @NotNull
    public IPSCoordinate getTopRight() {
        return this.topRight;
    }

    @Override // me.oriient.ipssdk.api.models.IPSShape
    public int getType() {
        return 0;
    }
}
