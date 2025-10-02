package me.oriient.ipssdk.realtime.ips.system_state;

import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.systemStateManager.UiEvent;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "Lme/oriient/internal/services/systemStateManager/UiEvent;", "toUiEvent", "(I)Lme/oriient/internal/services/systemStateManager/UiEvent;", "me.oriient.sdk-realtime"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class IpsApplicationEventExtKt {
    @Nullable
    public static final UiEvent toUiEvent(int i) {
        switch (i) {
            case 0:
                return new UiEvent.CalibrationDialogVisibilityChanged(true);
            case 1:
                return new UiEvent.CalibrationDialogVisibilityChanged(false);
            case 2:
                return new UiEvent.MapVisibilityChanged(true);
            case 3:
                return new UiEvent.MapVisibilityChanged(false);
            case 4:
                return new UiEvent.UserPositionVisibilityChanged(true);
            case 5:
                return new UiEvent.UserPositionVisibilityChanged(false);
            case 6:
                return new UiEvent.NavigationPathVisibilityChanged(true);
            case 7:
                return new UiEvent.NavigationPathVisibilityChanged(false);
            case 8:
                return new UiEvent.WalkToLockIndicatorVisibilityChanged(true);
            case 9:
                return new UiEvent.WalkToLockIndicatorVisibilityChanged(false);
            default:
                ((Logger) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(Logger.class))).e("IPSApplicationEventExt", "Unknown applicationEvent = " + i + ", returning null");
                return null;
        }
    }
}
