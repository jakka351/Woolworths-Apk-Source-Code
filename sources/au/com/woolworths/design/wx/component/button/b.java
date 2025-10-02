package au.com.woolworths.design.wx.component.button;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.foundation.rewards.common.ui.buttons.ActionTextButtonKt;
import au.com.woolworths.product.composeui.ProductPriceKt;
import au.com.woolworths.product.models.TagLabel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ String e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ long h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ b(Painter painter, String str, Function0 function0, Modifier modifier, boolean z, long j, int i, int i2) {
        this.k = painter;
        this.e = str;
        this.l = function0;
        this.f = modifier;
        this.g = z;
        this.h = j;
        this.i = i;
        this.j = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                ButtonTextKt.b(this.e, this.f, this.h, this.g, (String) this.k, (Function1) this.l, (Composer) obj, RecomposeScopeImplKt.a(this.i | 1), this.j);
                break;
            case 1:
                ((Integer) obj2).getClass();
                IconButtonKt.b((Painter) this.k, this.e, (Function0) this.l, this.f, this.g, this.h, (Composer) obj, RecomposeScopeImplKt.a(this.i | 1), this.j);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ActionTextButtonKt.a(this.e, (Function0) this.k, this.f, this.h, (TextStyle) this.l, this.g, (Composer) obj, RecomposeScopeImplKt.a(this.i | 1), this.j);
                break;
            case 3:
                ((Integer) obj2).getClass();
                ProductPriceKt.a((Integer) this.k, (TagLabel) this.l, this.f, this.e, this.h, this.g, (Composer) obj, RecomposeScopeImplKt.a(this.i | 1), this.j);
                break;
            default:
                ((Integer) obj2).getClass();
                com.woolworths.shop.product.ui.ProductPriceKt.a((Integer) this.k, this.f, this.e, this.h, this.g, (Arrangement.Horizontal) this.l, (Composer) obj, RecomposeScopeImplKt.a(this.i | 1), this.j);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ b(Integer num, Modifier modifier, String str, long j, boolean z, Arrangement.Horizontal horizontal, int i, int i2) {
        this.k = num;
        this.f = modifier;
        this.e = str;
        this.h = j;
        this.g = z;
        this.l = horizontal;
        this.i = i;
        this.j = i2;
    }

    public /* synthetic */ b(Integer num, TagLabel tagLabel, Modifier modifier, String str, long j, boolean z, int i, int i2) {
        this.k = num;
        this.l = tagLabel;
        this.f = modifier;
        this.e = str;
        this.h = j;
        this.g = z;
        this.i = i;
        this.j = i2;
    }

    public /* synthetic */ b(String str, Modifier modifier, long j, boolean z, String str2, Function1 function1, int i, int i2) {
        this.e = str;
        this.f = modifier;
        this.h = j;
        this.g = z;
        this.k = str2;
        this.l = function1;
        this.i = i;
        this.j = i2;
    }

    public /* synthetic */ b(String str, Function0 function0, Modifier modifier, long j, TextStyle textStyle, boolean z, int i, int i2) {
        this.e = str;
        this.k = function0;
        this.f = modifier;
        this.h = j;
        this.l = textStyle;
        this.g = z;
        this.i = i;
        this.j = i2;
    }
}
