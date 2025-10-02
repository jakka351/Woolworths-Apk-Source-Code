package me.oriient.ipssdk.realtime.utils.models;

import androidx.camera.core.impl.b;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.api.models.IPSHeading;
import me.oriient.positioningengine.ondevice.models.MainOrientation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tB!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\nB\u0011\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\fB\u0011\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\r¢\u0006\u0004\b\u0007\u0010\u000eB\u0011\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0007\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lme/oriient/ipssdk/realtime/utils/models/Heading;", "Lme/oriient/ipssdk/api/models/IPSHeading;", "", "x", "y", "z", "angle", "<init>", "(DDDD)V", "(DD)V", "(DDD)V", "heading", "(Lme/oriient/ipssdk/api/models/IPSHeading;)V", "Lme/oriient/positioningengine/ondevice/models/Heading;", "(Lme/oriient/positioningengine/ondevice/models/Heading;)V", "Lme/oriient/positioningengine/ondevice/models/MainOrientation;", "mainOrientation", "(Lme/oriient/positioningengine/ondevice/models/MainOrientation;)V", "getAngle", "()D", "getX", "getY", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Heading implements IPSHeading {

    /* renamed from: a, reason: collision with root package name */
    private final double f26195a;
    private final double b;
    private final double c;
    private final double d;

    public Heading(double d, double d2, double d3, double d4) {
        this.f26195a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && Heading.class.equals(other.getClass())) {
            Heading heading = (Heading) other;
            if (Double.compare(heading.f26195a, this.f26195a) == 0 && Double.compare(heading.b, this.b) == 0 && Double.compare(heading.c, this.c) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // me.oriient.ipssdk.api.models.IPSHeading
    /* renamed from: getAngle, reason: from getter */
    public double getD() {
        return this.d;
    }

    @Override // me.oriient.ipssdk.api.models.IPSHeading
    /* renamed from: getX, reason: from getter */
    public double getF26195a() {
        return this.f26195a;
    }

    @Override // me.oriient.ipssdk.api.models.IPSHeading
    /* renamed from: getY, reason: from getter */
    public double getB() {
        return this.b;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.f26195a), Double.valueOf(this.b), Double.valueOf(this.c));
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Heading{x=");
        sb.append(this.f26195a);
        sb.append(", y=");
        sb.append(this.b);
        sb.append(", angle=");
        return b.p(sb, this.d, '}');
    }

    public Heading(double d, double d2) {
        this(d, d2, 0.0d);
    }

    public Heading(double d, double d2, double d3) {
        this(d, d2, d3, Math.toDegrees(Math.atan2(d2, d)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Heading(@NotNull IPSHeading heading) {
        this(heading.getF26195a(), heading.getB(), 0.0d, heading.getD());
        Intrinsics.h(heading, "heading");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Heading(@NotNull me.oriient.positioningengine.ondevice.models.Heading heading) {
        this(heading.getX(), heading.getY(), 0.0d);
        Intrinsics.h(heading, "heading");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Heading(@NotNull MainOrientation mainOrientation) {
        this(mainOrientation.getX(), mainOrientation.getY(), 0.0d);
        Intrinsics.h(mainOrientation, "mainOrientation");
    }
}
