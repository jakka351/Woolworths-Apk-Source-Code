package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class jjxjxjx {
    private static final String llll006Cll = lqlqqll.u00750075u00750075u(jjxjxjx.class);

    public enum jxxjxjx {
        ALG_PARAMETER_SPEC("java.security.spec.AlgorithmParameterSpec"),
        APPLICATION_INFO("android.content.pm.ApplicationInfo"),
        BUILD("android.os.Build"),
        CDMA_CELL_LOCATION("android.telephony.cdma.CdmaCellLocation"),
        CELL_LOCATION("android.telephony.CellLocation"),
        CELL_IDENTITY_CDMA("android.telephony.CellIdentityCdma"),
        CELL_IDENTITY_GSM("android.telephony.CellIdentityGsm"),
        CELL_IDENTITY_LTE("android.telephony.CellIdentityLte"),
        CELL_IDENTITY_WCDMA("android.telephony.CellIdentityWcdma"),
        CELL_INFO("android.telephony.CellInfo"),
        CELL_INFO_CDMA("android.telephony.CellInfoCdma"),
        CELL_INFO_GSM("android.telephony.CellInfoGsm"),
        CELL_INFO_LTE("android.telephony.CellInfoLte"),
        CELL_INFO_WCDMA("android.telephony.CellInfoWcdma"),
        CELL_SIGNAL_STRENGTH("android.telephony.CellSignalStrength"),
        CERTIFICATE("java.security.cert.Certificate"),
        CIPHER("javax.crypto.Cipher"),
        CONNECTIVITY_MANAGER("android.net.ConnectivityManager"),
        CRITERIA("android.location.Criteria"),
        DEVICE_POLICY_MANAGER("android.app.admin.DevicePolicyManager"),
        EC_GEN_KEY_SPEC("java.security.spec.ECGenParameterSpec"),
        FIREBASE_INSTANCE_ID("com.google.firebase.iid.FirebaseInstanceId"),
        FIREBASE_MESSAGING("com.google.firebase.messaging.FirebaseMessaging"),
        GOOGLE_ADVERTISING_ID("com.google.android.gms.ads.identifier.AdvertisingIdClient"),
        GOOGLE_ADVERTISING_INFO("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info"),
        GOOGLE_API("com.google.android.gms.common.api.Api"),
        GOOGLE_API_CLIENT("com.google.android.gms.common.api.GoogleApiClient"),
        GOOGLE_API_BUILDER("com.google.android.gms.common.api.GoogleApiClient$Builder"),
        GOOGLE_AVAILABILITY("com.google.android.gms.common.GoogleApiAvailability"),
        GOOGLE_CONNECTION_CALL_BACK("com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks"),
        GOOGLE_FAILED_CALL_BACK("com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener"),
        GOOGLE_LOCATION_LISTENER("com.google.android.gms.location.LocationListener"),
        GOOGLE_LOCATION_REQUEST("com.google.android.gms.location.LocationRequest"),
        GOOGLE_LOCATION_SERVICES("com.google.android.gms.location.LocationServices"),
        GOOGLE_PENDING_RESULT("com.google.android.gms.common.api.PendingResult"),
        GOOGLE_PLAY_UTILS("com.google.android.gms.common.GooglePlayServicesUtil"),
        GOOGLE_RESULT_CALL_BACK("com.google.android.gms.common.api.ResultCallback"),
        GOOGLE_STATUS("com.google.android.gms.common.api.Status"),
        GSM_CELL_LOCATION("android.telephony.gsm.GsmCellLocation"),
        JS_RESULT("android.webkit.JsResult"),
        KEY("java.security.Key"),
        KEY_CHAIN("android.security.KeyChain"),
        KEY_FACTORY("java.security.KeyFactory"),
        KEY_ENTRY("java.security.KeyStore$Entry"),
        KEY_GEN_PARAM_SPEC("android.security.keystore.KeyGenParameterSpec"),
        KEY_GEN_PARAM_SPEC_BUILDER("android.security.keystore.KeyGenParameterSpec$Builder"),
        KEY_INFO("android.security.keystore.KeyInfo"),
        KEY_PAIR("java.security.KeyPair"),
        KEY_PAIR_GENERATOR("java.security.KeyPairGenerator"),
        KEY_PAIR_GEN_SPEC("android.security.KeyPairGeneratorSpec"),
        KEY_PAIR_GEN_SPEC_BUILDER("android.security.KeyPairGeneratorSpec$Builder"),
        KEY_PROPERTIES("android.security.keystore.KeyProperties"),
        KEY_SPEC("java.security.spec.KeySpec"),
        KEY_STORE("java.security.KeyStore"),
        LOAD_STORE_PARAM("java.security.KeyStore$LoadStoreParameter"),
        LOCATION("android.location.Location"),
        LOCATION_LISTENER("android.location.LocationListener"),
        LOCATION_PROVIDER("android.location.LocationProvider"),
        NEIGHBOR_CELL_INFO("android.telephony.NeighboringCellInfo"),
        NETWORK_INFO("android.net.NetworkInfo"),
        PACKAGE_MANAGER("android.content.pm.PackageManager"),
        PACKAGE_INFO("android.content.pm.PackageInfo"),
        PACKAGE_ITEM_INFO("android.content.pm.PackageItemInfo"),
        PKCS8_ENC_KEY_SPEC("java.security.spec.PKCS8EncodedKeySpec"),
        POINT("android.graphics.Point"),
        POWER_MANAGER("android.os.PowerManager"),
        PRIVATE_KEY("java.security.PrivateKey"),
        PRIVATE_KEY_ENTRY("java.security.KeyStore$PrivateKeyEntry"),
        PROTECTION_PARAM("java.security.KeyStore$ProtectionParameter"),
        PUBLIC_KEY("java.security.PublicKey"),
        RSA_GEN_KEY_SPEC("java.security.spec.RSAKeyGenParameterSpec"),
        SETTING_SECURE("android.provider.Settings$Secure"),
        SETTING_GLOBAL("android.provider.Settings$Global"),
        SETTING_SYSTEM("android.provider.Settings$System"),
        SECRET_KEY_SPEC("javax.crypto.spec.SecretKeySpec"),
        SHARED_PREFERENCES("android.content.SharedPreferences"),
        SHARED_PREFERENCES_EDITOR("android.content.SharedPreferences$Editor"),
        SIGNATURE("java.security.Signature"),
        STAT_FS("android.os.StatFs"),
        STATE("android.net.NetworkInfo$State"),
        SUBSCRIPTION_INFO("android.telephony.SubscriptionInfo"),
        SUBSCRIPTION_MANAGER("android.telephony.SubscriptionManager"),
        SYSTEM_CLOCK("android.os.SystemClock"),
        SYSTEM_PROPERTIES("android.os.SystemProperties"),
        SYSTEM_OS("android.system.Os"),
        STRUCT_STAT("android.system.StructStat"),
        TELEPHONY_MANAGER("android.telephony.TelephonyManager"),
        TASK("com.google.android.gms.tasks.Task"),
        VERSION("android.os.Build$VERSION"),
        VERSION_CODES("android.os.Build$VERSION_CODES"),
        WEB_CHROME_CLIENT("android.webkit.WebChromeClient"),
        WEB_SETTINGS("android.webkit.WebSettings"),
        WEB_SETTINGS_PLUGIN("android.webkit.WebSettings$PluginState"),
        WEB_VIEW("android.webkit.WebView"),
        WEB_VIEW_CLIENT("android.webkit.WebViewClient"),
        WIFI_INFO("android.net.wifi.WifiInfo"),
        WIFI_MANAGER("android.net.wifi.WifiManager"),
        WINDOW_MANAGER("android.view.WindowManager"),
        X_500_PRINCIPAL("javax.security.auth.x500.X500Principal"),
        X509_ENC_KEY_SPEC("java.security.spec.X509EncodedKeySpec"),
        JUNIT_NOT_FOO("com.threatmetrix.NotFoo"),
        JUNIT_FOO("com.lexisnexisrisk.threatmetrix.rl.WrapperHelperTest$Foo");

        public final String l006Cll006Cll;

        jxxjxjx(String str) {
            this.l006Cll006Cll = str;
        }

        public static jxxjxjx valueOf(String str) {
            return (jxxjxjx) nlnnnnn.ooo006F006Foo(jxxjxjx.class, str);
        }
    }

    public static Object s007300730073ssss(ClassLoader classLoader, Class<?>[] clsArr, InvocationHandler invocationHandler) {
        try {
            return Proxy.newProxyInstance(classLoader, clsArr, invocationHandler);
        } catch (Throwable unused) {
            lqlqqll.llqqqll.u0075u0075uuu(llll006Cll, "Can't create a proxy for class {}", clsArr[0].getName());
            return null;
        }
    }

    public static Object s00730073sssss(Class cls, String str, Object obj) {
        Field fieldWw007700770077007700770077 = ww007700770077007700770077(cls, str);
        if (fieldWw007700770077007700770077 != null) {
            return ssss0073sss(obj, fieldWw007700770077007700770077);
        }
        return null;
    }

    @Nullable
    public static Object s0073s0073ssss(@Nullable Class cls, @Nullable Class[] clsArr, @Nullable Object[] objArr) {
        if (cls == null) {
            return null;
        }
        if ((clsArr != null && objArr == null) || (clsArr == null && objArr != null)) {
            return null;
        }
        if (clsArr != null && clsArr.length != objArr.length) {
            return null;
        }
        try {
            return cls.getConstructor(clsArr).newInstance(objArr);
        } catch (Throwable unused) {
            lqlqqll.llqqqll.u0075u0075uuu(llll006Cll, "Can't create an instance of the class {}", cls.getName());
            return null;
        }
    }

    @Nullable
    public static <T> T s0073ss0073sss(Object obj, @Nullable Method method, Object... objArr) {
        boolean z;
        T t;
        if (method != null) {
            try {
                t = (T) method.invoke(obj, objArr);
                z = false;
            } catch (Throwable unused) {
                lqlqqll.llqqqll.u0075u0075uuu(llll006Cll, "Can't invoke the method {} ", method.getName());
                z = true;
                t = null;
            }
            if (!z) {
                return t;
            }
        }
        return null;
    }

    @Nullable
    public static List<String> s0073ssssss(@Nullable Class cls) {
        ArrayList arrayList = null;
        if (cls == null) {
            return null;
        }
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            if (declaredFields != null && declaredFields.length != 0) {
                ArrayList arrayList2 = new ArrayList();
                for (Field field : declaredFields) {
                    try {
                        if (field != null) {
                            arrayList2.add(field.getName());
                        }
                    } catch (Throwable unused) {
                        arrayList = arrayList2;
                        lqlqqll.llqqqll.u0075u0075uuu(llll006Cll, "Can't get declared fields of class {}", cls.getName());
                        return arrayList;
                    }
                }
                return arrayList2;
            }
            return null;
        } catch (Throwable unused2) {
        }
    }

    @Nullable
    public static Method ss00730073ssss(@Nullable Class cls, String str, Class... clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod(str, clsArr);
        } catch (Throwable unused) {
            lqlqqll.llqqqll.uu00750075uuu(llll006Cll, "No such method: method name {} class name {} ", str, cls.getName());
            return null;
        }
    }

    @Nullable
    public static <T> T ss0073s0073sss(Object obj, @Nullable Method method, Object... objArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (method != null) {
            return (T) method.invoke(obj, objArr);
        }
        return null;
    }

    public static Object ss0073sssss(@Nonnull jxxjxjx jxxjxjxVar, String str, Object obj) {
        Field fieldWw007700770077007700770077;
        Class clsWww00770077007700770077 = www00770077007700770077(jxxjxjxVar);
        if (clsWww00770077007700770077 == null || (fieldWw007700770077007700770077 = ww007700770077007700770077(clsWww00770077007700770077, str)) == null) {
            return null;
        }
        return ssss0073sss(obj, fieldWw007700770077007700770077);
    }

    @Nullable
    public static Field[] sss0073ssss(@Nullable Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            return cls.getDeclaredFields();
        } catch (Throwable unused) {
            lqlqqll.llqqqll.u0075u0075uuu(llll006Cll, "Can get declared fields of class {}", cls.getName());
            return null;
        }
    }

    @Nullable
    public static Object ssss0073sss(Object obj, @Nullable Field field) {
        if (field == null) {
            return null;
        }
        try {
            return field.get(obj);
        } catch (Throwable unused) {
            lqlqqll.llqqqll.u0075u0075uuu(llll006Cll, "Can't get the value of the field {}", field.getName());
            return null;
        }
    }

    @Nullable
    public static Method w0077w00770077007700770077(@Nullable Class cls, String str, Class... clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            return cls.getDeclaredMethod(str, clsArr);
        } catch (Throwable unused) {
            lqlqqll.llqqqll.uu00750075uuu(llll006Cll, "No such method: method name {} class name {} ", str, cls.getName());
            return null;
        }
    }

    @Nullable
    public static Field ww007700770077007700770077(@Nullable Class cls, String str) {
        if (cls == null) {
            return null;
        }
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            lqlqqll.llqqqll.uu00750075uuu(llll006Cll, "No such field {} in class {}", str, cls.getName());
            return null;
        }
    }

    @Nullable
    public static Class www00770077007700770077(@Nonnull jxxjxjx jxxjxjxVar) {
        try {
            return Class.forName(jxxjxjxVar.l006Cll006Cll);
        } catch (Throwable unused) {
            lqlqqll.llqqqll.u0075u0075uuu(llll006Cll, "No such class {}", jxxjxjxVar);
            return null;
        }
    }
}
