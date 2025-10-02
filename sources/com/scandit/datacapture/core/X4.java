package com.scandit.datacapture.core;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import com.scandit.datacapture.core.logger.CameraInfoProviderEvent;
import com.scandit.datacapture.core.logger.SdcLogger;
import java.util.ArrayList;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class X4 implements W {

    /* renamed from: a, reason: collision with root package name */
    private final CameraManager f18393a;

    public X4(CameraManager cameraManager) {
        Intrinsics.h(cameraManager, "cameraManager");
        this.f18393a = cameraManager;
    }

    public final List a() throws CameraAccessException {
        String strU;
        EmptyList emptyList = EmptyList.d;
        Object[] objArr = null;
        try {
            String[] cameraIdList = this.f18393a.getCameraIdList();
            if (cameraIdList.length == 0) {
                SdcLogger.INSTANCE.get().onEvent$scandit_capture_core(new CameraInfoProviderEvent(2, 0, "No exception thrown, 0 cameras available", null, 8, null));
                return emptyList;
            }
            ArrayList arrayList = new ArrayList(cameraIdList.length);
            for (String str : cameraIdList) {
                CameraCharacteristics cameraCharacteristics = this.f18393a.getCameraCharacteristics(str);
                Intrinsics.g(cameraCharacteristics, "cameraManager.getCameraCharacteristics(it)");
                arrayList.add(new W4(str, cameraCharacteristics));
            }
            return arrayList;
        } catch (CameraAccessException e) {
            e.printStackTrace();
            int length = 0 != 0 ? objArr.length : -1;
            String strB = ExceptionsKt.b(e);
            StringBuilder sb = new StringBuilder("Camera id list: ");
            if (0 == 0 || (strU = ArraysKt.U(null, null, null, null, null, 63)) == null) {
                strU = "null list";
            }
            SdcLogger.INSTANCE.get().onEvent$scandit_capture_core(new CameraInfoProviderEvent(2, length, strB, androidx.camera.core.impl.b.r(sb, strU, ';')));
            return emptyList;
        }
    }
}
