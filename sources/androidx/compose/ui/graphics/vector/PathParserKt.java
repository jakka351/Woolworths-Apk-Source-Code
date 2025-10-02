package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.vector.PathNode;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class PathParserKt {
    public static final void a(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / SubsamplingScaleImageView.ORIENTATION_180) * 3.141592653589793d;
        double dCos = Math.cos(d11);
        double dSin = Math.sin(d11);
        double d12 = ((d2 * dSin) + (d * dCos)) / d10;
        double d13 = ((d2 * dCos) + ((-d) * dSin)) / d6;
        double d14 = ((d4 * dSin) + (d3 * dCos)) / d10;
        double d15 = ((d4 * dCos) + ((-d3) * dSin)) / d6;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = 2;
        double d19 = (d12 + d14) / d18;
        double d20 = (d13 + d15) / d18;
        double d21 = (d17 * d17) + (d16 * d16);
        if (d21 == 0.0d) {
            return;
        }
        double d22 = (1.0d / d21) - 0.25d;
        if (d22 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d21) / 1.99999d);
            a(path, d, d2, d3, d4, d10 * dSqrt, d6 * dSqrt, d7, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d22);
        double d23 = d16 * dSqrt2;
        double d24 = dSqrt2 * d17;
        if (z == z2) {
            d8 = d19 - d24;
            d9 = d20 + d23;
        } else {
            d8 = d19 + d24;
            d9 = d20 - d23;
        }
        double dAtan2 = Math.atan2(d13 - d9, d12 - d8);
        double dAtan22 = Math.atan2(d15 - d9, d14 - d8) - dAtan2;
        if (z2 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d25 = d8 * d10;
        double d26 = d9 * d6;
        double d27 = (d25 * dCos) - (d26 * dSin);
        double d28 = (d26 * dCos) + (d25 * dSin);
        double d29 = 4;
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * d29) / 3.141592653589793d));
        double dCos2 = Math.cos(d11);
        double dSin2 = Math.sin(d11);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d30 = dAtan22;
        double d31 = -d10;
        double d32 = d31 * dCos2;
        double d33 = d6 * dSin2;
        double d34 = (d32 * dSin3) - (d33 * dCos3);
        double d35 = d31 * dSin2;
        double d36 = d6 * dCos2;
        double d37 = (dCos3 * d36) + (dSin3 * d35);
        double d38 = d30 / iCeil;
        double d39 = dAtan2;
        double d40 = d34;
        int i = 0;
        double d41 = d;
        double d42 = d37;
        double d43 = d2;
        while (i < iCeil) {
            double d44 = d39 + d38;
            double dSin4 = Math.sin(d44);
            double dCos4 = Math.cos(d44);
            int i2 = i;
            double d45 = (((d10 * dCos2) * dCos4) + d27) - (d33 * dSin4);
            int i3 = iCeil;
            double d46 = (d36 * dSin4) + (d10 * dSin2 * dCos4) + d28;
            double d47 = (d32 * dSin4) - (d33 * dCos4);
            double d48 = (dCos4 * d36) + (dSin4 * d35);
            double d49 = d44 - d39;
            double dTan = Math.tan(d49 / d18);
            double dSqrt3 = ((Math.sqrt(((3.0d * dTan) * dTan) + d29) - 1) * Math.sin(d49)) / 3;
            path.c((float) ((d40 * dSqrt3) + d41), (float) ((d42 * dSqrt3) + d43), (float) (d45 - (dSqrt3 * d47)), (float) (d46 - (dSqrt3 * d48)), (float) d45, (float) d46);
            d41 = d45;
            i = i2 + 1;
            d27 = d27;
            dSin2 = dSin2;
            d29 = d29;
            d39 = d44;
            d42 = d48;
            d40 = d47;
            d43 = d46;
            d10 = d5;
            iCeil = i3;
        }
    }

    public static final void b(List list, Path path) {
        int i;
        float f;
        int i2;
        PathNode pathNode;
        PathNode pathNode2;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        List list2 = list;
        Path path2 = path;
        int i3 = path2.i();
        path2.o();
        path2.n(i3);
        PathNode pathNode3 = list2.isEmpty() ? PathNode.Close.c : (PathNode) list2.get(0);
        int size = list2.size();
        float f10 = BitmapDescriptorFactory.HUE_RED;
        int i4 = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        while (i4 < size) {
            PathNode pathNode4 = (PathNode) list2.get(i4);
            if (pathNode4 instanceof PathNode.Close) {
                path2.close();
                i = size;
                f = f10;
                i2 = i4;
                pathNode2 = pathNode4;
                f11 = f15;
                f13 = f11;
                f12 = f16;
                f14 = f12;
            } else {
                if (pathNode4 instanceof PathNode.RelativeMoveTo) {
                    PathNode.RelativeMoveTo relativeMoveTo = (PathNode.RelativeMoveTo) pathNode4;
                    float f17 = relativeMoveTo.c;
                    f13 += f17;
                    float f18 = relativeMoveTo.d;
                    f14 += f18;
                    path2.d(f17, f18);
                    i = size;
                    f = f10;
                    i2 = i4;
                    f15 = f13;
                    f16 = f14;
                } else {
                    if (pathNode4 instanceof PathNode.MoveTo) {
                        PathNode.MoveTo moveTo = (PathNode.MoveTo) pathNode4;
                        float f19 = moveTo.c;
                        float f20 = moveTo.d;
                        path2.a(f19, f20);
                        f14 = f20;
                        f16 = f14;
                        f13 = f19;
                        f15 = f13;
                    } else if (pathNode4 instanceof PathNode.RelativeLineTo) {
                        PathNode.RelativeLineTo relativeLineTo = (PathNode.RelativeLineTo) pathNode4;
                        float f21 = relativeLineTo.d;
                        float f22 = relativeLineTo.c;
                        path2.s(f22, f21);
                        f13 += f22;
                        f14 += f21;
                    } else if (pathNode4 instanceof PathNode.LineTo) {
                        PathNode.LineTo lineTo = (PathNode.LineTo) pathNode4;
                        float f23 = lineTo.d;
                        float f24 = lineTo.c;
                        path2.b(f24, f23);
                        f13 = f24;
                        f14 = f23;
                    } else if (pathNode4 instanceof PathNode.RelativeHorizontalTo) {
                        float f25 = ((PathNode.RelativeHorizontalTo) pathNode4).c;
                        path2.s(f25, f10);
                        f13 += f25;
                    } else if (pathNode4 instanceof PathNode.HorizontalTo) {
                        float f26 = ((PathNode.HorizontalTo) pathNode4).c;
                        path2.b(f26, f14);
                        f13 = f26;
                    } else if (pathNode4 instanceof PathNode.RelativeVerticalTo) {
                        float f27 = ((PathNode.RelativeVerticalTo) pathNode4).c;
                        path2.s(f10, f27);
                        f14 += f27;
                    } else if (pathNode4 instanceof PathNode.VerticalTo) {
                        float f28 = ((PathNode.VerticalTo) pathNode4).c;
                        path2.b(f13, f28);
                        f14 = f28;
                    } else {
                        if (pathNode4 instanceof PathNode.RelativeCurveTo) {
                            PathNode.RelativeCurveTo relativeCurveTo = (PathNode.RelativeCurveTo) pathNode4;
                            path2.e(relativeCurveTo.c, relativeCurveTo.d, relativeCurveTo.e, relativeCurveTo.f, relativeCurveTo.g, relativeCurveTo.h);
                            f7 = relativeCurveTo.e + f13;
                            f8 = relativeCurveTo.f + f14;
                            f13 += relativeCurveTo.g;
                            f9 = relativeCurveTo.h;
                        } else if (pathNode4 instanceof PathNode.CurveTo) {
                            PathNode.CurveTo curveTo = (PathNode.CurveTo) pathNode4;
                            path.c(curveTo.c, curveTo.d, curveTo.e, curveTo.f, curveTo.g, curveTo.h);
                            float f29 = curveTo.e;
                            float f30 = curveTo.f;
                            float f31 = curveTo.g;
                            float f32 = curveTo.h;
                            f13 = f31;
                            f14 = f32;
                            i = size;
                            f = f10;
                            i2 = i4;
                            pathNode2 = pathNode4;
                            f11 = f29;
                            f12 = f30;
                        } else if (pathNode4 instanceof PathNode.RelativeReflectiveCurveTo) {
                            if (pathNode3.f1817a) {
                                float f33 = f13 - f11;
                                f6 = f14 - f12;
                                f5 = f33;
                            } else {
                                f5 = f10;
                                f6 = f5;
                            }
                            PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo = (PathNode.RelativeReflectiveCurveTo) pathNode4;
                            path.e(f5, f6, relativeReflectiveCurveTo.c, relativeReflectiveCurveTo.d, relativeReflectiveCurveTo.e, relativeReflectiveCurveTo.f);
                            f7 = relativeReflectiveCurveTo.c + f13;
                            f8 = relativeReflectiveCurveTo.d + f14;
                            f13 += relativeReflectiveCurveTo.e;
                            f9 = relativeReflectiveCurveTo.f;
                        } else {
                            if (pathNode4 instanceof PathNode.ReflectiveCurveTo) {
                                if (pathNode3.f1817a) {
                                    float f34 = 2;
                                    f13 = (f13 * f34) - f11;
                                    f14 = (f34 * f14) - f12;
                                }
                                PathNode.ReflectiveCurveTo reflectiveCurveTo = (PathNode.ReflectiveCurveTo) pathNode4;
                                path.c(f13, f14, reflectiveCurveTo.c, reflectiveCurveTo.d, reflectiveCurveTo.e, reflectiveCurveTo.f);
                                f4 = reflectiveCurveTo.c;
                                float f35 = reflectiveCurveTo.d;
                                float f36 = reflectiveCurveTo.e;
                                float f37 = reflectiveCurveTo.f;
                                f13 = f36;
                                f14 = f37;
                                i = size;
                                f = f10;
                                i2 = i4;
                                pathNode2 = pathNode4;
                                f12 = f35;
                            } else if (pathNode4 instanceof PathNode.RelativeQuadTo) {
                                PathNode.RelativeQuadTo relativeQuadTo = (PathNode.RelativeQuadTo) pathNode4;
                                float f38 = relativeQuadTo.f;
                                float f39 = relativeQuadTo.e;
                                float f40 = relativeQuadTo.d;
                                float f41 = relativeQuadTo.c;
                                path.h(f41, f40, f39, f38);
                                float f42 = f41 + f13;
                                float f43 = f40 + f14;
                                f13 += f39;
                                f14 += f38;
                                f11 = f42;
                                f12 = f43;
                            } else {
                                if (pathNode4 instanceof PathNode.QuadTo) {
                                    PathNode.QuadTo quadTo = (PathNode.QuadTo) pathNode4;
                                    float f44 = quadTo.f;
                                    float f45 = quadTo.e;
                                    float f46 = quadTo.d;
                                    f4 = quadTo.c;
                                    path.p(f4, f46, f45, f44);
                                    f14 = f44;
                                    f13 = f45;
                                    f12 = f46;
                                } else if (pathNode4 instanceof PathNode.RelativeReflectiveQuadTo) {
                                    if (pathNode3.b) {
                                        f2 = f13 - f11;
                                        f3 = f14 - f12;
                                    } else {
                                        f2 = f10;
                                        f3 = f2;
                                    }
                                    PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo = (PathNode.RelativeReflectiveQuadTo) pathNode4;
                                    float f47 = relativeReflectiveQuadTo.d;
                                    float f48 = relativeReflectiveQuadTo.c;
                                    path.h(f2, f3, f48, f47);
                                    f4 = f2 + f13;
                                    float f49 = f3 + f14;
                                    f13 += f48;
                                    f14 += f47;
                                    f12 = f49;
                                } else if (pathNode4 instanceof PathNode.ReflectiveQuadTo) {
                                    if (pathNode3.b) {
                                        float f50 = 2;
                                        f13 = (f13 * f50) - f11;
                                        f14 = (f50 * f14) - f12;
                                    }
                                    PathNode.ReflectiveQuadTo reflectiveQuadTo = (PathNode.ReflectiveQuadTo) pathNode4;
                                    float f51 = reflectiveQuadTo.d;
                                    float f52 = reflectiveQuadTo.c;
                                    path.p(f13, f14, f52, f51);
                                    i = size;
                                    f = f10;
                                    i2 = i4;
                                    f12 = f14;
                                    pathNode2 = pathNode4;
                                    f14 = f51;
                                    f11 = f13;
                                    f13 = f52;
                                } else {
                                    if (pathNode4 instanceof PathNode.RelativeArcTo) {
                                        PathNode.RelativeArcTo relativeArcTo = (PathNode.RelativeArcTo) pathNode4;
                                        float f53 = relativeArcTo.h + f13;
                                        float f54 = relativeArcTo.i + f14;
                                        pathNode = pathNode4;
                                        f = f10;
                                        i = size;
                                        i2 = i4;
                                        a(path, f13, f14, f53, f54, relativeArcTo.c, relativeArcTo.d, relativeArcTo.e, relativeArcTo.f, relativeArcTo.g);
                                        f11 = f53;
                                        f13 = f11;
                                        f12 = f54;
                                        f14 = f12;
                                    } else {
                                        i = size;
                                        f = f10;
                                        i2 = i4;
                                        pathNode = pathNode4;
                                        if (pathNode instanceof PathNode.ArcTo) {
                                            PathNode.ArcTo arcTo = (PathNode.ArcTo) pathNode;
                                            float f55 = arcTo.i;
                                            float f56 = arcTo.h;
                                            pathNode2 = pathNode;
                                            a(path, f13, f14, f56, f55, arcTo.c, arcTo.d, arcTo.e, arcTo.f, arcTo.g);
                                            f12 = f55;
                                            f14 = f12;
                                            f11 = f56;
                                            f13 = f11;
                                        }
                                    }
                                    pathNode2 = pathNode;
                                }
                                i = size;
                                f = f10;
                                i2 = i4;
                                pathNode2 = pathNode4;
                            }
                            f11 = f4;
                        }
                        f14 += f9;
                        f11 = f7;
                        f12 = f8;
                    }
                    i = size;
                    f = f10;
                    i2 = i4;
                }
                pathNode2 = pathNode4;
            }
            i4 = i2 + 1;
            list2 = list;
            path2 = path;
            size = i;
            pathNode3 = pathNode2;
            f10 = f;
        }
    }
}
