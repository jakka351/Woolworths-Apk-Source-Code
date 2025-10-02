package au.com.woolworths.feature.shop.catalogue.listing.promotion.details.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.paging.compose.LazyPagingItems;
import au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchState;
import au.com.woolworths.foundation.shop.olive.voice.ui.search.OliveVoiceSearchScreenKt;
import au.com.woolworths.product.tile.ProductClickListener;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Function1 h;
    public final /* synthetic */ Function i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ Object k;

    public /* synthetic */ a(LazyPagingItems lazyPagingItems, ProductClickListener productClickListener, boolean z, Function1 function1, Function1 function12, boolean z2, List list, int i, int i2) {
        this.d = i2;
        this.e = lazyPagingItems;
        this.f = productClickListener;
        this.g = z;
        this.h = function1;
        this.i = function12;
        this.j = z2;
        this.k = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(9);
                PromotionDetailsScreenKt.e((LazyPagingItems) this.e, (ProductClickListener) this.f, this.g, this.h, (Function1) this.i, this.j, (List) this.k, (Composer) obj, iA);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(9);
                PromotionDetailsScreenKt.e((LazyPagingItems) this.e, (ProductClickListener) this.f, this.g, this.h, (Function1) this.i, this.j, (List) this.k, (Composer) obj, iA2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA3 = RecomposeScopeImplKt.a(1);
                OliveVoiceSearchScreenKt.e((VoiceSearchState) this.e, (Function0) this.f, (Function0) this.i, (Function0) this.k, this.h, this.g, this.j, (Composer) obj, iA3);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(VoiceSearchState voiceSearchState, Function0 function0, Function0 function02, Function0 function03, Function1 function1, boolean z, boolean z2, int i) {
        this.d = 2;
        this.e = voiceSearchState;
        this.f = function0;
        this.i = function02;
        this.k = function03;
        this.h = function1;
        this.g = z;
        this.j = z2;
    }
}
