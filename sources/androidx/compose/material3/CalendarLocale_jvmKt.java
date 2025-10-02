package androidx.compose.material3;

import io.jsonwebtoken.JwtParser;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\n\u0010\u0001\"\u00020\u00002\u00020\u0000¨\u0006\u0002"}, d2 = {"Ljava/util/Locale;", "CalendarLocale", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CalendarLocale_jvmKt {

    /* renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f1405a = new WeakHashMap();

    public static String a(int i, int i2) {
        int i3 = (i2 & 1) == 0 ? 2 : 1;
        String str = i3 + JwtParser.SEPARATOR_CHAR + 40 + JwtParser.SEPARATOR_CHAR + false + JwtParser.SEPARATOR_CHAR + Locale.getDefault().toLanguageTag();
        WeakHashMap weakHashMap = f1405a;
        Object obj = weakHashMap.get(str);
        Object obj2 = obj;
        if (obj == null) {
            NumberFormat integerInstance = NumberFormat.getIntegerInstance();
            integerInstance.setGroupingUsed(false);
            integerInstance.setMinimumIntegerDigits(i3);
            integerInstance.setMaximumIntegerDigits(40);
            weakHashMap.put(str, integerInstance);
            obj2 = integerInstance;
        }
        return ((NumberFormat) obj2).format(Integer.valueOf(i));
    }
}
