package au.com.woolworths.android.onesite.utils;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes3.dex */
public class AndroidIntents {
    public static Intent a(String str) {
        return new Intent(new Intent("android.intent.action.VIEW", Uri.parse("tel:".concat(str))));
    }

    public static void b(Context context, String str) {
        String strEncode = Uri.encode(str);
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("geo:0,0?q=" + strEncode));
            intent.setPackage("com.google.android.apps.maps");
            context.startActivity(intent, null);
        } catch (ActivityNotFoundException unused) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse("geo:0,0?q=" + strEncode));
            intent2.setData(Uri.parse("https://www.google.com/search?q=" + strEncode));
            context.startActivity(intent2, null);
        }
    }
}
