package androidx.core.text;

import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class TextDirectionHeuristicsCompat {

    /* renamed from: a, reason: collision with root package name */
    public static final TextDirectionHeuristicCompat f2459a = new TextDirectionHeuristicInternal(null, false);
    public static final TextDirectionHeuristicCompat b = new TextDirectionHeuristicInternal(null, true);
    public static final TextDirectionHeuristicCompat c;
    public static final TextDirectionHeuristicCompat d;

    public static class AnyStrong implements TextDirectionAlgorithm {
        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm
        public final int a(int i, CharSequence charSequence) {
            boolean z = false;
            for (int i2 = 0; i2 < i; i2++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i2));
                TextDirectionHeuristicCompat textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.f2459a;
                if (directionality == 0) {
                    z = true;
                } else if (directionality == 1 || directionality == 2) {
                    return 0;
                }
            }
            return z ? 1 : 2;
        }
    }

    public static class FirstStrong implements TextDirectionAlgorithm {

        /* renamed from: a, reason: collision with root package name */
        public static final FirstStrong f2460a = new FirstStrong();

        /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int a(int r6, java.lang.CharSequence r7) {
            /*
                r5 = this;
                r0 = 0
                r1 = 2
                r2 = r0
                r3 = r1
            L4:
                if (r2 >= r6) goto L24
                if (r3 != r1) goto L24
                char r3 = r7.charAt(r2)
                byte r3 = java.lang.Character.getDirectionality(r3)
                androidx.core.text.TextDirectionHeuristicCompat r4 = androidx.core.text.TextDirectionHeuristicsCompat.f2459a
                r4 = 1
                if (r3 == 0) goto L20
                if (r3 == r4) goto L1e
                if (r3 == r1) goto L1e
                switch(r3) {
                    case 14: goto L20;
                    case 15: goto L20;
                    case 16: goto L1e;
                    case 17: goto L1e;
                    default: goto L1c;
                }
            L1c:
                r3 = r1
                goto L21
            L1e:
                r3 = r0
                goto L21
            L20:
                r3 = r4
            L21:
                int r2 = r2 + 1
                goto L4
            L24:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.text.TextDirectionHeuristicsCompat.FirstStrong.a(int, java.lang.CharSequence):int");
        }
    }

    public interface TextDirectionAlgorithm {
        int a(int i, CharSequence charSequence);
    }

    public static abstract class TextDirectionHeuristicImpl implements TextDirectionHeuristicCompat {

        /* renamed from: a, reason: collision with root package name */
        public final TextDirectionAlgorithm f2461a;

        public TextDirectionHeuristicImpl(TextDirectionAlgorithm textDirectionAlgorithm) {
            this.f2461a = textDirectionAlgorithm;
        }

        @Override // androidx.core.text.TextDirectionHeuristicCompat
        public final boolean a(int i, CharSequence charSequence) {
            if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
                throw new IllegalArgumentException();
            }
            TextDirectionAlgorithm textDirectionAlgorithm = this.f2461a;
            if (textDirectionAlgorithm == null) {
                return b();
            }
            int iA = textDirectionAlgorithm.a(i, charSequence);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return b();
            }
            return false;
        }

        public abstract boolean b();
    }

    public static class TextDirectionHeuristicInternal extends TextDirectionHeuristicImpl {
        public final boolean b;

        public TextDirectionHeuristicInternal(FirstStrong firstStrong, boolean z) {
            super(firstStrong);
            this.b = z;
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl
        public final boolean b() {
            return this.b;
        }
    }

    public static class TextDirectionHeuristicLocale extends TextDirectionHeuristicImpl {
        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl
        public final boolean b() {
            return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        }
    }

    static {
        FirstStrong firstStrong = FirstStrong.f2460a;
        c = new TextDirectionHeuristicInternal(firstStrong, false);
        d = new TextDirectionHeuristicInternal(firstStrong, true);
    }
}
