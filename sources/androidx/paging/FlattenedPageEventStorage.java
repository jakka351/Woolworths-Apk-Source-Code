package androidx.paging;

import androidx.annotation.VisibleForTesting;
import androidx.paging.LoadState;
import androidx.paging.PageEvent;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntProgressionIterator;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/paging/FlattenedPageEventStorage;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@VisibleForTesting
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class FlattenedPageEventStorage<T> {

    /* renamed from: a, reason: collision with root package name */
    public int f3535a;
    public int b;
    public final ArrayDeque c = new ArrayDeque();
    public final MutableLoadStateCollection d = new MutableLoadStateCollection();
    public LoadStates e;
    public boolean f;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public final void a(PageEvent event) {
        Intrinsics.h(event, "event");
        this.f = true;
        boolean z = event instanceof PageEvent.Insert;
        int i = 0;
        ArrayDeque arrayDeque = this.c;
        MutableLoadStateCollection mutableLoadStateCollection = this.d;
        if (z) {
            PageEvent.Insert insert = (PageEvent.Insert) event;
            LoadStates loadStates = insert.e;
            int i2 = insert.c;
            int i3 = insert.d;
            List list = insert.b;
            mutableLoadStateCollection.b(loadStates);
            this.e = insert.f;
            int iOrdinal = insert.f3552a.ordinal();
            if (iOrdinal == 0) {
                arrayDeque.clear();
                this.b = i3;
                this.f3535a = i2;
                arrayDeque.addAll(list);
                return;
            }
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    return;
                }
                this.b = i3;
                arrayDeque.addAll(list);
                return;
            }
            this.f3535a = i2;
            IntProgressionIterator it = new IntProgression(list.size() - 1, 0, -1).iterator();
            while (it.f) {
                arrayDeque.addFirst(list.get(it.nextInt()));
            }
            return;
        }
        if (!(event instanceof PageEvent.Drop)) {
            if (event instanceof PageEvent.LoadStateUpdate) {
                PageEvent.LoadStateUpdate loadStateUpdate = (PageEvent.LoadStateUpdate) event;
                mutableLoadStateCollection.b(loadStateUpdate.f3553a);
                this.e = loadStateUpdate.b;
                return;
            } else {
                if (event instanceof PageEvent.StaticList) {
                    arrayDeque.clear();
                    this.b = 0;
                    this.f3535a = 0;
                    arrayDeque.addLast(new TransformablePage(0, ((PageEvent.StaticList) event).f3554a));
                    return;
                }
                return;
            }
        }
        PageEvent.Drop drop = (PageEvent.Drop) event;
        LoadType loadType = drop.f3551a;
        int i4 = drop.d;
        mutableLoadStateCollection.c(loadType, LoadState.NotLoading.c);
        int iOrdinal2 = loadType.ordinal();
        if (iOrdinal2 == 1) {
            this.f3535a = i4;
            int iB = drop.b();
            while (i < iB) {
                arrayDeque.removeFirst();
                i++;
            }
            return;
        }
        if (iOrdinal2 != 2) {
            throw new IllegalArgumentException("Page drop type must be prepend or append");
        }
        this.b = i4;
        int iB2 = drop.b();
        while (i < iB2) {
            arrayDeque.removeLast();
            i++;
        }
    }

    public final List b() {
        if (!this.f) {
            return EmptyList.d;
        }
        ArrayList arrayList = new ArrayList();
        LoadStates loadStatesD = this.d.d();
        ArrayDeque arrayDeque = this.c;
        if (arrayDeque.isEmpty()) {
            arrayList.add(new PageEvent.LoadStateUpdate(loadStatesD, this.e));
            return arrayList;
        }
        PageEvent.Insert insert = PageEvent.Insert.g;
        arrayList.add(PageEvent.Insert.Companion.a(CollectionsKt.G0(arrayDeque), this.f3535a, this.b, loadStatesD, this.e));
        return arrayList;
    }
}
