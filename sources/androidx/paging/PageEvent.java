package androidx.paging;

import androidx.paging.LoadState;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Landroidx/paging/PageEvent;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Drop", "Insert", "LoadStateUpdate", "StaticList", "Landroidx/paging/PageEvent$Drop;", "Landroidx/paging/PageEvent$Insert;", "Landroidx/paging/PageEvent$LoadStateUpdate;", "Landroidx/paging/PageEvent$StaticList;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class PageEvent<T> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/PageEvent$Drop;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/paging/PageEvent;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Drop<T> extends PageEvent<T> {

        /* renamed from: a, reason: collision with root package name */
        public final LoadType f3551a;
        public final int b;
        public final int c;
        public final int d;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[LoadType.values().length];
                try {
                    iArr[2] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        public Drop(LoadType loadType, int i, int i2, int i3) {
            Intrinsics.h(loadType, "loadType");
            this.f3551a = loadType;
            this.b = i;
            this.c = i2;
            this.d = i3;
            if (loadType == LoadType.d) {
                throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND");
            }
            if (b() > 0) {
                if (i3 < 0) {
                    throw new IllegalArgumentException(YU.a.d(i3, "Invalid placeholdersRemaining ").toString());
                }
            } else {
                throw new IllegalArgumentException(("Drop count must be > 0, but was " + b()).toString());
            }
        }

        public final int b() {
            return (this.c - this.b) + 1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Drop)) {
                return false;
            }
            Drop drop = (Drop) obj;
            return this.f3551a == drop.f3551a && this.b == drop.b && this.c == drop.c && this.d == drop.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + androidx.camera.core.impl.b.a(this.c, androidx.camera.core.impl.b.a(this.b, this.f3551a.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            String str;
            int iOrdinal = this.f3551a.ordinal();
            if (iOrdinal == 1) {
                str = "front";
            } else {
                if (iOrdinal != 2) {
                    throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND");
                }
                str = "end";
            }
            StringBuilder sbU = YU.a.u("PageEvent.Drop from the ", str, " (\n                    |   minPageOffset: ");
            sbU.append(this.b);
            sbU.append("\n                    |   maxPageOffset: ");
            sbU.append(this.c);
            sbU.append("\n                    |   placeholdersRemaining: ");
            sbU.append(this.d);
            sbU.append("\n                    |)");
            return StringsKt.n0(sbU.toString());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/paging/PageEvent$Insert;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/paging/PageEvent;", "Companion", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Insert<T> extends PageEvent<T> {
        public static final Insert g;

        /* renamed from: a, reason: collision with root package name */
        public final LoadType f3552a;
        public final List b;
        public final int c;
        public final int d;
        public final LoadStates e;
        public final LoadStates f;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/PageEvent$Insert$Companion;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public static Insert a(List list, int i, int i2, LoadStates sourceLoadStates, LoadStates loadStates) {
                Intrinsics.h(sourceLoadStates, "sourceLoadStates");
                return new Insert(LoadType.d, list, i, i2, sourceLoadStates, loadStates);
            }
        }

        static {
            List listQ = CollectionsKt.Q(TransformablePage.e);
            LoadState.NotLoading notLoading = LoadState.NotLoading.c;
            LoadState.NotLoading notLoading2 = LoadState.NotLoading.b;
            g = Companion.a(listQ, 0, 0, new LoadStates(notLoading, notLoading2, notLoading2), null);
        }

        public Insert(LoadType loadType, List list, int i, int i2, LoadStates loadStates, LoadStates loadStates2) {
            this.f3552a = loadType;
            this.b = list;
            this.c = i;
            this.d = i2;
            this.e = loadStates;
            this.f = loadStates2;
            if (loadType != LoadType.f && i < 0) {
                throw new IllegalArgumentException(YU.a.d(i, "Prepend insert defining placeholdersBefore must be > 0, but was ").toString());
            }
            if (loadType != LoadType.e && i2 < 0) {
                throw new IllegalArgumentException(YU.a.d(i2, "Append insert defining placeholdersAfter must be > 0, but was ").toString());
            }
            if (loadType == LoadType.d && list.isEmpty()) {
                throw new IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0103  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
        /* JADX WARN: Type inference failed for: r13v9, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r7v10, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r9v9, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0089 -> B:18:0x00a8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00de -> B:24:0x00e5). Please report as a decompilation issue!!! */
        @Override // androidx.paging.PageEvent
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(kotlin.jvm.functions.Function2 r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
            /*
                Method dump skipped, instructions count: 276
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageEvent.Insert.a(kotlin.jvm.functions.Function2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Insert)) {
                return false;
            }
            Insert insert = (Insert) obj;
            return this.f3552a == insert.f3552a && Intrinsics.c(this.b, insert.b) && this.c == insert.c && this.d == insert.d && Intrinsics.c(this.e, insert.e) && Intrinsics.c(this.f, insert.f);
        }

        public final int hashCode() {
            int iHashCode = (this.e.hashCode() + androidx.camera.core.impl.b.a(this.d, androidx.camera.core.impl.b.a(this.c, androidx.camera.core.impl.b.d(this.f3552a.hashCode() * 31, 31, this.b), 31), 31)) * 31;
            LoadStates loadStates = this.f;
            return iHashCode + (loadStates == null ? 0 : loadStates.hashCode());
        }

        public final String toString() {
            List list;
            List list2;
            List list3 = this.b;
            Iterator<T> it = list3.iterator();
            int size = 0;
            while (it.hasNext()) {
                size += ((TransformablePage) it.next()).b.size();
            }
            String strValueOf = DevicePublicKeyStringDef.NONE;
            int i = this.c;
            String strValueOf2 = i != -1 ? String.valueOf(i) : DevicePublicKeyStringDef.NONE;
            int i2 = this.d;
            if (i2 != -1) {
                strValueOf = String.valueOf(i2);
            }
            StringBuilder sb = new StringBuilder("PageEvent.Insert for ");
            sb.append(this.f3552a);
            sb.append(", with ");
            sb.append(size);
            sb.append(" items (\n                    |   first item: ");
            TransformablePage transformablePage = (TransformablePage) CollectionsKt.F(list3);
            Object objP = null;
            sb.append((transformablePage == null || (list2 = transformablePage.b) == null) ? null : CollectionsKt.F(list2));
            sb.append("\n                    |   last item: ");
            TransformablePage transformablePage2 = (TransformablePage) CollectionsKt.P(list3);
            if (transformablePage2 != null && (list = transformablePage2.b) != null) {
                objP = CollectionsKt.P(list);
            }
            sb.append(objP);
            sb.append("\n                    |   placeholdersBefore: ");
            sb.append(strValueOf2);
            sb.append("\n                    |   placeholdersAfter: ");
            sb.append(strValueOf);
            sb.append("\n                    |   sourceLoadStates: ");
            sb.append(this.e);
            sb.append("\n                    ");
            String string = sb.toString();
            LoadStates loadStates = this.f;
            if (loadStates != null) {
                string = string + "|   mediatorLoadStates: " + loadStates + '\n';
            }
            return StringsKt.n0(string + "|)");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/PageEvent$LoadStateUpdate;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/paging/PageEvent;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static final /* data */ class LoadStateUpdate<T> extends PageEvent<T> {

        /* renamed from: a, reason: collision with root package name */
        public final LoadStates f3553a;
        public final LoadStates b;

        public LoadStateUpdate(LoadStates loadStates, LoadStates loadStates2) {
            this.f3553a = loadStates;
            this.b = loadStates2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadStateUpdate)) {
                return false;
            }
            LoadStateUpdate loadStateUpdate = (LoadStateUpdate) obj;
            return Intrinsics.c(this.f3553a, loadStateUpdate.f3553a) && Intrinsics.c(this.b, loadStateUpdate.b);
        }

        public final int hashCode() {
            int iHashCode = this.f3553a.hashCode() * 31;
            LoadStates loadStates = this.b;
            return iHashCode + (loadStates == null ? 0 : loadStates.hashCode());
        }

        public final String toString() {
            String str = "PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: " + this.f3553a + "\n                    ";
            LoadStates loadStates = this.b;
            if (loadStates != null) {
                str = str + "|   mediatorLoadStates: " + loadStates + '\n';
            }
            return StringsKt.n0(str + "|)");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/PageEvent$StaticList;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/paging/PageEvent;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static final /* data */ class StaticList<T> extends PageEvent<T> {

        /* renamed from: a, reason: collision with root package name */
        public final List f3554a;

        public StaticList(List data) {
            Intrinsics.h(data, "data");
            this.f3554a = data;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007d -> B:21:0x0080). Please report as a decompilation issue!!! */
        @Override // androidx.paging.PageEvent
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(kotlin.jvm.functions.Function2 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof androidx.paging.PageEvent$StaticList$map$1
                if (r0 == 0) goto L13
                r0 = r9
                androidx.paging.PageEvent$StaticList$map$1 r0 = (androidx.paging.PageEvent$StaticList$map$1) r0
                int r1 = r0.w
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.w = r1
                goto L18
            L13:
                androidx.paging.PageEvent$StaticList$map$1 r0 = new androidx.paging.PageEvent$StaticList$map$1
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.u
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r2 = r0.w
                r3 = 1
                if (r2 == 0) goto L3f
                if (r2 != r3) goto L37
                java.util.Collection r8 = r0.t
                java.util.Collection r8 = (java.util.Collection) r8
                java.util.Iterator r2 = r0.s
                java.util.Collection r4 = r0.r
                java.util.Collection r4 = (java.util.Collection) r4
                kotlin.jvm.functions.Function2 r5 = r0.q
                kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
                androidx.paging.PageEvent$StaticList r6 = r0.p
                kotlin.ResultKt.b(r9)
                goto L80
            L37:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3f:
                kotlin.ResultKt.b(r9)
                java.util.List r9 = r7.f3554a
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                java.util.ArrayList r2 = new java.util.ArrayList
                r4 = 10
                int r4 = kotlin.collections.CollectionsKt.s(r9, r4)
                r2.<init>(r4)
                java.util.Iterator r9 = r9.iterator()
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r6
                r6 = r7
            L5a:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L86
                java.lang.Object r4 = r2.next()
                r0.p = r6
                r5 = r9
                kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
                r0.q = r5
                r5 = r8
                java.util.Collection r5 = (java.util.Collection) r5
                r0.r = r5
                r0.s = r2
                r0.t = r5
                r0.w = r3
                java.lang.Object r4 = r9.invoke(r4, r0)
                if (r4 != r1) goto L7d
                return r1
            L7d:
                r5 = r9
                r9 = r4
                r4 = r8
            L80:
                r8.add(r9)
                r8 = r4
                r9 = r5
                goto L5a
            L86:
                java.util.List r8 = (java.util.List) r8
                r6.getClass()
                androidx.paging.PageEvent$StaticList r9 = new androidx.paging.PageEvent$StaticList
                r9.<init>(r8)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageEvent.StaticList.a(kotlin.jvm.functions.Function2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StaticList) && Intrinsics.c(this.f3554a, ((StaticList) obj).f3554a);
        }

        public final int hashCode() {
            return this.f3554a.hashCode() * 961;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PageEvent.StaticList with ");
            List list = this.f3554a;
            sb.append(list.size());
            sb.append(" items (\n                    |   first item: ");
            sb.append(CollectionsKt.F(list));
            sb.append("\n                    |   last item: ");
            sb.append(CollectionsKt.P(list));
            sb.append("\n                    |   sourceLoadStates: null\n                    ");
            return StringsKt.n0(sb.toString() + "|)");
        }
    }

    public Object a(Function2 function2, ContinuationImpl continuationImpl) {
        return this;
    }
}
