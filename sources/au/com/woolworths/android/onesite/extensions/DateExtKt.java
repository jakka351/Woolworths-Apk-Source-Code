package au.com.woolworths.android.onesite.extensions;

import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class DateExtKt {
    public static final int a(Date date) {
        if (date == null) {
            return 0;
        }
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date);
        int i = calendar.get(1) - calendar2.get(1);
        return (calendar2.get(2) > calendar.get(2) || (calendar2.get(2) == calendar.get(2) && calendar2.get(5) > calendar.get(5))) ? i - 1 : i;
    }
}
