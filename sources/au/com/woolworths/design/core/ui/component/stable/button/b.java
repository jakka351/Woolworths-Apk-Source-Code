package au.com.woolworths.design.core.ui.component.stable.button;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec;
import au.com.woolworths.design.core.ui.component.stable.textbutton.TextButtonKt;
import au.com.woolworths.design.core.ui.component.stable.textbutton.TextButtonSpec;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Modifier g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ ImageVector j;
    public final /* synthetic */ ImageVector k;
    public final /* synthetic */ Enum l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;

    public /* synthetic */ b(String str, Function0 function0, Modifier modifier, boolean z, String str2, ImageVector imageVector, ImageVector imageVector2, ButtonSpec.Size size, int i, int i2, int i3) {
        this.d = i3;
        this.e = str;
        this.f = function0;
        this.g = modifier;
        this.h = z;
        this.i = str2;
        this.j = imageVector;
        this.k = imageVector2;
        this.l = size;
        this.m = i;
        this.n = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                PrimaryButtonKt.a(this.e, this.f, this.g, this.h, (String) this.i, this.j, this.k, (ButtonSpec.Size) this.l, (Composer) obj, RecomposeScopeImplKt.a(this.m | 1), this.n);
                break;
            case 1:
                ((Integer) obj2).getClass();
                SecondaryButtonKt.a(this.e, this.f, this.g, this.h, (String) this.i, this.j, this.k, (ButtonSpec.Size) this.l, (Composer) obj, RecomposeScopeImplKt.a(this.m | 1), this.n);
                break;
            default:
                ((Integer) obj2).getClass();
                TextButtonKt.a(this.f, this.e, this.g, this.h, this.j, this.k, (TextButtonSpec.Size) this.i, (TextButtonSpec.Variant) this.l, (Composer) obj, RecomposeScopeImplKt.a(this.m | 1), this.n);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ b(Function0 function0, String str, Modifier modifier, boolean z, ImageVector imageVector, ImageVector imageVector2, TextButtonSpec.Size size, TextButtonSpec.Variant variant, int i, int i2) {
        this.d = 2;
        this.f = function0;
        this.e = str;
        this.g = modifier;
        this.h = z;
        this.j = imageVector;
        this.k = imageVector2;
        this.i = size;
        this.l = variant;
        this.m = i;
        this.n = i2;
    }
}
