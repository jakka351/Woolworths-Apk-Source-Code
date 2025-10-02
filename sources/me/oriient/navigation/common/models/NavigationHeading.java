package me.oriient.navigation.common.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lme/oriient/navigation/common/models/NavigationHeading;", "", "x", "", "y", "(DD)V", "angleDegrees", "getAngleDegrees", "()D", "getX", "getY", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class NavigationHeading {
    private final double angleDegrees;
    private final double x;
    private final double y;

    public NavigationHeading(double d, double d2) {
        this.x = d;
        this.y = d2;
        this.angleDegrees = Math.toDegrees(Math.atan2(d2, d));
    }

    public static /* synthetic */ NavigationHeading copy$default(NavigationHeading navigationHeading, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = navigationHeading.x;
        }
        if ((i & 2) != 0) {
            d2 = navigationHeading.y;
        }
        return navigationHeading.copy(d, d2);
    }

    /* renamed from: component1, reason: from getter */
    public final double getX() {
        return this.x;
    }

    /* renamed from: component2, reason: from getter */
    public final double getY() {
        return this.y;
    }

    @NotNull
    public final NavigationHeading copy(double x, double y) {
        return new NavigationHeading(x, y);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationHeading)) {
            return false;
        }
        NavigationHeading navigationHeading = (NavigationHeading) other;
        return Double.compare(this.x, navigationHeading.x) == 0 && Double.compare(this.y, navigationHeading.y) == 0;
    }

    public final double getAngleDegrees() {
        return this.angleDegrees;
    }

    public final double getX() {
        return this.x;
    }

    public final double getY() {
        return this.y;
    }

    public int hashCode() {
        return Double.hashCode(this.y) + (Double.hashCode(this.x) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("NavigationHeading(x=");
        sb.append(this.x);
        sb.append(", y=");
        return androidx.camera.core.impl.b.p(sb, this.y, ')');
    }
}
