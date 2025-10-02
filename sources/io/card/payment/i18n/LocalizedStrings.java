package io.card.payment.i18n;

import YU.a;
import android.util.Log;
import io.card.payment.i18n.locales.LocalizedStringsList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class LocalizedStrings {

    /* renamed from: a, reason: collision with root package name */
    public static final I18nManager f23883a;

    static {
        ArrayList arrayList = LocalizedStringsList.f23898a;
        I18nManager i18nManager = new I18nManager();
        i18nManager.f23882a = new LinkedHashMap();
        i18nManager.c = StringKey.class;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            SupportedLocale supportedLocale = (SupportedLocale) it.next();
            LinkedHashMap linkedHashMap = i18nManager.f23882a;
            String name = supportedLocale.getName();
            if (linkedHashMap.containsKey(name)) {
                throw new RuntimeException(a.h("Locale ", name, " already added"));
            }
            linkedHashMap.put(name, supportedLocale);
            SupportedLocale supportedLocale2 = (SupportedLocale) linkedHashMap.get(name);
            ArrayList arrayList2 = new ArrayList();
            for (Enum r9 : (Enum[]) i18nManager.c.getEnumConstants()) {
                String str = "[" + name + "," + r9 + "]";
                if (supportedLocale2.a(r9, null) == null) {
                    arrayList2.add("Missing " + str);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Log.i("I18nManager", (String) it2.next());
            }
        }
        i18nManager.d(null);
        f23883a = i18nManager;
    }

    public static String a(StringKey stringKey) {
        I18nManager i18nManager = f23883a;
        return i18nManager.b(stringKey, i18nManager.b);
    }

    public static String b(StringKey stringKey, String str) {
        I18nManager i18nManager = f23883a;
        return i18nManager.b(stringKey, i18nManager.a(str));
    }
}
