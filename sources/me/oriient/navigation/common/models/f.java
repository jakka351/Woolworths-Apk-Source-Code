package me.oriient.navigation.common.models;

import java.util.Comparator;
import kotlin.Pair;
import kotlin.comparisons.ComparisonsKt;

/* loaded from: classes8.dex */
public final class f implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.a((Integer) ((Pair) obj).e, (Integer) ((Pair) obj2).e);
    }
}
