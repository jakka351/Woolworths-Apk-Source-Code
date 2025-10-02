package me.oriient.ipssdk.realtime.ips;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.RingBuffer;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.realtime.ofs.P2;
import me.oriient.positioningengine.common.ValidationUpdate;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\u0012\u001a\u00020\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/OnDeviceEngineAutoStopDetectorImpl;", "Lme/oriient/ipssdk/realtime/ips/OnDeviceEngineAutoStopDetector;", "<init>", "()V", "Lme/oriient/positioningengine/common/ValidationUpdate;", "validationUpdate", "", "shouldStop", "(Lme/oriient/positioningengine/common/ValidationUpdate;)Z", "", "Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "geofence", "", "slidingWindowSize", "", "maxDistanceFromBuildingMeters", "requiredConsistentAttemptsToStop", "", "configure", "(Ljava/util/List;IDI)V", "Companion", "me/oriient/ipssdk/realtime/ofs/P2", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class OnDeviceEngineAutoStopDetectorImpl implements OnDeviceEngineAutoStopDetector {

    @NotNull
    private static final P2 Companion = new P2();

    /* renamed from: a, reason: collision with root package name */
    private List f25835a;
    private double b;
    private ValidationUpdate c;
    private int d;
    private int e;
    private int f;
    private RingBuffer g;

    public OnDeviceEngineAutoStopDetectorImpl() {
        DependencyInjectionKt.getDi().inject(Reflection.f24268a.b(Logger.class));
        this.g = new RingBuffer(0);
    }

    @Override // me.oriient.ipssdk.realtime.ips.OnDeviceEngineAutoStopDetector
    public void configure(@NotNull List<IndoorCoordinate> geofence, int slidingWindowSize, double maxDistanceFromBuildingMeters, int requiredConsistentAttemptsToStop) {
        Intrinsics.h(geofence, "geofence");
        this.c = null;
        this.e = 0;
        this.d = slidingWindowSize;
        this.b = maxDistanceFromBuildingMeters;
        this.f = requiredConsistentAttemptsToStop;
        this.g.clear();
        this.g = new RingBuffer(slidingWindowSize);
        this.f25835a = geofence;
    }

    @Override // me.oriient.ipssdk.realtime.ips.OnDeviceEngineAutoStopDetector
    public boolean shouldStop(@NotNull ValidationUpdate validationUpdate) {
        Intrinsics.h(validationUpdate, "validationUpdate");
        List<IndoorCoordinate> list = this.f25835a;
        if (list != null && validationUpdate.getLockProgress() < 1.0d && Math.abs(validationUpdate.getOsLctnX()) < this.b && Math.abs(validationUpdate.getOsLctnY()) < this.b && Math.abs(validationUpdate.getOsLctnZ()) < this.b) {
            if (this.c == null) {
                this.c = validationUpdate;
            }
            ValidationUpdate validationUpdate2 = this.c;
            if (validationUpdate2 != null && (validationUpdate2.getOsLctnX() == validationUpdate.getOsLctnX() || validationUpdate2.getOsLctnY() == validationUpdate.getOsLctnY())) {
                return false;
            }
            this.c = validationUpdate;
            if (this.g.isFull()) {
                this.g.pop();
            }
            this.g.add(validationUpdate);
            if (!this.g.isFull()) {
                return false;
            }
            Iterator it = this.g.getAllElements().iterator();
            double osLctnHU = 0.0d;
            double osLctnX = 0.0d;
            while (it.hasNext()) {
                osLctnX += ((ValidationUpdate) it.next()).getOsLctnX();
            }
            double d = osLctnX / this.d;
            Iterator it2 = this.g.getAllElements().iterator();
            double osLctnY = 0.0d;
            while (it2.hasNext()) {
                osLctnY += ((ValidationUpdate) it2.next()).getOsLctnY();
            }
            double d2 = osLctnY / this.d;
            Iterator it3 = this.g.getAllElements().iterator();
            while (it3.hasNext()) {
                osLctnHU += ((ValidationUpdate) it3.next()).getOsLctnHU();
            }
            if (new IndoorCoordinate(d, d2, 0.0d, 4, (DefaultConstructorMarker) null).doesIntersectWithPolygon(list, osLctnHU / this.d)) {
                this.e = 0;
                return false;
            }
            int i = this.e + 1;
            this.e = i;
            if (i >= this.f) {
                return true;
            }
        }
        return false;
    }
}
