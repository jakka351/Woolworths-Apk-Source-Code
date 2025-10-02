package au.com.woolworths.foundation.ui.image.gallery;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.ColorPainter;
import au.com.woolworths.design.wx.component.button.PrimaryButtonKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Function1 i;
    public final /* synthetic */ Modifier j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;

    public /* synthetic */ a(String str, Function0 function0, Modifier modifier, boolean z, boolean z2, PaddingValues paddingValues, String str2, Function1 function1, Function3 function3, int i, int i2) {
        this.d = 2;
        this.e = str;
        this.f = function0;
        this.j = modifier;
        this.l = z;
        this.m = z2;
        this.g = paddingValues;
        this.k = str2;
        this.i = function1;
        this.h = function3;
        this.n = i;
        this.o = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                GalleryImagesCarouselKt.a((List) this.e, (ColorPainter) this.f, (Function2) this.g, (PagerState) this.h, this.i, this.j, (Function2) this.k, this.l, this.m, (Composer) obj, RecomposeScopeImplKt.a(this.n | 1), this.o);
                break;
            case 1:
                ((Integer) obj2).getClass();
                GalleryImagesCarouselKt.a((List) this.e, (ColorPainter) this.f, (Function2) this.g, (PagerState) this.h, this.i, this.j, (Function2) this.k, this.l, this.m, (Composer) obj, RecomposeScopeImplKt.a(this.n | 1), this.o);
                break;
            default:
                ((Integer) obj2).getClass();
                PrimaryButtonKt.a((String) this.e, (Function0) this.f, this.j, this.l, this.m, (PaddingValues) this.g, (String) this.k, this.i, (Function3) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.n | 1), this.o);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(List list, ColorPainter colorPainter, Function2 function2, PagerState pagerState, Function1 function1, Modifier modifier, Function2 function22, boolean z, boolean z2, int i, int i2, int i3) {
        this.d = i3;
        this.e = list;
        this.f = colorPainter;
        this.g = function2;
        this.h = pagerState;
        this.i = function1;
        this.j = modifier;
        this.k = function22;
        this.l = z;
        this.m = z2;
        this.n = i;
        this.o = i2;
    }
}
