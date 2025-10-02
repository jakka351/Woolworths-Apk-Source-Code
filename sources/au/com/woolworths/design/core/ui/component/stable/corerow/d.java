package au.com.woolworths.design.core.ui.component.stable.corerow;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.core.ui.component.stable.corerow.CoreRowSpec;
import au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardContentKt;
import au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardContract;
import au.com.woolworths.foundation.shop.olive.voice.ui.permission.OliveVoicePermissionScreenKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Modifier g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ Function o;

    public /* synthetic */ d(AddCreditCardContract.ViewState viewState, boolean z, Function1 function1, Function1 function12, Function0 function0, Function2 function2, Function2 function22, Function0 function02, Modifier modifier, int i, int i2) {
        this.d = 2;
        this.e = viewState;
        this.f = z;
        this.h = function1;
        this.i = function12;
        this.o = function0;
        this.j = function2;
        this.k = function22;
        this.l = function02;
        this.g = modifier;
        this.m = i;
        this.n = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                RadioRowKt.a((String) this.e, this.f, (Function0) this.o, this.g, (String) this.h, (String) this.i, (CoreRowSpec.Image) this.j, (CoreRowSpec.TrailingDisplay) this.k, (CoreRowSpec.DividerType) this.l, (Composer) obj, RecomposeScopeImplKt.a(this.m | 1), this.n);
                break;
            case 1:
                ((Integer) obj2).getClass();
                SwitchRowKt.a((String) this.e, this.f, (Function1) this.o, this.g, (String) this.h, (String) this.i, (CoreRowSpec.Image) this.j, (CoreRowSpec.TrailingDisplay) this.k, (CoreRowSpec.DividerType) this.l, (Composer) obj, RecomposeScopeImplKt.a(this.m | 1), this.n);
                break;
            case 2:
                ((Integer) obj2).getClass();
                AddCreditCardContentKt.a((AddCreditCardContract.ViewState) this.e, this.f, (Function1) this.h, (Function1) this.i, (Function0) this.o, (Function2) this.j, (Function2) this.k, (Function0) this.l, this.g, (Composer) obj, RecomposeScopeImplKt.a(this.m | 1), this.n);
                break;
            default:
                ((Integer) obj2).getClass();
                OliveVoicePermissionScreenKt.b(this.f, (Function0) this.o, (Function0) this.e, (Function0) this.h, (Function2) this.i, (Function0) this.j, (Function0) this.k, (Function1) this.l, this.g, (Composer) obj, RecomposeScopeImplKt.a(this.m | 1), this.n);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ d(String str, boolean z, Function function, Modifier modifier, String str2, String str3, CoreRowSpec.Image image, CoreRowSpec.TrailingDisplay trailingDisplay, CoreRowSpec.DividerType dividerType, int i, int i2, int i3) {
        this.d = i3;
        this.e = str;
        this.f = z;
        this.o = function;
        this.g = modifier;
        this.h = str2;
        this.i = str3;
        this.j = image;
        this.k = trailingDisplay;
        this.l = dividerType;
        this.m = i;
        this.n = i2;
    }

    public /* synthetic */ d(boolean z, Function0 function0, Function0 function02, Function0 function03, Function2 function2, Function0 function04, Function0 function05, Function1 function1, Modifier modifier, int i, int i2) {
        this.d = 3;
        this.f = z;
        this.o = function0;
        this.e = function02;
        this.h = function03;
        this.i = function2;
        this.j = function04;
        this.k = function05;
        this.l = function1;
        this.g = modifier;
        this.m = i;
        this.n = i2;
    }
}
