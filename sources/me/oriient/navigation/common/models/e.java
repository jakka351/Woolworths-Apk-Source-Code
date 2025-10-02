package me.oriient.navigation.common.models;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* loaded from: classes8.dex */
public final class e implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.a(Integer.valueOf(((TransitionCore) obj).getIndex()), Integer.valueOf(((TransitionCore) obj2).getIndex()));
    }
}
