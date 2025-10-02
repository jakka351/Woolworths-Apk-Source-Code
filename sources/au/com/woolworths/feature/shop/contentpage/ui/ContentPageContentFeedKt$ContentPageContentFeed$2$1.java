package au.com.woolworths.feature.shop.contentpage.ui;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import au.com.woolworths.feature.shop.contentpage.data.ContentPageData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.contentpage.ui.ContentPageContentFeedKt$ContentPageContentFeed$2$1", f = "ContentPageContentFeed.kt", l = {}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class ContentPageContentFeedKt$ContentPageContentFeed$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ LazyListState p;
    public final /* synthetic */ Function1 q;
    public final /* synthetic */ ContentPageData r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentPageContentFeedKt$ContentPageContentFeed$2$1(LazyListState lazyListState, Function1 function1, ContentPageData contentPageData, Continuation continuation) {
        super(2, continuation);
        this.p = lazyListState;
        this.q = function1;
        this.r = contentPageData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ContentPageContentFeedKt$ContentPageContentFeed$2$1(this.p, this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ContentPageContentFeedKt$ContentPageContentFeed$2$1 contentPageContentFeedKt$ContentPageContentFeed$2$1 = (ContentPageContentFeedKt$ContentPageContentFeed$2$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        contentPageContentFeedKt$ContentPageContentFeed$2$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Function1 function1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        LazyListState lazyListState = this.p;
        if (!lazyListState.h.a() && (function1 = this.q) != null) {
            Set setL0 = CollectionsKt.L0(RangesKt.o(0, this.r.d.size()));
            List listF = lazyListState.j().f();
            ArrayList arrayList = new ArrayList();
            Iterator it = listF.iterator();
            while (it.hasNext()) {
                Object l = ((LazyListItemInfo) it.next()).getL();
                Integer num = l instanceof Integer ? (Integer) l : null;
                if (num != null) {
                    arrayList.add(num);
                }
            }
            function1.invoke(CollectionsKt.v0(setL0, CollectionsKt.L0(arrayList)));
        }
        return Unit.f24250a;
    }
}
