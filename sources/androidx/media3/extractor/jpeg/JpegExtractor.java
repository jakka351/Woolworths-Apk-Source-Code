package androidx.media3.extractor.jpeg;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SingleSampleExtractor;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@UnstableApi
/* loaded from: classes2.dex */
public final class JpegExtractor implements Extractor {

    /* renamed from: a, reason: collision with root package name */
    public final Extractor f3276a;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public JpegExtractor(int i) {
        if ((i & 1) != 0) {
            this.f3276a = new SingleSampleExtractor(65496, 2, "image/jpeg");
        } else {
            this.f3276a = new JpegMotionPhotoExtractor();
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void a(long j, long j2) {
        this.f3276a.a(j, j2);
    }

    @Override // androidx.media3.extractor.Extractor
    public final int f(ExtractorInput extractorInput, PositionHolder positionHolder) {
        return this.f3276a.f(extractorInput, positionHolder);
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean i(ExtractorInput extractorInput) {
        return this.f3276a.i(extractorInput);
    }

    @Override // androidx.media3.extractor.Extractor
    public final void j(ExtractorOutput extractorOutput) {
        this.f3276a.j(extractorOutput);
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
        this.f3276a.release();
    }
}
