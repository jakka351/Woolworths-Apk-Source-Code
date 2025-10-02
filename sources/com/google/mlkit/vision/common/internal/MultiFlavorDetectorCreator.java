package com.google.mlkit.vision.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

@KeepForSdk
/* loaded from: classes.dex */
public class MultiFlavorDetectorCreator {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f16004a = new HashMap();

    @KeepForSdk
    /* loaded from: classes6.dex */
    public interface DetectorCreator<DetectorT extends MultiFlavorDetector, OptionsT extends DetectorOptions<DetectorT>> {
    }

    @KeepForSdk
    /* loaded from: classes6.dex */
    public interface DetectorOptions<DetectorT> {
    }

    @KeepForSdk
    /* loaded from: classes6.dex */
    public interface MultiFlavorDetector {
    }

    @KeepForSdk
    public static class Registration {
    }

    public MultiFlavorDetectorCreator(Set set) {
        HashMap map = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((Registration) it.next()).getClass();
            if (!this.f16004a.containsKey(null) || ((Integer) Preconditions.checkNotNull((Integer) map.get(null))).intValue() <= 0) {
                this.f16004a.put(null, null);
                map.put(null, 0);
            }
        }
    }
}
