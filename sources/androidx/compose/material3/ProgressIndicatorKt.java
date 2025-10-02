package androidx.compose.material3;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.ProgressIndicatorTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ProgressIndicatorKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1473a;
    public static final Modifier b;
    public static final float c = 240;
    public static final float d;
    public static final float e;
    public static final CubicBezierEasing f;
    public static final CubicBezierEasing g;
    public static final CubicBezierEasing h;
    public static final CubicBezierEasing i;
    public static final CubicBezierEasing j;

    static {
        float f2 = 10;
        f1473a = f2;
        b = PaddingKt.h(SemanticsModifierKt.b(LayoutModifierKt.a(Modifier.Companion.d, ProgressIndicatorKt$IncreaseSemanticsBounds$1.h), true, ProgressIndicatorKt$IncreaseSemanticsBounds$2.h), BitmapDescriptorFactory.HUE_RED, f2, 1);
        float f3 = ProgressIndicatorTokens.c;
        d = f3;
        e = ProgressIndicatorTokens.d - (f3 * 2);
        f = new CubicBezierEasing(0.2f, BitmapDescriptorFactory.HUE_RED, 0.8f, 1.0f);
        g = new CubicBezierEasing(0.4f, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f);
        h = new CubicBezierEasing(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.65f, 1.0f);
        i = new CubicBezierEasing(0.1f, BitmapDescriptorFactory.HUE_RED, 0.45f, 1.0f);
        j = new CubicBezierEasing(0.4f, BitmapDescriptorFactory.HUE_RED, 0.2f, 1.0f);
    }

    public static final void a(final Function0 function0, final Modifier modifier, final long j2, final float f2, final long j3, final int i2, float f3, Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        float f4;
        Object obj;
        Modifier modifier2;
        int i7;
        final float f5;
        final float f6;
        ComposerImpl composerImplV = composer.v(-1798883595);
        if ((i3 & 6) == 0) {
            i5 = (composerImplV.I(function0) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i3 & KyberEngine.KyberPolyBytes) == 0) {
            i5 |= composerImplV.s(j2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= composerImplV.q(f2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= composerImplV.s(j3) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i6 = i2;
            i5 |= composerImplV.r(i6) ? 131072 : 65536;
        } else {
            i6 = i2;
        }
        int i8 = i4 & 64;
        if (i8 != 0) {
            i5 |= 1572864;
            f4 = f3;
        } else {
            f4 = f3;
            if ((i3 & 1572864) == 0) {
                i5 |= composerImplV.q(f4) ? 1048576 : 524288;
            }
        }
        if ((i5 & 599187) == 599186 && composerImplV.c()) {
            composerImplV.j();
            f6 = f4;
        } else {
            composerImplV.u0();
            if ((i3 & 1) != 0 && !composerImplV.c0()) {
                composerImplV.j();
            } else if (i8 != 0) {
                f4 = ProgressIndicatorDefaults.d;
            }
            composerImplV.W();
            boolean z = (i5 & 14) == 4;
            Object objG = composerImplV.G();
            Object obj2 = Composer.Companion.f1624a;
            if (z || objG == obj2) {
                objG = new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$coercedProgress$1$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(RangesKt.b(((Number) function0.invoke()).floatValue(), BitmapDescriptorFactory.HUE_RED, 1.0f));
                    }
                };
                composerImplV.A(objG);
            }
            final Function0 function02 = (Function0) objG;
            final Stroke stroke = new Stroke(((Density) composerImplV.x(CompositionLocalsKt.h)).T1(f2), BitmapDescriptorFactory.HUE_RED, i6, 0, null, 26);
            boolean zN = composerImplV.n(function02);
            Object objG2 = composerImplV.G();
            if (zN || objG2 == obj2) {
                objG2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$2$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        SemanticsPropertiesKt.q((SemanticsPropertyReceiver) obj3, new ProgressBarRangeInfo(((Number) function02.invoke()).floatValue(), RangesKt.j(BitmapDescriptorFactory.HUE_RED, 1.0f), 0));
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG2);
            }
            Modifier modifierQ = SizeKt.q(SemanticsModifierKt.b(modifier, true, (Function1) objG2), e);
            boolean zN2 = ((i5 & 458752) == 131072) | composerImplV.n(function02) | ((3670016 & i5) == 1048576) | ((i5 & 7168) == 2048) | ((((57344 & i5) ^ 24576) > 16384 && composerImplV.s(j3)) || (i5 & 24576) == 16384) | composerImplV.I(stroke) | ((((i5 & 896) ^ KyberEngine.KyberPolyBytes) > 256 && composerImplV.s(j2)) || (i5 & KyberEngine.KyberPolyBytes) == 256);
            Object objG3 = composerImplV.G();
            if (zN2 || objG3 == obj2) {
                modifier2 = modifierQ;
                i7 = 0;
                f5 = f4;
                obj = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        DrawScope drawScope = (DrawScope) obj3;
                        float fFloatValue = ((Number) function02.invoke()).floatValue() * 360.0f;
                        int i9 = i2;
                        float f7 = f5;
                        if (i9 != 0 && Size.b(drawScope.h()) <= Size.d(drawScope.h())) {
                            f7 += f2;
                        }
                        float fC = (f7 / ((float) (drawScope.C(Size.d(drawScope.h())) * 3.141592653589793d))) * 360.0f;
                        ProgressIndicatorKt.e(drawScope, Math.min(fFloatValue, fC) + 270.0f + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fC) * 2), j3, stroke);
                        ProgressIndicatorKt.e(drawScope, 270.0f, fFloatValue, j2, stroke);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(obj);
            } else {
                obj = objG3;
                modifier2 = modifierQ;
                f5 = f4;
                i7 = 0;
            }
            CanvasKt.a(modifier2, (Function1) obj, composerImplV, i7);
            f6 = f5;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Number) obj4).intValue();
                    ProgressIndicatorKt.a(function0, modifier, j2, f2, j3, i2, f6, (Composer) obj3, RecomposeScopeImplKt.a(i3 | 1), i4);
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final float r29, int r30, final int r31, final int r32, final long r33, long r35, androidx.compose.runtime.Composer r37, final androidx.compose.ui.Modifier r38) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.b(float, int, int, int, long, long, androidx.compose.runtime.Composer, androidx.compose.ui.Modifier):void");
    }

    public static final void c(final Function0 function0, final Modifier modifier, final long j2, final long j3, final int i2, float f2, Function1 function1, Composer composer, final int i3, final int i4) {
        int i5;
        float f3;
        Function1 function12;
        float f4;
        final float f5;
        final Function1 function13;
        int i6;
        final float f6;
        final Function1 function14;
        ComposerImpl composerImplV = composer.v(-339970038);
        if ((i3 & 6) == 0) {
            i5 = (composerImplV.I(function0) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i3 & KyberEngine.KyberPolyBytes) == 0) {
            i5 |= composerImplV.s(j2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= composerImplV.s(j3) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= composerImplV.r(i2) ? 16384 : 8192;
        }
        int i7 = i4 & 32;
        if (i7 != 0) {
            i5 |= 196608;
            f3 = f2;
        } else {
            f3 = f2;
            if ((i3 & 196608) == 0) {
                i5 |= composerImplV.q(f3) ? 131072 : 65536;
            }
        }
        if ((i3 & 1572864) == 0) {
            function12 = function1;
            i5 |= ((i4 & 64) == 0 && composerImplV.I(function12)) ? 1048576 : 524288;
        } else {
            function12 = function1;
        }
        if ((i5 & 599187) == 599186 && composerImplV.c()) {
            composerImplV.j();
            f6 = f3;
            function14 = function12;
        } else {
            composerImplV.u0();
            int i8 = i3 & 1;
            Object obj = Composer.Companion.f1624a;
            if (i8 == 0 || composerImplV.c0()) {
                f4 = i7 != 0 ? ProgressIndicatorDefaults.c : f3;
                if ((i4 & 64) != 0) {
                    boolean z = ((((i5 & 896) ^ KyberEngine.KyberPolyBytes) > 256 && composerImplV.s(j2)) || (i5 & KyberEngine.KyberPolyBytes) == 256) | ((i5 & 57344) == 16384);
                    Object objG = composerImplV.G();
                    if (z || objG == obj) {
                        objG = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                DrawScope drawScope = (DrawScope) obj2;
                                float fMin = Math.min(drawScope.T1(ProgressIndicatorDefaults.b), Size.b(drawScope.h()));
                                float fB = (Size.b(drawScope.h()) - fMin) / 2;
                                long j4 = j2;
                                if (i2 == 1) {
                                    float f7 = fMin / 2.0f;
                                    DrawScope.j0(drawScope, j4, f7, OffsetKt.a((Size.d(drawScope.h()) - f7) - fB, Size.b(drawScope.h()) / 2.0f), null, 0, 120);
                                } else {
                                    DrawScope.S(drawScope, j4, OffsetKt.a((Size.d(drawScope.h()) - fMin) - fB, (Size.b(drawScope.h()) - fMin) / 2.0f), androidx.compose.ui.geometry.SizeKt.a(fMin, fMin), BitmapDescriptorFactory.HUE_RED, null, null, 120);
                                }
                                return Unit.f24250a;
                            }
                        };
                        composerImplV.A(objG);
                    }
                    i5 &= -3670017;
                    function12 = (Function1) objG;
                }
            } else {
                composerImplV.j();
                if ((i4 & 64) != 0) {
                    i5 &= -3670017;
                }
                f4 = f3;
            }
            composerImplV.W();
            boolean z2 = (i5 & 14) == 4;
            Object objG2 = composerImplV.G();
            if (z2 || objG2 == obj) {
                objG2 = new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$coercedProgress$1$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(RangesKt.b(((Number) function0.invoke()).floatValue(), BitmapDescriptorFactory.HUE_RED, 1.0f));
                    }
                };
                composerImplV.A(objG2);
            }
            final Function0 function02 = (Function0) objG2;
            Modifier modifierX0 = modifier.x0(b);
            boolean zN = composerImplV.n(function02);
            Object objG3 = composerImplV.G();
            if (zN || objG3 == obj) {
                objG3 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$3$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        SemanticsPropertiesKt.q((SemanticsPropertyReceiver) obj2, new ProgressBarRangeInfo(((Number) function02.invoke()).floatValue(), RangesKt.j(BitmapDescriptorFactory.HUE_RED, 1.0f), 0));
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG3);
            }
            Modifier modifierR = SizeKt.r(SemanticsModifierKt.b(modifierX0, true, (Function1) objG3), c, d);
            boolean zN2 = ((458752 & i5) == 131072) | ((i5 & 57344) == 16384) | composerImplV.n(function02) | ((((i5 & 7168) ^ 3072) > 2048 && composerImplV.s(j3)) || (i5 & 3072) == 2048) | ((((i5 & 896) ^ KyberEngine.KyberPolyBytes) > 256 && composerImplV.s(j2)) || (i5 & KyberEngine.KyberPolyBytes) == 256) | ((((3670016 & i5) ^ 1572864) > 1048576 && composerImplV.n(function12)) || (i5 & 1572864) == 1048576);
            Object objG4 = composerImplV.G();
            if (zN2 || objG4 == obj) {
                f5 = f4;
                function13 = function12;
                i6 = 0;
                objG4 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        DrawScope drawScope = (DrawScope) obj2;
                        float fB = Size.b(drawScope.h());
                        int i9 = i2;
                        float fC = f5;
                        if (i9 != 0 && Size.b(drawScope.h()) <= Size.d(drawScope.h())) {
                            fC += drawScope.C(fB);
                        }
                        float fC2 = fC / drawScope.C(Size.d(drawScope.h()));
                        float fFloatValue = ((Number) function02.invoke()).floatValue();
                        float fMin = Math.min(fFloatValue, fC2) + fFloatValue;
                        if (fMin <= 1.0f) {
                            ProgressIndicatorKt.d(drawScope, fMin, 1.0f, j3, fB, i2);
                        }
                        ProgressIndicatorKt.d(drawScope, BitmapDescriptorFactory.HUE_RED, fFloatValue, j2, fB, i2);
                        function13.invoke(drawScope);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG4);
            } else {
                f5 = f4;
                function13 = function12;
                i6 = 0;
            }
            CanvasKt.a(modifierR, (Function1) objG4, composerImplV, i6);
            f6 = f5;
            function14 = function13;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Number) obj3).intValue();
                    ProgressIndicatorKt.c(function0, modifier, j2, j3, i2, f6, function14, (Composer) obj2, RecomposeScopeImplKt.a(i3 | 1), i4);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void d(DrawScope drawScope, float f2, float f3, long j2, float f4, int i2) {
        float fD = Size.d(drawScope.h());
        float fB = Size.b(drawScope.h());
        float f5 = 2;
        float f6 = fB / f5;
        boolean z = drawScope.getLayoutDirection() == LayoutDirection.d;
        float f7 = (z ? f2 : 1.0f - f3) * fD;
        float f8 = (z ? f3 : 1.0f - f2) * fD;
        if (i2 == 0 || fB > fD) {
            drawScope.b1(j2, OffsetKt.a(f7, f6), OffsetKt.a(f8, f6), f4, (464 & 16) != 0 ? 0 : 0, (464 & 32) != 0 ? null : null, 3);
            return;
        }
        float f9 = f4 / f5;
        ClosedFloatingPointRange closedFloatingPointRangeJ = RangesKt.j(f9, fD - f9);
        float fFloatValue = ((Number) RangesKt.f(Float.valueOf(f7), closedFloatingPointRangeJ)).floatValue();
        float fFloatValue2 = ((Number) RangesKt.f(Float.valueOf(f8), closedFloatingPointRangeJ)).floatValue();
        if (Math.abs(f3 - f2) > BitmapDescriptorFactory.HUE_RED) {
            drawScope.b1(j2, OffsetKt.a(fFloatValue, f6), OffsetKt.a(fFloatValue2, f6), f4, (464 & 16) != 0 ? 0 : i2, (464 & 32) != 0 ? null : null, 3);
        }
    }

    public static final void e(DrawScope drawScope, float f2, float f3, long j2, Stroke stroke) {
        float f4 = 2;
        float f5 = stroke.f1803a / f4;
        float fD = Size.d(drawScope.h()) - (f4 * f5);
        drawScope.R1(j2, f2, f3, OffsetKt.a(f5, f5), androidx.compose.ui.geometry.SizeKt.a(fD, fD), (832 & 64) != 0 ? 1.0f : BitmapDescriptorFactory.HUE_RED, stroke);
    }
}
