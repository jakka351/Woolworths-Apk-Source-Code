package io.card.payment.i18n;

import YU.a;
import android.util.Log;
import java.lang.Enum;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes7.dex */
public class I18nManager<E extends Enum<?>> {
    public static final HashMap d;

    /* renamed from: a, reason: collision with root package name */
    public LinkedHashMap f23882a;
    public SupportedLocale b;
    public Class c;

    static {
        HashMap map = new HashMap();
        d = map;
        HashSet hashSet = new HashSet();
        map.put("zh_CN", "zh-Hans");
        map.put("zh_TW", "zh-Hant_TW");
        map.put("zh_HK", "zh-Hant");
        map.put("en_UK", "en_GB");
        map.put("en_IE", "en_GB");
        map.put("iw_IL", "he");
        map.put("no", "nb");
        hashSet.add("he");
        hashSet.add("ar");
    }

    public final SupportedLocale a(String str) {
        SupportedLocale supportedLocaleC = str != null ? c(str) : null;
        if (supportedLocaleC == null) {
            String string = Locale.getDefault().toString();
            Log.d("I18nManager", str + " not found.  Attempting to look for " + string);
            supportedLocaleC = c(string);
        }
        if (supportedLocaleC != null) {
            return supportedLocaleC;
        }
        Log.d("I18nManager", "defaulting to english");
        return (SupportedLocale) this.f23882a.get("en");
    }

    public final String b(StringKey stringKey, SupportedLocale supportedLocale) {
        String upperCase = Locale.getDefault().getCountry().toUpperCase(Locale.US);
        String strA = supportedLocale.a(stringKey, upperCase);
        if (strA == null) {
            Log.i("I18nManager", "Missing localized string for [" + this.b.getName() + ",Key." + stringKey.toString() + "]");
            strA = ((SupportedLocale) this.f23882a.get("en")).a(stringKey, upperCase);
        }
        if (strA != null) {
            return strA;
        }
        Log.i("I18nManager", "Missing localized string for [en,Key." + stringKey.toString() + "], so defaulting to keyname");
        return stringKey.toString();
    }

    public final SupportedLocale c(String str) {
        String string;
        LinkedHashMap linkedHashMap = this.f23882a;
        SupportedLocale supportedLocale = null;
        if (str != null && str.length() >= 2) {
            HashMap map = d;
            if (map.containsKey(str)) {
                String str2 = (String) map.get(str);
                SupportedLocale supportedLocale2 = (SupportedLocale) linkedHashMap.get(str2);
                Log.d("I18nManager", "Overriding locale specifier " + str + " with " + str2);
                supportedLocale = supportedLocale2;
            }
            if (supportedLocale == null) {
                if (str.contains("_")) {
                    string = str;
                } else {
                    StringBuilder sbT = a.t(str, "_");
                    sbT.append(Locale.getDefault().getCountry());
                    string = sbT.toString();
                }
                supportedLocale = (SupportedLocale) linkedHashMap.get(string);
            }
            if (supportedLocale == null) {
                supportedLocale = (SupportedLocale) linkedHashMap.get(str);
            }
            if (supportedLocale == null) {
                return (SupportedLocale) linkedHashMap.get(str.substring(0, 2));
            }
        }
        return supportedLocale;
    }

    public final void d(String str) {
        this.b = null;
        SupportedLocale supportedLocaleA = a(str);
        this.b = supportedLocaleA;
        Log.d("I18nManager", "setting locale to:".concat(supportedLocaleA.getName()));
    }
}
