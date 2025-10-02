package com.scandit.datacapture.core.ui.orientation;

import android.content.Context;
import android.view.WindowManager;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.extensions.ContextExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.ui.orientation.InternalDeviceOrientationMapper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/scandit/datacapture/core/ui/orientation/DeviceOrientationMapper;", "", "", "rotation", "Lcom/scandit/datacapture/core/ui/orientation/DeviceOrientation;", "mapRotationToOrientation", "<init>", "()V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
@Mockable
/* loaded from: classes6.dex */
public final class DeviceOrientationMapper {
    @NotNull
    public final DeviceOrientation mapRotationToOrientation(int rotation) {
        InternalDeviceOrientationMapper internalDeviceOrientationMapper = InternalDeviceOrientationMapper.INSTANCE;
        Context applicationContext = AppAndroidEnvironment.INSTANCE.getApplicationContext();
        Object systemService = applicationContext.getSystemService("window");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        return internalDeviceOrientationMapper.getDeviceOrientation(internalDeviceOrientationMapper.getDeviceNaturalOrientation(ContextExtensionsKt.getOrientation(applicationContext), ((WindowManager) systemService).getDefaultDisplay().getRotation()), rotation);
    }
}
