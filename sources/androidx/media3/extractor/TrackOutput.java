package androidx.media3.extractor;

import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

@UnstableApi
/* loaded from: classes2.dex */
public interface TrackOutput {

    public static final class CryptoData {

        /* renamed from: a, reason: collision with root package name */
        public final int f3253a;
        public final byte[] b;
        public final int c;
        public final int d;

        public CryptoData(int i, byte[] bArr, int i2, int i3) {
            this.f3253a = i;
            this.b = bArr;
            this.c = i2;
            this.d = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && CryptoData.class == obj.getClass()) {
                CryptoData cryptoData = (CryptoData) obj;
                if (this.f3253a == cryptoData.f3253a && this.c == cryptoData.c && this.d == cryptoData.d && Arrays.equals(this.b, cryptoData.b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((androidx.compose.ui.input.pointer.a.d(this.f3253a * 31, 31, this.b) + this.c) * 31) + this.d;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SampleDataPart {
    }

    void a(ParsableByteArray parsableByteArray, int i, int i2);

    default int b(DataReader dataReader, int i, boolean z) {
        return f(dataReader, i, z);
    }

    default void c(int i, ParsableByteArray parsableByteArray) {
        a(parsableByteArray, i, 0);
    }

    default void d() {
    }

    void e(Format format);

    int f(DataReader dataReader, int i, boolean z);

    void g(long j, int i, int i2, int i3, CryptoData cryptoData);
}
