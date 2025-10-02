package au.com.woolworths.feature.product.list.legacy.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.AppCompatActivity;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.foundation.shop.editorder.ui.EditOrderBannerView;
import au.com.woolworths.product.infoview.ProductInfoView;
import au.com.woolworths.product.offers.ProductsBoostView;
import au.com.woolworths.shop.lists.ui.details.ui.ListDetailsView;
import au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByView;
import au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleView;
import com.woolworths.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Context e;

    public /* synthetic */ a(Context context, int i) {
        this.d = i;
        this.e = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Context context = this.e;
        switch (i) {
            case 0:
                return Integer.valueOf(context.getResources().getDimensionPixelOffset(R.dimen.half_default_padding));
            case 1:
                return Integer.valueOf(context.getResources().getDimensionPixelOffset(R.dimen.default_margin));
            case 2:
                return Integer.valueOf(context.getResources().getDimensionPixelOffset(R.dimen.half_default_padding));
            case 3:
                return Integer.valueOf(context.getResources().getDimensionPixelOffset(R.dimen.default_margin));
            case 4:
                int i2 = EditOrderBannerView.i;
                return ContextExtKt.b(context).getDefaultViewModelProviderFactory();
            case 5:
                int i3 = EditOrderBannerView.i;
                return ContextExtKt.b(context);
            case 6:
                int i4 = ProductInfoView.l;
                try {
                    Intrinsics.f(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                    return (AppCompatActivity) context;
                } catch (ClassCastException unused) {
                    throw new ClassCastException("Please ensure that the provided Context is a valid Activity");
                }
            case 7:
                int i5 = ProductsBoostView.t;
                return ContextExtKt.b(context);
            case 8:
                int i6 = ListDetailsView.p;
                try {
                    Intrinsics.f(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                    return (AppCompatActivity) context;
                } catch (ClassCastException unused2) {
                    throw new ClassCastException("Please ensure that the provided Context is a valid Activity");
                }
            case 9:
                int i7 = SortByView.l;
                return ContextExtKt.b(context);
            case 10:
                Drawable drawable = context.getDrawable(R.drawable.ic_shop_lists_check);
                if (drawable == null) {
                    return null;
                }
                drawable.setTint(-1);
                return drawable;
            case 11:
                Drawable drawable2 = context.getDrawable(R.drawable.ic_shop_lists_uncheck);
                if (drawable2 == null) {
                    return null;
                }
                drawable2.setTint(-1);
                return drawable2;
            case 12:
                Drawable drawable3 = context.getDrawable(R.drawable.ic_shop_lists_delete);
                if (drawable3 == null) {
                    return null;
                }
                drawable3.setTint(-1);
                return drawable3;
            case 13:
                return Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.default_margin));
            default:
                int i8 = WatchlistToggleView.k;
                return ContextExtKt.b(context);
        }
    }
}
