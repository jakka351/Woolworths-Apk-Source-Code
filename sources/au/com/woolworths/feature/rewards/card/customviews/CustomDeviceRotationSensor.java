package au.com.woolworths.feature.rewards.card.customviews;

import android.content.Context;
import android.hardware.SensorManager;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import timber.log.Timber;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/feature/rewards/card/customviews/CustomDeviceRotationSensor;", "Lau/com/woolworths/feature/rewards/card/customviews/DeviceRotationSensor;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CustomDeviceRotationSensor implements DeviceRotationSensor {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/feature/rewards/card/customviews/CustomDeviceRotationSensor$Companion;", "", "", "ROTATION_MATRIX_ARRAY_SIZE", "I", "ORIENTATION_ARRAY_SIZE", "SAMPLING_PERIOD_IN_MILLISECONDS", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public CustomDeviceRotationSensor(@NotNull Context context) {
        Intrinsics.h(context, "context");
        Object systemService = context.getSystemService((Class<Object>) SensorManager.class);
        Intrinsics.e(systemService);
        if (((SensorManager) systemService).getDefaultSensor(11) == null) {
            Timber.f27013a.b("Sensor of type TYPE_ROTATION_VECTOR could not be found or accessed.", new Object[0]);
        }
    }
}
