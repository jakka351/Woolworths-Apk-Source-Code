package au.com.woolworths.feature.shop.contentpage;

import au.com.woolworths.feature.shop.contentpage.data.ContentPageData;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.contentpage.ContentPageViewModel", f = "ContentPageViewModel.kt", l = {650}, m = "processGoogleAdsMetadata")
/* loaded from: classes3.dex */
final class ContentPageViewModel$processGoogleAdsMetadata$1 extends ContinuationImpl {
    public ContentPageData p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ContentPageViewModel r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentPageViewModel$processGoogleAdsMetadata$1(ContentPageViewModel contentPageViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = contentPageViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.H6(null, this);
    }
}
