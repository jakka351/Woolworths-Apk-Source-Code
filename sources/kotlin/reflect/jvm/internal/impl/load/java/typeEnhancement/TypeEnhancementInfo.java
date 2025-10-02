package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class TypeEnhancementInfo {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f24455a;

    public TypeEnhancementInfo(LinkedHashMap linkedHashMap) {
        this.f24455a = linkedHashMap;
    }

    public final TypeEnhancementInfo a() {
        LinkedHashMap linkedHashMap = this.f24455a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.h(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            JavaTypeQualifiers javaTypeQualifiers = (JavaTypeQualifiers) entry.getValue();
            linkedHashMap2.put(key, new JavaTypeQualifiers(javaTypeQualifiers.f24446a, javaTypeQualifiers.b, javaTypeQualifiers.c, true));
        }
        return new TypeEnhancementInfo(linkedHashMap2);
    }
}
