package au.com.woolworths.design.wx.component.button;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.shared.ui.compose.StatefulButtonKt;
import java.util.Map;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ String e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ long g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ CharSequence j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Function l;

    public /* synthetic */ a(AnnotatedString annotatedString, Modifier modifier, long j, String str, Map map, Function1 function1, int i, int i2) {
        this.j = annotatedString;
        this.f = modifier;
        this.g = j;
        this.e = str;
        this.k = map;
        this.l = function1;
        this.h = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                ButtonTextKt.a((AnnotatedString) this.j, this.f, this.g, this.e, (Map) this.k, (Function1) this.l, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
            default:
                ((Integer) obj2).getClass();
                StatefulButtonKt.b(this.e, (String) this.j, this.f, (StatefulButtonState) this.k, this.g, (Function0) this.l, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(String str, String str2, Modifier modifier, StatefulButtonState statefulButtonState, long j, Function0 function0, int i, int i2) {
        this.e = str;
        this.j = str2;
        this.f = modifier;
        this.k = statefulButtonState;
        this.g = j;
        this.l = function0;
        this.h = i;
        this.i = i2;
    }
}
