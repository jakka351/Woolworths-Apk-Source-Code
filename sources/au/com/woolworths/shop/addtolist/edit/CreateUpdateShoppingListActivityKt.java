package au.com.woolworths.shop.addtolist.edit;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.shop.addtolist.analytics.DuplicateListSuccess;
import au.com.woolworths.shop.lists.ui.ListScreen;
import com.google.android.material.snackbar.Snackbar;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-add-to-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CreateUpdateShoppingListActivityKt {
    public static final void a(ActivityResult activityResult, AnalyticsManager analyticsManager, View view, ListScreen screen, ViewGroup viewGroup) {
        Intrinsics.h(activityResult, "<this>");
        Intrinsics.h(view, "view");
        Intrinsics.h(screen, "screen");
        if (activityResult.d == -1) {
            Snackbar snackbarI = Snackbar.i(view, R.string.shop_list_duplicated_message, -1);
            if (viewGroup != null && viewGroup.getVisibility() == 0) {
                snackbarI.f(viewGroup);
            }
            snackbarI.l();
            Intent intent = activityResult.e;
            if ((intent != null ? (Activities.CreateUpdateShoppingList.CreateUpdateResult) intent.getParcelableExtra("EXTRA_RESULT") : null) != null) {
                analyticsManager.c(new DuplicateListSuccess(screen));
            }
        }
    }
}
