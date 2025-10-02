package androidx.camera.camera2.internal;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.camera2.internal.compat.workaround.ExtraSupportedSurfaceCombinationsContainer;
import androidx.camera.camera2.internal.compat.workaround.ResolutionCorrector;
import androidx.camera.camera2.internal.compat.workaround.TargetAspectRatio;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.impl.AttachedSurfaceInfo;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.SurfaceCombination;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.SurfaceSizeDefinition;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@OptIn
/* loaded from: classes2.dex */
final class SupportedSurfaceCombination {
    public final String i;
    public final CamcorderProfileHelper j;
    public final CameraCharacteristicsCompat k;
    public final ExtraSupportedSurfaceCombinationsContainer l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public SurfaceSizeDefinition s;
    public final DisplayInfoManager u;
    public final DynamicRangeResolver x;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f282a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final HashMap e = new HashMap();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList t = new ArrayList();
    public final TargetAspectRatio v = new TargetAspectRatio();
    public final ResolutionCorrector w = new ResolutionCorrector();

    @RequiresApi
    public static class Api23Impl {
    }

    @AutoValue
    public static abstract class FeatureSettings {
        public abstract int a();

        public abstract int b();

        public abstract boolean c();

        public abstract boolean d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.util.List] */
    public SupportedSurfaceCombination(Context context, String str, CameraManagerCompat cameraManagerCompat, CamcorderProfileHelper camcorderProfileHelper) throws CameraUnavailableException, NumberFormatException {
        boolean z;
        boolean z2;
        ArrayList arrayListSingletonList;
        long[] jArr;
        SurfaceConfig.ConfigSize configSize;
        int[] iArr;
        boolean z3;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = false;
        str.getClass();
        this.i = str;
        camcorderProfileHelper.getClass();
        this.j = camcorderProfileHelper;
        this.l = new ExtraSupportedSurfaceCombinationsContainer();
        this.u = DisplayInfoManager.b(context);
        try {
            CameraCharacteristicsCompat cameraCharacteristicsCompatB = cameraManagerCompat.b(str);
            this.k = cameraCharacteristicsCompatB;
            Integer num = (Integer) cameraCharacteristicsCompatB.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.m = num != null ? num.intValue() : 2;
            int[] iArr2 = (int[]) cameraCharacteristicsCompatB.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr2 != null) {
                for (int i : iArr2) {
                    if (i == 3) {
                        this.n = true;
                    } else if (i == 6) {
                        this.o = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i == 16) {
                        this.r = true;
                    }
                }
            }
            DynamicRangeResolver dynamicRangeResolver = new DynamicRangeResolver(this.k);
            this.x = dynamicRangeResolver;
            ArrayList arrayList = this.f282a;
            int i2 = this.m;
            boolean z4 = this.n;
            boolean z5 = this.o;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            SurfaceCombination surfaceCombination = new SurfaceCombination();
            SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.d;
            SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.MAXIMUM;
            SurfaceCombination surfaceCombinationF = android.support.v4.media.session.a.f(configType, configSize2, surfaceCombination, arrayList3, surfaceCombination);
            SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.f;
            SurfaceCombination surfaceCombinationF2 = android.support.v4.media.session.a.f(configType2, configSize2, surfaceCombinationF, arrayList3, surfaceCombinationF);
            SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.e;
            SurfaceCombination surfaceCombinationF3 = android.support.v4.media.session.a.f(configType3, configSize2, surfaceCombinationF2, arrayList3, surfaceCombinationF2);
            SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.PREVIEW;
            android.support.v4.media.session.a.B(configType, configSize3, surfaceCombinationF3, configType2, configSize2);
            SurfaceCombination surfaceCombinationG = android.support.v4.media.session.a.g(arrayList3, surfaceCombinationF3);
            android.support.v4.media.session.a.B(configType3, configSize3, surfaceCombinationG, configType2, configSize2);
            SurfaceCombination surfaceCombinationG2 = android.support.v4.media.session.a.g(arrayList3, surfaceCombinationG);
            android.support.v4.media.session.a.B(configType, configSize3, surfaceCombinationG2, configType, configSize3);
            SurfaceCombination surfaceCombinationG3 = android.support.v4.media.session.a.g(arrayList3, surfaceCombinationG2);
            android.support.v4.media.session.a.B(configType, configSize3, surfaceCombinationG3, configType3, configSize3);
            SurfaceCombination surfaceCombinationG4 = android.support.v4.media.session.a.g(arrayList3, surfaceCombinationG3);
            android.support.v4.media.session.a.B(configType, configSize3, surfaceCombinationG4, configType3, configSize3);
            surfaceCombinationG4.a(SurfaceConfig.a(configType2, configSize2));
            arrayList3.add(surfaceCombinationG4);
            arrayList2.addAll(arrayList3);
            SurfaceConfig.ConfigSize configSize4 = SurfaceConfig.ConfigSize.RECORD;
            if (i2 == 0 || i2 == 1 || i2 == 3) {
                ArrayList arrayList4 = new ArrayList();
                SurfaceCombination surfaceCombination2 = new SurfaceCombination();
                android.support.v4.media.session.a.B(configType, configSize3, surfaceCombination2, configType, configSize4);
                SurfaceCombination surfaceCombinationG5 = android.support.v4.media.session.a.g(arrayList4, surfaceCombination2);
                android.support.v4.media.session.a.B(configType, configSize3, surfaceCombinationG5, configType3, configSize4);
                SurfaceCombination surfaceCombinationG6 = android.support.v4.media.session.a.g(arrayList4, surfaceCombinationG5);
                android.support.v4.media.session.a.B(configType3, configSize3, surfaceCombinationG6, configType3, configSize4);
                SurfaceCombination surfaceCombinationG7 = android.support.v4.media.session.a.g(arrayList4, surfaceCombinationG6);
                android.support.v4.media.session.a.B(configType, configSize3, surfaceCombinationG7, configType, configSize4);
                SurfaceCombination surfaceCombinationF4 = android.support.v4.media.session.a.f(configType2, configSize4, surfaceCombinationG7, arrayList4, surfaceCombinationG7);
                android.support.v4.media.session.a.B(configType, configSize3, surfaceCombinationF4, configType3, configSize4);
                SurfaceCombination surfaceCombinationF5 = android.support.v4.media.session.a.f(configType2, configSize4, surfaceCombinationF4, arrayList4, surfaceCombinationF4);
                android.support.v4.media.session.a.B(configType3, configSize3, surfaceCombinationF5, configType3, configSize3);
                surfaceCombinationF5.a(SurfaceConfig.a(configType2, configSize2));
                arrayList4.add(surfaceCombinationF5);
                arrayList2.addAll(arrayList4);
            }
            SurfaceConfig.ConfigSize configSize5 = SurfaceConfig.ConfigSize.VGA;
            if (i2 == 1 || i2 == 3) {
                ArrayList arrayList5 = new ArrayList();
                SurfaceCombination surfaceCombination3 = new SurfaceCombination();
                android.support.v4.media.session.a.B(configType, configSize3, surfaceCombination3, configType, configSize2);
                SurfaceCombination surfaceCombinationG8 = android.support.v4.media.session.a.g(arrayList5, surfaceCombination3);
                android.support.v4.media.session.a.B(configType, configSize3, surfaceCombinationG8, configType3, configSize2);
                SurfaceCombination surfaceCombinationG9 = android.support.v4.media.session.a.g(arrayList5, surfaceCombinationG8);
                android.support.v4.media.session.a.B(configType3, configSize3, surfaceCombinationG9, configType3, configSize2);
                SurfaceCombination surfaceCombinationG10 = android.support.v4.media.session.a.g(arrayList5, surfaceCombinationG9);
                android.support.v4.media.session.a.B(configType, configSize3, surfaceCombinationG10, configType, configSize3);
                SurfaceCombination surfaceCombinationF6 = android.support.v4.media.session.a.f(configType2, configSize2, surfaceCombinationG10, arrayList5, surfaceCombinationG10);
                android.support.v4.media.session.a.B(configType3, configSize5, surfaceCombinationF6, configType, configSize3);
                SurfaceCombination surfaceCombinationF7 = android.support.v4.media.session.a.f(configType3, configSize2, surfaceCombinationF6, arrayList5, surfaceCombinationF6);
                android.support.v4.media.session.a.B(configType3, configSize5, surfaceCombinationF7, configType3, configSize3);
                z = z4;
                surfaceCombinationF7.a(SurfaceConfig.a(configType3, configSize2));
                arrayList5.add(surfaceCombinationF7);
                arrayList2.addAll(arrayList5);
            } else {
                z = z4;
            }
            SurfaceConfig.ConfigType configType4 = SurfaceConfig.ConfigType.h;
            if (z) {
                ArrayList arrayList6 = new ArrayList();
                SurfaceCombination surfaceCombination4 = new SurfaceCombination();
                SurfaceCombination surfaceCombinationF8 = android.support.v4.media.session.a.f(configType4, configSize2, surfaceCombination4, arrayList6, surfaceCombination4);
                android.support.v4.media.session.a.B(configType, configSize3, surfaceCombinationF8, configType4, configSize2);
                SurfaceCombination surfaceCombinationG11 = android.support.v4.media.session.a.g(arrayList6, surfaceCombinationF8);
                android.support.v4.media.session.a.B(configType3, configSize3, surfaceCombinationG11, configType4, configSize2);
                SurfaceCombination surfaceCombinationG12 = android.support.v4.media.session.a.g(arrayList6, surfaceCombinationG11);
                android.support.v4.media.session.a.B(configType, configSize3, surfaceCombinationG12, configType, configSize3);
                SurfaceCombination surfaceCombinationF9 = android.support.v4.media.session.a.f(configType4, configSize2, surfaceCombinationG12, arrayList6, surfaceCombinationG12);
                android.support.v4.media.session.a.B(configType, configSize3, surfaceCombinationF9, configType3, configSize3);
                SurfaceCombination surfaceCombinationF10 = android.support.v4.media.session.a.f(configType4, configSize2, surfaceCombinationF9, arrayList6, surfaceCombinationF9);
                android.support.v4.media.session.a.B(configType3, configSize3, surfaceCombinationF10, configType3, configSize3);
                SurfaceCombination surfaceCombinationF11 = android.support.v4.media.session.a.f(configType4, configSize2, surfaceCombinationF10, arrayList6, surfaceCombinationF10);
                android.support.v4.media.session.a.B(configType, configSize3, surfaceCombinationF11, configType2, configSize2);
                SurfaceCombination surfaceCombinationF12 = android.support.v4.media.session.a.f(configType4, configSize2, surfaceCombinationF11, arrayList6, surfaceCombinationF11);
                android.support.v4.media.session.a.B(configType3, configSize3, surfaceCombinationF12, configType2, configSize2);
                z2 = z5;
                surfaceCombinationF12.a(SurfaceConfig.a(configType4, configSize2));
                arrayList6.add(surfaceCombinationF12);
                arrayList2.addAll(arrayList6);
            } else {
                z2 = z5;
            }
            if (z2 && i2 == 0) {
                ArrayList arrayList7 = new ArrayList();
                SurfaceCombination surfaceCombination5 = new SurfaceCombination();
                android.support.v4.media.session.a.B(configType, configSize3, surfaceCombination5, configType, configSize2);
                SurfaceCombination surfaceCombinationG13 = android.support.v4.media.session.a.g(arrayList7, surfaceCombination5);
                android.support.v4.media.session.a.B(configType, configSize3, surfaceCombinationG13, configType3, configSize2);
                SurfaceCombination surfaceCombinationG14 = android.support.v4.media.session.a.g(arrayList7, surfaceCombinationG13);
                android.support.v4.media.session.a.B(configType3, configSize3, surfaceCombinationG14, configType3, configSize2);
                arrayList7.add(surfaceCombinationG14);
                arrayList2.addAll(arrayList7);
            }
            if (i2 == 3) {
                ArrayList arrayList8 = new ArrayList();
                SurfaceCombination surfaceCombination6 = new SurfaceCombination();
                android.support.v4.media.session.a.B(configType, configSize3, surfaceCombination6, configType, configSize5);
                android.support.v4.media.session.a.B(configType3, configSize2, surfaceCombination6, configType4, configSize2);
                SurfaceCombination surfaceCombinationG15 = android.support.v4.media.session.a.g(arrayList8, surfaceCombination6);
                android.support.v4.media.session.a.B(configType, configSize3, surfaceCombinationG15, configType, configSize5);
                android.support.v4.media.session.a.B(configType2, configSize2, surfaceCombinationG15, configType4, configSize2);
                arrayList8.add(surfaceCombinationG15);
                arrayList2.addAll(arrayList8);
            }
            arrayList.addAll(arrayList2);
            ExtraSupportedSurfaceCombinationsContainer extraSupportedSurfaceCombinationsContainer = this.l;
            String str2 = this.i;
            if (extraSupportedSurfaceCombinationsContainer.f352a == null) {
                arrayListSingletonList = new ArrayList();
            } else {
                SurfaceCombination surfaceCombination7 = ExtraSupportedSurfaceCombinationsQuirk.f330a;
                String str3 = Build.DEVICE;
                if ("heroqltevzw".equalsIgnoreCase(str3) || "heroqltetmo".equalsIgnoreCase(str3)) {
                    ArrayList arrayList9 = new ArrayList();
                    arrayListSingletonList = arrayList9;
                    if (str2.equals("1")) {
                        arrayList9.add(ExtraSupportedSurfaceCombinationsQuirk.f330a);
                        arrayListSingletonList = arrayList9;
                    }
                } else {
                    arrayListSingletonList = ((!"google".equalsIgnoreCase(Build.BRAND) ? false : ExtraSupportedSurfaceCombinationsQuirk.c.contains(Build.MODEL.toUpperCase(Locale.US))) || ExtraSupportedSurfaceCombinationsQuirk.e()) ? Collections.singletonList(ExtraSupportedSurfaceCombinationsQuirk.b) : Collections.EMPTY_LIST;
                }
            }
            arrayList.addAll(arrayListSingletonList);
            if (this.r) {
                ArrayList arrayList10 = this.b;
                ArrayList arrayList11 = new ArrayList();
                SurfaceCombination surfaceCombination8 = new SurfaceCombination();
                SurfaceConfig.ConfigSize configSize6 = SurfaceConfig.ConfigSize.ULTRA_MAXIMUM;
                android.support.v4.media.session.a.B(configType3, configSize6, surfaceCombination8, configType, configSize3);
                SurfaceCombination surfaceCombinationF13 = android.support.v4.media.session.a.f(configType, configSize4, surfaceCombination8, arrayList11, surfaceCombination8);
                android.support.v4.media.session.a.B(configType2, configSize6, surfaceCombinationF13, configType, configSize3);
                SurfaceCombination surfaceCombinationF14 = android.support.v4.media.session.a.f(configType, configSize4, surfaceCombinationF13, arrayList11, surfaceCombinationF13);
                android.support.v4.media.session.a.B(configType4, configSize6, surfaceCombinationF14, configType, configSize3);
                SurfaceCombination surfaceCombinationF15 = android.support.v4.media.session.a.f(configType, configSize4, surfaceCombinationF14, arrayList11, surfaceCombinationF14);
                android.support.v4.media.session.a.B(configType3, configSize6, surfaceCombinationF15, configType, configSize3);
                SurfaceCombination surfaceCombinationF16 = android.support.v4.media.session.a.f(configType2, configSize2, surfaceCombinationF15, arrayList11, surfaceCombinationF15);
                android.support.v4.media.session.a.B(configType2, configSize6, surfaceCombinationF16, configType, configSize3);
                SurfaceCombination surfaceCombinationF17 = android.support.v4.media.session.a.f(configType2, configSize2, surfaceCombinationF16, arrayList11, surfaceCombinationF16);
                android.support.v4.media.session.a.B(configType4, configSize6, surfaceCombinationF17, configType, configSize3);
                SurfaceCombination surfaceCombinationF18 = android.support.v4.media.session.a.f(configType2, configSize2, surfaceCombinationF17, arrayList11, surfaceCombinationF17);
                android.support.v4.media.session.a.B(configType3, configSize6, surfaceCombinationF18, configType, configSize3);
                SurfaceCombination surfaceCombinationF19 = android.support.v4.media.session.a.f(configType3, configSize2, surfaceCombinationF18, arrayList11, surfaceCombinationF18);
                android.support.v4.media.session.a.B(configType2, configSize6, surfaceCombinationF19, configType, configSize3);
                SurfaceCombination surfaceCombinationF20 = android.support.v4.media.session.a.f(configType3, configSize2, surfaceCombinationF19, arrayList11, surfaceCombinationF19);
                android.support.v4.media.session.a.B(configType4, configSize6, surfaceCombinationF20, configType, configSize3);
                SurfaceCombination surfaceCombinationF21 = android.support.v4.media.session.a.f(configType3, configSize2, surfaceCombinationF20, arrayList11, surfaceCombinationF20);
                android.support.v4.media.session.a.B(configType3, configSize6, surfaceCombinationF21, configType, configSize3);
                SurfaceCombination surfaceCombinationF22 = android.support.v4.media.session.a.f(configType4, configSize2, surfaceCombinationF21, arrayList11, surfaceCombinationF21);
                android.support.v4.media.session.a.B(configType2, configSize6, surfaceCombinationF22, configType, configSize3);
                SurfaceCombination surfaceCombinationF23 = android.support.v4.media.session.a.f(configType4, configSize2, surfaceCombinationF22, arrayList11, surfaceCombinationF22);
                android.support.v4.media.session.a.B(configType4, configSize6, surfaceCombinationF23, configType, configSize3);
                surfaceCombinationF23.a(SurfaceConfig.a(configType4, configSize2));
                arrayList11.add(surfaceCombinationF23);
                arrayList10.addAll(arrayList11);
            }
            boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.p = zHasSystemFeature;
            SurfaceConfig.ConfigSize configSize7 = SurfaceConfig.ConfigSize.s1440p;
            if (zHasSystemFeature) {
                ArrayList arrayList12 = this.c;
                ArrayList arrayList13 = new ArrayList();
                SurfaceCombination surfaceCombination9 = new SurfaceCombination();
                SurfaceCombination surfaceCombinationF24 = android.support.v4.media.session.a.f(configType3, configSize7, surfaceCombination9, arrayList13, surfaceCombination9);
                SurfaceCombination surfaceCombinationF25 = android.support.v4.media.session.a.f(configType, configSize7, surfaceCombinationF24, arrayList13, surfaceCombinationF24);
                SurfaceCombination surfaceCombinationF26 = android.support.v4.media.session.a.f(configType2, configSize7, surfaceCombinationF25, arrayList13, surfaceCombinationF25);
                SurfaceConfig.ConfigSize configSize8 = SurfaceConfig.ConfigSize.s720p;
                android.support.v4.media.session.a.B(configType3, configSize8, surfaceCombinationF26, configType2, configSize7);
                SurfaceCombination surfaceCombinationG16 = android.support.v4.media.session.a.g(arrayList13, surfaceCombinationF26);
                android.support.v4.media.session.a.B(configType, configSize8, surfaceCombinationG16, configType2, configSize7);
                SurfaceCombination surfaceCombinationG17 = android.support.v4.media.session.a.g(arrayList13, surfaceCombinationG16);
                android.support.v4.media.session.a.B(configType3, configSize8, surfaceCombinationG17, configType3, configSize7);
                SurfaceCombination surfaceCombinationG18 = android.support.v4.media.session.a.g(arrayList13, surfaceCombinationG17);
                android.support.v4.media.session.a.B(configType3, configSize8, surfaceCombinationG18, configType, configSize7);
                SurfaceCombination surfaceCombinationG19 = android.support.v4.media.session.a.g(arrayList13, surfaceCombinationG18);
                android.support.v4.media.session.a.B(configType, configSize8, surfaceCombinationG19, configType3, configSize7);
                SurfaceCombination surfaceCombinationG20 = android.support.v4.media.session.a.g(arrayList13, surfaceCombinationG19);
                android.support.v4.media.session.a.B(configType, configSize8, surfaceCombinationG20, configType, configSize7);
                arrayList13.add(surfaceCombinationG20);
                arrayList12.addAll(arrayList13);
            }
            if (dynamicRangeResolver.c) {
                ArrayList arrayList14 = this.f;
                ArrayList arrayList15 = new ArrayList();
                SurfaceCombination surfaceCombination10 = new SurfaceCombination();
                SurfaceCombination surfaceCombinationF27 = android.support.v4.media.session.a.f(configType, configSize2, surfaceCombination10, arrayList15, surfaceCombination10);
                SurfaceCombination surfaceCombinationF28 = android.support.v4.media.session.a.f(configType3, configSize2, surfaceCombinationF27, arrayList15, surfaceCombinationF27);
                android.support.v4.media.session.a.B(configType, configSize3, surfaceCombinationF28, configType2, configSize2);
                SurfaceCombination surfaceCombinationG21 = android.support.v4.media.session.a.g(arrayList15, surfaceCombinationF28);
                android.support.v4.media.session.a.B(configType, configSize3, surfaceCombinationG21, configType3, configSize2);
                SurfaceCombination surfaceCombinationG22 = android.support.v4.media.session.a.g(arrayList15, surfaceCombinationG21);
                android.support.v4.media.session.a.B(configType3, configSize3, surfaceCombinationG22, configType3, configSize2);
                SurfaceCombination surfaceCombinationG23 = android.support.v4.media.session.a.g(arrayList15, surfaceCombinationG22);
                android.support.v4.media.session.a.B(configType, configSize3, surfaceCombinationG23, configType, configSize4);
                SurfaceCombination surfaceCombinationG24 = android.support.v4.media.session.a.g(arrayList15, surfaceCombinationG23);
                android.support.v4.media.session.a.B(configType, configSize3, surfaceCombinationG24, configType, configSize4);
                SurfaceCombination surfaceCombinationF29 = android.support.v4.media.session.a.f(configType3, configSize4, surfaceCombinationG24, arrayList15, surfaceCombinationG24);
                android.support.v4.media.session.a.B(configType, configSize3, surfaceCombinationF29, configType, configSize4);
                surfaceCombinationF29.a(SurfaceConfig.a(configType2, configSize4));
                arrayList15.add(surfaceCombinationF29);
                arrayList14.addAll(arrayList15);
            }
            int[] iArrA = this.k.b().a();
            if (iArrA != null) {
                int length = iArrA.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    if (iArrA[i3] == 4101) {
                        ArrayList arrayList16 = this.g;
                        ArrayList arrayList17 = new ArrayList();
                        SurfaceCombination surfaceCombination11 = new SurfaceCombination();
                        SurfaceConfig.ConfigType configType5 = SurfaceConfig.ConfigType.g;
                        SurfaceCombination surfaceCombinationF30 = android.support.v4.media.session.a.f(configType5, configSize2, surfaceCombination11, arrayList17, surfaceCombination11);
                        android.support.v4.media.session.a.B(configType, configSize3, surfaceCombinationF30, configType5, configSize2);
                        arrayList17.add(surfaceCombinationF30);
                        arrayList16.addAll(arrayList17);
                        break;
                    }
                    i3++;
                }
            }
            CameraCharacteristicsCompat cameraCharacteristicsCompat = this.k;
            Config.Option option = StreamUseCaseUtil.f281a;
            int i4 = Build.VERSION.SDK_INT;
            boolean z6 = (i4 < 33 || (jArr = (long[]) cameraCharacteristicsCompat.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) ? false : true;
            this.q = z6;
            if (!z6 || i4 < 33) {
                configSize = configSize7;
            } else {
                ArrayList arrayList18 = this.h;
                ArrayList arrayList19 = new ArrayList();
                SurfaceCombination surfaceCombination12 = new SurfaceCombination();
                surfaceCombination12.a(SurfaceConfig.b(configType, configSize7, 4L));
                arrayList19.add(surfaceCombination12);
                SurfaceCombination surfaceCombination13 = new SurfaceCombination();
                surfaceCombination13.a(SurfaceConfig.b(configType3, configSize7, 4L));
                arrayList19.add(surfaceCombination13);
                SurfaceCombination surfaceCombination14 = new SurfaceCombination();
                surfaceCombination14.a(SurfaceConfig.b(configType, configSize4, 3L));
                arrayList19.add(surfaceCombination14);
                SurfaceCombination surfaceCombination15 = new SurfaceCombination();
                surfaceCombination15.a(SurfaceConfig.b(configType3, configSize4, 3L));
                arrayList19.add(surfaceCombination15);
                SurfaceCombination surfaceCombination16 = new SurfaceCombination();
                surfaceCombination16.a(SurfaceConfig.b(configType2, configSize2, 2L));
                arrayList19.add(surfaceCombination16);
                SurfaceCombination surfaceCombination17 = new SurfaceCombination();
                surfaceCombination17.a(SurfaceConfig.b(configType3, configSize2, 2L));
                arrayList19.add(surfaceCombination17);
                SurfaceCombination surfaceCombination18 = new SurfaceCombination();
                surfaceCombination18.a(SurfaceConfig.b(configType, configSize3, 1L));
                surfaceCombination18.a(SurfaceConfig.b(configType2, configSize2, 2L));
                arrayList19.add(surfaceCombination18);
                SurfaceCombination surfaceCombination19 = new SurfaceCombination();
                configSize = configSize7;
                surfaceCombination19.a(SurfaceConfig.b(configType, configSize3, 1L));
                surfaceCombination19.a(SurfaceConfig.b(configType3, configSize2, 2L));
                arrayList19.add(surfaceCombination19);
                SurfaceCombination surfaceCombination20 = new SurfaceCombination();
                surfaceCombination20.a(SurfaceConfig.b(configType, configSize3, 1L));
                surfaceCombination20.a(SurfaceConfig.b(configType, configSize4, 3L));
                arrayList19.add(surfaceCombination20);
                SurfaceCombination surfaceCombination21 = new SurfaceCombination();
                surfaceCombination21.a(SurfaceConfig.b(configType, configSize3, 1L));
                surfaceCombination21.a(SurfaceConfig.b(configType3, configSize4, 3L));
                arrayList19.add(surfaceCombination21);
                SurfaceCombination surfaceCombination22 = new SurfaceCombination();
                surfaceCombination22.a(SurfaceConfig.b(configType, configSize3, 1L));
                surfaceCombination22.a(SurfaceConfig.b(configType3, configSize3, 1L));
                arrayList19.add(surfaceCombination22);
                SurfaceCombination surfaceCombination23 = new SurfaceCombination();
                surfaceCombination23.a(SurfaceConfig.b(configType, configSize3, 1L));
                surfaceCombination23.a(SurfaceConfig.b(configType, configSize4, 3L));
                surfaceCombination23.a(SurfaceConfig.b(configType2, configSize4, 2L));
                arrayList19.add(surfaceCombination23);
                SurfaceCombination surfaceCombination24 = new SurfaceCombination();
                surfaceCombination24.a(SurfaceConfig.b(configType, configSize3, 1L));
                surfaceCombination24.a(SurfaceConfig.b(configType3, configSize4, 3L));
                surfaceCombination24.a(SurfaceConfig.b(configType2, configSize4, 2L));
                arrayList19.add(surfaceCombination24);
                SurfaceCombination surfaceCombination25 = new SurfaceCombination();
                surfaceCombination25.a(SurfaceConfig.b(configType, configSize3, 1L));
                surfaceCombination25.a(SurfaceConfig.b(configType3, configSize3, 1L));
                surfaceCombination25.a(SurfaceConfig.b(configType2, configSize2, 2L));
                arrayList19.add(surfaceCombination25);
                arrayList18.addAll(arrayList19);
            }
            CameraCharacteristicsCompat cameraCharacteristicsCompat2 = this.k;
            if (i4 < 33 || (iArr = (int[]) cameraCharacteristicsCompat2.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) == null || iArr.length == 0) {
                z3 = false;
            } else {
                for (int i5 : iArr) {
                    if (i5 == 2) {
                        z3 = true;
                        break;
                    }
                }
                z3 = false;
            }
            if (z3 && Build.VERSION.SDK_INT >= 33) {
                ArrayList arrayList20 = this.d;
                ArrayList arrayList21 = new ArrayList();
                SurfaceCombination surfaceCombination26 = new SurfaceCombination();
                SurfaceConfig.ConfigSize configSize9 = configSize;
                SurfaceCombination surfaceCombinationF31 = android.support.v4.media.session.a.f(configType, configSize9, surfaceCombination26, arrayList21, surfaceCombination26);
                SurfaceCombination surfaceCombinationF32 = android.support.v4.media.session.a.f(configType3, configSize9, surfaceCombinationF31, arrayList21, surfaceCombinationF31);
                android.support.v4.media.session.a.B(configType, configSize9, surfaceCombinationF32, configType2, configSize2);
                SurfaceCombination surfaceCombinationG25 = android.support.v4.media.session.a.g(arrayList21, surfaceCombinationF32);
                android.support.v4.media.session.a.B(configType3, configSize9, surfaceCombinationG25, configType2, configSize2);
                SurfaceCombination surfaceCombinationG26 = android.support.v4.media.session.a.g(arrayList21, surfaceCombinationG25);
                android.support.v4.media.session.a.B(configType, configSize9, surfaceCombinationG26, configType3, configSize2);
                SurfaceCombination surfaceCombinationG27 = android.support.v4.media.session.a.g(arrayList21, surfaceCombinationG26);
                android.support.v4.media.session.a.B(configType3, configSize9, surfaceCombinationG27, configType3, configSize2);
                SurfaceCombination surfaceCombinationG28 = android.support.v4.media.session.a.g(arrayList21, surfaceCombinationG27);
                android.support.v4.media.session.a.B(configType, configSize3, surfaceCombinationG28, configType, configSize9);
                SurfaceCombination surfaceCombinationG29 = android.support.v4.media.session.a.g(arrayList21, surfaceCombinationG28);
                android.support.v4.media.session.a.B(configType3, configSize3, surfaceCombinationG29, configType, configSize9);
                SurfaceCombination surfaceCombinationG30 = android.support.v4.media.session.a.g(arrayList21, surfaceCombinationG29);
                android.support.v4.media.session.a.B(configType, configSize3, surfaceCombinationG30, configType3, configSize9);
                SurfaceCombination surfaceCombinationG31 = android.support.v4.media.session.a.g(arrayList21, surfaceCombinationG30);
                android.support.v4.media.session.a.B(configType3, configSize3, surfaceCombinationG31, configType3, configSize9);
                arrayList21.add(surfaceCombinationG31);
                arrayList20.addAll(arrayList21);
            }
            b();
        } catch (CameraAccessExceptionCompat e) {
            throw new CameraUnavailableException(e);
        }
    }

    public static Size c(StreamConfigurationMap streamConfigurationMap, int i, boolean z) {
        Size[] highResolutionOutputSizes;
        Size[] outputSizes = i == 34 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i);
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        CompareSizesByArea compareSizesByArea = new CompareSizesByArea(false);
        Size size = (Size) Collections.max(Arrays.asList(outputSizes), compareSizesByArea);
        Size size2 = SizeUtil.f543a;
        if (z && (highResolutionOutputSizes = streamConfigurationMap.getHighResolutionOutputSizes(i)) != null && highResolutionOutputSizes.length > 0) {
            size2 = (Size) Collections.max(Arrays.asList(highResolutionOutputSizes), compareSizesByArea);
        }
        return (Size) Collections.max(Arrays.asList(size, size2), compareSizesByArea);
    }

    public static int e(Range range, Range range2) {
        Preconditions.f("Ranges must not intersect", (range.contains((Range) range2.getUpper()) || range.contains((Range) range2.getLower())) ? false : true);
        return ((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue() ? ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue() : ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    public static int f(Range range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    public final boolean a(AutoValue_SupportedSurfaceCombination_FeatureSettings autoValue_SupportedSurfaceCombination_FeatureSettings, List list) {
        ArrayList arrayList;
        List list2;
        int i = autoValue_SupportedSurfaceCombination_FeatureSettings.f226a;
        HashMap map = this.e;
        if (map.containsKey(autoValue_SupportedSurfaceCombination_FeatureSettings)) {
            list2 = (List) map.get(autoValue_SupportedSurfaceCombination_FeatureSettings);
        } else {
            ArrayList arrayList2 = new ArrayList();
            if (!autoValue_SupportedSurfaceCombination_FeatureSettings.d) {
                int i2 = autoValue_SupportedSurfaceCombination_FeatureSettings.b;
                if (i2 == 8) {
                    if (i != 1) {
                        ArrayList arrayList3 = this.f282a;
                        if (i != 2) {
                            if (autoValue_SupportedSurfaceCombination_FeatureSettings.c) {
                                arrayList3 = this.d;
                            }
                            arrayList2.addAll(arrayList3);
                        } else {
                            arrayList2.addAll(this.b);
                            arrayList2.addAll(arrayList3);
                        }
                    } else {
                        arrayList = this.c;
                        map.put(autoValue_SupportedSurfaceCombination_FeatureSettings, arrayList);
                        list2 = arrayList;
                    }
                } else if (i2 == 10 && i == 0) {
                    arrayList2.addAll(this.f);
                }
            } else if (i == 0) {
                arrayList2.addAll(this.g);
            }
            arrayList = arrayList2;
            map.put(autoValue_SupportedSurfaceCombination_FeatureSettings, arrayList);
            list2 = arrayList;
        }
        Iterator it = list2.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z = ((SurfaceCombination) it.next()).c(list) != null;
            if (z) {
                break;
            }
        }
        return z;
    }

    public final void b() throws NumberFormatException {
        Size size;
        Size size2;
        Size size3;
        int i;
        CamcorderProfileHelper camcorderProfileHelper;
        CamcorderProfile camcorderProfileA;
        CamcorderProfile camcorderProfileA2;
        Size sizeE = this.u.e();
        try {
            i = Integer.parseInt(this.i);
            camcorderProfileHelper = this.j;
            camcorderProfileA = null;
            camcorderProfileA2 = camcorderProfileHelper.b(i, 1) ? camcorderProfileHelper.a(i, 1) : null;
        } catch (NumberFormatException unused) {
            Size[] outputSizes = this.k.b().c().getOutputSizes(MediaRecorder.class);
            if (outputSizes == null) {
                size = SizeUtil.d;
            } else {
                Arrays.sort(outputSizes, new CompareSizesByArea(true));
                for (Size size4 : outputSizes) {
                    int width = size4.getWidth();
                    Size size5 = SizeUtil.f;
                    if (width <= size5.getWidth() && size4.getHeight() <= size5.getHeight()) {
                        size2 = size4;
                        break;
                    }
                }
                size = SizeUtil.d;
            }
            size2 = size;
        }
        if (camcorderProfileA2 != null) {
            size2 = new Size(camcorderProfileA2.videoFrameWidth, camcorderProfileA2.videoFrameHeight);
        } else {
            Size size6 = SizeUtil.d;
            if (camcorderProfileHelper.b(i, 10)) {
                camcorderProfileA = camcorderProfileHelper.a(i, 10);
            } else if (camcorderProfileHelper.b(i, 8)) {
                camcorderProfileA = camcorderProfileHelper.a(i, 8);
            } else if (camcorderProfileHelper.b(i, 12)) {
                camcorderProfileA = camcorderProfileHelper.a(i, 12);
            } else if (camcorderProfileHelper.b(i, 6)) {
                camcorderProfileA = camcorderProfileHelper.a(i, 6);
            } else if (camcorderProfileHelper.b(i, 5)) {
                camcorderProfileA = camcorderProfileHelper.a(i, 5);
            } else if (camcorderProfileHelper.b(i, 4)) {
                camcorderProfileA = camcorderProfileHelper.a(i, 4);
            }
            if (camcorderProfileA == null) {
                size3 = size6;
                this.s = SurfaceSizeDefinition.a(SizeUtil.c, new HashMap(), sizeE, new HashMap(), size3, new HashMap(), new HashMap());
            }
            size2 = new Size(camcorderProfileA.videoFrameWidth, camcorderProfileA.videoFrameHeight);
        }
        size3 = size2;
        this.s = SurfaceSizeDefinition.a(SizeUtil.c, new HashMap(), sizeE, new HashMap(), size3, new HashMap(), new HashMap());
    }

    public final List d(AutoValue_SupportedSurfaceCombination_FeatureSettings autoValue_SupportedSurfaceCombination_FeatureSettings, List list) {
        Config.Option option = StreamUseCaseUtil.f281a;
        if (autoValue_SupportedSurfaceCombination_FeatureSettings.f226a != 0 || autoValue_SupportedSurfaceCombination_FeatureSettings.b != 8) {
            return null;
        }
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            List listC = ((SurfaceCombination) it.next()).c(list);
            if (listC != null) {
                return listC;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:202:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0ad2  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0c19  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0ccc  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0d10  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x0da1  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x0538 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair g(int r32, java.util.ArrayList r33, java.util.HashMap r34, boolean r35, boolean r36) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 3702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.SupportedSurfaceCombination.g(int, java.util.ArrayList, java.util.HashMap, boolean, boolean):android.util.Pair");
    }

    public final Pair h(int i, ArrayList arrayList, List list, ArrayList arrayList2, ArrayList arrayList3, int i2, HashMap map, HashMap map2) {
        int outputMinFrameDuration;
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AttachedSurfaceInfo attachedSurfaceInfo = (AttachedSurfaceInfo) it.next();
            arrayList4.add(attachedSurfaceInfo.g());
            if (map != null) {
                map.put(Integer.valueOf(arrayList4.size() - 1), attachedSurfaceInfo);
            }
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            Size size = (Size) list.get(i3);
            UseCaseConfig useCaseConfig = (UseCaseConfig) arrayList2.get(((Integer) arrayList3.get(i3)).intValue());
            int iJ = useCaseConfig.j();
            arrayList4.add(SurfaceConfig.g(i, iJ, size, i(iJ)));
            if (map2 != null) {
                map2.put(Integer.valueOf(arrayList4.size() - 1), useCaseConfig);
            }
            try {
                outputMinFrameDuration = (int) (1.0E9d / ((StreamConfigurationMap) this.k.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(useCaseConfig.j(), size));
            } catch (Exception unused) {
                outputMinFrameDuration = 0;
            }
            i2 = Math.min(i2, outputMinFrameDuration);
        }
        return new Pair(arrayList4, Integer.valueOf(i2));
    }

    public final SurfaceSizeDefinition i(int i) {
        StreamConfigurationMap streamConfigurationMap;
        Integer numValueOf = Integer.valueOf(i);
        ArrayList arrayList = this.t;
        if (!arrayList.contains(numValueOf)) {
            j(this.s.g(), SizeUtil.e, i);
            j(this.s.f(), SizeUtil.g, i);
            Map mapC = this.s.c();
            CameraCharacteristicsCompat cameraCharacteristicsCompat = this.k;
            Size sizeC = c(cameraCharacteristicsCompat.b().c(), i, true);
            if (sizeC != null) {
                mapC.put(Integer.valueOf(i), sizeC);
            }
            Map mapH = this.s.h();
            if (Build.VERSION.SDK_INT >= 31 && this.r && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristicsCompat.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) != null) {
                mapH.put(Integer.valueOf(i), c(streamConfigurationMap, i, true));
            }
            arrayList.add(Integer.valueOf(i));
        }
        return this.s;
    }

    public final void j(Map map, Size size, int i) {
        if (this.p) {
            Size sizeC = c(this.k.b().c(), i, false);
            Integer numValueOf = Integer.valueOf(i);
            if (sizeC != null) {
                size = (Size) Collections.min(Arrays.asList(size, sizeC), new CompareSizesByArea(false));
            }
            map.put(numValueOf, size);
        }
    }
}
