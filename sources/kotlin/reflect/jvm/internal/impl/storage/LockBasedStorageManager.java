package kotlin.reflect.jvm.internal.impl.storage;

import YU.a;
import androidx.camera.core.impl.b;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.WrappedValues;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public class LockBasedStorageManager implements StorageManager {
    public static final String d;
    public static final StorageManager e;

    /* renamed from: a, reason: collision with root package name */
    public final SimpleLock f24594a;
    public final ExceptionHandlingStrategy b;
    public final String c;

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$1, reason: invalid class name */
    public static class AnonymousClass1 extends LockBasedStorageManager {
        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager
        public final RecursionDetectedResult j(Object obj, String str) {
            return RecursionDetectedResult.a();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$4, reason: invalid class name */
    class AnonymousClass4 extends LockBasedNotNullLazyValue<Object> {
        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue
        public final RecursionDetectedResult b(boolean z) {
            return RecursionDetectedResult.d(EmptyList.d);
        }
    }

    public static class CacheWithNotNullValuesBasedOnMemoizedFunction<K, V> extends CacheWithNullableValuesBasedOnMemoizedFunction<K, V> implements CacheWithNotNullValues<K, V> {
        @Override // kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues
        public final Object a(Object obj, Function0 function0) throws Throwable {
            Object objInvoke = invoke(new KeyWithComputation(obj, function0));
            if (objInvoke != null) {
                return objInvoke;
            }
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction", "computeIfAbsent"));
        }
    }

    public static class CacheWithNullableValuesBasedOnMemoizedFunction<K, V> extends MapBasedMemoizedFunction<KeyWithComputation<K, V>, V> implements CacheWithNullableValues<K, V> {

        /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction$1, reason: invalid class name */
        class AnonymousClass1 implements Function1<KeyWithComputation<Object, Object>, Object> {
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ((KeyWithComputation) obj).b.invoke();
            }
        }

        public CacheWithNullableValuesBasedOnMemoizedFunction(LockBasedStorageManager lockBasedStorageManager, ConcurrentHashMap concurrentHashMap) {
            super(lockBasedStorageManager, concurrentHashMap, new AnonymousClass1());
        }
    }

    public interface ExceptionHandlingStrategy {

        /* renamed from: a, reason: collision with root package name */
        public static final ExceptionHandlingStrategy f24595a = new AnonymousClass1();

        /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$ExceptionHandlingStrategy$1, reason: invalid class name */
        public static class AnonymousClass1 implements ExceptionHandlingStrategy {
        }
    }

    public static class KeyWithComputation<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f24596a;
        public final Function0 b;

        public KeyWithComputation(Object obj, Function0 function0) {
            this.f24596a = obj;
            this.b = function0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f24596a.equals(((KeyWithComputation) obj).f24596a);
        }

        public final int hashCode() {
            return this.f24596a.hashCode();
        }
    }

    public static class LockBasedLazyValue<T> implements NullableLazyValue<T> {
        public final LockBasedStorageManager d;
        public final Function0 e;
        public volatile Object f = NotValue.d;

        public LockBasedLazyValue(LockBasedStorageManager lockBasedStorageManager, Function0 function0) {
            this.d = lockBasedStorageManager;
            this.e = function0;
        }

        public void a(Object obj) {
        }

        public RecursionDetectedResult b(boolean z) {
            RecursionDetectedResult recursionDetectedResultJ = this.d.j(null, "in a lazy value");
            if (recursionDetectedResultJ != null) {
                return recursionDetectedResultJ;
            }
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue", "recursionDetected"));
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0055 A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #1 {all -> 0x0026, blocks: (B:7:0x0015, B:9:0x001b, B:15:0x002a, B:17:0x0037, B:22:0x0046, B:24:0x0050, B:25:0x0055, B:29:0x0064, B:31:0x006a, B:33:0x006e, B:34:0x0074, B:35:0x0081, B:36:0x0082, B:37:0x0088, B:26:0x0057), top: B:42:0x0015, inners: #0 }] */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object invoke() throws java.lang.Throwable {
            /*
                r5 = this;
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$NotValue r0 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.f
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$NotValue r1 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.e
                java.lang.Object r2 = r5.f
                boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue
                if (r3 != 0) goto Le
                kotlin.reflect.jvm.internal.impl.utils.WrappedValues.b(r2)
                return r2
            Le:
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager r2 = r5.d
                kotlin.reflect.jvm.internal.impl.storage.SimpleLock r2 = r2.f24594a
                r2.lock()
                java.lang.Object r2 = r5.f     // Catch: java.lang.Throwable -> L26
                boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue     // Catch: java.lang.Throwable -> L26
                if (r3 != 0) goto L28
                kotlin.reflect.jvm.internal.impl.utils.WrappedValues.b(r2)     // Catch: java.lang.Throwable -> L26
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager r0 = r5.d
                kotlin.reflect.jvm.internal.impl.storage.SimpleLock r0 = r0.f24594a
                r0.unlock()
                return r2
            L26:
                r0 = move-exception
                goto L89
            L28:
                if (r2 != r1) goto L43
                r5.f = r0     // Catch: java.lang.Throwable -> L26
                r3 = 1
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$RecursionDetectedResult r3 = r5.b(r3)     // Catch: java.lang.Throwable -> L26
                boolean r4 = r3.c()     // Catch: java.lang.Throwable -> L26
                if (r4 != 0) goto L43
                java.lang.Object r0 = r3.b()     // Catch: java.lang.Throwable -> L26
            L3b:
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager r1 = r5.d
                kotlin.reflect.jvm.internal.impl.storage.SimpleLock r1 = r1.f24594a
                r1.unlock()
                return r0
            L43:
                if (r2 != r0) goto L55
                r0 = 0
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$RecursionDetectedResult r0 = r5.b(r0)     // Catch: java.lang.Throwable -> L26
                boolean r2 = r0.c()     // Catch: java.lang.Throwable -> L26
                if (r2 != 0) goto L55
                java.lang.Object r0 = r0.b()     // Catch: java.lang.Throwable -> L26
                goto L3b
            L55:
                r5.f = r1     // Catch: java.lang.Throwable -> L26
                kotlin.jvm.functions.Function0 r0 = r5.e     // Catch: java.lang.Throwable -> L63
                java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L63
                r5.a(r0)     // Catch: java.lang.Throwable -> L63
                r5.f = r0     // Catch: java.lang.Throwable -> L63
                goto L3b
            L63:
                r0 = move-exception
                boolean r2 = kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt.a(r0)     // Catch: java.lang.Throwable -> L26
                if (r2 != 0) goto L82
                java.lang.Object r2 = r5.f     // Catch: java.lang.Throwable -> L26
                if (r2 != r1) goto L74
                java.lang.Object r1 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.a(r0)     // Catch: java.lang.Throwable -> L26
                r5.f = r1     // Catch: java.lang.Throwable -> L26
            L74:
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager r1 = r5.d     // Catch: java.lang.Throwable -> L26
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$ExceptionHandlingStrategy r1 = r1.b     // Catch: java.lang.Throwable -> L26
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$ExceptionHandlingStrategy$1 r1 = (kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.ExceptionHandlingStrategy.AnonymousClass1) r1     // Catch: java.lang.Throwable -> L26
                r1.getClass()     // Catch: java.lang.Throwable -> L26
                kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt.b(r0)     // Catch: java.lang.Throwable -> L26
                r0 = 0
                throw r0     // Catch: java.lang.Throwable -> L26
            L82:
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$NotValue r1 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.d     // Catch: java.lang.Throwable -> L26
                r5.f = r1     // Catch: java.lang.Throwable -> L26
                java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch: java.lang.Throwable -> L26
                throw r0     // Catch: java.lang.Throwable -> L26
            L89:
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager r1 = r5.d
                kotlin.reflect.jvm.internal.impl.storage.SimpleLock r1 = r1.f24594a
                r1.unlock()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue.invoke():java.lang.Object");
        }

        public final boolean j() {
            return (this.f == NotValue.d || this.f == NotValue.e) ? false : true;
        }
    }

    public static abstract class LockBasedLazyValueWithPostCompute<T> extends LockBasedLazyValue<T> {
        public volatile SingleThreadValue g;

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue
        public final void a(Object obj) {
            this.g = new SingleThreadValue(obj);
            try {
                d(obj);
            } finally {
                this.g = null;
            }
        }

        public abstract void d(Object obj);

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue, kotlin.jvm.functions.Function0
        public Object invoke() {
            SingleThreadValue singleThreadValue = this.g;
            return (singleThreadValue == null || !singleThreadValue.b()) ? super.invoke() : singleThreadValue.a();
        }
    }

    public static class LockBasedNotNullLazyValue<T> extends LockBasedLazyValue<T> implements NotNullLazyValue<T> {
        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue, kotlin.jvm.functions.Function0
        public final Object invoke() throws Throwable {
            Object objInvoke = super.invoke();
            if (objInvoke != null) {
                return objInvoke;
            }
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue", "invoke"));
        }
    }

    public static abstract class LockBasedNotNullLazyValueWithPostCompute<T> extends LockBasedLazyValueWithPostCompute<T> implements NotNullLazyValue<T> {
        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValueWithPostCompute, kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue, kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object objInvoke = super.invoke();
            if (objInvoke != null) {
                return objInvoke;
            }
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute", "invoke"));
        }
    }

    public static class MapBasedMemoizedFunction<K, V> implements MemoizedFunctionToNullable<K, V> {
        public final LockBasedStorageManager d;
        public final ConcurrentHashMap e;
        public final Function1 f;

        public MapBasedMemoizedFunction(LockBasedStorageManager lockBasedStorageManager, ConcurrentHashMap concurrentHashMap, Function1 function1) {
            this.d = lockBasedStorageManager;
            this.e = concurrentHashMap;
            this.f = function1;
        }

        public static /* synthetic */ void b(int i) {
            String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 3 || i == 4) ? 2 : 3];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i == 3 || i == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 3) {
                objArr[1] = "recursionDetected";
            } else if (i != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i != 3 && i != 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i != 3 && i != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public final AssertionError d(Object obj, Object obj2) {
            AssertionError assertionError = new AssertionError("Inconsistent key detected. " + NotValue.e + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + this.d);
            LockBasedStorageManager.k(assertionError);
            return assertionError;
        }

        public final AssertionError e(Object obj, Object obj2) {
            AssertionError assertionError = new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + this.d);
            LockBasedStorageManager.k(assertionError);
            return assertionError;
        }

        public final AssertionError f(Object obj, Throwable th) {
            AssertionError assertionError = new AssertionError("Unable to remove " + obj + " under " + this.d, th);
            LockBasedStorageManager.k(assertionError);
            return assertionError;
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable
        public final boolean h(FqName fqName) {
            Object obj = this.e.get(fqName);
            return (obj == null || obj == NotValue.e) ? false : true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public Object invoke(Object obj) throws Throwable {
            AssertionError assertionErrorE;
            AssertionError assertionErrorF;
            LockBasedStorageManager lockBasedStorageManager = this.d;
            ExceptionHandlingStrategy exceptionHandlingStrategy = lockBasedStorageManager.b;
            SimpleLock simpleLock = lockBasedStorageManager.f24594a;
            ConcurrentHashMap concurrentHashMap = this.e;
            Object obj2 = concurrentHashMap.get(obj);
            Object obj3 = WrappedValues.f24653a;
            NotValue notValue = NotValue.e;
            if (obj2 != null && obj2 != notValue) {
                WrappedValues.b(obj2);
                if (obj2 == obj3) {
                    return null;
                }
                return obj2;
            }
            simpleLock.lock();
            try {
                Object obj4 = concurrentHashMap.get(obj);
                NotValue notValue2 = NotValue.f;
                if (obj4 == notValue) {
                    RecursionDetectedResult recursionDetectedResultJ = lockBasedStorageManager.j(obj, "");
                    if (recursionDetectedResultJ == null) {
                        b(3);
                        throw null;
                    }
                    if (!recursionDetectedResultJ.c()) {
                        return recursionDetectedResultJ.b();
                    }
                    obj4 = notValue2;
                }
                if (obj4 == notValue2) {
                    RecursionDetectedResult recursionDetectedResultJ2 = lockBasedStorageManager.j(obj, "");
                    if (recursionDetectedResultJ2 == null) {
                        b(3);
                        throw null;
                    }
                    if (!recursionDetectedResultJ2.c()) {
                        return recursionDetectedResultJ2.b();
                    }
                }
                if (obj4 != null) {
                    WrappedValues.b(obj4);
                    return obj4 != obj3 ? obj4 : null;
                }
                try {
                    concurrentHashMap.put(obj, notValue);
                    Object objInvoke = this.f.invoke(obj);
                    if (objInvoke != null) {
                        obj3 = objInvoke;
                    }
                    Object objPut = concurrentHashMap.put(obj, obj3);
                    if (objPut == notValue) {
                        return objInvoke;
                    }
                    assertionErrorE = e(obj, objPut);
                    try {
                        throw assertionErrorE;
                    } catch (Throwable th) {
                        th = th;
                        if (ExceptionUtilsKt.a(th)) {
                            try {
                                Object objRemove = concurrentHashMap.remove(obj);
                                if (objRemove != notValue) {
                                    throw d(obj, objRemove);
                                }
                                throw th;
                            } finally {
                            }
                        }
                        if (th == assertionErrorE) {
                            try {
                                concurrentHashMap.remove(obj);
                                ((ExceptionHandlingStrategy.AnonymousClass1) exceptionHandlingStrategy).getClass();
                                ExceptionUtilsKt.b(th);
                                throw null;
                            } finally {
                            }
                        }
                        Object objPut2 = concurrentHashMap.put(obj, WrappedValues.a(th));
                        if (objPut2 != notValue) {
                            throw e(obj, objPut2);
                        }
                        ((ExceptionHandlingStrategy.AnonymousClass1) exceptionHandlingStrategy).getClass();
                        ExceptionUtilsKt.b(th);
                        throw null;
                        simpleLock.unlock();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    assertionErrorE = null;
                }
            } finally {
                simpleLock.unlock();
            }
        }
    }

    public static class MapBasedMemoizedFunctionToNotNull<K, V> extends MapBasedMemoizedFunction<K, V> implements MemoizedFunctionToNotNull<K, V> {
        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.MapBasedMemoizedFunction, kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) throws Throwable {
            Object objInvoke = super.invoke(obj);
            if (objInvoke != null) {
                return objInvoke;
            }
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull", "invoke"));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class NotValue {
        public static final NotValue d;
        public static final NotValue e;
        public static final NotValue f;
        public static final /* synthetic */ NotValue[] g;

        static {
            NotValue notValue = new NotValue("NOT_COMPUTED", 0);
            d = notValue;
            NotValue notValue2 = new NotValue("COMPUTING", 1);
            e = notValue2;
            NotValue notValue3 = new NotValue("RECURSION_WAS_DETECTED", 2);
            f = notValue3;
            g = new NotValue[]{notValue, notValue2, notValue3};
        }

        public static NotValue valueOf(String str) {
            return (NotValue) Enum.valueOf(NotValue.class, str);
        }

        public static NotValue[] values() {
            return (NotValue[]) g.clone();
        }
    }

    /* loaded from: classes7.dex */
    public static class RecursionDetectedResult<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f24597a;
        public final boolean b;

        public RecursionDetectedResult(Object obj, boolean z) {
            this.f24597a = obj;
            this.b = z;
        }

        public static RecursionDetectedResult a() {
            return new RecursionDetectedResult(null, true);
        }

        public static RecursionDetectedResult d(Object obj) {
            return new RecursionDetectedResult(obj, false);
        }

        public final Object b() {
            return this.f24597a;
        }

        public final boolean c() {
            return this.b;
        }

        public final String toString() {
            return this.b ? "FALL_THROUGH" : String.valueOf(this.f24597a);
        }
    }

    static {
        String strSubstring;
        String canonicalName = LockBasedStorageManager.class.getCanonicalName();
        Intrinsics.h(canonicalName, "<this>");
        int iF = StringsKt.F(0, 6, canonicalName, ".");
        if (iF == -1) {
            strSubstring = "";
        } else {
            strSubstring = canonicalName.substring(0, iF);
            Intrinsics.g(strSubstring, "substring(...)");
        }
        d = strSubstring;
        e = new AnonymousClass1("NO_LOCKS", EmptySimpleLock.f24593a);
    }

    public LockBasedStorageManager(String str) {
        this(str, new DefaultSimpleLock(new ReentrantLock()));
    }

    public static void k(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!stackTrace[i].getClassName().startsWith(d)) {
                break;
            } else {
                i++;
            }
        }
        List listSubList = Arrays.asList(stackTrace).subList(i, length);
        assertionError.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public final NotNullLazyValue a(Function0 function0, final Function1 function1, final Function1 function12) {
        return new LockBasedNotNullLazyValueWithPostCompute<Object>(this, function0) { // from class: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.5
            {
                this.g = null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue
            public final RecursionDetectedResult b(boolean z) {
                return RecursionDetectedResult.d(function1.invoke(Boolean.valueOf(z)));
            }

            @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValueWithPostCompute
            public final void d(Object obj) {
                if (obj == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "value", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5", "doPostCompute"));
                }
                function12.invoke(obj);
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public final MemoizedFunctionToNullable b(Function1 function1) {
        return new MapBasedMemoizedFunction(this, new ConcurrentHashMap(3, 1.0f, 2), function1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public final CacheWithNotNullValues c() {
        return new CacheWithNotNullValuesBasedOnMemoizedFunction(this, new ConcurrentHashMap(3, 1.0f, 2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public final NotNullLazyValue d(Function0 function0) {
        return new LockBasedNotNullLazyValue(this, function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public final NullableLazyValue e(Function0 function0) {
        return new LockBasedLazyValue(this, function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public final NotNullLazyValue f(Function0 function0) {
        return new AnonymousClass4(this, function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public final MemoizedFunctionToNotNull g(Function1 function1) {
        return new MapBasedMemoizedFunctionToNotNull(this, new ConcurrentHashMap(3, 1.0f, 2), function1);
    }

    public final Object h(Function0 function0) {
        this.f24594a.lock();
        try {
            function0.invoke();
            return null;
        } finally {
        }
    }

    public final CacheWithNullableValues i() {
        return new CacheWithNullableValuesBasedOnMemoizedFunction(this, new ConcurrentHashMap(3, 1.0f, 2));
    }

    public RecursionDetectedResult j(Object obj, String str) {
        StringBuilder sb = new StringBuilder("Recursion detected ");
        sb.append(str);
        sb.append(obj == null ? "" : b.m(obj, "on input: "));
        sb.append(" under ");
        sb.append(this);
        AssertionError assertionError = new AssertionError(sb.toString());
        k(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        return a.o(sb, this.c, ")");
    }

    public LockBasedStorageManager(String str, SimpleLock simpleLock) {
        this.f24594a = simpleLock;
        this.b = ExceptionHandlingStrategy.f24595a;
        this.c = str;
    }
}
