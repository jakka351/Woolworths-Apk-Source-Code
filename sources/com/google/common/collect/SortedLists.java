package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.List;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class SortedLists {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class KeyAbsentBehavior {
        public static final AnonymousClass1 d;
        public static final AnonymousClass2 e;
        public static final /* synthetic */ KeyAbsentBehavior[] f;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.collect.SortedLists$KeyAbsentBehavior$1] */
        /* JADX WARN: Type inference failed for: r1v0, types: [com.google.common.collect.SortedLists$KeyAbsentBehavior$2] */
        static {
            ?? r0 = new KeyAbsentBehavior() { // from class: com.google.common.collect.SortedLists.KeyAbsentBehavior.1
                @Override // com.google.common.collect.SortedLists.KeyAbsentBehavior
                public final int a(int i) {
                    return i - 1;
                }
            };
            d = r0;
            ?? r1 = new KeyAbsentBehavior() { // from class: com.google.common.collect.SortedLists.KeyAbsentBehavior.2
                @Override // com.google.common.collect.SortedLists.KeyAbsentBehavior
                public final int a(int i) {
                    return i;
                }
            };
            e = r1;
            f = new KeyAbsentBehavior[]{r0, r1, new KeyAbsentBehavior() { // from class: com.google.common.collect.SortedLists.KeyAbsentBehavior.3
                @Override // com.google.common.collect.SortedLists.KeyAbsentBehavior
                public final int a(int i) {
                    return ~i;
                }
            }};
        }

        public static KeyAbsentBehavior valueOf(String str) {
            return (KeyAbsentBehavior) Enum.valueOf(KeyAbsentBehavior.class, str);
        }

        public static KeyAbsentBehavior[] values() {
            return (KeyAbsentBehavior[]) f.clone();
        }

        public abstract int a(int i);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class KeyPresentBehavior {
        public static final AnonymousClass1 d;
        public static final AnonymousClass2 e;
        public static final AnonymousClass3 f;
        public static final AnonymousClass4 g;
        public static final /* synthetic */ KeyPresentBehavior[] h;

        /* renamed from: com.google.common.collect.SortedLists$KeyPresentBehavior$2, reason: invalid class name */
        public enum AnonymousClass2 extends KeyPresentBehavior {
            public AnonymousClass2() {
                super("LAST_PRESENT", 1);
            }

            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            public final int a(Object obj, List list, int i) {
                int size = list.size() - 1;
                while (i < size) {
                    int i2 = ((i + size) + 1) >>> 1;
                    if (NaturalOrdering.f.compare(list.get(i2), obj) > 0) {
                        size = i2 - 1;
                    } else {
                        i = i2;
                    }
                }
                return i;
            }
        }

        /* renamed from: com.google.common.collect.SortedLists$KeyPresentBehavior$3, reason: invalid class name */
        public enum AnonymousClass3 extends KeyPresentBehavior {
            public AnonymousClass3() {
                super("FIRST_PRESENT", 2);
            }

            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            public final int a(Object obj, List list, int i) {
                int i2 = 0;
                while (i2 < i) {
                    int i3 = (i2 + i) >>> 1;
                    if (NaturalOrdering.f.compare(list.get(i3), obj) < 0) {
                        i2 = i3 + 1;
                    } else {
                        i = i3;
                    }
                }
                return i2;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.collect.SortedLists$KeyPresentBehavior$1] */
        /* JADX WARN: Type inference failed for: r3v0, types: [com.google.common.collect.SortedLists$KeyPresentBehavior$4] */
        static {
            ?? r0 = new KeyPresentBehavior() { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.1
                @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
                public final int a(Object obj, List list, int i) {
                    return i;
                }
            };
            d = r0;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2();
            e = anonymousClass2;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3();
            f = anonymousClass3;
            ?? r3 = new KeyPresentBehavior() { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.4
                @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
                public final int a(Object obj, List list, int i) {
                    return KeyPresentBehavior.e.a(obj, list, i) + 1;
                }
            };
            g = r3;
            h = new KeyPresentBehavior[]{r0, anonymousClass2, anonymousClass3, r3, new KeyPresentBehavior() { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.5
                @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
                public final int a(Object obj, List list, int i) {
                    return KeyPresentBehavior.f.a(obj, list, i) - 1;
                }
            }};
        }

        public static KeyPresentBehavior valueOf(String str) {
            return (KeyPresentBehavior) Enum.valueOf(KeyPresentBehavior.class, str);
        }

        public static KeyPresentBehavior[] values() {
            return (KeyPresentBehavior[]) h.clone();
        }

        public abstract int a(Object obj, List list, int i);
    }
}
