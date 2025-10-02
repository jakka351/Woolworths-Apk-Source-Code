package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.camera.camera2.internal.compat.params.DynamicRangesCompat;
import androidx.camera.core.DynamicRange;
import androidx.core.util.Preconditions;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
class DynamicRangesCompatBaseImpl implements DynamicRangesCompat.DynamicRangeProfilesCompatImpl {

    /* renamed from: a, reason: collision with root package name */
    public static final DynamicRangesCompat f312a = new DynamicRangesCompat(new DynamicRangesCompatBaseImpl());
    public static final Set b = Collections.singleton(DynamicRange.d);

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    public final Set a() {
        return b;
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    public final Set b(DynamicRange dynamicRange) {
        Preconditions.a("DynamicRange is not supported: " + dynamicRange, DynamicRange.d.equals(dynamicRange));
        return b;
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    public final DynamicRangeProfiles c() {
        return null;
    }
}
