package androidx.compose.ui.text.input;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.InternalTextApi;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/input/PartialGapBuffer;", "", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InternalTextApi
@RestrictTo
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PartialGapBuffer {

    /* renamed from: a, reason: collision with root package name */
    public String f2122a;
    public GapBuffer b;
    public int c;
    public int d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/input/PartialGapBuffer$Companion;", "", "", "BUF_SIZE", "I", "NOWHERE", "SURROUNDING_SIZE", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public final int a() {
        GapBuffer gapBuffer = this.b;
        if (gapBuffer == null) {
            return this.f2122a.length();
        }
        return (gapBuffer.f2114a - gapBuffer.a()) + (this.f2122a.length() - (this.d - this.c));
    }

    public final void b(int i, int i2, String str) {
        if (i > i2) {
            InlineClassHelperKt.a("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            InlineClassHelperKt.a("start must be non-negative, but was " + i);
        }
        GapBuffer gapBuffer = this.b;
        if (gapBuffer == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(this.f2122a.length() - i2, 64);
            String str2 = this.f2122a;
            int i3 = i - iMin;
            Intrinsics.f(str2, "null cannot be cast to non-null type java.lang.String");
            str2.getChars(i3, i, cArr, 0);
            String str3 = this.f2122a;
            int i4 = iMax - iMin2;
            int i5 = iMin2 + i2;
            Intrinsics.f(str3, "null cannot be cast to non-null type java.lang.String");
            str3.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            GapBuffer gapBuffer2 = new GapBuffer();
            gapBuffer2.f2114a = iMax;
            gapBuffer2.b = cArr;
            gapBuffer2.c = length;
            gapBuffer2.d = i4;
            this.b = gapBuffer2;
            this.c = i3;
            this.d = i5;
            return;
        }
        int i6 = this.c;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > gapBuffer.f2114a - gapBuffer.a()) {
            this.f2122a = toString();
            this.b = null;
            this.c = -1;
            this.d = -1;
            b(i, i2, str);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > gapBuffer.a()) {
            int iA = length2 - gapBuffer.a();
            int i9 = gapBuffer.f2114a;
            do {
                i9 *= 2;
            } while (i9 - gapBuffer.f2114a < iA);
            char[] cArr2 = new char[i9];
            ArraysKt.s(gapBuffer.b, cArr2, 0, 0, gapBuffer.c);
            int i10 = gapBuffer.f2114a;
            int i11 = gapBuffer.d;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            ArraysKt.s(gapBuffer.b, cArr2, i13, i11, i12 + i11);
            gapBuffer.b = cArr2;
            gapBuffer.f2114a = i9;
            gapBuffer.d = i13;
        }
        int i14 = gapBuffer.c;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = gapBuffer.b;
            ArraysKt.s(cArr3, cArr3, gapBuffer.d - i15, i8, i14);
            gapBuffer.c = i7;
            gapBuffer.d -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int iA2 = i7 + gapBuffer.a();
            int iA3 = i8 + gapBuffer.a();
            int i16 = gapBuffer.d;
            char[] cArr4 = gapBuffer.b;
            ArraysKt.s(cArr4, cArr4, gapBuffer.c, i16, iA2);
            gapBuffer.c += iA2 - i16;
            gapBuffer.d = iA3;
        } else {
            gapBuffer.d = i8 + gapBuffer.a();
            gapBuffer.c = i7;
        }
        str.getChars(0, str.length(), gapBuffer.b, gapBuffer.c);
        gapBuffer.c = str.length() + gapBuffer.c;
    }

    public final String toString() {
        GapBuffer gapBuffer = this.b;
        if (gapBuffer == null) {
            return this.f2122a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) this.f2122a, 0, this.c);
        sb.append(gapBuffer.b, 0, gapBuffer.c);
        char[] cArr = gapBuffer.b;
        int i = gapBuffer.d;
        sb.append(cArr, i, gapBuffer.f2114a - i);
        String str = this.f2122a;
        sb.append((CharSequence) str, this.d, str.length());
        return sb.toString();
    }
}
