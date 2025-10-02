package au.com.woolworths.shop.securedpreference.preference;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import au.com.woolworths.shop.securedpreference.encryption.AndroidBasedEncryptionProvider;
import au.com.woolworths.shop.securedpreference.encryption.EncryptionProvider;
import com.jakewharton.processphoenix.ProcessPhoenix;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import timber.log.Timber;

/* loaded from: classes4.dex */
public class SecuredPreferenceManager {

    /* renamed from: a, reason: collision with root package name */
    public static SecuredSharedPreference f12921a;

    public static SecuredSharedPreference a(final Context context) {
        if (f12921a == null) {
            EncryptionProvider.Callback callback = new EncryptionProvider.Callback() { // from class: au.com.woolworths.shop.securedpreference.preference.SecuredPreferenceManager.1
                @Override // au.com.woolworths.shop.securedpreference.encryption.EncryptionProvider.Callback
                public final void a() {
                    Timber.f27013a.h("Clearing the preference because of the invalid key store, and restarting", new Object[0]);
                    Context context2 = context;
                    context2.getSharedPreferences("android.secure.preference", 0).edit().clear().commit();
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setClassName(context2.getPackageName(), "au.com.woolworths.android.onesite.Launcher");
                    int i = ProcessPhoenix.d;
                    Intent intent2 = new Intent(context2, (Class<?>) ProcessPhoenix.class);
                    intent2.addFlags(268435456);
                    intent2.putParcelableArrayListExtra("phoenix_restart_intents", new ArrayList<>(Arrays.asList(intent)));
                    context2.startActivity(intent2);
                    if (context2 instanceof Activity) {
                        ((Activity) context2).finish();
                    }
                    Runtime.getRuntime().exit(0);
                }
            };
            try {
                if (AndroidBasedEncryptionProvider.d == null) {
                    AndroidBasedEncryptionProvider.d = new AndroidBasedEncryptionProvider(context);
                    AndroidBasedEncryptionProvider.f = callback;
                }
                f12921a = new SecuredSharedPreference(context.getSharedPreferences("android.secure.preference", 0), AndroidBasedEncryptionProvider.d);
            } catch (IOException | GeneralSecurityException e) {
                e.printStackTrace();
            }
        }
        SecuredSharedPreference securedSharedPreference = f12921a;
        if (securedSharedPreference != null) {
            return securedSharedPreference;
        }
        throw new IllegalStateException("Secured shared preference is not initialized, please initialize before use");
    }
}
