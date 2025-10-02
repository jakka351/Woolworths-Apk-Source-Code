package androidx.compose.ui.graphics.colorspace;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpaces;", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ColorSpaces {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f1791a;
    public static final float[] b;
    public static final TransferParameters c;
    public static final TransferParameters d;
    public static final Rgb e;
    public static final Rgb f;
    public static final Rgb g;
    public static final Rgb h;
    public static final Rgb i;
    public static final Rgb j;
    public static final Rgb k;
    public static final Rgb l;
    public static final Rgb m;
    public static final Rgb n;
    public static final Rgb o;
    public static final Rgb p;
    public static final Rgb q;
    public static final Rgb r;
    public static final Xyz s;
    public static final Lab t;
    public static final Rgb u;
    public static final Rgb v;
    public static final Rgb w;
    public static final Oklab x;
    public static final ColorSpace[] y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f1791a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        TransferParameters transferParameters = new TransferParameters(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        TransferParameters transferParameters2 = new TransferParameters(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        TransferParameters transferParameters3 = new TransferParameters(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = transferParameters3;
        TransferParameters transferParameters4 = new TransferParameters(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = transferParameters4;
        WhitePoint whitePoint = Illuminant.d;
        Rgb rgb = new Rgb("sRGB IEC61966-2.1", fArr, whitePoint, transferParameters, 0);
        e = rgb;
        Rgb rgb2 = new Rgb("sRGB IEC61966-2.1 (Linear)", fArr, whitePoint, 1.0d, BitmapDescriptorFactory.HUE_RED, 1.0f, 1);
        f = rgb2;
        Rgb rgb3 = new Rgb("scRGB-nl IEC 61966-2-2:2003", fArr, whitePoint, null, new a(0), new a(1), -0.799f, 2.399f, transferParameters, 2);
        g = rgb3;
        Rgb rgb4 = new Rgb("scRGB IEC 61966-2-2:2003", fArr, whitePoint, 1.0d, -0.5f, 7.499f, 3);
        h = rgb4;
        Rgb rgb5 = new Rgb("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, whitePoint, new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        i = rgb5;
        Rgb rgb6 = new Rgb("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, whitePoint, new TransferParameters(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = rgb6;
        Rgb rgb7 = new Rgb("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new WhitePoint(0.314f, 0.351f), 2.6d, BitmapDescriptorFactory.HUE_RED, 1.0f, 6);
        k = rgb7;
        Rgb rgb8 = new Rgb("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, whitePoint, transferParameters, 7);
        l = rgb8;
        double d2 = 0.2222222222222222d;
        double d3 = 0.081d;
        double d4 = 2.2222222222222223d;
        double d5 = 0.9099181073703367d;
        double d6 = 0.09008189262966333d;
        Rgb rgb9 = new Rgb("NTSC (1953)", fArr2, Illuminant.f1794a, new TransferParameters(d4, d5, d6, d2, d3), 8);
        m = rgb9;
        Rgb rgb10 = new Rgb("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, whitePoint, new TransferParameters(d4, d5, d6, d2, d3), 9);
        n = rgb10;
        Rgb rgb11 = new Rgb("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, whitePoint, 2.2d, BitmapDescriptorFactory.HUE_RED, 1.0f, 10);
        o = rgb11;
        Rgb rgb12 = new Rgb("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, Illuminant.b, new TransferParameters(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        p = rgb12;
        float[] fArr4 = {0.7347f, 0.2653f, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0E-4f, -0.077f};
        WhitePoint whitePoint2 = Illuminant.c;
        Rgb rgb13 = new Rgb("SMPTE ST 2065-1:2012 ACES", fArr4, whitePoint2, 1.0d, -65504.0f, 65504.0f, 12);
        q = rgb13;
        Rgb rgb14 = new Rgb("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, whitePoint2, 1.0d, -65504.0f, 65504.0f, 13);
        r = rgb14;
        Xyz xyz = new Xyz("Generic XYZ", ColorModel.b, 14);
        s = xyz;
        long j2 = ColorModel.c;
        Lab lab = new Lab("Generic L*a*b*", j2, 15);
        t = lab;
        Rgb rgb15 = new Rgb("None", fArr, whitePoint, transferParameters2, 16);
        u = rgb15;
        Rgb rgb16 = new Rgb("Hybrid Log Gamma encoding", fArr3, whitePoint, null, new a(2), new a(3), BitmapDescriptorFactory.HUE_RED, 1.0f, transferParameters3, 17);
        v = rgb16;
        Rgb rgb17 = new Rgb("Perceptual Quantizer encoding", fArr3, whitePoint, null, new a(4), new a(5), BitmapDescriptorFactory.HUE_RED, 1.0f, transferParameters4, 18);
        w = rgb17;
        Oklab oklab = new Oklab("Oklab", j2, 19);
        x = oklab;
        y = new ColorSpace[]{rgb, rgb2, rgb3, rgb4, rgb5, rgb6, rgb7, rgb8, rgb9, rgb10, rgb11, rgb12, rgb13, rgb14, xyz, lab, rgb15, rgb16, rgb17, oklab};
    }

    public static double a(TransferParameters transferParameters, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = transferParameters.b;
        double d6 = transferParameters.c;
        double d7 = transferParameters.d;
        double d8 = transferParameters.e;
        double d9 = transferParameters.f;
        double d10 = d5 * d4;
        return (transferParameters.g + 1.0d) * d3 * (d10 <= 1.0d ? Math.pow(d10, d6) : Math.exp((d4 - d9) * d7) + d8);
    }

    public static double b(TransferParameters transferParameters, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = 1.0d / transferParameters.b;
        double d5 = 1.0d / transferParameters.c;
        double d6 = 1.0d / transferParameters.d;
        double d7 = transferParameters.e;
        double d8 = transferParameters.f;
        double d9 = (d2 * d3) / (transferParameters.g + 1.0d);
        return d3 * (d9 <= 1.0d ? Math.pow(d9, d5) * d4 : (Math.log(d9 - d7) * d6) + d8);
    }

    public static double c(TransferParameters transferParameters, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = transferParameters.b;
        double d6 = transferParameters.d;
        double dPow = (Math.pow(d4, d6) * transferParameters.c) + d5;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d4, d6) * transferParameters.f) + transferParameters.e), transferParameters.g) * d3;
    }

    public static double d(TransferParameters transferParameters, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = -transferParameters.b;
        double d6 = transferParameters.e;
        double d7 = 1.0d / transferParameters.g;
        return Math.pow(Math.max((Math.pow(d4, d7) * d6) + d5, 0.0d) / ((Math.pow(d4, d7) * (-transferParameters.f)) + transferParameters.c), 1.0d / transferParameters.d) * d3;
    }
}
