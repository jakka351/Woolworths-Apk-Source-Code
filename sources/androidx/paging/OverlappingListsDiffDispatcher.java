package androidx.paging;

import androidx.recyclerview.widget.ListUpdateCallback;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/paging/OverlappingListsDiffDispatcher;", "", "PlaceholderUsingUpdateCallback", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OverlappingListsDiffDispatcher {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/OverlappingListsDiffDispatcher$PlaceholderUsingUpdateCallback;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/recyclerview/widget/ListUpdateCallback;", "Companion", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static final class PlaceholderUsingUpdateCallback<T> implements ListUpdateCallback {
        public final PlaceholderPaddedList d;
        public final PlaceholderPaddedList e;
        public final ListUpdateCallback f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/paging/OverlappingListsDiffDispatcher$PlaceholderUsingUpdateCallback$Companion;", "", "", "UNUSED", "I", "USED_FOR_ADDITION", "USED_FOR_REMOVAL", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
        }

        public PlaceholderUsingUpdateCallback(PlaceholderPaddedList oldList, PlaceholderPaddedList newList, ListUpdateCallback listUpdateCallback) {
            Intrinsics.h(oldList, "oldList");
            Intrinsics.h(newList, "newList");
            this.d = oldList;
            this.e = newList;
            this.f = listUpdateCallback;
            this.g = oldList.d();
            this.h = oldList.g();
            this.i = oldList.b();
            this.j = 1;
            this.k = 1;
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public final void a(int i, int i2, Object obj) {
            this.f.a(i + this.g, i2, obj);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public final void b(int i, int i2) {
            int i3;
            int i4 = i + i2;
            int i5 = this.i;
            DiffingChangePayload diffingChangePayload = DiffingChangePayload.d;
            PlaceholderPaddedList placeholderPaddedList = this.e;
            ListUpdateCallback listUpdateCallback = this.f;
            if (i4 >= i5 && this.k != 3) {
                int iMin = Math.min(placeholderPaddedList.g() - this.h, i2);
                i3 = iMin >= 0 ? iMin : 0;
                int i6 = i2 - i3;
                if (i3 > 0) {
                    this.k = 2;
                    listUpdateCallback.a(this.g + i, i3, diffingChangePayload);
                    this.h += i3;
                }
                if (i6 > 0) {
                    listUpdateCallback.b(i + i3 + this.g, i6);
                }
            } else if (i <= 0 && this.j != 3) {
                int iMin2 = Math.min(placeholderPaddedList.d() - this.g, i2);
                i3 = iMin2 >= 0 ? iMin2 : 0;
                int i7 = i2 - i3;
                if (i7 > 0) {
                    listUpdateCallback.b(this.g, i7);
                }
                if (i3 > 0) {
                    this.j = 2;
                    listUpdateCallback.a(this.g, i3, diffingChangePayload);
                    this.g += i3;
                }
            } else {
                listUpdateCallback.b(i + this.g, i2);
            }
            this.i -= i2;
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public final void c(int i, int i2) {
            int i3 = this.g;
            this.f.c(i + i3, i2 + i3);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public final void d(int i, int i2) {
            int i3 = this.i;
            DiffingChangePayload diffingChangePayload = DiffingChangePayload.e;
            ListUpdateCallback listUpdateCallback = this.f;
            if (i >= i3 && this.k != 2) {
                int iMin = Math.min(i2, this.h);
                if (iMin > 0) {
                    this.k = 3;
                    listUpdateCallback.a(this.g + i, iMin, diffingChangePayload);
                    this.h -= iMin;
                }
                int i4 = i2 - iMin;
                if (i4 > 0) {
                    listUpdateCallback.d(i + iMin + this.g, i4);
                }
            } else if (i <= 0 && this.j != 2) {
                int iMin2 = Math.min(i2, this.g);
                if (iMin2 > 0) {
                    this.j = 3;
                    listUpdateCallback.a((0 - iMin2) + this.g, iMin2, diffingChangePayload);
                    this.g -= iMin2;
                }
                int i5 = i2 - iMin2;
                if (i5 > 0) {
                    listUpdateCallback.d(this.g, i5);
                }
            } else {
                listUpdateCallback.d(i + this.g, i2);
            }
            this.i += i2;
        }
    }
}
