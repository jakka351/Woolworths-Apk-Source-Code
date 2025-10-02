package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/OutlineResolver;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class OutlineResolver {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1976a = true;
    public final Outline b;
    public androidx.compose.ui.graphics.Outline c;
    public AndroidPath d;
    public Path e;
    public boolean f;
    public boolean g;
    public Path h;
    public RoundRect i;
    public float j;
    public long k;
    public long l;
    public boolean m;

    public OutlineResolver() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.b = outline;
        this.k = 0L;
        this.l = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(androidx.compose.ui.graphics.Canvas r15) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.OutlineResolver.a(androidx.compose.ui.graphics.Canvas):void");
    }

    public final Outline b() {
        h();
        if (this.m && this.f1976a) {
            return this.b;
        }
        return null;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getF() {
        return this.f;
    }

    public final Path d() {
        h();
        return this.e;
    }

    public final boolean e() {
        return !this.g;
    }

    public final boolean f(long j) {
        androidx.compose.ui.graphics.Outline outline;
        if (this.m && (outline = this.c) != null) {
            return ShapeContainingUtilKt.a(outline, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
        return true;
    }

    public final boolean g(androidx.compose.ui.graphics.Outline outline, float f, boolean z, float f2, long j) {
        this.b.setAlpha(f);
        boolean zC = Intrinsics.c(this.c, outline);
        boolean z2 = !zC;
        if (!zC) {
            this.c = outline;
            this.f = true;
        }
        this.l = j;
        boolean z3 = outline != null && (z || f2 > BitmapDescriptorFactory.HUE_RED);
        if (this.m != z3) {
            this.m = z3;
            this.f = true;
        }
        return z2;
    }

    public final void h() {
        if (this.f) {
            this.k = 0L;
            this.j = BitmapDescriptorFactory.HUE_RED;
            this.e = null;
            this.f = false;
            this.g = false;
            androidx.compose.ui.graphics.Outline outline = this.c;
            Outline outline2 = this.b;
            if (outline == null || !this.m || Float.intBitsToFloat((int) (this.l >> 32)) <= BitmapDescriptorFactory.HUE_RED || Float.intBitsToFloat((int) (this.l & 4294967295L)) <= BitmapDescriptorFactory.HUE_RED) {
                outline2.setEmpty();
                return;
            }
            this.f1976a = true;
            if (outline instanceof Outline.Rectangle) {
                Rect rect = ((Outline.Rectangle) outline).f1775a;
                float f = rect.f1752a;
                float f2 = rect.b;
                this.k = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
                float f3 = rect.c;
                float f4 = rect.f1752a;
                float f5 = rect.d;
                this.l = (Float.floatToRawIntBits(f5 - f2) & 4294967295L) | (Float.floatToRawIntBits(f3 - f4) << 32);
                outline2.setRect(Math.round(f4), Math.round(f2), Math.round(f3), Math.round(f5));
                return;
            }
            if (!(outline instanceof Outline.Rounded)) {
                if (outline instanceof Outline.Generic) {
                    i(((Outline.Generic) outline).f1774a);
                    return;
                }
                return;
            }
            RoundRect roundRect = ((Outline.Rounded) outline).f1776a;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (roundRect.e >> 32));
            float f6 = roundRect.f1753a;
            float f7 = roundRect.b;
            this.k = (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L);
            float fB = roundRect.b();
            float fA = roundRect.a();
            this.l = (Float.floatToRawIntBits(fA) & 4294967295L) | (Float.floatToRawIntBits(fB) << 32);
            if (RoundRectKt.d(roundRect)) {
                this.b.setRoundRect(Math.round(f6), Math.round(f7), Math.round(roundRect.c), Math.round(roundRect.d), fIntBitsToFloat);
                this.j = fIntBitsToFloat;
                return;
            }
            AndroidPath androidPathA = this.d;
            if (androidPathA == null) {
                androidPathA = AndroidPath_androidKt.a();
                this.d = androidPathA;
            }
            androidPathA.reset();
            Path.k(androidPathA, roundRect);
            i(androidPathA);
        }
    }

    public final void i(Path path) {
        int i = Build.VERSION.SDK_INT;
        android.graphics.Outline outline = this.b;
        if (i > 28 || path.l()) {
            if (i >= 30) {
                OutlineVerificationHelper.f1977a.a(outline, path);
            } else {
                if (!(path instanceof AndroidPath)) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                outline.setConvexPath(((AndroidPath) path).f1761a);
            }
            this.g = !outline.canClip();
        } else {
            this.f1976a = false;
            outline.setEmpty();
            this.g = true;
        }
        this.e = path;
    }
}
