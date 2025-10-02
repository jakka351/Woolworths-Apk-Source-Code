package androidx.paging;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Landroidx/paging/PagingDataEvent;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Append", "DropAppend", "DropPrepend", "Prepend", "Refresh", "Landroidx/paging/PagingDataEvent$Append;", "Landroidx/paging/PagingDataEvent$DropAppend;", "Landroidx/paging/PagingDataEvent$DropPrepend;", "Landroidx/paging/PagingDataEvent$Prepend;", "Landroidx/paging/PagingDataEvent$Refresh;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class PagingDataEvent<T> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/PagingDataEvent$Append;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/paging/PagingDataEvent;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Append<T> extends PagingDataEvent<T> {

        /* renamed from: a, reason: collision with root package name */
        public final int f3574a;
        public final ArrayList b;
        public final int c;
        public final int d;

        public Append(int i, ArrayList arrayList, int i2, int i3) {
            this.f3574a = i;
            this.b = arrayList;
            this.c = i2;
            this.d = i3;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Append)) {
                return false;
            }
            Append append = (Append) obj;
            return this.f3574a == append.f3574a && this.b.equals(append.b) && this.c == append.c && this.d == append.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + Integer.hashCode(this.c) + this.b.hashCode() + Integer.hashCode(this.f3574a);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PagingDataEvent.Append loaded ");
            ArrayList arrayList = this.b;
            sb.append(arrayList.size());
            sb.append(" items (\n                    |   startIndex: ");
            sb.append(this.f3574a);
            sb.append("\n                    |   first item: ");
            sb.append(CollectionsKt.F(arrayList));
            sb.append("\n                    |   last item: ");
            sb.append(CollectionsKt.P(arrayList));
            sb.append("\n                    |   newPlaceholdersBefore: ");
            sb.append(this.c);
            sb.append("\n                    |   oldPlaceholdersBefore: ");
            sb.append(this.d);
            sb.append("\n                    |)\n                    |");
            return StringsKt.n0(sb.toString());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/PagingDataEvent$DropAppend;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/paging/PagingDataEvent;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DropAppend<T> extends PagingDataEvent<T> {

        /* renamed from: a, reason: collision with root package name */
        public final int f3575a;
        public final int b;
        public final int c;
        public final int d;

        public DropAppend(int i, int i2, int i3, int i4) {
            this.f3575a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof DropAppend)) {
                return false;
            }
            DropAppend dropAppend = (DropAppend) obj;
            return this.f3575a == dropAppend.f3575a && this.b == dropAppend.b && this.c == dropAppend.c && this.d == dropAppend.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + Integer.hashCode(this.c) + Integer.hashCode(this.b) + Integer.hashCode(this.f3575a);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PagingDataEvent.DropAppend dropped ");
            int i = this.b;
            sb.append(i);
            sb.append(" items (\n                    |   startIndex: ");
            YU.a.w(this.f3575a, i, "\n                    |   dropCount: ", "\n                    |   newPlaceholdersBefore: ", sb);
            sb.append(this.c);
            sb.append("\n                    |   oldPlaceholdersBefore: ");
            sb.append(this.d);
            sb.append("\n                    |)\n                    |");
            return StringsKt.n0(sb.toString());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/PagingDataEvent$DropPrepend;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/paging/PagingDataEvent;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DropPrepend<T> extends PagingDataEvent<T> {

        /* renamed from: a, reason: collision with root package name */
        public final int f3576a;
        public final int b;
        public final int c;

        public DropPrepend(int i, int i2, int i3) {
            this.f3576a = i;
            this.b = i2;
            this.c = i3;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof DropPrepend)) {
                return false;
            }
            DropPrepend dropPrepend = (DropPrepend) obj;
            return this.f3576a == dropPrepend.f3576a && this.b == dropPrepend.b && this.c == dropPrepend.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + Integer.hashCode(this.b) + Integer.hashCode(this.f3576a);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PagingDataEvent.DropPrepend dropped ");
            int i = this.f3576a;
            YU.a.w(i, i, " items (\n                    |   dropCount: ", "\n                    |   newPlaceholdersBefore: ", sb);
            sb.append(this.b);
            sb.append("\n                    |   oldPlaceholdersBefore: ");
            sb.append(this.c);
            sb.append("\n                    |)\n                    |");
            return StringsKt.n0(sb.toString());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/PagingDataEvent$Prepend;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/paging/PagingDataEvent;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Prepend<T> extends PagingDataEvent<T> {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f3577a;
        public final int b;
        public final int c;

        public Prepend(int i, int i2, ArrayList arrayList) {
            this.f3577a = arrayList;
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Prepend)) {
                return false;
            }
            Prepend prepend = (Prepend) obj;
            return this.f3577a.equals(prepend.f3577a) && this.b == prepend.b && this.c == prepend.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + Integer.hashCode(this.b) + this.f3577a.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PagingDataEvent.Prepend loaded ");
            ArrayList arrayList = this.f3577a;
            sb.append(arrayList.size());
            sb.append(" items (\n                    |   first item: ");
            sb.append(CollectionsKt.F(arrayList));
            sb.append("\n                    |   last item: ");
            sb.append(CollectionsKt.P(arrayList));
            sb.append("\n                    |   newPlaceholdersBefore: ");
            sb.append(this.b);
            sb.append("\n                    |   oldPlaceholdersBefore: ");
            sb.append(this.c);
            sb.append("\n                    |)\n                    |");
            return StringsKt.n0(sb.toString());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/PagingDataEvent$Refresh;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/paging/PagingDataEvent;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Refresh<T> extends PagingDataEvent<T> {

        /* renamed from: a, reason: collision with root package name */
        public final PageStore f3578a;
        public final PlaceholderPaddedList b;

        public Refresh(PageStore pageStore, PlaceholderPaddedList previousList) {
            Intrinsics.h(previousList, "previousList");
            this.f3578a = pageStore;
            this.b = previousList;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Refresh)) {
                return false;
            }
            PageStore pageStore = this.f3578a;
            int i = pageStore.f;
            Refresh refresh = (Refresh) obj;
            PlaceholderPaddedList placeholderPaddedList = refresh.b;
            PageStore pageStore2 = refresh.f3578a;
            if (i != pageStore2.f || pageStore.g != pageStore2.g || pageStore.getSize() != pageStore2.getSize() || pageStore.e != pageStore2.e) {
                return false;
            }
            PlaceholderPaddedList placeholderPaddedList2 = this.b;
            return placeholderPaddedList2.getF() == placeholderPaddedList.getF() && placeholderPaddedList2.getG() == placeholderPaddedList.getG() && placeholderPaddedList2.getSize() == placeholderPaddedList.getSize() && placeholderPaddedList2.getE() == placeholderPaddedList.getE();
        }

        public final int hashCode() {
            return this.b.hashCode() + this.f3578a.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PagingDataEvent.Refresh loaded newList\n                    |   newList (\n                    |       placeholdersBefore: ");
            PageStore pageStore = this.f3578a;
            sb.append(pageStore.f);
            sb.append("\n                    |       placeholdersAfter: ");
            sb.append(pageStore.g);
            sb.append("\n                    |       size: ");
            sb.append(pageStore.getSize());
            sb.append("\n                    |       dataCount: ");
            sb.append(pageStore.e);
            sb.append("\n                    |   )\n                    |   previousList (\n                    |       placeholdersBefore: ");
            PlaceholderPaddedList placeholderPaddedList = this.b;
            sb.append(placeholderPaddedList.getF());
            sb.append("\n                    |       placeholdersAfter: ");
            sb.append(placeholderPaddedList.getG());
            sb.append("\n                    |       size: ");
            sb.append(placeholderPaddedList.getSize());
            sb.append("\n                    |       dataCount: ");
            sb.append(placeholderPaddedList.getE());
            sb.append("\n                    |   )\n                    |");
            return StringsKt.n0(sb.toString());
        }
    }
}
