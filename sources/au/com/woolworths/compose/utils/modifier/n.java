package au.com.woolworths.compose.utils.modifier;

import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.base.shopapp.modules.text.TextWithAltApiData;
import au.com.woolworths.feature.shop.homepage.presentation.modeselector.ModeSelectorSubHeaderKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ float e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Function k;

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, float f, Object obj4, Function function, int i, int i2) {
        this.d = i2;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.e = f;
        this.j = obj4;
        this.k = function;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                WaveBackgroundModifierKt.b((MutableState) this.g, (Animatable) this.h, (Animatable) this.i, this.e, (Modifier) this.j, (ComposableLambdaImpl) this.k, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ModeSelectorSubHeaderKt.a((TextWithAltApiData) this.g, (Text) this.h, (TextWithAltApiData) this.i, this.e, (String) this.j, (Function0) this.k, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
        }
        return Unit.f24250a;
    }
}
