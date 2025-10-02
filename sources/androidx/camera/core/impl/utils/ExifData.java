package androidx.camera.core.impl.utils;

import YU.a;
import android.os.Build;
import android.util.Pair;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureMetaData;
import androidx.core.util.Preconditions;
import com.google.android.gms.ads.RequestConfiguration;
import com.medallia.digital.mobilesdk.q2;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class ExifData {
    public static final ExifTag[] c;
    public static final ExifTag[][] d;
    public static final HashSet e;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f512a;
    public final ByteOrder b;

    /* renamed from: androidx.camera.core.impl.utils.ExifData$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f513a;

        static {
            int[] iArr = new int[CameraCaptureMetaData.FlashState.values().length];
            f513a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f513a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f513a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class Builder {
        public static final Pattern c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
        public static final Pattern d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        public static final Pattern e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        public static final ArrayList f;

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f514a;
        public final ByteOrder b;

        /* renamed from: androidx.camera.core.impl.utils.ExifData$Builder$1, reason: invalid class name */
        public class AnonymousClass1 implements Enumeration<HashMap<String, ExifTag>> {

            /* renamed from: a, reason: collision with root package name */
            public int f515a;

            @Override // java.util.Enumeration
            public final boolean hasMoreElements() {
                int i = this.f515a;
                ExifTag[] exifTagArr = ExifData.c;
                return i < 4;
            }

            @Override // java.util.Enumeration
            public final HashMap<String, ExifTag> nextElement() {
                HashMap<String, ExifTag> map = new HashMap<>();
                for (ExifTag exifTag : ExifData.d[this.f515a]) {
                    map.put(exifTag.b, exifTag);
                }
                this.f515a++;
                return map;
            }
        }

        /* renamed from: androidx.camera.core.impl.utils.ExifData$Builder$2, reason: invalid class name */
        public class AnonymousClass2 implements Enumeration<Map<String, ExifAttribute>> {

            /* renamed from: a, reason: collision with root package name */
            public int f516a;

            @Override // java.util.Enumeration
            public final boolean hasMoreElements() {
                int i = this.f516a;
                ExifTag[] exifTagArr = ExifData.c;
                return i < 4;
            }

            @Override // java.util.Enumeration
            public final Map<String, ExifAttribute> nextElement() {
                this.f516a++;
                return new HashMap();
            }
        }

        static {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1();
            anonymousClass1.f515a = 0;
            f = Collections.list(anonymousClass1);
        }

        public Builder() {
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2();
            anonymousClass2.f516a = 0;
            this.f514a = Collections.list(anonymousClass2);
            this.b = byteOrder;
        }

        public static Pair a(String str) throws NumberFormatException {
            if (str.contains(",")) {
                String[] strArrSplit = str.split(",", -1);
                Pair pairA = a(strArrSplit[0]);
                if (((Integer) pairA.first).intValue() == 2) {
                    return pairA;
                }
                for (int i = 1; i < strArrSplit.length; i++) {
                    Pair pairA2 = a(strArrSplit[i]);
                    int iIntValue = (((Integer) pairA2.first).equals(pairA.first) || ((Integer) pairA2.second).equals(pairA.first)) ? ((Integer) pairA.first).intValue() : -1;
                    int iIntValue2 = (((Integer) pairA.second).intValue() == -1 || !(((Integer) pairA2.first).equals(pairA.second) || ((Integer) pairA2.second).equals(pairA.second))) ? -1 : ((Integer) pairA.second).intValue();
                    if (iIntValue == -1 && iIntValue2 == -1) {
                        return new Pair(2, -1);
                    }
                    if (iIntValue == -1) {
                        pairA = new Pair(Integer.valueOf(iIntValue2), -1);
                    } else if (iIntValue2 == -1) {
                        pairA = new Pair(Integer.valueOf(iIntValue), -1);
                    }
                }
                return pairA;
            }
            if (!str.contains(q2.c)) {
                try {
                    try {
                        long j = Long.parseLong(str);
                        return (j < 0 || j > 65535) ? j < 0 ? new Pair(9, -1) : new Pair(4, -1) : new Pair(3, 4);
                    } catch (NumberFormatException unused) {
                        Double.parseDouble(str);
                        return new Pair(12, -1);
                    }
                } catch (NumberFormatException unused2) {
                    return new Pair(2, -1);
                }
            }
            String[] strArrSplit2 = str.split(q2.c, -1);
            if (strArrSplit2.length == 2) {
                try {
                    long j2 = (long) Double.parseDouble(strArrSplit2[0]);
                    long j3 = (long) Double.parseDouble(strArrSplit2[1]);
                    if (j2 >= 0 && j3 >= 0) {
                        if (j2 <= 2147483647L && j3 <= 2147483647L) {
                            return new Pair(10, 5);
                        }
                        return new Pair(5, -1);
                    }
                    return new Pair(10, -1);
                } catch (NumberFormatException unused3) {
                }
            }
            return new Pair(2, -1);
        }

        public final void b(String str, String str2, ArrayList arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((Map) it.next()).containsKey(str)) {
                    return;
                }
            }
            c(str, str2, arrayList);
        }

        /* JADX WARN: Code restructure failed: missing block: B:61:0x0171, code lost:
        
            if (r6 != r7) goto L45;
         */
        /* JADX WARN: Removed duplicated region for block: B:101:0x0312  */
        /* JADX WARN: Removed duplicated region for block: B:106:0x033c  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x0389  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x03af  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x017f  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0183  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x01d6  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0250  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x02a1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c(java.lang.String r21, java.lang.String r22, java.util.List r23) {
            /*
                Method dump skipped, instructions count: 1054
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.ExifData.Builder.c(java.lang.String, java.lang.String, java.util.List):void");
        }

        public final void d(float f2) {
            c("FocalLength", new LongRational((long) (f2 * 1000.0f), 1000L).toString(), this.f514a);
        }

        public final void e(int i) {
            int i2;
            if (i == 0) {
                i2 = 1;
            } else if (i == 90) {
                i2 = 6;
            } else if (i == 180) {
                i2 = 3;
            } else if (i != 270) {
                Logger.e("ExifData", "Unexpected orientation value: " + i + ". Must be one of 0, 90, 180, 270.");
                i2 = 0;
            } else {
                i2 = 8;
            }
            c("Orientation", String.valueOf(i2), this.f514a);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class WhiteBalanceMode {
        public static final WhiteBalanceMode d;
        public static final WhiteBalanceMode e;
        public static final /* synthetic */ WhiteBalanceMode[] f;

        static {
            WhiteBalanceMode whiteBalanceMode = new WhiteBalanceMode("AUTO", 0);
            d = whiteBalanceMode;
            WhiteBalanceMode whiteBalanceMode2 = new WhiteBalanceMode("MANUAL", 1);
            e = whiteBalanceMode2;
            f = new WhiteBalanceMode[]{whiteBalanceMode, whiteBalanceMode2};
        }

        public static WhiteBalanceMode valueOf(String str) {
            return (WhiteBalanceMode) Enum.valueOf(WhiteBalanceMode.class, str);
        }

        public static WhiteBalanceMode[] values() {
            return (WhiteBalanceMode[]) f.clone();
        }
    }

    static {
        ExifTag[] exifTagArr = {new ExifTag(256, 3, 4, "ImageWidth"), new ExifTag(257, 3, 4, "ImageLength"), new ExifTag("Make", 271, 2), new ExifTag("Model", 272, 2), new ExifTag("Orientation", 274, 3), new ExifTag("XResolution", 282, 5), new ExifTag("YResolution", 283, 5), new ExifTag("ResolutionUnit", 296, 3), new ExifTag("Software", 305, 2), new ExifTag("DateTime", 306, 2), new ExifTag("YCbCrPositioning", 531, 3), new ExifTag("SubIFDPointer", 330, 4), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4)};
        ExifTag[] exifTagArr2 = {new ExifTag("ExposureTime", 33434, 5), new ExifTag("FNumber", 33437, 5), new ExifTag("ExposureProgram", 34850, 3), new ExifTag("PhotographicSensitivity", 34855, 3), new ExifTag("SensitivityType", 34864, 3), new ExifTag("ExifVersion", 36864, 2), new ExifTag("DateTimeOriginal", 36867, 2), new ExifTag("DateTimeDigitized", 36868, 2), new ExifTag("ComponentsConfiguration", 37121, 7), new ExifTag("ShutterSpeedValue", 37377, 10), new ExifTag("ApertureValue", 37378, 5), new ExifTag("BrightnessValue", 37379, 10), new ExifTag("ExposureBiasValue", 37380, 10), new ExifTag("MaxApertureValue", 37381, 5), new ExifTag("MeteringMode", 37383, 3), new ExifTag("LightSource", 37384, 3), new ExifTag("Flash", 37385, 3), new ExifTag("FocalLength", 37386, 5), new ExifTag("SubSecTime", 37520, 2), new ExifTag("SubSecTimeOriginal", 37521, 2), new ExifTag("SubSecTimeDigitized", 37522, 2), new ExifTag("FlashpixVersion", 40960, 7), new ExifTag("ColorSpace", 40961, 3), new ExifTag(40962, 3, 4, "PixelXDimension"), new ExifTag(40963, 3, 4, "PixelYDimension"), new ExifTag("InteroperabilityIFDPointer", 40965, 4), new ExifTag("FocalPlaneResolutionUnit", 41488, 3), new ExifTag("SensingMethod", 41495, 3), new ExifTag("FileSource", 41728, 7), new ExifTag("SceneType", 41729, 7), new ExifTag("CustomRendered", 41985, 3), new ExifTag("ExposureMode", 41986, 3), new ExifTag("WhiteBalance", 41987, 3), new ExifTag("SceneCaptureType", 41990, 3), new ExifTag("Contrast", 41992, 3), new ExifTag("Saturation", 41993, 3), new ExifTag("Sharpness", 41994, 3)};
        ExifTag[] exifTagArr3 = {new ExifTag("GPSVersionID", 0, 1), new ExifTag("GPSLatitudeRef", 1, 2), new ExifTag(2, 5, 10, "GPSLatitude"), new ExifTag("GPSLongitudeRef", 3, 2), new ExifTag(4, 5, 10, "GPSLongitude"), new ExifTag("GPSAltitudeRef", 5, 1), new ExifTag("GPSAltitude", 6, 5), new ExifTag("GPSTimeStamp", 7, 5), new ExifTag("GPSSpeedRef", 12, 2), new ExifTag("GPSTrackRef", 14, 2), new ExifTag("GPSImgDirectionRef", 16, 2), new ExifTag("GPSDestBearingRef", 23, 2), new ExifTag("GPSDestDistanceRef", 25, 2)};
        c = new ExifTag[]{new ExifTag("SubIFDPointer", 330, 4), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4), new ExifTag("InteroperabilityIFDPointer", 40965, 4)};
        d = new ExifTag[][]{exifTagArr, exifTagArr2, exifTagArr3, new ExifTag[]{new ExifTag("InteroperabilityIndex", 1, 2)}};
        e = new HashSet(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
    }

    public ExifData(ByteOrder byteOrder, ArrayList arrayList) {
        Preconditions.f("Malformed attributes list. Number of IFDs mismatch.", arrayList.size() == 4);
        this.b = byteOrder;
        this.f512a = arrayList;
    }

    public static ExifData a(ImageProxy imageProxy, int i) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        Builder builder = new Builder();
        String strValueOf = String.valueOf(1);
        ArrayList arrayList = builder.f514a;
        builder.c("Orientation", strValueOf, arrayList);
        builder.c("XResolution", "72/1", arrayList);
        builder.c("YResolution", "72/1", arrayList);
        builder.c("ResolutionUnit", String.valueOf(2), arrayList);
        builder.c("YCbCrPositioning", String.valueOf(1), arrayList);
        builder.c("Make", Build.MANUFACTURER, arrayList);
        builder.c("Model", Build.MODEL, arrayList);
        if (imageProxy.M0() != null) {
            imageProxy.M0().b(builder);
        }
        builder.e(i);
        builder.c("ImageWidth", String.valueOf(imageProxy.getWidth()), arrayList);
        builder.c("ImageLength", String.valueOf(imageProxy.getHeight()), arrayList);
        ArrayList list = Collections.list(new Enumeration<Map<String, ExifAttribute>>(builder) { // from class: androidx.camera.core.impl.utils.ExifData.Builder.3

            /* renamed from: a, reason: collision with root package name */
            public final Enumeration f517a;

            {
                this.f517a = Collections.enumeration(builder.f514a);
            }

            @Override // java.util.Enumeration
            public final boolean hasMoreElements() {
                return this.f517a.hasMoreElements();
            }

            @Override // java.util.Enumeration
            public final Map<String, ExifAttribute> nextElement() {
                return new HashMap((Map) this.f517a.nextElement());
            }
        });
        if (!((Map) list.get(1)).isEmpty()) {
            builder.b("ExposureProgram", String.valueOf(0), list);
            builder.b("ExifVersion", "0230", list);
            builder.b("ComponentsConfiguration", "1,2,3,0", list);
            builder.b("MeteringMode", String.valueOf(0), list);
            builder.b("LightSource", String.valueOf(0), list);
            builder.b("FlashpixVersion", "0100", list);
            builder.b("FocalPlaneResolutionUnit", String.valueOf(2), list);
            builder.b("FileSource", String.valueOf(3), list);
            builder.b("SceneType", String.valueOf(1), list);
            builder.b("CustomRendered", String.valueOf(0), list);
            builder.b("SceneCaptureType", String.valueOf(0), list);
            builder.b("Contrast", String.valueOf(0), list);
            builder.b("Saturation", String.valueOf(0), list);
            builder.b("Sharpness", String.valueOf(0), list);
        }
        if (!((Map) list.get(2)).isEmpty()) {
            builder.b("GPSVersionID", "2300", list);
            builder.b("GPSSpeedRef", "K", list);
            builder.b("GPSTrackRef", RequestConfiguration.MAX_AD_CONTENT_RATING_T, list);
            builder.b("GPSImgDirectionRef", RequestConfiguration.MAX_AD_CONTENT_RATING_T, list);
            builder.b("GPSDestBearingRef", RequestConfiguration.MAX_AD_CONTENT_RATING_T, list);
            builder.b("GPSDestDistanceRef", "K", list);
        }
        return new ExifData(builder.b, list);
    }

    public final Map b(int i) {
        Preconditions.c(i, 0, 4, a.e(i, "Invalid IFD index: ", ". Index should be between [0, EXIF_TAGS.length] "));
        return (Map) this.f512a.get(i);
    }
}
