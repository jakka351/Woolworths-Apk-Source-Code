package me.onebone.toolbar;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lme/onebone/toolbar/ScaffoldChildAlignmentModifier;", "Landroidx/compose/ui/layout/ParentDataModifier;", "lib_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes7.dex */
final class ScaffoldChildAlignmentModifier implements ParentDataModifier {
    @Override // androidx.compose.ui.layout.ParentDataModifier
    public final Object D(Density density, Object obj) {
        Intrinsics.h(density, "<this>");
        ScaffoldParentData scaffoldParentData = obj instanceof ScaffoldParentData ? (ScaffoldParentData) obj : null;
        if (scaffoldParentData != null) {
            return scaffoldParentData;
        }
        ScaffoldParentData scaffoldParentData2 = new ScaffoldParentData();
        scaffoldParentData2.f24917a = Alignment.Companion.g;
        return scaffoldParentData2;
    }
}
