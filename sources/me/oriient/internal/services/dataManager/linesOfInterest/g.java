package me.oriient.internal.services.dataManager.linesOfInterest;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KTypeProjection;
import me.oriient.internal.infra.serializerJson.JsonSerializationKt;

/* loaded from: classes7.dex */
public final class g extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final g f25188a = new g();

    public g() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.h(it, "it");
        KTypeProjection kTypeProjection = KTypeProjection.c;
        Iterable iterable = (Iterable) JsonSerializationKt.parseAsJson(it, Reflection.c(KTypeProjection.Companion.a(Reflection.b(LineOfInterestResponse.class))));
        ArrayList arrayList = new ArrayList(CollectionsKt.s(iterable, 10));
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(((LineOfInterestResponse) it2.next()).toLineOfInterest());
        }
        return arrayList;
    }
}
