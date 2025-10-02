package au.com.woolworths.design.core.ui.component.stable.button;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.paging.compose.LazyPagingItems;
import au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec;
import au.com.woolworths.feature.shop.myorders.details.models.CurrentDeliveryOrderOverview;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.CurrentDeliveryOrderOverviewItemKt;
import au.com.woolworths.foundation.shop.olive.voice.ui.permission.OliveVoicePermissionScreenKt;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdData;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdPlayerState;
import au.com.woolworths.foundation.shop.video.advertising.ui.VideoAdUnitKt;
import au.com.woolworths.shop.checkout.ui.shopperNote.ShopperNoteScreenKt;
import au.com.woolworths.shop.checkout.ui.timeselector.compose.timeofdayselector.TimeOfDaySelectorKt;
import au.com.woolworths.shop.receipts.ui.ReceiptListScreenKt;
import com.google.accompanist.permissions.PermissionState;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;

    public /* synthetic */ a(CurrentDeliveryOrderOverview currentDeliveryOrderOverview, Function1 function1, Function1 function12, Function2 function2, Function1 function13, Function0 function0, Function0 function02, int i) {
        this.d = 2;
        this.e = currentDeliveryOrderOverview;
        this.l = function1;
        this.g = function12;
        this.h = function2;
        this.i = function13;
        this.f = function0;
        this.j = function02;
        this.k = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                DestructiveButtonKt.c((String) this.e, (String) this.l, (Function0) this.f, (Modifier) this.g, (Function2) this.h, (Function2) this.i, (ButtonSpec.Size) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.k | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                DestructiveButtonKt.b((String) this.e, (Function0) this.f, (Modifier) this.g, (Function2) this.h, (Function2) this.i, (ButtonSpec.Size) this.j, (Function2) this.l, (Composer) obj, RecomposeScopeImplKt.a(this.k | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                CurrentDeliveryOrderOverviewItemKt.c((CurrentDeliveryOrderOverview) this.e, (Function1) this.l, (Function1) this.g, (Function2) this.h, (Function1) this.i, (Function0) this.f, (Function0) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.k | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                OliveVoicePermissionScreenKt.c((PermissionState) this.e, (PaddingValues) this.l, (Function0) this.f, (Function0) this.g, (Function0) this.i, (Function1) this.j, (Function2) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.k | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                VideoAdUnitKt.b((VideoAdData) this.e, (VideoAdPlayerState) this.l, (Function1) this.f, (Function3) this.h, (Function1) this.i, (Modifier) this.g, (Function1) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.k | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ShopperNoteScreenKt.a((Flow) this.g, (String) this.e, (String) this.l, (String) this.h, (Integer) this.i, (Function0) this.f, (Function1) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.k | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                TimeOfDaySelectorKt.a((String) this.e, (List) this.l, (List) this.f, (Function1) this.h, (Function1) this.i, (Function1) this.j, (Modifier) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.k | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ReceiptListScreenKt.h((LazyPagingItems) this.e, (Function1) this.l, (Function0) this.f, (Function0) this.g, (Function0) this.h, (Function0) this.i, (LazyListState) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.k | 1));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(VideoAdData videoAdData, VideoAdPlayerState videoAdPlayerState, Function1 function1, Function3 function3, Function1 function12, Modifier modifier, Function1 function13, int i) {
        this.d = 4;
        this.e = videoAdData;
        this.l = videoAdPlayerState;
        this.f = function1;
        this.h = function3;
        this.i = function12;
        this.g = modifier;
        this.j = function13;
        this.k = i;
    }

    public /* synthetic */ a(PermissionState permissionState, PaddingValues paddingValues, Function0 function0, Function0 function02, Function0 function03, Function1 function1, Function2 function2, int i) {
        this.d = 3;
        this.e = permissionState;
        this.l = paddingValues;
        this.f = function0;
        this.g = function02;
        this.i = function03;
        this.j = function1;
        this.h = function2;
        this.k = i;
    }

    public /* synthetic */ a(Object obj, Object obj2, Function0 function0, Object obj3, Function function, Function function2, Object obj4, int i, int i2) {
        this.d = i2;
        this.e = obj;
        this.l = obj2;
        this.f = function0;
        this.g = obj3;
        this.h = function;
        this.i = function2;
        this.j = obj4;
        this.k = i;
    }

    public /* synthetic */ a(String str, List list, List list2, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, int i) {
        this.d = 6;
        this.e = str;
        this.l = list;
        this.f = list2;
        this.h = function1;
        this.i = function12;
        this.j = function13;
        this.g = modifier;
        this.k = i;
    }

    public /* synthetic */ a(String str, Function0 function0, Modifier modifier, Function2 function2, Function2 function22, ButtonSpec.Size size, Function2 function23, int i) {
        this.d = 1;
        this.e = str;
        this.f = function0;
        this.g = modifier;
        this.h = function2;
        this.i = function22;
        this.j = size;
        this.l = function23;
        this.k = i;
    }

    public /* synthetic */ a(Flow flow, String str, String str2, String str3, Integer num, Function0 function0, Function1 function1, int i) {
        this.d = 5;
        this.g = flow;
        this.e = str;
        this.l = str2;
        this.h = str3;
        this.i = num;
        this.f = function0;
        this.j = function1;
        this.k = i;
    }
}
