package me.oriient.internal.services.dataManager.plaiCategories;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* renamed from: me.oriient.internal.services.dataManager.plaiCategories.o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1390o implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.a(Double.valueOf(((PlaiCategoryRecord) obj).getCategoryArea()), Double.valueOf(((PlaiCategoryRecord) obj2).getCategoryArea()));
    }
}
