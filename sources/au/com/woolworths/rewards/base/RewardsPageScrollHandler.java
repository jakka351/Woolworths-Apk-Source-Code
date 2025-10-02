package au.com.woolworths.rewards.base;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import au.com.woolworths.rewards.base.RewardsPageScrollManager;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/rewards/base/RewardsPageScrollHandler;", "", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public interface RewardsPageScrollHandler {
    default void P1(Function2 function2) {
        CloseableCoroutineScope closeableCoroutineScopeE2 = e2();
        if (closeableCoroutineScopeE2 != null) {
            BuildersKt.c(closeableCoroutineScopeE2, null, null, new RewardsPageScrollHandler$inViewModelScope$1(function2, null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    default ViewModel P4() {
        if (this instanceof ViewModel) {
            return (ViewModel) this;
        }
        return null;
    }

    default void U1(LocalScrollStatus localScrollStatus) {
        WeakHashMap weakHashMap = LocalScrollStatus.d;
        weakHashMap.put(this, localScrollStatus);
        if (localScrollStatus.f9349a) {
            for (Map.Entry entry : weakHashMap.entrySet()) {
                ((LocalScrollStatus) entry.getValue()).f9349a = Intrinsics.c(entry.getKey(), this);
            }
            LocalScrollStatus localScrollStatus2 = LocalScrollStatus.e;
            LocalScrollStatus.e = localScrollStatus;
            P1(new RewardsPageScrollHandler$localScrollStatus$2(localScrollStatus, localScrollStatus2, this, null));
        }
    }

    default void b3(Function1 function1) {
        LocalScrollStatus localScrollStatusY2 = y2();
        RewardsPageScrollManager.Status status = localScrollStatusY2.b;
        RewardsPageScrollManager.Status status2 = new RewardsPageScrollManager.Status(status.f9351a, status.b, status.c);
        RewardsPageScrollManager.StickyFilter stickyFilter = localScrollStatusY2.c;
        List labels = stickyFilter.f9352a;
        int i = stickyFilter.b;
        Function1 onSelectedIndexChanged = stickyFilter.c;
        Intrinsics.h(labels, "labels");
        Intrinsics.h(onSelectedIndexChanged, "onSelectedIndexChanged");
        LocalScrollStatus localScrollStatus = new LocalScrollStatus(localScrollStatusY2.f9349a, status2, new RewardsPageScrollManager.StickyFilter(i, labels, onSelectedIndexChanged));
        function1.invoke(localScrollStatus);
        U1(localScrollStatus);
    }

    default CloseableCoroutineScope e2() {
        ViewModel viewModelP4 = P4();
        if (viewModelP4 != null) {
            return ViewModelKt.a(viewModelP4);
        }
        return null;
    }

    /* renamed from: n3 */
    RewardsPageScrollManager getV();

    default LocalScrollStatus y2() {
        LocalScrollStatus localScrollStatus = (LocalScrollStatus) LocalScrollStatus.d.get(this);
        return localScrollStatus == null ? new LocalScrollStatus() : localScrollStatus;
    }
}
