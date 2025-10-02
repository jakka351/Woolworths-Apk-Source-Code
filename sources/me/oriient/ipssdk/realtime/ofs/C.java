package me.oriient.ipssdk.realtime.ofs;

import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.geofence.models.GeofenceBuilding;
import me.oriient.ipssdk.base.utils.SdkError;

/* loaded from: classes8.dex */
public final class C extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SdkError f25918a;
    public final /* synthetic */ GeofenceBuilding b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(SdkError sdkError, GeofenceBuilding geofenceBuilding) {
        super(0);
        this.f25918a = sdkError;
        this.b = geofenceBuilding;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MapsKt.j(new Pair("errorMessage", this.f25918a.getMessage()), new Pair("buildingId", this.b.getId()));
    }
}
