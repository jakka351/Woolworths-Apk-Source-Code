package au.com.woolworths.feature.product.list.compose.errorscreen;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import au.com.woolworths.feature.product.list.data.ZeroResultPageData;
import au.com.woolworths.markdown.compat.MarkdownCompatKt;
import au.com.woolworths.markdown.compat.MarkdownTextViewStyle;
import au.com.woolworths.product.tile.ProductClickListener;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Function i;
    public final /* synthetic */ Function j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Modifier m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;

    public /* synthetic */ e(Object obj, boolean z, ProductClickListener productClickListener, Function1 function1, Function1 function12, Function0 function0, Function1 function13, boolean z2, Function1 function14, Modifier modifier, int i, int i2, int i3) {
        this.d = i3;
        this.p = obj;
        this.e = z;
        this.f = productClickListener;
        this.g = function1;
        this.h = function12;
        this.i = function0;
        this.j = function13;
        this.k = z2;
        this.l = function14;
        this.m = modifier;
        this.n = i;
        this.o = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                ZeroResultContentViewKt.b((ZeroResultPageData) this.p, this.e, (ProductClickListener) this.f, this.g, (Function1) this.h, (Function0) this.i, (Function1) this.j, this.k, (Function1) this.l, this.m, (Composer) obj, RecomposeScopeImplKt.a(this.n | 1), this.o);
                break;
            case 1:
                ((Integer) obj2).getClass();
                au.com.woolworths.feature.product.list.legacy.compose.errorscreen.ZeroResultContentViewKt.b((au.com.woolworths.feature.product.list.legacy.data.ZeroResultPageData) this.p, this.e, (ProductClickListener) this.f, this.g, (Function1) this.h, (Function0) this.i, (Function1) this.j, this.k, (Function1) this.l, this.m, (Composer) obj, RecomposeScopeImplKt.a(this.n | 1), this.o);
                break;
            default:
                ((Integer) obj2).getClass();
                MarkdownCompatKt.a((String) this.p, this.m, (MarkdownTextViewStyle) this.f, this.g, this.e, (Color) this.h, (Function2) this.j, this.k, (Iterable) this.l, (Function2) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.n | 1), this.o);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ e(String str, Modifier modifier, MarkdownTextViewStyle markdownTextViewStyle, Function1 function1, boolean z, Color color, Function2 function2, boolean z2, Iterable iterable, Function2 function22, int i, int i2) {
        this.d = 2;
        this.p = str;
        this.m = modifier;
        this.f = markdownTextViewStyle;
        this.g = function1;
        this.e = z;
        this.h = color;
        this.j = function2;
        this.k = z2;
        this.l = iterable;
        this.i = function22;
        this.n = i;
        this.o = i2;
    }
}
