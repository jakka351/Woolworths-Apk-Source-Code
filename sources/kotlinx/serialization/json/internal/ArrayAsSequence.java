package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/ArrayAsSequence;", "", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ArrayAsSequence implements CharSequence {
    public final char[] d;
    public int e;

    public ArrayAsSequence(char[] cArr) {
        this.d = cArr;
        this.e = cArr.length;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.d[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.e;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return StringsKt.n(this.d, i, Math.min(i2, this.e));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int i = this.e;
        return StringsKt.n(this.d, 0, Math.min(i, i));
    }
}
