package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class PredefinedFunctionEnhancementInfo {

    /* renamed from: a, reason: collision with root package name */
    public final TypeEnhancementInfo f24449a;
    public final ArrayList b;
    public final String c;
    public final PredefinedFunctionEnhancementInfo d;

    public PredefinedFunctionEnhancementInfo(TypeEnhancementInfo typeEnhancementInfo, ArrayList arrayList, String str) {
        this.f24449a = typeEnhancementInfo;
        this.b = arrayList;
        this.c = str;
        PredefinedFunctionEnhancementInfo predefinedFunctionEnhancementInfo = null;
        if (str != null) {
            TypeEnhancementInfo typeEnhancementInfoA = typeEnhancementInfo != null ? typeEnhancementInfo.a() : null;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TypeEnhancementInfo typeEnhancementInfo2 = (TypeEnhancementInfo) it.next();
                arrayList2.add(typeEnhancementInfo2 != null ? typeEnhancementInfo2.a() : null);
            }
            predefinedFunctionEnhancementInfo = new PredefinedFunctionEnhancementInfo(typeEnhancementInfoA, arrayList2, null);
        }
        this.d = predefinedFunctionEnhancementInfo;
    }

    public final String a() {
        return this.c;
    }

    public final List b() {
        return this.b;
    }

    public final TypeEnhancementInfo c() {
        return this.f24449a;
    }

    public final PredefinedFunctionEnhancementInfo d() {
        return this.d;
    }
}
