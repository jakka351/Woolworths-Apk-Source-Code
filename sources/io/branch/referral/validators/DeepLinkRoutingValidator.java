package io.branch.referral.validators;

import YU.a;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import io.branch.referral.Branch;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DeepLinkRoutingValidator {

    /* renamed from: a, reason: collision with root package name */
    public static WeakReference f23875a;

    public static String a(String str, JSONObject jSONObject) {
        String strConcat;
        String strConcat2;
        String strConcat3;
        String strConcat4;
        String strConcat5;
        String str2 = "";
        try {
            str2 = jSONObject.getString("~referring_link").split("\\?")[0];
        } catch (Exception unused) {
        }
        String strG = a.g(str2, "?validate=true");
        if (!TextUtils.isEmpty(str)) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(strG);
                if (jSONObject.getString("ct").equals("t1")) {
                    strConcat = "&t1=".concat(str);
                } else {
                    strConcat = "&t1=" + jSONObject.getString("t1");
                }
                sb.append(strConcat);
                String string = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                if (jSONObject.getString("ct").equals("t2")) {
                    strConcat2 = "&t2=".concat(str);
                } else {
                    strConcat2 = "&t2=" + jSONObject.getString("t2");
                }
                sb2.append(strConcat2);
                String string2 = sb2.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                if (jSONObject.getString("ct").equals("t3")) {
                    strConcat3 = "&t3=".concat(str);
                } else {
                    strConcat3 = "&t3=" + jSONObject.getString("t3");
                }
                sb3.append(strConcat3);
                String string3 = sb3.toString();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(string3);
                if (jSONObject.getString("ct").equals("t4")) {
                    strConcat4 = "&t4=".concat(str);
                } else {
                    strConcat4 = "&t4=" + jSONObject.getString("t4");
                }
                sb4.append(strConcat4);
                String string4 = sb4.toString();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(string4);
                if (jSONObject.getString("ct").equals("t5")) {
                    strConcat5 = "&t5=".concat(str);
                } else {
                    strConcat5 = "&t5=" + jSONObject.getString("t5");
                }
                sb5.append(strConcat5);
                strG = sb5.toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return a.g(strG, "&os=android");
    }

    public static void b(String str) {
        if (f23875a.get() != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str).buildUpon().appendQueryParameter("$uri_redirect_mode", "2").build());
            intent.addFlags(268435456);
            intent.setPackage("com.android.chrome");
            ((Activity) f23875a.get()).getPackageManager().queryIntentActivities(intent, 0);
            try {
                ((Activity) f23875a.get()).startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                intent.setPackage(null);
                ((Activity) f23875a.get()).startActivity(intent);
            }
        }
    }

    public static void c(WeakReference weakReference) {
        String strOptString;
        f23875a = weakReference;
        if (Branch.i() != null) {
            Branch.i().j();
            strOptString = Branch.i().j().optString("~referring_link");
        } else {
            strOptString = "";
        }
        if (TextUtils.isEmpty(strOptString) || weakReference == null) {
            return;
        }
        final JSONObject jSONObjectJ = Branch.i().j();
        if (jSONObjectJ.optInt("_branch_validate") != 60514) {
            if (jSONObjectJ.optBoolean("bnc_validate")) {
                new Handler().postDelayed(new Runnable() { // from class: io.branch.referral.validators.DeepLinkRoutingValidator.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        DeepLinkRoutingValidator.b(DeepLinkRoutingValidator.a("", jSONObjectJ));
                    }
                }, 500L);
            }
        } else if (jSONObjectJ.optBoolean("+clicked_branch_link")) {
            if (f23875a.get() != null) {
                new AlertDialog.Builder((Context) f23875a.get(), R.style.Theme.Material.Dialog.Alert).setTitle("Branch Deeplinking Routing").setMessage("Good news - we got link data. Now a question for you, astute developer: did the app deep link to the specific piece of content you expected to see?").setPositiveButton("Yes", new DialogInterface.OnClickListener() { // from class: io.branch.referral.validators.DeepLinkRoutingValidator.4
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        DeepLinkRoutingValidator.b(DeepLinkRoutingValidator.a("g", jSONObjectJ));
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() { // from class: io.branch.referral.validators.DeepLinkRoutingValidator.3
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        DeepLinkRoutingValidator.b(DeepLinkRoutingValidator.a("r", jSONObjectJ));
                    }
                }).setNeutralButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: io.branch.referral.validators.DeepLinkRoutingValidator.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                    }
                }).setCancelable(false).setIcon(R.drawable.sym_def_app_icon).show();
            }
        } else if (f23875a.get() != null) {
            new AlertDialog.Builder((Context) f23875a.get(), R.style.Theme.Material.Dialog.Alert).setTitle("Branch Deeplink Routing Support").setMessage("Bummer. It seems like +clicked_branch_link is false - we didn't deep link.  Double check that the link you're clicking has the same branch_key that is being used in your Manifest file. Return to Chrome when you're ready to test again.").setNeutralButton("Got it", new DialogInterface.OnClickListener() { // from class: io.branch.referral.validators.DeepLinkRoutingValidator.5
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                }
            }).setCancelable(false).setIcon(R.drawable.sym_def_app_icon).show();
        }
    }
}
