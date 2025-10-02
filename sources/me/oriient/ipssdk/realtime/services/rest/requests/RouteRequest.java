package me.oriient.ipssdk.realtime.services.rest.requests;

import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.Transient;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import me.oriient.ipssdk.api.models.IPSWaypoint;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 $2\u00020\u0001:\u0002#$B7\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u001f\b\u0000\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u001aH\u0016J&\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!HÁ\u0001¢\u0006\u0002\b\"R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lme/oriient/ipssdk/realtime/services/rest/requests/RouteRequest;", "", "seen1", "", "isAccessibleOnly", "", "waypoints", "", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "ipsWayPoints", "", "Lme/oriient/ipssdk/api/models/IPSWaypoint;", "(Ljava/util/List;Z)V", "getIpsWayPoints$annotations", "()V", "()Z", "setAccessibleOnly", "(Z)V", "getWaypoints", "()Ljava/util/List;", "setWaypoints", "(Ljava/util/List;)V", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$me_oriient_sdk_realtime", "$serializer", "Companion", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class RouteRequest {

    @NotNull
    private final List<IPSWaypoint> ipsWayPoints;
    private boolean isAccessibleOnly;

    @NotNull
    private List<List<Double>> waypoints;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(new ArrayListSerializer(DoubleSerializer.f24792a))};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/ipssdk/realtime/services/rest/requests/RouteRequest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/ipssdk/realtime/services/rest/requests/RouteRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final KSerializer<RouteRequest> serializer() {
            return RouteRequest$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ RouteRequest(int i, boolean z, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.a(i, 1, RouteRequest$$serializer.INSTANCE.getB());
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        this.ipsWayPoints = arrayList;
        this.isAccessibleOnly = z;
        if ((i & 2) == 0) {
            this.waypoints = new ArrayList();
        } else {
            this.waypoints = list;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            IPSWaypoint iPSWaypoint = (IPSWaypoint) it.next();
            this.waypoints.add(CollectionsKt.Z(Double.valueOf(iPSWaypoint.getX()), Double.valueOf(iPSWaypoint.getY()), Double.valueOf(iPSWaypoint.getFloorOrder())));
        }
    }

    @Transient
    private static /* synthetic */ void getIpsWayPoints$annotations() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$me_oriient_sdk_realtime(RouteRequest self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.o(serialDesc, 0, self.isAccessibleOnly);
        if (!output.q(serialDesc, 1) && Intrinsics.c(self.waypoints, new ArrayList())) {
            return;
        }
        output.F(serialDesc, 1, kSerializerArr[1], self.waypoints);
    }

    @NotNull
    public final List<List<Double>> getWaypoints() {
        return this.waypoints;
    }

    /* renamed from: isAccessibleOnly, reason: from getter */
    public final boolean getIsAccessibleOnly() {
        return this.isAccessibleOnly;
    }

    public final void setAccessibleOnly(boolean z) {
        this.isAccessibleOnly = z;
    }

    public final void setWaypoints(@NotNull List<List<Double>> list) {
        Intrinsics.h(list, "<set-?>");
        this.waypoints = list;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("RouteRequest(waypoints=");
        sb.append(this.waypoints);
        sb.append(", isAccessibleOnly=");
        return b.s(sb, this.isAccessibleOnly, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RouteRequest(@NotNull List<? extends IPSWaypoint> ipsWayPoints, boolean z) {
        Intrinsics.h(ipsWayPoints, "ipsWayPoints");
        this.ipsWayPoints = ipsWayPoints;
        this.isAccessibleOnly = z;
        this.waypoints = new ArrayList();
        if (ipsWayPoints.isEmpty()) {
            return;
        }
        for (IPSWaypoint iPSWaypoint : ipsWayPoints) {
            this.waypoints.add(CollectionsKt.Z(Double.valueOf(iPSWaypoint.getX()), Double.valueOf(iPSWaypoint.getY()), Double.valueOf(iPSWaypoint.getFloorOrder())));
        }
    }

    public /* synthetic */ RouteRequest(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, z);
    }
}
