package com.scandit.datacapture.barcode.internal.sdk.data;

import com.scandit.datacapture.barcode.data.ArucoDictionaryPreset;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeArucoDictionary {

    @DjinniGenerated
    public static final class CppProxy extends NativeArucoDictionary {
        private final long nativeRef;

        private CppProxy(long j) {
            new AtomicBoolean(false);
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);
    }

    public static native NativeArucoDictionary createWithMarkers(int i, ArrayList<NativeArucoMarker> arrayList);

    public static native NativeArucoDictionary fromPreset(ArucoDictionaryPreset arucoDictionaryPreset);
}
