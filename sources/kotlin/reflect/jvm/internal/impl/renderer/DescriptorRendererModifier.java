package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@SourceDebugExtension
/* loaded from: classes.dex */
public final class DescriptorRendererModifier {
    public static final Set e;
    public static final Set f;
    public static final DescriptorRendererModifier g;
    public static final DescriptorRendererModifier h;
    public static final DescriptorRendererModifier i;
    public static final DescriptorRendererModifier j;
    public static final DescriptorRendererModifier k;
    public static final DescriptorRendererModifier l;
    public static final DescriptorRendererModifier m;
    public static final DescriptorRendererModifier n;
    public static final DescriptorRendererModifier o;
    public static final DescriptorRendererModifier p;
    public static final DescriptorRendererModifier q;
    public static final DescriptorRendererModifier r;
    public static final DescriptorRendererModifier s;
    public static final DescriptorRendererModifier t;
    public static final /* synthetic */ DescriptorRendererModifier[] u;
    public static final /* synthetic */ EnumEntries v;
    public final boolean d;

    public static final class Companion {
    }

    static {
        DescriptorRendererModifier descriptorRendererModifier = new DescriptorRendererModifier("VISIBILITY", 0, true);
        g = descriptorRendererModifier;
        DescriptorRendererModifier descriptorRendererModifier2 = new DescriptorRendererModifier("MODALITY", 1, true);
        h = descriptorRendererModifier2;
        DescriptorRendererModifier descriptorRendererModifier3 = new DescriptorRendererModifier("OVERRIDE", 2, true);
        i = descriptorRendererModifier3;
        DescriptorRendererModifier descriptorRendererModifier4 = new DescriptorRendererModifier("ANNOTATIONS", 3, false);
        j = descriptorRendererModifier4;
        DescriptorRendererModifier descriptorRendererModifier5 = new DescriptorRendererModifier("INNER", 4, true);
        k = descriptorRendererModifier5;
        DescriptorRendererModifier descriptorRendererModifier6 = new DescriptorRendererModifier("MEMBER_KIND", 5, true);
        l = descriptorRendererModifier6;
        DescriptorRendererModifier descriptorRendererModifier7 = new DescriptorRendererModifier("DATA", 6, true);
        m = descriptorRendererModifier7;
        DescriptorRendererModifier descriptorRendererModifier8 = new DescriptorRendererModifier("INLINE", 7, true);
        n = descriptorRendererModifier8;
        DescriptorRendererModifier descriptorRendererModifier9 = new DescriptorRendererModifier("EXPECT", 8, true);
        o = descriptorRendererModifier9;
        DescriptorRendererModifier descriptorRendererModifier10 = new DescriptorRendererModifier("ACTUAL", 9, true);
        p = descriptorRendererModifier10;
        DescriptorRendererModifier descriptorRendererModifier11 = new DescriptorRendererModifier("CONST", 10, true);
        q = descriptorRendererModifier11;
        DescriptorRendererModifier descriptorRendererModifier12 = new DescriptorRendererModifier("LATEINIT", 11, true);
        r = descriptorRendererModifier12;
        DescriptorRendererModifier descriptorRendererModifier13 = new DescriptorRendererModifier("FUN", 12, true);
        s = descriptorRendererModifier13;
        DescriptorRendererModifier descriptorRendererModifier14 = new DescriptorRendererModifier("VALUE", 13, true);
        t = descriptorRendererModifier14;
        DescriptorRendererModifier[] descriptorRendererModifierArr = {descriptorRendererModifier, descriptorRendererModifier2, descriptorRendererModifier3, descriptorRendererModifier4, descriptorRendererModifier5, descriptorRendererModifier6, descriptorRendererModifier7, descriptorRendererModifier8, descriptorRendererModifier9, descriptorRendererModifier10, descriptorRendererModifier11, descriptorRendererModifier12, descriptorRendererModifier13, descriptorRendererModifier14};
        u = descriptorRendererModifierArr;
        v = EnumEntriesKt.a(descriptorRendererModifierArr);
        DescriptorRendererModifier[] descriptorRendererModifierArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (DescriptorRendererModifier descriptorRendererModifier15 : descriptorRendererModifierArrValues) {
            if (descriptorRendererModifier15.d) {
                arrayList.add(descriptorRendererModifier15);
            }
        }
        e = CollectionsKt.L0(arrayList);
        f = ArraysKt.r0(values());
    }

    public DescriptorRendererModifier(String str, int i2, boolean z) {
        this.d = z;
    }

    public static DescriptorRendererModifier valueOf(String str) {
        return (DescriptorRendererModifier) Enum.valueOf(DescriptorRendererModifier.class, str);
    }

    public static DescriptorRendererModifier[] values() {
        return (DescriptorRendererModifier[]) u.clone();
    }
}
