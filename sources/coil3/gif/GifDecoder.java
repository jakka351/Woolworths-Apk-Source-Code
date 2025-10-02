package coil3.gif;

import au.com.woolworths.rewards.base.d;
import coil3.decode.Decoder;
import coil3.fetch.SourceFetchResult;
import coil3.request.Options;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterruptibleKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil3/gif/GifDecoder;", "Lcoil3/decode/Decoder;", "Factory", "coil-gif_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class GifDecoder implements Decoder {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/gif/GifDecoder$Factory;", "Lcoil3/decode/Decoder$Factory;", "coil-gif_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Factory implements Decoder.Factory {
        @Override // coil3.decode.Decoder.Factory
        public final Decoder a(SourceFetchResult sourceFetchResult, Options options) {
            if (DecodeUtilsKt.a(sourceFetchResult.f13100a.U0())) {
                throw null;
            }
            return null;
        }
    }

    @Override // coil3.decode.Decoder
    public final Object a(Continuation continuation) {
        return InterruptibleKt.a(new d(this, 19), (ContinuationImpl) continuation);
    }
}
