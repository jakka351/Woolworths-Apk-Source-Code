package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.params.DynamicRangeConversions;
import androidx.camera.camera2.internal.compat.params.DynamicRangesCompat;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.core.util.Preconditions;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes2.dex */
final class DynamicRangeResolver {

    /* renamed from: a, reason: collision with root package name */
    public final CameraCharacteristicsCompat f272a;
    public final DynamicRangesCompat b;
    public final boolean c;

    @RequiresApi
    public static final class Api33Impl {
        public static DynamicRange a(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
            Long l = (Long) cameraCharacteristicsCompat.a(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
            if (l != null) {
                return (DynamicRange) DynamicRangeConversions.f309a.get(l);
            }
            return null;
        }
    }

    public DynamicRangeResolver(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.f272a = cameraCharacteristicsCompat;
        this.b = DynamicRangesCompat.a(cameraCharacteristicsCompat);
        int[] iArr = (int[]) cameraCharacteristicsCompat.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z = false;
        if (iArr != null) {
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (iArr[i] == 18) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.c = z;
    }

    public static boolean a(DynamicRange dynamicRange, DynamicRange dynamicRange2) {
        boolean zB = dynamicRange2.b();
        int i = dynamicRange2.f400a;
        Preconditions.f("Fully specified range is not actually fully specified.", zB);
        int i2 = dynamicRange.f400a;
        if (i2 == 2 && i == 1) {
            return false;
        }
        if (i2 != 2 && i2 != 0 && i2 != i) {
            return false;
        }
        int i3 = dynamicRange.b;
        return i3 == 0 || i3 == dynamicRange2.b;
    }

    public static boolean b(DynamicRange dynamicRange, DynamicRange dynamicRange2, HashSet hashSet) {
        if (hashSet.contains(dynamicRange2)) {
            return a(dynamicRange, dynamicRange2);
        }
        Logger.a("DynamicRangeResolver", "Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  " + dynamicRange + "\nCandidate dynamic range:\n  " + dynamicRange2);
        return false;
    }

    public static DynamicRange c(DynamicRange dynamicRange, LinkedHashSet linkedHashSet, HashSet hashSet) {
        if (dynamicRange.f400a == 1) {
            return null;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            DynamicRange dynamicRange2 = (DynamicRange) it.next();
            Preconditions.e(dynamicRange2, "Fully specified DynamicRange cannot be null.");
            int i = dynamicRange2.f400a;
            Preconditions.f("Fully specified DynamicRange must have fully defined encoding.", dynamicRange2.b());
            if (i != 1 && b(dynamicRange, dynamicRange2, hashSet)) {
                return dynamicRange2;
            }
        }
        return null;
    }

    public static void d(HashSet hashSet, DynamicRange dynamicRange, DynamicRangesCompat dynamicRangesCompat) {
        Preconditions.f("Cannot update already-empty constraints.", !hashSet.isEmpty());
        Set setB = dynamicRangesCompat.b(dynamicRange);
        if (setB.isEmpty()) {
            return;
        }
        HashSet hashSet2 = new HashSet(hashSet);
        hashSet.retainAll(setB);
        if (hashSet.isEmpty()) {
            throw new IllegalArgumentException("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  " + dynamicRange + "\nConstraints:\n  " + TextUtils.join("\n  ", setB) + "\nExisting constraints:\n  " + TextUtils.join("\n  ", hashSet2));
        }
    }
}
