package androidx.compose.ui.text.font;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {281, 295}, m = "load")
/* loaded from: classes2.dex */
final class AsyncFontListLoader$load$1 extends ContinuationImpl {
    public AsyncFontListLoader p;
    public List q;
    public Font r;
    public int s;
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ AsyncFontListLoader v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$load$1(AsyncFontListLoader asyncFontListLoader, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.v = asyncFontListLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.b(this);
    }
}
