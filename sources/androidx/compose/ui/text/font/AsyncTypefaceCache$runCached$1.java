package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.AsyncTypefaceCache;
import com.google.android.gms.wallet.WalletConstants;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.text.font.AsyncTypefaceCache", f = "FontListFontFamilyTypefaceAdapter.kt", l = {WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION}, m = "runCached")
/* loaded from: classes2.dex */
final class AsyncTypefaceCache$runCached$1 extends ContinuationImpl {
    public AsyncTypefaceCache p;
    public AsyncTypefaceCache.Key q;
    public boolean r;
    public /* synthetic */ Object s;
    public final /* synthetic */ AsyncTypefaceCache t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncTypefaceCache$runCached$1(AsyncTypefaceCache asyncTypefaceCache, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.t = asyncTypefaceCache;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.b(null, null, false, null, this);
    }
}
