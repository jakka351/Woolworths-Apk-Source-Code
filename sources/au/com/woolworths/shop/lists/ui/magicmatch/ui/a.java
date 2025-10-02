package au.com.woolworths.shop.lists.ui.magicmatch.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ MagicMatchContract.ViewState e;
    public final /* synthetic */ byte[] f;
    public final /* synthetic */ MagicMatchContract.Listener g;

    public /* synthetic */ a(MagicMatchContract.ViewState viewState, byte[] bArr, MagicMatchContract.Listener listener, int i, int i2) {
        this.d = i2;
        this.e = viewState;
        this.f = bArr;
        this.g = listener;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                MagicMatchScreenKt.a(this.e, this.f, this.g, composer, RecomposeScopeImplKt.a(1));
                break;
            default:
                MagicMatchScreenKt.b(this.e, this.f, this.g, composer, RecomposeScopeImplKt.a(1));
                break;
        }
        return Unit.f24250a;
    }
}
