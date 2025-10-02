package me.oriient.ipssdk.common.utils;

import androidx.annotation.Keep;
import kotlin.Metadata;
import me.oriient.internal.infra.locationManager.SystemLocation;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.services.dataManager.building.Building;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H&¨\u0006\u0013"}, d2 = {"Lme/oriient/ipssdk/common/utils/Utils;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "formatMilli", "", "timeMilli", "", "generateExceptionMessage", "th", "", "isInside", "", "building", "Lme/oriient/internal/services/dataManager/building/Building;", "location", "Lme/oriient/internal/infra/locationManager/SystemLocation;", "logCaller", "", "tag", "Companion", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface Utils extends DiProvidable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f25785a;
    public static final int MAX_LOGCAT_MESSAGE_SIZE = 1000;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/ipssdk/common/utils/Utils$Companion;", "", "", "MAX_LOGCAT_MESSAGE_SIZE", "I", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public static final int MAX_LOGCAT_MESSAGE_SIZE = 1000;

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f25785a = new Companion();

        private Companion() {
        }
    }

    @NotNull
    String formatMilli(long timeMilli);

    @NotNull
    String generateExceptionMessage(@Nullable Throwable th);

    boolean isInside(@NotNull Building building, @NotNull SystemLocation location);

    void logCaller(@NotNull String tag);
}
