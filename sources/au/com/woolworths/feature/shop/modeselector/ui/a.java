package au.com.woolworths.feature.shop.modeselector.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.shop.lists.ui.shoppinglist.sort.ui.SortByViewScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Modifier g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    public /* synthetic */ a(int i, int i2, Function0 function0, Modifier modifier, int i3, int i4) {
        this.e = i;
        this.f = i2;
        this.j = function0;
        this.g = modifier;
        this.h = i3;
        this.i = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                BadgeKt.a((String) this.j, this.e, this.f, this.g, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
            default:
                ((Integer) obj2).getClass();
                SortByViewScreenKt.d(this.e, this.f, (Function0) this.j, this.g, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(String str, int i, int i2, Modifier modifier, int i3, int i4) {
        this.j = str;
        this.e = i;
        this.f = i2;
        this.g = modifier;
        this.h = i3;
        this.i = i4;
    }
}
