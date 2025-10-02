package me.oriient.ipssdk.realtime.ips;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.api.models.IPSCoordinateInBuilding;
import me.oriient.ipssdk.api.models.IPSTurn;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/SdkTurn;", "Lme/oriient/ipssdk/api/models/IPSTurn;", "", "id", "Lme/oriient/ipssdk/api/models/IPSCoordinateInBuilding;", "coordinate", "", "direction", "<init>", "(Ljava/lang/String;Lme/oriient/ipssdk/api/models/IPSCoordinateInBuilding;I)V", "getCoordinate", "()Lme/oriient/ipssdk/api/models/IPSCoordinateInBuilding;", "getDirection", "()I", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SdkTurn implements IPSTurn {

    /* renamed from: a, reason: collision with root package name */
    private final IPSCoordinateInBuilding f25862a;
    private final int b;

    public SdkTurn(@NotNull String id, @NotNull IPSCoordinateInBuilding coordinate, int i) {
        Intrinsics.h(id, "id");
        Intrinsics.h(coordinate, "coordinate");
        this.f25862a = coordinate;
        this.b = i;
    }

    @Override // me.oriient.ipssdk.api.models.IPSTurn
    @NotNull
    /* renamed from: getCoordinate, reason: from getter */
    public IPSCoordinateInBuilding getF25862a() {
        return this.f25862a;
    }

    @Override // me.oriient.ipssdk.api.models.IPSTurn
    /* renamed from: getDirection, reason: from getter */
    public int getB() {
        return this.b;
    }
}
