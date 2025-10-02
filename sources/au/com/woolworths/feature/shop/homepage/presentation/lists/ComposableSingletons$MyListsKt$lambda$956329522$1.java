package au.com.woolworths.feature.shop.homepage.presentation.lists;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.design.wx.foundation.AccentColors;
import au.com.woolworths.feature.shop.editorder.review.components.c;
import au.com.woolworths.feature.shop.homepage.data.MyShoppingListItemData;
import au.com.woolworths.feature.shop.homepage.data.MyShoppingListsData;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$MyListsKt$lambda$956329522$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            MyShoppingListsData myShoppingListsData = new MyShoppingListsData("My lists", "See item availability and location by aisle", "See all", "", CollectionsKt.R(new MyShoppingListItemData(10, AccentColors.c, "id1", "Weekly Shop", ""), new MyShoppingListItemData(1, AccentColors.b, "id2", "Picnic", ""), new MyShoppingListItemData(7, AccentColors.d, "id3", "Toms Birthday", ""), new MyShoppingListItemData(2, AccentColors.e, "id4", "Lorem ipsum dolor sit amet, consectetur adipisicing elit.", "")), 32);
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new c(26);
                composer.A(objG);
            }
            Function1 function1 = (Function1) objG;
            Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new c(27);
                composer.A(objE);
            }
            Function1 function12 = (Function1) objE;
            Object objE2 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE2 == composer$Companion$Empty$1) {
                objE2 = new h(20);
                composer.A(objE2);
            }
            composer.l();
            MyListsKt.a(myShoppingListsData, function1, function12, (Function0) objE2, PaddingKt.h(PaddingKt.h(Modifier.Companion.d, 8, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, 16, 1), composer, 28080);
        }
        return Unit.f24250a;
    }
}
