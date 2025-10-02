package me.oriient.internal.services.sensorsManager;

import java.util.Comparator;
import java.util.Map;
import kotlin.comparisons.ComparisonsKt;

/* loaded from: classes7.dex */
public final class h0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.a((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
    }
}
