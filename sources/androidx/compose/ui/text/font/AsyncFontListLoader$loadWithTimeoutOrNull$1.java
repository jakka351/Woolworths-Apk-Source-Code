package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {314}, m = "loadWithTimeoutOrNull$ui_text_release")
/* loaded from: classes2.dex */
final class AsyncFontListLoader$loadWithTimeoutOrNull$1 extends ContinuationImpl {
    public Font p;
    public /* synthetic */ Object q;
    public final /* synthetic */ AsyncFontListLoader r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$loadWithTimeoutOrNull$1(AsyncFontListLoader asyncFontListLoader, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = asyncFontListLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.o(null, this);
    }
}
