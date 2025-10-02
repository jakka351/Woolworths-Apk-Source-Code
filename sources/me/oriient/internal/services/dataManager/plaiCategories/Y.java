package me.oriient.internal.services.dataManager.plaiCategories;

import com.github.doyaaaaaken.kotlincsv.client.CsvReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.text.StringsKt;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.rest.OriientApiProvider;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import me.oriient.internal.services.dataManager.rest.RestHelper;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class Y implements T {

    @NotNull
    private static final U Companion = new U();

    /* renamed from: a, reason: collision with root package name */
    public final CsvReader f25337a = new CsvReader();
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;

    public Y() {
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.b = di.inject(reflectionFactory.b(Logger.class));
        this.c = InternalDiKt.getDi().inject(reflectionFactory.b(TimeProvider.class));
        this.d = InternalDiKt.getDi().inject(reflectionFactory.b(RestHelper.class));
        this.e = InternalDiKt.getDi().inject(reflectionFactory.b(OriientApiProvider.class));
    }

    public static IndoorCoordinate a(String str) {
        List listT = StringsKt.T(StringsKt.l0(str, '(', ')'), new String[]{","}, 6);
        ArrayList arrayList = new ArrayList(CollectionsKt.s(listT, 10));
        Iterator it = listT.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.k0((String) it.next()).toString());
        }
        if (arrayList.size() != 2) {
            return null;
        }
        Double dH0 = StringsKt.h0((String) arrayList.get(0));
        Double dH02 = StringsKt.h0((String) arrayList.get(1));
        if (dH0 == null || dH02 == null) {
            return null;
        }
        return new IndoorCoordinate(dH0.doubleValue(), dH02.doubleValue(), 0.0d, 4, (DefaultConstructorMarker) null);
    }
}
