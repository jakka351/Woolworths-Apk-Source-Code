package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.params.DynamicRangesCompat;
import androidx.camera.core.DynamicRange;
import androidx.core.util.Preconditions;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@RequiresApi
/* loaded from: classes2.dex */
class DynamicRangesCompatApi33Impl implements DynamicRangesCompat.DynamicRangeProfilesCompatImpl {

    /* renamed from: a, reason: collision with root package name */
    public final DynamicRangeProfiles f311a;

    public DynamicRangesCompatApi33Impl(Object obj) {
        this.f311a = (DynamicRangeProfiles) obj;
    }

    public static Set d(Set set) {
        if (set.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            long jLongValue = l.longValue();
            DynamicRange dynamicRange = (DynamicRange) DynamicRangeConversions.f309a.get(l);
            Preconditions.e(dynamicRange, "Dynamic range profile cannot be converted to a DynamicRange object: " + jLongValue);
            hashSet.add(dynamicRange);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    public final Set a() {
        return d(this.f311a.getSupportedProfiles());
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    public final Set b(DynamicRange dynamicRange) {
        Long lA = DynamicRangeConversions.a(dynamicRange, this.f311a);
        Preconditions.a("DynamicRange is not supported: " + dynamicRange, lA != null);
        return d(this.f311a.getProfileCaptureRequestConstraints(lA.longValue()));
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    public final DynamicRangeProfiles c() {
        return this.f311a;
    }
}
