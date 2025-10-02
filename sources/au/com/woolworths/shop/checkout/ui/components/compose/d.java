package au.com.woolworths.shop.checkout.ui.components.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ List f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ int h;

    public /* synthetic */ d(String str, List list, Function1 function1, int i, int i2) {
        this.d = i2;
        this.e = str;
        this.f = list;
        this.g = function1;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                CollectionMethodKt.a(RecomposeScopeImplKt.a(this.h | 1), composer, this.e, this.f, this.g);
                break;
            default:
                PackagingMethodSelectionKt.a(RecomposeScopeImplKt.a(this.h | 1), composer, this.e, this.f, this.g);
                break;
        }
        return Unit.f24250a;
    }
}
