package au.com.woolworths.feature.shop.homepage.presentation.modeselector;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ CoroutineScope e;
    public final /* synthetic */ Function0 f;

    public /* synthetic */ b(CoroutineScope coroutineScope, Function0 function0, int i) {
        this.d = i;
        this.e = coroutineScope;
        this.f = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Function0 function0 = this.f;
        CoroutineScope coroutineScope = this.e;
        switch (i) {
            case 0:
                float f = ModeSelectorSubHeaderKt.f7251a;
                BuildersKt.c(coroutineScope, null, null, new ModeSelectorSubHeaderKt$InstoreModeSelectorSubHeader$1$1$1$5$1$1$1(function0, null), 3);
                break;
            default:
                float f2 = ModeSelectorSubHeaderKt.f7251a;
                BuildersKt.c(coroutineScope, null, null, new ModeSelectorSubHeaderKt$CollectionLocationTile$1$3$1$1$1(function0, null), 3);
                break;
        }
        return unit;
    }
}
