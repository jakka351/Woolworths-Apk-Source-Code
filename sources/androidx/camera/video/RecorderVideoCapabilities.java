package androidx.camera.video;

import android.util.Size;
import androidx.annotation.RestrictTo;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.camera.video.internal.BackupHdrProfileEncoderProfilesProvider;
import androidx.camera.video.internal.DynamicRangeMatchedEncoderProfilesProvider;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.workaround.QualityAddedEncoderProfilesProvider;
import androidx.camera.video.internal.workaround.QualityResolutionModifiedEncoderProfilesProvider;
import androidx.camera.video.internal.workaround.QualityValidatedEncoderProfilesProvider;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;

@RestrictTo
/* loaded from: classes2.dex */
public final class RecorderVideoCapabilities implements VideoCapabilities {
    public final QualityValidatedEncoderProfilesProvider b;
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.camera.video.internal.BackupHdrProfileEncoderProfilesProvider] */
    public RecorderVideoCapabilities(CameraInfoInternal cameraInfoInternal) {
        EncoderProfilesProvider encoderProfilesProviderG = cameraInfoInternal.g();
        Quirks quirks = DeviceQuirks.f614a;
        QualityResolutionModifiedEncoderProfilesProvider qualityResolutionModifiedEncoderProfilesProvider = new QualityResolutionModifiedEncoderProfilesProvider(new QualityAddedEncoderProfilesProvider(cameraInfoInternal, encoderProfilesProviderG, quirks), quirks);
        Iterator it = cameraInfoInternal.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            DynamicRange dynamicRange = (DynamicRange) it.next();
            Integer numValueOf = Integer.valueOf(dynamicRange.f400a);
            int i = dynamicRange.b;
            if (numValueOf.equals(3) && i == 10) {
                qualityResolutionModifiedEncoderProfilesProvider = new BackupHdrProfileEncoderProfilesProvider(qualityResolutionModifiedEncoderProfilesProvider);
                break;
            }
        }
        this.b = new QualityValidatedEncoderProfilesProvider(cameraInfoInternal, qualityResolutionModifiedEncoderProfilesProvider, quirks);
        for (DynamicRange dynamicRange2 : cameraInfoInternal.a()) {
            CapabilitiesByQuality capabilitiesByQuality = new CapabilitiesByQuality(new DynamicRangeMatchedEncoderProfilesProvider(this.b, dynamicRange2));
            if (!new ArrayList(capabilitiesByQuality.f584a.keySet()).isEmpty()) {
                this.c.put(dynamicRange2, capabilitiesByQuality);
            }
        }
        cameraInfoInternal.l();
    }

    @Override // androidx.camera.video.VideoCapabilities
    public final VideoValidatedEncoderProfilesProxy a(Size size, DynamicRange dynamicRange) {
        Object value;
        CapabilitiesByQuality capabilitiesByQualityD = d(dynamicRange);
        VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxyA = null;
        if (capabilitiesByQualityD == null) {
            return null;
        }
        TreeMap treeMap = capabilitiesByQualityD.b;
        Size size2 = SizeUtil.f543a;
        Map.Entry entryCeilingEntry = treeMap.ceilingEntry(size);
        if (entryCeilingEntry != null) {
            value = entryCeilingEntry.getValue();
        } else {
            Map.Entry entryFloorEntry = treeMap.floorEntry(size);
            value = entryFloorEntry != null ? entryFloorEntry.getValue() : null;
        }
        Quality quality = (Quality) value;
        if (quality == null) {
            quality = Quality.g;
        }
        Logger.a("CapabilitiesByQuality", "Using supported quality of " + quality + " for size " + size);
        if (quality == Quality.g || (videoValidatedEncoderProfilesProxyA = capabilitiesByQualityD.a(quality)) != null) {
            return videoValidatedEncoderProfilesProxyA;
        }
        throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
    }

    @Override // androidx.camera.video.VideoCapabilities
    public final ArrayList b(DynamicRange dynamicRange) {
        CapabilitiesByQuality capabilitiesByQualityD = d(dynamicRange);
        return capabilitiesByQualityD == null ? new ArrayList() : new ArrayList(capabilitiesByQualityD.f584a.keySet());
    }

    @Override // androidx.camera.video.VideoCapabilities
    public final VideoValidatedEncoderProfilesProxy c(Quality quality, DynamicRange dynamicRange) {
        CapabilitiesByQuality capabilitiesByQualityD = d(dynamicRange);
        if (capabilitiesByQualityD == null) {
            return null;
        }
        return capabilitiesByQualityD.a(quality);
    }

    public final CapabilitiesByQuality d(DynamicRange dynamicRange) {
        Object next;
        boolean zContains;
        boolean zB = dynamicRange.b();
        HashMap map = this.c;
        if (zB) {
            return (CapabilitiesByQuality) map.get(dynamicRange);
        }
        HashMap map2 = this.d;
        if (map2.containsKey(dynamicRange)) {
            return (CapabilitiesByQuality) map2.get(dynamicRange);
        }
        Set fullySpecifiedDynamicRanges = map.keySet();
        Intrinsics.h(fullySpecifiedDynamicRanges, "fullySpecifiedDynamicRanges");
        if (dynamicRange.b()) {
            zContains = fullySpecifiedDynamicRanges.contains(dynamicRange);
        } else {
            Iterator it = fullySpecifiedDynamicRanges.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                DynamicRange dynamicRange2 = (DynamicRange) next;
                Preconditions.f("Fully specified range is not actually fully specified.", dynamicRange2.b());
                int i = dynamicRange.b;
                if (i == 0 || i == dynamicRange2.b) {
                    Preconditions.f("Fully specified range is not actually fully specified.", dynamicRange2.b());
                    int i2 = dynamicRange.f400a;
                    if (i2 != 0) {
                        int i3 = dynamicRange2.f400a;
                        if ((i2 == 2 && i3 != 1) || i2 == i3) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            zContains = next != null;
        }
        CapabilitiesByQuality capabilitiesByQuality = zContains ? new CapabilitiesByQuality(new DynamicRangeMatchedEncoderProfilesProvider(this.b, dynamicRange)) : null;
        map2.put(dynamicRange, capabilitiesByQuality);
        return capabilitiesByQuality;
    }
}
