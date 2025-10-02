package androidx.paging;

import androidx.paging.PageEvent;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/PagingData;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Companion", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PagingData<T> {
    public static final PagingData$Companion$NOOP_UI_RECEIVER$1 e = new PagingData$Companion$NOOP_UI_RECEIVER$1();
    public static final PagingData$Companion$NOOP_HINT_RECEIVER$1 f = new PagingData$Companion$NOOP_HINT_RECEIVER$1();

    /* renamed from: a, reason: collision with root package name */
    public final Flow f3573a;
    public final UiReceiver b;
    public final HintReceiver c;
    public final Function0 d;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.paging.PagingData$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function0 {
        public static final AnonymousClass1 h = new AnonymousClass1(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Object invoke() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/PagingData$Companion;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static PagingData a() {
            return new PagingData(new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(new PageEvent.StaticList(EmptyList.d)), PagingData.e, PagingData.f, PagingData$Companion$empty$1.h);
        }
    }

    public PagingData(Flow flow, UiReceiver uiReceiver, HintReceiver hintReceiver, Function0 function0) {
        Intrinsics.h(uiReceiver, "uiReceiver");
        Intrinsics.h(hintReceiver, "hintReceiver");
        this.f3573a = flow;
        this.b = uiReceiver;
        this.c = hintReceiver;
        this.d = function0;
    }
}
