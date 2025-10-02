package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.text.font.AndroidFontLoader", f = "AndroidFontLoader.android.kt", l = {55, 57}, m = "awaitLoad")
/* loaded from: classes2.dex */
final class AndroidFontLoader$awaitLoad$1 extends ContinuationImpl {
    public AndroidFontLoader p;
    public ResourceFont q;
    public /* synthetic */ Object r;
    public final /* synthetic */ AndroidFontLoader s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFontLoader$awaitLoad$1(AndroidFontLoader androidFontLoader, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = androidFontLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.a(null, this);
    }
}
