package androidx.paging;

import android.os.Handler;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "loadState", "Landroidx/paging/CombinedLoadStates;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class AsyncPagingDataDiffer$internalLoadStateListener$1 extends Lambda implements Function1<CombinedLoadStates, Unit> {
    public final /* synthetic */ AsyncPagingDataDiffer h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncPagingDataDiffer$internalLoadStateListener$1(AsyncPagingDataDiffer asyncPagingDataDiffer) {
        super(1);
        this.h = asyncPagingDataDiffer;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CombinedLoadStates loadState = (CombinedLoadStates) obj;
        Intrinsics.h(loadState, "loadState");
        AsyncPagingDataDiffer asyncPagingDataDiffer = this.h;
        if (((Boolean) asyncPagingDataDiffer.d.getValue()).booleanValue()) {
            Handler handler = (Handler) asyncPagingDataDiffer.n.getD();
            AsyncPagingDataDiffer$LoadStateListenerRunnable$1 asyncPagingDataDiffer$LoadStateListenerRunnable$1 = asyncPagingDataDiffer.o;
            handler.removeCallbacks(asyncPagingDataDiffer$LoadStateListenerRunnable$1);
            asyncPagingDataDiffer$LoadStateListenerRunnable$1.d.set(loadState);
            handler.post(asyncPagingDataDiffer$LoadStateListenerRunnable$1);
        } else {
            Iterator it = asyncPagingDataDiffer.l.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(loadState);
            }
        }
        return Unit.f24250a;
    }
}
