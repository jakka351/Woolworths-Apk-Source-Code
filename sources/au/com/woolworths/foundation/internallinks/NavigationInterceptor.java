package au.com.woolworths.foundation.internallinks;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/internallinks/NavigationInterceptor;", "", "Companion", "internallinks_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface NavigationInterceptor {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f8537a = Companion.f8538a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/internallinks/NavigationInterceptor$Companion;", "", "internallinks_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f8538a = new Companion();
        public static final ArrayList b = new ArrayList();

        public static boolean a(Context context, String link) {
            Intrinsics.h(context, "context");
            Intrinsics.h(link, "link");
            ArrayList arrayList = b;
            if (arrayList != null && arrayList.isEmpty()) {
                return false;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((NavigationInterceptor) it.next()).a(context, link)) {
                    return true;
                }
            }
            return false;
        }
    }

    default boolean a(Context context, String link) {
        Intrinsics.h(context, "context");
        Intrinsics.h(link, "link");
        return false;
    }
}
