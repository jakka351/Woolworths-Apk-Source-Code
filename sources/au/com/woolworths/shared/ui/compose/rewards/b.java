package au.com.woolworths.shared.ui.compose.rewards;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.data.ContentCta;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ContentCta e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Modifier g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;

    public /* synthetic */ b(ContentCta contentCta, Function0 function0, Modifier modifier, boolean z, int i, int i2, int i3) {
        this.d = i3;
        this.e = contentCta;
        this.f = function0;
        this.g = modifier;
        this.h = z;
        this.i = i;
        this.j = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                ContentCtaButtonKt.b(this.e, this.f, this.g, this.h, (Composer) obj, RecomposeScopeImplKt.a(this.i | 1), this.j);
                break;
            default:
                ((Integer) obj2).getClass();
                ContentCtaButtonKt.d(this.e, this.f, this.g, this.h, (Composer) obj, RecomposeScopeImplKt.a(this.i | 1), this.j);
                break;
        }
        return Unit.f24250a;
    }
}
