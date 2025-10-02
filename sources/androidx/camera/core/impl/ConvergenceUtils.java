package androidx.camera.core.impl;

import androidx.camera.core.impl.CameraCaptureMetaData;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class ConvergenceUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f485a = Collections.unmodifiableSet(EnumSet.of(CameraCaptureMetaData.AfState.g, CameraCaptureMetaData.AfState.h, CameraCaptureMetaData.AfState.i, CameraCaptureMetaData.AfState.j));
    public static final Set b = Collections.unmodifiableSet(EnumSet.of(CameraCaptureMetaData.AwbState.g, CameraCaptureMetaData.AwbState.d));
    public static final Set c;
    public static final Set d;

    static {
        CameraCaptureMetaData.AeState aeState = CameraCaptureMetaData.AeState.h;
        CameraCaptureMetaData.AeState aeState2 = CameraCaptureMetaData.AeState.g;
        CameraCaptureMetaData.AeState aeState3 = CameraCaptureMetaData.AeState.d;
        Set setUnmodifiableSet = Collections.unmodifiableSet(EnumSet.of(aeState, aeState2, aeState3));
        c = setUnmodifiableSet;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setUnmodifiableSet);
        enumSetCopyOf.remove(aeState2);
        enumSetCopyOf.remove(aeState3);
        d = Collections.unmodifiableSet(enumSetCopyOf);
    }
}
