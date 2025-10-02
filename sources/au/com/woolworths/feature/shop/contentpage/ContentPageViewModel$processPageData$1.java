package au.com.woolworths.feature.shop.contentpage;

import au.com.woolworths.android.onesite.navigation.Activities;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.contentpage.ContentPageViewModel", f = "ContentPageViewModel.kt", l = {630}, m = "processPageData")
/* loaded from: classes3.dex */
final class ContentPageViewModel$processPageData$1 extends ContinuationImpl {
    public Activities.ContentPage.ContentPageExtras p;
    public ContentPageViewModel q;
    public /* synthetic */ Object r;
    public final /* synthetic */ ContentPageViewModel s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentPageViewModel$processPageData$1(ContentPageViewModel contentPageViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = contentPageViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return ContentPageViewModel.p6(this.s, null, null, this);
    }
}
