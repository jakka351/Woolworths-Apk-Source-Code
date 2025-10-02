package au.com.woolworths.shop.addtolist.models;

import android.content.Context;
import android.view.View;
import au.com.woolworths.feature.shared.web.file.uploader.a;
import au.com.woolworths.shop.addtolist.models.ListChangeEvent;
import com.google.android.material.snackbar.Snackbar;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-add-to-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ListChangeEventKt {
    public static void a(ListChangeEvent.AddToListSuccessEvent addToListSuccessEvent, Context context, final View view, boolean z, int i) {
        if ((i & 8) != 0) {
            z = true;
        }
        Intrinsics.h(addToListSuccessEvent, "<this>");
        String str = addToListSuccessEvent.e;
        Intrinsics.h(context, "context");
        Intrinsics.h(view, "view");
        String str2 = addToListSuccessEvent.f;
        String string = str2 != null ? context.getString(R.string.product_add_to_list_successfully, str2, str) : context.getString(R.string.product_add_all_to_list_successfully, str);
        Intrinsics.e(string);
        Object obj = null;
        Snackbar snackbarJ = Snackbar.j(null, view, string, 0);
        if (z) {
            snackbarJ.k(context.getString(R.string.view_list), new a(3, obj, addToListSuccessEvent, context));
        }
        snackbarJ.l();
        BoostResult boostResult = addToListSuccessEvent.i;
        if (boostResult != null) {
            if (boostResult == BoostResult.e) {
                final String string2 = context.getString(R.string.product_boost_failed);
                Intrinsics.g(string2, "getString(...)");
                view.postDelayed(new Runnable() { // from class: au.com.woolworths.shop.addtolist.models.ListChangeEventKt$showBoostingResultSnackBar$$inlined$postDelayed$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        Snackbar.j(null, view, string2, 0).l();
                    }
                }, 5000L);
            } else if (addToListSuccessEvent.j) {
                final String string3 = context.getString(R.string.product_boost_all_success);
                Intrinsics.g(string3, "getString(...)");
                view.postDelayed(new Runnable() { // from class: au.com.woolworths.shop.addtolist.models.ListChangeEventKt$showBoostingResultSnackBar$$inlined$postDelayed$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        Snackbar.j(null, view, string3, 0).l();
                    }
                }, 5000L);
            }
        }
    }

    public static final void b(Context context, View view, CharSequence message, String str, boolean z, Function0 function0) {
        Intrinsics.h(view, "view");
        Intrinsics.h(message, "message");
        Snackbar snackbarJ = Snackbar.j(null, view, message, 0);
        if (z) {
            snackbarJ.k(context.getString(R.string.view_list), new androidx.navigation.ui.a(17, str, context));
        }
        snackbarJ.l();
        function0.invoke();
    }
}
