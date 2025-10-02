package me.oriient.ipssdk.realtime.ips;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.api.listeners.IPSPositioningListener;
import me.oriient.ipssdk.common.utils.SdkExecutors;
import me.oriient.ipssdk.realtime.utils.models.Position;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/MockPositionProvider;", "", "<init>", "()V", "Lme/oriient/ipssdk/api/listeners/IPSPositioningListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "buildingId", "floorId", "", "floorOrder", "", "startPositioning", "(Lme/oriient/ipssdk/api/listeners/IPSPositioningListener;Ljava/lang/String;Ljava/lang/String;I)V", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MockPositionProvider {

    /* renamed from: a, reason: collision with root package name */
    private double f25833a;
    private double b = 1.0d;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IPSPositioningListener listener, String buildingId, MockPositionProvider this$0, String floorId, int i) {
        Intrinsics.h(listener, "$listener");
        Intrinsics.h(buildingId, "$buildingId");
        Intrinsics.h(this$0, "this$0");
        Intrinsics.h(floorId, "$floorId");
        double d = this$0.f25833a;
        double d2 = this$0.b;
        listener.onPositionUpdate(new Position(buildingId, 23.655d, 29.073d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 15.0f, d, d2, 0.0d, floorId, 0L, i, d, d2, 0.0d, 0.0d, 0.0d, null, 0.0d));
        this$0.f25833a += 0.1d;
        this$0.b += 0.1d;
    }

    public final void startPositioning(@NotNull final IPSPositioningListener listener, @NotNull final String buildingId, @NotNull final String floorId, final int floorOrder) {
        Intrinsics.h(listener, "listener");
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        SdkExecutors.scheduleAtFixedRate(new Runnable() { // from class: me.oriient.ipssdk.realtime.ips.q
            @Override // java.lang.Runnable
            public final void run() {
                MockPositionProvider.a(listener, buildingId, this, floorId, floorOrder);
            }
        }, 1000L, 200L, TimeUnit.MILLISECONDS);
    }
}
