package au.com.woolworths.design.core.ui.component.experimental.coachmark;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.feature.shop.instore.navigation.productfinder.LocationServicesUnavailableUiKt;
import au.com.woolworths.shop.checkout.ui.components.compose.AddressEditorKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ Modifier i;
    public final /* synthetic */ int j;

    public /* synthetic */ d(String str, String str2, String str3, Function0 function0, Modifier modifier, int i, int i2) {
        this.d = i2;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = function0;
        this.i = modifier;
        this.j = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                CoachMarkKt.c(this.e, this.f, this.g, this.h, this.i, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                LocationServicesUnavailableUiKt.b(this.e, this.f, this.g, this.h, this.i, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                AddressEditorKt.a(this.e, this.f, this.g, this.h, this.i, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1));
                break;
        }
        return Unit.f24250a;
    }
}
