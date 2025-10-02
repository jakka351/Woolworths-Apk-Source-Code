package au.com.woolworths.compose.utils.list;

import YU.a;
import androidx.compose.runtime.Stable;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/compose/utils/list/LazyListUniqueIdValidator;", "Lau/com/woolworths/compose/utils/list/UniqueIdValidator;", "compose-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LazyListUniqueIdValidator implements UniqueIdValidator {

    /* renamed from: a, reason: collision with root package name */
    public final String f4710a;
    public final ArrayList b;
    public final ArrayList c;

    public LazyListUniqueIdValidator(String screenName) {
        ReportOwner.Squad squad = ReportOwner.Squad.d;
        Intrinsics.h(screenName, "screenName");
        this.f4710a = screenName;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    @Override // au.com.woolworths.compose.utils.list.UniqueIdValidator
    public final String a(String str) {
        if (str != null) {
            ArrayList arrayList = this.b;
            if (!arrayList.contains(str)) {
                arrayList.add(str);
                return str;
            }
            ArrayList arrayList2 = this.c;
            if (!arrayList2.contains(str)) {
                arrayList2.add(str);
                Bark.Companion companion = Bark.f8483a;
                ReportOwner reportOwner = new ReportOwner(ReportOwner.Squad.d);
                StringBuilder sb = new StringBuilder("Duplicate ID on screen:");
                String str2 = this.f4710a;
                sb.append(str2);
                sb.append(" and id=");
                sb.append(str);
                Bark.f8483a.f(reportOwner, sb.toString(), null);
                Timber.f27013a.b(a.i("Duplicate ID on screen:", str2, " and id=", str), new Object[0]);
            }
        }
        return null;
    }
}
