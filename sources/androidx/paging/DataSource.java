package androidx.paging;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Landroidx/paging/DataSource;", "", "Key", "Value", "BaseResult", "Companion", "Factory", "InvalidatedCallback", "KeyType", "Params", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class DataSource<Key, Value> {

    /* renamed from: a, reason: collision with root package name */
    public final KeyType f3531a;
    public final InvalidateCallbackTracker b = new InvalidateCallbackTracker(new Function0<Boolean>() { // from class: androidx.paging.DataSource$invalidateCallbackTracker$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(this.h.d());
        }
    }, DataSource$invalidateCallbackTracker$1.h);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/DataSource$BaseResult;", "", "Value", "Companion", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class BaseResult<Value> {

        /* renamed from: a, reason: collision with root package name */
        public final List f3532a;
        public final Object b;
        public final Object c;
        public final int d;
        public final int e;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/DataSource$BaseResult$Companion;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
        }

        public BaseResult(List list, Object obj, Object obj2, int i, int i2) {
            this.f3532a = list;
            this.b = obj;
            this.c = obj2;
            this.d = i;
            this.e = i2;
            if (i < 0 && i != Integer.MIN_VALUE) {
                throw new IllegalArgumentException("Position must be non-negative");
            }
            if (list.isEmpty() && (i > 0 || i2 > 0)) {
                throw new IllegalArgumentException("Initial result cannot be empty if items are present in data set.");
            }
            if (i2 < 0 && i2 != Integer.MIN_VALUE) {
                throw new IllegalArgumentException("List size + position too large, last item in list beyond totalCount.");
            }
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof BaseResult)) {
                return false;
            }
            BaseResult baseResult = (BaseResult) obj;
            return Intrinsics.c(this.f3532a, baseResult.f3532a) && Intrinsics.c(this.b, baseResult.b) && Intrinsics.c(this.c, baseResult.c) && this.d == baseResult.d && this.e == baseResult.e;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/DataSource$Companion;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static List a(List source) {
            Intrinsics.h(null, "function");
            Intrinsics.h(source, "source");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001¨\u0006\u0004"}, d2 = {"Landroidx/paging/DataSource$Factory;", "", "Key", "Value", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static abstract class Factory<Key, Value> {
        public abstract DataSource a();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/paging/DataSource$InvalidatedCallback;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface InvalidatedCallback {
        void a();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/DataSource$KeyType;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class KeyType {
        public static final KeyType d;
        public static final /* synthetic */ KeyType[] e;

        /* JADX INFO: Fake field, exist only in values array */
        KeyType EF0;

        static {
            KeyType keyType = new KeyType("POSITIONAL", 0);
            KeyType keyType2 = new KeyType("PAGE_KEYED", 1);
            d = keyType2;
            e = new KeyType[]{keyType, keyType2, new KeyType("ITEM_KEYED", 2)};
        }

        public static KeyType valueOf(String str) {
            return (KeyType) Enum.valueOf(KeyType.class, str);
        }

        public static KeyType[] values() {
            return (KeyType[]) e.clone();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/paging/DataSource$Params;", "", "K", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Params<K> {

        /* renamed from: a, reason: collision with root package name */
        public final LoadType f3533a;
        public final Object b;
        public final int c;
        public final boolean d;
        public final int e;

        public Params(LoadType loadType, Object obj, int i, boolean z, int i2) {
            this.f3533a = loadType;
            this.b = obj;
            this.c = i;
            this.d = z;
            this.e = i2;
            if (loadType != LoadType.d && obj == null) {
                throw new IllegalArgumentException("Key must be non-null for prepend/append");
            }
        }
    }

    public DataSource(KeyType keyType) {
        this.f3531a = keyType;
    }

    public void a(InvalidatedCallback invalidatedCallback) {
        this.b.b(invalidatedCallback);
    }

    public abstract Object b(Object obj);

    public void c() {
        this.b.a();
    }

    public boolean d() {
        return this.b.e;
    }

    public abstract Object e(Params params, ContinuationImpl continuationImpl);

    public void f(InvalidatedCallback invalidatedCallback) {
        this.b.c(invalidatedCallback);
    }
}
