package au.com.woolworths.foundation.rewards.common.ui.buttons;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.shared.ui.compose.StatefulButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ String e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ long g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ b(ComposableLambdaImpl composableLambdaImpl, String str, Modifier modifier, StatefulButtonState statefulButtonState, long j, int i) {
        this.i = composableLambdaImpl;
        this.e = str;
        this.f = modifier;
        this.j = statefulButtonState;
        this.g = j;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                ActionTextButtonKt.b(this.e, this.g, (TextStyle) this.i, (Function0) this.j, this.f, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                StatefulButtonKt.d((ComposableLambdaImpl) this.i, this.e, this.f, (StatefulButtonState) this.j, this.g, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ b(String str, long j, TextStyle textStyle, Function0 function0, Modifier modifier, int i) {
        this.e = str;
        this.g = j;
        this.i = textStyle;
        this.j = function0;
        this.f = modifier;
        this.h = i;
    }
}
