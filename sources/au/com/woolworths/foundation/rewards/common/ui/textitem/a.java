package au.com.woolworths.foundation.rewards.common.ui.textitem;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;
    public final /* synthetic */ TextStyle i;
    public final /* synthetic */ TextAlign j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;

    public /* synthetic */ a(String str, Modifier modifier, long j, long j2, TextStyle textStyle, TextAlign textAlign, boolean z, int i, int i2, int i3) {
        this.d = i3;
        this.e = str;
        this.f = modifier;
        this.g = j;
        this.h = j2;
        this.i = textStyle;
        this.j = textAlign;
        this.k = z;
        this.l = i;
        this.m = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                MarkdownTextUiKt.a(this.e, this.f, this.g, this.h, this.i, this.j, this.k, (Composer) obj, RecomposeScopeImplKt.a(this.l | 1), this.m);
                break;
            default:
                ((Integer) obj2).getClass();
                NoteTextUiKt.a(this.e, this.f, this.g, this.h, this.i, this.j, this.k, (Composer) obj, RecomposeScopeImplKt.a(this.l | 1), this.m);
                break;
        }
        return Unit.f24250a;
    }
}
