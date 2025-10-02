package me.oriient.ipssdk.realtime.utils.models;

import androidx.camera.core.impl.b;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.api.models.IPSCoordinate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lme/oriient/ipssdk/realtime/utils/models/Coordinate;", "Lme/oriient/ipssdk/api/models/IPSCoordinate;", "", "x", "y", "z", "<init>", "(DDD)V", "(DD)V", "coordinate", "(Lme/oriient/ipssdk/api/models/IPSCoordinate;)V", "getX", "()D", "getY", "getZ", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public class Coordinate implements IPSCoordinate {

    /* renamed from: a, reason: collision with root package name */
    private final double f26194a;
    private final double b;
    private final double c;

    public Coordinate(double d, double d2, double d3) {
        this.f26194a = d;
        this.b = d2;
        this.c = d3;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && getClass().equals(other.getClass())) {
            Coordinate coordinate = (Coordinate) other;
            if (Double.compare(coordinate.f26194a, this.f26194a) == 0 && Double.compare(coordinate.b, this.b) == 0 && Double.compare(coordinate.c, this.c) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinate
    /* renamed from: getX, reason: from getter */
    public double getF26194a() {
        return this.f26194a;
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinate
    /* renamed from: getY, reason: from getter */
    public double getB() {
        return this.b;
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinate
    /* renamed from: getZ, reason: from getter */
    public double getC() {
        return this.c;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.f26194a), Double.valueOf(this.b), Double.valueOf(this.c));
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Coordinate{x=");
        sb.append(this.f26194a);
        sb.append(", y=");
        sb.append(this.b);
        sb.append(", z=");
        return b.p(sb, this.c, '}');
    }

    public Coordinate(double d, double d2) {
        this(d, d2, 0.0d);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Coordinate(@NotNull IPSCoordinate coordinate) {
        this(coordinate.getF26194a(), coordinate.getB(), coordinate.getC());
        Intrinsics.h(coordinate, "coordinate");
    }
}
