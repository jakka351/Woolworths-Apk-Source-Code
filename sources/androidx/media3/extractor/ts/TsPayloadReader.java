package androidx.media3.extractor.ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ExtractorOutput;
import com.medallia.digital.mobilesdk.q2;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@UnstableApi
/* loaded from: classes2.dex */
public interface TsPayloadReader {

    public static final class DvbSubtitleInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f3441a;
        public final byte[] b;

        public DvbSubtitleInfo(String str, byte[] bArr) {
            this.f3441a = str;
            this.b = bArr;
        }
    }

    public static final class EsInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f3442a;
        public final int b;
        public final List c;
        public final byte[] d;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface AudioType {
        }

        public EsInfo(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
            this.f3442a = str;
            this.b = i2;
            this.c = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
            this.d = bArr;
        }

        public final int a() {
            int i = this.b;
            if (i != 2) {
                return i != 3 ? 0 : 512;
            }
            return 2048;
        }
    }

    public interface Factory {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static final class TrackIdGenerator {

        /* renamed from: a, reason: collision with root package name */
        public final String f3443a;
        public final int b;
        public final int c;
        public int d;
        public String e;

        public TrackIdGenerator(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        public final void a() {
            int i = this.d;
            this.d = i == Integer.MIN_VALUE ? this.b : i + this.c;
            this.e = this.f3443a + this.d;
        }

        public final void b() {
            if (this.d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public TrackIdGenerator(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + q2.c;
            } else {
                str = "";
            }
            this.f3443a = str;
            this.b = i2;
            this.c = i3;
            this.d = Integer.MIN_VALUE;
            this.e = "";
        }
    }

    void a(int i, ParsableByteArray parsableByteArray);

    void b();

    void c(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TrackIdGenerator trackIdGenerator);
}
