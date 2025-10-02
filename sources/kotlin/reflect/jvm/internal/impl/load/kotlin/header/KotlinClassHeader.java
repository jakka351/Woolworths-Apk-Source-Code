package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import java.util.LinkedHashMap;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class KotlinClassHeader {

    /* renamed from: a, reason: collision with root package name */
    public final Kind f24478a;
    public final MetadataVersion b;
    public final String[] c;
    public final String[] d;
    public final String[] e;
    public final String f;
    public final int g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @SourceDebugExtension
    public static final class Kind {
        public static final Companion e;
        public static final LinkedHashMap f;
        public static final Kind g;
        public static final Kind h;
        public static final Kind i;
        public static final Kind j;
        public static final Kind k;
        public static final Kind l;
        public static final /* synthetic */ Kind[] m;
        public static final /* synthetic */ EnumEntries n;
        public final int d;

        public static final class Companion {
        }

        static {
            Kind kind = new Kind("UNKNOWN", 0, 0);
            g = kind;
            Kind kind2 = new Kind("CLASS", 1, 1);
            h = kind2;
            Kind kind3 = new Kind("FILE_FACADE", 2, 2);
            i = kind3;
            Kind kind4 = new Kind("SYNTHETIC_CLASS", 3, 3);
            j = kind4;
            Kind kind5 = new Kind("MULTIFILE_CLASS", 4, 4);
            k = kind5;
            Kind kind6 = new Kind("MULTIFILE_CLASS_PART", 5, 5);
            l = kind6;
            Kind[] kindArr = {kind, kind2, kind3, kind4, kind5, kind6};
            m = kindArr;
            n = EnumEntriesKt.a(kindArr);
            e = new Companion();
            Kind[] kindArrValues = values();
            int iH = MapsKt.h(kindArrValues.length);
            LinkedHashMap linkedHashMap = new LinkedHashMap(iH < 16 ? 16 : iH);
            for (Kind kind7 : kindArrValues) {
                linkedHashMap.put(Integer.valueOf(kind7.d), kind7);
            }
            f = linkedHashMap;
        }

        public Kind(String str, int i2, int i3) {
            this.d = i3;
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) m.clone();
        }
    }

    public KotlinClassHeader(Kind kind, MetadataVersion metadataVersion, String[] strArr, String[] strArr2, String[] strArr3, String str, int i) {
        Intrinsics.h(kind, "kind");
        this.f24478a = kind;
        this.b = metadataVersion;
        this.c = strArr;
        this.d = strArr2;
        this.e = strArr3;
        this.f = str;
        this.g = i;
    }

    public final String toString() {
        return this.f24478a + " version=" + this.b;
    }
}
