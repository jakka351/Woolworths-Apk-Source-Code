package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.ImmutableList;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

@UnstableApi
/* loaded from: classes2.dex */
public interface Extractor {

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ReadResult {
    }

    void a(long j, long j2);

    default Extractor c() {
        return this;
    }

    default List e() {
        return ImmutableList.t();
    }

    int f(ExtractorInput extractorInput, PositionHolder positionHolder);

    boolean i(ExtractorInput extractorInput);

    void j(ExtractorOutput extractorOutput);

    void release();
}
