package androidx.media3.extractor.text;

import androidx.media3.common.Format;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.ImmutableList;

@UnstableApi
/* loaded from: classes2.dex */
public interface SubtitleParser {

    public interface Factory {

        /* renamed from: a, reason: collision with root package name */
        public static final Factory f3355a = new AnonymousClass1();

        /* renamed from: androidx.media3.extractor.text.SubtitleParser$Factory$1, reason: invalid class name */
        public class AnonymousClass1 implements Factory {
            @Override // androidx.media3.extractor.text.SubtitleParser.Factory
            public final boolean a(Format format) {
                return false;
            }

            @Override // androidx.media3.extractor.text.SubtitleParser.Factory
            public final int b(Format format) {
                return 1;
            }

            @Override // androidx.media3.extractor.text.SubtitleParser.Factory
            public final SubtitleParser c(Format format) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }
        }

        boolean a(Format format);

        int b(Format format);

        SubtitleParser c(Format format);
    }

    public static class OutputOptions {
        public static final OutputOptions c = new OutputOptions(-9223372036854775807L, false);

        /* renamed from: a, reason: collision with root package name */
        public final long f3356a;
        public final boolean b;

        public OutputOptions(long j, boolean z) {
            this.f3356a = j;
            this.b = z;
        }
    }

    void a(byte[] bArr, int i, int i2, OutputOptions outputOptions, Consumer consumer);

    default Subtitle b(int i, int i2, byte[] bArr) {
        ImmutableList.Builder builderM = ImmutableList.m();
        a(bArr, 0, i2, OutputOptions.c, new a(builderM, 1));
        return new CuesWithTimingSubtitle(builderM.j());
    }

    default void reset() {
    }
}
