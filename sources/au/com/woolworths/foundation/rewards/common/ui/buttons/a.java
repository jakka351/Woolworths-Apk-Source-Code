package au.com.woolworths.foundation.rewards.common.ui.buttons;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.shared.ui.compose.FullScreenOverlayKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ a(long j, Modifier modifier, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.e = j;
        this.g = modifier;
        this.h = composableLambdaImpl;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).intValue();
                ActionTextButtonKt.c((String) this.g, this.e, (TextStyle) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                FullScreenOverlayKt.a(this.e, (Modifier) this.g, (ComposableLambdaImpl) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(String str, long j, TextStyle textStyle, int i) {
        this.g = str;
        this.e = j;
        this.h = textStyle;
        this.f = i;
    }
}
