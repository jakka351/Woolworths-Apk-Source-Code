package au.com.woolworths.feature.shop.modeselector.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import au.com.woolworths.feature.shop.modeselector.ModeSelectorContract;
import au.com.woolworths.shop.checkout.ui.compose.IdVerificationBottomSheetKt;
import au.com.woolworths.shop.ratingsandreviews.ui.reviewitem.ReviewCardKt;
import coil3.compose.SubcomposeAsyncImageKt;
import coil3.compose.internal.AsyncImageState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function2 {
    public final /* synthetic */ int d = 2;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ e(int i, String str, String str2, String str3, String str4, String str5, String str6, Modifier modifier, String str7, int i2) {
        this.g = i;
        this.i = str;
        this.e = str2;
        this.f = str3;
        this.j = str4;
        this.k = str5;
        this.l = str6;
        this.n = modifier;
        this.m = str7;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                ModeSelectorScreenKt.a((ModeSelectorContract.ViewState) this.i, (Function0) this.e, (Function0) this.f, (Function1) this.j, (Function2) this.m, (Function1) this.k, (Function1) this.l, (Modifier) this.n, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
            case 1:
                ((Integer) obj2).getClass();
                IdVerificationBottomSheetKt.c((String) this.i, (String) this.j, (String) this.k, (String) this.l, (String) this.m, (String) this.n, (Function0) this.e, (Function0) this.f, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ReviewCardKt.b(this.g, (String) this.i, (String) this.e, (String) this.f, (String) this.j, (String) this.k, (String) this.l, (Modifier) this.n, (String) this.m, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                SubcomposeAsyncImageKt.a((AsyncImageState) this.i, (String) this.e, (Modifier) this.n, (Function1) this.j, (Function1) this.k, (Alignment) this.f, (ContentScale) this.l, (ComposableLambdaImpl) this.m, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), RecomposeScopeImplKt.a(this.h));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ e(ModeSelectorContract.ViewState viewState, Function0 function0, Function0 function02, Function1 function1, Function2 function2, Function1 function12, Function1 function13, Modifier modifier, int i, int i2) {
        this.i = viewState;
        this.e = function0;
        this.f = function02;
        this.j = function1;
        this.m = function2;
        this.k = function12;
        this.l = function13;
        this.n = modifier;
        this.g = i;
        this.h = i2;
    }

    public /* synthetic */ e(AsyncImageState asyncImageState, String str, Modifier modifier, Function1 function1, Function1 function12, Alignment alignment, ContentScale contentScale, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.i = asyncImageState;
        this.e = str;
        this.n = modifier;
        this.j = function1;
        this.k = function12;
        this.f = alignment;
        this.l = contentScale;
        this.m = composableLambdaImpl;
        this.g = i;
        this.h = i2;
    }

    public /* synthetic */ e(String str, String str2, String str3, String str4, String str5, String str6, Function0 function0, Function0 function02, int i, int i2) {
        this.i = str;
        this.j = str2;
        this.k = str3;
        this.l = str4;
        this.m = str5;
        this.n = str6;
        this.e = function0;
        this.f = function02;
        this.g = i;
        this.h = i2;
    }
}
