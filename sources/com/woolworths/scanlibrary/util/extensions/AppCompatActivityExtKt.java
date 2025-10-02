package com.woolworths.scanlibrary.util.extensions;

import android.app.Activity;
import android.os.Vibrator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import au.com.woolworths.android.onesite.deeplink.h;
import com.woolworths.scanlibrary.ui.home.itemview.views.a;
import com.woolworths.scanlibrary.ui.home.itemview.views.b;
import com.woolworths.scanlibrary.util.widget.MoreDetailAlertDialogHelper;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"scanGoLibrary_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AppCompatActivityExtKt {
    public static final void a(Activity activity, String title, String message, String positiveBtnText, Function0 function0, String negativeBtnText, Function0 function02, Function0 function03, boolean z) {
        Intrinsics.h(activity, "<this>");
        Intrinsics.h(title, "title");
        Intrinsics.h(message, "message");
        Intrinsics.h(positiveBtnText, "positiveBtnText");
        Intrinsics.h(negativeBtnText, "negativeBtnText");
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setCancelable(z);
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        builder.setPositiveButton(positiveBtnText, new a(booleanRef, function0, 4));
        if (negativeBtnText.length() > 0) {
            builder.setNegativeButton(negativeBtnText, new a(booleanRef, function02, 5));
        }
        builder.setOnDismissListener(new b(booleanRef, function03, 1));
        if (activity.isFinishing()) {
            return;
        }
        builder.show();
    }

    public static final void b(Activity activity, String title, String message, String positiveBtnText, Function0 function0, String negativeBtnText, Function0 function02, boolean z) {
        Intrinsics.h(activity, "<this>");
        Intrinsics.h(title, "title");
        Intrinsics.h(message, "message");
        Intrinsics.h(positiveBtnText, "positiveBtnText");
        Intrinsics.h(negativeBtnText, "negativeBtnText");
        a(activity, title, message, positiveBtnText, function0, negativeBtnText, function02, function02, z);
    }

    public static final void c(Activity activity, String title, String message, String positiveBtnText, Function0 function0, boolean z) {
        Intrinsics.h(activity, "<this>");
        Intrinsics.h(title, "title");
        Intrinsics.h(message, "message");
        Intrinsics.h(positiveBtnText, "positiveBtnText");
        a(activity, title, message, positiveBtnText, function0, "", new h(20), function0, z);
    }

    public static final void d(Activity activity, String str, String str2, Function0 function0) {
        Intrinsics.h(activity, "<this>");
        a(activity, "", str, str2, function0, "", new h(20), function0, true);
    }

    public static final void e(FragmentActivity fragmentActivity, String message, String str, Function0 function0, String str2, Function0 function02, boolean z) {
        Intrinsics.h(message, "message");
        a(fragmentActivity, "", message, str, function0, str2, function02, function02, z);
    }

    public static void f(Activity activity, String message, String str, Function0 function0, Function0 function02) {
        Intrinsics.h(activity, "<this>");
        Intrinsics.h(message, "message");
        a(activity, "", message, str, function0, "", new h(20), function02, true);
    }

    public static void g(Activity activity, String str, String moreDetails, String str2, Function0 function0, Function0 function02) {
        Intrinsics.h(activity, "<this>");
        Intrinsics.h(moreDetails, "moreDetails");
        if (activity.isFinishing()) {
            return;
        }
        MoreDetailAlertDialogHelper moreDetailAlertDialogHelper = new MoreDetailAlertDialogHelper(activity);
        ((TextView) moreDetailAlertDialogHelper.e.getD()).setText("");
        ((TextView) moreDetailAlertDialogHelper.f.getD()).setText(str);
        Lazy lazy = moreDetailAlertDialogHelper.h;
        ((Button) lazy.getD()).setText(str2);
        ((Button) lazy.getD()).setOnClickListener(new androidx.navigation.ui.a(27, moreDetailAlertDialogHelper, function0));
        int length = moreDetails.length();
        Lazy lazy2 = moreDetailAlertDialogHelper.j;
        if (length > 0) {
            ((TextView) moreDetailAlertDialogHelper.g.getD()).setText(moreDetails);
            ((ImageView) lazy2.getD()).setVisibility(0);
        }
        ((ImageView) lazy2.getD()).setOnClickListener(new com.woolworths.scanlibrary.ui.parking.a(moreDetailAlertDialogHelper, 15));
        b bVar = new b(moreDetailAlertDialogHelper, function02, 2);
        AlertDialog.Builder builder = moreDetailAlertDialogHelper.d;
        builder.setOnDismissListener(bVar);
        AlertDialog alertDialogCreate = builder.setCancelable(true).create();
        moreDetailAlertDialogHelper.b = alertDialogCreate;
        if (alertDialogCreate != null) {
            alertDialogCreate.show();
        }
    }

    public static final void h(FragmentActivity fragmentActivity) {
        Object systemService = fragmentActivity.getSystemService("vibrator");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        Vibrator vibrator = (Vibrator) systemService;
        if (vibrator.hasVibrator()) {
            vibrator.vibrate(400L);
        }
    }
}
