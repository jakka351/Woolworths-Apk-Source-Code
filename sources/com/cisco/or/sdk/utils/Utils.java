package com.cisco.or.sdk.utils;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiNetworkSuggestion;
import android.net.wifi.hotspot2.ConfigParser;
import android.net.wifi.hotspot2.PasspointConfiguration;
import android.net.wifi.hotspot2.pps.Credential;
import android.net.wifi.hotspot2.pps.HomeSp;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import androidx.media3.exoplayer.source.mediaparser.a;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.auth0.android.jwt.JWT;
import com.cisco.or.sdk.activity.SDKActivity;
import com.cisco.or.sdk.exceptions.DNASpacesBackgroundExceptionHandler;
import com.cisco.or.sdk.exceptions.EmptyProfileException;
import com.cisco.or.sdk.exceptions.Hotspot2NotSupportedException;
import com.cisco.or.sdk.exceptions.RegisterFailedException;
import com.cisco.or.sdk.exceptions.ServiceBadResponseException;
import com.cisco.or.sdk.exceptions.TokenEmptyException;
import com.cisco.or.sdk.services.HTTPResponse;
import com.cisco.or.sdk.services.RefreshTokenService;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Security;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/cisco/or/sdk/utils/Utils;", "", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Utils {
    public static String a(String str, JSONObject value) throws JSONException, BadPaddingException, NoSuchPaddingException, InvalidKeySpecException, IllegalBlockSizeException, NoSuchAlgorithmException, RegisterFailedException, InvalidKeyException {
        byte[] bytes;
        String string;
        Intrinsics.h(value, "value");
        String string2 = value.getString("sdkToken");
        String string3 = value.getString("key");
        if (string2 == null || string2.length() == 0 || string3 == null || string3.length() == 0) {
            throw new RegisterFailedException();
        }
        Cipher cipher = Cipher.getInstance("RSA");
        PrivateKey privateKeyGeneratePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(str, 0)));
        Intrinsics.g(privateKeyGeneratePrivate, "kf.generatePrivate(keySpec)");
        cipher.init(2, privateKeyGeneratePrivate);
        byte[] decryptedBytes = cipher.doFinal(Base64.decode(string3, 0));
        Intrinsics.g(decryptedBytes, "decryptedBytes");
        Charset charset = Charsets.f24671a;
        String str2 = new String(decryptedBytes, charset);
        Security.addProvider(new BouncyCastleProvider());
        byte[] bytes2 = str2.getBytes(charset);
        Intrinsics.g(bytes2, "this as java.lang.String).getBytes(charset)");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes2, "AES");
        int length = string2.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.j(string2.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String string4 = string2.subSequence(i, length + 1).toString();
        if (string4 != null) {
            bytes = string4.getBytes(Charsets.f24671a);
            Intrinsics.g(bytes, "this as java.lang.String).getBytes(charset)");
        } else {
            bytes = null;
        }
        byte[] bArrDecode = org.bouncycastle.util.encoders.Base64.decode(bytes);
        synchronized (Cipher.class) {
            try {
                Cipher cipher2 = Cipher.getInstance("AES/ECB/PKCS7Padding");
                cipher2.init(2, secretKeySpec);
                byte[] bArr = new byte[cipher2.getOutputSize(bArrDecode.length)];
                cipher2.doFinal(bArr, cipher2.update(bArrDecode, 0, bArrDecode.length, bArr, 0));
                String str3 = new String(bArr, Charsets.f24671a);
                int length2 = str3.length() - 1;
                int i2 = 0;
                boolean z3 = false;
                while (i2 <= length2) {
                    boolean z4 = Intrinsics.j(str3.charAt(!z3 ? i2 : length2), 32) <= 0;
                    if (z3) {
                        if (!z4) {
                            break;
                        }
                        length2--;
                    } else if (z4) {
                        i2++;
                    } else {
                        z3 = true;
                    }
                }
                string = str3.subSequence(i2, length2 + 1).toString();
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    public static void b(Context context, String str, byte[] bArr) {
        Intrinsics.h(context, "context");
        PasspointConfiguration passpointConfiguration = new PasspointConfiguration();
        if (str != null) {
            Credential credential = new Credential();
            credential.setRealm("dummy.dummy.openroaming.net");
            Credential.SimCredential simCredential = new Credential.SimCredential();
            simCredential.setEapType(18);
            simCredential.setImsi("123456*");
            credential.setSimCredential(simCredential);
            passpointConfiguration.setCredential(credential);
            HomeSp homeSp = new HomeSp();
            homeSp.setFqdn(str);
            homeSp.setFriendlyName("OpenRoaming-App-Inactive");
            passpointConfiguration.setHomeSp(homeSp);
            if (Build.VERSION.SDK_INT >= 29) {
                Object systemService = context.getSystemService("wifi");
                Intrinsics.f(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
                ((WifiManager) systemService).addOrUpdatePasspointConfiguration(passpointConfiguration);
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Object systemService2 = context.getSystemService("wifi");
            Intrinsics.f(systemService2, "null cannot be cast to non-null type android.net.wifi.WifiManager");
            WifiManager wifiManager = (WifiManager) systemService2;
            PasspointConfiguration passpointConfig = ConfigParser.parsePasspointConfig("application/x-wifi-config", bArr);
            if (passpointConfig == null) {
                Log.e("installDummyProfile", "Configuration is empty");
                return;
            }
            passpointConfig.getHomeSp().setFriendlyName(passpointConfig.getHomeSp().getFriendlyName() + "-InActive");
            passpointConfig.getCredential().setRealm("dummy.dummy.openroaming.net");
            passpointConfig.getHomeSp().setRoamingConsortiumOis(new long[]{1});
            wifiManager.addOrUpdatePasspointConfiguration(new PasspointConfiguration(passpointConfig));
        }
    }

    public static void c(byte[] data) throws EmptyProfileException {
        ProfileInstalledUserSelection profileInstalledUserSelection = ProfileInstalledUserSelection.d;
        Intrinsics.h(null, "activity");
        Intrinsics.h(data, "data");
        try {
            if (data.length == 0) {
                throw new EmptyProfileException();
            }
            PasspointConfiguration passpointConfig = ConfigParser.parsePasspointConfig("application/x-wifi-config", data);
            SharedPrefs sharedPrefs = new SharedPrefs(null);
            sharedPrefs.f14054a.edit().putString("INSTALLED_FQDN", passpointConfig.getHomeSp().getFqdn()).apply();
            if (Build.VERSION.SDK_INT < 30) {
                throw null;
            }
            Intent intent = new Intent((Context) null, (Class<?>) SDKActivity.class);
            intent.putExtra("profileData", data);
            intent.putExtra("callback", profileInstalledUserSelection);
            throw null;
        } catch (Exception e) {
            Log.e("Install Profile", Log.getStackTraceString(e));
        }
    }

    public static void d(Context context, byte[] data) throws EmptyProfileException, Hotspot2NotSupportedException {
        Intrinsics.h(context, "context");
        Intrinsics.h(data, "data");
        try {
            if (data.length == 0) {
                throw new EmptyProfileException();
            }
            PasspointConfiguration passpointConfig = ConfigParser.parsePasspointConfig("application/x-wifi-config", data);
            new SharedPrefs(context).f14054a.edit().putString("INSTALLED_FQDN", passpointConfig.getHomeSp().getFqdn()).apply();
            if (Build.VERSION.SDK_INT < 30) {
                Object systemService = context.getSystemService("wifi");
                Intrinsics.f(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
                ((WifiManager) systemService).addOrUpdatePasspointConfiguration(passpointConfig);
                new SharedPrefs(context).f14054a.edit().putString("PROFILE_DATA", Base64.encodeToString(data, 2)).apply();
                new SharedPrefs(context).b(true);
                return;
            }
            PasspointConfiguration passpointConfiguration = new PasspointConfiguration(passpointConfig);
            a.q();
            WifiNetworkSuggestion wifiNetworkSuggestionBuild = a.l().setPasspointConfig(passpointConfiguration).build();
            Intrinsics.g(wifiNetworkSuggestionBuild, "Builder()\n              …                 .build()");
            List listQ = CollectionsKt.Q(wifiNetworkSuggestionBuild);
            Object systemService2 = context.getSystemService("wifi");
            Intrinsics.f(systemService2, "null cannot be cast to non-null type android.net.wifi.WifiManager");
            int iAddNetworkSuggestions = ((WifiManager) systemService2).addNetworkSuggestions(listQ);
            if (iAddNetworkSuggestions != 0) {
                Log.e("Install Profile", "Error in setting suggestion " + iAddNetworkSuggestions);
            }
            Log.e("Install Profile", "Profile installed " + iAddNetworkSuggestions);
        } catch (Exception e) {
            Log.e("Install Profile", Log.getStackTraceString(e));
            throw new Hotspot2NotSupportedException();
        }
    }

    public static void e(Context context, final DNASpacesBackgroundExceptionHandler exceptionHandler, final Function0 function0) throws TokenEmptyException {
        Intrinsics.h(context, "context");
        Intrinsics.h(exceptionHandler, "exceptionHandler");
        final SharedPrefs sharedPrefs = new SharedPrefs(context);
        String string = sharedPrefs.f14054a.getString("PREF_SDK_TOKEN", null);
        if (string == null || StringsKt.D(string)) {
            throw new TokenEmptyException();
        }
        if (!new JWT(string).c()) {
            function0.invoke();
        } else {
            RefreshTokenService.f14048a.d(context, exceptionHandler, new Function1<HTTPResponse, Unit>() { // from class: com.cisco.or.sdk.utils.Utils$refreshTokenSDK$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    HTTPResponse hTTPResponse = (HTTPResponse) obj;
                    SharedPreferences sharedPreferences = sharedPrefs.f14054a;
                    if (hTTPResponse != null) {
                        JSONObject jSONObject = hTTPResponse.d;
                        Intrinsics.e(jSONObject);
                        String string2 = sharedPreferences.getString("PREF_CLIENT_PRIVATE_KEY", null);
                        Intrinsics.e(string2);
                        c.v(sharedPreferences, "PREF_SDK_TOKEN", Utils.a(string2, jSONObject));
                        function0.invoke();
                    } else {
                        exceptionHandler.a(new ServiceBadResponseException());
                    }
                    return Unit.f24250a;
                }
            });
        }
    }
}
