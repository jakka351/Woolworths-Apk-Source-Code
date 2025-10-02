package me.oriient.internal.services.dataManager;

import java.util.Comparator;
import java.util.Map;
import kotlin.comparisons.ComparisonsKt;

/* loaded from: classes7.dex */
public final class c0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.a(Long.valueOf(((a0) ((Map.Entry) obj).getValue()).b), Long.valueOf(((a0) ((Map.Entry) obj2).getValue()).b));
    }
}
