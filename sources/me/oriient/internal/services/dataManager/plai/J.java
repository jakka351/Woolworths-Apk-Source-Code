package me.oriient.internal.services.dataManager.plai;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* loaded from: classes7.dex */
public final class J implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.a(Double.valueOf(((PlaiRecord) obj2).getConfidence()), Double.valueOf(((PlaiRecord) obj).getConfidence()));
    }
}
