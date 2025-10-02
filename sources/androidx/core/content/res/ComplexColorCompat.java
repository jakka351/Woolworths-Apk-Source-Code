package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.graphics.Shader;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes.dex */
public final class ComplexColorCompat {

    /* renamed from: a, reason: collision with root package name */
    public final Shader f2418a;
    public final ColorStateList b;
    public int c;

    public ComplexColorCompat(Shader shader, ColorStateList colorStateList, int i) {
        this.f2418a = shader;
        this.b = colorStateList;
        this.c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f7, code lost:
    
        if (r11 == 1) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01fa, code lost:
    
        if (r11 == 2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01fc, code lost:
    
        r1 = r0.f2422a;
        r0 = r0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0202, code lost:
    
        if (r10 == 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0204, code lost:
    
        if (r10 == 2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0206, code lost:
    
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0217, code lost:
    
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x021a, code lost:
    
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x021d, code lost:
    
        r11 = new android.graphics.LinearGradient(r21, r22, r26, r27, r1, r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0221, code lost:
    
        r11 = new android.graphics.SweepGradient(r8, r9, r0.f2422a, r0.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x022f, code lost:
    
        if (r25 <= com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0231, code lost:
    
        r1 = r0.f2422a;
        r0 = r0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0238, code lost:
    
        if (r10 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x023b, code lost:
    
        if (r10 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x023d, code lost:
    
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x024c, code lost:
    
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x024f, code lost:
    
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0252, code lost:
    
        r11 = new android.graphics.RadialGradient(r8, r9, r25, r1, r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x025e, code lost:
    
        return new androidx.core.content.res.ComplexColorCompat(r11, null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0266, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01dc, code lost:
    
        if (r13.size() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01de, code lost:
    
        r0 = new androidx.core.content.res.GradientColorInflaterCompat.ColorStops(r13, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e4, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e5, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e9, code lost:
    
        if (r20 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01eb, code lost:
    
        r0 = new androidx.core.content.res.GradientColorInflaterCompat.ColorStops(r6, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f1, code lost:
    
        r0 = new androidx.core.content.res.GradientColorInflaterCompat.ColorStops(r6, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.core.content.res.ComplexColorCompat a(int r30, android.content.res.Resources.Theme r31, android.content.res.Resources r32) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.ComplexColorCompat.a(int, android.content.res.Resources$Theme, android.content.res.Resources):androidx.core.content.res.ComplexColorCompat");
    }

    public final boolean b() {
        ColorStateList colorStateList;
        return this.f2418a == null && (colorStateList = this.b) != null && colorStateList.isStateful();
    }
}
