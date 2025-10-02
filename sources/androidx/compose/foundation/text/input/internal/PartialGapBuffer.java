package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/PartialGapBuffer;", "", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PartialGapBuffer implements CharSequence {
    public CharSequence d;
    public GapBuffer e;
    public int f;
    public int g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/input/internal/PartialGapBuffer$Companion;", "", "", "BUF_SIZE", "I", "NOWHERE", "SURROUNDING_SIZE", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public final void a(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (i > i2) {
            InlineClassHelperKt.a("start=" + i + " > end=" + i2);
        }
        if (i3 > i4) {
            InlineClassHelperKt.a("textStart=" + i3 + " > textEnd=" + i4);
        }
        if (i < 0) {
            InlineClassHelperKt.a("start must be non-negative, but was " + i);
        }
        if (i3 < 0) {
            InlineClassHelperKt.a("textStart must be non-negative, but was " + i3);
        }
        GapBuffer gapBuffer = this.e;
        int i5 = i4 - i3;
        if (gapBuffer == null) {
            int iMax = Math.max(255, i5 + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(this.d.length() - i2, 64);
            int i6 = i - iMin;
            ToCharArray_androidKt.a(this.d, cArr, 0, i6, i);
            int i7 = iMax - iMin2;
            int i8 = iMin2 + i2;
            ToCharArray_androidKt.a(this.d, cArr, i7, i2, i8);
            ToCharArray_androidKt.a(charSequence, cArr, iMin, i3, i4);
            GapBuffer gapBuffer2 = new GapBuffer();
            gapBuffer2.f1159a = iMax;
            gapBuffer2.b = cArr;
            gapBuffer2.c = iMin + i5;
            gapBuffer2.d = i7;
            this.e = gapBuffer2;
            this.f = i6;
            this.g = i8;
            return;
        }
        int i9 = this.f;
        int i10 = i - i9;
        int i11 = i2 - i9;
        if (i10 < 0 || i11 > gapBuffer.f1159a - gapBuffer.a()) {
            this.d = toString();
            this.e = null;
            this.f = -1;
            this.g = -1;
            a(i, i2, charSequence, i3, i4);
            return;
        }
        int i12 = i5 - (i11 - i10);
        if (i12 > gapBuffer.a()) {
            int iA = i12 - gapBuffer.a();
            int i13 = gapBuffer.f1159a;
            do {
                i13 *= 2;
            } while (i13 - gapBuffer.f1159a < iA);
            char[] cArr2 = new char[i13];
            ArraysKt.s(gapBuffer.b, cArr2, 0, 0, gapBuffer.c);
            int i14 = gapBuffer.f1159a;
            int i15 = gapBuffer.d;
            int i16 = i14 - i15;
            int i17 = i13 - i16;
            ArraysKt.s(gapBuffer.b, cArr2, i17, i15, i16 + i15);
            gapBuffer.b = cArr2;
            gapBuffer.f1159a = i13;
            gapBuffer.d = i17;
        }
        int i18 = gapBuffer.c;
        if (i10 < i18 && i11 <= i18) {
            int i19 = i18 - i11;
            char[] cArr3 = gapBuffer.b;
            ArraysKt.s(cArr3, cArr3, gapBuffer.d - i19, i11, i18);
            gapBuffer.c = i10;
            gapBuffer.d -= i19;
        } else if (i10 >= i18 || i11 < i18) {
            int iA2 = i10 + gapBuffer.a();
            int iA3 = i11 + gapBuffer.a();
            int i20 = gapBuffer.d;
            char[] cArr4 = gapBuffer.b;
            ArraysKt.s(cArr4, cArr4, gapBuffer.c, i20, iA2);
            gapBuffer.c += iA2 - i20;
            gapBuffer.d = iA3;
        } else {
            gapBuffer.d = i11 + gapBuffer.a();
            gapBuffer.c = i10;
        }
        ToCharArray_androidKt.a(charSequence, gapBuffer.b, gapBuffer.c, i3, i4);
        gapBuffer.c += i5;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        GapBuffer gapBuffer = this.e;
        if (gapBuffer != null && i >= this.f) {
            int iA = gapBuffer.f1159a - gapBuffer.a();
            int i2 = this.f;
            if (i >= iA + i2) {
                return this.d.charAt(i - ((iA - this.g) + i2));
            }
            int i3 = i - i2;
            int i4 = gapBuffer.c;
            return i3 < i4 ? gapBuffer.b[i3] : gapBuffer.b[(i3 - i4) + gapBuffer.d];
        }
        return this.d.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        GapBuffer gapBuffer = this.e;
        if (gapBuffer == null) {
            return this.d.length();
        }
        return (gapBuffer.f1159a - gapBuffer.a()) + (this.d.length() - (this.g - this.f));
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return toString().subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        GapBuffer gapBuffer = this.e;
        if (gapBuffer == null) {
            return this.d.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.d, 0, this.f);
        sb.append(gapBuffer.b, 0, gapBuffer.c);
        char[] cArr = gapBuffer.b;
        int i = gapBuffer.d;
        sb.append(cArr, i, gapBuffer.f1159a - i);
        CharSequence charSequence = this.d;
        sb.append(charSequence, this.g, charSequence.length());
        return sb.toString();
    }
}
