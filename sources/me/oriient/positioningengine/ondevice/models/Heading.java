package me.oriient.positioningengine.ondevice.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lme/oriient/positioningengine/ondevice/models/Heading;", "", "angleRadians", "", "(F)V", "x", "y", "(FF)V", "angle", "", "getAngle", "()D", "getX", "()F", "getY", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Heading {
    private final float x;
    private final float y;

    public Heading(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    public static /* synthetic */ Heading copy$default(Heading heading, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = heading.x;
        }
        if ((i & 2) != 0) {
            f2 = heading.y;
        }
        return heading.copy(f, f2);
    }

    /* renamed from: component1, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* renamed from: component2, reason: from getter */
    public final float getY() {
        return this.y;
    }

    @NotNull
    public final Heading copy(float x, float y) {
        return new Heading(x, y);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Heading)) {
            return false;
        }
        Heading heading = (Heading) other;
        return Float.compare(this.x, heading.x) == 0 && Float.compare(this.y, heading.y) == 0;
    }

    public final double getAngle() {
        return Math.toDegrees(Math.atan2(this.y, this.x));
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public int hashCode() {
        return Float.hashCode(this.y) + (Float.hashCode(this.x) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Heading(x=");
        sb.append(this.x);
        sb.append(", y=");
        return android.support.v4.media.session.a.r(sb, this.y, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Heading(float f) {
        double d = f;
        this((float) Math.cos(d), (float) Math.sin(d));
    }
}
