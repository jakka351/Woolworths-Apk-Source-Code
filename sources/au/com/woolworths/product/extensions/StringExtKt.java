package au.com.woolworths.product.extensions;

import YU.a;
import au.com.woolworths.product.details.d;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lllqqql;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StringExtKt {
    public static final String a(String str) {
        if (str == null) {
            return null;
        }
        Map mapJ = MapsKt.j(new Pair("kg", "kilogram"), new Pair("mg", "milligram"), new Pair("ml", "milliliter"), new Pair("l", "liter"), new Pair("g", "gram"), new Pair("ea", ""));
        String strQ = StringsKt.Q(str, "per 1ea", "each", true);
        String strH = a.h("([\\d]+)(", CollectionsKt.M(mapJ.keySet(), lllqqql.c0063ccc0063c, null, null, null, 62), ")");
        RegexOption regexOption = RegexOption.e;
        return new Regex(strH, 0).h(strQ, new d(mapJ, 1));
    }
}
