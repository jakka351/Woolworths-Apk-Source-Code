package au.com.woolworths.feature.shop.voc.score;

import android.view.View;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.voc.score.VocActionHandlerKt", f = "VocActionHandler.kt", l = {91}, m = "onVocFreeTextResult")
/* loaded from: classes3.dex */
final class VocActionHandlerKt$onVocFreeTextResult$1 extends ContinuationImpl {
    public View p;
    public /* synthetic */ Object q;
    public int r;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.r |= Integer.MIN_VALUE;
        return VocActionHandlerKt.a(null, this);
    }
}
