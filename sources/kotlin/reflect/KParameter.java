package kotlin.reflect;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.reflect.jvm.internal.KTypeImpl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/KParameter;", "Lkotlin/reflect/KAnnotatedElement;", "Kind", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface KParameter extends KAnnotatedElement {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/KParameter$Kind;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Kind {
        public static final Kind d;
        public static final Kind e;
        public static final Kind f;
        public static final /* synthetic */ Kind[] g;
        public static final /* synthetic */ EnumEntries h;

        static {
            Kind kind = new Kind("INSTANCE", 0);
            d = kind;
            Kind kind2 = new Kind("EXTENSION_RECEIVER", 1);
            e = kind2;
            Kind kind3 = new Kind("VALUE", 2);
            f = kind3;
            Kind[] kindArr = {kind, kind2, kind3};
            g = kindArr;
            h = EnumEntriesKt.a(kindArr);
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) g.clone();
        }
    }

    Kind f();

    boolean g();

    int getIndex();

    String getName();

    KTypeImpl getType();

    boolean k();
}
