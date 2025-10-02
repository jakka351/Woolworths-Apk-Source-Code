package au.com.woolworths.markdown.compat;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import au.com.woolworths.shop.aem.components.ui.herobanner.HeroBannerKt;
import au.com.woolworths.shop.aem.components.ui.tab.TabItemsKt;
import au.com.woolworths.shop.aem.components.ui.tab.TabRowStyle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Function2 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Function k;
    public final /* synthetic */ Object l;

    public /* synthetic */ d(String str, int i, Modifier modifier, Color color, Function2 function2, Iterable iterable, int i2, int i3) {
        this.i = str;
        this.f = i;
        this.e = modifier;
        this.j = color;
        this.k = function2;
        this.l = iterable;
        this.g = i2;
        this.h = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                MarkdownCompatKt.b((String) this.i, this.f, this.e, (Color) this.j, (Function2) this.k, (Iterable) this.l, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
            case 1:
                ((Integer) obj2).getClass();
                HeroBannerKt.b((List) this.i, (Function1) this.j, (Function1) this.k, this.e, this.f, (Function1) this.l, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
            default:
                ((Integer) obj2).getClass();
                TabItemsKt.b((ArrayList) this.i, (Function1) this.j, this.f, this.e, (TabRowStyle) this.l, (Function2) this.k, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ d(ArrayList arrayList, Function1 function1, int i, Modifier modifier, TabRowStyle tabRowStyle, Function2 function2, int i2, int i3) {
        this.i = arrayList;
        this.j = function1;
        this.f = i;
        this.e = modifier;
        this.l = tabRowStyle;
        this.k = function2;
        this.g = i2;
        this.h = i3;
    }

    public /* synthetic */ d(List list, Function1 function1, Function1 function12, Modifier modifier, int i, Function1 function13, int i2, int i3) {
        this.i = list;
        this.j = function1;
        this.k = function12;
        this.e = modifier;
        this.f = i;
        this.l = function13;
        this.g = i2;
        this.h = i3;
    }
}
