package au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"instore-navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductMarkerKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v2 */
    public static final void a(final String str, final float f, final long j, final long j2, Modifier modifier, Composer composer, final int i) {
        int i2;
        Modifier modifier2;
        ?? r12;
        Modifier modifier3;
        ComposerImpl composerImplV = composer.v(869272006);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.q(f) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.s(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.s(j2) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if ((i3 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            final float d = ((Density) composerImplV.x(CompositionLocalsKt.h)).getE() * f;
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            Object obj = objG;
            if (objG == composer$Companion$Empty$1) {
                Paint paint = AndroidPaint_androidKt.a().f1759a;
                paint.setColor(ColorKt.j(j));
                paint.setTextSize(0.3f * d);
                paint.setTextAlign(Paint.Align.CENTER);
                paint.setAntiAlias(true);
                paint.setTypeface(Typeface.DEFAULT_BOLD);
                composerImplV.A(paint);
                obj = paint;
            }
            final Paint paint2 = (Paint) obj;
            composerImplV.V(false);
            modifier2 = Modifier.Companion.d;
            Modifier modifierQ = SizeKt.q(modifier2, f);
            composerImplV.o(-1224400529);
            boolean zQ = ((i3 & 7168) == 2048) | composerImplV.q(d) | ((i3 & 112) == 32) | composerImplV.I(paint2) | ((i3 & 14) == 4);
            Object objG2 = composerImplV.G();
            if (zQ || objG2 == composer$Companion$Empty$1) {
                r12 = 0;
                modifier3 = modifierQ;
                Function1 function1 = new Function1() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        DrawScope Canvas = (DrawScope) obj2;
                        Intrinsics.h(Canvas, "$this$Canvas");
                        float f2 = d * 0.25f;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.M0() >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.M0() & 4294967295L)) - (f / 2.7f);
                        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
                        DrawScope.j0(Canvas, j2, f2, jFloatToRawIntBits, null, 0, 120);
                        Rect rect = new Rect();
                        String str2 = str;
                        int length = str2.length();
                        Paint paint3 = paint2;
                        paint3.getTextBounds(str2, 0, length, rect);
                        AndroidCanvas_androidKt.a(Canvas.getE().a()).drawText(str2, Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) - rect.exactCenterY(), paint3);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(function1);
                objG2 = function1;
            } else {
                modifier3 = modifierQ;
                r12 = 0;
            }
            composerImplV.V(r12);
            CanvasKt.a(modifier3, (Function1) objG2, composerImplV, r12);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            final Modifier modifier4 = modifier2;
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    ProductMarkerKt.a(str, f, j, j2, modifier4, (Composer) obj2, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(boolean r23, java.lang.String r24, kotlin.jvm.functions.Function0 r25, androidx.compose.ui.Modifier r26, float r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.ProductMarkerKt.b(boolean, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, float, androidx.compose.runtime.Composer, int, int):void");
    }
}
