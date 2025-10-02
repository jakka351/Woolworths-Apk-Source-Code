package au.com.woolworths.foundation.shop.olive.voice;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.shop.olive.voice.OliveVoiceRepositoryImpl", f = "OliveVoiceRepository.kt", l = {69}, m = "voiceSearch")
/* loaded from: classes4.dex */
final class OliveVoiceRepositoryImpl$voiceSearch$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ OliveVoiceRepositoryImpl q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OliveVoiceRepositoryImpl$voiceSearch$1(OliveVoiceRepositoryImpl oliveVoiceRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = oliveVoiceRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, this);
    }
}
