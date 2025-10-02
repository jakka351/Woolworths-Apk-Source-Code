package androidx.compose.ui.text;

import android.graphics.RectF;
import android.os.Build;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.android.AndroidLayoutApi34;
import androidx.compose.ui.text.android.LayoutIntrinsics;
import androidx.compose.ui.text.android.TextAndroidCanvas;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.TextLayoutGetRangeForRectExtensions_androidKt;
import androidx.compose.ui.text.android.TextLayout_androidKt;
import androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt;
import androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt$NoopSpan$1;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/AndroidParagraph;", "Landroidx/compose/ui/text/Paragraph;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AndroidParagraph implements Paragraph {

    /* renamed from: a, reason: collision with root package name */
    public final AndroidParagraphIntrinsics f2030a;
    public final int b;
    public final long c;
    public final TextLayout d;
    public final CharSequence e;
    public final Object f;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ResolvedTextDirection.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ResolvedTextDirection resolvedTextDirection = ResolvedTextDirection.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AndroidParagraph(androidx.compose.ui.text.platform.AndroidParagraphIntrinsics r21, int r22, int r23, long r24) {
        /*
            Method dump skipped, instructions count: 960
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.AndroidParagraph.<init>(androidx.compose.ui.text.platform.AndroidParagraphIntrinsics, int, int, long):void");
    }

    public final TextLayout a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        PlatformParagraphStyle platformParagraphStyle;
        float fI = i();
        AndroidParagraphIntrinsics androidParagraphIntrinsics = this.f2030a;
        AndroidTextPaint androidTextPaint = androidParagraphIntrinsics.g;
        int i8 = androidParagraphIntrinsics.l;
        LayoutIntrinsics layoutIntrinsics = androidParagraphIntrinsics.i;
        TextStyle textStyle = androidParagraphIntrinsics.b;
        AndroidParagraphHelper_androidKt$NoopSpan$1 androidParagraphHelper_androidKt$NoopSpan$1 = AndroidParagraphHelper_androidKt.f2138a;
        PlatformTextStyle platformTextStyle = textStyle.platformStyle;
        return new TextLayout(charSequence, fI, androidTextPaint, i, truncateAt, i8, (platformTextStyle == null || (platformParagraphStyle = platformTextStyle.b) == null) ? false : platformParagraphStyle.f2052a, i3, i5, i6, i7, i4, i2, layoutIntrinsics);
    }

    public final ResolvedTextDirection b(int i) {
        return this.d.f.isRtlCharAt(i) ? ResolvedTextDirection.e : ResolvedTextDirection.d;
    }

    public final float c() {
        return this.d.e(0);
    }

    public final float d() {
        return this.d.b();
    }

    public final float e(int i, boolean z) {
        TextLayout textLayout = this.d;
        return z ? textLayout.i(i, false) : textLayout.j(i, false);
    }

    public final float f() {
        return this.d.e(r0.g - 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final List g() {
        return this.f;
    }

    public final long h(Rect rect, int i, final TextInclusionStrategy textInclusionStrategy) {
        int[] iArrB;
        RectF rectFC = RectHelper_androidKt.c(rect);
        int i2 = (!TextGranularity.a(i, 0) && TextGranularity.a(i, 1)) ? 1 : 0;
        Function2<RectF, RectF, Boolean> function2 = new Function2<RectF, RectF, Boolean>() { // from class: androidx.compose.ui.text.AndroidParagraph$getRangeForRect$range$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(textInclusionStrategy.e(RectHelper_androidKt.e((RectF) obj), RectHelper_androidKt.e((RectF) obj2)));
            }
        };
        int i3 = Build.VERSION.SDK_INT;
        TextLayout textLayout = this.d;
        if (i3 >= 34) {
            textLayout.getClass();
            iArrB = AndroidLayoutApi34.a(textLayout, rectFC, i2, function2);
        } else {
            iArrB = TextLayoutGetRangeForRectExtensions_androidKt.b(textLayout, textLayout.f, textLayout.d(), rectFC, i2, function2);
        }
        return iArrB == null ? TextRange.b : TextRangeKt.a(iArrB[0], iArrB[1]);
    }

    public final float i() {
        return Constraints.h(this.c);
    }

    public final void j(Canvas canvas) {
        android.graphics.Canvas canvasA = AndroidCanvas_androidKt.a(canvas);
        TextLayout textLayout = this.d;
        if (textLayout.d) {
            canvasA.save();
            canvasA.clipRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i(), d());
        }
        int i = textLayout.h;
        if (canvasA.getClipBounds(textLayout.p)) {
            if (i != 0) {
                canvasA.translate(BitmapDescriptorFactory.HUE_RED, i);
            }
            TextAndroidCanvas textAndroidCanvas = TextLayout_androidKt.f2079a;
            textAndroidCanvas.f2077a = canvasA;
            textLayout.f.draw(textAndroidCanvas);
            if (i != 0) {
                canvasA.translate(BitmapDescriptorFactory.HUE_RED, (-1) * i);
            }
        }
        if (textLayout.d) {
            canvasA.restore();
        }
    }

    public final void k(Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle) {
        AndroidTextPaint androidTextPaint = this.f2030a.g;
        int i = androidTextPaint.c;
        androidTextPaint.d(j);
        androidTextPaint.f(shadow);
        androidTextPaint.g(textDecoration);
        androidTextPaint.e(drawStyle);
        androidTextPaint.b(3);
        j(canvas);
        androidTextPaint.b(i);
    }

    public final void l(Canvas canvas, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle) {
        AndroidTextPaint androidTextPaint = this.f2030a.g;
        int i = androidTextPaint.c;
        float fI = i();
        float fD = d();
        androidTextPaint.c(brush, (Float.floatToRawIntBits(fD) & 4294967295L) | (Float.floatToRawIntBits(fI) << 32), f);
        androidTextPaint.f(shadow);
        androidTextPaint.g(textDecoration);
        androidTextPaint.e(drawStyle);
        androidTextPaint.b(3);
        j(canvas);
        androidTextPaint.b(i);
    }
}
