package me.oriient.internal.services.dataManager.plaiCategories;

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
public final class X extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final X f25336a = new X();

    public X() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String responseString = (String) obj;
        Intrinsics.h(responseString, "responseString");
        KTypeProjection kTypeProjection = KTypeProjection.c;
        Iterable iterable = (Iterable) JsonSerializationKt.parseAsJson(responseString, Reflection.c(KTypeProjection.Companion.a(Reflection.b(PlaiCategoryUrlResponse.class))));
        ArrayList arrayList = new ArrayList(CollectionsKt.s(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((PlaiCategoryUrlResponse) it.next()).a());
        }
        return arrayList;
    }
}
