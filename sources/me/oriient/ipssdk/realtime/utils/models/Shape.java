package me.oriient.ipssdk.realtime.utils.models;

import kotlin.Metadata;
import me.oriient.ipssdk.api.models.IPSShape;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH&J\b\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lme/oriient/ipssdk/realtime/utils/models/Shape;", "Lme/oriient/ipssdk/api/models/IPSShape;", "()V", "getCenter", "Lme/oriient/ipssdk/realtime/utils/models/Coordinate;", "isInside", "", "x", "", "y", "toString", "", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class Shape implements IPSShape {
    @Override // me.oriient.ipssdk.api.models.IPSShape
    @NotNull
    public abstract Coordinate getCenter();

    public abstract boolean isInside(double x, double y);

    @NotNull
    public abstract String toString();
}
