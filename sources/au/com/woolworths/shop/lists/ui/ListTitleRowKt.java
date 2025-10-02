package au.com.woolworths.shop.lists.ui;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import au.com.woolworths.android.onesite.models.products.PromotionInfo;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.feature.shop.instore.navigation.onboarding.ui.a;
import au.com.woolworths.product.models.MultiBuyPriceInfo;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductId;
import au.com.woolworths.product.models.ProductShoppingList;
import au.com.woolworths.shop.lists.data.model.ProductListItem;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ListTitleRowKt {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(au.com.woolworths.shop.lists.data.model.ShoppingListWithItems r33, androidx.compose.ui.Modifier r34, java.lang.String r35, kotlin.jvm.functions.Function3 r36, androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.ui.ListTitleRowKt.a(au.com.woolworths.shop.lists.data.model.ShoppingListWithItems, androidx.compose.ui.Modifier, java.lang.String, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(long j, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-2060720721);
        if ((((composerImplV.s(j) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            float f = 40;
            RoundedCornerShape roundedCornerShapeB = RoundedCornerShapeKt.b(f);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierQ = SizeKt.q(BackgroundKt.b(companion, j, roundedCornerShapeB), f);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierQ);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            IconKt.a(PainterResources_androidKt.a(R.drawable.ic_shop_lists_list, 0, composerImplV), null, SizeKt.q(BoxScopeInstance.f944a.g(companion, Alignment.Companion.e), 20), ToneColors.k, composerImplV, 48, 0);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(i, 3, j);
        }
    }

    public static final void c(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-1593787801);
        if (i == 0 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ImageKt.a(PainterResources_androidKt.a(R.drawable.ic_watchlist_icon, 0, composerImplV), null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 48, 124);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.shop.olive.voice.ui.permission.a(i, 16);
        }
    }

    public static ArrayList d() {
        EmptyList emptyList = EmptyList.d;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(emptyList, 10));
        Iterator<E> it = emptyList.iterator();
        while (it.hasNext()) {
            arrayList.add(new ProductListItem(null, "", 0L, 0L, false, ProductId.INSTANCE.create("1"), 1.0f, new ProductCard("1", "1", null, null, null, null, null, null, null, true, true, null, null, null, null, null, null, new ProductShoppingList(1.0d, 10.0d, 1.0d, 1.0d, null), null, null, null, (PromotionInfo) it.next(), null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, -2229764, 255, null), false, 285, null));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(emptyList, 10));
        Iterator<E> it2 = emptyList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new ProductListItem(null, "", 0L, 0L, false, ProductId.INSTANCE.create("1"), 1.0f, new ProductCard("1", "1", null, null, null, null, null, null, null, true, true, null, null, null, null, null, null, new ProductShoppingList(1.0d, 10.0d, 1.0d, 1.0d, null), null, null, null, null, null, null, null, null, null, null, null, null, null, false, (MultiBuyPriceInfo) it2.next(), null, null, null, null, null, null, null, -132612, 254, null), false, 285, null));
        }
        return CollectionsKt.c0(arrayList2, arrayList);
    }
}
