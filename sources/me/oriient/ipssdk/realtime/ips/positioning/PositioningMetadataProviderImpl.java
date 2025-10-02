package me.oriient.ipssdk.realtime.ips.positioning;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.services.dataModel.positioning.PositioningConfig;
import me.oriient.internal.services.dataModel.positioning.PositioningMetadataProvider;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager;
import me.oriient.ipssdk.realtime.ips.Positioning;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/positioning/PositioningMetadataProviderImpl;", "Lme/oriient/internal/services/dataModel/positioning/PositioningMetadataProvider;", "<init>", "()V", "Lme/oriient/internal/services/dataModel/positioning/PositioningConfig;", "getConfiguration", "()Lme/oriient/internal/services/dataModel/positioning/PositioningConfig;", "Lme/oriient/internal/services/dataModel/positioning/PositioningMetadataProvider$AutoStartData;", "getAutoStartData", "()Lme/oriient/internal/services/dataModel/positioning/PositioningMetadataProvider$AutoStartData;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class PositioningMetadataProviderImpl implements PositioningMetadataProvider {

    /* renamed from: a, reason: collision with root package name */
    private final Lazy f25887a = DependencyInjectionKt.getDi().inject(Reflection.f24268a.b(RemoteConfigManager.class));

    @Override // me.oriient.internal.services.dataModel.positioning.PositioningMetadataProvider
    @Nullable
    public PositioningMetadataProvider.AutoStartData getAutoStartData() {
        return Positioning.INSTANCE.getAutoStartData();
    }

    @Override // me.oriient.internal.services.dataModel.positioning.PositioningMetadataProvider
    @NotNull
    public PositioningConfig getConfiguration() {
        return ((RemoteConfigManager) this.f25887a.getD()).getRealTimeConfig().getPositioning();
    }
}
