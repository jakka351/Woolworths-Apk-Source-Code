package androidx.paging;

import androidx.paging.PageEvent;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/PagingDataPresenter;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "InitialUiReceiver", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class PagingDataPresenter<T> {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f3579a;
    public HintReceiver b;
    public UiReceiver c;
    public PageStore d;
    public final MutableCombinedLoadStateCollection e;
    public final CopyOnWriteArrayList f;
    public final SingleRunner g;
    public volatile boolean h;
    public volatile int i;
    public final MutableStateFlow j;
    public final StateFlow k;
    public final SharedFlowImpl l;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/PagingDataPresenter$InitialUiReceiver;", "Landroidx/paging/UiReceiver;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class InitialUiReceiver implements UiReceiver {

        /* renamed from: a, reason: collision with root package name */
        public boolean f3580a;
        public boolean b;

        @Override // androidx.paging.UiReceiver
        public final void g() {
            this.f3580a = true;
        }

        @Override // androidx.paging.UiReceiver
        public final void h() {
            this.b = true;
        }
    }

    public PagingDataPresenter(CoroutineContext mainContext, PagingData pagingData) {
        PageStore pageStore;
        PageEvent.Insert insert;
        Intrinsics.h(mainContext, "mainContext");
        this.f3579a = mainContext;
        this.c = new InitialUiReceiver();
        PageStore pageStore2 = PageStore.h;
        PageEvent.Insert insert2 = pagingData != null ? (PageEvent.Insert) pagingData.d.invoke() : null;
        if (insert2 != null) {
            pageStore = new PageStore(insert2);
        } else {
            pageStore = PageStore.h;
            Intrinsics.f(pageStore, "null cannot be cast to non-null type androidx.paging.PageStore<T of androidx.paging.PageStore.Companion.initial>");
        }
        this.d = pageStore;
        MutableCombinedLoadStateCollection mutableCombinedLoadStateCollection = new MutableCombinedLoadStateCollection();
        if (pagingData != null && (insert = (PageEvent.Insert) pagingData.d.invoke()) != null) {
            mutableCombinedLoadStateCollection.d(insert.e, insert.f);
        }
        this.e = mutableCombinedLoadStateCollection;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f = copyOnWriteArrayList;
        this.g = new SingleRunner(true);
        this.j = StateFlowKt.a(Boolean.FALSE);
        this.k = mutableCombinedLoadStateCollection.c;
        this.l = SharedFlowKt.a(0, 64, BufferOverflow.e);
        copyOnWriteArrayList.add(new Function0<Unit>() { // from class: androidx.paging.PagingDataPresenter.1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SharedFlowImpl sharedFlowImpl = PagingDataPresenter.this.l;
                Unit unit = Unit.f24250a;
                sharedFlowImpl.f(unit);
                return unit;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.paging.PagingDataPresenter r5, java.util.List r6, int r7, int r8, boolean r9, androidx.paging.LoadStates r10, androidx.paging.LoadStates r11, androidx.paging.HintReceiver r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PagingDataPresenter.a(androidx.paging.PagingDataPresenter, java.util.List, int, int, boolean, androidx.paging.LoadStates, androidx.paging.LoadStates, androidx.paging.HintReceiver, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object b(PagingData pagingData, ContinuationImpl continuationImpl) {
        Object objA = this.g.a(0, new PagingDataPresenter$collectFrom$2(this, pagingData, null), continuationImpl);
        return objA == CoroutineSingletons.d ? objA : Unit.f24250a;
    }

    public final Object c(int i) {
        Object value;
        Object value2;
        MutableStateFlow mutableStateFlow = this.j;
        do {
            value = mutableStateFlow.getValue();
            ((Boolean) value).getClass();
        } while (!mutableStateFlow.d(value, Boolean.TRUE));
        this.h = true;
        this.i = i;
        if (PagingLogger.a(2)) {
            PagingLogger.b(2, "Accessing item index[" + i + ']');
        }
        HintReceiver hintReceiver = this.b;
        if (hintReceiver != null) {
            hintReceiver.a(this.d.a(i));
        }
        PageStore pageStore = this.d;
        if (i < 0) {
            pageStore.getClass();
        } else if (i < pageStore.getSize()) {
            int i2 = i - pageStore.f;
            Object item = (i2 < 0 || i2 >= pageStore.e) ? null : pageStore.getItem(i2);
            MutableStateFlow mutableStateFlow2 = this.j;
            do {
                value2 = mutableStateFlow2.getValue();
                ((Boolean) value2).getClass();
            } while (!mutableStateFlow2.d(value2, Boolean.FALSE));
            return item;
        }
        StringBuilder sbR = YU.a.r(i, "Index: ", ", Size: ");
        sbR.append(pageStore.getSize());
        throw new IndexOutOfBoundsException(sbR.toString());
    }

    public abstract Object d(PagingDataEvent pagingDataEvent, ContinuationImpl continuationImpl);

    public final ItemSnapshotList e() {
        PageStore pageStore = this.d;
        int i = pageStore.f;
        int i2 = pageStore.g;
        ArrayList arrayList = pageStore.d;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CollectionsKt.h(((TransformablePage) it.next()).b, arrayList2);
        }
        return new ItemSnapshotList(i, i2, arrayList2);
    }
}
