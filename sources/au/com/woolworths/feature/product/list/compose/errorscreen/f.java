package au.com.woolworths.feature.product.list.compose.errorscreen;

import android.content.Context;
import au.com.woolworths.feature.product.list.v2.ProductListUiEvent;
import com.woolworths.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Context f;

    public /* synthetic */ f(Function1 function1, Context context, int i) {
        this.d = i;
        this.e = function1;
        this.f = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                String string = this.f.getString(R.string.browse_all_categories);
                Intrinsics.g(string, "getString(...)");
                this.e.invoke(string);
                break;
            case 1:
                String string2 = this.f.getString(R.string.browse_all_categories);
                Intrinsics.g(string2, "getString(...)");
                this.e.invoke(string2);
                break;
            default:
                String string3 = this.f.getString(R.string.browse_all_categories);
                Intrinsics.g(string3, "getString(...)");
                this.e.invoke(new ProductListUiEvent.OnBrowseAllAislesClicked(string3));
                break;
        }
        return Unit.f24250a;
    }
}
