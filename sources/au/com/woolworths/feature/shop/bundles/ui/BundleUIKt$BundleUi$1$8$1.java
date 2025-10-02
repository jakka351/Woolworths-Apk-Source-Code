package au.com.woolworths.feature.shop.bundles.ui;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import au.com.woolworths.feature.shop.bundles.data.Bundle;
import au.com.woolworths.foundation.feature.analytics.list.ListItemsSeenEffectKt;
import au.com.woolworths.foundation.feature.analytics.list.ListItemsTrackerState;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.bundles.ui.BundleUIKt$BundleUi$1$8$1", f = "BundleUI.kt", l = {}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class BundleUIKt$BundleUi$1$8$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ LazyListState p;
    public final /* synthetic */ int q;
    public final /* synthetic */ ListItemsTrackerState r;
    public final /* synthetic */ String s;
    public final /* synthetic */ Bundle t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundleUIKt$BundleUi$1$8$1(LazyListState lazyListState, int i, ListItemsTrackerState listItemsTrackerState, String str, Bundle bundle, Continuation continuation) {
        super(2, continuation);
        this.p = lazyListState;
        this.q = i;
        this.r = listItemsTrackerState;
        this.s = str;
        this.t = bundle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BundleUIKt$BundleUi$1$8$1(this.p, this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        BundleUIKt$BundleUi$1$8$1 bundleUIKt$BundleUi$1$8$1 = (BundleUIKt$BundleUi$1$8$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        bundleUIKt$BundleUi$1$8$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object next;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        LazyListState lazyListState = this.p;
        Iterator it = lazyListState.j().f().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((LazyListItemInfo) next).getF996a() == this.q) {
                break;
            }
        }
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) next;
        if (lazyListItemInfo != null && ListItemsSeenEffectKt.d(lazyListState.j(), lazyListItemInfo)) {
            this.r.a(this.t, this.s);
        }
        return Unit.f24250a;
    }
}
