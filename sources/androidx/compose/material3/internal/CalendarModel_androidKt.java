package androidx.compose.material3.internal;

import android.text.format.DateFormat;
import androidx.compose.material3.internal.CalendarModelImpl;
import java.time.ZoneId;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CalendarModel_androidKt {
    public static final String a(long j, String str, Locale locale, LinkedHashMap linkedHashMap) {
        String str2 = "S:" + str + locale.toLanguageTag();
        Object bestDateTimePattern = linkedHashMap.get(str2);
        if (bestDateTimePattern == null) {
            bestDateTimePattern = DateFormat.getBestDateTimePattern(locale, str);
            linkedHashMap.put(str2, bestDateTimePattern);
        }
        String string = bestDateTimePattern.toString();
        ZoneId zoneId = CalendarModelImpl.d;
        return CalendarModelImpl.Companion.a(j, string, locale, linkedHashMap);
    }
}
