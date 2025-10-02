package me.oriient.ipssdk.realtime.services.tag.model;

import android.support.v4.media.session.a;
import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u0000  2\u00020\u0001:\u0001 B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006!"}, d2 = {"Lme/oriient/ipssdk/realtime/services/tag/model/EventTagPosition;", "Ljava/io/Serializable;", "x", "", "y", "z", "accuracy", "lockProgress", "travelDistance", "(DDDDDD)V", "getAccuracy", "()D", "getLockProgress", "getTravelDistance", "getX", "getY", "getZ", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class EventTagPosition implements Serializable {
    private static final long serialVersionUID = 1;
    private final double accuracy;
    private final double lockProgress;
    private final double travelDistance;
    private final double x;
    private final double y;
    private final double z;

    public EventTagPosition(double d, double d2, double d3, double d4, double d5, double d6) {
        this.x = d;
        this.y = d2;
        this.z = d3;
        this.accuracy = d4;
        this.lockProgress = d5;
        this.travelDistance = d6;
    }

    public static /* synthetic */ EventTagPosition copy$default(EventTagPosition eventTagPosition, double d, double d2, double d3, double d4, double d5, double d6, int i, Object obj) {
        if ((i & 1) != 0) {
            d = eventTagPosition.x;
        }
        return eventTagPosition.copy(d, (i & 2) != 0 ? eventTagPosition.y : d2, (i & 4) != 0 ? eventTagPosition.z : d3, (i & 8) != 0 ? eventTagPosition.accuracy : d4, (i & 16) != 0 ? eventTagPosition.lockProgress : d5, (i & 32) != 0 ? eventTagPosition.travelDistance : d6);
    }

    /* renamed from: component1, reason: from getter */
    public final double getX() {
        return this.x;
    }

    /* renamed from: component2, reason: from getter */
    public final double getY() {
        return this.y;
    }

    /* renamed from: component3, reason: from getter */
    public final double getZ() {
        return this.z;
    }

    /* renamed from: component4, reason: from getter */
    public final double getAccuracy() {
        return this.accuracy;
    }

    /* renamed from: component5, reason: from getter */
    public final double getLockProgress() {
        return this.lockProgress;
    }

    /* renamed from: component6, reason: from getter */
    public final double getTravelDistance() {
        return this.travelDistance;
    }

    @NotNull
    public final EventTagPosition copy(double x, double y, double z, double accuracy, double lockProgress, double travelDistance) {
        return new EventTagPosition(x, y, z, accuracy, lockProgress, travelDistance);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventTagPosition)) {
            return false;
        }
        EventTagPosition eventTagPosition = (EventTagPosition) other;
        return Double.compare(this.x, eventTagPosition.x) == 0 && Double.compare(this.y, eventTagPosition.y) == 0 && Double.compare(this.z, eventTagPosition.z) == 0 && Double.compare(this.accuracy, eventTagPosition.accuracy) == 0 && Double.compare(this.lockProgress, eventTagPosition.lockProgress) == 0 && Double.compare(this.travelDistance, eventTagPosition.travelDistance) == 0;
    }

    public final double getAccuracy() {
        return this.accuracy;
    }

    public final double getLockProgress() {
        return this.lockProgress;
    }

    public final double getTravelDistance() {
        return this.travelDistance;
    }

    public final double getX() {
        return this.x;
    }

    public final double getY() {
        return this.y;
    }

    public final double getZ() {
        return this.z;
    }

    public int hashCode() {
        return Double.hashCode(this.travelDistance) + a.a(this.lockProgress, a.a(this.accuracy, a.a(this.z, a.a(this.y, Double.hashCode(this.x) * 31, 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("EventTagPosition(x=");
        sb.append(this.x);
        sb.append(", y=");
        sb.append(this.y);
        sb.append(", z=");
        sb.append(this.z);
        sb.append(", accuracy=");
        sb.append(this.accuracy);
        sb.append(", lockProgress=");
        sb.append(this.lockProgress);
        sb.append(", travelDistance=");
        return b.p(sb, this.travelDistance, ')');
    }
}
