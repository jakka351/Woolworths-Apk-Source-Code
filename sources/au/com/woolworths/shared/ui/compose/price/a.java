package au.com.woolworths.shared.ui.compose.price;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.shop.productcard.ui.components.HeadlinePriceKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;
    public final /* synthetic */ long j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;

    public /* synthetic */ a(Modifier modifier, String str, String str2, String str3, String str4, long j, int i, int i2, int i3) {
        this.d = i3;
        this.e = modifier;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = j;
        this.k = i;
        this.l = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                PriceLabelKt.a(this.e, this.f, this.g, this.h, this.i, this.j, (Composer) obj, RecomposeScopeImplKt.a(this.k | 1), this.l);
                break;
            default:
                ((Integer) obj2).getClass();
                HeadlinePriceKt.a(this.e, this.f, this.g, this.h, this.i, this.j, (Composer) obj, RecomposeScopeImplKt.a(this.k | 1), this.l);
                break;
        }
        return Unit.f24250a;
    }
}
