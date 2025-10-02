package androidx.core.text;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import androidx.core.text.TextDirectionHeuristicsCompat;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class BidiFormatter {
    public static final TextDirectionHeuristicCompat c = TextDirectionHeuristicsCompat.c;
    public static final String d = Character.toString(8206);
    public static final String e = Character.toString(8207);
    public static final BidiFormatter f = new BidiFormatter(false);
    public static final BidiFormatter g = new BidiFormatter(true);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2456a;
    public final TextDirectionHeuristicCompat b;

    public static final class Builder {
    }

    public static class DirectionalityEstimator {
        public static final byte[] e = new byte[1792];

        /* renamed from: a, reason: collision with root package name */
        public final CharSequence f2457a;
        public final int b;
        public int c;
        public char d;

        static {
            for (int i = 0; i < 1792; i++) {
                e[i] = Character.getDirectionality(i);
            }
        }

        public DirectionalityEstimator(CharSequence charSequence) {
            this.f2457a = charSequence;
            this.b = charSequence.length();
        }

        public final byte a() {
            int i = this.c - 1;
            CharSequence charSequence = this.f2457a;
            char cCharAt = charSequence.charAt(i);
            this.d = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(charSequence, this.c);
                this.c -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.c--;
            char c = this.d;
            return c < 1792 ? e[c] : Character.getDirectionality(c);
        }
    }

    public BidiFormatter(boolean z) {
        TextDirectionHeuristicCompat textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.c;
        this.f2456a = z;
        this.b = textDirectionHeuristicCompat;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        if (r0.c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        switch(r0.a()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0086, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008c, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(java.lang.CharSequence r9) {
        /*
            androidx.core.text.BidiFormatter$DirectionalityEstimator r0 = new androidx.core.text.BidiFormatter$DirectionalityEstimator
            r0.<init>(r9)
            r9 = 0
            r0.c = r9
            r1 = r9
            r2 = r1
            r3 = r2
        Lb:
            int r4 = r0.c
            int r5 = r0.b
            r6 = -1
            r7 = 1
            if (r4 >= r5) goto L6e
            if (r1 != 0) goto L6e
            java.lang.CharSequence r5 = r0.f2457a
            char r4 = r5.charAt(r4)
            r0.d = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L37
            int r4 = r0.c
            int r4 = java.lang.Character.codePointAt(r5, r4)
            int r5 = r0.c
            int r8 = java.lang.Character.charCount(r4)
            int r8 = r8 + r5
            r0.c = r8
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L4b
        L37:
            int r4 = r0.c
            int r4 = r4 + r7
            r0.c = r4
            char r4 = r0.d
            r5 = 1792(0x700, float:2.511E-42)
            if (r4 >= r5) goto L47
            byte[] r5 = androidx.core.text.BidiFormatter.DirectionalityEstimator.e
            r4 = r5[r4]
            goto L4b
        L47:
            byte r4 = java.lang.Character.getDirectionality(r4)
        L4b:
            if (r4 == 0) goto L69
            if (r4 == r7) goto L66
            r5 = 2
            if (r4 == r5) goto L66
            r5 = 9
            if (r4 == r5) goto Lb
            switch(r4) {
                case 14: goto L62;
                case 15: goto L62;
                case 16: goto L5e;
                case 17: goto L5e;
                case 18: goto L5a;
                default: goto L59;
            }
        L59:
            goto L6c
        L5a:
            int r3 = r3 + (-1)
            r2 = r9
            goto Lb
        L5e:
            int r3 = r3 + 1
            r2 = r7
            goto Lb
        L62:
            int r3 = r3 + 1
            r2 = r6
            goto Lb
        L66:
            if (r3 != 0) goto L6c
            goto L85
        L69:
            if (r3 != 0) goto L6c
            goto L8b
        L6c:
            r1 = r3
            goto Lb
        L6e:
            if (r1 != 0) goto L71
            goto L8c
        L71:
            if (r2 == 0) goto L74
            return r2
        L74:
            int r2 = r0.c
            if (r2 <= 0) goto L8c
            byte r2 = r0.a()
            switch(r2) {
                case 14: goto L89;
                case 15: goto L89;
                case 16: goto L83;
                case 17: goto L83;
                case 18: goto L80;
                default: goto L7f;
            }
        L7f:
            goto L74
        L80:
            int r3 = r3 + 1
            goto L74
        L83:
            if (r1 != r3) goto L86
        L85:
            return r7
        L86:
            int r3 = r3 + (-1)
            goto L74
        L89:
            if (r1 != r3) goto L86
        L8b:
            return r6
        L8c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.text.BidiFormatter.a(java.lang.CharSequence):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0034, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(java.lang.CharSequence r6) {
        /*
            androidx.core.text.BidiFormatter$DirectionalityEstimator r0 = new androidx.core.text.BidiFormatter$DirectionalityEstimator
            r0.<init>(r6)
            int r6 = r0.b
            r0.c = r6
            r6 = 0
            r1 = r6
        Lb:
            r2 = r1
        Lc:
            int r3 = r0.c
            if (r3 <= 0) goto L3f
            byte r3 = r0.a()
            if (r3 == 0) goto L38
            r4 = 1
            if (r3 == r4) goto L32
            r5 = 2
            if (r3 == r5) goto L32
            r5 = 9
            if (r3 == r5) goto Lc
            switch(r3) {
                case 14: goto L2f;
                case 15: goto L2f;
                case 16: goto L29;
                case 17: goto L29;
                case 18: goto L26;
                default: goto L23;
            }
        L23:
            if (r2 != 0) goto Lc
            goto L3e
        L26:
            int r1 = r1 + 1
            goto Lc
        L29:
            if (r2 != r1) goto L2c
            goto L34
        L2c:
            int r1 = r1 + (-1)
            goto Lc
        L2f:
            if (r2 != r1) goto L2c
            goto L3a
        L32:
            if (r1 != 0) goto L35
        L34:
            return r4
        L35:
            if (r2 != 0) goto Lc
            goto L3e
        L38:
            if (r1 != 0) goto L3c
        L3a:
            r6 = -1
            return r6
        L3c:
            if (r2 != 0) goto Lc
        L3e:
            goto Lb
        L3f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.text.BidiFormatter.b(java.lang.CharSequence):int");
    }

    public static BidiFormatter c() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? g : f;
    }

    public final SpannableStringBuilder d(CharSequence charSequence) {
        TextDirectionHeuristicCompat textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.c;
        if (charSequence == null) {
            return null;
        }
        boolean zA = ((TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl) textDirectionHeuristicCompat).a(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zA2 = ((TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl) (zA ? TextDirectionHeuristicsCompat.b : TextDirectionHeuristicsCompat.f2459a)).a(charSequence.length(), charSequence);
        String str = "";
        String str2 = e;
        String str3 = d;
        boolean z = this.f2456a;
        spannableStringBuilder.append((CharSequence) ((z || !(zA2 || a(charSequence) == 1)) ? (!z || (zA2 && a(charSequence) != -1)) ? "" : str2 : str3));
        if (zA != z) {
            spannableStringBuilder.append(zA ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zA3 = ((TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl) (zA ? TextDirectionHeuristicsCompat.b : TextDirectionHeuristicsCompat.f2459a)).a(charSequence.length(), charSequence);
        if (!z && (zA3 || b(charSequence) == 1)) {
            str = str3;
        } else if (z && (!zA3 || b(charSequence) == -1)) {
            str = str2;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}
