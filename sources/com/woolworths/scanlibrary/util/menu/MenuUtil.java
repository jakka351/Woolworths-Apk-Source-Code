package com.woolworths.scanlibrary.util.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.Menu;
import android.view.MenuItem;
import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.R;
import com.woolworths.scanlibrary.util.widget.CartCountDrawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/util/menu/MenuUtil;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MenuUtil {
    public static void a(Context context, Menu menu, String count) {
        MenuItem menuItemFindItem;
        Intrinsics.h(count, "count");
        if (menu == null || (menuItemFindItem = menu.findItem(R.id.menu_item_cart)) == null) {
            return;
        }
        Drawable icon = menuItemFindItem.getIcon();
        Intrinsics.f(icon, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        LayerDrawable layerDrawable = (LayerDrawable) icon;
        Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.ic_item_count);
        CartCountDrawable cartCountDrawable = (drawableFindDrawableByLayerId == null || !(drawableFindDrawableByLayerId instanceof CartCountDrawable)) ? new CartCountDrawable(context) : (CartCountDrawable) drawableFindDrawableByLayerId;
        cartCountDrawable.d = count;
        cartCountDrawable.e = !count.equalsIgnoreCase("0");
        cartCountDrawable.invalidateSelf();
        layerDrawable.mutate();
        layerDrawable.setDrawableByLayerId(R.id.ic_item_count, cartCountDrawable);
    }
}
