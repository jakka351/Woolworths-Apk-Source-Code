package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.internal.compat.workaround.ExcludedSupportedSizesContainer;
import androidx.camera.camera2.internal.compat.workaround.OutputSizesCorrector;
import androidx.camera.core.Logger;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public class StreamConfigurationMapCompat {

    /* renamed from: a, reason: collision with root package name */
    public final StreamConfigurationMapCompatApi23Impl f307a;
    public final OutputSizesCorrector b;
    public final HashMap c = new HashMap();

    public interface StreamConfigurationMapCompatImpl {
    }

    public StreamConfigurationMapCompat(StreamConfigurationMap streamConfigurationMap, OutputSizesCorrector outputSizesCorrector) {
        new HashMap();
        new HashMap();
        this.f307a = new StreamConfigurationMapCompatApi23Impl(streamConfigurationMap);
        this.b = outputSizesCorrector;
    }

    public final int[] a() {
        int[] outputFormats;
        StreamConfigurationMapCompatApi23Impl streamConfigurationMapCompatApi23Impl = this.f307a;
        streamConfigurationMapCompatApi23Impl.getClass();
        try {
            outputFormats = streamConfigurationMapCompatApi23Impl.f308a.getOutputFormats();
        } catch (IllegalArgumentException | NullPointerException e) {
            Logger.f("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e);
            outputFormats = null;
        }
        if (outputFormats == null) {
            return null;
        }
        return (int[]) outputFormats.clone();
    }

    public final Size[] b(int i) {
        List arrayList;
        ArrayList arrayList2;
        HashMap map = this.c;
        if (map.containsKey(Integer.valueOf(i))) {
            if (((Size[]) map.get(Integer.valueOf(i))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) map.get(Integer.valueOf(i))).clone();
        }
        Size[] outputSizes = this.f307a.f308a.getOutputSizes(i);
        if (outputSizes == null || outputSizes.length == 0) {
            Logger.e("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i);
            return outputSizes;
        }
        OutputSizesCorrector outputSizesCorrector = this.b;
        outputSizesCorrector.getClass();
        ArrayList arrayList3 = new ArrayList(Arrays.asList(outputSizes));
        if (outputSizesCorrector.f357a != null) {
            Size[] sizeArr = (i == 34 && "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL)) ? new Size[]{new Size(1440, 1080), new Size(960, 720)} : new Size[0];
            if (sizeArr.length > 0) {
                arrayList3.addAll(Arrays.asList(sizeArr));
            }
        }
        ExcludedSupportedSizesContainer excludedSupportedSizesContainer = outputSizesCorrector.b;
        excludedSupportedSizesContainer.getClass();
        if (((ExcludedSupportedSizesQuirk) DeviceQuirks.f327a.b(ExcludedSupportedSizesQuirk.class)) == null) {
            arrayList = new ArrayList();
        } else {
            String str = excludedSupportedSizesContainer.f351a;
            String str2 = Build.BRAND;
            if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6".equalsIgnoreCase(Build.DEVICE)) {
                arrayList2 = new ArrayList();
                if (str.equals("0") && i == 256) {
                    arrayList2.add(new Size(4160, 3120));
                    arrayList2.add(new Size(4000, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS));
                }
            } else if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE)) {
                arrayList2 = new ArrayList();
                if (str.equals("0") && i == 256) {
                    arrayList2.add(new Size(4160, 3120));
                    arrayList2.add(new Size(4000, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS));
                }
            } else if ("HUAWEI".equalsIgnoreCase(str2) && "HWANE".equalsIgnoreCase(Build.DEVICE)) {
                arrayList2 = new ArrayList();
                if (str.equals("0") && (i == 34 || i == 35)) {
                    arrayList2.add(new Size(720, 720));
                    arrayList2.add(new Size(400, 400));
                }
            } else if ("SAMSUNG".equalsIgnoreCase(str2) && "ON7XELTE".equalsIgnoreCase(Build.DEVICE)) {
                arrayList2 = new ArrayList();
                if (str.equals("0")) {
                    if (i == 34) {
                        arrayList2.add(new Size(4128, 3096));
                        arrayList2.add(new Size(4128, 2322));
                        arrayList2.add(new Size(3088, 3088));
                        arrayList2.add(new Size(3264, 2448));
                        arrayList2.add(new Size(3264, 1836));
                        arrayList2.add(new Size(2048, 1536));
                        arrayList2.add(new Size(2048, 1152));
                        arrayList2.add(new Size(1920, 1080));
                    } else if (i == 35) {
                        arrayList2.add(new Size(4128, 2322));
                        arrayList2.add(new Size(3088, 3088));
                        arrayList2.add(new Size(3264, 2448));
                        arrayList2.add(new Size(3264, 1836));
                        arrayList2.add(new Size(2048, 1536));
                        arrayList2.add(new Size(2048, 1152));
                        arrayList2.add(new Size(1920, 1080));
                    }
                } else if (str.equals("1") && (i == 34 || i == 35)) {
                    arrayList2.add(new Size(3264, 2448));
                    arrayList2.add(new Size(3264, 1836));
                    arrayList2.add(new Size(2448, 2448));
                    arrayList2.add(new Size(1920, 1920));
                    arrayList2.add(new Size(2048, 1536));
                    arrayList2.add(new Size(2048, 1152));
                    arrayList2.add(new Size(1920, 1080));
                }
            } else if ("SAMSUNG".equalsIgnoreCase(str2) && "J7XELTE".equalsIgnoreCase(Build.DEVICE)) {
                arrayList2 = new ArrayList();
                if (str.equals("0")) {
                    if (i == 34) {
                        arrayList2.add(new Size(4128, 3096));
                        arrayList2.add(new Size(4128, 2322));
                        arrayList2.add(new Size(3088, 3088));
                        arrayList2.add(new Size(3264, 2448));
                        arrayList2.add(new Size(3264, 1836));
                        arrayList2.add(new Size(2048, 1536));
                        arrayList2.add(new Size(2048, 1152));
                        arrayList2.add(new Size(1920, 1080));
                    } else if (i == 35) {
                        arrayList2.add(new Size(2048, 1536));
                        arrayList2.add(new Size(2048, 1152));
                        arrayList2.add(new Size(1920, 1080));
                    }
                } else if (str.equals("1") && (i == 34 || i == 35)) {
                    arrayList2.add(new Size(2576, 1932));
                    arrayList2.add(new Size(2560, 1440));
                    arrayList2.add(new Size(1920, 1920));
                    arrayList2.add(new Size(2048, 1536));
                    arrayList2.add(new Size(2048, 1152));
                    arrayList2.add(new Size(1920, 1080));
                }
            } else if ("REDMI".equalsIgnoreCase(str2) && "joyeuse".equalsIgnoreCase(Build.DEVICE)) {
                arrayList2 = new ArrayList();
                if (str.equals("0") && i == 256) {
                    arrayList2.add(new Size(9280, 6944));
                }
            } else {
                Logger.e("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
                arrayList = Collections.EMPTY_LIST;
            }
            arrayList = arrayList2;
        }
        if (!arrayList.isEmpty()) {
            arrayList3.removeAll(arrayList);
        }
        if (arrayList3.isEmpty()) {
            Logger.e("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
        }
        Size[] sizeArr2 = (Size[]) arrayList3.toArray(new Size[0]);
        map.put(Integer.valueOf(i), sizeArr2);
        return (Size[]) sizeArr2.clone();
    }

    public final StreamConfigurationMap c() {
        return this.f307a.f308a;
    }
}
