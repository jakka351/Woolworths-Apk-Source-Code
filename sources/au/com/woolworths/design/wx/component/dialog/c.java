package au.com.woolworths.design.wx.component.dialog;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.feature.shop.voc.score.VocSurveyCardKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Function0 f;

    public /* synthetic */ c(int i, int i2, String str, Function0 function0) {
        this.d = i2;
        this.e = str;
        this.f = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AlertDialogKt.b(this.e, this.f, composer, RecomposeScopeImplKt.a(1));
                break;
            case 1:
                AlertDialogKt.c(this.e, this.f, composer, RecomposeScopeImplKt.a(1));
                break;
            default:
                VocSurveyCardKt.h(this.e, this.f, composer, RecomposeScopeImplKt.a(1));
                break;
        }
        return Unit.f24250a;
    }
}
