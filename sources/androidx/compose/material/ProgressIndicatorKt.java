package androidx.compose.material;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005¨\u0006\n²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0002\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0004\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "firstLineHead", "firstLineTail", "secondLineHead", "secondLineTail", "", "currentRotation", "baseRotation", "endAngle", "startAngle", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ProgressIndicatorKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1310a = ProgressIndicatorDefaults.f1309a;
    public static final float b = 240;
    public static final float c = 40;
    public static final CubicBezierEasing d = new CubicBezierEasing(0.2f, BitmapDescriptorFactory.HUE_RED, 0.8f, 1.0f);
    public static final CubicBezierEasing e = new CubicBezierEasing(0.4f, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f);
    public static final CubicBezierEasing f = new CubicBezierEasing(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.65f, 1.0f);
    public static final CubicBezierEasing g = new CubicBezierEasing(0.1f, BitmapDescriptorFactory.HUE_RED, 0.45f, 1.0f);
    public static final CubicBezierEasing h = new CubicBezierEasing(0.4f, BitmapDescriptorFactory.HUE_RED, 0.2f, 1.0f);

    /* JADX WARN: Removed duplicated region for block: B:104:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final float r24, final androidx.compose.ui.Modifier r25, long r26, float r28, final long r29, int r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.a(float, androidx.compose.ui.Modifier, long, float, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(float r32, int r33, final int r34, final int r35, long r36, long r38, androidx.compose.runtime.Composer r40, androidx.compose.ui.Modifier r41) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.b(float, int, int, int, long, long, androidx.compose.runtime.Composer, androidx.compose.ui.Modifier):void");
    }

    public static final void c(final float f2, int i, final int i2, final int i3, final long j, final long j2, Composer composer, final Modifier modifier) {
        int i4;
        int i5;
        final int i6;
        Object obj;
        ComposerImpl composerImplV = composer.v(-531984864);
        if ((i2 & 6) == 0) {
            i4 = (composerImplV.q(f2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i4 |= composerImplV.s(j) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerImplV.s(j2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                i5 = i;
                int i7 = composerImplV.r(i5) ? 16384 : 8192;
                i4 |= i7;
            } else {
                i5 = i;
            }
            i4 |= i7;
        } else {
            i5 = i;
        }
        boolean z = true;
        if (composerImplV.z(i4 & 1, (i4 & 9363) != 9362)) {
            composerImplV.u0();
            if ((i2 & 1) != 0 && !composerImplV.c0()) {
                composerImplV.j();
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                }
            } else if ((i3 & 16) != 0) {
                i4 &= -57345;
                i5 = 0;
            }
            composerImplV.W();
            float f3 = f2 < BitmapDescriptorFactory.HUE_RED ? 0.0f : f2;
            if (f3 > 1.0f) {
                f3 = 1.0f;
            }
            float f4 = 10;
            Modifier modifierR = SizeKt.r(ProgressSemanticsKt.b(PaddingKt.h(SemanticsModifierKt.b(LayoutModifierKt.a(modifier, new ProgressIndicatorKt$increaseSemanticsBounds$1(f4)), true, ProgressIndicatorKt$increaseSemanticsBounds$2.h), BitmapDescriptorFactory.HUE_RED, f4, 1), f3, RangesKt.j(BitmapDescriptorFactory.HUE_RED, 1.0f), 0), b, f1310a);
            boolean zQ = ((((i4 & 7168) ^ 3072) > 2048 && composerImplV.s(j2)) || (i4 & 3072) == 2048) | ((((57344 & i4) ^ 24576) > 16384 && composerImplV.r(i5)) || (i4 & 24576) == 16384) | composerImplV.q(f3);
            if ((((i4 & 896) ^ KyberEngine.KyberPolyBytes) <= 256 || !composerImplV.s(j)) && (i4 & KyberEngine.KyberPolyBytes) != 256) {
                z = false;
            }
            boolean z2 = zQ | z;
            Object objG = composerImplV.G();
            if (z2 || objG == Composer.Companion.f1624a) {
                i6 = i5;
                final float f5 = f3;
                obj = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        DrawScope drawScope = (DrawScope) obj2;
                        float fB = Size.b(drawScope.h());
                        ProgressIndicatorKt.e(drawScope, BitmapDescriptorFactory.HUE_RED, 1.0f, j2, fB, i6);
                        ProgressIndicatorKt.e(drawScope, BitmapDescriptorFactory.HUE_RED, f5, j, fB, i6);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(obj);
            } else {
                obj = objG;
                i6 = i5;
            }
            CanvasKt.a(modifierR, (Function1) obj, composerImplV, 0);
        } else {
            composerImplV.j();
            i6 = i5;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            final int i8 = i6;
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Number) obj3).intValue();
                    int iA = RecomposeScopeImplKt.a(i2 | 1);
                    int i9 = i3;
                    ProgressIndicatorKt.c(f2, i8, iA, i9, j, j2, (Composer) obj2, modifier);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void d(DrawScope drawScope, float f2, float f3, long j, Stroke stroke) {
        float f4 = 2;
        float f5 = stroke.f1803a / f4;
        float fD = Size.d(drawScope.h()) - (f4 * f5);
        drawScope.R1(j, f2, f3, OffsetKt.a(f5, f5), androidx.compose.ui.geometry.SizeKt.a(fD, fD), (832 & 64) != 0 ? 1.0f : BitmapDescriptorFactory.HUE_RED, stroke);
    }

    public static final void e(DrawScope drawScope, float f2, float f3, long j, float f4, int i) {
        float fD = Size.d(drawScope.h());
        float fB = Size.b(drawScope.h());
        float f5 = 2;
        float f6 = fB / f5;
        boolean z = drawScope.getLayoutDirection() == LayoutDirection.d;
        float f7 = (z ? f2 : 1.0f - f3) * fD;
        float f8 = (z ? f3 : 1.0f - f2) * fD;
        if (i == 0 || fB > fD) {
            drawScope.b1(j, OffsetKt.a(f7, f6), OffsetKt.a(f8, f6), f4, (464 & 16) != 0 ? 0 : 0, (464 & 32) != 0 ? null : null, 3);
            return;
        }
        float f9 = f4 / f5;
        ClosedFloatingPointRange closedFloatingPointRangeJ = RangesKt.j(f9, fD - f9);
        float fFloatValue = ((Number) RangesKt.f(Float.valueOf(f7), closedFloatingPointRangeJ)).floatValue();
        float fFloatValue2 = ((Number) RangesKt.f(Float.valueOf(f8), closedFloatingPointRangeJ)).floatValue();
        if (Math.abs(f3 - f2) > BitmapDescriptorFactory.HUE_RED) {
            drawScope.b1(j, OffsetKt.a(fFloatValue, f6), OffsetKt.a(fFloatValue2, f6), f4, (464 & 16) != 0 ? 0 : i, (464 & 32) != 0 ? null : null, 3);
        }
    }
}
