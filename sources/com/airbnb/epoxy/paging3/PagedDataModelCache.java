package com.airbnb.epoxy.paging3;

import android.os.Handler;
import android.os.Looper;
import androidx.paging.AsyncPagingDataDiffer;
import androidx.paging.AsyncPagingDataDiffer$presenter$1;
import androidx.paging.PlaceholderPaddedList;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.android.HandlerDispatcherKt;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/airbnb/epoxy/paging3/PagedDataModelCache;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "epoxy-paging3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class PagedDataModelCache<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f13332a;
    public final Function0 b;
    public final Handler c;
    public final ArrayList d = new ArrayList();
    public Integer e;
    public boolean f;
    public final AsyncPagingDataDiffer g;

    public PagedDataModelCache(Function2 function2, Function0 function0, DiffUtil.ItemCallback itemCallback, Handler handler) {
        this.f13332a = function2;
        this.b = function0;
        this.c = handler;
        PagedDataModelCache$updateCallback$1 pagedDataModelCache$updateCallback$1 = new PagedDataModelCache$updateCallback$1(this);
        int i = HandlerDispatcherKt.f24696a;
        HandlerContext handlerContext = new HandlerContext(handler, null, false);
        this.g = new AsyncPagingDataDiffer(itemCallback, pagedDataModelCache$updateCallback$1, handlerContext, handlerContext);
    }

    public static final void a(PagedDataModelCache pagedDataModelCache) {
        if (!pagedDataModelCache.f && !Intrinsics.c(Looper.myLooper(), pagedDataModelCache.c.getLooper())) {
            throw new IllegalArgumentException("The notify executor for your PagedList must use the same thread as the model building handler set in PagedListEpoxyController.modelBuildingHandler");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(androidx.paging.PagingData r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.airbnb.epoxy.paging3.PagedDataModelCache$submitData$1
            if (r0 == 0) goto L13
            r0 = r7
            com.airbnb.epoxy.paging3.PagedDataModelCache$submitData$1 r0 = (com.airbnb.epoxy.paging3.PagedDataModelCache$submitData$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            com.airbnb.epoxy.paging3.PagedDataModelCache$submitData$1 r0 = new com.airbnb.epoxy.paging3.PagedDataModelCache$submitData$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            kotlin.Unit r3 = kotlin.Unit.f24250a
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            com.airbnb.epoxy.paging3.PagedDataModelCache r6 = r0.p
            kotlin.ResultKt.b(r7)
            goto L51
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.ResultKt.b(r7)
            r5.f = r4
            r0.p = r5
            r0.s = r4
            androidx.paging.AsyncPagingDataDiffer r7 = r5.g
            java.util.concurrent.atomic.AtomicInteger r2 = r7.h
            r2.incrementAndGet()
            androidx.paging.AsyncPagingDataDiffer$presenter$1 r7 = r7.g
            java.lang.Object r6 = r7.b(r6, r0)
            if (r6 != r1) goto L4c
            goto L4d
        L4c:
            r6 = r3
        L4d:
            if (r6 != r1) goto L50
            return r1
        L50:
            r6 = r5
        L51:
            r7 = 0
            r6.f = r7
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.paging3.PagedDataModelCache.b(androidx.paging.PagingData, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void c(int i) {
        Object value;
        Object value2;
        Object value3;
        AsyncPagingDataDiffer asyncPagingDataDiffer = this.g;
        AtomicReference atomicReference = asyncPagingDataDiffer.f;
        AtomicReference atomicReference2 = asyncPagingDataDiffer.f;
        AsyncPagingDataDiffer$presenter$1 asyncPagingDataDiffer$presenter$1 = asyncPagingDataDiffer.g;
        PlaceholderPaddedList placeholderPaddedList = (PlaceholderPaddedList) atomicReference.get();
        if ((placeholderPaddedList != null ? placeholderPaddedList.getSize() : asyncPagingDataDiffer$presenter$1.d.getSize()) > 0) {
            int iC = RangesKt.c(i, 0, (((PlaceholderPaddedList) atomicReference2.get()) != null ? r1.getSize() : asyncPagingDataDiffer$presenter$1.d.getSize()) - 1);
            MutableStateFlow mutableStateFlow = asyncPagingDataDiffer.d;
            do {
                try {
                    value2 = mutableStateFlow.getValue();
                    ((Boolean) value2).getClass();
                } catch (Throwable th) {
                    do {
                        value = mutableStateFlow.getValue();
                        ((Boolean) value).getClass();
                    } while (!mutableStateFlow.d(value, Boolean.FALSE));
                    throw th;
                }
            } while (!mutableStateFlow.d(value2, Boolean.TRUE));
            asyncPagingDataDiffer.e = iC;
            PlaceholderPaddedList placeholderPaddedList2 = (PlaceholderPaddedList) atomicReference2.get();
            if (placeholderPaddedList2 == null) {
                asyncPagingDataDiffer$presenter$1.c(iC);
            } else {
                if (iC < 0 || iC >= placeholderPaddedList2.getSize()) {
                    StringBuilder sbR = YU.a.r(iC, "Index: ", ", Size: ");
                    sbR.append(placeholderPaddedList2.getSize());
                    throw new IndexOutOfBoundsException(sbR.toString());
                }
                int f = iC - placeholderPaddedList2.getF();
                if (f >= 0 && f < placeholderPaddedList2.getE()) {
                    placeholderPaddedList2.getItem(f);
                }
            }
            do {
                value3 = mutableStateFlow.getValue();
                ((Boolean) value3).getClass();
            } while (!mutableStateFlow.d(value3, Boolean.FALSE));
        }
    }
}
