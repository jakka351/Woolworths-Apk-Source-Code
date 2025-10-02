package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.workaround.TemplateParamsOverride;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.StreamSpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/* loaded from: classes2.dex */
class Camera2CaptureRequestBuilder {

    @RequiresApi
    public static class Api23Impl {
    }

    public static void a(CaptureRequest.Builder builder, OptionsBundle optionsBundle) {
        CaptureRequestOptions captureRequestOptionsA = CaptureRequestOptions.Builder.c(optionsBundle).a();
        for (Config.Option option : captureRequestOptionsA.f()) {
            CaptureRequest.Key key = (CaptureRequest.Key) option.d();
            try {
                builder.set(key, captureRequestOptionsA.a(option));
            } catch (IllegalArgumentException unused) {
                Logger.b("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    public static void b(CaptureRequest.Builder builder, int i, TemplateParamsOverride templateParamsOverride) {
        Map mapUnmodifiableMap;
        if (i == 3 && templateParamsOverride.f366a) {
            HashMap map = new HashMap();
            map.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            mapUnmodifiableMap = Collections.unmodifiableMap(map);
        } else {
            if (i != 4) {
                templateParamsOverride.getClass();
            } else if (templateParamsOverride.b) {
                HashMap map2 = new HashMap();
                map2.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
                mapUnmodifiableMap = Collections.unmodifiableMap(map2);
            }
            mapUnmodifiableMap = Collections.EMPTY_MAP;
        }
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            builder.set((CaptureRequest.Key) entry.getKey(), entry.getValue());
        }
    }

    public static CaptureRequest c(CaptureConfig captureConfig, CameraDevice cameraDevice, HashMap map, boolean z, TemplateParamsOverride templateParamsOverride) throws CameraAccessException {
        CaptureRequest.Builder builderCreateCaptureRequest;
        if (cameraDevice == null) {
            return null;
        }
        ArrayList arrayList = captureConfig.f482a;
        OptionsBundle optionsBundle = captureConfig.b;
        int i = captureConfig.c;
        TreeMap treeMap = optionsBundle.G;
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listUnmodifiableList.iterator();
        while (it.hasNext()) {
            Surface surface = (Surface) map.get((DeferrableSurface) it.next());
            if (surface == null) {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
            arrayList2.add(surface);
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        CameraCaptureResult cameraCaptureResult = captureConfig.h;
        if (i == 5 && cameraCaptureResult != null && (cameraCaptureResult.g() instanceof TotalCaptureResult)) {
            Logger.a("Camera2CaptureRequestBuilder", "createReprocessCaptureRequest");
            builderCreateCaptureRequest = cameraDevice.createReprocessCaptureRequest((TotalCaptureResult) cameraCaptureResult.g());
        } else {
            Logger.a("Camera2CaptureRequestBuilder", "createCaptureRequest");
            if (i == 5) {
                builderCreateCaptureRequest = cameraDevice.createCaptureRequest(z ? 1 : 2);
            } else {
                builderCreateCaptureRequest = cameraDevice.createCaptureRequest(i);
            }
        }
        b(builderCreateCaptureRequest, i, templateParamsOverride);
        Config.Option option = CaptureConfig.k;
        Object objA = StreamSpec.f502a;
        try {
            objA = optionsBundle.a(option);
        } catch (IllegalArgumentException unused) {
        }
        Range range = (Range) objA;
        Objects.requireNonNull(range);
        Object objA2 = StreamSpec.f502a;
        if (!range.equals(objA2)) {
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
            try {
                objA2 = optionsBundle.a(CaptureConfig.k);
            } catch (IllegalArgumentException unused2) {
            }
            Range range2 = (Range) objA2;
            Objects.requireNonNull(range2);
            builderCreateCaptureRequest.set(key, range2);
        }
        if (captureConfig.b() == 1 || captureConfig.c() == 1) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
        } else if (captureConfig.b() == 2) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
        } else if (captureConfig.c() == 2) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
        }
        Config.Option option2 = CaptureConfig.i;
        if (treeMap.containsKey(option2)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) optionsBundle.a(option2));
        }
        Config.Option option3 = CaptureConfig.j;
        if (treeMap.containsKey(option3)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) optionsBundle.a(option3)).byteValue()));
        }
        a(builderCreateCaptureRequest, optionsBundle);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            builderCreateCaptureRequest.addTarget((Surface) it2.next());
        }
        builderCreateCaptureRequest.setTag(captureConfig.g);
        return builderCreateCaptureRequest.build();
    }

    public static CaptureRequest d(CaptureConfig captureConfig, CameraDevice cameraDevice, TemplateParamsOverride templateParamsOverride) throws CameraAccessException {
        if (cameraDevice == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("template type = ");
        int i = captureConfig.c;
        sb.append(i);
        Logger.a("Camera2CaptureRequestBuilder", sb.toString());
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(i);
        b(builderCreateCaptureRequest, i, templateParamsOverride);
        a(builderCreateCaptureRequest, captureConfig.b);
        return builderCreateCaptureRequest.build();
    }
}
