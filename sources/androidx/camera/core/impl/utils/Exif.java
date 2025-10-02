package androidx.camera.core.impl.utils;

import androidx.camera.core.Logger;
import androidx.exifinterface.media.ExifInterface;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class Exif {
    public static final ThreadLocal b = new AnonymousClass1();
    public static final ThreadLocal c = new AnonymousClass2();
    public static final ThreadLocal d = new AnonymousClass3();
    public static final List e = Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");
    public static final List f = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");

    /* renamed from: a, reason: collision with root package name */
    public final ExifInterface f510a;

    /* renamed from: androidx.camera.core.impl.utils.Exif$1, reason: invalid class name */
    public class AnonymousClass1 extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        public final SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.Exif$2, reason: invalid class name */
    public class AnonymousClass2 extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        public final SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.Exif$3, reason: invalid class name */
    public class AnonymousClass3 extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        public final SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    }

    public static final class Speed {

        public static final class Converter {
        }
    }

    public Exif(ExifInterface exifInterface) {
        this.f510a = exifInterface;
    }

    public final void a(Exif exif) {
        ExifInterface exifInterface = exif.f510a;
        ArrayList arrayList = new ArrayList(e);
        arrayList.removeAll(f);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String strC = this.f510a.c(str);
            String strC2 = exifInterface.c(str);
            if (strC != null && !strC.equals(strC2)) {
                exifInterface.A(str, strC);
            }
        }
    }

    public final int b() {
        switch (this.f510a.e(0, "Orientation")) {
            case 3:
            case 4:
                return SubsamplingScaleImageView.ORIENTATION_180;
            case 5:
            case 8:
                return SubsamplingScaleImageView.ORIENTATION_270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public final void c(int i) {
        int i2 = i % 90;
        ExifInterface exifInterface = this.f510a;
        if (i2 != 0) {
            Locale locale = Locale.US;
            Logger.e("Exif", "Can only rotate in right angles (eg. 0, 90, 180, 270). " + i + " is unsupported.");
            exifInterface.A("Orientation", String.valueOf(0));
            return;
        }
        int i3 = i % 360;
        int iE = exifInterface.e(0, "Orientation");
        while (i3 < 0) {
            i3 += 90;
            switch (iE) {
                case 2:
                    iE = 5;
                    break;
                case 3:
                case 8:
                    iE = 6;
                    break;
                case 4:
                    iE = 7;
                    break;
                case 5:
                    iE = 4;
                    break;
                case 6:
                    iE = 1;
                    break;
                case 7:
                    iE = 2;
                    break;
                default:
                    iE = 8;
                    break;
            }
        }
        while (i3 > 0) {
            i3 -= 90;
            switch (iE) {
                case 2:
                    iE = 7;
                    break;
                case 3:
                    iE = 8;
                    break;
                case 4:
                    iE = 5;
                    break;
                case 5:
                    iE = 2;
                    break;
                case 6:
                    iE = 3;
                    break;
                case 7:
                    iE = 4;
                    break;
                case 8:
                    iE = 1;
                    break;
                default:
                    iE = 6;
                    break;
            }
        }
        exifInterface.A("Orientation", String.valueOf(iE));
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0193, code lost:
    
        if (r3.equals("M") != false) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fa A[Catch: ParseException -> 0x00f5, TRY_ENTER, TryCatch #1 {ParseException -> 0x00f5, blocks: (B:41:0x00fa, B:43:0x010d, B:48:0x0127), top: B:106:0x00f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 511
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.Exif.toString():java.lang.String");
    }
}
