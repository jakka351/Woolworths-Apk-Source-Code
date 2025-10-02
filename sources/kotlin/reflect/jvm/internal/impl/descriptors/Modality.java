package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Modality {
    public static final Companion d;
    public static final Modality e;
    public static final Modality f;
    public static final Modality g;
    public static final Modality h;
    public static final /* synthetic */ Modality[] i;
    public static final /* synthetic */ EnumEntries j;

    public static final class Companion {
    }

    static {
        Modality modality = new Modality("FINAL", 0);
        e = modality;
        Modality modality2 = new Modality("SEALED", 1);
        f = modality2;
        Modality modality3 = new Modality("OPEN", 2);
        g = modality3;
        Modality modality4 = new Modality("ABSTRACT", 3);
        h = modality4;
        Modality[] modalityArr = {modality, modality2, modality3, modality4};
        i = modalityArr;
        j = EnumEntriesKt.a(modalityArr);
        d = new Companion();
    }

    public static Modality valueOf(String str) {
        return (Modality) Enum.valueOf(Modality.class, str);
    }

    public static Modality[] values() {
        return (Modality[]) i.clone();
    }
}
