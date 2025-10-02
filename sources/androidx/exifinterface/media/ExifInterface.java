package androidx.exifinterface.media;

import YU.a;
import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.ExifInterfaceUtils;
import au.com.woolworths.rewards.base.data.RewardsPaymentEDPOnboardedMetadata;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.medallia.digital.mobilesdk.q2;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes2.dex */
public class ExifInterface {
    public static final String[] F;
    public static final int[] G;
    public static final byte[] H;
    public static final ExifTag I;
    public static final ExifTag[][] J;
    public static final ExifTag[] K;
    public static final HashMap[] L;
    public static final HashMap[] M;
    public static final HashSet N;
    public static final HashMap O;
    public static final Charset P;
    public static final byte[] Q;
    public static final byte[] R;
    public static final Pattern S;
    public static final Pattern T;
    public static final Pattern U;

    /* renamed from: a, reason: collision with root package name */
    public final String f2728a;
    public final FileDescriptor b;
    public final AssetManager.AssetInputStream c;
    public int d;
    public final HashMap[] e;
    public final HashSet f;
    public ByteOrder g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public int m;
    public static final boolean n = Log.isLoggable("ExifInterface", 3);
    public static final List o = Arrays.asList(1, 6, 3, 8);
    public static final List p = Arrays.asList(2, 7, 4, 5);
    public static final int[] q = {8, 8, 8};
    public static final int[] r = {8};
    public static final byte[] s = {-1, -40, -1};
    public static final byte[] t = {102, 116, 121, 112};
    public static final byte[] u = {109, 105, 102, 49};
    public static final byte[] v = {104, 101, 105, 99};
    public static final byte[] w = {79, 76, 89, 77, 80, 0};
    public static final byte[] x = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] y = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] z = {101, 88, 73, 102};
    public static final byte[] A = {73, 72, 68, 82};
    public static final byte[] B = {73, 69, 78, 68};
    public static final byte[] C = {82, 73, 70, 70};
    public static final byte[] D = {87, 69, 66, 80};
    public static final byte[] E = {69, 88, 73, 70};

    public static class ByteOrderedDataOutputStream extends FilterOutputStream {
        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr) {
            throw null;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) {
            throw null;
        }
    }

    public static class ExifAttribute {

        /* renamed from: a, reason: collision with root package name */
        public final int f2729a;
        public final int b;
        public final long c;
        public final byte[] d;

        public ExifAttribute(int i, int i2, byte[] bArr) {
            this(-1L, bArr, i, i2);
        }

        public static ExifAttribute a(String str) {
            byte[] bytes = str.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(ExifInterface.P);
            return new ExifAttribute(2, bytes.length, bytes);
        }

        public static ExifAttribute b(long j, ByteOrder byteOrder) {
            return c(new long[]{j}, byteOrder);
        }

        public static ExifAttribute c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ExifInterface.G[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j : jArr) {
                byteBufferWrap.putInt((int) j);
            }
            return new ExifAttribute(4, jArr.length, byteBufferWrap.array());
        }

        public static ExifAttribute d(Rational[] rationalArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ExifInterface.G[5] * rationalArr.length]);
            byteBufferWrap.order(byteOrder);
            for (Rational rational : rationalArr) {
                byteBufferWrap.putInt((int) rational.f2731a);
                byteBufferWrap.putInt((int) rational.b);
            }
            return new ExifAttribute(5, rationalArr.length, byteBufferWrap.array());
        }

        public static ExifAttribute e(int i, ByteOrder byteOrder) {
            return f(new int[]{i}, byteOrder);
        }

        public static ExifAttribute f(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ExifInterface.G[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i : iArr) {
                byteBufferWrap.putShort((short) i);
            }
            return new ExifAttribute(3, iArr.length, byteBufferWrap.array());
        }

        public final double g(ByteOrder byteOrder) throws Throwable {
            Object objJ = j(byteOrder);
            if (objJ == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objJ instanceof String) {
                return Double.parseDouble((String) objJ);
            }
            if (objJ instanceof long[]) {
                if (((long[]) objJ).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objJ instanceof int[]) {
                if (((int[]) objJ).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objJ instanceof double[]) {
                double[] dArr = (double[]) objJ;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objJ instanceof Rational[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            Rational[] rationalArr = (Rational[]) objJ;
            if (rationalArr.length != 1) {
                throw new NumberFormatException("There are more than one component");
            }
            Rational rational = rationalArr[0];
            return rational.f2731a / rational.b;
        }

        public final int h(ByteOrder byteOrder) throws Throwable {
            Object objJ = j(byteOrder);
            if (objJ == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objJ instanceof String) {
                return Integer.parseInt((String) objJ);
            }
            if (objJ instanceof long[]) {
                long[] jArr = (long[]) objJ;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objJ instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objJ;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public final String i(ByteOrder byteOrder) throws Throwable {
            Object objJ = j(byteOrder);
            if (objJ == null) {
                return null;
            }
            if (objJ instanceof String) {
                return (String) objJ;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (objJ instanceof long[]) {
                long[] jArr = (long[]) objJ;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objJ instanceof int[]) {
                int[] iArr = (int[]) objJ;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objJ instanceof double[]) {
                double[] dArr = (double[]) objJ;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(objJ instanceof Rational[])) {
                return null;
            }
            Rational[] rationalArr = (Rational[]) objJ;
            while (i < rationalArr.length) {
                sb.append(rationalArr[i].f2731a);
                sb.append('/');
                sb.append(rationalArr[i].b);
                i++;
                if (i != rationalArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:17:0x0032 */
        /* JADX WARN: Removed duplicated region for block: B:103:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r14v23, types: [int[]] */
        /* JADX WARN: Type inference failed for: r14v24, types: [long[]] */
        /* JADX WARN: Type inference failed for: r14v25, types: [androidx.exifinterface.media.ExifInterface$Rational[]] */
        /* JADX WARN: Type inference failed for: r14v26, types: [int[]] */
        /* JADX WARN: Type inference failed for: r14v27, types: [int[]] */
        /* JADX WARN: Type inference failed for: r14v28, types: [androidx.exifinterface.media.ExifInterface$Rational[]] */
        /* JADX WARN: Type inference failed for: r14v29, types: [double[]] */
        /* JADX WARN: Type inference failed for: r14v30, types: [java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r14v31, types: [double[]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.io.Serializable j(java.nio.ByteOrder r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 340
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.ExifAttribute.j(java.nio.ByteOrder):java.io.Serializable");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("(");
            sb.append(ExifInterface.F[this.f2729a]);
            sb.append(", data length:");
            return a.m(sb, this.d.length, ")");
        }

        public ExifAttribute(long j, byte[] bArr, int i, int i2) {
            this.f2729a = i;
            this.b = i2;
            this.c = j;
            this.d = bArr;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ExifStreamType {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface IfdType {
    }

    public static class Rational {

        /* renamed from: a, reason: collision with root package name */
        public final long f2731a;
        public final long b;

        public Rational(long j, long j2) {
            if (j2 == 0) {
                this.f2731a = 0L;
                this.b = 1L;
            } else {
                this.f2731a = j;
                this.b = j2;
            }
        }

        public final String toString() {
            return this.f2731a + q2.c + this.b;
        }
    }

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        F = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        G = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        H = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        ExifTag[] exifTagArr = {new ExifTag("NewSubfileType", 254, 4), new ExifTag("SubfileType", 255, 4), new ExifTag(256, 3, 4, "ImageWidth"), new ExifTag(257, 3, 4, "ImageLength"), new ExifTag("BitsPerSample", 258, 3), new ExifTag("Compression", 259, 3), new ExifTag("PhotometricInterpretation", 262, 3), new ExifTag("ImageDescription", SubsamplingScaleImageView.ORIENTATION_270, 2), new ExifTag("Make", 271, 2), new ExifTag("Model", 272, 2), new ExifTag(273, 3, 4, "StripOffsets"), new ExifTag("Orientation", 274, 3), new ExifTag("SamplesPerPixel", 277, 3), new ExifTag(278, 3, 4, "RowsPerStrip"), new ExifTag(279, 3, 4, "StripByteCounts"), new ExifTag("XResolution", 282, 5), new ExifTag("YResolution", 283, 5), new ExifTag("PlanarConfiguration", 284, 3), new ExifTag("ResolutionUnit", 296, 3), new ExifTag("TransferFunction", 301, 3), new ExifTag("Software", 305, 2), new ExifTag("DateTime", 306, 2), new ExifTag("Artist", 315, 2), new ExifTag("WhitePoint", 318, 5), new ExifTag("PrimaryChromaticities", 319, 5), new ExifTag("SubIFDPointer", 330, 4), new ExifTag("JPEGInterchangeFormat", 513, 4), new ExifTag("JPEGInterchangeFormatLength", 514, 4), new ExifTag("YCbCrCoefficients", 529, 5), new ExifTag("YCbCrSubSampling", 530, 3), new ExifTag("YCbCrPositioning", 531, 3), new ExifTag("ReferenceBlackWhite", 532, 5), new ExifTag("Copyright", 33432, 2), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4), new ExifTag("SensorTopBorder", 4, 4), new ExifTag("SensorLeftBorder", 5, 4), new ExifTag("SensorBottomBorder", 6, 4), new ExifTag("SensorRightBorder", 7, 4), new ExifTag("ISO", 23, 3), new ExifTag("JpgFromRaw", 46, 7), new ExifTag("Xmp", 700, 1)};
        ExifTag[] exifTagArr2 = {new ExifTag("ExposureTime", 33434, 5), new ExifTag("FNumber", 33437, 5), new ExifTag("ExposureProgram", 34850, 3), new ExifTag("SpectralSensitivity", 34852, 2), new ExifTag("PhotographicSensitivity", 34855, 3), new ExifTag("OECF", 34856, 7), new ExifTag("SensitivityType", 34864, 3), new ExifTag("StandardOutputSensitivity", 34865, 4), new ExifTag("RecommendedExposureIndex", 34866, 4), new ExifTag("ISOSpeed", 34867, 4), new ExifTag("ISOSpeedLatitudeyyy", 34868, 4), new ExifTag("ISOSpeedLatitudezzz", 34869, 4), new ExifTag("ExifVersion", 36864, 2), new ExifTag("DateTimeOriginal", 36867, 2), new ExifTag("DateTimeDigitized", 36868, 2), new ExifTag("OffsetTime", 36880, 2), new ExifTag("OffsetTimeOriginal", 36881, 2), new ExifTag("OffsetTimeDigitized", 36882, 2), new ExifTag("ComponentsConfiguration", 37121, 7), new ExifTag("CompressedBitsPerPixel", 37122, 5), new ExifTag("ShutterSpeedValue", 37377, 10), new ExifTag("ApertureValue", 37378, 5), new ExifTag("BrightnessValue", 37379, 10), new ExifTag("ExposureBiasValue", 37380, 10), new ExifTag("MaxApertureValue", 37381, 5), new ExifTag("SubjectDistance", 37382, 5), new ExifTag("MeteringMode", 37383, 3), new ExifTag("LightSource", 37384, 3), new ExifTag("Flash", 37385, 3), new ExifTag("FocalLength", 37386, 5), new ExifTag("SubjectArea", 37396, 3), new ExifTag("MakerNote", 37500, 7), new ExifTag("UserComment", 37510, 7), new ExifTag("SubSecTime", 37520, 2), new ExifTag("SubSecTimeOriginal", 37521, 2), new ExifTag("SubSecTimeDigitized", 37522, 2), new ExifTag("FlashpixVersion", 40960, 7), new ExifTag("ColorSpace", 40961, 3), new ExifTag(40962, 3, 4, "PixelXDimension"), new ExifTag(40963, 3, 4, "PixelYDimension"), new ExifTag("RelatedSoundFile", 40964, 2), new ExifTag("InteroperabilityIFDPointer", 40965, 4), new ExifTag("FlashEnergy", 41483, 5), new ExifTag("SpatialFrequencyResponse", 41484, 7), new ExifTag("FocalPlaneXResolution", 41486, 5), new ExifTag("FocalPlaneYResolution", 41487, 5), new ExifTag("FocalPlaneResolutionUnit", 41488, 3), new ExifTag("SubjectLocation", 41492, 3), new ExifTag("ExposureIndex", 41493, 5), new ExifTag("SensingMethod", 41495, 3), new ExifTag("FileSource", 41728, 7), new ExifTag("SceneType", 41729, 7), new ExifTag("CFAPattern", 41730, 7), new ExifTag("CustomRendered", 41985, 3), new ExifTag("ExposureMode", 41986, 3), new ExifTag("WhiteBalance", 41987, 3), new ExifTag("DigitalZoomRatio", 41988, 5), new ExifTag("FocalLengthIn35mmFilm", 41989, 3), new ExifTag("SceneCaptureType", 41990, 3), new ExifTag("GainControl", 41991, 3), new ExifTag("Contrast", 41992, 3), new ExifTag("Saturation", 41993, 3), new ExifTag("Sharpness", 41994, 3), new ExifTag("DeviceSettingDescription", 41995, 7), new ExifTag("SubjectDistanceRange", 41996, 3), new ExifTag("ImageUniqueID", 42016, 2), new ExifTag("CameraOwnerName", 42032, 2), new ExifTag("BodySerialNumber", 42033, 2), new ExifTag("LensSpecification", 42034, 5), new ExifTag("LensMake", 42035, 2), new ExifTag("LensModel", 42036, 2), new ExifTag("Gamma", 42240, 5), new ExifTag("DNGVersion", 50706, 1), new ExifTag(50720, 3, 4, "DefaultCropSize")};
        ExifTag[] exifTagArr3 = {new ExifTag("GPSVersionID", 0, 1), new ExifTag("GPSLatitudeRef", 1, 2), new ExifTag(2, 5, 10, "GPSLatitude"), new ExifTag("GPSLongitudeRef", 3, 2), new ExifTag(4, 5, 10, "GPSLongitude"), new ExifTag("GPSAltitudeRef", 5, 1), new ExifTag("GPSAltitude", 6, 5), new ExifTag("GPSTimeStamp", 7, 5), new ExifTag("GPSSatellites", 8, 2), new ExifTag("GPSStatus", 9, 2), new ExifTag("GPSMeasureMode", 10, 2), new ExifTag("GPSDOP", 11, 5), new ExifTag("GPSSpeedRef", 12, 2), new ExifTag("GPSSpeed", 13, 5), new ExifTag("GPSTrackRef", 14, 2), new ExifTag("GPSTrack", 15, 5), new ExifTag("GPSImgDirectionRef", 16, 2), new ExifTag("GPSImgDirection", 17, 5), new ExifTag("GPSMapDatum", 18, 2), new ExifTag("GPSDestLatitudeRef", 19, 2), new ExifTag("GPSDestLatitude", 20, 5), new ExifTag("GPSDestLongitudeRef", 21, 2), new ExifTag("GPSDestLongitude", 22, 5), new ExifTag("GPSDestBearingRef", 23, 2), new ExifTag("GPSDestBearing", 24, 5), new ExifTag("GPSDestDistanceRef", 25, 2), new ExifTag("GPSDestDistance", 26, 5), new ExifTag("GPSProcessingMethod", 27, 7), new ExifTag("GPSAreaInformation", 28, 7), new ExifTag("GPSDateStamp", 29, 2), new ExifTag("GPSDifferential", 30, 3), new ExifTag("GPSHPositioningError", 31, 5)};
        ExifTag[] exifTagArr4 = {new ExifTag("InteroperabilityIndex", 1, 2)};
        ExifTag[] exifTagArr5 = {new ExifTag("NewSubfileType", 254, 4), new ExifTag("SubfileType", 255, 4), new ExifTag(256, 3, 4, "ThumbnailImageWidth"), new ExifTag(257, 3, 4, "ThumbnailImageLength"), new ExifTag("BitsPerSample", 258, 3), new ExifTag("Compression", 259, 3), new ExifTag("PhotometricInterpretation", 262, 3), new ExifTag("ImageDescription", SubsamplingScaleImageView.ORIENTATION_270, 2), new ExifTag("Make", 271, 2), new ExifTag("Model", 272, 2), new ExifTag(273, 3, 4, "StripOffsets"), new ExifTag("ThumbnailOrientation", 274, 3), new ExifTag("SamplesPerPixel", 277, 3), new ExifTag(278, 3, 4, "RowsPerStrip"), new ExifTag(279, 3, 4, "StripByteCounts"), new ExifTag("XResolution", 282, 5), new ExifTag("YResolution", 283, 5), new ExifTag("PlanarConfiguration", 284, 3), new ExifTag("ResolutionUnit", 296, 3), new ExifTag("TransferFunction", 301, 3), new ExifTag("Software", 305, 2), new ExifTag("DateTime", 306, 2), new ExifTag("Artist", 315, 2), new ExifTag("WhitePoint", 318, 5), new ExifTag("PrimaryChromaticities", 319, 5), new ExifTag("SubIFDPointer", 330, 4), new ExifTag("JPEGInterchangeFormat", 513, 4), new ExifTag("JPEGInterchangeFormatLength", 514, 4), new ExifTag("YCbCrCoefficients", 529, 5), new ExifTag("YCbCrSubSampling", 530, 3), new ExifTag("YCbCrPositioning", 531, 3), new ExifTag("ReferenceBlackWhite", 532, 5), new ExifTag("Copyright", 33432, 2), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4), new ExifTag("DNGVersion", 50706, 1), new ExifTag(50720, 3, 4, "DefaultCropSize")};
        I = new ExifTag("StripOffsets", 273, 3);
        J = new ExifTag[][]{exifTagArr, exifTagArr2, exifTagArr3, exifTagArr4, exifTagArr5, exifTagArr, new ExifTag[]{new ExifTag("ThumbnailImage", 256, 7), new ExifTag("CameraSettingsIFDPointer", 8224, 4), new ExifTag("ImageProcessingIFDPointer", 8256, 4)}, new ExifTag[]{new ExifTag("PreviewImageStart", 257, 4), new ExifTag("PreviewImageLength", 258, 4)}, new ExifTag[]{new ExifTag("AspectFrame", 4371, 3)}, new ExifTag[]{new ExifTag("ColorSpace", 55, 3)}};
        K = new ExifTag[]{new ExifTag("SubIFDPointer", 330, 4), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4), new ExifTag("InteroperabilityIFDPointer", 40965, 4), new ExifTag("CameraSettingsIFDPointer", 8224, 1), new ExifTag("ImageProcessingIFDPointer", 8256, 1)};
        L = new HashMap[10];
        M = new HashMap[10];
        N = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        O = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        P = charsetForName;
        Q = "Exif\u0000\u0000".getBytes(charsetForName);
        R = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            ExifTag[][] exifTagArr6 = J;
            if (i >= exifTagArr6.length) {
                HashMap map = O;
                ExifTag[] exifTagArr7 = K;
                map.put(Integer.valueOf(exifTagArr7[0].f2730a), 5);
                map.put(Integer.valueOf(exifTagArr7[1].f2730a), 1);
                map.put(Integer.valueOf(exifTagArr7[2].f2730a), 2);
                map.put(Integer.valueOf(exifTagArr7[3].f2730a), 3);
                map.put(Integer.valueOf(exifTagArr7[4].f2730a), 7);
                map.put(Integer.valueOf(exifTagArr7[5].f2730a), 8);
                Pattern.compile(".*[1-9].*");
                S = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                T = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                U = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            L[i] = new HashMap();
            M[i] = new HashMap();
            for (ExifTag exifTag : exifTagArr6[i]) {
                L[i].put(Integer.valueOf(exifTag.f2730a), exifTag);
                M[i].put(exifTag.b, exifTag);
            }
            i++;
        }
    }

    public ExifInterface(String str) throws Throwable {
        boolean z2;
        ExifTag[][] exifTagArr = J;
        this.e = new HashMap[exifTagArr.length];
        this.f = new HashSet(exifTagArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream = null;
        this.c = null;
        this.f2728a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                try {
                    ExifInterfaceUtils.Api21Impl.c(fileInputStream2.getFD(), 0L, OsConstants.SEEK_CUR);
                    z2 = true;
                } catch (Exception unused) {
                    if (n) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                    z2 = false;
                }
                if (z2) {
                    this.b = fileInputStream2.getFD();
                } else {
                    this.b = null;
                }
                t(fileInputStream2);
                ExifInterfaceUtils.a(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                ExifInterfaceUtils.a(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static double b(String str, String str2) {
        try {
            String[] strArrSplit = str.split(",", -1);
            String[] strArrSplit2 = strArrSplit[0].split(q2.c, -1);
            double d = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split(q2.c, -1);
            double d2 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split(q2.c, -1);
            double d3 = ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d) + (d2 / 60.0d) + d;
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return d3;
            }
            return -d3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    public static Pair q(String str) throws NumberFormatException {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair pairQ = q(strArrSplit[0]);
            if (((Integer) pairQ.first).intValue() == 2) {
                return pairQ;
            }
            for (int i = 1; i < strArrSplit.length; i++) {
                Pair pairQ2 = q(strArrSplit[i]);
                int iIntValue = (((Integer) pairQ2.first).equals(pairQ.first) || ((Integer) pairQ2.second).equals(pairQ.first)) ? ((Integer) pairQ.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairQ.second).intValue() == -1 || !(((Integer) pairQ2.first).equals(pairQ.second) || ((Integer) pairQ2.second).equals(pairQ.second))) ? -1 : ((Integer) pairQ.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (iIntValue == -1) {
                    pairQ = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairQ = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairQ;
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

    public static ByteOrder w(ByteOrderedDataInputStream byteOrderedDataInputStream) throws IOException {
        short s2 = byteOrderedDataInputStream.readShort();
        boolean z2 = n;
        if (s2 == 18761) {
            if (z2) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s2 != 19789) {
            throw new IOException(android.support.v4.media.session.a.k(s2, new StringBuilder("Invalid byte order: ")));
        }
        if (z2) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 1048
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.A(java.lang.String, java.lang.String):void");
    }

    public final void B(ByteOrderedDataInputStream byteOrderedDataInputStream) throws Throwable {
        ExifAttribute exifAttribute;
        int iH;
        HashMap map = this.e[4];
        ExifAttribute exifAttribute2 = (ExifAttribute) map.get("Compression");
        if (exifAttribute2 == null) {
            r(byteOrderedDataInputStream, map);
            return;
        }
        int iH2 = exifAttribute2.h(this.g);
        if (iH2 != 1) {
            if (iH2 == 6) {
                r(byteOrderedDataInputStream, map);
                return;
            } else if (iH2 != 7) {
                return;
            }
        }
        ExifAttribute exifAttribute3 = (ExifAttribute) map.get("BitsPerSample");
        if (exifAttribute3 != null) {
            int[] iArr = (int[]) exifAttribute3.j(this.g);
            int[] iArr2 = q;
            if (Arrays.equals(iArr2, iArr) || (this.d == 3 && (exifAttribute = (ExifAttribute) map.get("PhotometricInterpretation")) != null && (((iH = exifAttribute.h(this.g)) == 1 && Arrays.equals(iArr, r)) || (iH == 6 && Arrays.equals(iArr, iArr2))))) {
                ExifAttribute exifAttribute4 = (ExifAttribute) map.get("StripOffsets");
                ExifAttribute exifAttribute5 = (ExifAttribute) map.get("StripByteCounts");
                if (exifAttribute4 == null || exifAttribute5 == null) {
                    return;
                }
                long[] jArrB = ExifInterfaceUtils.b(exifAttribute4.j(this.g));
                long[] jArrB2 = ExifInterfaceUtils.b(exifAttribute5.j(this.g));
                if (jArrB == null || jArrB.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrB2 == null || jArrB2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrB.length != jArrB2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : jArrB2) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.i = true;
                this.h = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < jArrB.length; i3++) {
                    int i4 = (int) jArrB[i3];
                    int i5 = (int) jArrB2[i3];
                    if (i3 < jArrB.length - 1 && i4 + i5 != jArrB[i3 + 1]) {
                        this.i = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    try {
                        byteOrderedDataInputStream.a(i6);
                        int i7 = i + i6;
                        byte[] bArr2 = new byte[i5];
                        try {
                            byteOrderedDataInputStream.readFully(bArr2);
                            i = i7 + i5;
                            System.arraycopy(bArr2, 0, bArr, i2, i5);
                            i2 += i5;
                        } catch (EOFException unused) {
                            Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                        return;
                    }
                }
                if (this.i) {
                    long j3 = jArrB[0];
                    return;
                }
                return;
            }
        }
        if (n) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void C(int i, int i2) throws Throwable {
        HashMap[] mapArr = this.e;
        boolean zIsEmpty = mapArr[i].isEmpty();
        boolean z2 = n;
        if (zIsEmpty || mapArr[i2].isEmpty()) {
            if (z2) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        ExifAttribute exifAttribute = (ExifAttribute) mapArr[i].get("ImageLength");
        ExifAttribute exifAttribute2 = (ExifAttribute) mapArr[i].get("ImageWidth");
        ExifAttribute exifAttribute3 = (ExifAttribute) mapArr[i2].get("ImageLength");
        ExifAttribute exifAttribute4 = (ExifAttribute) mapArr[i2].get("ImageWidth");
        if (exifAttribute == null || exifAttribute2 == null) {
            if (z2) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (exifAttribute3 == null || exifAttribute4 == null) {
            if (z2) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iH = exifAttribute.h(this.g);
        int iH2 = exifAttribute2.h(this.g);
        int iH3 = exifAttribute3.h(this.g);
        int iH4 = exifAttribute4.h(this.g);
        if (iH >= iH3 || iH2 >= iH4) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    public final void D(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream, int i) throws Throwable {
        ExifAttribute exifAttributeE;
        ExifAttribute exifAttributeE2;
        HashMap[] mapArr = this.e;
        ExifAttribute exifAttribute = (ExifAttribute) mapArr[i].get("DefaultCropSize");
        ExifAttribute exifAttribute2 = (ExifAttribute) mapArr[i].get("SensorTopBorder");
        ExifAttribute exifAttribute3 = (ExifAttribute) mapArr[i].get("SensorLeftBorder");
        ExifAttribute exifAttribute4 = (ExifAttribute) mapArr[i].get("SensorBottomBorder");
        ExifAttribute exifAttribute5 = (ExifAttribute) mapArr[i].get("SensorRightBorder");
        if (exifAttribute != null) {
            if (exifAttribute.f2729a == 5) {
                Rational[] rationalArr = (Rational[]) exifAttribute.j(this.g);
                if (rationalArr == null || rationalArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(rationalArr));
                    return;
                } else {
                    exifAttributeE = ExifAttribute.d(new Rational[]{rationalArr[0]}, this.g);
                    exifAttributeE2 = ExifAttribute.d(new Rational[]{rationalArr[1]}, this.g);
                }
            } else {
                int[] iArr = (int[]) exifAttribute.j(this.g);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                exifAttributeE = ExifAttribute.e(iArr[0], this.g);
                exifAttributeE2 = ExifAttribute.e(iArr[1], this.g);
            }
            mapArr[i].put("ImageWidth", exifAttributeE);
            mapArr[i].put("ImageLength", exifAttributeE2);
            return;
        }
        if (exifAttribute2 != null && exifAttribute3 != null && exifAttribute4 != null && exifAttribute5 != null) {
            int iH = exifAttribute2.h(this.g);
            int iH2 = exifAttribute4.h(this.g);
            int iH3 = exifAttribute5.h(this.g);
            int iH4 = exifAttribute3.h(this.g);
            if (iH2 <= iH || iH3 <= iH4) {
                return;
            }
            ExifAttribute exifAttributeE3 = ExifAttribute.e(iH2 - iH, this.g);
            ExifAttribute exifAttributeE4 = ExifAttribute.e(iH3 - iH4, this.g);
            mapArr[i].put("ImageLength", exifAttributeE3);
            mapArr[i].put("ImageWidth", exifAttributeE4);
            return;
        }
        ExifAttribute exifAttribute6 = (ExifAttribute) mapArr[i].get("ImageLength");
        ExifAttribute exifAttribute7 = (ExifAttribute) mapArr[i].get("ImageWidth");
        if (exifAttribute6 == null || exifAttribute7 == null) {
            ExifAttribute exifAttribute8 = (ExifAttribute) mapArr[i].get("JPEGInterchangeFormat");
            ExifAttribute exifAttribute9 = (ExifAttribute) mapArr[i].get("JPEGInterchangeFormatLength");
            if (exifAttribute8 == null || exifAttribute9 == null) {
                return;
            }
            int iH5 = exifAttribute8.h(this.g);
            int iH6 = exifAttribute8.h(this.g);
            seekableByteOrderedDataInputStream.b(iH5);
            byte[] bArr = new byte[iH6];
            seekableByteOrderedDataInputStream.readFully(bArr);
            h(new ByteOrderedDataInputStream(bArr), iH5, i);
        }
    }

    public final void E() throws Throwable {
        C(0, 5);
        C(0, 4);
        C(5, 4);
        HashMap[] mapArr = this.e;
        ExifAttribute exifAttribute = (ExifAttribute) mapArr[1].get("PixelXDimension");
        ExifAttribute exifAttribute2 = (ExifAttribute) mapArr[1].get("PixelYDimension");
        if (exifAttribute != null && exifAttribute2 != null) {
            mapArr[0].put("ImageWidth", exifAttribute);
            mapArr[0].put("ImageLength", exifAttribute2);
        }
        if (mapArr[4].isEmpty() && s(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!s(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        z(0, "ThumbnailOrientation", "Orientation");
        z(0, "ThumbnailImageLength", "ImageLength");
        z(0, "ThumbnailImageWidth", "ImageWidth");
        z(5, "ThumbnailOrientation", "Orientation");
        z(5, "ThumbnailImageLength", "ImageLength");
        z(5, "ThumbnailImageWidth", "ImageWidth");
        z(4, "Orientation", "ThumbnailOrientation");
        z(4, "ImageLength", "ThumbnailImageLength");
        z(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void a() {
        String strC = c("DateTimeOriginal");
        HashMap[] mapArr = this.e;
        if (strC != null && c("DateTime") == null) {
            mapArr[0].put("DateTime", ExifAttribute.a(strC));
        }
        if (c("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", ExifAttribute.b(0L, this.g));
        }
        if (c("ImageLength") == null) {
            mapArr[0].put("ImageLength", ExifAttribute.b(0L, this.g));
        }
        if (c("Orientation") == null) {
            mapArr[0].put("Orientation", ExifAttribute.b(0L, this.g));
        }
        if (c("LightSource") == null) {
            mapArr[1].put("LightSource", ExifAttribute.b(0L, this.g));
        }
    }

    public final String c(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        ExifAttribute exifAttributeF = f(str);
        if (exifAttributeF != null) {
            int i = exifAttributeF.f2729a;
            if (!N.contains(str)) {
                return exifAttributeF.i(this.g);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                Rational[] rationalArr = (Rational[]) exifAttributeF.j(this.g);
                if (rationalArr == null || rationalArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(rationalArr));
                    return null;
                }
                Rational rational = rationalArr[0];
                Integer numValueOf = Integer.valueOf((int) (rational.f2731a / rational.b));
                Rational rational2 = rationalArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (rational2.f2731a / rational2.b));
                Rational rational3 = rationalArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (rational3.f2731a / rational3.b)));
            }
            try {
                return Double.toString(exifAttributeF.g(this.g));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final double d(double d, String str) {
        ExifAttribute exifAttributeF = f(str);
        if (exifAttributeF == null) {
            return d;
        }
        try {
            return exifAttributeF.g(this.g);
        } catch (NumberFormatException unused) {
            return d;
        }
    }

    public final int e(int i, String str) {
        ExifAttribute exifAttributeF = f(str);
        if (exifAttributeF == null) {
            return i;
        }
        try {
            return exifAttributeF.h(this.g);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public final ExifAttribute f(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (n) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < J.length; i++) {
            ExifAttribute exifAttribute = (ExifAttribute) this.e[i].get(str);
            if (exifAttribute != null) {
                return exifAttribute;
            }
        }
        return null;
    }

    public final void g(final SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                ExifInterfaceUtils.Api23Impl.a(mediaMetadataRetriever, new MediaDataSource() { // from class: androidx.exifinterface.media.ExifInterface.1
                    public long d;

                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                    }

                    @Override // android.media.MediaDataSource
                    public final long getSize() {
                        return -1L;
                    }

                    @Override // android.media.MediaDataSource
                    public final int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
                        if (i2 == 0) {
                            return 0;
                        }
                        if (j < 0) {
                            return -1;
                        }
                        try {
                            long j2 = this.d;
                            SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream2 = seekableByteOrderedDataInputStream;
                            if (j2 != j) {
                                if (j2 >= 0 && j >= j2 + seekableByteOrderedDataInputStream2.d.available()) {
                                    return -1;
                                }
                                seekableByteOrderedDataInputStream2.b(j);
                                this.d = j;
                            }
                            if (i2 > seekableByteOrderedDataInputStream2.d.available()) {
                                i2 = seekableByteOrderedDataInputStream2.d.available();
                            }
                            int i3 = seekableByteOrderedDataInputStream2.read(bArr, i, i2);
                            if (i3 >= 0) {
                                this.d += i3;
                                return i3;
                            }
                        } catch (IOException unused) {
                        }
                        this.d = -1L;
                        return -1;
                    }
                });
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if (RewardsPaymentEDPOnboardedMetadata.YES_TRACKING_DATA.equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if (RewardsPaymentEDPOnboardedMetadata.YES_TRACKING_DATA.equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.e;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", ExifAttribute.e(Integer.parseInt(strExtractMetadata), this.g));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", ExifAttribute.e(Integer.parseInt(strExtractMetadata2), this.g));
                }
                if (strExtractMetadata3 != null) {
                    int i = Integer.parseInt(strExtractMetadata3);
                    mapArr[0].put("Orientation", ExifAttribute.e(i != 90 ? i != 180 ? i != 270 ? 1 : 8 : 3 : 6, this.g));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i2 = Integer.parseInt(strExtractMetadata4);
                    int i3 = Integer.parseInt(strExtractMetadata5);
                    if (i3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    seekableByteOrderedDataInputStream.b(i2);
                    byte[] bArr = new byte[6];
                    seekableByteOrderedDataInputStream.readFully(bArr);
                    int i4 = i2 + 6;
                    int i5 = i3 - 6;
                    if (!Arrays.equals(bArr, Q)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i5];
                    seekableByteOrderedDataInputStream.readFully(bArr2);
                    this.j = i4;
                    x(0, bArr2);
                }
                if (n) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0188, code lost:
    
        r23.f = r22.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x018c, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x009d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00a0. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00a3. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0175 A[LOOP:0: B:10:0x0033->B:78:0x0175, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0131 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.h(androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream, int, int):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:169|12|164|13|(2:150|14)|(16:17|(2:19|20)(1:28)|23|29|(1:31)|32|(4:152|35|(7:154|39|40|(3:43|(1:45)(2:46|(1:48))|(1:179)(3:177|51|52))(1:180)|53|36|37)|176)|34|160|65|162|66|67|(1:73)(1:72)|74|(1:87)(8:156|89|158|90|91|(1:93)(1:94)|95|(1:109)(3:111|(2:112|(2:114|(2:171|116)(1:117))(2:170|118))|(1:120)(4:122|(2:123|(2:125|(1:173)(1:128))(3:172|129|(2:130|(1:174)(2:132|(1:175)(1:135)))))|127|(1:137)(1:139)))))|16|160|65|162|66|67|(3:69|73|74)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r9 < 16) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f1, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f4, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00f6, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f8, code lost:
    
        if (r5 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00fa, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00fd, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00fe, code lost:
    
        if (r2 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0100, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0103, code lost:
    
        r0 = r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0107 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(java.io.BufferedInputStream r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.i(java.io.BufferedInputStream):int");
    }

    public final void j(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws Throwable {
        int i;
        int i2;
        m(seekableByteOrderedDataInputStream);
        HashMap[] mapArr = this.e;
        ExifAttribute exifAttribute = (ExifAttribute) mapArr[1].get("MakerNote");
        if (exifAttribute != null) {
            SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream2 = new SeekableByteOrderedDataInputStream(exifAttribute.d);
            seekableByteOrderedDataInputStream2.f = this.g;
            byte[] bArr = w;
            byte[] bArr2 = new byte[bArr.length];
            seekableByteOrderedDataInputStream2.readFully(bArr2);
            seekableByteOrderedDataInputStream2.b(0L);
            byte[] bArr3 = x;
            byte[] bArr4 = new byte[bArr3.length];
            seekableByteOrderedDataInputStream2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                seekableByteOrderedDataInputStream2.b(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                seekableByteOrderedDataInputStream2.b(12L);
            }
            y(seekableByteOrderedDataInputStream2, 6);
            ExifAttribute exifAttribute2 = (ExifAttribute) mapArr[7].get("PreviewImageStart");
            ExifAttribute exifAttribute3 = (ExifAttribute) mapArr[7].get("PreviewImageLength");
            if (exifAttribute2 != null && exifAttribute3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", exifAttribute2);
                mapArr[5].put("JPEGInterchangeFormatLength", exifAttribute3);
            }
            ExifAttribute exifAttribute4 = (ExifAttribute) mapArr[8].get("AspectFrame");
            if (exifAttribute4 != null) {
                int[] iArr = (int[]) exifAttribute4.j(this.g);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                ExifAttribute exifAttributeE = ExifAttribute.e(i5, this.g);
                ExifAttribute exifAttributeE2 = ExifAttribute.e(i6, this.g);
                mapArr[0].put("ImageWidth", exifAttributeE);
                mapArr[0].put("ImageLength", exifAttributeE2);
            }
        }
    }

    public final void k(ByteOrderedDataInputStream byteOrderedDataInputStream) throws Throwable {
        if (n) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + byteOrderedDataInputStream);
        }
        byteOrderedDataInputStream.f = ByteOrder.BIG_ENDIAN;
        byte[] bArr = y;
        byteOrderedDataInputStream.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = byteOrderedDataInputStream.readInt();
                byte[] bArr2 = new byte[4];
                byteOrderedDataInputStream.readFully(bArr2);
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, A)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, B)) {
                    return;
                }
                if (Arrays.equals(bArr2, z)) {
                    byte[] bArr3 = new byte[i];
                    byteOrderedDataInputStream.readFully(bArr3);
                    int i3 = byteOrderedDataInputStream.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i3) {
                        this.j = i2;
                        x(0, bArr3);
                        E();
                        B(new ByteOrderedDataInputStream(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i3 + ", calculated CRC value: " + crc32.getValue());
                }
                int i4 = i + 4;
                byteOrderedDataInputStream.a(i4);
                length = i2 + i4;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void l(ByteOrderedDataInputStream byteOrderedDataInputStream) throws Throwable {
        boolean z2 = n;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + byteOrderedDataInputStream);
        }
        byteOrderedDataInputStream.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        byteOrderedDataInputStream.readFully(bArr);
        byteOrderedDataInputStream.readFully(bArr2);
        byteOrderedDataInputStream.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        byteOrderedDataInputStream.a(i - byteOrderedDataInputStream.e);
        byteOrderedDataInputStream.readFully(bArr4);
        h(new ByteOrderedDataInputStream(bArr4), i, 5);
        byteOrderedDataInputStream.a(i3 - byteOrderedDataInputStream.e);
        byteOrderedDataInputStream.f = ByteOrder.BIG_ENDIAN;
        int i4 = byteOrderedDataInputStream.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = byteOrderedDataInputStream.readUnsignedShort();
            int unsignedShort2 = byteOrderedDataInputStream.readUnsignedShort();
            if (unsignedShort == I.f2730a) {
                short s2 = byteOrderedDataInputStream.readShort();
                short s3 = byteOrderedDataInputStream.readShort();
                ExifAttribute exifAttributeE = ExifAttribute.e(s2, this.g);
                ExifAttribute exifAttributeE2 = ExifAttribute.e(s3, this.g);
                HashMap[] mapArr = this.e;
                mapArr[0].put("ImageLength", exifAttributeE);
                mapArr[0].put("ImageWidth", exifAttributeE2);
                if (z2) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s2) + ", width: " + ((int) s3));
                    return;
                }
                return;
            }
            byteOrderedDataInputStream.a(unsignedShort2);
        }
    }

    public final void m(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws Throwable {
        u(seekableByteOrderedDataInputStream);
        y(seekableByteOrderedDataInputStream, 0);
        D(seekableByteOrderedDataInputStream, 0);
        D(seekableByteOrderedDataInputStream, 5);
        D(seekableByteOrderedDataInputStream, 4);
        E();
        if (this.d == 8) {
            HashMap[] mapArr = this.e;
            ExifAttribute exifAttribute = (ExifAttribute) mapArr[1].get("MakerNote");
            if (exifAttribute != null) {
                SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream2 = new SeekableByteOrderedDataInputStream(exifAttribute.d);
                seekableByteOrderedDataInputStream2.f = this.g;
                seekableByteOrderedDataInputStream2.a(6);
                y(seekableByteOrderedDataInputStream2, 9);
                ExifAttribute exifAttribute2 = (ExifAttribute) mapArr[9].get("ColorSpace");
                if (exifAttribute2 != null) {
                    mapArr[1].put("ColorSpace", exifAttribute2);
                }
            }
        }
    }

    public final int n() {
        switch (e(1, "Orientation")) {
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

    public final void o(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws Throwable {
        if (n) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + seekableByteOrderedDataInputStream);
        }
        m(seekableByteOrderedDataInputStream);
        HashMap[] mapArr = this.e;
        ExifAttribute exifAttribute = (ExifAttribute) mapArr[0].get("JpgFromRaw");
        if (exifAttribute != null) {
            h(new ByteOrderedDataInputStream(exifAttribute.d), (int) exifAttribute.c, 5);
        }
        ExifAttribute exifAttribute2 = (ExifAttribute) mapArr[0].get("ISO");
        ExifAttribute exifAttribute3 = (ExifAttribute) mapArr[1].get("PhotographicSensitivity");
        if (exifAttribute2 == null || exifAttribute3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", exifAttribute2);
    }

    public final void p(ByteOrderedDataInputStream byteOrderedDataInputStream) throws Throwable {
        if (n) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + byteOrderedDataInputStream);
        }
        byteOrderedDataInputStream.f = ByteOrder.LITTLE_ENDIAN;
        byteOrderedDataInputStream.a(C.length);
        int i = byteOrderedDataInputStream.readInt() + 8;
        byte[] bArr = D;
        byteOrderedDataInputStream.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                byteOrderedDataInputStream.readFully(bArr2);
                int i2 = byteOrderedDataInputStream.readInt();
                int i3 = length + 8;
                if (Arrays.equals(E, bArr2)) {
                    byte[] bArr3 = new byte[i2];
                    byteOrderedDataInputStream.readFully(bArr3);
                    this.j = i3;
                    x(0, bArr3);
                    B(new ByteOrderedDataInputStream(bArr3));
                    return;
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                byteOrderedDataInputStream.a(i2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void r(ByteOrderedDataInputStream byteOrderedDataInputStream, HashMap map) throws Throwable {
        ExifAttribute exifAttribute = (ExifAttribute) map.get("JPEGInterchangeFormat");
        ExifAttribute exifAttribute2 = (ExifAttribute) map.get("JPEGInterchangeFormatLength");
        if (exifAttribute == null || exifAttribute2 == null) {
            return;
        }
        int iH = exifAttribute.h(this.g);
        int iH2 = exifAttribute2.h(this.g);
        if (this.d == 7) {
            iH += this.k;
        }
        if (iH > 0 && iH2 > 0) {
            this.h = true;
            if (this.f2728a == null && this.c == null && this.b == null) {
                byteOrderedDataInputStream.a(iH);
                byteOrderedDataInputStream.readFully(new byte[iH2]);
            }
        }
        if (n) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iH + ", length: " + iH2);
        }
    }

    public final boolean s(HashMap map) {
        ExifAttribute exifAttribute = (ExifAttribute) map.get("ImageLength");
        ExifAttribute exifAttribute2 = (ExifAttribute) map.get("ImageWidth");
        if (exifAttribute == null || exifAttribute2 == null) {
            return false;
        }
        return exifAttribute.h(this.g) <= 512 && exifAttribute2.h(this.g) <= 512;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008f A[Catch: all -> 0x0015, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:3:0x0004, B:5:0x0009, B:12:0x001e, B:18:0x003b, B:20:0x0046, B:28:0x005c, B:23:0x004d, B:26:0x0055, B:27:0x0059, B:29:0x0066, B:31:0x006f, B:33:0x0075, B:35:0x007b, B:37:0x0081, B:43:0x008f), top: B:53:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(java.io.InputStream r8) {
        /*
            r7 = this;
            boolean r0 = androidx.exifinterface.media.ExifInterface.n
            r1 = 0
            r2 = r1
        L4:
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r3 = androidx.exifinterface.media.ExifInterface.J     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r3 = r3.length     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r2 >= r3) goto L1e
            java.util.HashMap[] r3 = r7.e     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r4.<init>()     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r3[r2] = r4     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r2 = r2 + 1
            goto L4
        L15:
            r8 = move-exception
            goto L97
        L18:
            r8 = move-exception
            goto L8d
        L1b:
            r8 = move-exception
            goto L8d
        L1e:
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r3 = 5000(0x1388, float:7.006E-42)
            r2.<init>(r8, r3)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r8 = r7.i(r2)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r7.d = r8     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r3 = 14
            r4 = 13
            r5 = 9
            r6 = 4
            if (r8 == r6) goto L66
            if (r8 == r5) goto L66
            if (r8 == r4) goto L66
            if (r8 != r3) goto L3b
            goto L66
        L3b:
            androidx.exifinterface.media.ExifInterface$SeekableByteOrderedDataInputStream r8 = new androidx.exifinterface.media.ExifInterface$SeekableByteOrderedDataInputStream     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r1 = r7.d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2 = 12
            if (r1 != r2) goto L4a
            r7.g(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L5c
        L4a:
            r2 = 7
            if (r1 != r2) goto L51
            r7.j(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L5c
        L51:
            r2 = 10
            if (r1 != r2) goto L59
            r7.o(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L5c
        L59:
            r7.m(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L5c:
            int r1 = r7.j     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r8.b(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r7.B(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L84
        L66:
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r8 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r2 = r7.d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r2 != r6) goto L73
            r7.h(r8, r1, r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L84
        L73:
            if (r2 != r4) goto L79
            r7.k(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L84
        L79:
            if (r2 != r5) goto L7f
            r7.l(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L84
        L7f:
            if (r2 != r3) goto L84
            r7.p(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L84:
            r7.a()
            if (r0 == 0) goto La8
            r7.v()
            return
        L8d:
            if (r0 == 0) goto La0
            java.lang.String r1 = "ExifInterface"
            java.lang.String r2 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r2, r8)     // Catch: java.lang.Throwable -> L15
            goto La0
        L97:
            r7.a()
            if (r0 == 0) goto L9f
            r7.v()
        L9f:
            throw r8
        La0:
            r7.a()
            if (r0 == 0) goto La8
            r7.v()
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.t(java.io.InputStream):void");
    }

    public final void u(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws IOException {
        ByteOrder byteOrderW = w(seekableByteOrderedDataInputStream);
        this.g = byteOrderW;
        seekableByteOrderedDataInputStream.f = byteOrderW;
        int unsignedShort = seekableByteOrderedDataInputStream.readUnsignedShort();
        int i = this.d;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            throw new IOException(android.support.v4.media.session.a.k(unsignedShort, new StringBuilder("Invalid start code: ")));
        }
        int i2 = seekableByteOrderedDataInputStream.readInt();
        if (i2 < 8) {
            throw new IOException(a.d(i2, "Invalid first Ifd offset: "));
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            seekableByteOrderedDataInputStream.a(i3);
        }
    }

    public final void v() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.e;
            if (i >= mapArr.length) {
                return;
            }
            StringBuilder sbR = a.r(i, "The size of tag group[", "]: ");
            sbR.append(mapArr[i].size());
            Log.d("ExifInterface", sbR.toString());
            for (Map.Entry entry : mapArr[i].entrySet()) {
                ExifAttribute exifAttribute = (ExifAttribute) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + exifAttribute.toString() + ", tagValue: '" + exifAttribute.i(this.g) + "'");
            }
            i++;
        }
    }

    public final void x(int i, byte[] bArr) throws IOException {
        SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream = new SeekableByteOrderedDataInputStream(bArr);
        u(seekableByteOrderedDataInputStream);
        y(seekableByteOrderedDataInputStream, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream r30, int r31) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 940
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.y(androidx.exifinterface.media.ExifInterface$SeekableByteOrderedDataInputStream, int):void");
    }

    public final void z(int i, String str, String str2) {
        HashMap[] mapArr = this.e;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, map.get(str));
        mapArr[i].remove(str);
    }

    public static class ByteOrderedDataInputStream extends InputStream implements DataInput {
        public final DataInputStream d;
        public int e;
        public ByteOrder f;
        public byte[] g;
        public final int h;

        public ByteOrderedDataInputStream(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.h = bArr.length;
        }

        public final void a(int i) throws IOException {
            int i2 = 0;
            while (i2 < i) {
                int i3 = i - i2;
                DataInputStream dataInputStream = this.d;
                int iSkip = (int) dataInputStream.skip(i3);
                if (iSkip <= 0) {
                    if (this.g == null) {
                        this.g = new byte[8192];
                    }
                    iSkip = dataInputStream.read(this.g, 0, Math.min(8192, i3));
                    if (iSkip == -1) {
                        throw new EOFException(a.e(i, "Reached EOF while skipping ", " bytes."));
                    }
                }
                i2 += iSkip;
            }
            this.e += i2;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.d.available();
        }

        @Override // java.io.InputStream
        public final void mark(int i) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public final int read() {
            this.e++;
            return this.d.read();
        }

        @Override // java.io.DataInput
        public final boolean readBoolean() {
            this.e++;
            return this.d.readBoolean();
        }

        @Override // java.io.DataInput
        public final byte readByte() throws IOException {
            this.e++;
            int i = this.d.read();
            if (i >= 0) {
                return (byte) i;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final char readChar() {
            this.e += 2;
            return this.d.readChar();
        }

        @Override // java.io.DataInput
        public final double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public final float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr, int i, int i2) throws IOException {
            this.e += i2;
            this.d.readFully(bArr, i, i2);
        }

        @Override // java.io.DataInput
        public final int readInt() throws IOException {
            this.e += 4;
            DataInputStream dataInputStream = this.d;
            int i = dataInputStream.read();
            int i2 = dataInputStream.read();
            int i3 = dataInputStream.read();
            int i4 = dataInputStream.read();
            if ((i | i2 | i3 | i4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i << 24) + (i2 << 16) + (i3 << 8) + i4;
            }
            throw new IOException("Invalid byte order: " + this.f);
        }

        @Override // java.io.DataInput
        public final String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public final long readLong() throws IOException {
            long j;
            long j2;
            this.e += 8;
            DataInputStream dataInputStream = this.d;
            int i = dataInputStream.read();
            int i2 = dataInputStream.read();
            int i3 = dataInputStream.read();
            int i4 = dataInputStream.read();
            int i5 = dataInputStream.read();
            int i6 = dataInputStream.read();
            int i7 = dataInputStream.read();
            int i8 = dataInputStream.read();
            if ((i | i2 | i3 | i4 | i5 | i6 | i7 | i8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                j = (i8 << 56) + (i7 << 48) + (i6 << 40) + (i5 << 32) + (i4 << 24) + (i3 << 16) + (i2 << 8);
                j2 = i;
            } else {
                if (byteOrder != ByteOrder.BIG_ENDIAN) {
                    throw new IOException("Invalid byte order: " + this.f);
                }
                j = (i << 56) + (i2 << 48) + (i3 << 40) + (i4 << 32) + (i5 << 24) + (i6 << 16) + (i7 << 8);
                j2 = i8;
            }
            return j + j2;
        }

        @Override // java.io.DataInput
        public final short readShort() throws IOException {
            this.e += 2;
            DataInputStream dataInputStream = this.d;
            int i = dataInputStream.read();
            int i2 = dataInputStream.read();
            if ((i | i2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((i2 << 8) + i);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((i << 8) + i2);
            }
            throw new IOException("Invalid byte order: " + this.f);
        }

        @Override // java.io.DataInput
        public final String readUTF() {
            this.e += 2;
            return this.d.readUTF();
        }

        @Override // java.io.DataInput
        public final int readUnsignedByte() {
            this.e++;
            return this.d.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public final int readUnsignedShort() throws IOException {
            this.e += 2;
            DataInputStream dataInputStream = this.d;
            int i = dataInputStream.read();
            int i2 = dataInputStream.read();
            if ((i | i2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i2 << 8) + i;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i << 8) + i2;
            }
            throw new IOException("Invalid byte order: " + this.f);
        }

        @Override // java.io.InputStream
        public final void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public final int skipBytes(int i) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public ByteOrderedDataInputStream(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.d.read(bArr, i, i2);
            this.e += i3;
            return i3;
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr) throws IOException {
            this.e += bArr.length;
            this.d.readFully(bArr);
        }

        public ByteOrderedDataInputStream(InputStream inputStream, ByteOrder byteOrder) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.d = dataInputStream;
            dataInputStream.mark(0);
            this.e = 0;
            this.f = byteOrder;
            this.h = inputStream instanceof ByteOrderedDataInputStream ? ((ByteOrderedDataInputStream) inputStream).h : -1;
        }
    }

    public static class SeekableByteOrderedDataInputStream extends ByteOrderedDataInputStream {
        public SeekableByteOrderedDataInputStream(byte[] bArr) {
            super(bArr);
            this.d.mark(Integer.MAX_VALUE);
        }

        public final void b(long j) throws IOException {
            int i = this.e;
            if (i > j) {
                this.e = 0;
                this.d.reset();
            } else {
                j -= i;
            }
            a((int) j);
        }

        public SeekableByteOrderedDataInputStream(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.d.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    public static class ExifTag {

        /* renamed from: a, reason: collision with root package name */
        public final int f2730a;
        public final String b;
        public final int c;
        public final int d;

        public ExifTag(String str, int i, int i2) {
            this.b = str;
            this.f2730a = i;
            this.c = i2;
            this.d = -1;
        }

        public ExifTag(int i, int i2, int i3, String str) {
            this.b = str;
            this.f2730a = i;
            this.c = i2;
            this.d = i3;
        }
    }

    public ExifInterface(InputStream inputStream) throws IOException {
        ExifTag[][] exifTagArr = J;
        this.e = new HashMap[exifTagArr.length];
        this.f = new HashSet(exifTagArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        this.f2728a = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.c = (AssetManager.AssetInputStream) inputStream;
            this.b = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                ExifInterfaceUtils.Api21Impl.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.c = null;
                this.b = fileInputStream.getFD();
            } catch (Exception unused) {
                if (n) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
            }
        } else {
            this.c = null;
            this.b = null;
        }
        t(inputStream);
    }
}
