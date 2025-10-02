package io.card.payment.i18n.locales;

import com.google.android.gms.common.api.internal.a;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lllqqql;
import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class LocalizedStringsSV implements SupportedLocale<StringKey> {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f23906a = new HashMap();
    public static final HashMap b = new HashMap();

    @Override // io.card.payment.i18n.SupportedLocale
    public final String a(Enum r3, String str) {
        StringKey stringKey = (StringKey) r3;
        String strH = a.h(stringKey, new StringBuilder(), lllqqql.c0063ccc0063c, str);
        HashMap map = b;
        return map.containsKey(strH) ? (String) map.get(strH) : (String) f23906a.get(stringKey);
    }

    @Override // io.card.payment.i18n.SupportedLocale
    public final String getName() {
        return "sv";
    }
}
