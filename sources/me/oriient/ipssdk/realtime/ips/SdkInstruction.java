package me.oriient.ipssdk.realtime.ips;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.api.models.IPSNavigationInstruction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\tJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/SdkInstruction;", "Lme/oriient/ipssdk/api/models/IPSNavigationInstruction;", "", "direction", "", "distance", "<init>", "(ILjava/lang/Double;)V", "getDirection", "()I", "getDistance", "()Ljava/lang/Double;", "copy", "(ILjava/lang/Double;)Lme/oriient/ipssdk/realtime/ips/SdkInstruction;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SdkInstruction implements IPSNavigationInstruction {

    /* renamed from: a, reason: collision with root package name */
    private final int f25859a;
    private final Double b;

    public SdkInstruction(int i, @Nullable Double d) {
        this.f25859a = i;
        this.b = d;
    }

    public static /* synthetic */ SdkInstruction copy$default(SdkInstruction sdkInstruction, int i, Double d, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = sdkInstruction.f25859a;
        }
        if ((i2 & 2) != 0) {
            d = sdkInstruction.b;
        }
        return sdkInstruction.copy(i, d);
    }

    @NotNull
    public final SdkInstruction copy(int direction, @Nullable Double distance) {
        return new SdkInstruction(direction, distance);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SdkInstruction)) {
            return false;
        }
        SdkInstruction sdkInstruction = (SdkInstruction) other;
        return this.f25859a == sdkInstruction.f25859a && Intrinsics.c(this.b, sdkInstruction.b);
    }

    @Override // me.oriient.ipssdk.api.models.IPSNavigationInstruction
    /* renamed from: getDirection, reason: from getter */
    public int getF25859a() {
        return this.f25859a;
    }

    @Override // me.oriient.ipssdk.api.models.IPSNavigationInstruction
    @Nullable
    /* renamed from: getDistance, reason: from getter */
    public Double getB() {
        return this.b;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f25859a) * 31;
        Double d = this.b;
        return iHashCode + (d == null ? 0 : d.hashCode());
    }

    @NotNull
    public String toString() {
        return "SdkInstruction(direction=" + this.f25859a + ", distance=" + this.b + ')';
    }
}
