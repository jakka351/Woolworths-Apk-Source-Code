package au.com.woolworths.shop.rewards.priming.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.shop.rewards.priming.data.CvpItem;
import au.com.woolworths.shop.rewards.priming.data.PrimingScreenData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ PrimingScreenData e;

    public /* synthetic */ a(PrimingScreenData primingScreenData, int i) {
        this.d = i;
        this.e = primingScreenData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.h(LazyColumn, "$this$LazyColumn");
                final PrimingScreenData primingScreenData = this.e;
                LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.rewards.priming.ui.PrimingContentUiKt$PrimingContentUi$1$1$1$1$1
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        LazyItemScope item = (LazyItemScope) obj2;
                        Composer composer = (Composer) obj3;
                        int iIntValue = ((Number) obj4).intValue();
                        Intrinsics.h(item, "$this$item");
                        if ((iIntValue & 17) == 16 && composer.c()) {
                            composer.j();
                        } else {
                            PrimingTitleUiKt.a(primingScreenData.f12907a, PaddingKt.g(SizeKt.e(Modifier.Companion.d, 1.0f), 32, 16), composer, 0, 0);
                        }
                        return Unit.f24250a;
                    }
                }, true, 900917708), 3);
                LazyListScope.g(LazyColumn, primingScreenData.b.size(), new a(primingScreenData, 1), new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.rewards.priming.ui.PrimingContentUiKt$PrimingContentUi$1$1$1$1$3
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        LazyItemScope items = (LazyItemScope) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Composer composer = (Composer) obj4;
                        int iIntValue2 = ((Number) obj5).intValue();
                        Intrinsics.h(items, "$this$items");
                        if ((iIntValue2 & 48) == 0) {
                            iIntValue2 |= composer.r(iIntValue) ? 32 : 16;
                        }
                        if ((iIntValue2 & 145) == 144 && composer.c()) {
                            composer.j();
                        } else {
                            PrimingCvpTileUiKt.a((CvpItem) primingScreenData.b.get(iIntValue), PaddingKt.g(Modifier.Companion.d, 32, 16), composer, 0);
                        }
                        return Unit.f24250a;
                    }
                }, true, -193287339), 4);
                return Unit.f24250a;
            default:
                return Integer.valueOf(String.valueOf(((CvpItem) this.e.b.get(((Integer) obj).intValue())).f12906a).hashCode());
        }
    }
}
